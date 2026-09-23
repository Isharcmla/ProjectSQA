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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240604;
     Object term240696;
     Object term241074;
     Object term241075;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240604 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term240696 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term240788 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term240882 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term240974 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term240696, term240696.getClass(), "type", 46);
        setIntField(term240788, term240788.getClass(), "type", 0);
        setField(term240788, term240788.getClass(), "jsType", term240882);
        setField(term240696, term240696.getClass(), "first", term240788);
        setIntField(term240974, term240974.getClass(), "type", 46);
        setField(term240974, term240974.getClass(), "jsType", null);
        setField(term240696, term240696.getClass(), "last", term240974);
        term241074 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term241074, term241074.getClass(), "INEQ", null);
        setField(term241074, term241074.getClass(), "convention", null);
        setField(term241074, term241074.getClass(), "typeRegistry", null);
        setField(term241074, term241074.getClass(), "firstLink", null);
        setField(term241074, term241074.getClass(), "nextLink", null);
        setField(term241074, term241074.getClass(), "restrictUndefinedVisitor", null);
        setField(term241074, term241074.getClass(), "restrictNullVisitor", null);
        term241075 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term241076 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term241077 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term241078 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term241075, term241075.getClass(), "number", 0.0);
        setIntField(term241075, term241075.getClass(), "type", 46);
        setField(term241075, term241075.getClass(), "next", null);
        setField(term241076, term241076.getClass(), "str", null);
        setIntField(term241076, term241076.getClass(), "type", 0);
        setField(term241076, term241076.getClass(), "next", null);
        setField(term241076, term241076.getClass(), "first", null);
        setField(term241076, term241076.getClass(), "last", null);
        setField(term241076, term241076.getClass(), "propListHead", null);
        setIntField(term241076, term241076.getClass(), "sourcePosition", 0);
        setField(term241077, term241077.getClass(), "alternates", null);
        setIntField(term241077, term241077.getClass(), "hashcode", 0);
        setBooleanField(term241077, term241077.getClass(), "resolved", false);
        setField(term241077, term241077.getClass(), "resolveResult", null);
        setBooleanField(term241077, term241077.getClass(), "inTemplatedCheckVisit", false);
        setField(term241077, term241077.getClass(), "registry", null);
        setField(term241076, term241076.getClass(), "jsType", term241077);
        setField(term241076, term241076.getClass(), "parent", null);
        setField(term241075, term241075.getClass(), "first", term241076);
        setDoubleField(term241078, term241078.getClass(), "number", 0.0);
        setIntField(term241078, term241078.getClass(), "type", 46);
        setField(term241078, term241078.getClass(), "next", null);
        setField(term241078, term241078.getClass(), "first", null);
        setField(term241078, term241078.getClass(), "last", null);
        setField(term241078, term241078.getClass(), "propListHead", null);
        setIntField(term241078, term241078.getClass(), "sourcePosition", 0);
        setField(term241078, term241078.getClass(), "jsType", null);
        setField(term241078, term241078.getClass(), "parent", null);
        setField(term241075, term241075.getClass(), "last", term241078);
        setField(term241075, term241075.getClass(), "propListHead", null);
        setIntField(term241075, term241075.getClass(), "sourcePosition", 0);
        setField(term241075, term241075.getClass(), "jsType", null);
        setField(term241075, term241075.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term240696;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term240604, args);
        assertTrue(recursiveEquals(term240604, term241074));
        assertTrue(recursiveEquals(term240696, term241075));
        assertTrue(recursiveEquals(retValue, null));
    }

};


