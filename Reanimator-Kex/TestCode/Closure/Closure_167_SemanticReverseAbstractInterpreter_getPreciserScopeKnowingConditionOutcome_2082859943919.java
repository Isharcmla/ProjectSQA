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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355545;
     Object term355637;
     Object term356187;
     Object term356188;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term355545 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term355637 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term355729 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term355819 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        Object term355911 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term356003 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        setIntField(term355637, term355637.getClass(), "type", 45);
        setIntField(term355729, term355729.getClass(), "type", 0);
        setField(term355729, term355729.getClass(), "jsType", term355819);
        setField(term355637, term355637.getClass(), "first", term355729);
        setIntField(term355911, term355911.getClass(), "type", 0);
        setField(term355911, term355911.getClass(), "jsType", term356003);
        setField(term355637, term355637.getClass(), "last", term355911);
        term356187 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term356187, term356187.getClass(), "INEQ", null);
        setField(term356187, term356187.getClass(), "convention", null);
        setField(term356187, term356187.getClass(), "typeRegistry", null);
        setField(term356187, term356187.getClass(), "firstLink", null);
        setField(term356187, term356187.getClass(), "nextLink", null);
        setField(term356187, term356187.getClass(), "restrictUndefinedVisitor", null);
        setField(term356187, term356187.getClass(), "restrictNullVisitor", null);
        term356188 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term356189 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term356190 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        Object term356191 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term356192 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        setField(term356188, term356188.getClass(), "str", null);
        setIntField(term356188, term356188.getClass(), "type", 45);
        setField(term356188, term356188.getClass(), "next", null);
        setField(term356189, term356189.getClass(), "str", null);
        setIntField(term356189, term356189.getClass(), "type", 0);
        setField(term356189, term356189.getClass(), "next", null);
        setField(term356189, term356189.getClass(), "first", null);
        setField(term356189, term356189.getClass(), "last", null);
        setField(term356189, term356189.getClass(), "propListHead", null);
        setIntField(term356189, term356189.getClass(), "sourcePosition", 0);
        setBooleanField(term356190, term356190.getClass(), "resolved", false);
        setField(term356190, term356190.getClass(), "resolveResult", null);
        setBooleanField(term356190, term356190.getClass(), "inTemplatedCheckVisit", false);
        setField(term356190, term356190.getClass(), "registry", null);
        setField(term356189, term356189.getClass(), "jsType", term356190);
        setField(term356189, term356189.getClass(), "parent", null);
        setField(term356188, term356188.getClass(), "first", term356189);
        setDoubleField(term356191, term356191.getClass(), "number", 0.0);
        setIntField(term356191, term356191.getClass(), "type", 0);
        setField(term356191, term356191.getClass(), "next", null);
        setField(term356191, term356191.getClass(), "first", null);
        setField(term356191, term356191.getClass(), "last", null);
        setField(term356191, term356191.getClass(), "propListHead", null);
        setIntField(term356191, term356191.getClass(), "sourcePosition", 0);
        setBooleanField(term356192, term356192.getClass(), "resolved", false);
        setField(term356192, term356192.getClass(), "resolveResult", null);
        setBooleanField(term356192, term356192.getClass(), "inTemplatedCheckVisit", false);
        setField(term356192, term356192.getClass(), "registry", null);
        setField(term356191, term356191.getClass(), "jsType", term356192);
        setField(term356191, term356191.getClass(), "parent", null);
        setField(term356188, term356188.getClass(), "last", term356191);
        setField(term356188, term356188.getClass(), "propListHead", null);
        setIntField(term356188, term356188.getClass(), "sourcePosition", 0);
        setField(term356188, term356188.getClass(), "jsType", null);
        setField(term356188, term356188.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term355637;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term355545, args);
        assertTrue(recursiveEquals(term355545, term356187));
        assertTrue(recursiveEquals(term355637, term356188));
        assertTrue(recursiveEquals(retValue, null));
    }

};


