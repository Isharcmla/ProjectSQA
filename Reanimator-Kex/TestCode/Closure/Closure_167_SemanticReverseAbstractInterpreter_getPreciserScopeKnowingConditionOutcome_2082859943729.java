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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214881;
     Object term214973;
     Object term215355;
     Object term215356;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term214881 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term214973 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term215065 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term215159 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term215251 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term214973, term214973.getClass(), "type", 12);
        setIntField(term215065, term215065.getClass(), "type", 1078385728);
        setField(term215065, term215065.getClass(), "jsType", term215159);
        setField(term214973, term214973.getClass(), "first", term215065);
        setIntField(term215251, term215251.getClass(), "type", -1078385729);
        setField(term215251, term215251.getClass(), "jsType", null);
        setField(term214973, term214973.getClass(), "last", term215251);
        term215355 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term215355, term215355.getClass(), "INEQ", null);
        setField(term215355, term215355.getClass(), "convention", null);
        setField(term215355, term215355.getClass(), "typeRegistry", null);
        setField(term215355, term215355.getClass(), "firstLink", null);
        setField(term215355, term215355.getClass(), "nextLink", null);
        setField(term215355, term215355.getClass(), "restrictUndefinedVisitor", null);
        setField(term215355, term215355.getClass(), "restrictNullVisitor", null);
        term215356 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term215357 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term215358 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term215359 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term215356, term215356.getClass(), "str", null);
        setIntField(term215356, term215356.getClass(), "type", 12);
        setField(term215356, term215356.getClass(), "next", null);
        setDoubleField(term215357, term215357.getClass(), "number", 0.0);
        setIntField(term215357, term215357.getClass(), "type", 1078385728);
        setField(term215357, term215357.getClass(), "next", null);
        setField(term215357, term215357.getClass(), "first", null);
        setField(term215357, term215357.getClass(), "last", null);
        setField(term215357, term215357.getClass(), "propListHead", null);
        setIntField(term215357, term215357.getClass(), "sourcePosition", 0);
        setField(term215358, term215358.getClass(), "parameters", null);
        setField(term215358, term215358.getClass(), "returnType", null);
        setBooleanField(term215358, term215358.getClass(), "returnTypeInferred", false);
        setBooleanField(term215358, term215358.getClass(), "resolved", false);
        setField(term215358, term215358.getClass(), "resolveResult", null);
        setBooleanField(term215358, term215358.getClass(), "inTemplatedCheckVisit", false);
        setField(term215358, term215358.getClass(), "registry", null);
        setField(term215357, term215357.getClass(), "jsType", term215358);
        setField(term215357, term215357.getClass(), "parent", null);
        setField(term215356, term215356.getClass(), "first", term215357);
        setDoubleField(term215359, term215359.getClass(), "number", 0.0);
        setIntField(term215359, term215359.getClass(), "type", -1078385729);
        setField(term215359, term215359.getClass(), "next", null);
        setField(term215359, term215359.getClass(), "first", null);
        setField(term215359, term215359.getClass(), "last", null);
        setField(term215359, term215359.getClass(), "propListHead", null);
        setIntField(term215359, term215359.getClass(), "sourcePosition", 0);
        setField(term215359, term215359.getClass(), "jsType", null);
        setField(term215359, term215359.getClass(), "parent", null);
        setField(term215356, term215356.getClass(), "last", term215359);
        setField(term215356, term215356.getClass(), "propListHead", null);
        setIntField(term215356, term215356.getClass(), "sourcePosition", 0);
        setField(term215356, term215356.getClass(), "jsType", null);
        setField(term215356, term215356.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term214973;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term214881, args);
        assertTrue(recursiveEquals(term214881, term215355));
        assertTrue(recursiveEquals(term214973, term215356));
        assertTrue(recursiveEquals(retValue, null));
    }

};


