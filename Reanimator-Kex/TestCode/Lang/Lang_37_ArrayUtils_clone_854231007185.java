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

public class ArrayUtils_clone_854231007185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78;
     Object term10755;
     Object term10749;

    public ArrayUtils_clone_854231007185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78 = (double[]) newDoubleArray(2);
        setDoubleElement(term78, 0, 0.13238746331190498);
        setDoubleElement(term78, 1, 0.3455959125047594);
        term10755 = (double[]) newDoubleArray(2);
        setDoubleElement(term10755, 0, 0.13238746331190498);
        setDoubleElement(term10755, 1, 0.3455959125047594);
        term10749 = (double[]) newDoubleArray(2);
        setDoubleElement(term10749, 0, 0.13238746331190498);
        setDoubleElement(term10749, 1, 0.3455959125047594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term78;
        Object retValue = callMethod(klass, "clone", argTypes, null, args);
        assertTrue(recursiveEquals(term78, term10755));
        assertTrue(recursiveEquals(retValue, term10749));
    }

};


