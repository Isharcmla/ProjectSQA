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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185739;
     Object term185831;
     Object term186195;
     Object term186196;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185739 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term185831 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term185923 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term186013 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        Object term186105 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term185831, term185831.getClass(), "type", 12);
        setIntField(term185923, term185923.getClass(), "type", 0);
        setField(term185923, term185923.getClass(), "jsType", term186013);
        setField(term185831, term185831.getClass(), "first", term185923);
        setIntField(term186105, term186105.getClass(), "type", 12);
        setField(term186105, term186105.getClass(), "jsType", null);
        setField(term185831, term185831.getClass(), "last", term186105);
        term186195 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term186195, term186195.getClass(), "INEQ", null);
        setField(term186195, term186195.getClass(), "convention", null);
        setField(term186195, term186195.getClass(), "typeRegistry", null);
        setField(term186195, term186195.getClass(), "firstLink", null);
        setField(term186195, term186195.getClass(), "nextLink", null);
        setField(term186195, term186195.getClass(), "restrictUndefinedVisitor", null);
        setField(term186195, term186195.getClass(), "restrictNullVisitor", null);
        term186196 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term186197 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term186198 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        Object term186199 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term186196, term186196.getClass(), "str", null);
        setIntField(term186196, term186196.getClass(), "type", 12);
        setField(term186196, term186196.getClass(), "next", null);
        setDoubleField(term186197, term186197.getClass(), "number", 0.0);
        setIntField(term186197, term186197.getClass(), "type", 0);
        setField(term186197, term186197.getClass(), "next", null);
        setField(term186197, term186197.getClass(), "first", null);
        setField(term186197, term186197.getClass(), "last", null);
        setField(term186197, term186197.getClass(), "propListHead", null);
        setIntField(term186197, term186197.getClass(), "sourcePosition", 0);
        setBooleanField(term186198, term186198.getClass(), "resolved", false);
        setField(term186198, term186198.getClass(), "resolveResult", null);
        setBooleanField(term186198, term186198.getClass(), "inTemplatedCheckVisit", false);
        setField(term186198, term186198.getClass(), "registry", null);
        setField(term186197, term186197.getClass(), "jsType", term186198);
        setField(term186197, term186197.getClass(), "parent", null);
        setField(term186196, term186196.getClass(), "first", term186197);
        setField(term186199, term186199.getClass(), "str", null);
        setIntField(term186199, term186199.getClass(), "type", 12);
        setField(term186199, term186199.getClass(), "next", null);
        setField(term186199, term186199.getClass(), "first", null);
        setField(term186199, term186199.getClass(), "last", null);
        setField(term186199, term186199.getClass(), "propListHead", null);
        setIntField(term186199, term186199.getClass(), "sourcePosition", 0);
        setField(term186199, term186199.getClass(), "jsType", null);
        setField(term186199, term186199.getClass(), "parent", null);
        setField(term186196, term186196.getClass(), "last", term186199);
        setField(term186196, term186196.getClass(), "propListHead", null);
        setIntField(term186196, term186196.getClass(), "sourcePosition", 0);
        setField(term186196, term186196.getClass(), "jsType", null);
        setField(term186196, term186196.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term185831;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term185739, args);
        assertTrue(recursiveEquals(term185739, term186195));
        assertTrue(recursiveEquals(term185831, term186196));
        assertTrue(recursiveEquals(retValue, null));
    }

};


