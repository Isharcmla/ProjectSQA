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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59374;
     Object term59466;
     Object term59838;
     Object term59839;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59374 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term59466 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term59558 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term59650 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term59742 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term59466, term59466.getClass(), "type", 111);
        setIntField(term59650, term59650.getClass(), "type", 111);
        setField(term59558, term59558.getClass(), "first", term59650);
        setField(term59466, term59466.getClass(), "parent", term59558);
        setIntField(term59742, term59742.getClass(), "type", 111);
        setField(term59466, term59466.getClass(), "first", term59742);
        term59838 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term59838, term59838.getClass(), "INEQ", null);
        setField(term59838, term59838.getClass(), "convention", null);
        setField(term59838, term59838.getClass(), "typeRegistry", null);
        setField(term59838, term59838.getClass(), "firstLink", null);
        setField(term59838, term59838.getClass(), "nextLink", null);
        setField(term59838, term59838.getClass(), "restrictUndefinedVisitor", null);
        setField(term59838, term59838.getClass(), "restrictNullVisitor", null);
        term59839 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term59840 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term59841 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term59842 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term59839, term59839.getClass(), "number", 0.0);
        setIntField(term59839, term59839.getClass(), "type", 111);
        setField(term59839, term59839.getClass(), "next", null);
        setDoubleField(term59840, term59840.getClass(), "number", 0.0);
        setIntField(term59840, term59840.getClass(), "type", 111);
        setField(term59840, term59840.getClass(), "next", null);
        setField(term59840, term59840.getClass(), "first", null);
        setField(term59840, term59840.getClass(), "last", null);
        setField(term59840, term59840.getClass(), "propListHead", null);
        setIntField(term59840, term59840.getClass(), "sourcePosition", 0);
        setField(term59840, term59840.getClass(), "jsType", null);
        setField(term59840, term59840.getClass(), "parent", null);
        setField(term59839, term59839.getClass(), "first", term59840);
        setField(term59839, term59839.getClass(), "last", null);
        setField(term59839, term59839.getClass(), "propListHead", null);
        setIntField(term59839, term59839.getClass(), "sourcePosition", 0);
        setField(term59839, term59839.getClass(), "jsType", null);
        setDoubleField(term59841, term59841.getClass(), "number", 0.0);
        setIntField(term59841, term59841.getClass(), "type", 0);
        setField(term59841, term59841.getClass(), "next", null);
        setDoubleField(term59842, term59842.getClass(), "number", 0.0);
        setIntField(term59842, term59842.getClass(), "type", 111);
        setField(term59842, term59842.getClass(), "next", null);
        setField(term59842, term59842.getClass(), "first", null);
        setField(term59842, term59842.getClass(), "last", null);
        setField(term59842, term59842.getClass(), "propListHead", null);
        setIntField(term59842, term59842.getClass(), "sourcePosition", 0);
        setField(term59842, term59842.getClass(), "jsType", null);
        setField(term59842, term59842.getClass(), "parent", null);
        setField(term59841, term59841.getClass(), "first", term59842);
        setField(term59841, term59841.getClass(), "last", null);
        setField(term59841, term59841.getClass(), "propListHead", null);
        setIntField(term59841, term59841.getClass(), "sourcePosition", 0);
        setField(term59841, term59841.getClass(), "jsType", null);
        setField(term59841, term59841.getClass(), "parent", null);
        setField(term59839, term59839.getClass(), "parent", term59841);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term59466;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term59374, args);
        assertTrue(recursiveEquals(term59374, term59838));
        assertTrue(recursiveEquals(term59466, term59839));
        assertTrue(recursiveEquals(retValue, null));
    }

};


