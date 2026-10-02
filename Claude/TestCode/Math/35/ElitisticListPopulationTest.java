package org.apache.commons.math3.genetics;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.math3.exception.OutOfRangeException;

public class ElitisticListPopulationTest {

    private static class TestChromosome extends Chromosome {
        private final double fitnessValue;

        TestChromosome(double fitnessValue) {
            this.fitnessValue = fitnessValue;
        }

        public double fitness() {
            return fitnessValue;
        }
    }

    private List<Chromosome> createChromosomes(double... fitnessValues) {
        List<Chromosome> list = new ArrayList<Chromosome>();
        for (double f : fitnessValues) {
            list.add(new TestChromosome(f));
        }
        return list;
    }

    @Test
    public void testConstructor_withChromosomesListAndValidElitismRate_setsFieldsCorrectly() {
        List<Chromosome> chromosomes = createChromosomes(1, 2, 3);
        ElitisticListPopulation population = new ElitisticListPopulation(chromosomes, 10, 0.5);
        assertEquals(0.5, population.getElitismRate(), 1e-9);
        assertEquals(3, population.getChromosomes().size());
        assertEquals(10, population.getPopulationLimit());
    }

    @Test
    public void testConstructor_withPopulationLimitAndValidElitismRate_setsFieldsCorrectly() {
        ElitisticListPopulation population = new ElitisticListPopulation(10, 0.3);
        assertEquals(0.3, population.getElitismRate(), 1e-9);
        assertEquals(10, population.getPopulationLimit());
        assertEquals(0, population.getChromosomes().size());
    }

    @Test
    public void testConstructor_withInvalidElitismRateNegative_doesNotThrowButStoresValue() {
        // Note: the current implementation of ElitisticListPopulation's constructors
        // does NOT validate the elitismRate range, despite the javadoc claim.
        ElitisticListPopulation population = new ElitisticListPopulation(10, -0.5);
        assertEquals(-0.5, population.getElitismRate(), 1e-9);
    }

    @Test
    public void testConstructor_withInvalidElitismRateGreaterThanOne_doesNotThrowButStoresValue() {
        ElitisticListPopulation population = new ElitisticListPopulation(10, 1.5);
        assertEquals(1.5, population.getElitismRate(), 1e-9);
    }

    @Test
    public void testSetElitismRate_withValidValue_updatesElitismRate() {
        ElitisticListPopulation population = new ElitisticListPopulation(10, 0.5);
        population.setElitismRate(0.8);
        assertEquals(0.8, population.getElitismRate(), 1e-9);
    }

    @Test
    public void testSetElitismRate_withZero_boundaryValueAccepted() {
        ElitisticListPopulation population = new ElitisticListPopulation(10, 0.5);
        population.setElitismRate(0);
        assertEquals(0, population.getElitismRate(), 1e-9);
    }

    @Test
    public void testSetElitismRate_withOne_boundaryValueAccepted() {
        ElitisticListPopulation population = new ElitisticListPopulation(10, 0.5);
        population.setElitismRate(1);
        assertEquals(1, population.getElitismRate(), 1e-9);
    }

    @Test(expected = OutOfRangeException.class)
    public void testSetElitismRate_withNegativeValue_throwsOutOfRangeException() {
        ElitisticListPopulation population = new ElitisticListPopulation(10, 0.5);
        population.setElitismRate(-0.1);
    }

    @Test(expected = OutOfRangeException.class)
    public void testSetElitismRate_withValueGreaterThanOne_throwsOutOfRangeException() {
        ElitisticListPopulation population = new ElitisticListPopulation(10, 0.5);
        population.setElitismRate(1.1);
    }

    @Test
    public void testGetElitismRate_afterConstruction_returnsCorrectValue() {
        ElitisticListPopulation population = new ElitisticListPopulation(10, 0.75);
        assertEquals(0.75, population.getElitismRate(), 1e-9);
    }

    @Test
    public void testNextGeneration_withTypicalElitismRate_returnsExpectedBestChromosomes() {
        List<Chromosome> chromosomes = createChromosomes(3, 1, 5, 2, 4);
        ElitisticListPopulation population = new ElitisticListPopulation(chromosomes, 10, 0.5);
        Population nextGen = population.nextGeneration();
        assertTrue(nextGen instanceof ElitisticListPopulation);
        List<Chromosome> nextChromosomes = ((ElitisticListPopulation) nextGen).getChromosomes();
        // boundIndex = ceil((1-0.5)*5) = 3, so chromosomes with indices 3,4 (fitness 4,5) survive
        assertEquals(2, nextChromosomes.size());
        double[] fitnessValues = new double[nextChromosomes.size()];
        for (int i = 0; i < nextChromosomes.size(); i++) {
            fitnessValues[i] = nextChromosomes.get(i).getFitness();
        }
        Arrays.sort(fitnessValues);
        assertArrayEquals(new double[]{4, 5}, fitnessValues, 1e-9);
    }

    @Test
    public void testNextGeneration_withElitismRateZero_returnsEmptyPopulation() {
        List<Chromosome> chromosomes = createChromosomes(1, 2, 3);
        ElitisticListPopulation population = new ElitisticListPopulation(chromosomes, 10, 0.0);
        Population nextGen = population.nextGeneration();
        List<Chromosome> nextChromosomes = ((ElitisticListPopulation) nextGen).getChromosomes();
        assertEquals(0, nextChromosomes.size());
    }

    @Test
    public void testNextGeneration_withElitismRateOne_returnsAllChromosomes() {
        List<Chromosome> chromosomes = createChromosomes(1, 2, 3);
        ElitisticListPopulation population = new ElitisticListPopulation(chromosomes, 10, 1.0);
        Population nextGen = population.nextGeneration();
        List<Chromosome> nextChromosomes = ((ElitisticListPopulation) nextGen).getChromosomes();
        assertEquals(3, nextChromosomes.size());
    }

    @Test
    public void testNextGeneration_withEmptyPopulation_returnsEmptyPopulation() {
        List<Chromosome> chromosomes = createChromosomes();
        ElitisticListPopulation population = new ElitisticListPopulation(chromosomes, 10, 0.5);
        Population nextGen = population.nextGeneration();
        List<Chromosome> nextChromosomes = ((ElitisticListPopulation) nextGen).getChromosomes();
        assertEquals(0, nextChromosomes.size());
    }

    @Test
    public void testNextGeneration_preservesPopulationLimitAndElitismRate() {
        List<Chromosome> chromosomes = createChromosomes(1, 2, 3);
        ElitisticListPopulation population = new ElitisticListPopulation(chromosomes, 20, 0.6);
        ElitisticListPopulation nextGen = (ElitisticListPopulation) population.nextGeneration();
        assertEquals(20, nextGen.getPopulationLimit());
        assertEquals(0.6, nextGen.getElitismRate(), 1e-9);
    }
}
