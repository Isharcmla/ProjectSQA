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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48202;
     Object term48294;
     Object term48535;
     Object term48536;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48202 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term48294 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term48386 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term48478 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term48294, term48294.getClass(), "type", 12);
        setIntField(term48386, term48386.getClass(), "type", 12);
        setField(term48294, term48294.getClass(), "first", term48386);
        setField(term48294, term48294.getClass(), "last", term48478);
        term48535 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term48535, term48535.getClass(), "INEQ", null);
        setField(term48535, term48535.getClass(), "convention", null);
        setField(term48535, term48535.getClass(), "typeRegistry", null);
        setField(term48535, term48535.getClass(), "firstLink", null);
        setField(term48535, term48535.getClass(), "nextLink", null);
        setField(term48535, term48535.getClass(), "restrictUndefinedVisitor", null);
        setField(term48535, term48535.getClass(), "restrictNullVisitor", null);
        term48536 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term48537 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term48538 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term48536, term48536.getClass(), "str", null);
        setIntField(term48536, term48536.getClass(), "type", 12);
        setField(term48536, term48536.getClass(), "next", null);
        setField(term48537, term48537.getClass(), "str", null);
        setIntField(term48537, term48537.getClass(), "type", 12);
        setField(term48537, term48537.getClass(), "next", null);
        setField(term48537, term48537.getClass(), "first", null);
        setField(term48537, term48537.getClass(), "last", null);
        setField(term48537, term48537.getClass(), "propListHead", null);
        setIntField(term48537, term48537.getClass(), "sourcePosition", 0);
        setField(term48537, term48537.getClass(), "jsType", null);
        setField(term48537, term48537.getClass(), "parent", null);
        setField(term48536, term48536.getClass(), "first", term48537);
        setField(term48538, term48538.getClass(), "str", null);
        setIntField(term48538, term48538.getClass(), "type", 0);
        setField(term48538, term48538.getClass(), "next", null);
        setField(term48538, term48538.getClass(), "first", null);
        setField(term48538, term48538.getClass(), "last", null);
        setField(term48538, term48538.getClass(), "propListHead", null);
        setIntField(term48538, term48538.getClass(), "sourcePosition", 0);
        setField(term48538, term48538.getClass(), "jsType", null);
        setField(term48538, term48538.getClass(), "parent", null);
        setField(term48536, term48536.getClass(), "last", term48538);
        setField(term48536, term48536.getClass(), "propListHead", null);
        setIntField(term48536, term48536.getClass(), "sourcePosition", 0);
        setField(term48536, term48536.getClass(), "jsType", null);
        setField(term48536, term48536.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term48294;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term48202, args);
        assertTrue(recursiveEquals(term48202, term48535));
        assertTrue(recursiveEquals(term48294, term48536));
        assertTrue(recursiveEquals(retValue, null));
    }

};


