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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279374;
     Object term279466;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term279374 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term279466 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term279558 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term279668 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term279760 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term279852 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        setIntField(term279466, term279466.getClass(), "type", 46);
        setIntField(term279558, term279558.getClass(), "type", 0);
        setField(term279558, term279558.getClass(), "jsType", term279668);
        setField(term279466, term279466.getClass(), "first", term279558);
        setIntField(term279760, term279760.getClass(), "type", 0);
        setField(term279760, term279760.getClass(), "jsType", term279852);
        setField(term279466, term279466.getClass(), "last", term279760);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term279466;
        args[1] = null;
        args[2] = false;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term279374, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


