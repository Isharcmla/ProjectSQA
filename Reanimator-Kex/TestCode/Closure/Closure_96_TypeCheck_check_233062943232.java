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

public class TypeCheck_check_233062943232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104016;
     Object term104240;

    public TypeCheck_check_233062943232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104016 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term104096 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term104170 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term104016, term104016.getClass(), "compiler", term104096);
        setField(term104016, term104016.getClass(), "scopeCreator", null);
        setBooleanField(term104016, term104016.getClass(), "inExterns", false);
        setField(term104170, term104170.getClass(), "parent", null);
        setField(term104016, term104016.getClass(), "topScope", term104170);
        term104240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term104240, term104240.getClass(), "type", 0);
        setField(term104310, term104310.getClass(), "next", term104380);
        setIntField(term104310, term104310.getClass(), "type", 145);
        setField(term104310, term104310.getClass(), "first", null);
        setField(term104240, term104240.getClass(), "first", term104310);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term104240;
        args[1] = true;
        try {
            callMethod(klass, "check", argTypes, term104016, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


