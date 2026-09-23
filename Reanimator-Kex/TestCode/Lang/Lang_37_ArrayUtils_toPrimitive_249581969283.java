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

public class ArrayUtils_toPrimitive_249581969283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1241;
     Object term1246;
     Object term14506;
     Object term14497;

    public ArrayUtils_toPrimitive_249581969283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term1242 = new Double(0.5523635872663106);
        Double term1244 = new Double(0.544608645520025);
        term1241 = (Object[]) newArray("java.lang.Double", 2);
        setElement(term1241, 0, term1242);
        setElement(term1241, 1, term1244);
        term1246 = new Double(0.36226058076369927);
        Double term14507 = new Double(0.5523635872663106);
        Double term14508 = new Double(0.544608645520025);
        term14506 = (Object[]) newArray("java.lang.Double", 2);
        setElement(term14506, 0, term14507);
        setElement(term14506, 1, term14508);
        term14497 = (double[]) newDoubleArray(2);
        setDoubleElement(term14497, 0, 0.5523635872663106);
        setDoubleElement(term14497, 1, 0.544608645520025);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Double"), 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term1241;
        args[1] = term1246;
        Object retValue = callMethod(klass, "toPrimitive", argTypes, null, args);
        assertTrue(recursiveEquals(term1241, term14506));
        assertTrue(recursiveEquals(term1246, 0.36226058076369927));
        assertTrue(recursiveEquals(retValue, term14497));
    }

};


