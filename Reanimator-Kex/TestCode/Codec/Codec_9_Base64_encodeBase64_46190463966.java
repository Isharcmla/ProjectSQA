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

public class Base64_encodeBase64_46190463966 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1731;
     Object term1738;
     Object term1740;
     Object term9559;
     Object term9548;

    public Base64_encodeBase64_46190463966() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1731 = (byte[]) newByteArray(6);
        setByteElement(term1731, 0, (byte) -74);
        setByteElement(term1731, 1, (byte) -84);
        setByteElement(term1731, 2, (byte) -53);
        setByteElement(term1731, 3, (byte) -93);
        setByteElement(term1731, 4, (byte) 82);
        setByteElement(term1731, 5, (byte) -89);
        term1738 = new Boolean(true);
        term1740 = new Boolean(false);
        term9559 = (byte[]) newByteArray(6);
        setByteElement(term9559, 0, (byte) -74);
        setByteElement(term9559, 1, (byte) -84);
        setByteElement(term9559, 2, (byte) -53);
        setByteElement(term9559, 3, (byte) -93);
        setByteElement(term9559, 4, (byte) 82);
        setByteElement(term9559, 5, (byte) -89);
        term9548 = (byte[]) newByteArray(10);
        setByteElement(term9548, 0, (byte) 116);
        setByteElement(term9548, 1, (byte) 113);
        setByteElement(term9548, 2, (byte) 122);
        setByteElement(term9548, 3, (byte) 76);
        setByteElement(term9548, 4, (byte) 111);
        setByteElement(term9548, 5, (byte) 49);
        setByteElement(term9548, 6, (byte) 75);
        setByteElement(term9548, 7, (byte) 110);
        setByteElement(term9548, 8, (byte) 13);
        setByteElement(term9548, 9, (byte) 10);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term1731;
        args[1] = term1738;
        args[2] = term1740;
        Object retValue = callMethod(klass, "encodeBase64", argTypes, null, args);
        assertTrue(recursiveEquals(term1731, term9559));
        assertTrue(recursiveEquals(term1738, false));
        assertTrue(recursiveEquals(term1740, true));
        assertTrue(recursiveEquals(retValue, term9548));
    }

};


