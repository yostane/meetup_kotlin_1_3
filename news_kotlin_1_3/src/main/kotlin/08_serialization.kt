import kotlinx.serialization.*
import kotlinx.serialization.cbor.CBOR
import kotlinx.serialization.json.JSON
import kotlinx.serialization.protobuf.ProtoBuf
import kotlinx.serialization.protobuf.ProtoNumberType
import kotlinx.serialization.protobuf.ProtoType

// sérialisation cross-platform / multi-format

@Serializable
data class Data(val a: Int,@Optional val b: String = "42")

@Serializable
data class ProtobufData(@SerialId(1) @ProtoType(ProtoNumberType.SIGNED) val a: Int, @SerialId(2) @Optional val b: String = "42")

@UseExperimental(ImplicitReflectionSerializer::class)
fun testProtobufSerialization(){
    println("\n--- PROTOBUF ---\n")
    val protobufData = ProtobufData(15)
    val dumps = ProtoBuf.dumps(ProtobufData.serializer(), protobufData)
    println(dumps)

    val byteArrayDump = ProtoBuf.dump(protobufData)
    println(byteArrayDump.contentToString())

    val data = ProtoBuf.load(ProtobufData.serializer(), byteArrayDump)
    println(data)
}

@UseExperimental(ImplicitReflectionSerializer::class)
fun testJsonSerialization(){
    println("\n--- JSON ---\n")
    // serializing objects
    val data1 = Data(1)
    val data2 = Data(2, "AWL")
    val jsonData = JSON.stringify(Data.serializer(), data1)
    val jsonData2 = JSON.stringify(data2)
    // serializing lists
    val dataList = listOf(data1, data2)
    val jsonList = JSON.stringify(Data.serializer().list, dataList)
    println(jsonData)
    println(jsonList)

    // parsing data back
    val obj = JSON.parse(Data.serializer(), """{"a":7}""")
    val obj2: Data = JSON.parse("""{"a":109}""")
    println(obj)
}

@UseExperimental(ImplicitReflectionSerializer::class)
fun testCBOR(){
    println("\n--- CBOR ---\n")
    val data = Data(255)
    val dump = CBOR.dump(Data.serializer(), data)
    println(dump.contentToString())
    val dumps = CBOR.dumps(data)
    println(dumps)
}

fun main() {

    testJsonSerialization()

    testCBOR()

    testProtobufSerialization()

}