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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172969;
     Object term173061;
     Object term173608;
     Object term173609;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172969 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term173061 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term173153 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term173253 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term173323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term173413 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setIntField(term173061, term173061.getClass(), "type", 45);
        setIntField(term173153, term173153.getClass(), "type", 1);
        setField(term173153, term173153.getClass(), "jsType", term173253);
        setField(term173061, term173061.getClass(), "first", term173153);
        setIntField(term173323, term173323.getClass(), "type", -16386);
        setField(term173323, term173323.getClass(), "jsType", term173413);
        setField(term173061, term173061.getClass(), "last", term173323);
        term173608 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term173608, term173608.getClass(), "INEQ", null);
        setField(term173608, term173608.getClass(), "convention", null);
        setField(term173608, term173608.getClass(), "typeRegistry", null);
        setField(term173608, term173608.getClass(), "firstLink", null);
        setField(term173608, term173608.getClass(), "nextLink", null);
        setField(term173608, term173608.getClass(), "restrictUndefinedVisitor", null);
        setField(term173608, term173608.getClass(), "restrictNullVisitor", null);
        term173609 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term173610 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term173611 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term173612 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term173613 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setDoubleField(term173609, term173609.getClass(), "number", 0.0);
        setIntField(term173609, term173609.getClass(), "type", 45);
        setField(term173609, term173609.getClass(), "next", null);
        setField(term173610, term173610.getClass(), "str", null);
        setIntField(term173610, term173610.getClass(), "type", 1);
        setField(term173610, term173610.getClass(), "next", null);
        setField(term173610, term173610.getClass(), "first", null);
        setField(term173610, term173610.getClass(), "last", null);
        setField(term173610, term173610.getClass(), "propListHead", null);
        setIntField(term173610, term173610.getClass(), "sourcePosition", 0);
        setField(term173611, term173611.getClass(), "call", null);
        setField(term173611, term173611.getClass(), "prototypeSlot", null);
        setField(term173611, term173611.getClass(), "kind", null);
        setField(term173611, term173611.getClass(), "typeOfThis", null);
        setField(term173611, term173611.getClass(), "source", null);
        setField(term173611, term173611.getClass(), "implementedInterfaces", null);
        setField(term173611, term173611.getClass(), "extendedInterfaces", null);
        setField(term173611, term173611.getClass(), "subTypes", null);
        setField(term173611, term173611.getClass(), "templateTypeNames", null);
        setField(term173611, term173611.getClass(), "className", null);
        setField(term173611, term173611.getClass(), "properties", null);
        setBooleanField(term173611, term173611.getClass(), "nativeType", false);
        setField(term173611, term173611.getClass(), "implicitPrototypeFallback", null);
        setField(term173611, term173611.getClass(), "ownerFunction", null);
        setBooleanField(term173611, term173611.getClass(), "prettyPrint", false);
        setBooleanField(term173611, term173611.getClass(), "visited", false);
        setField(term173611, term173611.getClass(), "docInfo", null);
        setBooleanField(term173611, term173611.getClass(), "unknown", false);
        setBooleanField(term173611, term173611.getClass(), "resolved", false);
        setField(term173611, term173611.getClass(), "resolveResult", null);
        setBooleanField(term173611, term173611.getClass(), "inTemplatedCheckVisit", false);
        setField(term173611, term173611.getClass(), "registry", null);
        setField(term173610, term173610.getClass(), "jsType", term173611);
        setField(term173610, term173610.getClass(), "parent", null);
        setField(term173609, term173609.getClass(), "first", term173610);
        setIntField(term173612, term173612.getClass(), "type", -16386);
        setField(term173612, term173612.getClass(), "next", null);
        setField(term173612, term173612.getClass(), "first", null);
        setField(term173612, term173612.getClass(), "last", null);
        setField(term173612, term173612.getClass(), "propListHead", null);
        setIntField(term173612, term173612.getClass(), "sourcePosition", 0);
        setBooleanField(term173613, term173613.getClass(), "resolved", false);
        setField(term173613, term173613.getClass(), "resolveResult", null);
        setBooleanField(term173613, term173613.getClass(), "inTemplatedCheckVisit", false);
        setField(term173613, term173613.getClass(), "registry", null);
        setField(term173612, term173612.getClass(), "jsType", term173613);
        setField(term173612, term173612.getClass(), "parent", null);
        setField(term173609, term173609.getClass(), "last", term173612);
        setField(term173609, term173609.getClass(), "propListHead", null);
        setIntField(term173609, term173609.getClass(), "sourcePosition", 0);
        setField(term173609, term173609.getClass(), "jsType", null);
        setField(term173609, term173609.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term173061;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term172969, args);
        assertTrue(recursiveEquals(term172969, term173608));
        assertTrue(recursiveEquals(term173061, term173609));
        assertTrue(recursiveEquals(retValue, null));
    }

};


