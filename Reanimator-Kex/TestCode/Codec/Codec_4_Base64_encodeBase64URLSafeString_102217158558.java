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

public class Base64_encodeBase64URLSafeString_102217158558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1342;
     Object term7174;

    public Base64_encodeBase64URLSafeString_102217158558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1342 = (byte[]) newByteArray(6);
        setByteElement(term1342, 0, (byte) 45);
        setByteElement(term1342, 1, (byte) -39);
        setByteElement(term1342, 2, (byte) -20);
        setByteElement(term1342, 3, (byte) 10);
        setByteElement(term1342, 4, (byte) 77);
        setByteElement(term1342, 5, (byte) 14);
        term7174 = (byte[]) newByteArray(6);
        setByteElement(term7174, 0, (byte) 45);
        setByteElement(term7174, 1, (byte) -39);
        setByteElement(term7174, 2, (byte) -20);
        setByteElement(term7174, 3, (byte) 10);
        setByteElement(term7174, 4, (byte) 77);
        setByteElement(term7174, 5, (byte) 14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1342;
        Object retValue = callMethod(klass, "encodeBase64URLSafeString", argTypes, null, args);
        assertTrue(recursiveEquals(term1342, term7174));
        assertTrue(recursiveEquals(retValue, "LdnsCk0O"));
    }

};


