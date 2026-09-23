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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261062;
     Object term261154;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term261062 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term261154 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term261246 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term261338 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term261432 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term261524 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term261154, term261154.getClass(), "type", 111);
        setIntField(term261338, term261338.getClass(), "type", 0);
        setField(term261338, term261338.getClass(), "jsType", term261432);
        setField(term261246, term261246.getClass(), "first", term261338);
        setField(term261154, term261154.getClass(), "parent", term261246);
        setIntField(term261524, term261524.getClass(), "type", 0);
        setField(term261524, term261524.getClass(), "jsType", term261432);
        setField(term261154, term261154.getClass(), "first", term261524);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term261154;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term261062, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


