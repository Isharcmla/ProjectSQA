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

public class ArrayUtils_indexOf_1060270074250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term855;
     Object term857;
     Object term859;
     Object term13394;

    public ArrayUtils_indexOf_1060270074250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term855 = (double[]) newDoubleArray(1);
        setDoubleElement(term855, 0, 0.5840714198152577);
        term857 = new Double(0.7559240768573477);
        term859 = new Double(0.10667076642995188);
        term13394 = (double[]) newDoubleArray(1);
        setDoubleElement(term13394, 0, 0.5840714198152577);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term855;
        args[1] = term857;
        args[2] = term859;
        Object retValue = callMethod(klass, "indexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term855, term13394));
        assertTrue(recursiveEquals(term857, 0.7559240768573477));
        assertTrue(recursiveEquals(term859, 0.10667076642995188));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


