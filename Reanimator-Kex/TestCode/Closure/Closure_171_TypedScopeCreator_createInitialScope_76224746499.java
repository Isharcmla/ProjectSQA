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

public class TypedScopeCreator_createInitialScope_76224746499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41620;
     Object term41690;

    public TypedScopeCreator_createInitialScope_76224746499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41620 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term41620, term41620.getClass(), "compiler", null);
        setField(term41620, term41620.getClass(), "typeRegistry", null);
        term41690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41760 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41690, term41690.getClass(), "type", 0);
        setIntField(term41760, term41760.getClass(), "type", 132);
        setField(term41690, term41690.getClass(), "parent", term41760);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term41690;
        callMethod(klass, "createInitialScope", argTypes, term41620, args);
    }

};


