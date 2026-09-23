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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term389628;
     Object term389720;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term389628 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term389720 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term389812 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term389918 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term390010 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term390114 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setIntField(term389720, term389720.getClass(), "type", 45);
        setIntField(term389812, term389812.getClass(), "type", 0);
        setField(term389812, term389812.getClass(), "jsType", term389918);
        setField(term389720, term389720.getClass(), "first", term389812);
        setIntField(term390010, term390010.getClass(), "type", 0);
        setField(term390010, term390010.getClass(), "jsType", term390114);
        setField(term389720, term389720.getClass(), "last", term390010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term389720;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term389628, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


