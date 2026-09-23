package org.apache.commons.math.linear;

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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.linear.EqualityUtils.*;

public class ArrayRealVector_mapAcosToSelf_216928785358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86526;
     Object term113839;
     Object term113836;

    public ArrayRealVector_mapAcosToSelf_216928785358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86526 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term86415 = (double[]) newDoubleArray(1);
        setField(term86526, term86526.getClass(), "data", term86415);
        term113839 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term113840 = (double[]) newDoubleArray(1);
        setDoubleElement(term113840, 0, 1.5707963267948966);
        setField(term113839, term113839.getClass(), "data", term113840);
        term113836 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term113837 = (double[]) newDoubleArray(1);
        setDoubleElement(term113837, 0, 1.5707963267948966);
        setField(term113836, term113836.getClass(), "data", term113837);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapAcosToSelf", argTypes, term86526, args);
        assertTrue(recursiveEquals(term86526, term113839));
        assertTrue(recursiveEquals(retValue, term113836));
    }

};


