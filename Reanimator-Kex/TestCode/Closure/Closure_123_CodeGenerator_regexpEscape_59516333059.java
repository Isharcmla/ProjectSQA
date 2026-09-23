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
     Object term14825;

    public CodeGenerator_regexpEscape_59516333059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14826 = new HashMap();
        Class<? extends Object> term38672 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term38671 = ((Class) term38672).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term38671).setAccessible(true);
        Object enum100 = ((Field) term38671).get((Object) null);
        term14825 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term14825, term14825.getClass(), "escapedJsStrings", term14826);
        setField(term14825, term14825.getClass(), "cc", null);
        setField(term14825, term14825.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term14825, term14825.getClass(), "preferSingleQuotes", false);
        setBooleanField(term14825, term14825.getClass(), "trustedStrings", true);
        setField(term14825, term14825.getClass(), "languageMode", enum100);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TJmVBGfTML";
        callMethod(klass, "regexpEscape", argTypes, term14825, args);
    }

};


