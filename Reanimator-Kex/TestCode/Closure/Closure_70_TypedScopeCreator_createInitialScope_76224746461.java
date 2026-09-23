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

public class TypedScopeCreator_createInitialScope_76224746461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17628;
     Object term17802;

    public TypedScopeCreator_createInitialScope_76224746461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17628 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term17732 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term17628, term17628.getClass(), "compiler", null);
        setField(term17628, term17628.getClass(), "typeRegistry", term17732);
        term17802 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17802, term17802.getClass(), "type", 125);
        setField(term17872, term17872.getClass(), "next", null);
        setIntField(term17872, term17872.getClass(), "type", 0);
        setField(term17802, term17802.getClass(), "first", term17872);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term17802;
        callMethod(klass, "createInitialScope", argTypes, term17628, args);
    }

};


