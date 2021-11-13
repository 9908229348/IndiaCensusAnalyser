package censusanalyser;

import org.junit.Assert;
import org.junit.Test;

public class CensusAnalyserTest {
    private static final String INDIA_CENSUS_CSV_FILEPATH = "./src/test/resources/IndiaStateCensusData.csv";

    @Test
    public void givenIndiaCensusCsvFile_ReturnsCorrectRecords() {
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            int numOfRecords = censusAnalyser.loadIndiaCensusData(INDIA_CENSUS_CSV_FILEPATH);
            Assert.assertEquals(29, numOfRecords);
        }catch (CensusAnalyserException e){ }
    }
}

