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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127566;
     Object term127658;
     Object term127878;
     Object term127879;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127566 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term127658 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term127750 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term127820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term127658, term127658.getClass(), "type", 46);
        setIntField(term127750, term127750.getClass(), "type", 0);
        setField(term127658, term127658.getClass(), "first", term127750);
        setField(term127658, term127658.getClass(), "last", term127820);
        term127878 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term127878, term127878.getClass(), "INEQ", null);
        setField(term127878, term127878.getClass(), "convention", null);
        setField(term127878, term127878.getClass(), "typeRegistry", null);
        setField(term127878, term127878.getClass(), "firstLink", null);
        setField(term127878, term127878.getClass(), "nextLink", null);
        setField(term127878, term127878.getClass(), "restrictUndefinedVisitor", null);
        setField(term127878, term127878.getClass(), "restrictNullVisitor", null);
        term127879 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term127880 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term127881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term127879, term127879.getClass(), "number", 0.0);
        setIntField(term127879, term127879.getClass(), "type", 46);
        setField(term127879, term127879.getClass(), "next", null);
        setField(term127880, term127880.getClass(), "str", null);
        setIntField(term127880, term127880.getClass(), "type", 0);
        setField(term127880, term127880.getClass(), "next", null);
        setField(term127880, term127880.getClass(), "first", null);
        setField(term127880, term127880.getClass(), "last", null);
        setField(term127880, term127880.getClass(), "propListHead", null);
        setIntField(term127880, term127880.getClass(), "sourcePosition", 0);
        setField(term127880, term127880.getClass(), "jsType", null);
        setField(term127880, term127880.getClass(), "parent", null);
        setField(term127879, term127879.getClass(), "first", term127880);
        setIntField(term127881, term127881.getClass(), "type", 0);
        setField(term127881, term127881.getClass(), "next", null);
        setField(term127881, term127881.getClass(), "first", null);
        setField(term127881, term127881.getClass(), "last", null);
        setField(term127881, term127881.getClass(), "propListHead", null);
        setIntField(term127881, term127881.getClass(), "sourcePosition", 0);
        setField(term127881, term127881.getClass(), "jsType", null);
        setField(term127881, term127881.getClass(), "parent", null);
        setField(term127879, term127879.getClass(), "last", term127881);
        setField(term127879, term127879.getClass(), "propListHead", null);
        setIntField(term127879, term127879.getClass(), "sourcePosition", 0);
        setField(term127879, term127879.getClass(), "jsType", null);
        setField(term127879, term127879.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term127658;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term127566, args);
        assertTrue(recursiveEquals(term127566, term127878));
        assertTrue(recursiveEquals(term127658, term127879));
        assertTrue(recursiveEquals(retValue, null));
    }

};


