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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358184;
     Object term358276;
     Object term358648;
     Object term358649;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term358184 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term358276 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term358368 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term358466 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        Object term358558 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term358276, term358276.getClass(), "type", 45);
        setIntField(term358368, term358368.getClass(), "type", 0);
        setField(term358368, term358368.getClass(), "jsType", term358466);
        setField(term358276, term358276.getClass(), "first", term358368);
        setIntField(term358558, term358558.getClass(), "type", 45);
        setField(term358558, term358558.getClass(), "jsType", null);
        setField(term358276, term358276.getClass(), "last", term358558);
        term358648 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term358648, term358648.getClass(), "INEQ", null);
        setField(term358648, term358648.getClass(), "convention", null);
        setField(term358648, term358648.getClass(), "typeRegistry", null);
        setField(term358648, term358648.getClass(), "firstLink", null);
        setField(term358648, term358648.getClass(), "nextLink", null);
        setField(term358648, term358648.getClass(), "restrictUndefinedVisitor", null);
        setField(term358648, term358648.getClass(), "restrictNullVisitor", null);
        term358649 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term358650 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term358651 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        Object term358652 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term358649, term358649.getClass(), "str", null);
        setIntField(term358649, term358649.getClass(), "type", 45);
        setField(term358649, term358649.getClass(), "next", null);
        setDoubleField(term358650, term358650.getClass(), "number", 0.0);
        setIntField(term358650, term358650.getClass(), "type", 0);
        setField(term358650, term358650.getClass(), "next", null);
        setField(term358650, term358650.getClass(), "first", null);
        setField(term358650, term358650.getClass(), "last", null);
        setField(term358650, term358650.getClass(), "propListHead", null);
        setIntField(term358650, term358650.getClass(), "sourcePosition", 0);
        setBooleanField(term358651, term358651.getClass(), "resolved", false);
        setField(term358651, term358651.getClass(), "resolveResult", null);
        setBooleanField(term358651, term358651.getClass(), "inTemplatedCheckVisit", false);
        setField(term358651, term358651.getClass(), "registry", null);
        setField(term358650, term358650.getClass(), "jsType", term358651);
        setField(term358650, term358650.getClass(), "parent", null);
        setField(term358649, term358649.getClass(), "first", term358650);
        setField(term358652, term358652.getClass(), "str", null);
        setIntField(term358652, term358652.getClass(), "type", 45);
        setField(term358652, term358652.getClass(), "next", null);
        setField(term358652, term358652.getClass(), "first", null);
        setField(term358652, term358652.getClass(), "last", null);
        setField(term358652, term358652.getClass(), "propListHead", null);
        setIntField(term358652, term358652.getClass(), "sourcePosition", 0);
        setField(term358652, term358652.getClass(), "jsType", null);
        setField(term358652, term358652.getClass(), "parent", null);
        setField(term358649, term358649.getClass(), "last", term358652);
        setField(term358649, term358649.getClass(), "propListHead", null);
        setIntField(term358649, term358649.getClass(), "sourcePosition", 0);
        setField(term358649, term358649.getClass(), "jsType", null);
        setField(term358649, term358649.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term358276;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term358184, args);
        assertTrue(recursiveEquals(term358184, term358648));
        assertTrue(recursiveEquals(term358276, term358649));
        assertTrue(recursiveEquals(retValue, null));
    }

};


