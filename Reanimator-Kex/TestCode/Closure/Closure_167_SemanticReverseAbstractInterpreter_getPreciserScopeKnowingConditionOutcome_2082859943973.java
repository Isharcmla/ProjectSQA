package com.google.javascript.jscomp.type;

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
import static com.google.javascript.jscomp.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381254;
     Object term381346;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term381254 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term381346 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term381438 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term381530 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        Object term381622 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term381716 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setIntField(term381346, term381346.getClass(), "type", 45);
        setIntField(term381438, term381438.getClass(), "type", 0);
        setField(term381438, term381438.getClass(), "jsType", term381530);
        setField(term381346, term381346.getClass(), "first", term381438);
        setIntField(term381622, term381622.getClass(), "type", 45);
        setField(term381622, term381622.getClass(), "jsType", term381716);
        setField(term381346, term381346.getClass(), "last", term381622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term381346;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term381254, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


