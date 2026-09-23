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
import org.apache.commons.math3.exception.OutOfRangeException;
import static org.apache.commons.math3.genetics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ElitisticListPopulation_setElitismRate_73061554216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1273;

    public ElitisticListPopulation_setElitismRate_73061554216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1273 = newInstance(Class.forName("org.apache.commons.math3.genetics.ElitisticListPopulation"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.genetics.ElitisticListPopulation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 2.0000000000000004;
        try {
            callMethod(klass, "setElitismRate", argTypes, term1273, args);
            assertTrue(false);
        }
        catch (OutOfRangeException e) {
        }

    }

};


