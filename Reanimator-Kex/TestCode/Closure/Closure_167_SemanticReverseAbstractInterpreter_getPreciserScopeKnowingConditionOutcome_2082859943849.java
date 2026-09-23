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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264452;
     Object term264544;
     Object term265078;
     Object term265079;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term264452 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term264544 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term264636 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term264728 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term264826 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        Object term264918 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term264544, term264544.getClass(), "type", 111);
        setIntField(term264728, term264728.getClass(), "type", -1838535544);
        setField(term264728, term264728.getClass(), "jsType", term264826);
        setField(term264636, term264636.getClass(), "first", term264728);
        setField(term264544, term264544.getClass(), "parent", term264636);
        setIntField(term264918, term264918.getClass(), "type", 1838273399);
        setField(term264918, term264918.getClass(), "jsType", term264826);
        setField(term264544, term264544.getClass(), "first", term264918);
        term265078 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term265078, term265078.getClass(), "INEQ", null);
        setField(term265078, term265078.getClass(), "convention", null);
        setField(term265078, term265078.getClass(), "typeRegistry", null);
        setField(term265078, term265078.getClass(), "firstLink", null);
        setField(term265078, term265078.getClass(), "nextLink", null);
        setField(term265078, term265078.getClass(), "restrictUndefinedVisitor", null);
        setField(term265078, term265078.getClass(), "restrictNullVisitor", null);
        term265079 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term265080 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term265081 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        Object term265082 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term265083 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term265079, term265079.getClass(), "str", null);
        setIntField(term265079, term265079.getClass(), "type", 111);
        setField(term265079, term265079.getClass(), "next", null);
        setDoubleField(term265080, term265080.getClass(), "number", 0.0);
        setIntField(term265080, term265080.getClass(), "type", 1838273399);
        setField(term265080, term265080.getClass(), "next", null);
        setField(term265080, term265080.getClass(), "first", null);
        setField(term265080, term265080.getClass(), "last", null);
        setField(term265080, term265080.getClass(), "propListHead", null);
        setIntField(term265080, term265080.getClass(), "sourcePosition", 0);
        setBooleanField(term265081, term265081.getClass(), "resolved", false);
        setField(term265081, term265081.getClass(), "resolveResult", null);
        setBooleanField(term265081, term265081.getClass(), "inTemplatedCheckVisit", false);
        setField(term265081, term265081.getClass(), "registry", null);
        setField(term265080, term265080.getClass(), "jsType", term265081);
        setField(term265080, term265080.getClass(), "parent", null);
        setField(term265079, term265079.getClass(), "first", term265080);
        setField(term265079, term265079.getClass(), "last", null);
        setField(term265079, term265079.getClass(), "propListHead", null);
        setIntField(term265079, term265079.getClass(), "sourcePosition", 0);
        setField(term265079, term265079.getClass(), "jsType", null);
        setField(term265082, term265082.getClass(), "str", null);
        setIntField(term265082, term265082.getClass(), "type", 0);
        setField(term265082, term265082.getClass(), "next", null);
        setField(term265083, term265083.getClass(), "str", null);
        setIntField(term265083, term265083.getClass(), "type", -1838535544);
        setField(term265083, term265083.getClass(), "next", null);
        setField(term265083, term265083.getClass(), "first", null);
        setField(term265083, term265083.getClass(), "last", null);
        setField(term265083, term265083.getClass(), "propListHead", null);
        setIntField(term265083, term265083.getClass(), "sourcePosition", 0);
        setField(term265083, term265083.getClass(), "jsType", term265081);
        setField(term265083, term265083.getClass(), "parent", null);
        setField(term265082, term265082.getClass(), "first", term265083);
        setField(term265082, term265082.getClass(), "last", null);
        setField(term265082, term265082.getClass(), "propListHead", null);
        setIntField(term265082, term265082.getClass(), "sourcePosition", 0);
        setField(term265082, term265082.getClass(), "jsType", null);
        setField(term265082, term265082.getClass(), "parent", null);
        setField(term265079, term265079.getClass(), "parent", term265082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term264544;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term264452, args);
        assertTrue(recursiveEquals(term264452, term265078));
        assertTrue(recursiveEquals(term264544, term265079));
        assertTrue(recursiveEquals(retValue, null));
    }

};


