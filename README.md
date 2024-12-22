# StormAPI
Developer's API for Storm Anti-Cheat

Please add StormAPI.jar into your plugins folder

Example below

public final class ExampleListener implements StormListener {

    public ExampleListener() {
        StormAPI.getEventRegistry().addListener(this);
    }

    @Override
    public void onEvent(StormEvent event) {

        if(event instanceof AlertEvent){
           final CheckData check = ((AlertEvent) event).getCheck();
           final Player player = ((AlertEvent) event).getPlayer();
        }

    }

}

