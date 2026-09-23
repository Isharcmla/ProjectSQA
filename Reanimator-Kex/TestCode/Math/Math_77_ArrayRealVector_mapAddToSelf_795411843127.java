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
import java.lang.Double;

public class ArrayRealVector_mapAddToSelf_795411843127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154;
     Object term156;
     Object term6954;
     Object term6951;

    public ArrayRealVector_mapAddToSelf_795411843127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term155 = (double[]) newDoubleArray(0);
        setField(term154, term154.getClass(), "data", term155);
        term156 = new Double(0.8878841294187743);
        term6954 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term6955 = (double[]) newDoubleArray(0);
        setField(term6954, term6954.getClass(), "data", term6955);
        term6951 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term6952 = (double[]) newDoubleArray(0);
        setField(term6951, term6951.getClass(), "data", term6952);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term156;
        Object retValue = callMethod(klass, "mapAddToSelf", argTypes, term154, args);
        assertTrue(recursiveEquals(term154, term6954));
        assertTrue(recursiveEquals(term156, 0.8878841294187743));
        assertTrue(recursiveEquals(retValue, term6951));
    }

};


