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

public class CodeGenerator_regexpEscape_59516333059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7462;

    public CodeGenerator_regexpEscape_59516333059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7463 = new HashMap();
        term7462 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term7462, term7462.getClass(), "ESCAPED_JS_STRINGS", term7463);
        setField(term7462, term7462.getClass(), "cc", null);
        setField(term7462, term7462.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term7462, term7462.getClass(), "preferSingleQuotes", false);
        setBooleanField(term7462, term7462.getClass(), "trustedStrings", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TJmVBGfTML";
        callMethod(klass, "regexpEscape", argTypes, term7462, args);
    }

};


