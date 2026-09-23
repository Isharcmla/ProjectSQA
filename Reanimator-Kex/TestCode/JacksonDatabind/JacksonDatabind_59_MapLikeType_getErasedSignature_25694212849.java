package com.fasterxml.jackson.databind.type;

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
import static com.fasterxml.jackson.databind.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MapLikeType_getErasedSignature_25694212849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11;

    public MapLikeType_getErasedSignature_25694212849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term12 = (byte[]) newByteArray(16);
        setField(term11, term11.getClass(), "value", term12);
        setByteField(term11, term11.getClass(), "coder", (byte) 47);
        setIntField(term11, term11.getClass(), "count", 568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.MapLikeType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[1];
        args[0] = term11;
        try {
            callMethod(klass, "getErasedSignature", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


