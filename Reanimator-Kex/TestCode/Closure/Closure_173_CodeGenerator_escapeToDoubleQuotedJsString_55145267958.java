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

public class CodeGenerator_escapeToDoubleQuotedJsString_55145267958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14453;

    public CodeGenerator_escapeToDoubleQuotedJsString_55145267958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14454 = new HashMap();
        Class<? extends Object> term38362 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term38361 = ((Class) term38362).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term38361).setAccessible(true);
        Object enum99 = ((Field) term38361).get((Object) null);
        term14453 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term14453, term14453.getClass(), "escapedJsStrings", term14454);
        setField(term14453, term14453.getClass(), "cc", null);
        setField(term14453, term14453.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term14453, term14453.getClass(), "preferSingleQuotes", false);
        setBooleanField(term14453, term14453.getClass(), "trustedStrings", true);
        setField(term14453, term14453.getClass(), "languageMode", enum99);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fhkbdRViHi";
        callMethod(klass, "escapeToDoubleQuotedJsString", argTypes, term14453, args);
    }

};


