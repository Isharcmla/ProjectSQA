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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943907 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293232;
     Object term293324;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943907() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293232 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term293324 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term293416 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term293508 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term293606 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        Object term293698 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term293796 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setIntField(term293324, term293324.getClass(), "type", 111);
        setIntField(term293508, term293508.getClass(), "type", 111);
        setField(term293508, term293508.getClass(), "jsType", term293606);
        setField(term293416, term293416.getClass(), "first", term293508);
        setField(term293324, term293324.getClass(), "parent", term293416);
        setIntField(term293698, term293698.getClass(), "type", 0);
        setField(term293698, term293698.getClass(), "jsType", term293796);
        setField(term293324, term293324.getClass(), "first", term293698);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term293324;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term293232, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


