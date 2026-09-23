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

public class TypedScopeCreator_createInitialScope_76224746456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21809;
     Object term21879;

    public TypedScopeCreator_createInitialScope_76224746456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21809 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term21809, term21809.getClass(), "compiler", null);
        setField(term21809, term21809.getClass(), "typeRegistry", null);
        term21879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21879, term21879.getClass(), "type", -133);
        setField(term21879, term21879.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term21879;
        callMethod(klass, "createInitialScope", argTypes, term21809, args);
    }

};


