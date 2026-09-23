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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386549;
     Object term386641;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term386549 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term386641 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term386733 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term386839 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term386931 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term387019 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setIntField(term386641, term386641.getClass(), "type", 45);
        setIntField(term386733, term386733.getClass(), "type", 0);
        setField(term386733, term386733.getClass(), "jsType", term386839);
        setField(term386641, term386641.getClass(), "first", term386733);
        setIntField(term386931, term386931.getClass(), "type", 45);
        setField(term386931, term386931.getClass(), "jsType", term387019);
        setField(term386641, term386641.getClass(), "last", term386931);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term386641;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term386549, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


