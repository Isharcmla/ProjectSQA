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

public class CodeGenerator_tagAsStrict_120320403137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5054;

    public CodeGenerator_tagAsStrict_120320403137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5055 = new HashMap();
        Class<? extends Object> term26138 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term26137 = ((Class) term26138).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term26137).setAccessible(true);
        Object enum74 = ((Field) term26137).get((Object) null);
        term5054 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term5054, term5054.getClass(), "escapedJsStrings", term5055);
        setField(term5054, term5054.getClass(), "cc", null);
        setField(term5054, term5054.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term5054, term5054.getClass(), "preferSingleQuotes", true);
        setBooleanField(term5054, term5054.getClass(), "trustedStrings", false);
        setField(term5054, term5054.getClass(), "languageMode", enum74);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "tagAsStrict", argTypes, term5054, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


