package org.apache.commons.math3.genetics;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.junit.Assert;
import org.junit.Test;

public class ElitisticListPopulationTest {

    private static class DummyChromosome extends Chromosome {
        private final double fitness;

        public DummyChromosome(final double fitness) {
            this.fitness = fitness;
        }

        @Override
        public double fitness() {
            return this.fitness;
        }
    }

    @Test
    public void testConstructorWithList_validParameters_success() {
        List<Chromosome> chromosomes = new ArrayList<Chromosome>();
        chromosomes.add(new DummyChromosome(1.0));
        chromosomes.add(new DummyChromosome(2.0));

        ElitisticListPopulation population = new ElitisticListPopulation(chromosomes, 10, 0.5);

        Assert.assertEquals(10, population.getPopulationLimit());
        Assert.assertEquals(0.5, population.getElitismRate(), 1e-6);
        Assert.assertEquals(2, population.getPopulationSize());
        Assert.assertEquals(chromosomes, population.getChromosomes());
    }

    @Test
    public void testConstructorWithoutList_validParameters_success() {
        ElitisticListPopulation population = new ElitisticListPopulation(100, 0.2);

        Assert.assertEquals(100, population.getPopulationLimit());
        Assert.assertEquals(0.2, population.getElitismRate(), 1e-6);
        Assert.assertEquals(0, population.getPopulationSize());
    }

    @Test
    public void testSetElitismRate_validValues_updatesSuccessfully() {
        ElitisticListPopulation population = new ElitisticListPopulation(10, 0.5);

        population.setElitismRate(0.0);
        Assert.assertEquals(0.0, population.getElitismRate(), 1e-6);

        population.setElitismRate(1.0);
        Assert.assertEquals(1.0, population.getElitismRate(), 1e-6);

        population.setElitismRate(0.75);
        Assert.assertEquals(0.75, population.getElitismRate(), 1e-6);
    }

    @Test(expected = OutOfRangeException.class)
    public void testSetElitismRate_negativeValue_throwsOutOfRangeException() {
        ElitisticListPopulation population = new ElitisticListPopulation(10, 0.5);
        population.setElitismRate(-0.01);
    }

    @Test(expected = OutOfRangeException.class)
    public void testSetElitismRate_valueGreaterThanOne_throwsOutOfRangeException() {
        ElitisticListPopulation population = new ElitisticListPopulation(10, 0.5);
        population.setElitismRate(1.01);
    }

    @Test
    public void testNextGeneration_emptyPopulation_returnsEmptyNextGeneration() {
        ElitisticListPopulation population = new ElitisticListPopulation(10, 0.5);

        Population nextGen = population.nextGeneration();

        Assert.assertTrue(nextGen instanceof ElitisticListPopulation);
        Assert.assertEquals(0, nextGen.getPopulationSize());
        Assert.assertEquals(10, nextGen.getPopulationLimit());
        Assert.assertEquals(0.5, ((ElitisticListPopulation) nextGen).getElitismRate(), 1e-6);
    }

    @Test
    public void testNextGeneration_zeroElitismRate_transfersNoChromosomes() {
        List<Chromosome> chromosomes = new ArrayList<Chromosome>();
        for (int i = 0; i < 10; i++) {
            chromosomes.add(new DummyChromosome(i));
        }

        ElitisticListPopulation population = new ElitisticListPopulation(chromosomes, 20, 0.0);
        Population nextGen = population.nextGeneration();

        Assert.assertEquals(0, nextGen.getPopulationSize());
        Assert.assertEquals(20, nextGen.getPopulationLimit());
        Assert.assertEquals(0.0, ((ElitisticListPopulation) nextGen).getElitismRate(), 1e-6);
    }

    @Test
    public void testNextGeneration_oneHundredPercentElitismRate_transfersAllChromosomes() {
        List<Chromosome> chromosomes = new ArrayList<Chromosome>();
        for (int i = 0; i < 10; i++) {
            chromosomes.add(new DummyChromosome(i));
        }

        ElitisticListPopulation population = new ElitisticListPopulation(chromosomes, 20, 1.0);
        Population nextGen = population.nextGeneration();

        Assert.assertEquals(10, nextGen.getPopulationSize());
        Assert.assertEquals(20, nextGen.getPopulationLimit());
        Assert.assertEquals(1.0, ((ElitisticListPopulation) nextGen).getElitismRate(), 1e-6);

        List<Chromosome> nextChromosomes = ((ElitisticListPopulation) nextGen).getChromosomes();
        for (int i = 0; i < 10; i++) {
            Assert.assertEquals(i, nextChromosomes.get(i).getFitness(), 1e-6);
        }
    }

    @Test
    public void testNextGeneration_partialElitismRate_transfersBestChromosomes() {
        List<Chromosome> chromosomes = new ArrayList<Chromosome>();
        chromosomes.add(new DummyChromosome(10.0));
        chromosomes.add(new DummyChromosome(30.0));
        chromosomes.add(new DummyChromosome(20.0));
        chromosomes.add(new DummyChromosome(50.0));
        chromosomes.add(new DummyChromosome(40.0));

        // 5 chromosomes, rate 0.4 -> boundIndex = ceil((1 - 0.4) * 5) = ceil(3.0) = 3
        // Should select elements at sorted index 3 and 4 (the best 2: fitness 40.0 and 50.0)
        ElitisticListPopulation population = new ElitisticListPopulation(chromosomes, 10, 0.4);
        Population nextGen = population.nextGeneration();

        Assert.assertEquals(2, nextGen.getPopulationSize());
        List<Chromosome> nextChromosomes = ((ElitisticListPopulation) nextGen).getChromosomes();
        Assert.assertEquals(40.0, nextChromosomes.get(0).getFitness(), 1e-6);
        Assert.assertEquals(50.0, nextChromosomes.get(1).getFitness(), 1e-6);
    }
}
