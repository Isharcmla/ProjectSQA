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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166650;
     Object term166742;
     Object term167062;
     Object term167063;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166650 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term166742 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term166834 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term166922 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setIntField(term166742, term166742.getClass(), "type", 46);
        setField(term166742, term166742.getClass(), "first", term166742);
        setIntField(term166834, term166834.getClass(), "type", -33554991);
        setField(term166834, term166834.getClass(), "jsType", null);
        setField(term166742, term166742.getClass(), "last", term166834);
        setField(term166742, term166742.getClass(), "jsType", term166922);
        term167062 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term167062, term167062.getClass(), "INEQ", null);
        setField(term167062, term167062.getClass(), "convention", null);
        setField(term167062, term167062.getClass(), "typeRegistry", null);
        setField(term167062, term167062.getClass(), "firstLink", null);
        setField(term167062, term167062.getClass(), "nextLink", null);
        setField(term167062, term167062.getClass(), "restrictUndefinedVisitor", null);
        setField(term167062, term167062.getClass(), "restrictNullVisitor", null);
        term167063 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term167064 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term167065 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setDoubleField(term167063, term167063.getClass(), "number", 0.0);
        setIntField(term167063, term167063.getClass(), "type", 46);
        setField(term167063, term167063.getClass(), "next", null);
        setField(term167063, term167063.getClass(), "first", term167063);
        setDoubleField(term167064, term167064.getClass(), "number", 0.0);
        setIntField(term167064, term167064.getClass(), "type", -33554991);
        setField(term167064, term167064.getClass(), "next", null);
        setField(term167064, term167064.getClass(), "first", null);
        setField(term167064, term167064.getClass(), "last", null);
        setField(term167064, term167064.getClass(), "propListHead", null);
        setIntField(term167064, term167064.getClass(), "sourcePosition", 0);
        setField(term167064, term167064.getClass(), "jsType", null);
        setField(term167064, term167064.getClass(), "parent", null);
        setField(term167063, term167063.getClass(), "last", term167064);
        setField(term167063, term167063.getClass(), "propListHead", null);
        setIntField(term167063, term167063.getClass(), "sourcePosition", 0);
        setField(term167065, term167065.getClass(), "call", null);
        setField(term167065, term167065.getClass(), "prototypeSlot", null);
        setField(term167065, term167065.getClass(), "kind", null);
        setField(term167065, term167065.getClass(), "typeOfThis", null);
        setField(term167065, term167065.getClass(), "source", null);
        setField(term167065, term167065.getClass(), "implementedInterfaces", null);
        setField(term167065, term167065.getClass(), "extendedInterfaces", null);
        setField(term167065, term167065.getClass(), "subTypes", null);
        setField(term167065, term167065.getClass(), "templateTypeNames", null);
        setField(term167065, term167065.getClass(), "className", null);
        setField(term167065, term167065.getClass(), "properties", null);
        setBooleanField(term167065, term167065.getClass(), "nativeType", false);
        setField(term167065, term167065.getClass(), "implicitPrototypeFallback", null);
        setField(term167065, term167065.getClass(), "ownerFunction", null);
        setBooleanField(term167065, term167065.getClass(), "prettyPrint", false);
        setBooleanField(term167065, term167065.getClass(), "visited", false);
        setField(term167065, term167065.getClass(), "docInfo", null);
        setBooleanField(term167065, term167065.getClass(), "unknown", false);
        setBooleanField(term167065, term167065.getClass(), "resolved", false);
        setField(term167065, term167065.getClass(), "resolveResult", null);
        setBooleanField(term167065, term167065.getClass(), "inTemplatedCheckVisit", false);
        setField(term167065, term167065.getClass(), "registry", null);
        setField(term167063, term167063.getClass(), "jsType", term167065);
        setField(term167063, term167063.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term166742;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term166650, args);
        assertTrue(recursiveEquals(term166650, term167062));
        assertTrue(recursiveEquals(term166742, term167063));
        assertTrue(recursiveEquals(retValue, null));
    }

};


