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
     Object term7682;
     Object enum19;

    public CodeGenerator_getContextForNonEmptyExpression_102680009630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7683 = new HashMap();
        term7682 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term7682, term7682.getClass(), "ESCAPED_JS_STRINGS", term7683);
        setField(term7682, term7682.getClass(), "cc", null);
        setField(term7682, term7682.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term7682, term7682.getClass(), "preferSingleQuotes", true);
        setBooleanField(term7682, term7682.getClass(), "trustedStrings", true);
        Class<? extends Object> term7705 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term7704 = ((Class) term7705).getDeclaredField((String) "OTHER");
        ((Field) term7704).setAccessible(true);
        enum19 = ((Field) term7704).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[1];
        args[0] = enum19;
        callMethod(klass, "getContextForNonEmptyExpression", argTypes, term7682, args);
    }

};


