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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypedScopeCreator_createInitialScope_76224746430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13636;
     Object term13890;

    public TypedScopeCreator_createInitialScope_76224746430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13636 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term13716 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term13820 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term13636, term13636.getClass(), "compiler", term13716);
        setField(term13636, term13636.getClass(), "typeRegistry", term13820);
        term13890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13890, term13890.getClass(), "type", 0);
        setField(term13960, term13960.getClass(), "next", term14030);
        setIntField(term13960, term13960.getClass(), "type", 105);
        setField(term13890, term13890.getClass(), "first", term13960);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term13890;
        try {
            callMethod(klass, "createInitialScope", argTypes, term13636, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


