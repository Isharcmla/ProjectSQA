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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;

public class CodeGenerator_regexpEscape_59516333059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14828;

    public CodeGenerator_regexpEscape_59516333059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14829 = new HashMap();
        Class<? extends Object> term38697 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term38696 = ((Class) term38697).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term38696).setAccessible(true);
        Object enum100 = ((Field) term38696).get((Object) null);
        term14828 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term14828, term14828.getClass(), "escapedJsStrings", term14829);
        setField(term14828, term14828.getClass(), "cc", null);
        setField(term14828, term14828.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term14828, term14828.getClass(), "preferSingleQuotes", true);
        setBooleanField(term14828, term14828.getClass(), "trustedStrings", false);
        setField(term14828, term14828.getClass(), "languageMode", enum100);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TJmVBGfTML";
        callMethod(klass, "regexpEscape", argTypes, term14828, args);
    }

};


