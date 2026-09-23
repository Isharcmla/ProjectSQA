package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.math.EqualityUtils.*;
import java.lang.Byte;

public class NumberUtils_max_21954614499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term669;
     Object term671;
     Object term673;

    public NumberUtils_max_21954614499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term669 = new Byte((byte) -71);
        term671 = new Byte((byte) 49);
        term673 = new Byte((byte) -54);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = byte.class;
        argTypes[1] = byte.class;
        argTypes[2] = byte.class;
        Object[] args = new Object[3];
        args[0] = term669;
        args[1] = term671;
        args[2] = term673;
        Object retValue = callMethod(klass, "max", argTypes, null, args);
        assertTrue(recursiveEquals(term669, (byte) -71));
        assertTrue(recursiveEquals(term671, (byte) 49));
        assertTrue(recursiveEquals(term673, (byte) -54));
        assertTrue(recursiveEquals(retValue, (byte) 49));
    }

};


