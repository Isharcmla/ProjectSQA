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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134097;
     Object term134167;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134097 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term134167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term134237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term134337 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term134407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term134517 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setIntField(term134167, term134167.getClass(), "type", 46);
        setIntField(term134237, term134237.getClass(), "type", 46);
        setField(term134237, term134237.getClass(), "jsType", term134337);
        setField(term134167, term134167.getClass(), "first", term134237);
        setIntField(term134407, term134407.getClass(), "type", 46);
        setField(term134407, term134407.getClass(), "jsType", term134517);
        setField(term134167, term134167.getClass(), "last", term134407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term134167;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term134097, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


