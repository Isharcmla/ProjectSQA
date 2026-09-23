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

public class TypedScopeCreator_createInitialScope_76224746491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56037;
     Object term56291;

    public TypedScopeCreator_createInitialScope_76224746491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56037 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term56117 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term56221 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term56037, term56037.getClass(), "compiler", term56117);
        setField(term56037, term56037.getClass(), "typeRegistry", term56221);
        term56291 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term56291, term56291.getClass(), "type", 118);
        setField(term56291, term56291.getClass(), "parent", null);
        setField(term56431, term56431.getClass(), "next", null);
        setIntField(term56431, term56431.getClass(), "type", 0);
        setField(term56431, term56431.getClass(), "first", null);
        setField(term56431, term56431.getClass(), "propListHead", null);
        setField(term56431, term56431.getClass(), "parent", term56431);
        setField(term56361, term56361.getClass(), "next", term56431);
        setIntField(term56361, term56361.getClass(), "type", 0);
        setField(term56361, term56361.getClass(), "first", null);
        setField(term56361, term56361.getClass(), "propListHead", null);
        setField(term56361, term56361.getClass(), "parent", null);
        setField(term56291, term56291.getClass(), "first", term56361);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term56291;
        callMethod(klass, "createInitialScope", argTypes, term56037, args);
    }

};


