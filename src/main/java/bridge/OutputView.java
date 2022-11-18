package bridge;

public class OutputView {

    static String result;
    static String successOrFail;

    public void printMap(String[] bridgeMap) {
        BridgeGame bridgeGame = new BridgeGame();

        System.out.println("[ " + bridgeMap[0] + " ]");
        System.out.println("[ " + bridgeMap[1] + " ]");
        result = "[ " + bridgeMap[0] + " ]\n" + "[ " + bridgeMap[1] + " ]";
        successOrFail = "성공";
        if (bridgeMap[0].contains("X") || bridgeMap[1].contains("X")) {
            successOrFail = "실패";
            bridgeGame.retry();
        }
    }

    public void printResult() {
        System.out.println("최종 게임 결과");
        System.out.println(result);
        System.out.println("게임 성공 여부: " + successOrFail);
    }
}
