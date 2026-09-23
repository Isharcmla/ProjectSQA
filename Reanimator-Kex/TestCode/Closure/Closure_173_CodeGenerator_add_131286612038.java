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

public class CodeGenerator_add_131286612038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5438;

    public CodeGenerator_add_131286612038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5439 = new HashMap();
        Class<? extends Object> term26738 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term26737 = ((Class) term26738).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term26737).setAccessible(true);
        Object enum75 = ((Field) term26737).get((Object) null);
        term5438 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term5438, term5438.getClass(), "escapedJsStrings", term5439);
        setField(term5438, term5438.getClass(), "cc", null);
        setField(term5438, term5438.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term5438, term5438.getClass(), "preferSingleQuotes", false);
        setBooleanField(term5438, term5438.getClass(), "trustedStrings", true);
        setField(term5438, term5438.getClass(), "languageMode", enum75);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RkybSrpybU";
        try {
            callMethod(klass, "add", argTypes, term5438, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


