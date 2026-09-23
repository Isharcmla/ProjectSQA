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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72111;
     Object term72203;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72111 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term72203 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term72295 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term72405 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term72497 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term72595 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setIntField(term72203, term72203.getClass(), "type", 12);
        setIntField(term72295, term72295.getClass(), "type", 0);
        setField(term72295, term72295.getClass(), "jsType", term72405);
        setField(term72203, term72203.getClass(), "first", term72295);
        setIntField(term72497, term72497.getClass(), "type", 0);
        setField(term72497, term72497.getClass(), "jsType", term72595);
        setField(term72203, term72203.getClass(), "last", term72497);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term72203;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term72111, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


