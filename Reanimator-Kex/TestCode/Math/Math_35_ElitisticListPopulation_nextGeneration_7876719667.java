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
import java.lang.OutOfMemoryError;
import static org.apache.commons.math3.genetics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class ElitisticListPopulation_nextGeneration_7876719667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17;

    public ElitisticListPopulation_nextGeneration_7876719667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term19 = new ArrayList();
        ((ArrayList) term19).add((Object)null);
        ((ArrayList) term19).add((Object)null);
        ((ArrayList) term19).add((Object)null);
        ((ArrayList) term19).add((Object)null);
        ((ArrayList) term19).add((Object)null);
        ((ArrayList) term19).add((Object)null);
        ((ArrayList) term19).add((Object)null);
        ((ArrayList) term19).add((Object)null);
        ((ArrayList) term19).add((Object)null);
        term17 = newInstance(Class.forName("org.apache.commons.math3.genetics.ElitisticListPopulation"));
        setDoubleField(term17, term17.getClass(), "elitismRate", 0.5523635872663106);
        setField(term17, term17.getClass(), "chromosomes", term19);
        setIntField(term17, term17.getClass(), "populationLimit", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.genetics.ElitisticListPopulation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextGeneration", argTypes, term17, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


