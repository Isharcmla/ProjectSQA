package org.apache.commons.math3.genetics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.junit.Assert;
import org.junit.Test;

public class ListPopulationTest {

    private static class DummyChromosome extends Chromosome {
        private final double fitness;

        public DummyChromosome(final double fitness) {
            this.fitness = fitness;
        }

        @Override
        public double getFitness() {
            return fitness;
        }

        @Override
        protected boolean isSame(final Chromosome another) {
            return this == another;
        }
    }

    private static class DummyListPopulation extends ListPopulation {
        public DummyListPopulation(final int populationLimit) {
            super(populationLimit);
        }

        public DummyListPopulation(final List<Chromosome> chromosomes, final int populationLimit) {
            super(chromosomes, populationLimit);
        }

        public Population nextGeneration() {
            return null;
        }

        public List<Chromosome> getSubclassChromosomeList() {
            return super.getChromosomeList();
        }
    }

    @Test
    public void testConstructor_withPopulationLimitOnly_success() {
        DummyListPopulation pop = new DummyListPopulation(10);
        Assert.assertEquals(10, pop.getPopulationLimit());
        Assert.assertEquals(0, pop.getPopulationSize());
        Assert.assertTrue(pop.getChromosomes().isEmpty());
    }

    @Test(expected = NotPositiveException.class)
    public void testConstructor_withZeroLimit_throwsNotPositiveException() {
        new DummyListPopulation(0);
    }

    @Test(expected = NotPositiveException.class)
    public void testConstructor_withNegativeLimit_throwsNotPositiveException() {
        new DummyListPopulation(-5);
    }

    @Test
    public void testConstructor_withListAndLimit_success() {
        Chromosome c1 = new DummyChromosome(1.0);
        Chromosome c2 = new DummyChromosome(2.0);
        List<Chromosome> list = Arrays.asList(c1, c2);

        DummyListPopulation pop = new DummyListPopulation(list, 5);
        Assert.assertEquals(5, pop.getPopulationLimit());
        Assert.assertEquals(2, pop.getPopulationSize());
        Assert.assertEquals(2, pop.getChromosomes().size());
        Assert.assertTrue(pop.getChromosomes().contains(c1));
        Assert.assertTrue(pop.getChromosomes().contains(c2));
    }

    @Test(expected = NullArgumentException.class)
    public void testConstructor_nullChromosomeList_throwsNullArgumentException() {
        new DummyListPopulation(null, 5);
    }

    @Test(expected = NotPositiveException.class)
    public void testConstructor_listWithNonPositiveLimit_throwsNotPositiveException() {
        List<Chromosome> list = new ArrayList<Chromosome>();
        new DummyListPopulation(list, 0);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testConstructor_listLargerThanLimit_throwsNumberIsTooLargeException() {
        List<Chromosome> list = Arrays.<Chromosome>asList(
            new DummyChromosome(1.0),
            new DummyChromosome(2.0),
            new DummyChromosome(3.0)
        );
        new DummyListPopulation(list, 2);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testSetChromosomes_success() {
        DummyListPopulation pop = new DummyListPopulation(5);
        Chromosome c1 = new DummyChromosome(1.0);
        pop.addChromosome(c1);

        Chromosome c2 = new DummyChromosome(2.0);
        Chromosome c3 = new DummyChromosome(3.0);
        List<Chromosome> newList = Arrays.asList(c2, c3);

        pop.setChromosomes(newList);
        Assert.assertEquals(2, pop.getPopulationSize());
        Assert.assertFalse(pop.getChromosomes().contains(c1));
        Assert.assertTrue(pop.getChromosomes().contains(c2));
        Assert.assertTrue(pop.getChromosomes().contains(c3));
    }

    @Test(expected = NullArgumentException.class)
    @SuppressWarnings("deprecation")
    public void testSetChromosomes_nullList_throwsNullArgumentException() {
        DummyListPopulation pop = new DummyListPopulation(5);
        pop.setChromosomes(null);
    }

    @Test(expected = NumberIsTooLargeException.class)
    @SuppressWarnings("deprecation")
    public void testSetChromosomes_tooLargeList_throwsNumberIsTooLargeException() {
        DummyListPopulation pop = new DummyListPopulation(2);
        List<Chromosome> newList = Arrays.<Chromosome>asList(
            new DummyChromosome(1.0),
            new DummyChromosome(2.0),
            new DummyChromosome(3.0)
        );
        pop.setChromosomes(newList);
    }

    @Test
    public void testAddChromosomes_success() {
        DummyListPopulation pop = new DummyListPopulation(5);
        Chromosome c1 = new DummyChromosome(1.0);
        pop.addChromosome(c1);

        Chromosome c2 = new DummyChromosome(2.0);
        Chromosome c3 = new DummyChromosome(3.0);
        pop.addChromosomes(Arrays.asList(c2, c3));

        Assert.assertEquals(3, pop.getPopulationSize());
        Assert.assertEquals(c1, pop.getChromosomes().get(0));
        Assert.assertEquals(c2, pop.getChromosomes().get(1));
        Assert.assertEquals(c3, pop.getChromosomes().get(2));
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testAddChromosomes_exceedLimit_throwsNumberIsTooLargeException() {
        DummyListPopulation pop = new DummyListPopulation(3);
        pop.addChromosome(new DummyChromosome(1.0));
        pop.addChromosome(new DummyChromosome(2.0));

        pop.addChromosomes(Arrays.<Chromosome>asList(
            new DummyChromosome(3.0),
            new DummyChromosome(4.0)
        ));
    }

    @Test
    public void testAddChromosome_success() {
        DummyListPopulation pop = new DummyListPopulation(2);
        Chromosome c1 = new DummyChromosome(1.0);
        pop.addChromosome(c1);

        Assert.assertEquals(1, pop.getPopulationSize());
        Assert.assertEquals(c1, pop.getChromosomes().get(0));
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testAddChromosome_exceedLimit_throwsNumberIsTooLargeException() {
        DummyListPopulation pop = new DummyListPopulation(1);
        pop.addChromosome(new DummyChromosome(1.0));
        pop.addChromosome(new DummyChromosome(2.0));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetChromosomes_unmodifiableList() {
        DummyListPopulation pop = new DummyListPopulation(5);
        pop.getChromosomes().add(new DummyChromosome(1.0));
    }

    @Test
    public void testGetChromosomeList_returnsInternalList() {
        DummyListPopulation pop = new DummyListPopulation(5);
        Chromosome c = new DummyChromosome(10.0);
        pop.addChromosome(c);

        List<Chromosome> internal = pop.getSubclassChromosomeList();
        Assert.assertEquals(1, internal.size());
        Assert.assertEquals(c, internal.get(0));
    }

    @Test
    public void testGetFittestChromosome_returnsHighestFitness() {
        DummyListPopulation pop = new DummyListPopulation(5);
        Chromosome c1 = new DummyChromosome(10.0);
        Chromosome c2 = new DummyChromosome(50.0);
        Chromosome c3 = new DummyChromosome(30.0);

        pop.addChromosome(c1);
        pop.addChromosome(c2);
        pop.addChromosome(c3);

        Chromosome fittest = pop.getFittestChromosome();
        Assert.assertEquals(c2, fittest);
        Assert.assertEquals(50.0, fittest.getFitness(), 1e-6);
    }

    @Test
    public void testGetFittestChromosome_singleChromosome() {
        DummyListPopulation pop = new DummyListPopulation(5);
        Chromosome c1 = new DummyChromosome(10.0);
        pop.addChromosome(c1);

        Assert.assertEquals(c1, pop.getFittestChromosome());
    }

    @Test
    public void testSetPopulationLimit_validIncreaseAndDecrease() {
        DummyListPopulation pop = new DummyListPopulation(5);
        pop.addChromosome(new DummyChromosome(1.0));
        pop.addChromosome(new DummyChromosome(2.0));

        pop.setPopulationLimit(10);
        Assert.assertEquals(10, pop.getPopulationLimit());

        pop.setPopulationLimit(2);
        Assert.assertEquals(2, pop.getPopulationLimit());
    }

    @Test(expected = NotPositiveException.class)
    public void testSetPopulationLimit_zero_throwsNotPositiveException() {
        DummyListPopulation pop = new DummyListPopulation(5);
        pop.setPopulationLimit(0);
    }

    @Test(expected = NotPositiveException.class)
    public void testSetPopulationLimit_negative_throwsNotPositiveException() {
        DummyListPopulation pop = new DummyListPopulation(5);
        pop.setPopulationLimit(-3);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testSetPopulationLimit_smallerThanCurrentSize_throwsNumberIsTooSmallException() {
        DummyListPopulation pop = new DummyListPopulation(5);
        pop.addChromosome(new DummyChromosome(1.0));
        pop.addChromosome(new DummyChromosome(2.0));
        pop.addChromosome(new DummyChromosome(3.0));

        pop.setPopulationLimit(2);
    }

    @Test
    public void testToString_notNullAndContainsElements() {
        DummyListPopulation pop = new DummyListPopulation(5);
        Chromosome c = new DummyChromosome(1.0);
        pop.addChromosome(c);

        String str = pop.toString();
        Assert.assertNotNull(str);
        Assert.assertTrue(str.contains(c.toString()));
    }

    @Test
    public void testIterator_traversal() {
        DummyListPopulation pop = new DummyListPopulation(5);
        Chromosome c1 = new DummyChromosome(1.0);
        Chromosome c2 = new DummyChromosome(2.0);
        pop.addChromosome(c1);
        pop.addChromosome(c2);

        Iterator<Chromosome> iterator = pop.iterator();
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals(c1, iterator.next());
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals(c2, iterator.next());
        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void testIterator_removeRemovesFromPopulation() {
        DummyListPopulation pop = new DummyListPopulation(5);
        Chromosome c1 = new DummyChromosome(1.0);
        pop.addChromosome(c1);

        Iterator<Chromosome> iterator = pop.iterator();
        Assert.assertEquals(c1, iterator.next());
        iterator.remove();
        Assert.assertEquals(0, pop.getPopulationSize());
    }
}
