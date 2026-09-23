package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20400980745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16151;
     Object term16373;
     Object term16388;
     Object term16390;

    public ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20400980745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16151 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        Object term16281 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(term16151, term16151.getClass(), "nextLink", term16281);
        term16373 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term16373, term16373.getClass(), "type", -38);
        term16388 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        Object term16389 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(term16388, term16388.getClass(), "restrictToArrayVisitor", null);
        setField(term16388, term16388.getClass(), "restrictToNotArrayVisitor", null);
        setField(term16388, term16388.getClass(), "restrictToObjectVisitor", null);
        setField(term16388, term16388.getClass(), "restrictToNotObjectVisitor", null);
        setField(term16388, term16388.getClass(), "restricters", null);
        setField(term16388, term16388.getClass(), "convention", null);
        setField(term16388, term16388.getClass(), "typeRegistry", null);
        setField(term16388, term16388.getClass(), "firstLink", null);
        setField(term16389, term16389.getClass(), "restrictToArrayVisitor", null);
        setField(term16389, term16389.getClass(), "restrictToNotArrayVisitor", null);
        setField(term16389, term16389.getClass(), "restrictToObjectVisitor", null);
        setField(term16389, term16389.getClass(), "restrictToNotObjectVisitor", null);
        setField(term16389, term16389.getClass(), "restricters", null);
        setField(term16389, term16389.getClass(), "convention", null);
        setField(term16389, term16389.getClass(), "typeRegistry", null);
        setField(term16389, term16389.getClass(), "firstLink", null);
        setField(term16389, term16389.getClass(), "nextLink", null);
        setField(term16389, term16389.getClass(), "restrictUndefinedVisitor", null);
        setField(term16389, term16389.getClass(), "restrictNullVisitor", null);
        setField(term16388, term16388.getClass(), "nextLink", term16389);
        setField(term16388, term16388.getClass(), "restrictUndefinedVisitor", null);
        setField(term16388, term16388.getClass(), "restrictNullVisitor", null);
        term16390 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term16390, term16390.getClass(), "number", 0.0);
        setIntField(term16390, term16390.getClass(), "type", -38);
        setField(term16390, term16390.getClass(), "next", null);
        setField(term16390, term16390.getClass(), "first", null);
        setField(term16390, term16390.getClass(), "last", null);
        setField(term16390, term16390.getClass(), "propListHead", null);
        setIntField(term16390, term16390.getClass(), "sourcePosition", 0);
        setField(term16390, term16390.getClass(), "jsType", null);
        setField(term16390, term16390.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term16373;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term16151, args);
        assertTrue(recursiveEquals(term16151, term16388));
        assertTrue(recursiveEquals(term16373, term16390));
        assertTrue(recursiveEquals(retValue, null));
    }

};


