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

public class Base64_encodeBase64_46078026953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1652;
     Object term1662;
     Object term7586;
     Object term7573;

    public Base64_encodeBase64_46078026953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1652 = (byte[]) newByteArray(9);
        setByteElement(term1652, 0, (byte) 123);
        setByteElement(term1652, 1, (byte) -5);
        setByteElement(term1652, 2, (byte) 84);
        setByteElement(term1652, 3, (byte) -97);
        setByteElement(term1652, 4, (byte) -24);
        setByteElement(term1652, 5, (byte) 88);
        setByteElement(term1652, 6, (byte) 96);
        setByteElement(term1652, 7, (byte) 70);
        setByteElement(term1652, 8, (byte) 48);
        term1662 = new Boolean(false);
        term7586 = (byte[]) newByteArray(9);
        setByteElement(term7586, 0, (byte) 123);
        setByteElement(term7586, 1, (byte) -5);
        setByteElement(term7586, 2, (byte) 84);
        setByteElement(term7586, 3, (byte) -97);
        setByteElement(term7586, 4, (byte) -24);
        setByteElement(term7586, 5, (byte) 88);
        setByteElement(term7586, 6, (byte) 96);
        setByteElement(term7586, 7, (byte) 70);
        setByteElement(term7586, 8, (byte) 48);
        term7573 = (byte[]) newByteArray(12);
        setByteElement(term7573, 0, (byte) 101);
        setByteElement(term7573, 1, (byte) 47);
        setByteElement(term7573, 2, (byte) 116);
        setByteElement(term7573, 3, (byte) 85);
        setByteElement(term7573, 4, (byte) 110);
        setByteElement(term7573, 5, (byte) 43);
        setByteElement(term7573, 6, (byte) 104);
        setByteElement(term7573, 7, (byte) 89);
        setByteElement(term7573, 8, (byte) 89);
        setByteElement(term7573, 9, (byte) 69);
        setByteElement(term7573, 10, (byte) 89);
        setByteElement(term7573, 11, (byte) 119);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1652;
        args[1] = term1662;
        Object retValue = callMethod(klass, "encodeBase64", argTypes, null, args);
        assertTrue(recursiveEquals(term1652, term7586));
        assertTrue(recursiveEquals(term1662, false));
        assertTrue(recursiveEquals(retValue, term7573));
    }

};


