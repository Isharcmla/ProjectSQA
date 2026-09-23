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
import java.lang.Integer;

public class ArrayUtils_indexOf_784697973249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term851;
     Object term853;
     Object term855;
     Object term13362;

    public ArrayUtils_indexOf_784697973249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term851 = (double[]) newDoubleArray(1);
        setDoubleElement(term851, 0, 0.11493000848982304);
        term853 = new Double(0.37161417339133307);
        term855 = new Integer(1551099402);
        term13362 = (double[]) newDoubleArray(1);
        setDoubleElement(term13362, 0, 0.11493000848982304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term851;
        args[1] = term853;
        args[2] = term855;
        Object retValue = callMethod(klass, "indexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term851, term13362));
        assertTrue(recursiveEquals(term853, 0.37161417339133307));
        assertTrue(recursiveEquals(term855, 1551099402));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


