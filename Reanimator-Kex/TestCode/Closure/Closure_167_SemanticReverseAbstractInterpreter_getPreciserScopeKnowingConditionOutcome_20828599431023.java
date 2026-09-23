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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term488045;
     Object term488137;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term488045 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term488137 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term488229 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term488321 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term488419 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        Object term488511 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term488617 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setIntField(term488137, term488137.getClass(), "type", 111);
        setIntField(term488321, term488321.getClass(), "type", 111);
        setField(term488321, term488321.getClass(), "jsType", term488419);
        setField(term488229, term488229.getClass(), "first", term488321);
        setField(term488137, term488137.getClass(), "parent", term488229);
        setIntField(term488511, term488511.getClass(), "type", 111);
        setField(term488511, term488511.getClass(), "jsType", term488617);
        setField(term488137, term488137.getClass(), "first", term488511);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term488137;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term488045, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


