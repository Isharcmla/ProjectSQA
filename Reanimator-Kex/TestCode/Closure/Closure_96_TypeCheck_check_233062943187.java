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

public class TypeCheck_check_233062943187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89526;
     Object term89750;

    public TypeCheck_check_233062943187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89526 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term89606 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term89680 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term89526, term89526.getClass(), "compiler", term89606);
        setField(term89526, term89526.getClass(), "scopeCreator", null);
        setBooleanField(term89526, term89526.getClass(), "inExterns", false);
        setField(term89680, term89680.getClass(), "parent", null);
        setField(term89526, term89526.getClass(), "topScope", term89680);
        term89750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term89750, term89750.getClass(), "type", 0);
        setField(term89820, term89820.getClass(), "next", term89890);
        setIntField(term89820, term89820.getClass(), "type", 131);
        setField(term89820, term89820.getClass(), "first", null);
        setField(term89750, term89750.getClass(), "first", term89820);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term89750;
        args[1] = true;
        try {
            callMethod(klass, "check", argTypes, term89526, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


