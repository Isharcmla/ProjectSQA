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

public class ArrayUtils_indexOf_1865623113249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term844;
     Object term849;
     Object term13369;

    public ArrayUtils_indexOf_1865623113249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term844 = (double[]) newDoubleArray(4);
        setDoubleElement(term844, 0, 0.8598297828918529);
        setDoubleElement(term844, 1, 0.43692187681405226);
        setDoubleElement(term844, 2, 0.7633268466829064);
        setDoubleElement(term844, 3, 0.13481025392611334);
        term849 = new Double(0.3800088629986428);
        term13369 = (double[]) newDoubleArray(4);
        setDoubleElement(term13369, 0, 0.8598297828918529);
        setDoubleElement(term13369, 1, 0.43692187681405226);
        setDoubleElement(term13369, 2, 0.7633268466829064);
        setDoubleElement(term13369, 3, 0.13481025392611334);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term844;
        args[1] = term849;
        Object retValue = callMethod(klass, "indexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term844, term13369));
        assertTrue(recursiveEquals(term849, 0.3800088629986428));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


