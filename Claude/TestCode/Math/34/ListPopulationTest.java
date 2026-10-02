import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;

public class ListPopulationTest {

    /**
     * Concrete Chromosome implementation for testing purposes.
     */
    private static class TestChromosome extends Chromosome {
        private final double fitnessValue;

        public TestChromosome(final double fitnessValue) {
            this.fitnessValue = fitnessValue;
        }

        @Override
        public double fitness() {
            return fitnessValue;
        }
    }

    /**
     * Concrete ListPopulation implementation for testing purposes.
     */
    private static class TestListPopulation extends ListPopulation {

        public TestListPopulation(final int populationLimit) {
            super(populationLimit);
        }

        public TestListPopulation(final List<Chromosome> chromosomes, final int populationLimit) {
            super(chromosomes, populationLimit);
        }

        @Override
        public Population nextGeneration() {
            // not needed for these tests
            return this;
        }

        // expose protected method for testing
        public List<Chromosome> publicGetChromosomeList() {
            return getChromosomeList();
        }
    }

    private List<Chromosome> chromosomeList;

    @Before
    public void setUp() {
        chromosomeList = new ArrayList<Chromosome>();
        chromosomeList.add(new TestChromosome(1.0));
        chromosomeList.add(new TestChromosome(2.0));
        chromosomeList.add(new TestChromosome(3.0));
    }

    // ---------------- Constructor Tests ----------------

    @Test
    public void testConstructor_withPopulationLimitOnly_createsEmptyPopulation() {
        TestListPopulation population = new TestListPopulation(10);
        assertEquals(0, population.getPopulationSize());
        assertEquals(10, population.getPopulationLimit());
    }

    @Test(expected = NotPositiveException.class)
    public void testConstructor_withZeroPopulationLimit_throwsNotPositiveException() {
        new TestListPopulation(0);
    }

    @Test(expected = NotPositiveException.class)
    public void testConstructor_withNegativePopulationLimit_throwsNotPositiveException() {
        new TestListPopulation(-5);
    }

    @Test
    public void testConstructor_withChromosomesAndLimit_normalInput() {
        TestListPopulation population = new TestListPopulation(chromosomeList, 10);
        assertEquals(3, population.getPopulationSize());
        assertEquals(10, population.getPopulationLimit());
    }

    @Test(expected = NullArgumentException.class)
    public void testConstructor_withNullChromosomes_throwsNullArgumentException() {
        new TestListPopulation(null, 10);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testConstructor_withChromosomesExceedingLimit_throwsNumberIsTooLargeException() {
        new TestListPopulation(chromosomeList, 2);
    }

    @Test(expected = NotPositiveException.class)
    public void testConstructor_withChromosomesAndZeroLimit_throwsNotPositiveException() {
        new TestListPopulation(chromosomeList, 0);
    }

    // ---------------- setChromosomes Tests ----------------

    @Test
    public void testSetChromosomes_normalInput_replacesChromosomes() {
        TestListPopulation population = new TestListPopulation(10);
        population.setChromosomes(chromosomeList);
        assertEquals(3, population.getPopulationSize());
    }

    @Test(expected = NullArgumentException.class)
    public void testSetChromosomes_withNull_throwsNullArgumentException() {
        TestListPopulation population = new TestListPopulation(10);
        population.setChromosomes(null);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testSetChromosomes_exceedingLimit_throwsNumberIsTooLargeException() {
        TestListPopulation population = new TestListPopulation(2);
        population.setChromosomes(chromosomeList);
    }

    // ---------------- addChromosomes Tests ----------------

    @Test
    public void testAddChromosomes_normalInput_addsAllChromosomes() {
        TestListPopulation population = new TestListPopulation(10);
        population.addChromosomes(chromosomeList);
        assertEquals(3, population.getPopulationSize());
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testAddChromosomes_exceedingLimit_throwsNumberIsTooLargeException() {
        TestListPopulation population = new TestListPopulation(2);
        population.addChromosomes(chromosomeList);
    }

    @Test
    public void testAddChromosomes_emptyCollection_noChange() {
        TestListPopulation population = new TestListPopulation(10);
        Collection<Chromosome> emptyColl = new ArrayList<Chromosome>();
        population.addChromosomes(emptyColl);
        assertEquals(0, population.getPopulationSize());
    }

    // ---------------- getChromosomes Tests ----------------

    @Test
    public void testGetChromosomes_returnsUnmodifiableList() {
        TestListPopulation population = new TestListPopulation(chromosomeList, 10);
        List<Chromosome> result = population.getChromosomes();
        assertEquals(3, result.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetChromosomes_modifyUnmodifiableList_throwsUnsupportedOperationException() {
        TestListPopulation population = new TestListPopulation(chromosomeList, 10);
        List<Chromosome> result = population.getChromosomes();
        result.add(new TestChromosome(5.0));
    }

    // ---------------- getChromosomeList Tests (protected, same package access) ----------------

    @Test
    public void testGetChromosomeList_returnsModifiableList() {
        TestListPopulation population = new TestListPopulation(chromosomeList, 10);
        List<Chromosome> internalList = population.publicGetChromosomeList();
        assertEquals(3, internalList.size());
        // modifiable - should not throw
        internalList.add(new TestChromosome(4.0));
        assertEquals(4, population.getPopulationSize());
    }

    // ---------------- addChromosome Tests ----------------

    @Test
    public void testAddChromosome_normalInput_addsChromosome() {
        TestListPopulation population = new TestListPopulation(10);
        population.addChromosome(new TestChromosome(1.0));
        assertEquals(1, population.getPopulationSize());
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testAddChromosome_exceedingLimit_throwsNumberIsTooLargeException() {
        TestListPopulation population = new TestListPopulation(1);
        population.addChromosome(new TestChromosome(1.0));
        population.addChromosome(new TestChromosome(2.0));
    }

    // ---------------- getFittestChromosome Tests ----------------

    @Test
    public void testGetFittestChromosome_multipleChromosomes_returnsFittest() {
        TestListPopulation population = new TestListPopulation(chromosomeList, 10);
        Chromosome fittest = population.getFittestChromosome();
        assertEquals(3.0, fittest.fitness(), 0.0001);
    }

    @Test
    public void testGetFittestChromosome_singleChromosome_returnsThatChromosome() {
        List<Chromosome> singleList = new ArrayList<Chromosome>();
        TestChromosome only = new TestChromosome(42.0);
        singleList.add(only);
        TestListPopulation population = new TestListPopulation(singleList, 10);
        Chromosome fittest = population.getFittestChromosome();
        assertSame(only, fittest);
    }

    // ---------------- getPopulationLimit Tests ----------------

    @Test
    public void testGetPopulationLimit_returnsCorrectLimit() {
        TestListPopulation population = new TestListPopulation(15);
        assertEquals(15, population.getPopulationLimit());
    }

    // ---------------- setPopulationLimit Tests ----------------

    @Test
    public void testSetPopulationLimit_normalInput_updatesLimit() {
        TestListPopulation population = new TestListPopulation(10);
        population.setPopulationLimit(20);
        assertEquals(20, population.getPopulationLimit());
    }

    @Test(expected = NotPositiveException.class)
    public void testSetPopulationLimit_zeroValue_throwsNotPositiveException() {
        TestListPopulation population = new TestListPopulation(10);
        population.setPopulationLimit(0);
    }

    @Test(expected = NotPositiveException.class)
    public void testSetPopulationLimit_negativeValue_throwsNotPositiveException() {
        TestListPopulation population = new TestListPopulation(10);
        population.setPopulationLimit(-1);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testSetPopulationLimit_smallerThanCurrentSize_throwsNumberIsTooSmallException() {
        TestListPopulation population = new TestListPopulation(chromosomeList, 10);
        population.setPopulationLimit(1);
    }

    @Test
    public void testSetPopulationLimit_equalToCurrentSize_updatesSuccessfully() {
        TestListPopulation population = new TestListPopulation(chromosomeList, 10);
        population.setPopulationLimit(3);
        assertEquals(3, population.getPopulationLimit());
    }

    // ---------------- getPopulationSize Tests ----------------

    @Test
    public void testGetPopulationSize_emptyPopulation_returnsZero() {
        TestListPopulation population = new TestListPopulation(10);
        assertEquals(0, population.getPopulationSize());
    }

    @Test
    public void testGetPopulationSize_nonEmptyPopulation_returnsCorrectSize() {
        TestListPopulation population = new TestListPopulation(chromosomeList, 10);
        assertEquals(3, population.getPopulationSize());
    }

    // ---------------- toString Tests ----------------

    @Test
    public void testToString_returnsNonNullString() {
        TestListPopulation population = new TestListPopulation(chromosomeList, 10);
        String result = population.toString();
        assertNotNull(result);
    }

    @Test
    public void testToString_emptyPopulation_returnsEmptyListString() {
        TestListPopulation population = new TestListPopulation(10);
        String result = population.toString();
        assertEquals("[]", result);
    }

    // ---------------- iterator Tests ----------------

    @Test
    public void testIterator_iteratesOverAllChromosomes() {
        TestListPopulation population = new TestListPopulation(chromosomeList, 10);
        Iterator<Chromosome> iterator = population.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            iterator.next();
            count++;
        }
        assertEquals(3, count);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testIterator_removeCalled_throwsUnsupportedOperationException() {
        TestListPopulation population = new TestListPopulation(chromosomeList, 10);
        Iterator<Chromosome> iterator = population.iterator();
        iterator.next();
        iterator.remove();
    }

    @Test
    public void testIterator_emptyPopulation_hasNextFalse() {
        TestListPopulation population = new TestListPopulation(10);
        Iterator<Chromosome> iterator = population.iterator();
        assertFalse(iterator.hasNext());
    }
}
