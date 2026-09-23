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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376024;
     Object term376116;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term376024 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term376116 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term376208 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term376318 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term376388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term376476 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setIntField(term376116, term376116.getClass(), "type", 46);
        setIntField(term376208, term376208.getClass(), "type", 1);
        setField(term376208, term376208.getClass(), "jsType", term376318);
        setField(term376116, term376116.getClass(), "first", term376208);
        setIntField(term376388, term376388.getClass(), "type", -16386);
        setField(term376388, term376388.getClass(), "jsType", term376476);
        setField(term376116, term376116.getClass(), "last", term376388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term376116;
        args[1] = null;
        args[2] = false;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term376024, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


