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
import java.lang.Double;

public class ElitisticListPopulation_setElitismRate_7306155428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24;
     Object term31;
     Object term738;

    public ElitisticListPopulation_setElitismRate_7306155428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term26 = new ArrayList();
        term24 = newInstance(Class.forName("org.apache.commons.math3.genetics.ElitisticListPopulation"));
        setDoubleField(term24, term24.getClass(), "elitismRate", 0.544608645520025);
        setField(term24, term24.getClass(), "chromosomes", term26);
        setIntField(term24, term24.getClass(), "populationLimit", 391863371);
        term31 = new Double(0.28570734989730284);
        ArrayList term739 = new ArrayList();
        term738 = newInstance(Class.forName("org.apache.commons.math3.genetics.ElitisticListPopulation"));
        setDoubleField(term738, term738.getClass(), "elitismRate", 0.28570734989730284);
        setField(term738, term738.getClass(), "chromosomes", term739);
        setIntField(term738, term738.getClass(), "populationLimit", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.genetics.ElitisticListPopulation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term31;
        callMethod(klass, "setElitismRate", argTypes, term24, args);
        assertTrue(recursiveEquals(term24, term738));
        assertTrue(recursiveEquals(term31, 0.28570734989730284));
    }

};


