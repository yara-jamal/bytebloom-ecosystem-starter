package model
import java.io.File
interface attendanceDataProvider{
    fun fatchattendance (file : File) : List <attendanceRaw>
}