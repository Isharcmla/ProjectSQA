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
import java.lang.Byte;
import java.lang.Integer;

public class ArrayUtils_indexOf_1337670549245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term804;
     Object term805;
     Object term807;
     Object term13250;

    public ArrayUtils_indexOf_1337670549245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term804 = (byte[]) newByteArray(0);
        term805 = new Byte((byte) -112);
        term807 = new Integer(1265463001);
        term13250 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = byte.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term804;
        args[1] = term805;
        args[2] = term807;
        Object retValue = callMethod(klass, "indexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term804, term13250));
        assertTrue(recursiveEquals(term805, (byte) -112));
        assertTrue(recursiveEquals(term807, 1265463001));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


