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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term380106;
     Object term380198;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term380106 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term380198 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term380290 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term380380 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        Object term380472 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term380578 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setIntField(term380198, term380198.getClass(), "type", 45);
        setIntField(term380290, term380290.getClass(), "type", 45);
        setField(term380290, term380290.getClass(), "jsType", term380380);
        setField(term380198, term380198.getClass(), "first", term380290);
        setIntField(term380472, term380472.getClass(), "type", 0);
        setField(term380472, term380472.getClass(), "jsType", term380578);
        setField(term380198, term380198.getClass(), "last", term380472);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term380198;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term380106, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


