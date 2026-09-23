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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273055;
     Object term273147;
     Object term273554;
     Object term273555;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273055 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term273147 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term273239 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term273329 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        Object term273421 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term273147, term273147.getClass(), "type", 46);
        setIntField(term273239, term273239.getClass(), "type", 0);
        setField(term273239, term273239.getClass(), "jsType", term273329);
        setField(term273147, term273147.getClass(), "first", term273239);
        setIntField(term273421, term273421.getClass(), "type", 0);
        setField(term273421, term273421.getClass(), "jsType", term273329);
        setField(term273147, term273147.getClass(), "last", term273421);
        term273554 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term273554, term273554.getClass(), "INEQ", null);
        setField(term273554, term273554.getClass(), "convention", null);
        setField(term273554, term273554.getClass(), "typeRegistry", null);
        setField(term273554, term273554.getClass(), "firstLink", null);
        setField(term273554, term273554.getClass(), "nextLink", null);
        setField(term273554, term273554.getClass(), "restrictUndefinedVisitor", null);
        setField(term273554, term273554.getClass(), "restrictNullVisitor", null);
        term273555 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term273556 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term273557 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        Object term273558 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term273555, term273555.getClass(), "str", null);
        setIntField(term273555, term273555.getClass(), "type", 46);
        setField(term273555, term273555.getClass(), "next", null);
        setDoubleField(term273556, term273556.getClass(), "number", 0.0);
        setIntField(term273556, term273556.getClass(), "type", 0);
        setField(term273556, term273556.getClass(), "next", null);
        setField(term273556, term273556.getClass(), "first", null);
        setField(term273556, term273556.getClass(), "last", null);
        setField(term273556, term273556.getClass(), "propListHead", null);
        setIntField(term273556, term273556.getClass(), "sourcePosition", 0);
        setBooleanField(term273557, term273557.getClass(), "resolved", false);
        setField(term273557, term273557.getClass(), "resolveResult", null);
        setBooleanField(term273557, term273557.getClass(), "inTemplatedCheckVisit", false);
        setField(term273557, term273557.getClass(), "registry", null);
        setField(term273556, term273556.getClass(), "jsType", term273557);
        setField(term273556, term273556.getClass(), "parent", null);
        setField(term273555, term273555.getClass(), "first", term273556);
        setField(term273558, term273558.getClass(), "str", null);
        setIntField(term273558, term273558.getClass(), "type", 0);
        setField(term273558, term273558.getClass(), "next", null);
        setField(term273558, term273558.getClass(), "first", null);
        setField(term273558, term273558.getClass(), "last", null);
        setField(term273558, term273558.getClass(), "propListHead", null);
        setIntField(term273558, term273558.getClass(), "sourcePosition", 0);
        setField(term273558, term273558.getClass(), "jsType", term273557);
        setField(term273558, term273558.getClass(), "parent", null);
        setField(term273555, term273555.getClass(), "last", term273558);
        setField(term273555, term273555.getClass(), "propListHead", null);
        setIntField(term273555, term273555.getClass(), "sourcePosition", 0);
        setField(term273555, term273555.getClass(), "jsType", null);
        setField(term273555, term273555.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term273147;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term273055, args);
        assertTrue(recursiveEquals(term273055, term273554));
        assertTrue(recursiveEquals(term273147, term273555));
        assertTrue(recursiveEquals(retValue, null));
    }

};


