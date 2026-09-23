package org.apache.commons.math3.genetics;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import org.apache.commons.math3.exception.NotPositiveException;
import static org.apache.commons.math3.genetics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ElitisticListPopulation_nextGeneration_78767196614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term892;

    public ElitisticListPopulation_nextGeneration_78767196614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term892 = newInstance(Class.forName("org.apache.commons.math3.genetics.ElitisticListPopulation"));
        setIntField(term892, term892.getClass(), "populationLimit", -2147483647);
        setDoubleField(term892, term892.getClass(), "elitismRate", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.genetics.ElitisticListPopulation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextGeneration", argTypes, term892, args);
            assertTrue(false);
        }
        catch (NotPositiveException e) {
        }

    }

};


