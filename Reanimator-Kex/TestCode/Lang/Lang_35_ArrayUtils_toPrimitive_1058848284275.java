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

public class ArrayUtils_toPrimitive_1058848284275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1180;
     Object term14314;
     Object term14300;

    public ArrayUtils_toPrimitive_1058848284275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1181 = new Integer(568599855);
        Integer term1183 = new Integer(1162663216);
        Integer term1185 = new Integer(1484323161);
        Integer term1187 = new Integer(391863371);
        term1180 = (Object[]) newArray("java.lang.Integer", 4);
        setElement(term1180, 0, term1181);
        setElement(term1180, 1, term1183);
        setElement(term1180, 2, term1185);
        setElement(term1180, 3, term1187);
        Integer term14315 = new Integer(568599855);
        Integer term14316 = new Integer(1162663216);
        Integer term14317 = new Integer(1484323161);
        Integer term14318 = new Integer(391863371);
        term14314 = (Object[]) newArray("java.lang.Integer", 4);
        setElement(term14314, 0, term14315);
        setElement(term14314, 1, term14316);
        setElement(term14314, 2, term14317);
        setElement(term14314, 3, term14318);
        term14300 = (int[]) newIntArray(4);
        setIntElement(term14300, 0, 568599855);
        setIntElement(term14300, 1, 1162663216);
        setIntElement(term14300, 2, 1484323161);
        setIntElement(term14300, 3, 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Integer"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1180;
        Object retValue = callMethod(klass, "toPrimitive", argTypes, null, args);
        assertTrue(recursiveEquals(term1180, term14314));
        assertTrue(recursiveEquals(retValue, term14300));
    }

};


