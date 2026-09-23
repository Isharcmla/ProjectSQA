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
import java.lang.Object;

public class TypeCheck_check_233062943296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130214;
     Object term130456;

    public TypeCheck_check_233062943296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130214 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term130312 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term130386 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term130214, term130214.getClass(), "compiler", null);
        setField(term130214, term130214.getClass(), "scopeCreator", term130312);
        setBooleanField(term130214, term130214.getClass(), "inExterns", false);
        setField(term130386, term130386.getClass(), "parent", null);
        setField(term130214, term130214.getClass(), "topScope", term130386);
        setIntField(term130214, term130214.getClass(), "noTypeCheckSection", -1);
        term130456 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term130526 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term130596 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term130456, term130456.getClass(), "type", 0);
        setField(term130526, term130526.getClass(), "next", term130596);
        setIntField(term130526, term130526.getClass(), "type", 57);
        setField(term130526, term130526.getClass(), "first", null);
        setField(term130456, term130456.getClass(), "first", term130526);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term130456;
        args[1] = true;
        callMethod(klass, "check", argTypes, term130214, args);
    }

};


