package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;
import java.lang.Object;
import java.lang.Double;

public class ArrayUtils_toPrimitive_249581969285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1252;
     Object term1257;
     Object term14552;
     Object term14543;

    public ArrayUtils_toPrimitive_249581969285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term1253 = new Double(0.5523635872663106);
        Double term1255 = new Double(0.544608645520025);
        term1252 = (Object[]) newArray("java.lang.Double", 2);
        setElement(term1252, 0, term1253);
        setElement(term1252, 1, term1255);
        term1257 = new Double(0.36226058076369927);
        Double term14553 = new Double(0.5523635872663106);
        Double term14554 = new Double(0.544608645520025);
        term14552 = (Object[]) newArray("java.lang.Double", 2);
        setElement(term14552, 0, term14553);
        setElement(term14552, 1, term14554);
        term14543 = (double[]) newDoubleArray(2);
        setDoubleElement(term14543, 0, 0.5523635872663106);
        setDoubleElement(term14543, 1, 0.544608645520025);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Double"), 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term1252;
        args[1] = term1257;
        Object retValue = callMethod(klass, "toPrimitive", argTypes, null, args);
        assertTrue(recursiveEquals(term1252, term14552));
        assertTrue(recursiveEquals(term1257, 0.36226058076369927));
        assertTrue(recursiveEquals(retValue, term14543));
    }

};


