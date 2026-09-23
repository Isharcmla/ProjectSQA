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

public class CodeGenerator_regexpEscape_154229835357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7392;

    public CodeGenerator_regexpEscape_154229835357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7393 = new HashMap();
        term7392 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term7392, term7392.getClass(), "ESCAPED_JS_STRINGS", term7393);
        setField(term7392, term7392.getClass(), "cc", null);
        setField(term7392, term7392.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term7392, term7392.getClass(), "preferSingleQuotes", false);
        setBooleanField(term7392, term7392.getClass(), "trustedStrings", false);
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
        callMethod(klass, "regexpEscape", argTypes, term7392, args);
    }

};


