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
import java.lang.Integer;

public class ArrayUtils_indexOf_1337424533235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term660;
     Object term667;
     Object term669;
     Object term12919;

    public ArrayUtils_indexOf_1337424533235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term660 = (short[]) newShortArray(6);
        setShortElement(term660, 0, (short) -9327);
        setShortElement(term660, 1, (short) 16151);
        setShortElement(term660, 2, (short) 2033);
        setShortElement(term660, 3, (short) 26404);
        setShortElement(term660, 4, (short) 374);
        setShortElement(term660, 5, (short) -406);
        term667 = new Short((short) 3170);
        term669 = new Integer(933028652);
        term12919 = (short[]) newShortArray(6);
        setShortElement(term12919, 0, (short) -9327);
        setShortElement(term12919, 1, (short) 16151);
        setShortElement(term12919, 2, (short) 2033);
        setShortElement(term12919, 3, (short) 26404);
        setShortElement(term12919, 4, (short) 374);
        setShortElement(term12919, 5, (short) -406);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(short.class, 0).getClass();
        argTypes[1] = short.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term660;
        args[1] = term667;
        args[2] = term669;
        Object retValue = callMethod(klass, "indexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term660, term12919));
        assertTrue(recursiveEquals(term667, (short) 3170));
        assertTrue(recursiveEquals(term669, 933028652));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


