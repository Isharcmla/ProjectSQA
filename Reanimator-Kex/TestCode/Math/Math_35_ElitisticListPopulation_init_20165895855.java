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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Double;

public class ElitisticListPopulation_init_20165895855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term9;
     Object term11;
     Object term55;
     Object term62;

    public ElitisticListPopulation_init_20165895855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new LinkedList();
        ((LinkedList) term1).add((Object)null);
        ((LinkedList) term1).add((Object)null);
        ((LinkedList) term1).add((Object)null);
        ((LinkedList) term1).add((Object)null);
        ((LinkedList) term1).add((Object)null);
        term9 = new Integer(568599855);
        term11 = new Double(0.13238746331190498);
        LinkedList term56 = new LinkedList();
        ((LinkedList) term56).add((Object)null);
        ((LinkedList) term56).add((Object)null);
        ((LinkedList) term56).add((Object)null);
        ((LinkedList) term56).add((Object)null);
        ((LinkedList) term56).add((Object)null);
        term55 = newInstance(Class.forName("org.apache.commons.math3.genetics.ElitisticListPopulation"));
        setDoubleField(term55, term55.getClass(), "elitismRate", 0.13238746331190498);
        setField(term55, term55.getClass(), "chromosomes", term56);
        setIntField(term55, term55.getClass(), "populationLimit", 568599855);
        term62 = new LinkedList();
        ((LinkedList) term62).add((Object)null);
        ((LinkedList) term62).add((Object)null);
        ((LinkedList) term62).add((Object)null);
        ((LinkedList) term62).add((Object)null);
        ((LinkedList) term62).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.genetics.ElitisticListPopulation");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = int.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term1;
        args[1] = term9;
        args[2] = term11;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term55));
        assertTrue(recursiveEquals(term1, term62));
        assertTrue(recursiveEquals(term9, 568599855));
        assertTrue(recursiveEquals(term11, 0.13238746331190498));
    }

};


