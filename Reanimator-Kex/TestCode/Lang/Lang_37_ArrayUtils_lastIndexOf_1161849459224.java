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
import java.lang.Long;

public class ArrayUtils_lastIndexOf_1161849459224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term540;
     Object term545;
     Object term12596;

    public ArrayUtils_lastIndexOf_1161849459224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term540 = (long[]) newLongArray(4);
        setLongElement(term540, 0, 6855071767938501807L);
        setLongElement(term540, 1, -5892135042702373494L);
        setLongElement(term540, 2, 5262507301787091109L);
        setLongElement(term540, 3, -6823727938421990489L);
        term545 = new Long(-484994522244390100L);
        term12596 = (long[]) newLongArray(4);
        setLongElement(term12596, 0, 6855071767938501807L);
        setLongElement(term12596, 1, -5892135042702373494L);
        setLongElement(term12596, 2, 5262507301787091109L);
        setLongElement(term12596, 3, -6823727938421990489L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term540;
        args[1] = term545;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term540, term12596));
        assertTrue(recursiveEquals(term545, -484994522244390100L));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


