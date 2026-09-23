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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278298;
     Object term278390;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278298 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term278390 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term278482 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term278580 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        Object term278672 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term278766 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setIntField(term278390, term278390.getClass(), "type", 45);
        setIntField(term278482, term278482.getClass(), "type", 34);
        setField(term278482, term278482.getClass(), "jsType", term278580);
        setField(term278390, term278390.getClass(), "first", term278482);
        setIntField(term278672, term278672.getClass(), "type", -8227);
        setField(term278672, term278672.getClass(), "jsType", term278766);
        setField(term278390, term278390.getClass(), "last", term278672);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term278390;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term278298, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


