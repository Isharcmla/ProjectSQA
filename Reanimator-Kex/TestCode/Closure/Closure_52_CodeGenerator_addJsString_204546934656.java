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

public class CodeGenerator_addJsString_204546934656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2270;

    public CodeGenerator_addJsString_204546934656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2271 = new HashMap();
        term2270 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term2270, term2270.getClass(), "ESCAPED_JS_STRINGS", term2271);
        setField(term2270, term2270.getClass(), "cc", null);
        setField(term2270, term2270.getClass(), "outputCharsetEncoder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wSQxaModmm";
        try {
            callMethod(klass, "addJsString", argTypes, term2270, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


