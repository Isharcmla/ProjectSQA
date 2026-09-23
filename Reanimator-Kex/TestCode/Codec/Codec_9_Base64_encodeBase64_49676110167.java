package org.apache.commons.codec.binary;

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
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.binary.EqualityUtils.*;
import java.lang.Boolean;
import java.lang.Integer;

public class Base64_encodeBase64_49676110167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1748;
     Object term1754;
     Object term1756;
     Object term1758;
     Object term9862;
     Object term9852;

    public Base64_encodeBase64_49676110167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1748 = (byte[]) newByteArray(5);
        setByteElement(term1748, 0, (byte) 24);
        setByteElement(term1748, 1, (byte) 123);
        setByteElement(term1748, 2, (byte) -101);
        setByteElement(term1748, 3, (byte) -102);
        setByteElement(term1748, 4, (byte) -95);
        term1754 = new Boolean(false);
        term1756 = new Boolean(true);
        term1758 = new Integer(933028652);
        term9862 = (byte[]) newByteArray(5);
        setByteElement(term9862, 0, (byte) 24);
        setByteElement(term9862, 1, (byte) 123);
        setByteElement(term9862, 2, (byte) -101);
        setByteElement(term9862, 3, (byte) -102);
        setByteElement(term9862, 4, (byte) -95);
        term9852 = (byte[]) newByteArray(7);
        setByteElement(term9852, 0, (byte) 71);
        setByteElement(term9852, 1, (byte) 72);
        setByteElement(term9852, 2, (byte) 117);
        setByteElement(term9852, 3, (byte) 98);
        setByteElement(term9852, 4, (byte) 109);
        setByteElement(term9852, 5, (byte) 113);
        setByteElement(term9852, 6, (byte) 69);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term1748;
        args[1] = term1754;
        args[2] = term1756;
        args[3] = term1758;
        Object retValue = callMethod(klass, "encodeBase64", argTypes, null, args);
        assertTrue(recursiveEquals(term1748, term9862));
        assertTrue(recursiveEquals(term1754, true));
        assertTrue(recursiveEquals(term1756, false));
        assertTrue(recursiveEquals(term1758, 933028652));
        assertTrue(recursiveEquals(retValue, term9852));
    }

};


