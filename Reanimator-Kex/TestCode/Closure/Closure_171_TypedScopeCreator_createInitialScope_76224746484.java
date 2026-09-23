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

public class TypedScopeCreator_createInitialScope_76224746484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34721;
     Object term34791;

    public TypedScopeCreator_createInitialScope_76224746484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34721 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term34721, term34721.getClass(), "compiler", null);
        setField(term34721, term34721.getClass(), "typeRegistry", null);
        term34791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34861 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34791, term34791.getClass(), "type", 0);
        setIntField(term34861, term34861.getClass(), "type", 0);
        setField(term34861, term34861.getClass(), "parent", null);
        setField(term34791, term34791.getClass(), "parent", term34861);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term34791;
        callMethod(klass, "createInitialScope", argTypes, term34721, args);
    }

};


