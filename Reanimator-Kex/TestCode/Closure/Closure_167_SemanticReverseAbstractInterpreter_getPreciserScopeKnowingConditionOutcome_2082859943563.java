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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157100;
     Object term157192;
     Object term157660;
     Object term157661;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157100 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term157192 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term157284 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term157376 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term157472 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        Object term157542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term157192, term157192.getClass(), "type", 111);
        setIntField(term157376, term157376.getClass(), "type", 0);
        setField(term157376, term157376.getClass(), "jsType", term157472);
        setField(term157284, term157284.getClass(), "first", term157376);
        setField(term157192, term157192.getClass(), "parent", term157284);
        setIntField(term157542, term157542.getClass(), "type", 1431666654);
        setField(term157542, term157542.getClass(), "jsType", null);
        setField(term157192, term157192.getClass(), "first", term157542);
        term157660 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term157660, term157660.getClass(), "INEQ", null);
        setField(term157660, term157660.getClass(), "convention", null);
        setField(term157660, term157660.getClass(), "typeRegistry", null);
        setField(term157660, term157660.getClass(), "firstLink", null);
        setField(term157660, term157660.getClass(), "nextLink", null);
        setField(term157660, term157660.getClass(), "restrictUndefinedVisitor", null);
        setField(term157660, term157660.getClass(), "restrictNullVisitor", null);
        term157661 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term157662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term157663 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term157664 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term157665 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setDoubleField(term157661, term157661.getClass(), "number", 0.0);
        setIntField(term157661, term157661.getClass(), "type", 111);
        setField(term157661, term157661.getClass(), "next", null);
        setIntField(term157662, term157662.getClass(), "type", 1431666654);
        setField(term157662, term157662.getClass(), "next", null);
        setField(term157662, term157662.getClass(), "first", null);
        setField(term157662, term157662.getClass(), "last", null);
        setField(term157662, term157662.getClass(), "propListHead", null);
        setIntField(term157662, term157662.getClass(), "sourcePosition", 0);
        setField(term157662, term157662.getClass(), "jsType", null);
        setField(term157662, term157662.getClass(), "parent", null);
        setField(term157661, term157661.getClass(), "first", term157662);
        setField(term157661, term157661.getClass(), "last", null);
        setField(term157661, term157661.getClass(), "propListHead", null);
        setIntField(term157661, term157661.getClass(), "sourcePosition", 0);
        setField(term157661, term157661.getClass(), "jsType", null);
        setDoubleField(term157663, term157663.getClass(), "number", 0.0);
        setIntField(term157663, term157663.getClass(), "type", 0);
        setField(term157663, term157663.getClass(), "next", null);
        setField(term157664, term157664.getClass(), "str", null);
        setIntField(term157664, term157664.getClass(), "type", 0);
        setField(term157664, term157664.getClass(), "next", null);
        setField(term157664, term157664.getClass(), "first", null);
        setField(term157664, term157664.getClass(), "last", null);
        setField(term157664, term157664.getClass(), "propListHead", null);
        setIntField(term157664, term157664.getClass(), "sourcePosition", 0);
        setBooleanField(term157665, term157665.getClass(), "resolved", false);
        setField(term157665, term157665.getClass(), "resolveResult", null);
        setBooleanField(term157665, term157665.getClass(), "inTemplatedCheckVisit", false);
        setField(term157665, term157665.getClass(), "registry", null);
        setField(term157664, term157664.getClass(), "jsType", term157665);
        setField(term157664, term157664.getClass(), "parent", null);
        setField(term157663, term157663.getClass(), "first", term157664);
        setField(term157663, term157663.getClass(), "last", null);
        setField(term157663, term157663.getClass(), "propListHead", null);
        setIntField(term157663, term157663.getClass(), "sourcePosition", 0);
        setField(term157663, term157663.getClass(), "jsType", null);
        setField(term157663, term157663.getClass(), "parent", null);
        setField(term157661, term157661.getClass(), "parent", term157663);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term157192;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term157100, args);
        assertTrue(recursiveEquals(term157100, term157660));
        assertTrue(recursiveEquals(term157192, term157661));
        assertTrue(recursiveEquals(retValue, null));
    }

};


