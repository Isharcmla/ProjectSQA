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

public class Base64_encodeBase64URLSafeString_102217158560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1199;
     Object term7152;

    public Base64_encodeBase64URLSafeString_102217158560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1199 = (byte[]) newByteArray(8);
        setByteElement(term1199, 0, (byte) -126);
        setByteElement(term1199, 1, (byte) -91);
        setByteElement(term1199, 2, (byte) -104);
        setByteElement(term1199, 3, (byte) -89);
        setByteElement(term1199, 4, (byte) 13);
        setByteElement(term1199, 5, (byte) 44);
        setByteElement(term1199, 6, (byte) -63);
        setByteElement(term1199, 7, (byte) 15);
        term7152 = (byte[]) newByteArray(8);
        setByteElement(term7152, 0, (byte) -126);
        setByteElement(term7152, 1, (byte) -91);
        setByteElement(term7152, 2, (byte) -104);
        setByteElement(term7152, 3, (byte) -89);
        setByteElement(term7152, 4, (byte) 13);
        setByteElement(term7152, 5, (byte) 44);
        setByteElement(term7152, 6, (byte) -63);
        setByteElement(term7152, 7, (byte) 15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1199;
        Object retValue = callMethod(klass, "encodeBase64URLSafeString", argTypes, null, args);
        assertTrue(recursiveEquals(term1199, term7152));
        assertTrue(recursiveEquals(retValue, "gqWYpw0swQ8"));
    }

};


