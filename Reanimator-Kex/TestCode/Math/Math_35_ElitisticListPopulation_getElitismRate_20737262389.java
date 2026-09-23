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
import static org.apache.commons.math3.genetics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.genetics.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class ElitisticListPopulation_getElitismRate_20737262389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33;
     Object term749;

    public ElitisticListPopulation_getElitismRate_20737262389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term35 = new ArrayList();
        ((ArrayList) term35).add((Object)null);
        ((ArrayList) term35).add((Object)null);
        ((ArrayList) term35).add((Object)null);
        ((ArrayList) term35).add((Object)null);
        term33 = newInstance(Class.forName("org.apache.commons.math3.genetics.ElitisticListPopulation"));
        setDoubleField(term33, term33.getClass(), "elitismRate", 0.40176586625454525);
        setField(term33, term33.getClass(), "chromosomes", term35);
        setIntField(term33, term33.getClass(), "populationLimit", -1922583790);
        ArrayList term750 = new ArrayList();
        ((ArrayList) term750).add((Object)null);
        ((ArrayList) term750).add((Object)null);
        ((ArrayList) term750).add((Object)null);
        ((ArrayList) term750).add((Object)null);
        term749 = newInstance(Class.forName("org.apache.commons.math3.genetics.ElitisticListPopulation"));
        setDoubleField(term749, term749.getClass(), "elitismRate", 0.40176586625454525);
        setField(term749, term749.getClass(), "chromosomes", term750);
        setIntField(term749, term749.getClass(), "populationLimit", -1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.genetics.ElitisticListPopulation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getElitismRate", argTypes, term33, args);
        assertTrue(recursiveEquals(term33, term749));
        assertTrue(recursiveEquals(retValue, 0.40176586625454525));
    }

};


