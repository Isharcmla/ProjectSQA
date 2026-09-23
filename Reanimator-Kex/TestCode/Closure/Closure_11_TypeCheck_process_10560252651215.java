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

public class TypeCheck_process_10560252651215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352129;
     Object term352457;

    public TypeCheck_process_10560252651215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term352129 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term352233 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term352307 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term352387 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term352129, term352129.getClass(), "scopeCreator", term352233);
        setField(term352307, term352307.getClass(), "parent", null);
        setField(term352129, term352129.getClass(), "topScope", term352307);
        setField(term352129, term352129.getClass(), "compiler", term352387);
        setBooleanField(term352129, term352129.getClass(), "inExterns", false);
        term352457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term352527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term352625 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term352457, term352457.getClass(), "parent", term352527);
        setIntField(term352457, term352457.getClass(), "type", 98);
        setField(term352457, term352457.getClass(), "first", null);
        setField(term352457, term352457.getClass(), "jsType", term352625);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term352457;
        try {
            callMethod(klass, "process", argTypes, term352129, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


