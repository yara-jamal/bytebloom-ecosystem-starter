package model
import java.io.File
interface projectDataProvider{
    fun fatchProject(file : File) : List<projectsRaw>
}