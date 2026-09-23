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

public class CodeGenerator_regexpEscape_154229835357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14078;

    public CodeGenerator_regexpEscape_154229835357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14079 = new HashMap();
        Class<? extends Object> term38027 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term38026 = ((Class) term38027).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term38026).setAccessible(true);
        Object enum98 = ((Field) term38026).get((Object) null);
        term14078 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term14078, term14078.getClass(), "escapedJsStrings", term14079);
        setField(term14078, term14078.getClass(), "cc", null);
        setField(term14078, term14078.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term14078, term14078.getClass(), "preferSingleQuotes", true);
        setBooleanField(term14078, term14078.getClass(), "trustedStrings", false);
        setField(term14078, term14078.getClass(), "languageMode", enum98);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.nio.charset.CharsetEncoder");
        Object[] args = new Object[2];
        args[0] = "dEnhdmILtU";
        args[1] = null;
        callMethod(klass, "regexpEscape", argTypes, term14078, args);
    }

};


