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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term429666;
     Object term429758;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term429666 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term429758 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term429850 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term429942 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term430040 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        Object term430132 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term430224 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setIntField(term429758, term429758.getClass(), "type", 111);
        setIntField(term429942, term429942.getClass(), "type", 0);
        setField(term429942, term429942.getClass(), "jsType", term430040);
        setField(term429850, term429850.getClass(), "first", term429942);
        setField(term429758, term429758.getClass(), "parent", term429850);
        setIntField(term430132, term430132.getClass(), "type", 0);
        setField(term430132, term430132.getClass(), "jsType", term430224);
        setField(term429758, term429758.getClass(), "first", term430132);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term429758;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term429666, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


