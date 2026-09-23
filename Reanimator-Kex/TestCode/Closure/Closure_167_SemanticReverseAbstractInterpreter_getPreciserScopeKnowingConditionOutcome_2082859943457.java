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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120490;
     Object term120582;
     Object term122868;
     Object term122869;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120490 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term120582 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term120674 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term120784 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setIntField(term120582, term120582.getClass(), "type", 45);
        setField(term120582, term120582.getClass(), "first", term120582);
        setIntField(term120674, term120674.getClass(), "type", -33554990);
        setField(term120674, term120674.getClass(), "jsType", null);
        setField(term120582, term120582.getClass(), "last", term120674);
        setField(term120582, term120582.getClass(), "jsType", term120784);
        term122868 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term122868, term122868.getClass(), "INEQ", null);
        setField(term122868, term122868.getClass(), "convention", null);
        setField(term122868, term122868.getClass(), "typeRegistry", null);
        setField(term122868, term122868.getClass(), "firstLink", null);
        setField(term122868, term122868.getClass(), "nextLink", null);
        setField(term122868, term122868.getClass(), "restrictUndefinedVisitor", null);
        setField(term122868, term122868.getClass(), "restrictNullVisitor", null);
        term122869 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term122870 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term122871 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setDoubleField(term122869, term122869.getClass(), "number", 0.0);
        setIntField(term122869, term122869.getClass(), "type", 45);
        setField(term122869, term122869.getClass(), "next", null);
        setField(term122869, term122869.getClass(), "first", term122869);
        setDoubleField(term122870, term122870.getClass(), "number", 0.0);
        setIntField(term122870, term122870.getClass(), "type", -33554990);
        setField(term122870, term122870.getClass(), "next", null);
        setField(term122870, term122870.getClass(), "first", null);
        setField(term122870, term122870.getClass(), "last", null);
        setField(term122870, term122870.getClass(), "propListHead", null);
        setIntField(term122870, term122870.getClass(), "sourcePosition", 0);
        setField(term122870, term122870.getClass(), "jsType", null);
        setField(term122870, term122870.getClass(), "parent", null);
        setField(term122869, term122869.getClass(), "last", term122870);
        setField(term122869, term122869.getClass(), "propListHead", null);
        setIntField(term122869, term122869.getClass(), "sourcePosition", 0);
        setField(term122871, term122871.getClass(), "call", null);
        setField(term122871, term122871.getClass(), "prototypeSlot", null);
        setField(term122871, term122871.getClass(), "kind", null);
        setField(term122871, term122871.getClass(), "typeOfThis", null);
        setField(term122871, term122871.getClass(), "source", null);
        setField(term122871, term122871.getClass(), "implementedInterfaces", null);
        setField(term122871, term122871.getClass(), "extendedInterfaces", null);
        setField(term122871, term122871.getClass(), "subTypes", null);
        setField(term122871, term122871.getClass(), "templateTypeNames", null);
        setField(term122871, term122871.getClass(), "className", null);
        setField(term122871, term122871.getClass(), "properties", null);
        setBooleanField(term122871, term122871.getClass(), "nativeType", false);
        setField(term122871, term122871.getClass(), "implicitPrototypeFallback", null);
        setField(term122871, term122871.getClass(), "ownerFunction", null);
        setBooleanField(term122871, term122871.getClass(), "prettyPrint", false);
        setBooleanField(term122871, term122871.getClass(), "visited", false);
        setField(term122871, term122871.getClass(), "docInfo", null);
        setBooleanField(term122871, term122871.getClass(), "unknown", false);
        setBooleanField(term122871, term122871.getClass(), "resolved", false);
        setField(term122871, term122871.getClass(), "resolveResult", null);
        setBooleanField(term122871, term122871.getClass(), "inTemplatedCheckVisit", false);
        setField(term122871, term122871.getClass(), "registry", null);
        setField(term122869, term122869.getClass(), "jsType", term122871);
        setField(term122869, term122869.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term120582;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term120490, args);
        assertTrue(recursiveEquals(term120490, term122868));
        assertTrue(recursiveEquals(term120582, term122869));
        assertTrue(recursiveEquals(retValue, null));
    }

};


