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
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;

public class CodeGenerator_getContextForNonEmptyExpression_102680009630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15728;
     Object enum43;

    public CodeGenerator_getContextForNonEmptyExpression_102680009630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term15729 = new HashMap();
        Class<? extends Object> term15766 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term15765 = ((Class) term15766).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term15765).setAccessible(true);
        Object enum42 = ((Field) term15765).get((Object) null);
        term15728 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term15728, term15728.getClass(), "escapedJsStrings", term15729);
        setField(term15728, term15728.getClass(), "cc", null);
        setField(term15728, term15728.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term15728, term15728.getClass(), "preferSingleQuotes", false);
        setBooleanField(term15728, term15728.getClass(), "trustedStrings", false);
        setField(term15728, term15728.getClass(), "languageMode", enum42);
        Class<? extends Object> term16091 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term16090 = ((Class) term16091).getDeclaredField((String) "OTHER");
        ((Field) term16090).setAccessible(true);
        enum43 = ((Field) term16090).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[1];
        args[0] = enum43;
        callMethod(klass, "getContextForNonEmptyExpression", argTypes, term15728, args);
    }

};


