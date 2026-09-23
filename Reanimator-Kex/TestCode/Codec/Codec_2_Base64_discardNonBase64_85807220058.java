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

public class Base64_discardNonBase64_85807220058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1710;
     Object term8149;
     Object term8142;

    public Base64_discardNonBase64_85807220058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1710 = (byte[]) newByteArray(5);
        setByteElement(term1710, 0, (byte) 123);
        setByteElement(term1710, 1, (byte) -101);
        setByteElement(term1710, 2, (byte) -102);
        setByteElement(term1710, 3, (byte) -95);
        setByteElement(term1710, 4, (byte) -2);
        term8149 = (byte[]) newByteArray(5);
        setByteElement(term8149, 0, (byte) 123);
        setByteElement(term8149, 1, (byte) -101);
        setByteElement(term8149, 2, (byte) -102);
        setByteElement(term8149, 3, (byte) -95);
        setByteElement(term8149, 4, (byte) -2);
        term8142 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1710;
        Object retValue = callMethod(klass, "discardNonBase64", argTypes, null, args);
        assertTrue(recursiveEquals(term1710, term8149));
        assertTrue(recursiveEquals(retValue, term8142));
    }

};


