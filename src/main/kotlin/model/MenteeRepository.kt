package model
import java.io.File//هين استدعست مكتبة للقراة
val linesOfMentee = File("src/main/resources/mentees.csv").readLines().drop(1)// هين عملت قراه للملف خارج الكلاس عشان ما يكون في تحميل على كلاس من جوا
class MenteeRepository : menteeDataProvider{// هين عملت وراثة لكلاس منتيمداتا
    override fun fatchMentees(file: File): List<MenteeRaw> {// عملت اعادة كتابة  لدالة تبعتي
        return linesOfMentee.map {//
            val partsMentee = it.split(",")// بدي اقسم حسب الفاصلة
            MenteeRaw(
                partsMentee[0].trim(), partsMentee[1].trim(),
                partsMentee[2].trim()
            )
      }
    }

}