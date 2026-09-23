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

public class TypeCheck_init_987152372106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63381;

    public TypeCheck_init_987152372106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term63209 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term63301 = newInstance(Class.forName("com.google.javascript.jscomp.InferJSDocInfo"));
        setBooleanField(term63209, term63209.getClass(), "reportMissingProperties", false);
        setField(term63209, term63209.getClass(), "inferJSDocInfo", term63301);
        setIntField(term63209, term63209.getClass(), "typedCount", 0);
        setIntField(term63209, term63209.getClass(), "nullCount", 0);
        setIntField(term63209, term63209.getClass(), "unknownCount", 0);
        setIntField(term63209, term63209.getClass(), "noTypeCheckSection", 0);
        setField(term63209, term63209.getClass(), "compiler", null);
        term63381 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
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
        args[0] = term63381;
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


