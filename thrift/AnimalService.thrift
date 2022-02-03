namespace java com.windhc.thrift.gen

struct Message {
     1: string text
}

service AnimalService {
    Message jump(1:Message msg)
}
