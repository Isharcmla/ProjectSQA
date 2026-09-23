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

public class ArrayUtils_indexOf_1337424533233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term649;
     Object term656;
     Object term658;
     Object term12873;

    public ArrayUtils_indexOf_1337424533233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term649 = (short[]) newShortArray(6);
        setShortElement(term649, 0, (short) -9327);
        setShortElement(term649, 1, (short) 16151);
        setShortElement(term649, 2, (short) 2033);
        setShortElement(term649, 3, (short) 26404);
        setShortElement(term649, 4, (short) 374);
        setShortElement(term649, 5, (short) -406);
        term656 = new Short((short) 3170);
        term658 = new Integer(933028652);
        term12873 = (short[]) newShortArray(6);
        setShortElement(term12873, 0, (short) -9327);
        setShortElement(term12873, 1, (short) 16151);
        setShortElement(term12873, 2, (short) 2033);
        setShortElement(term12873, 3, (short) 26404);
        setShortElement(term12873, 4, (short) 374);
        setShortElement(term12873, 5, (short) -406);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(short.class, 0).getClass();
        argTypes[1] = short.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term649;
        args[1] = term656;
        args[2] = term658;
        Object retValue = callMethod(klass, "indexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term649, term12873));
        assertTrue(recursiveEquals(term656, (short) 3170));
        assertTrue(recursiveEquals(term658, 933028652));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


