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

public class ArrayUtils_lastIndexOf_1161801843236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term677;
     Object term685;
     Object term12962;

    public ArrayUtils_lastIndexOf_1161801843236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term677 = (short[]) newShortArray(7);
        setShortElement(term677, 0, (short) -21181);
        setShortElement(term677, 1, (short) -21950);
        setShortElement(term677, 2, (short) 10887);
        setShortElement(term677, 3, (short) -7799);
        setShortElement(term677, 4, (short) -23481);
        setShortElement(term677, 5, (short) -9648);
        setShortElement(term677, 6, (short) -9686);
        term685 = new Short((short) 23624);
        term12962 = (short[]) newShortArray(7);
        setShortElement(term12962, 0, (short) -21181);
        setShortElement(term12962, 1, (short) -21950);
        setShortElement(term12962, 2, (short) 10887);
        setShortElement(term12962, 3, (short) -7799);
        setShortElement(term12962, 4, (short) -23481);
        setShortElement(term12962, 5, (short) -9648);
        setShortElement(term12962, 6, (short) -9686);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(short.class, 0).getClass();
        argTypes[1] = short.class;
        Object[] args = new Object[2];
        args[0] = term677;
        args[1] = term685;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term677, term12962));
        assertTrue(recursiveEquals(term685, (short) 23624));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


