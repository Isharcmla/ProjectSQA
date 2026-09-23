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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228058;
     Object term228150;
     Object term228694;
     Object term228695;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term228058 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term228150 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term228242 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term228334 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term228434 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term228526 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term228150, term228150.getClass(), "type", 111);
        setIntField(term228334, term228334.getClass(), "type", 0);
        setField(term228334, term228334.getClass(), "jsType", term228434);
        setField(term228242, term228242.getClass(), "first", term228334);
        setField(term228150, term228150.getClass(), "parent", term228242);
        setIntField(term228526, term228526.getClass(), "type", -1431654433);
        setField(term228526, term228526.getClass(), "jsType", null);
        setField(term228150, term228150.getClass(), "first", term228526);
        term228694 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term228694, term228694.getClass(), "INEQ", null);
        setField(term228694, term228694.getClass(), "convention", null);
        setField(term228694, term228694.getClass(), "typeRegistry", null);
        setField(term228694, term228694.getClass(), "firstLink", null);
        setField(term228694, term228694.getClass(), "nextLink", null);
        setField(term228694, term228694.getClass(), "restrictUndefinedVisitor", null);
        setField(term228694, term228694.getClass(), "restrictNullVisitor", null);
        term228695 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term228696 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term228697 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term228698 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term228699 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term228695, term228695.getClass(), "str", null);
        setIntField(term228695, term228695.getClass(), "type", 111);
        setField(term228695, term228695.getClass(), "next", null);
        setDoubleField(term228696, term228696.getClass(), "number", 0.0);
        setIntField(term228696, term228696.getClass(), "type", -1431654433);
        setField(term228696, term228696.getClass(), "next", null);
        setField(term228696, term228696.getClass(), "first", null);
        setField(term228696, term228696.getClass(), "last", null);
        setField(term228696, term228696.getClass(), "propListHead", null);
        setIntField(term228696, term228696.getClass(), "sourcePosition", 0);
        setField(term228696, term228696.getClass(), "jsType", null);
        setField(term228696, term228696.getClass(), "parent", null);
        setField(term228695, term228695.getClass(), "first", term228696);
        setField(term228695, term228695.getClass(), "last", null);
        setField(term228695, term228695.getClass(), "propListHead", null);
        setIntField(term228695, term228695.getClass(), "sourcePosition", 0);
        setField(term228695, term228695.getClass(), "jsType", null);
        setField(term228697, term228697.getClass(), "str", null);
        setIntField(term228697, term228697.getClass(), "type", 0);
        setField(term228697, term228697.getClass(), "next", null);
        setDoubleField(term228698, term228698.getClass(), "number", 0.0);
        setIntField(term228698, term228698.getClass(), "type", 0);
        setField(term228698, term228698.getClass(), "next", null);
        setField(term228698, term228698.getClass(), "first", null);
        setField(term228698, term228698.getClass(), "last", null);
        setField(term228698, term228698.getClass(), "propListHead", null);
        setIntField(term228698, term228698.getClass(), "sourcePosition", 0);
        setField(term228699, term228699.getClass(), "call", null);
        setField(term228699, term228699.getClass(), "prototypeSlot", null);
        setField(term228699, term228699.getClass(), "kind", null);
        setField(term228699, term228699.getClass(), "typeOfThis", null);
        setField(term228699, term228699.getClass(), "source", null);
        setField(term228699, term228699.getClass(), "implementedInterfaces", null);
        setField(term228699, term228699.getClass(), "extendedInterfaces", null);
        setField(term228699, term228699.getClass(), "subTypes", null);
        setField(term228699, term228699.getClass(), "templateTypeNames", null);
        setField(term228699, term228699.getClass(), "className", null);
        setField(term228699, term228699.getClass(), "properties", null);
        setBooleanField(term228699, term228699.getClass(), "nativeType", false);
        setField(term228699, term228699.getClass(), "implicitPrototypeFallback", null);
        setField(term228699, term228699.getClass(), "ownerFunction", null);
        setBooleanField(term228699, term228699.getClass(), "prettyPrint", false);
        setBooleanField(term228699, term228699.getClass(), "visited", false);
        setField(term228699, term228699.getClass(), "docInfo", null);
        setBooleanField(term228699, term228699.getClass(), "unknown", false);
        setBooleanField(term228699, term228699.getClass(), "resolved", false);
        setField(term228699, term228699.getClass(), "resolveResult", null);
        setBooleanField(term228699, term228699.getClass(), "inTemplatedCheckVisit", false);
        setField(term228699, term228699.getClass(), "registry", null);
        setField(term228698, term228698.getClass(), "jsType", term228699);
        setField(term228698, term228698.getClass(), "parent", null);
        setField(term228697, term228697.getClass(), "first", term228698);
        setField(term228697, term228697.getClass(), "last", null);
        setField(term228697, term228697.getClass(), "propListHead", null);
        setIntField(term228697, term228697.getClass(), "sourcePosition", 0);
        setField(term228697, term228697.getClass(), "jsType", null);
        setField(term228697, term228697.getClass(), "parent", null);
        setField(term228695, term228695.getClass(), "parent", term228697);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term228150;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term228058, args);
        assertTrue(recursiveEquals(term228058, term228694));
        assertTrue(recursiveEquals(term228150, term228695));
        assertTrue(recursiveEquals(retValue, null));
    }

};


