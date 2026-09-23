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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213087;
     Object term213179;
     Object term213892;
     Object term213893;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213087 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term213179 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term213271 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term213385 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term213477 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term213565 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setIntField(term213179, term213179.getClass(), "type", 46);
        setIntField(term213271, term213271.getClass(), "type", 0);
        setField(term213271, term213271.getClass(), "jsType", term213385);
        setField(term213179, term213179.getClass(), "first", term213271);
        setIntField(term213477, term213477.getClass(), "type", 0);
        setField(term213477, term213477.getClass(), "jsType", term213565);
        setField(term213179, term213179.getClass(), "last", term213477);
        term213892 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term213892, term213892.getClass(), "INEQ", null);
        setField(term213892, term213892.getClass(), "convention", null);
        setField(term213892, term213892.getClass(), "typeRegistry", null);
        setField(term213892, term213892.getClass(), "firstLink", null);
        setField(term213892, term213892.getClass(), "nextLink", null);
        setField(term213892, term213892.getClass(), "restrictUndefinedVisitor", null);
        setField(term213892, term213892.getClass(), "restrictNullVisitor", null);
        term213893 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term213894 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term213895 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term213896 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term213897 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term213893, term213893.getClass(), "str", null);
        setIntField(term213893, term213893.getClass(), "type", 46);
        setField(term213893, term213893.getClass(), "next", null);
        setField(term213894, term213894.getClass(), "str", null);
        setIntField(term213894, term213894.getClass(), "type", 0);
        setField(term213894, term213894.getClass(), "next", null);
        setField(term213894, term213894.getClass(), "first", null);
        setField(term213894, term213894.getClass(), "last", null);
        setField(term213894, term213894.getClass(), "propListHead", null);
        setIntField(term213894, term213894.getClass(), "sourcePosition", 0);
        setField(term213895, term213895.getClass(), "className", null);
        setField(term213895, term213895.getClass(), "properties", null);
        setBooleanField(term213895, term213895.getClass(), "nativeType", false);
        setField(term213895, term213895.getClass(), "implicitPrototypeFallback", null);
        setField(term213895, term213895.getClass(), "ownerFunction", null);
        setBooleanField(term213895, term213895.getClass(), "prettyPrint", false);
        setBooleanField(term213895, term213895.getClass(), "visited", false);
        setField(term213895, term213895.getClass(), "docInfo", null);
        setBooleanField(term213895, term213895.getClass(), "unknown", false);
        setBooleanField(term213895, term213895.getClass(), "resolved", false);
        setField(term213895, term213895.getClass(), "resolveResult", null);
        setBooleanField(term213895, term213895.getClass(), "inTemplatedCheckVisit", false);
        setField(term213895, term213895.getClass(), "registry", null);
        setField(term213894, term213894.getClass(), "jsType", term213895);
        setField(term213894, term213894.getClass(), "parent", null);
        setField(term213893, term213893.getClass(), "first", term213894);
        setDoubleField(term213896, term213896.getClass(), "number", 0.0);
        setIntField(term213896, term213896.getClass(), "type", 0);
        setField(term213896, term213896.getClass(), "next", null);
        setField(term213896, term213896.getClass(), "first", null);
        setField(term213896, term213896.getClass(), "last", null);
        setField(term213896, term213896.getClass(), "propListHead", null);
        setIntField(term213896, term213896.getClass(), "sourcePosition", 0);
        setField(term213897, term213897.getClass(), "call", null);
        setField(term213897, term213897.getClass(), "prototypeSlot", null);
        setField(term213897, term213897.getClass(), "kind", null);
        setField(term213897, term213897.getClass(), "typeOfThis", null);
        setField(term213897, term213897.getClass(), "source", null);
        setField(term213897, term213897.getClass(), "implementedInterfaces", null);
        setField(term213897, term213897.getClass(), "extendedInterfaces", null);
        setField(term213897, term213897.getClass(), "subTypes", null);
        setField(term213897, term213897.getClass(), "templateTypeNames", null);
        setField(term213897, term213897.getClass(), "className", null);
        setField(term213897, term213897.getClass(), "properties", null);
        setBooleanField(term213897, term213897.getClass(), "nativeType", false);
        setField(term213897, term213897.getClass(), "implicitPrototypeFallback", null);
        setField(term213897, term213897.getClass(), "ownerFunction", null);
        setBooleanField(term213897, term213897.getClass(), "prettyPrint", false);
        setBooleanField(term213897, term213897.getClass(), "visited", false);
        setField(term213897, term213897.getClass(), "docInfo", null);
        setBooleanField(term213897, term213897.getClass(), "unknown", false);
        setBooleanField(term213897, term213897.getClass(), "resolved", false);
        setField(term213897, term213897.getClass(), "resolveResult", null);
        setBooleanField(term213897, term213897.getClass(), "inTemplatedCheckVisit", false);
        setField(term213897, term213897.getClass(), "registry", null);
        setField(term213896, term213896.getClass(), "jsType", term213897);
        setField(term213896, term213896.getClass(), "parent", null);
        setField(term213893, term213893.getClass(), "last", term213896);
        setField(term213893, term213893.getClass(), "propListHead", null);
        setIntField(term213893, term213893.getClass(), "sourcePosition", 0);
        setField(term213893, term213893.getClass(), "jsType", null);
        setField(term213893, term213893.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term213179;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term213087, args);
        assertTrue(recursiveEquals(term213087, term213892));
        assertTrue(recursiveEquals(term213179, term213893));
        assertTrue(recursiveEquals(retValue, null));
    }

};


