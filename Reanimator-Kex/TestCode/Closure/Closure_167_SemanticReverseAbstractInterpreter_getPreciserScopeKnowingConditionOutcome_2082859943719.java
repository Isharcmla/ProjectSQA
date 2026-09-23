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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210968;
     Object term211060;
     Object term211426;
     Object term211427;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210968 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term211060 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term211152 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term211244 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        Object term211336 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term211060, term211060.getClass(), "type", 13);
        setIntField(term211152, term211152.getClass(), "type", 0);
        setField(term211152, term211152.getClass(), "jsType", term211244);
        setField(term211060, term211060.getClass(), "first", term211152);
        setIntField(term211336, term211336.getClass(), "type", 13);
        setField(term211336, term211336.getClass(), "jsType", null);
        setField(term211060, term211060.getClass(), "last", term211336);
        term211426 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term211426, term211426.getClass(), "INEQ", null);
        setField(term211426, term211426.getClass(), "convention", null);
        setField(term211426, term211426.getClass(), "typeRegistry", null);
        setField(term211426, term211426.getClass(), "firstLink", null);
        setField(term211426, term211426.getClass(), "nextLink", null);
        setField(term211426, term211426.getClass(), "restrictUndefinedVisitor", null);
        setField(term211426, term211426.getClass(), "restrictNullVisitor", null);
        term211427 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term211428 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term211429 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        Object term211430 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term211427, term211427.getClass(), "str", null);
        setIntField(term211427, term211427.getClass(), "type", 13);
        setField(term211427, term211427.getClass(), "next", null);
        setDoubleField(term211428, term211428.getClass(), "number", 0.0);
        setIntField(term211428, term211428.getClass(), "type", 0);
        setField(term211428, term211428.getClass(), "next", null);
        setField(term211428, term211428.getClass(), "first", null);
        setField(term211428, term211428.getClass(), "last", null);
        setField(term211428, term211428.getClass(), "propListHead", null);
        setIntField(term211428, term211428.getClass(), "sourcePosition", 0);
        setBooleanField(term211429, term211429.getClass(), "resolved", false);
        setField(term211429, term211429.getClass(), "resolveResult", null);
        setBooleanField(term211429, term211429.getClass(), "inTemplatedCheckVisit", false);
        setField(term211429, term211429.getClass(), "registry", null);
        setField(term211428, term211428.getClass(), "jsType", term211429);
        setField(term211428, term211428.getClass(), "parent", null);
        setField(term211427, term211427.getClass(), "first", term211428);
        setField(term211430, term211430.getClass(), "str", null);
        setIntField(term211430, term211430.getClass(), "type", 13);
        setField(term211430, term211430.getClass(), "next", null);
        setField(term211430, term211430.getClass(), "first", null);
        setField(term211430, term211430.getClass(), "last", null);
        setField(term211430, term211430.getClass(), "propListHead", null);
        setIntField(term211430, term211430.getClass(), "sourcePosition", 0);
        setField(term211430, term211430.getClass(), "jsType", null);
        setField(term211430, term211430.getClass(), "parent", null);
        setField(term211427, term211427.getClass(), "last", term211430);
        setField(term211427, term211427.getClass(), "propListHead", null);
        setIntField(term211427, term211427.getClass(), "sourcePosition", 0);
        setField(term211427, term211427.getClass(), "jsType", null);
        setField(term211427, term211427.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term211060;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term210968, args);
        assertTrue(recursiveEquals(term210968, term211426));
        assertTrue(recursiveEquals(term211060, term211427));
        assertTrue(recursiveEquals(retValue, null));
    }

};


