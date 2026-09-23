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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296170;
     Object term296262;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term296170 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term296262 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term296354 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term296452 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        Object term296522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term296622 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setIntField(term296262, term296262.getClass(), "type", 45);
        setIntField(term296354, term296354.getClass(), "type", 1);
        setField(term296354, term296354.getClass(), "jsType", term296452);
        setField(term296262, term296262.getClass(), "first", term296354);
        setIntField(term296522, term296522.getClass(), "type", -16386);
        setField(term296522, term296522.getClass(), "jsType", term296622);
        setField(term296262, term296262.getClass(), "last", term296522);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term296262;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term296170, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


