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
import java.lang.ClassCastException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;

public class AnalyzePrototypeProperties_getNameInfoForName_18430808626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24295;
     Object enum21;

    public AnalyzePrototypeProperties_getNameInfoForName_18430808626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25779 = Class.forName((String) "com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType");
        Field term25778 = ((Class) term25779).getDeclaredField((String) "VAR");
        ((Field) term25778).setAccessible(true);
        enum21 = ((Field) term25778).get((Object) null);
        HashMap term24519 = new HashMap();
        ((HashMap) term24519).put("", "");
        term24295 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        setField(term24295, term24295.getClass(), "PROPERTY", enum21);
        setField(term24295, term24295.getClass(), "propertyNameInfo", term24519);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = enum21;
        try {
            callMethod(klass, "getNameInfoForName", argTypes, term24295, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


