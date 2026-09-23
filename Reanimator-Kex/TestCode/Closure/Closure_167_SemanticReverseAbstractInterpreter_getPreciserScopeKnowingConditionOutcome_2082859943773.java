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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231931;
     Object term232023;
     Object term232352;
     Object term232353;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term231931 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term232023 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term232115 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term232225 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setIntField(term232023, term232023.getClass(), "type", 46);
        setField(term232023, term232023.getClass(), "first", term232023);
        setIntField(term232115, term232115.getClass(), "type", -33554991);
        setField(term232115, term232115.getClass(), "jsType", null);
        setField(term232023, term232023.getClass(), "last", term232115);
        setField(term232023, term232023.getClass(), "jsType", term232225);
        term232352 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term232352, term232352.getClass(), "INEQ", null);
        setField(term232352, term232352.getClass(), "convention", null);
        setField(term232352, term232352.getClass(), "typeRegistry", null);
        setField(term232352, term232352.getClass(), "firstLink", null);
        setField(term232352, term232352.getClass(), "nextLink", null);
        setField(term232352, term232352.getClass(), "restrictUndefinedVisitor", null);
        setField(term232352, term232352.getClass(), "restrictNullVisitor", null);
        term232353 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term232354 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term232355 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term232353, term232353.getClass(), "str", null);
        setIntField(term232353, term232353.getClass(), "type", 46);
        setField(term232353, term232353.getClass(), "next", null);
        setField(term232353, term232353.getClass(), "first", term232353);
        setField(term232354, term232354.getClass(), "str", null);
        setIntField(term232354, term232354.getClass(), "type", -33554991);
        setField(term232354, term232354.getClass(), "next", null);
        setField(term232354, term232354.getClass(), "first", null);
        setField(term232354, term232354.getClass(), "last", null);
        setField(term232354, term232354.getClass(), "propListHead", null);
        setIntField(term232354, term232354.getClass(), "sourcePosition", 0);
        setField(term232354, term232354.getClass(), "jsType", null);
        setField(term232354, term232354.getClass(), "parent", null);
        setField(term232353, term232353.getClass(), "last", term232354);
        setField(term232353, term232353.getClass(), "propListHead", null);
        setIntField(term232353, term232353.getClass(), "sourcePosition", 0);
        setField(term232355, term232355.getClass(), "call", null);
        setField(term232355, term232355.getClass(), "prototypeSlot", null);
        setField(term232355, term232355.getClass(), "kind", null);
        setField(term232355, term232355.getClass(), "typeOfThis", null);
        setField(term232355, term232355.getClass(), "source", null);
        setField(term232355, term232355.getClass(), "implementedInterfaces", null);
        setField(term232355, term232355.getClass(), "extendedInterfaces", null);
        setField(term232355, term232355.getClass(), "subTypes", null);
        setField(term232355, term232355.getClass(), "templateTypeNames", null);
        setField(term232355, term232355.getClass(), "className", null);
        setField(term232355, term232355.getClass(), "properties", null);
        setBooleanField(term232355, term232355.getClass(), "nativeType", false);
        setField(term232355, term232355.getClass(), "implicitPrototypeFallback", null);
        setField(term232355, term232355.getClass(), "ownerFunction", null);
        setBooleanField(term232355, term232355.getClass(), "prettyPrint", false);
        setBooleanField(term232355, term232355.getClass(), "visited", false);
        setField(term232355, term232355.getClass(), "docInfo", null);
        setBooleanField(term232355, term232355.getClass(), "unknown", false);
        setBooleanField(term232355, term232355.getClass(), "resolved", false);
        setField(term232355, term232355.getClass(), "resolveResult", null);
        setBooleanField(term232355, term232355.getClass(), "inTemplatedCheckVisit", false);
        setField(term232355, term232355.getClass(), "registry", null);
        setField(term232353, term232353.getClass(), "jsType", term232355);
        setField(term232353, term232353.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term232023;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term231931, args);
        assertTrue(recursiveEquals(term231931, term232352));
        assertTrue(recursiveEquals(term232023, term232353));
        assertTrue(recursiveEquals(retValue, null));
    }

};


