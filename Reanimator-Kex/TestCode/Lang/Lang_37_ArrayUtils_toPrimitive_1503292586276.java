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

public class ArrayUtils_toPrimitive_1503292586276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1198;
     Object term14366;
     Object term14352;

    public ArrayUtils_toPrimitive_1503292586276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Short term1199 = new Short((short) 9519);
        Short term1201 = new Short((short) -10960);
        Short term1203 = new Short((short) -1703);
        Short term1205 = new Short((short) 23627);
        term1198 = (Object[]) newArray("java.lang.Short", 4);
        setElement(term1198, 0, term1199);
        setElement(term1198, 1, term1201);
        setElement(term1198, 2, term1203);
        setElement(term1198, 3, term1205);
        Short term14367 = new Short((short) 9519);
        Short term14368 = new Short((short) -10960);
        Short term14369 = new Short((short) -1703);
        Short term14370 = new Short((short) 23627);
        term14366 = (Object[]) newArray("java.lang.Short", 4);
        setElement(term14366, 0, term14367);
        setElement(term14366, 1, term14368);
        setElement(term14366, 2, term14369);
        setElement(term14366, 3, term14370);
        term14352 = (short[]) newShortArray(4);
        setShortElement(term14352, 0, (short) 9519);
        setShortElement(term14352, 1, (short) -10960);
        setShortElement(term14352, 2, (short) -1703);
        setShortElement(term14352, 3, (short) 23627);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Short"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1198;
        Object retValue = callMethod(klass, "toPrimitive", argTypes, null, args);
        assertTrue(recursiveEquals(term1198, term14366));
        assertTrue(recursiveEquals(retValue, term14352));
    }

};


