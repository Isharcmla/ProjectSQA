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

public class TypeCheck_check_233062943309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136080;
     Object term136304;

    public TypeCheck_check_233062943309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136080 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term136160 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term136234 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term136080, term136080.getClass(), "compiler", term136160);
        setField(term136080, term136080.getClass(), "scopeCreator", null);
        setBooleanField(term136080, term136080.getClass(), "inExterns", false);
        setField(term136234, term136234.getClass(), "parent", null);
        setField(term136080, term136080.getClass(), "topScope", term136234);
        term136304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136444 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term136304, term136304.getClass(), "type", 0);
        setField(term136374, term136374.getClass(), "next", term136444);
        setIntField(term136374, term136374.getClass(), "type", 148);
        setField(term136374, term136374.getClass(), "first", null);
        setField(term136304, term136304.getClass(), "first", term136374);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term136304;
        args[1] = true;
        callMethod(klass, "check", argTypes, term136080, args);
    }

};


