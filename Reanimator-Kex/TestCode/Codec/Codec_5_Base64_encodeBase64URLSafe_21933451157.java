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

public class Base64_encodeBase64URLSafe_21933451157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1325;
     Object term7072;
     Object term7060;

    public Base64_encodeBase64URLSafe_21933451157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1325 = (byte[]) newByteArray(8);
        setByteElement(term1325, 0, (byte) -126);
        setByteElement(term1325, 1, (byte) -91);
        setByteElement(term1325, 2, (byte) -104);
        setByteElement(term1325, 3, (byte) -89);
        setByteElement(term1325, 4, (byte) 13);
        setByteElement(term1325, 5, (byte) 44);
        setByteElement(term1325, 6, (byte) -63);
        setByteElement(term1325, 7, (byte) 15);
        term7072 = (byte[]) newByteArray(8);
        setByteElement(term7072, 0, (byte) -126);
        setByteElement(term7072, 1, (byte) -91);
        setByteElement(term7072, 2, (byte) -104);
        setByteElement(term7072, 3, (byte) -89);
        setByteElement(term7072, 4, (byte) 13);
        setByteElement(term7072, 5, (byte) 44);
        setByteElement(term7072, 6, (byte) -63);
        setByteElement(term7072, 7, (byte) 15);
        term7060 = (byte[]) newByteArray(11);
        setByteElement(term7060, 0, (byte) 103);
        setByteElement(term7060, 1, (byte) 113);
        setByteElement(term7060, 2, (byte) 87);
        setByteElement(term7060, 3, (byte) 89);
        setByteElement(term7060, 4, (byte) 112);
        setByteElement(term7060, 5, (byte) 119);
        setByteElement(term7060, 6, (byte) 48);
        setByteElement(term7060, 7, (byte) 115);
        setByteElement(term7060, 8, (byte) 119);
        setByteElement(term7060, 9, (byte) 81);
        setByteElement(term7060, 10, (byte) 56);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1325;
        Object retValue = callMethod(klass, "encodeBase64URLSafe", argTypes, null, args);
        assertTrue(recursiveEquals(term1325, term7072));
        assertTrue(recursiveEquals(retValue, term7060));
    }

};


