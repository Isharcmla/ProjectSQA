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
import java.lang.Short;

public class ArrayUtils_lastIndexOf_1161801843234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term666;
     Object term674;
     Object term12916;

    public ArrayUtils_lastIndexOf_1161801843234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term666 = (short[]) newShortArray(7);
        setShortElement(term666, 0, (short) -21181);
        setShortElement(term666, 1, (short) -21950);
        setShortElement(term666, 2, (short) 10887);
        setShortElement(term666, 3, (short) -7799);
        setShortElement(term666, 4, (short) -23481);
        setShortElement(term666, 5, (short) -9648);
        setShortElement(term666, 6, (short) -9686);
        term674 = new Short((short) 23624);
        term12916 = (short[]) newShortArray(7);
        setShortElement(term12916, 0, (short) -21181);
        setShortElement(term12916, 1, (short) -21950);
        setShortElement(term12916, 2, (short) 10887);
        setShortElement(term12916, 3, (short) -7799);
        setShortElement(term12916, 4, (short) -23481);
        setShortElement(term12916, 5, (short) -9648);
        setShortElement(term12916, 6, (short) -9686);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(short.class, 0).getClass();
        argTypes[1] = short.class;
        Object[] args = new Object[2];
        args[0] = term666;
        args[1] = term674;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term666, term12916));
        assertTrue(recursiveEquals(term674, (short) 23624));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


