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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term385419;
     Object term385511;
     Object term386339;
     Object term386340;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term385419 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term385511 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term385603 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term385699 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        Object term385791 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term385511, term385511.getClass(), "type", 46);
        setIntField(term385603, term385603.getClass(), "type", -198700);
        setField(term385603, term385603.getClass(), "jsType", term385699);
        setField(term385511, term385511.getClass(), "first", term385603);
        setIntField(term385791, term385791.getClass(), "type", 1);
        setField(term385791, term385791.getClass(), "jsType", term385699);
        setField(term385511, term385511.getClass(), "last", term385791);
        term386339 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term386339, term386339.getClass(), "INEQ", null);
        setField(term386339, term386339.getClass(), "convention", null);
        setField(term386339, term386339.getClass(), "typeRegistry", null);
        setField(term386339, term386339.getClass(), "firstLink", null);
        setField(term386339, term386339.getClass(), "nextLink", null);
        setField(term386339, term386339.getClass(), "restrictUndefinedVisitor", null);
        setField(term386339, term386339.getClass(), "restrictNullVisitor", null);
        term386340 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term386341 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term386342 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        Object term386343 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term386340, term386340.getClass(), "number", 0.0);
        setIntField(term386340, term386340.getClass(), "type", 46);
        setField(term386340, term386340.getClass(), "next", null);
        setDoubleField(term386341, term386341.getClass(), "number", 0.0);
        setIntField(term386341, term386341.getClass(), "type", -198700);
        setField(term386341, term386341.getClass(), "next", null);
        setField(term386341, term386341.getClass(), "first", null);
        setField(term386341, term386341.getClass(), "last", null);
        setField(term386341, term386341.getClass(), "propListHead", null);
        setIntField(term386341, term386341.getClass(), "sourcePosition", 0);
        setBooleanField(term386342, term386342.getClass(), "resolved", false);
        setField(term386342, term386342.getClass(), "resolveResult", null);
        setBooleanField(term386342, term386342.getClass(), "inTemplatedCheckVisit", false);
        setField(term386342, term386342.getClass(), "registry", null);
        setField(term386341, term386341.getClass(), "jsType", term386342);
        setField(term386341, term386341.getClass(), "parent", null);
        setField(term386340, term386340.getClass(), "first", term386341);
        setDoubleField(term386343, term386343.getClass(), "number", 0.0);
        setIntField(term386343, term386343.getClass(), "type", 1);
        setField(term386343, term386343.getClass(), "next", null);
        setField(term386343, term386343.getClass(), "first", null);
        setField(term386343, term386343.getClass(), "last", null);
        setField(term386343, term386343.getClass(), "propListHead", null);
        setIntField(term386343, term386343.getClass(), "sourcePosition", 0);
        setField(term386343, term386343.getClass(), "jsType", term386342);
        setField(term386343, term386343.getClass(), "parent", null);
        setField(term386340, term386340.getClass(), "last", term386343);
        setField(term386340, term386340.getClass(), "propListHead", null);
        setIntField(term386340, term386340.getClass(), "sourcePosition", 0);
        setField(term386340, term386340.getClass(), "jsType", null);
        setField(term386340, term386340.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term385511;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term385419, args);
        assertTrue(recursiveEquals(term385419, term386339));
        assertTrue(recursiveEquals(term385511, term386340));
        assertTrue(recursiveEquals(retValue, null));
    }

};


