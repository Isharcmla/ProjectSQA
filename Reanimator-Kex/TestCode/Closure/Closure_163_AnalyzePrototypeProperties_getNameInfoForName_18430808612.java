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

public class AnalyzePrototypeProperties_getNameInfoForName_18430808612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7129;
     Object enum13;

    public AnalyzePrototypeProperties_getNameInfoForName_18430808612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8439 = Class.forName((String) "com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType");
        Field term8438 = ((Class) term8439).getDeclaredField((String) "PROPERTY");
        ((Field) term8438).setAccessible(true);
        Object enum12 = ((Field) term8438).get((Object) null);
        term7129 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        setField(term7129, term7129.getClass(), "PROPERTY", enum12);
        Class<? extends Object> term8800 = Class.forName((String) "com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType");
        Field term8799 = ((Class) term8800).getDeclaredField((String) "VAR");
        ((Field) term8799).setAccessible(true);
        enum13 = ((Field) term8799).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = enum13;
        try {
            callMethod(klass, "getNameInfoForName", argTypes, term7129, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


