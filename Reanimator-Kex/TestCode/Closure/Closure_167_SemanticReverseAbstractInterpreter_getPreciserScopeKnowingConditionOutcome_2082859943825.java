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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253182;
     Object term253274;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term253182 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term253274 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term253366 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term253476 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term253568 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term253666 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setIntField(term253274, term253274.getClass(), "type", 12);
        setIntField(term253366, term253366.getClass(), "type", 0);
        setField(term253366, term253366.getClass(), "jsType", term253476);
        setField(term253274, term253274.getClass(), "first", term253366);
        setIntField(term253568, term253568.getClass(), "type", 12);
        setField(term253568, term253568.getClass(), "jsType", term253666);
        setField(term253274, term253274.getClass(), "last", term253568);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term253274;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term253182, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


