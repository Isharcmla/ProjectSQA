package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeValidator_getReadableJSTypeName_850599436346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130060;
     Object term130130;

    public TypeValidator_getReadableJSTypeName_850599436346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130060 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term130130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term130200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term130308 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setIntField(term130130, term130130.getClass(), "type", 33);
        setField(term130200, term130200.getClass(), "jsType", term130308);
        setField(term130130, term130130.getClass(), "first", term130200);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term130130;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term130060, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


