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
import java.lang.Integer;

public class ArrayUtils_subarray_114051781191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132;
     Object term134;
     Object term136;
     Object term11161;
     Object term11156;

    public ArrayUtils_subarray_114051781191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132 = (long[]) newLongArray(1);
        setLongElement(term132, 0, 5270370404989704783L);
        term134 = new Integer(-616727354);
        term136 = new Integer(-1955890973);
        term11161 = (long[]) newLongArray(1);
        setLongElement(term11161, 0, 5270370404989704783L);
        term11156 = (long[]) newLongArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term132;
        args[1] = term134;
        args[2] = term136;
        Object retValue = callMethod(klass, "subarray", argTypes, null, args);
        assertTrue(recursiveEquals(term132, term11161));
        assertTrue(recursiveEquals(term134, -616727354));
        assertTrue(recursiveEquals(term136, -1955890973));
        assertTrue(recursiveEquals(retValue, term11156));
    }

};


