
fun main() {
    println("ByteBloom Academy: Ecosystem Project Starter")
    val parsedTeams = parseTeamData()
    var teamCount=0
    if (parsedTeams!=null) {
        for (currentTeam in parsedTeams){
            teamCount +=1
        }
        println("Total teams parsed : $teamCount")
    }else{
        println("No team data available for parsing .")
    }
}