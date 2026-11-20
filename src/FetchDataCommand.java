/**
 * FetchDataCommand
 * A command that instantiates WeatherDataFetcher and calls its fetchData() method.
 * Part of the Command pattern.
 * Implements the Command interface.
 *
 * @author Hudson Miller
 */

public class FetchDataCommand implements Command {
    private WeatherDataFetcher fetcher = new WeatherDataFetcher();
    public void execute(){
        fetcher.fetchData();
    }
}
