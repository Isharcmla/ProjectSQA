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

public class CodeGenerator_addIdentifier_153439729539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45;

    public CodeGenerator_addIdentifier_153439729539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term46 = new HashMap();
        term45 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term45, term45.getClass(), "ESCAPED_JS_STRINGS", term46);
        setField(term45, term45.getClass(), "cc", null);
        setField(term45, term45.getClass(), "outputCharsetEncoder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MjGYSRKTNF";
        try {
            callMethod(klass, "addIdentifier", argTypes, term45, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


