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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88506;
     Object term88576;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88506 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term88576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88646 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88744 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        Object term88814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88906 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        setIntField(term88576, term88576.getClass(), "type", 13);
        setIntField(term88646, term88646.getClass(), "type", 13);
        setField(term88646, term88646.getClass(), "jsType", term88744);
        setField(term88576, term88576.getClass(), "first", term88646);
        setIntField(term88814, term88814.getClass(), "type", 13);
        setField(term88814, term88814.getClass(), "jsType", term88906);
        setField(term88576, term88576.getClass(), "last", term88814);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term88576;
        args[1] = null;
        args[2] = false;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term88506, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


