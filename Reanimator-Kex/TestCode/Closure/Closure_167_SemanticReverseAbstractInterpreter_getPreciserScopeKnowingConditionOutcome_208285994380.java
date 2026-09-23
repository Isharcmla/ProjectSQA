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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_208285994380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16218;
     Object term16310;
     Object term16704;
     Object term16705;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_208285994380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16218 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term16310 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term16402 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term16310, term16310.getClass(), "type", 45);
        setField(term16310, term16310.getClass(), "first", term16310);
        setField(term16310, term16310.getClass(), "last", term16402);
        term16704 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term16704, term16704.getClass(), "INEQ", null);
        setField(term16704, term16704.getClass(), "convention", null);
        setField(term16704, term16704.getClass(), "typeRegistry", null);
        setField(term16704, term16704.getClass(), "firstLink", null);
        setField(term16704, term16704.getClass(), "nextLink", null);
        setField(term16704, term16704.getClass(), "restrictUndefinedVisitor", null);
        setField(term16704, term16704.getClass(), "restrictNullVisitor", null);
        term16705 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term16706 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term16705, term16705.getClass(), "number", 0.0);
        setIntField(term16705, term16705.getClass(), "type", 45);
        setField(term16705, term16705.getClass(), "next", null);
        setField(term16705, term16705.getClass(), "first", term16705);
        setDoubleField(term16706, term16706.getClass(), "number", 0.0);
        setIntField(term16706, term16706.getClass(), "type", 0);
        setField(term16706, term16706.getClass(), "next", null);
        setField(term16706, term16706.getClass(), "first", null);
        setField(term16706, term16706.getClass(), "last", null);
        setField(term16706, term16706.getClass(), "propListHead", null);
        setIntField(term16706, term16706.getClass(), "sourcePosition", 0);
        setField(term16706, term16706.getClass(), "jsType", null);
        setField(term16706, term16706.getClass(), "parent", null);
        setField(term16705, term16705.getClass(), "last", term16706);
        setField(term16705, term16705.getClass(), "propListHead", null);
        setIntField(term16705, term16705.getClass(), "sourcePosition", 0);
        setField(term16705, term16705.getClass(), "jsType", null);
        setField(term16705, term16705.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term16310;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term16218, args);
        assertTrue(recursiveEquals(term16218, term16704));
        assertTrue(recursiveEquals(term16310, term16705));
        assertTrue(recursiveEquals(retValue, null));
    }

};


