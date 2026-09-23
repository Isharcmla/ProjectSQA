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
import java.lang.Integer;

public class ArrayUtils_toPrimitive_1058848284273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1169;
     Object term14268;
     Object term14254;

    public ArrayUtils_toPrimitive_1058848284273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1170 = new Integer(568599855);
        Integer term1172 = new Integer(1162663216);
        Integer term1174 = new Integer(1484323161);
        Integer term1176 = new Integer(391863371);
        term1169 = (Object[]) newArray("java.lang.Integer", 4);
        setElement(term1169, 0, term1170);
        setElement(term1169, 1, term1172);
        setElement(term1169, 2, term1174);
        setElement(term1169, 3, term1176);
        Integer term14269 = new Integer(568599855);
        Integer term14270 = new Integer(1162663216);
        Integer term14271 = new Integer(1484323161);
        Integer term14272 = new Integer(391863371);
        term14268 = (Object[]) newArray("java.lang.Integer", 4);
        setElement(term14268, 0, term14269);
        setElement(term14268, 1, term14270);
        setElement(term14268, 2, term14271);
        setElement(term14268, 3, term14272);
        term14254 = (int[]) newIntArray(4);
        setIntElement(term14254, 0, 568599855);
        setIntElement(term14254, 1, 1162663216);
        setIntElement(term14254, 2, 1484323161);
        setIntElement(term14254, 3, 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Integer"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1169;
        Object retValue = callMethod(klass, "toPrimitive", argTypes, null, args);
        assertTrue(recursiveEquals(term1169, term14268));
        assertTrue(recursiveEquals(retValue, term14254));
    }

};


