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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248951;
     Object term249043;
     Object term249582;
     Object term249583;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term248951 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term249043 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term249135 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term249227 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term249323 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        Object term249415 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term249043, term249043.getClass(), "type", 111);
        setIntField(term249227, term249227.getClass(), "type", 0);
        setField(term249227, term249227.getClass(), "jsType", term249323);
        setField(term249135, term249135.getClass(), "first", term249227);
        setField(term249043, term249043.getClass(), "parent", term249135);
        setIntField(term249415, term249415.getClass(), "type", 0);
        setField(term249415, term249415.getClass(), "jsType", term249323);
        setField(term249043, term249043.getClass(), "first", term249415);
        term249582 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term249582, term249582.getClass(), "INEQ", null);
        setField(term249582, term249582.getClass(), "convention", null);
        setField(term249582, term249582.getClass(), "typeRegistry", null);
        setField(term249582, term249582.getClass(), "firstLink", null);
        setField(term249582, term249582.getClass(), "nextLink", null);
        setField(term249582, term249582.getClass(), "restrictUndefinedVisitor", null);
        setField(term249582, term249582.getClass(), "restrictNullVisitor", null);
        term249583 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term249584 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term249585 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        Object term249586 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term249587 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term249583, term249583.getClass(), "number", 0.0);
        setIntField(term249583, term249583.getClass(), "type", 111);
        setField(term249583, term249583.getClass(), "next", null);
        setDoubleField(term249584, term249584.getClass(), "number", 0.0);
        setIntField(term249584, term249584.getClass(), "type", 0);
        setField(term249584, term249584.getClass(), "next", null);
        setField(term249584, term249584.getClass(), "first", null);
        setField(term249584, term249584.getClass(), "last", null);
        setField(term249584, term249584.getClass(), "propListHead", null);
        setIntField(term249584, term249584.getClass(), "sourcePosition", 0);
        setBooleanField(term249585, term249585.getClass(), "resolved", false);
        setField(term249585, term249585.getClass(), "resolveResult", null);
        setBooleanField(term249585, term249585.getClass(), "inTemplatedCheckVisit", false);
        setField(term249585, term249585.getClass(), "registry", null);
        setField(term249584, term249584.getClass(), "jsType", term249585);
        setField(term249584, term249584.getClass(), "parent", null);
        setField(term249583, term249583.getClass(), "first", term249584);
        setField(term249583, term249583.getClass(), "last", null);
        setField(term249583, term249583.getClass(), "propListHead", null);
        setIntField(term249583, term249583.getClass(), "sourcePosition", 0);
        setField(term249583, term249583.getClass(), "jsType", null);
        setDoubleField(term249586, term249586.getClass(), "number", 0.0);
        setIntField(term249586, term249586.getClass(), "type", 0);
        setField(term249586, term249586.getClass(), "next", null);
        setDoubleField(term249587, term249587.getClass(), "number", 0.0);
        setIntField(term249587, term249587.getClass(), "type", 0);
        setField(term249587, term249587.getClass(), "next", null);
        setField(term249587, term249587.getClass(), "first", null);
        setField(term249587, term249587.getClass(), "last", null);
        setField(term249587, term249587.getClass(), "propListHead", null);
        setIntField(term249587, term249587.getClass(), "sourcePosition", 0);
        setField(term249587, term249587.getClass(), "jsType", term249585);
        setField(term249587, term249587.getClass(), "parent", null);
        setField(term249586, term249586.getClass(), "first", term249587);
        setField(term249586, term249586.getClass(), "last", null);
        setField(term249586, term249586.getClass(), "propListHead", null);
        setIntField(term249586, term249586.getClass(), "sourcePosition", 0);
        setField(term249586, term249586.getClass(), "jsType", null);
        setField(term249586, term249586.getClass(), "parent", null);
        setField(term249583, term249583.getClass(), "parent", term249586);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term249043;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term248951, args);
        assertTrue(recursiveEquals(term248951, term249582));
        assertTrue(recursiveEquals(term249043, term249583));
        assertTrue(recursiveEquals(retValue, null));
    }

};


