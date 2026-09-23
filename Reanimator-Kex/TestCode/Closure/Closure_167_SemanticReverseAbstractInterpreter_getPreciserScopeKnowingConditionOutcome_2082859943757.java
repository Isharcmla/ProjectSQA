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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225378;
     Object term225470;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term225378 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term225470 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term225562 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term225660 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term225752 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term225862 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setIntField(term225470, term225470.getClass(), "type", 45);
        setIntField(term225562, term225562.getClass(), "type", 34);
        setField(term225562, term225562.getClass(), "jsType", term225660);
        setField(term225470, term225470.getClass(), "first", term225562);
        setIntField(term225752, term225752.getClass(), "type", -8227);
        setField(term225752, term225752.getClass(), "jsType", term225862);
        setField(term225470, term225470.getClass(), "last", term225752);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term225470;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term225378, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


