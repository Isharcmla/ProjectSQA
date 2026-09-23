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
import java.lang.Object;

public class TypeCheck_init_122880885488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26234;

    public TypeCheck_init_122880885488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term26062 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term26154 = newInstance(Class.forName("com.google.javascript.jscomp.InferJSDocInfo"));
        setBooleanField(term26062, term26062.getClass(), "reportMissingProperties", false);
        setField(term26062, term26062.getClass(), "inferJSDocInfo", term26154);
        setIntField(term26062, term26062.getClass(), "typedCount", 0);
        setIntField(term26062, term26062.getClass(), "nullCount", 0);
        setIntField(term26062, term26062.getClass(), "unknownCount", 0);
        setIntField(term26062, term26062.getClass(), "noTypeCheckSection", 0);
        setField(term26062, term26062.getClass(), "compiler", null);
        term26234 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.ReverseAbstractInterpreter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        argTypes[3] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[4] = Class.forName("com.google.javascript.jscomp.ScopeCreator");
        argTypes[5] = Class.forName("com.google.javascript.jscomp.CheckLevel");
        argTypes[6] = Class.forName("com.google.javascript.jscomp.CheckLevel");
        Object[] args = new Object[7];
        args[0] = term26234;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


