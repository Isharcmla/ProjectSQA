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
import java.lang.Integer;

public class ArrayUtils_indexOf_1335948437225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term540;
     Object term544;
     Object term546;
     Object term12610;

    public ArrayUtils_indexOf_1335948437225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term540 = (long[]) newLongArray(3);
        setLongElement(term540, 0, -7672528020740371001L);
        setLongElement(term540, 1, -4502405999831680926L);
        setLongElement(term540, 2, 1967728129628047933L);
        term544 = new Long(2120084523938730454L);
        term546 = new Integer(1962444399);
        term12610 = (long[]) newLongArray(3);
        setLongElement(term12610, 0, -7672528020740371001L);
        setLongElement(term12610, 1, -4502405999831680926L);
        setLongElement(term12610, 2, 1967728129628047933L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = long.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term540;
        args[1] = term544;
        args[2] = term546;
        Object retValue = callMethod(klass, "indexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term540, term12610));
        assertTrue(recursiveEquals(term544, 2120084523938730454L));
        assertTrue(recursiveEquals(term546, 1962444399));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


