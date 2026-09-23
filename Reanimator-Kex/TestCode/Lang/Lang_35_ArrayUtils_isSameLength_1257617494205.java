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

public class ArrayUtils_isSameLength_1257617494205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334;
     Object term337;
     Object term11808;
     Object term11809;

    public ArrayUtils_isSameLength_1257617494205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term334 = (double[]) newDoubleArray(2);
        setDoubleElement(term334, 0, 0.40176586625454525);
        setDoubleElement(term334, 1, 0.2641345529914265);
        term337 = (double[]) newDoubleArray(6);
        setDoubleElement(term337, 0, 0.36923381893433327);
        setDoubleElement(term337, 1, 0.6076495596892013);
        setDoubleElement(term337, 2, 0.37773193782763337);
        setDoubleElement(term337, 3, 0.8474802076607362);
        setDoubleElement(term337, 4, 0.5183269973490326);
        setDoubleElement(term337, 5, 0.7655020693602768);
        term11808 = (double[]) newDoubleArray(2);
        setDoubleElement(term11808, 0, 0.40176586625454525);
        setDoubleElement(term11808, 1, 0.2641345529914265);
        term11809 = (double[]) newDoubleArray(6);
        setDoubleElement(term11809, 0, 0.36923381893433327);
        setDoubleElement(term11809, 1, 0.6076495596892013);
        setDoubleElement(term11809, 2, 0.37773193782763337);
        setDoubleElement(term11809, 3, 0.8474802076607362);
        setDoubleElement(term11809, 4, 0.5183269973490326);
        setDoubleElement(term11809, 5, 0.7655020693602768);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term334;
        args[1] = term337;
        Object retValue = callMethod(klass, "isSameLength", argTypes, null, args);
        assertTrue(recursiveEquals(term334, term11808));
        assertTrue(recursiveEquals(term337, term11809));
        assertTrue(recursiveEquals(retValue, false));
    }

};


