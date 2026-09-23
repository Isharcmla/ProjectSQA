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

public class ArrayRealVector_mapRintToSelf_1825237082152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214;
     Object term7083;
     Object term7081;

    public ArrayRealVector_mapRintToSelf_1825237082152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term214 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term215 = (double[]) newDoubleArray(0);
        setField(term214, term214.getClass(), "data", term215);
        term7083 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7084 = (double[]) newDoubleArray(0);
        setField(term7083, term7083.getClass(), "data", term7084);
        term7081 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7082 = (double[]) newDoubleArray(0);
        setField(term7081, term7081.getClass(), "data", term7082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapRintToSelf", argTypes, term214, args);
        assertTrue(recursiveEquals(term214, term7083));
        assertTrue(recursiveEquals(retValue, term7081));
    }

};


