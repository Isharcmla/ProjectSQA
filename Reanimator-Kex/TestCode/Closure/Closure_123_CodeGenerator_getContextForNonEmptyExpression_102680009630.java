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
     Object term15725;
     Object enum43;

    public CodeGenerator_getContextForNonEmptyExpression_102680009630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term15726 = new HashMap();
        Class<? extends Object> term15763 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term15762 = ((Class) term15763).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term15762).setAccessible(true);
        Object enum42 = ((Field) term15762).get((Object) null);
        term15725 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term15725, term15725.getClass(), "escapedJsStrings", term15726);
        setField(term15725, term15725.getClass(), "cc", null);
        setField(term15725, term15725.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term15725, term15725.getClass(), "preferSingleQuotes", false);
        setBooleanField(term15725, term15725.getClass(), "trustedStrings", true);
        setField(term15725, term15725.getClass(), "languageMode", enum42);
        Class<? extends Object> term16088 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term16087 = ((Class) term16088).getDeclaredField((String) "OTHER");
        ((Field) term16087).setAccessible(true);
        enum43 = ((Field) term16087).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[1];
        args[0] = enum43;
        callMethod(klass, "getContextForNonEmptyExpression", argTypes, term15725, args);
    }

};


