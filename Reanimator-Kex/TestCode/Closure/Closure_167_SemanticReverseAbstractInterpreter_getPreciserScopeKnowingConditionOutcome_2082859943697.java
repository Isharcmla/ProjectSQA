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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202531;
     Object term202623;
     Object term203235;
     Object term203236;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202531 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term202623 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term202715 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term202807 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term202917 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term203009 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term202623, term202623.getClass(), "type", 111);
        setIntField(term202807, term202807.getClass(), "type", -1838535544);
        setField(term202807, term202807.getClass(), "jsType", term202917);
        setField(term202715, term202715.getClass(), "first", term202807);
        setField(term202623, term202623.getClass(), "parent", term202715);
        setIntField(term203009, term203009.getClass(), "type", 1838273399);
        setField(term203009, term203009.getClass(), "jsType", term202917);
        setField(term202623, term202623.getClass(), "first", term203009);
        term203235 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term203235, term203235.getClass(), "INEQ", null);
        setField(term203235, term203235.getClass(), "convention", null);
        setField(term203235, term203235.getClass(), "typeRegistry", null);
        setField(term203235, term203235.getClass(), "firstLink", null);
        setField(term203235, term203235.getClass(), "nextLink", null);
        setField(term203235, term203235.getClass(), "restrictUndefinedVisitor", null);
        setField(term203235, term203235.getClass(), "restrictNullVisitor", null);
        term203236 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term203237 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term203238 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term203239 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term203240 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term203236, term203236.getClass(), "str", null);
        setIntField(term203236, term203236.getClass(), "type", 111);
        setField(term203236, term203236.getClass(), "next", null);
        setDoubleField(term203237, term203237.getClass(), "number", 0.0);
        setIntField(term203237, term203237.getClass(), "type", 1838273399);
        setField(term203237, term203237.getClass(), "next", null);
        setField(term203237, term203237.getClass(), "first", null);
        setField(term203237, term203237.getClass(), "last", null);
        setField(term203237, term203237.getClass(), "propListHead", null);
        setIntField(term203237, term203237.getClass(), "sourcePosition", 0);
        setField(term203238, term203238.getClass(), "call", null);
        setField(term203238, term203238.getClass(), "prototypeSlot", null);
        setField(term203238, term203238.getClass(), "kind", null);
        setField(term203238, term203238.getClass(), "typeOfThis", null);
        setField(term203238, term203238.getClass(), "source", null);
        setField(term203238, term203238.getClass(), "implementedInterfaces", null);
        setField(term203238, term203238.getClass(), "extendedInterfaces", null);
        setField(term203238, term203238.getClass(), "subTypes", null);
        setField(term203238, term203238.getClass(), "templateTypeNames", null);
        setField(term203238, term203238.getClass(), "className", null);
        setField(term203238, term203238.getClass(), "properties", null);
        setBooleanField(term203238, term203238.getClass(), "nativeType", false);
        setField(term203238, term203238.getClass(), "implicitPrototypeFallback", null);
        setField(term203238, term203238.getClass(), "ownerFunction", null);
        setBooleanField(term203238, term203238.getClass(), "prettyPrint", false);
        setBooleanField(term203238, term203238.getClass(), "visited", false);
        setField(term203238, term203238.getClass(), "docInfo", null);
        setBooleanField(term203238, term203238.getClass(), "unknown", false);
        setBooleanField(term203238, term203238.getClass(), "resolved", false);
        setField(term203238, term203238.getClass(), "resolveResult", null);
        setBooleanField(term203238, term203238.getClass(), "inTemplatedCheckVisit", false);
        setField(term203238, term203238.getClass(), "registry", null);
        setField(term203237, term203237.getClass(), "jsType", term203238);
        setField(term203237, term203237.getClass(), "parent", null);
        setField(term203236, term203236.getClass(), "first", term203237);
        setField(term203236, term203236.getClass(), "last", null);
        setField(term203236, term203236.getClass(), "propListHead", null);
        setIntField(term203236, term203236.getClass(), "sourcePosition", 0);
        setField(term203236, term203236.getClass(), "jsType", null);
        setField(term203239, term203239.getClass(), "str", null);
        setIntField(term203239, term203239.getClass(), "type", 0);
        setField(term203239, term203239.getClass(), "next", null);
        setField(term203240, term203240.getClass(), "str", null);
        setIntField(term203240, term203240.getClass(), "type", -1838535544);
        setField(term203240, term203240.getClass(), "next", null);
        setField(term203240, term203240.getClass(), "first", null);
        setField(term203240, term203240.getClass(), "last", null);
        setField(term203240, term203240.getClass(), "propListHead", null);
        setIntField(term203240, term203240.getClass(), "sourcePosition", 0);
        setField(term203240, term203240.getClass(), "jsType", term203238);
        setField(term203240, term203240.getClass(), "parent", null);
        setField(term203239, term203239.getClass(), "first", term203240);
        setField(term203239, term203239.getClass(), "last", null);
        setField(term203239, term203239.getClass(), "propListHead", null);
        setIntField(term203239, term203239.getClass(), "sourcePosition", 0);
        setField(term203239, term203239.getClass(), "jsType", null);
        setField(term203239, term203239.getClass(), "parent", null);
        setField(term203236, term203236.getClass(), "parent", term203239);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term202623;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term202531, args);
        assertTrue(recursiveEquals(term202531, term203235));
        assertTrue(recursiveEquals(term202623, term203236));
        assertTrue(recursiveEquals(retValue, null));
    }

};


