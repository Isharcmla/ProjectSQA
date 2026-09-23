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

public class TypeCheck_check_233062943124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67222;
     Object term67446;

    public TypeCheck_check_233062943124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67222 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term67302 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term67376 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term67222, term67222.getClass(), "compiler", term67302);
        setField(term67222, term67222.getClass(), "scopeCreator", null);
        setBooleanField(term67222, term67222.getClass(), "inExterns", false);
        setField(term67376, term67376.getClass(), "parent", null);
        setField(term67222, term67222.getClass(), "topScope", term67376);
        term67446 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term67446, term67446.getClass(), "type", 0);
        setField(term67516, term67516.getClass(), "next", term67586);
        setIntField(term67516, term67516.getClass(), "type", 12);
        setField(term67516, term67516.getClass(), "first", null);
        setField(term67446, term67446.getClass(), "first", term67516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term67446;
        args[1] = true;
        try {
            callMethod(klass, "check", argTypes, term67222, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


