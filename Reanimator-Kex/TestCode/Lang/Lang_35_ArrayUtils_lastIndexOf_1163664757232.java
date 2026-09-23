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

public class ArrayUtils_lastIndexOf_1163664757232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term613;
     Object term616;
     Object term618;
     Object term12800;

    public ArrayUtils_lastIndexOf_1163664757232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term613 = (int[]) newIntArray(2);
        setIntElement(term613, 0, 292681826);
        setIntElement(term613, 1, 458147407);
        term616 = new Integer(-184153539);
        term618 = new Integer(493620644);
        term12800 = (int[]) newIntArray(2);
        setIntElement(term12800, 0, 292681826);
        setIntElement(term12800, 1, 458147407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term613;
        args[1] = term616;
        args[2] = term618;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term613, term12800));
        assertTrue(recursiveEquals(term616, -184153539));
        assertTrue(recursiveEquals(term618, 493620644));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


