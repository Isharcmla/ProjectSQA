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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192154;
     Object term192246;
     Object term192645;
     Object term192646;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192154 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term192246 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term192338 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term192426 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term192518 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term192246, term192246.getClass(), "type", 12);
        setIntField(term192338, term192338.getClass(), "type", 12);
        setField(term192338, term192338.getClass(), "jsType", term192426);
        setField(term192246, term192246.getClass(), "first", term192338);
        setIntField(term192518, term192518.getClass(), "type", 0);
        setField(term192518, term192518.getClass(), "jsType", null);
        setField(term192246, term192246.getClass(), "last", term192518);
        term192645 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term192645, term192645.getClass(), "INEQ", null);
        setField(term192645, term192645.getClass(), "convention", null);
        setField(term192645, term192645.getClass(), "typeRegistry", null);
        setField(term192645, term192645.getClass(), "firstLink", null);
        setField(term192645, term192645.getClass(), "nextLink", null);
        setField(term192645, term192645.getClass(), "restrictUndefinedVisitor", null);
        setField(term192645, term192645.getClass(), "restrictNullVisitor", null);
        term192646 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term192647 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term192648 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term192649 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term192646, term192646.getClass(), "number", 0.0);
        setIntField(term192646, term192646.getClass(), "type", 12);
        setField(term192646, term192646.getClass(), "next", null);
        setDoubleField(term192647, term192647.getClass(), "number", 0.0);
        setIntField(term192647, term192647.getClass(), "type", 12);
        setField(term192647, term192647.getClass(), "next", null);
        setField(term192647, term192647.getClass(), "first", null);
        setField(term192647, term192647.getClass(), "last", null);
        setField(term192647, term192647.getClass(), "propListHead", null);
        setIntField(term192647, term192647.getClass(), "sourcePosition", 0);
        setField(term192648, term192648.getClass(), "call", null);
        setField(term192648, term192648.getClass(), "prototypeSlot", null);
        setField(term192648, term192648.getClass(), "kind", null);
        setField(term192648, term192648.getClass(), "typeOfThis", null);
        setField(term192648, term192648.getClass(), "source", null);
        setField(term192648, term192648.getClass(), "implementedInterfaces", null);
        setField(term192648, term192648.getClass(), "extendedInterfaces", null);
        setField(term192648, term192648.getClass(), "subTypes", null);
        setField(term192648, term192648.getClass(), "templateTypeNames", null);
        setField(term192648, term192648.getClass(), "className", null);
        setField(term192648, term192648.getClass(), "properties", null);
        setBooleanField(term192648, term192648.getClass(), "nativeType", false);
        setField(term192648, term192648.getClass(), "implicitPrototypeFallback", null);
        setField(term192648, term192648.getClass(), "ownerFunction", null);
        setBooleanField(term192648, term192648.getClass(), "prettyPrint", false);
        setBooleanField(term192648, term192648.getClass(), "visited", false);
        setField(term192648, term192648.getClass(), "docInfo", null);
        setBooleanField(term192648, term192648.getClass(), "unknown", false);
        setBooleanField(term192648, term192648.getClass(), "resolved", false);
        setField(term192648, term192648.getClass(), "resolveResult", null);
        setBooleanField(term192648, term192648.getClass(), "inTemplatedCheckVisit", false);
        setField(term192648, term192648.getClass(), "registry", null);
        setField(term192647, term192647.getClass(), "jsType", term192648);
        setField(term192647, term192647.getClass(), "parent", null);
        setField(term192646, term192646.getClass(), "first", term192647);
        setField(term192649, term192649.getClass(), "str", null);
        setIntField(term192649, term192649.getClass(), "type", 0);
        setField(term192649, term192649.getClass(), "next", null);
        setField(term192649, term192649.getClass(), "first", null);
        setField(term192649, term192649.getClass(), "last", null);
        setField(term192649, term192649.getClass(), "propListHead", null);
        setIntField(term192649, term192649.getClass(), "sourcePosition", 0);
        setField(term192649, term192649.getClass(), "jsType", null);
        setField(term192649, term192649.getClass(), "parent", null);
        setField(term192646, term192646.getClass(), "last", term192649);
        setField(term192646, term192646.getClass(), "propListHead", null);
        setIntField(term192646, term192646.getClass(), "sourcePosition", 0);
        setField(term192646, term192646.getClass(), "jsType", null);
        setField(term192646, term192646.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term192246;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term192154, args);
        assertTrue(recursiveEquals(term192154, term192645));
        assertTrue(recursiveEquals(term192246, term192646));
        assertTrue(recursiveEquals(retValue, null));
    }

};


