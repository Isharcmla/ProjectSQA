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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79894;
     Object term79964;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79894 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term79964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80126 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        Object term80196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80294 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setIntField(term79964, term79964.getClass(), "type", 12);
        setIntField(term80034, term80034.getClass(), "type", 12);
        setField(term80034, term80034.getClass(), "jsType", term80126);
        setField(term79964, term79964.getClass(), "first", term80034);
        setIntField(term80196, term80196.getClass(), "type", 12);
        setField(term80196, term80196.getClass(), "jsType", term80294);
        setField(term79964, term79964.getClass(), "last", term80196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term79964;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term79894, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


