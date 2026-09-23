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

public class TypedScopeCreator_createScope_265732215174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116679;
     Object term116829;
     Object term117227;

    public TypedScopeCreator_createScope_265732215174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116679 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term116759 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term116679, term116679.getClass(), "compiler", term116759);
        term116829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term117039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term117153 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term116829, term116829.getClass(), "jsType", null);
        setIntField(term116829, term116829.getClass(), "type", 0);
        setField(term117039, term117039.getClass(), "next", null);
        setIntField(term117039, term117039.getClass(), "type", 41);
        setField(term117039, term117039.getClass(), "first", null);
        setField(term116969, term116969.getClass(), "next", term117039);
        setIntField(term116969, term116969.getClass(), "type", 0);
        setField(term116969, term116969.getClass(), "first", null);
        setField(term116899, term116899.getClass(), "next", term116969);
        setIntField(term116899, term116899.getClass(), "type", 64);
        setField(term116899, term116899.getClass(), "first", null);
        setField(term116899, term116899.getClass(), "jsType", term117153);
        setField(term116829, term116829.getClass(), "first", term116899);
        term117227 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term117227, term117227.getClass(), "rootNode", null);
        setField(term117227, term117227.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term116829;
        args[1] = term117227;
        try {
            callMethod(klass, "createScope", argTypes, term116679, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


