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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148008;
     Object term148100;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148008 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term148100 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term148192 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term148284 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term148378 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term148470 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term148100, term148100.getClass(), "type", 111);
        setIntField(term148284, term148284.getClass(), "type", 0);
        setField(term148284, term148284.getClass(), "jsType", term148378);
        setField(term148192, term148192.getClass(), "first", term148284);
        setField(term148100, term148100.getClass(), "parent", term148192);
        setIntField(term148470, term148470.getClass(), "type", 0);
        setField(term148470, term148470.getClass(), "jsType", term148378);
        setField(term148100, term148100.getClass(), "first", term148470);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term148100;
        args[1] = null;
        args[2] = false;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term148008, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


