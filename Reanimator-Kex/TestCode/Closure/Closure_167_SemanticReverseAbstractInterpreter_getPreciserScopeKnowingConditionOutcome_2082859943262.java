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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64503;
     Object term64595;
     Object term65381;
     Object term65382;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64503 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term64595 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term64687 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term64787 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setIntField(term64595, term64595.getClass(), "type", 13);
        setField(term64595, term64595.getClass(), "first", term64595);
        setIntField(term64687, term64687.getClass(), "type", -33554958);
        setField(term64687, term64687.getClass(), "jsType", null);
        setField(term64595, term64595.getClass(), "last", term64687);
        setField(term64595, term64595.getClass(), "jsType", term64787);
        term65381 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term65381, term65381.getClass(), "INEQ", null);
        setField(term65381, term65381.getClass(), "convention", null);
        setField(term65381, term65381.getClass(), "typeRegistry", null);
        setField(term65381, term65381.getClass(), "firstLink", null);
        setField(term65381, term65381.getClass(), "nextLink", null);
        setField(term65381, term65381.getClass(), "restrictUndefinedVisitor", null);
        setField(term65381, term65381.getClass(), "restrictNullVisitor", null);
        term65382 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term65383 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term65384 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term65382, term65382.getClass(), "str", null);
        setIntField(term65382, term65382.getClass(), "type", 13);
        setField(term65382, term65382.getClass(), "next", null);
        setField(term65382, term65382.getClass(), "first", term65382);
        setField(term65383, term65383.getClass(), "str", null);
        setIntField(term65383, term65383.getClass(), "type", -33554958);
        setField(term65383, term65383.getClass(), "next", null);
        setField(term65383, term65383.getClass(), "first", null);
        setField(term65383, term65383.getClass(), "last", null);
        setField(term65383, term65383.getClass(), "propListHead", null);
        setIntField(term65383, term65383.getClass(), "sourcePosition", 0);
        setField(term65383, term65383.getClass(), "jsType", null);
        setField(term65383, term65383.getClass(), "parent", null);
        setField(term65382, term65382.getClass(), "last", term65383);
        setField(term65382, term65382.getClass(), "propListHead", null);
        setIntField(term65382, term65382.getClass(), "sourcePosition", 0);
        setField(term65384, term65384.getClass(), "call", null);
        setField(term65384, term65384.getClass(), "prototypeSlot", null);
        setField(term65384, term65384.getClass(), "kind", null);
        setField(term65384, term65384.getClass(), "typeOfThis", null);
        setField(term65384, term65384.getClass(), "source", null);
        setField(term65384, term65384.getClass(), "implementedInterfaces", null);
        setField(term65384, term65384.getClass(), "extendedInterfaces", null);
        setField(term65384, term65384.getClass(), "subTypes", null);
        setField(term65384, term65384.getClass(), "templateTypeNames", null);
        setField(term65384, term65384.getClass(), "className", null);
        setField(term65384, term65384.getClass(), "properties", null);
        setBooleanField(term65384, term65384.getClass(), "nativeType", false);
        setField(term65384, term65384.getClass(), "implicitPrototypeFallback", null);
        setField(term65384, term65384.getClass(), "ownerFunction", null);
        setBooleanField(term65384, term65384.getClass(), "prettyPrint", false);
        setBooleanField(term65384, term65384.getClass(), "visited", false);
        setField(term65384, term65384.getClass(), "docInfo", null);
        setBooleanField(term65384, term65384.getClass(), "unknown", false);
        setBooleanField(term65384, term65384.getClass(), "resolved", false);
        setField(term65384, term65384.getClass(), "resolveResult", null);
        setBooleanField(term65384, term65384.getClass(), "inTemplatedCheckVisit", false);
        setField(term65384, term65384.getClass(), "registry", null);
        setField(term65382, term65382.getClass(), "jsType", term65384);
        setField(term65382, term65382.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term64595;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term64503, args);
        assertTrue(recursiveEquals(term64503, term65381));
        assertTrue(recursiveEquals(term64595, term65382));
        assertTrue(recursiveEquals(retValue, null));
    }

};


