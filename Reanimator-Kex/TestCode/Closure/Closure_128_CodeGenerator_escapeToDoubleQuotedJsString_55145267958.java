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

public class CodeGenerator_escapeToDoubleQuotedJsString_55145267958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7427;

    public CodeGenerator_escapeToDoubleQuotedJsString_55145267958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7428 = new HashMap();
        term7427 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term7427, term7427.getClass(), "ESCAPED_JS_STRINGS", term7428);
        setField(term7427, term7427.getClass(), "cc", null);
        setField(term7427, term7427.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term7427, term7427.getClass(), "preferSingleQuotes", false);
        setBooleanField(term7427, term7427.getClass(), "trustedStrings", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fhkbdRViHi";
        callMethod(klass, "escapeToDoubleQuotedJsString", argTypes, term7427, args);
    }

};


