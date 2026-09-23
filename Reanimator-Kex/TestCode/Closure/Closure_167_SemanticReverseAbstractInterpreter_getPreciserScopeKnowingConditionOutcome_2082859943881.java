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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277138;
     Object term277230;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277138 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term277230 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term277322 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term277436 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term277528 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term277620 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        setIntField(term277230, term277230.getClass(), "type", 46);
        setIntField(term277322, term277322.getClass(), "type", 34);
        setField(term277322, term277322.getClass(), "jsType", term277436);
        setField(term277230, term277230.getClass(), "first", term277322);
        setIntField(term277528, term277528.getClass(), "type", -8227);
        setField(term277528, term277528.getClass(), "jsType", term277620);
        setField(term277230, term277230.getClass(), "last", term277528);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term277230;
        args[1] = null;
        args[2] = false;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term277138, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


