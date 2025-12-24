package model
import java.io.File
interface teamDataProvider {
    fun fatchTeam(file : File): List<TeamRaw>
}
