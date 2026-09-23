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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235827;
     Object term235919;
     Object term236470;
     Object term236471;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term235827 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term235919 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term236011 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term236103 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term236217 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term236309 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term235919, term235919.getClass(), "type", 111);
        setIntField(term236103, term236103.getClass(), "type", 0);
        setField(term236103, term236103.getClass(), "jsType", term236217);
        setField(term236011, term236011.getClass(), "first", term236103);
        setField(term235919, term235919.getClass(), "parent", term236011);
        setIntField(term236309, term236309.getClass(), "type", 0);
        setField(term236309, term236309.getClass(), "jsType", null);
        setField(term235919, term235919.getClass(), "first", term236309);
        term236470 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term236470, term236470.getClass(), "INEQ", null);
        setField(term236470, term236470.getClass(), "convention", null);
        setField(term236470, term236470.getClass(), "typeRegistry", null);
        setField(term236470, term236470.getClass(), "firstLink", null);
        setField(term236470, term236470.getClass(), "nextLink", null);
        setField(term236470, term236470.getClass(), "restrictUndefinedVisitor", null);
        setField(term236470, term236470.getClass(), "restrictNullVisitor", null);
        term236471 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term236472 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term236473 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term236474 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term236475 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term236471, term236471.getClass(), "str", null);
        setIntField(term236471, term236471.getClass(), "type", 111);
        setField(term236471, term236471.getClass(), "next", null);
        setDoubleField(term236472, term236472.getClass(), "number", 0.0);
        setIntField(term236472, term236472.getClass(), "type", 0);
        setField(term236472, term236472.getClass(), "next", null);
        setField(term236472, term236472.getClass(), "first", null);
        setField(term236472, term236472.getClass(), "last", null);
        setField(term236472, term236472.getClass(), "propListHead", null);
        setIntField(term236472, term236472.getClass(), "sourcePosition", 0);
        setField(term236472, term236472.getClass(), "jsType", null);
        setField(term236472, term236472.getClass(), "parent", null);
        setField(term236471, term236471.getClass(), "first", term236472);
        setField(term236471, term236471.getClass(), "last", null);
        setField(term236471, term236471.getClass(), "propListHead", null);
        setIntField(term236471, term236471.getClass(), "sourcePosition", 0);
        setField(term236471, term236471.getClass(), "jsType", null);
        setField(term236473, term236473.getClass(), "str", null);
        setIntField(term236473, term236473.getClass(), "type", 0);
        setField(term236473, term236473.getClass(), "next", null);
        setField(term236474, term236474.getClass(), "str", null);
        setIntField(term236474, term236474.getClass(), "type", 0);
        setField(term236474, term236474.getClass(), "next", null);
        setField(term236474, term236474.getClass(), "first", null);
        setField(term236474, term236474.getClass(), "last", null);
        setField(term236474, term236474.getClass(), "propListHead", null);
        setIntField(term236474, term236474.getClass(), "sourcePosition", 0);
        setField(term236475, term236475.getClass(), "className", null);
        setField(term236475, term236475.getClass(), "properties", null);
        setBooleanField(term236475, term236475.getClass(), "nativeType", false);
        setField(term236475, term236475.getClass(), "implicitPrototypeFallback", null);
        setField(term236475, term236475.getClass(), "ownerFunction", null);
        setBooleanField(term236475, term236475.getClass(), "prettyPrint", false);
        setBooleanField(term236475, term236475.getClass(), "visited", false);
        setField(term236475, term236475.getClass(), "docInfo", null);
        setBooleanField(term236475, term236475.getClass(), "unknown", false);
        setBooleanField(term236475, term236475.getClass(), "resolved", false);
        setField(term236475, term236475.getClass(), "resolveResult", null);
        setBooleanField(term236475, term236475.getClass(), "inTemplatedCheckVisit", false);
        setField(term236475, term236475.getClass(), "registry", null);
        setField(term236474, term236474.getClass(), "jsType", term236475);
        setField(term236474, term236474.getClass(), "parent", null);
        setField(term236473, term236473.getClass(), "first", term236474);
        setField(term236473, term236473.getClass(), "last", null);
        setField(term236473, term236473.getClass(), "propListHead", null);
        setIntField(term236473, term236473.getClass(), "sourcePosition", 0);
        setField(term236473, term236473.getClass(), "jsType", null);
        setField(term236473, term236473.getClass(), "parent", null);
        setField(term236471, term236471.getClass(), "parent", term236473);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term235919;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term235827, args);
        assertTrue(recursiveEquals(term235827, term236470));
        assertTrue(recursiveEquals(term235919, term236471));
        assertTrue(recursiveEquals(retValue, null));
    }

};


