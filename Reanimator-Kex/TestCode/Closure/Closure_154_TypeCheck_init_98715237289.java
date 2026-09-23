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

public class TypeCheck_init_98715237289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25132;

    public TypeCheck_init_98715237289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term24960 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term25052 = newInstance(Class.forName("com.google.javascript.jscomp.InferJSDocInfo"));
        setBooleanField(term24960, term24960.getClass(), "reportMissingProperties", false);
        setField(term24960, term24960.getClass(), "inferJSDocInfo", term25052);
        setIntField(term24960, term24960.getClass(), "typedCount", 0);
        setIntField(term24960, term24960.getClass(), "nullCount", 0);
        setIntField(term24960, term24960.getClass(), "unknownCount", 0);
        setIntField(term24960, term24960.getClass(), "noTypeCheckSection", 0);
        setField(term24960, term24960.getClass(), "compiler", null);
        term25132 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.ReverseAbstractInterpreter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        argTypes[3] = Class.forName("com.google.javascript.jscomp.CheckLevel");
        argTypes[4] = Class.forName("com.google.javascript.jscomp.CheckLevel");
        Object[] args = new Object[5];
        args[0] = term25132;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


