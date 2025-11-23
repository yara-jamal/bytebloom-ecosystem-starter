import com.bytebloom.model.raw.TeamRaw
import java.io.File

fun parseTeamData(): List<TeamRaw>?{
    val teamsDataList=mutableListOf<TeamRaw>()
    val allFileLines= File("src/main/resources/teams.csv").readLines()
    allFileLines.drop(1).forEach {
            currentRaw ->val teamFields = currentRaw.split(",").map { it.trim() }
        val teamRawData=TeamRaw(teamFields[0],teamFields[1],teamFields[2])
        teamsDataList.add(teamRawData)
    }
    return if(teamsDataList.isEmpty()){
        null
    }else{
       teamsDataList
    }
}