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
import java.lang.Short;

public class ArrayUtils_toPrimitive_1503292586278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1209;
     Object term14412;
     Object term14398;

    public ArrayUtils_toPrimitive_1503292586278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Short term1210 = new Short((short) 9519);
        Short term1212 = new Short((short) -10960);
        Short term1214 = new Short((short) -1703);
        Short term1216 = new Short((short) 23627);
        term1209 = (Object[]) newArray("java.lang.Short", 4);
        setElement(term1209, 0, term1210);
        setElement(term1209, 1, term1212);
        setElement(term1209, 2, term1214);
        setElement(term1209, 3, term1216);
        Short term14413 = new Short((short) 9519);
        Short term14414 = new Short((short) -10960);
        Short term14415 = new Short((short) -1703);
        Short term14416 = new Short((short) 23627);
        term14412 = (Object[]) newArray("java.lang.Short", 4);
        setElement(term14412, 0, term14413);
        setElement(term14412, 1, term14414);
        setElement(term14412, 2, term14415);
        setElement(term14412, 3, term14416);
        term14398 = (short[]) newShortArray(4);
        setShortElement(term14398, 0, (short) 9519);
        setShortElement(term14398, 1, (short) -10960);
        setShortElement(term14398, 2, (short) -1703);
        setShortElement(term14398, 3, (short) 23627);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Short"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1209;
        Object retValue = callMethod(klass, "toPrimitive", argTypes, null, args);
        assertTrue(recursiveEquals(term1209, term14412));
        assertTrue(recursiveEquals(retValue, term14398));
    }

};


