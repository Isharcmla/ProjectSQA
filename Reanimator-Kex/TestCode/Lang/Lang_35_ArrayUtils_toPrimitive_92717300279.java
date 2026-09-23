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

public class ArrayUtils_toPrimitive_92717300279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1218;
     Object term1221;
     Object term14432;
     Object term14426;

    public ArrayUtils_toPrimitive_92717300279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Short term1219 = new Short((short) -19694);
        term1218 = (Object[]) newArray("java.lang.Short", 1);
        setElement(term1218, 0, term1219);
        term1221 = new Short((short) 3492);
        Short term14433 = new Short((short) -19694);
        term14432 = (Object[]) newArray("java.lang.Short", 1);
        setElement(term14432, 0, term14433);
        term14426 = (short[]) newShortArray(1);
        setShortElement(term14426, 0, (short) -19694);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Short"), 0).getClass();
        argTypes[1] = short.class;
        Object[] args = new Object[2];
        args[0] = term1218;
        args[1] = term1221;
        Object retValue = callMethod(klass, "toPrimitive", argTypes, null, args);
        assertTrue(recursiveEquals(term1218, term14432));
        assertTrue(recursiveEquals(term1221, (short) 3492));
        assertTrue(recursiveEquals(retValue, term14426));
    }

};


