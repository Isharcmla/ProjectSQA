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
import static com.google.javascript.jscomp.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.type.EqualityUtils.*;
import java.lang.Object;

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143501;
     Object term143593;
     Object term144331;
     Object term144332;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143501 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term143593 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term143685 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term143777 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term143593, term143593.getClass(), "type", 52);
        setField(term143593, term143593.getClass(), "first", term143685);
        setField(term143593, term143593.getClass(), "last", term143777);
        term144331 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term144331, term144331.getClass(), "INEQ", null);
        setField(term144331, term144331.getClass(), "convention", null);
        setField(term144331, term144331.getClass(), "typeRegistry", null);
        setField(term144331, term144331.getClass(), "firstLink", null);
        setField(term144331, term144331.getClass(), "nextLink", null);
        setField(term144331, term144331.getClass(), "restrictUndefinedVisitor", null);
        setField(term144331, term144331.getClass(), "restrictNullVisitor", null);
        term144332 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term144333 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term144334 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term144332, term144332.getClass(), "number", 0.0);
        setIntField(term144332, term144332.getClass(), "type", 52);
        setField(term144332, term144332.getClass(), "next", null);
        setDoubleField(term144333, term144333.getClass(), "number", 0.0);
        setIntField(term144333, term144333.getClass(), "type", 0);
        setField(term144333, term144333.getClass(), "next", null);
        setField(term144333, term144333.getClass(), "first", null);
        setField(term144333, term144333.getClass(), "last", null);
        setField(term144333, term144333.getClass(), "propListHead", null);
        setIntField(term144333, term144333.getClass(), "sourcePosition", 0);
        setField(term144333, term144333.getClass(), "jsType", null);
        setField(term144333, term144333.getClass(), "parent", null);
        setField(term144332, term144332.getClass(), "first", term144333);
        setDoubleField(term144334, term144334.getClass(), "number", 0.0);
        setIntField(term144334, term144334.getClass(), "type", 0);
        setField(term144334, term144334.getClass(), "next", null);
        setField(term144334, term144334.getClass(), "first", null);
        setField(term144334, term144334.getClass(), "last", null);
        setField(term144334, term144334.getClass(), "propListHead", null);
        setIntField(term144334, term144334.getClass(), "sourcePosition", 0);
        setField(term144334, term144334.getClass(), "jsType", null);
        setField(term144334, term144334.getClass(), "parent", null);
        setField(term144332, term144332.getClass(), "last", term144334);
        setField(term144332, term144332.getClass(), "propListHead", null);
        setIntField(term144332, term144332.getClass(), "sourcePosition", 0);
        setField(term144332, term144332.getClass(), "jsType", null);
        setField(term144332, term144332.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term143593;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term143501, args);
        assertTrue(recursiveEquals(term143501, term144331));
        assertTrue(recursiveEquals(term143593, term144332));
        assertTrue(recursiveEquals(retValue, null));
    }

};


