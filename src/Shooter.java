public class Shooter extends Thread {

    float minHUE1, maxHUE1, minSAT1, maxSAT1, minBRI1, maxBRI1, minHUE2, maxHUE2, minSAT2, maxSAT2, minBRI2, maxBRI2, minHUE3, maxHUE3, minSAT3, maxSAT3, minBRI3, maxBRI3;

    @Override
    public void run() {
        switch(GlazMain.Gui.list1.getSelectedIndex()){
            case 0:
                minHUE1 = 0.165f;
                maxHUE1 = 0.185f;
                minSAT1 = 0.6f;
                maxSAT1 = 0.8f;
                minBRI1 = 0.7f;
                maxBRI1 = 0.9f;
                minHUE2 = 0.17f;
                maxHUE2 = 0.185f;
                minSAT2 = 0.4f;
                maxSAT2 = 0.5f;
                minBRI2 = 0.5f;
                maxBRI2 = 0.7f;
                minHUE3 = 0.158f;
                maxHUE3 = 0.162f;
                minSAT3 = 0.8f;
                maxSAT3 = 0.83f;
                minBRI3 = 0.69f;
                maxBRI3 = 0.71f;
                break;
            default:
                    break;
        }
        Mouse mouse = new Mouse();

        while(GlazMain.Gui.running) {
            if (((updateArea.hsb[0] > minHUE1) && (updateArea.hsb[0] < maxHUE1) && (updateArea.hsb[1] > minSAT1) &&(updateArea.hsb[1] < maxSAT1) && (updateArea.hsb[2] > minBRI1) &&(updateArea.hsb[2] < maxBRI1)) || ((updateArea.hsb[0] > minHUE2) && (updateArea.hsb[0] < maxHUE2) && (updateArea.hsb[1] > minSAT2) &&(updateArea.hsb[1] < maxSAT2) && (updateArea.hsb[2] > minBRI2) &&(updateArea.hsb[2] < maxBRI2)|| ((updateArea.hsb[0] > minHUE3) && (updateArea.hsb[0] < maxHUE3) && (updateArea.hsb[1] > minSAT3) &&(updateArea.hsb[1] < maxSAT3) && (updateArea.hsb[2] > minBRI3) &&(updateArea.hsb[2] < maxBRI3)))){
                mouse.mouseClick();
            }
            if (((updateArea.hsb2[0] > minHUE1) && (updateArea.hsb2[0] < maxHUE1) && (updateArea.hsb2[1] > minSAT1) &&(updateArea.hsb2[1] < maxSAT1) && (updateArea.hsb2[2] > minBRI1) &&(updateArea.hsb2[2] < maxBRI1)) || ((updateArea.hsb2[0] > minHUE2) && (updateArea.hsb2[0] < maxHUE2) && (updateArea.hsb2[1] > minSAT2) &&(updateArea.hsb2[1] < maxSAT2) && (updateArea.hsb2[2] > minBRI2) &&(updateArea.hsb2[2] < maxBRI2)|| ((updateArea.hsb2[0] > minHUE3) && (updateArea.hsb2[0] < maxHUE3) && (updateArea.hsb2[1] > minSAT3) &&(updateArea.hsb2[1] < maxSAT3) && (updateArea.hsb2[2] > minBRI3) &&(updateArea.hsb2[2] < maxBRI3)))){
                mouse.mouseClick();
            }
            if (((updateArea.hsb3[0] > minHUE1) && (updateArea.hsb3[0] < maxHUE1) && (updateArea.hsb3[1] > minSAT1) &&(updateArea.hsb3[1] < maxSAT1) && (updateArea.hsb3[2] > minBRI1) &&(updateArea.hsb3[2] < maxBRI1)) || ((updateArea.hsb3[0] > minHUE2) && (updateArea.hsb3[0] < maxHUE2) && (updateArea.hsb3[1] > minSAT2) &&(updateArea.hsb3[1] < maxSAT2) && (updateArea.hsb3[2] > minBRI2) &&(updateArea.hsb3[2] < maxBRI2)|| ((updateArea.hsb3[0] > minHUE3) && (updateArea.hsb3[0] < maxHUE3) && (updateArea.hsb3[1] > minSAT3) &&(updateArea.hsb3[1] < maxSAT3) && (updateArea.hsb3[2] > minBRI3) &&(updateArea.hsb3[2] < maxBRI3)))){
                mouse.mouseClick();
            }
            if (((updateArea.hsb4[0] > minHUE1) && (updateArea.hsb4[0] < maxHUE1) && (updateArea.hsb4[1] > minSAT1) &&(updateArea.hsb4[1] < maxSAT1) && (updateArea.hsb4[2] > minBRI1) &&(updateArea.hsb4[2] < maxBRI1)) || ((updateArea.hsb4[0] > minHUE2) && (updateArea.hsb4[0] < maxHUE2) && (updateArea.hsb4[1] > minSAT2) &&(updateArea.hsb4[1] < maxSAT2) && (updateArea.hsb4[2] > minBRI2) &&(updateArea.hsb4[2] < maxBRI2)|| ((updateArea.hsb4[0] > minHUE3) && (updateArea.hsb4[0] < maxHUE3) && (updateArea.hsb4[1] > minSAT3) &&(updateArea.hsb4[1] < maxSAT3) && (updateArea.hsb4[2] > minBRI3) &&(updateArea.hsb4[2] < maxBRI3)))){
                mouse.mouseClick();
            }else{
                System.out.print("\n Waiting!");
            }

        }
        if (!GlazMain.Gui.running)
            Thread.interrupted();
    }
}
