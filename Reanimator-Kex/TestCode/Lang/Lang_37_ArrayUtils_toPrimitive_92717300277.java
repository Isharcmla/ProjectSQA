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

public class ArrayUtils_toPrimitive_92717300277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1207;
     Object term1210;
     Object term14386;
     Object term14380;

    public ArrayUtils_toPrimitive_92717300277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Short term1208 = new Short((short) -19694);
        term1207 = (Object[]) newArray("java.lang.Short", 1);
        setElement(term1207, 0, term1208);
        term1210 = new Short((short) 3492);
        Short term14387 = new Short((short) -19694);
        term14386 = (Object[]) newArray("java.lang.Short", 1);
        setElement(term14386, 0, term14387);
        term14380 = (short[]) newShortArray(1);
        setShortElement(term14380, 0, (short) -19694);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Short"), 0).getClass();
        argTypes[1] = short.class;
        Object[] args = new Object[2];
        args[0] = term1207;
        args[1] = term1210;
        Object retValue = callMethod(klass, "toPrimitive", argTypes, null, args);
        assertTrue(recursiveEquals(term1207, term14386));
        assertTrue(recursiveEquals(term1210, (short) 3492));
        assertTrue(recursiveEquals(retValue, term14380));
    }

};


