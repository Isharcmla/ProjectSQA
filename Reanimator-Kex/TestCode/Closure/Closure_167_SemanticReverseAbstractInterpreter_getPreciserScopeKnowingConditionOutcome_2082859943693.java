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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200959;
     Object term201051;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200959 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term201051 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term201143 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term201241 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term201333 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term201443 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setIntField(term201051, term201051.getClass(), "type", 45);
        setIntField(term201143, term201143.getClass(), "type", 0);
        setField(term201143, term201143.getClass(), "jsType", term201241);
        setField(term201051, term201051.getClass(), "first", term201143);
        setIntField(term201333, term201333.getClass(), "type", 45);
        setField(term201333, term201333.getClass(), "jsType", term201443);
        setField(term201051, term201051.getClass(), "last", term201333);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term201051;
        args[1] = null;
        args[2] = false;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term200959, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


