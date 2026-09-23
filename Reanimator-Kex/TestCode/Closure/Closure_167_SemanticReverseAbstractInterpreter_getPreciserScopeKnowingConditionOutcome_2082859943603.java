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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169257;
     Object term169349;
     Object term169728;
     Object term169729;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169257 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term169349 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term169441 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term169541 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setIntField(term169349, term169349.getClass(), "type", 45);
        setField(term169349, term169349.getClass(), "first", term169349);
        setIntField(term169441, term169441.getClass(), "type", -33554990);
        setField(term169441, term169441.getClass(), "jsType", null);
        setField(term169349, term169349.getClass(), "last", term169441);
        setField(term169349, term169349.getClass(), "jsType", term169541);
        term169728 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term169728, term169728.getClass(), "INEQ", null);
        setField(term169728, term169728.getClass(), "convention", null);
        setField(term169728, term169728.getClass(), "typeRegistry", null);
        setField(term169728, term169728.getClass(), "firstLink", null);
        setField(term169728, term169728.getClass(), "nextLink", null);
        setField(term169728, term169728.getClass(), "restrictUndefinedVisitor", null);
        setField(term169728, term169728.getClass(), "restrictNullVisitor", null);
        term169729 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term169730 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term169731 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term169729, term169729.getClass(), "str", null);
        setIntField(term169729, term169729.getClass(), "type", 45);
        setField(term169729, term169729.getClass(), "next", null);
        setField(term169729, term169729.getClass(), "first", term169729);
        setField(term169730, term169730.getClass(), "str", null);
        setIntField(term169730, term169730.getClass(), "type", -33554990);
        setField(term169730, term169730.getClass(), "next", null);
        setField(term169730, term169730.getClass(), "first", null);
        setField(term169730, term169730.getClass(), "last", null);
        setField(term169730, term169730.getClass(), "propListHead", null);
        setIntField(term169730, term169730.getClass(), "sourcePosition", 0);
        setField(term169730, term169730.getClass(), "jsType", null);
        setField(term169730, term169730.getClass(), "parent", null);
        setField(term169729, term169729.getClass(), "last", term169730);
        setField(term169729, term169729.getClass(), "propListHead", null);
        setIntField(term169729, term169729.getClass(), "sourcePosition", 0);
        setField(term169731, term169731.getClass(), "call", null);
        setField(term169731, term169731.getClass(), "prototypeSlot", null);
        setField(term169731, term169731.getClass(), "kind", null);
        setField(term169731, term169731.getClass(), "typeOfThis", null);
        setField(term169731, term169731.getClass(), "source", null);
        setField(term169731, term169731.getClass(), "implementedInterfaces", null);
        setField(term169731, term169731.getClass(), "extendedInterfaces", null);
        setField(term169731, term169731.getClass(), "subTypes", null);
        setField(term169731, term169731.getClass(), "templateTypeNames", null);
        setField(term169731, term169731.getClass(), "className", null);
        setField(term169731, term169731.getClass(), "properties", null);
        setBooleanField(term169731, term169731.getClass(), "nativeType", false);
        setField(term169731, term169731.getClass(), "implicitPrototypeFallback", null);
        setField(term169731, term169731.getClass(), "ownerFunction", null);
        setBooleanField(term169731, term169731.getClass(), "prettyPrint", false);
        setBooleanField(term169731, term169731.getClass(), "visited", false);
        setField(term169731, term169731.getClass(), "docInfo", null);
        setBooleanField(term169731, term169731.getClass(), "unknown", false);
        setBooleanField(term169731, term169731.getClass(), "resolved", false);
        setField(term169731, term169731.getClass(), "resolveResult", null);
        setBooleanField(term169731, term169731.getClass(), "inTemplatedCheckVisit", false);
        setField(term169731, term169731.getClass(), "registry", null);
        setField(term169729, term169729.getClass(), "jsType", term169731);
        setField(term169729, term169729.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term169349;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term169257, args);
        assertTrue(recursiveEquals(term169257, term169728));
        assertTrue(recursiveEquals(term169349, term169729));
        assertTrue(recursiveEquals(retValue, null));
    }

};


