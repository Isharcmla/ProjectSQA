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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363012;
     Object term363104;
     Object term363515;
     Object term363516;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term363012 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term363104 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term363196 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term363296 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term363388 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term363104, term363104.getClass(), "type", 12);
        setIntField(term363196, term363196.getClass(), "type", 0);
        setField(term363196, term363196.getClass(), "jsType", term363296);
        setField(term363104, term363104.getClass(), "first", term363196);
        setIntField(term363388, term363388.getClass(), "type", 12);
        setField(term363388, term363388.getClass(), "jsType", null);
        setField(term363104, term363104.getClass(), "last", term363388);
        term363515 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term363515, term363515.getClass(), "INEQ", null);
        setField(term363515, term363515.getClass(), "convention", null);
        setField(term363515, term363515.getClass(), "typeRegistry", null);
        setField(term363515, term363515.getClass(), "firstLink", null);
        setField(term363515, term363515.getClass(), "nextLink", null);
        setField(term363515, term363515.getClass(), "restrictUndefinedVisitor", null);
        setField(term363515, term363515.getClass(), "restrictNullVisitor", null);
        term363516 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term363517 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term363518 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term363519 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term363516, term363516.getClass(), "number", 0.0);
        setIntField(term363516, term363516.getClass(), "type", 12);
        setField(term363516, term363516.getClass(), "next", null);
        setField(term363517, term363517.getClass(), "str", null);
        setIntField(term363517, term363517.getClass(), "type", 0);
        setField(term363517, term363517.getClass(), "next", null);
        setField(term363517, term363517.getClass(), "first", null);
        setField(term363517, term363517.getClass(), "last", null);
        setField(term363517, term363517.getClass(), "propListHead", null);
        setIntField(term363517, term363517.getClass(), "sourcePosition", 0);
        setField(term363518, term363518.getClass(), "call", null);
        setField(term363518, term363518.getClass(), "prototypeSlot", null);
        setField(term363518, term363518.getClass(), "kind", null);
        setField(term363518, term363518.getClass(), "typeOfThis", null);
        setField(term363518, term363518.getClass(), "source", null);
        setField(term363518, term363518.getClass(), "implementedInterfaces", null);
        setField(term363518, term363518.getClass(), "extendedInterfaces", null);
        setField(term363518, term363518.getClass(), "subTypes", null);
        setField(term363518, term363518.getClass(), "templateTypeNames", null);
        setField(term363518, term363518.getClass(), "className", null);
        setField(term363518, term363518.getClass(), "properties", null);
        setBooleanField(term363518, term363518.getClass(), "nativeType", false);
        setField(term363518, term363518.getClass(), "implicitPrototypeFallback", null);
        setField(term363518, term363518.getClass(), "ownerFunction", null);
        setBooleanField(term363518, term363518.getClass(), "prettyPrint", false);
        setBooleanField(term363518, term363518.getClass(), "visited", false);
        setField(term363518, term363518.getClass(), "docInfo", null);
        setBooleanField(term363518, term363518.getClass(), "unknown", false);
        setBooleanField(term363518, term363518.getClass(), "resolved", false);
        setField(term363518, term363518.getClass(), "resolveResult", null);
        setBooleanField(term363518, term363518.getClass(), "inTemplatedCheckVisit", false);
        setField(term363518, term363518.getClass(), "registry", null);
        setField(term363517, term363517.getClass(), "jsType", term363518);
        setField(term363517, term363517.getClass(), "parent", null);
        setField(term363516, term363516.getClass(), "first", term363517);
        setDoubleField(term363519, term363519.getClass(), "number", 0.0);
        setIntField(term363519, term363519.getClass(), "type", 12);
        setField(term363519, term363519.getClass(), "next", null);
        setField(term363519, term363519.getClass(), "first", null);
        setField(term363519, term363519.getClass(), "last", null);
        setField(term363519, term363519.getClass(), "propListHead", null);
        setIntField(term363519, term363519.getClass(), "sourcePosition", 0);
        setField(term363519, term363519.getClass(), "jsType", null);
        setField(term363519, term363519.getClass(), "parent", null);
        setField(term363516, term363516.getClass(), "last", term363519);
        setField(term363516, term363516.getClass(), "propListHead", null);
        setIntField(term363516, term363516.getClass(), "sourcePosition", 0);
        setField(term363516, term363516.getClass(), "jsType", null);
        setField(term363516, term363516.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term363104;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term363012, args);
        assertTrue(recursiveEquals(term363012, term363515));
        assertTrue(recursiveEquals(term363104, term363516));
        assertTrue(recursiveEquals(retValue, null));
    }

};


