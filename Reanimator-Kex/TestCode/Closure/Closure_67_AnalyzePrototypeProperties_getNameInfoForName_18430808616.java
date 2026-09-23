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
import java.lang.String;
import java.lang.Object;

public class AnalyzePrototypeProperties_getNameInfoForName_18430808616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11900;
     Object enum23;

    public AnalyzePrototypeProperties_getNameInfoForName_18430808616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19432 = Class.forName((String) "com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType");
        Field term19431 = ((Class) term19432).getDeclaredField((String) "PROPERTY");
        ((Field) term19431).setAccessible(true);
        Object enum22 = ((Field) term19431).get((Object) null);
        term11900 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        setField(term11900, term11900.getClass(), "PROPERTY", enum22);
        Class<? extends Object> term19793 = Class.forName((String) "com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType");
        Field term19792 = ((Class) term19793).getDeclaredField((String) "VAR");
        ((Field) term19792).setAccessible(true);
        enum23 = ((Field) term19792).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = enum23;
        try {
            callMethod(klass, "getNameInfoForName", argTypes, term11900, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


