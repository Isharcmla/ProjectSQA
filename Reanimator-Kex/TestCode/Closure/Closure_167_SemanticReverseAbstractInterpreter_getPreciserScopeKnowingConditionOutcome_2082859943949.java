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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369426;
     Object term369518;
     Object term370277;
     Object term370278;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369426 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term369518 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term369610 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term369702 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term369800 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        Object term369870 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term369518, term369518.getClass(), "type", 111);
        setIntField(term369702, term369702.getClass(), "type", 4);
        setField(term369702, term369702.getClass(), "jsType", term369800);
        setField(term369610, term369610.getClass(), "first", term369702);
        setField(term369518, term369518.getClass(), "parent", term369610);
        setIntField(term369870, term369870.getClass(), "type", -4194317);
        setField(term369870, term369870.getClass(), "jsType", term369800);
        setField(term369518, term369518.getClass(), "first", term369870);
        term370277 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term370277, term370277.getClass(), "INEQ", null);
        setField(term370277, term370277.getClass(), "convention", null);
        setField(term370277, term370277.getClass(), "typeRegistry", null);
        setField(term370277, term370277.getClass(), "firstLink", null);
        setField(term370277, term370277.getClass(), "nextLink", null);
        setField(term370277, term370277.getClass(), "restrictUndefinedVisitor", null);
        setField(term370277, term370277.getClass(), "restrictNullVisitor", null);
        term370278 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term370279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term370280 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        Object term370281 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term370282 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term370278, term370278.getClass(), "str", null);
        setIntField(term370278, term370278.getClass(), "type", 111);
        setField(term370278, term370278.getClass(), "next", null);
        setIntField(term370279, term370279.getClass(), "type", -4194317);
        setField(term370279, term370279.getClass(), "next", null);
        setField(term370279, term370279.getClass(), "first", null);
        setField(term370279, term370279.getClass(), "last", null);
        setField(term370279, term370279.getClass(), "propListHead", null);
        setIntField(term370279, term370279.getClass(), "sourcePosition", 0);
        setBooleanField(term370280, term370280.getClass(), "resolved", false);
        setField(term370280, term370280.getClass(), "resolveResult", null);
        setBooleanField(term370280, term370280.getClass(), "inTemplatedCheckVisit", false);
        setField(term370280, term370280.getClass(), "registry", null);
        setField(term370279, term370279.getClass(), "jsType", term370280);
        setField(term370279, term370279.getClass(), "parent", null);
        setField(term370278, term370278.getClass(), "first", term370279);
        setField(term370278, term370278.getClass(), "last", null);
        setField(term370278, term370278.getClass(), "propListHead", null);
        setIntField(term370278, term370278.getClass(), "sourcePosition", 0);
        setField(term370278, term370278.getClass(), "jsType", null);
        setField(term370281, term370281.getClass(), "str", null);
        setIntField(term370281, term370281.getClass(), "type", 0);
        setField(term370281, term370281.getClass(), "next", null);
        setDoubleField(term370282, term370282.getClass(), "number", 0.0);
        setIntField(term370282, term370282.getClass(), "type", 4);
        setField(term370282, term370282.getClass(), "next", null);
        setField(term370282, term370282.getClass(), "first", null);
        setField(term370282, term370282.getClass(), "last", null);
        setField(term370282, term370282.getClass(), "propListHead", null);
        setIntField(term370282, term370282.getClass(), "sourcePosition", 0);
        setField(term370282, term370282.getClass(), "jsType", term370280);
        setField(term370282, term370282.getClass(), "parent", null);
        setField(term370281, term370281.getClass(), "first", term370282);
        setField(term370281, term370281.getClass(), "last", null);
        setField(term370281, term370281.getClass(), "propListHead", null);
        setIntField(term370281, term370281.getClass(), "sourcePosition", 0);
        setField(term370281, term370281.getClass(), "jsType", null);
        setField(term370281, term370281.getClass(), "parent", null);
        setField(term370278, term370278.getClass(), "parent", term370281);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term369518;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term369426, args);
        assertTrue(recursiveEquals(term369426, term370277));
        assertTrue(recursiveEquals(term369518, term370278));
        assertTrue(recursiveEquals(retValue, null));
    }

};


