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
import java.lang.Double;

public class ArrayUtils_indexOf_1865623113247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term833;
     Object term838;
     Object term13323;

    public ArrayUtils_indexOf_1865623113247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term833 = (double[]) newDoubleArray(4);
        setDoubleElement(term833, 0, 0.8598297828918529);
        setDoubleElement(term833, 1, 0.43692187681405226);
        setDoubleElement(term833, 2, 0.7633268466829064);
        setDoubleElement(term833, 3, 0.13481025392611334);
        term838 = new Double(0.3800088629986428);
        term13323 = (double[]) newDoubleArray(4);
        setDoubleElement(term13323, 0, 0.8598297828918529);
        setDoubleElement(term13323, 1, 0.43692187681405226);
        setDoubleElement(term13323, 2, 0.7633268466829064);
        setDoubleElement(term13323, 3, 0.13481025392611334);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term833;
        args[1] = term838;
        Object retValue = callMethod(klass, "indexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term833, term13323));
        assertTrue(recursiveEquals(term838, 0.3800088629986428));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


