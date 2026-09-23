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
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;

public class CodeGenerator_addIdentifier_153439729539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5810;

    public CodeGenerator_addIdentifier_153439729539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5811 = new HashMap();
        Class<? extends Object> term27351 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term27350 = ((Class) term27351).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term27350).setAccessible(true);
        Object enum76 = ((Field) term27350).get((Object) null);
        term5810 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term5810, term5810.getClass(), "escapedJsStrings", term5811);
        setField(term5810, term5810.getClass(), "cc", null);
        setField(term5810, term5810.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term5810, term5810.getClass(), "preferSingleQuotes", false);
        setBooleanField(term5810, term5810.getClass(), "trustedStrings", true);
        setField(term5810, term5810.getClass(), "languageMode", enum76);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BYqFIqCKAV";
        try {
            callMethod(klass, "addIdentifier", argTypes, term5810, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


