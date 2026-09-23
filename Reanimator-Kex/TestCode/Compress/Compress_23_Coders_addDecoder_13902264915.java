package org.apache.commons.compress.archivers.sevenz;

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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Coders_addDecoder_13902264915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20153;

    public Coders_addDecoder_13902264915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20153 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coder"));
        byte[] term19976 = (byte[]) newByteArray(0);
        setField(term20153, term20153.getClass(), "decompressionMethodId", term19976);
        Class<? extends Object> term21132 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term21131 = ((Class) term21132).getDeclaredField((String) "AES256SHA256");
        ((Field) term21131).setAccessible(true);
        Object enum33 = ((Field) term21131).get((Object) null);
        Object[] term20040 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term20277 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term20559 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term20277, term20277.getClass(), "method", enum33);
        setElement(term20040, 0, term20277);
        setElement(term20040, 1, term20559);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term20040);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.Coder");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term20153;
        args[2] = null;
        try {
            callMethod(klass, "addDecoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


