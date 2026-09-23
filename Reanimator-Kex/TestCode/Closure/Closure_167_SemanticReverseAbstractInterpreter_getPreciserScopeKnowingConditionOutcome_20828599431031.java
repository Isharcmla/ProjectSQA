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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term492337;
     Object term492429;
     Object term492944;
     Object term492945;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term492337 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term492429 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term492521 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term492625 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term492717 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term492429, term492429.getClass(), "type", 111);
        setField(term492521, term492521.getClass(), "first", term492521);
        setIntField(term492521, term492521.getClass(), "type", 2144337810);
        setField(term492521, term492521.getClass(), "jsType", term492625);
        setField(term492429, term492429.getClass(), "parent", term492521);
        setIntField(term492717, term492717.getClass(), "type", -2147483635);
        setField(term492717, term492717.getClass(), "jsType", term492625);
        setField(term492429, term492429.getClass(), "first", term492717);
        term492944 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term492944, term492944.getClass(), "INEQ", null);
        setField(term492944, term492944.getClass(), "convention", null);
        setField(term492944, term492944.getClass(), "typeRegistry", null);
        setField(term492944, term492944.getClass(), "firstLink", null);
        setField(term492944, term492944.getClass(), "nextLink", null);
        setField(term492944, term492944.getClass(), "restrictUndefinedVisitor", null);
        setField(term492944, term492944.getClass(), "restrictNullVisitor", null);
        term492945 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term492946 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term492947 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term492948 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term492945, term492945.getClass(), "number", 0.0);
        setIntField(term492945, term492945.getClass(), "type", 111);
        setField(term492945, term492945.getClass(), "next", null);
        setField(term492946, term492946.getClass(), "str", null);
        setIntField(term492946, term492946.getClass(), "type", -2147483635);
        setField(term492946, term492946.getClass(), "next", null);
        setField(term492946, term492946.getClass(), "first", null);
        setField(term492946, term492946.getClass(), "last", null);
        setField(term492946, term492946.getClass(), "propListHead", null);
        setIntField(term492946, term492946.getClass(), "sourcePosition", 0);
        setField(term492947, term492947.getClass(), "call", null);
        setField(term492947, term492947.getClass(), "prototypeSlot", null);
        setField(term492947, term492947.getClass(), "kind", null);
        setField(term492947, term492947.getClass(), "typeOfThis", null);
        setField(term492947, term492947.getClass(), "source", null);
        setField(term492947, term492947.getClass(), "implementedInterfaces", null);
        setField(term492947, term492947.getClass(), "extendedInterfaces", null);
        setField(term492947, term492947.getClass(), "subTypes", null);
        setField(term492947, term492947.getClass(), "templateTypeNames", null);
        setField(term492947, term492947.getClass(), "className", null);
        setField(term492947, term492947.getClass(), "properties", null);
        setBooleanField(term492947, term492947.getClass(), "nativeType", false);
        setField(term492947, term492947.getClass(), "implicitPrototypeFallback", null);
        setField(term492947, term492947.getClass(), "ownerFunction", null);
        setBooleanField(term492947, term492947.getClass(), "prettyPrint", false);
        setBooleanField(term492947, term492947.getClass(), "visited", false);
        setField(term492947, term492947.getClass(), "docInfo", null);
        setBooleanField(term492947, term492947.getClass(), "unknown", false);
        setBooleanField(term492947, term492947.getClass(), "resolved", false);
        setField(term492947, term492947.getClass(), "resolveResult", null);
        setBooleanField(term492947, term492947.getClass(), "inTemplatedCheckVisit", false);
        setField(term492947, term492947.getClass(), "registry", null);
        setField(term492946, term492946.getClass(), "jsType", term492947);
        setField(term492946, term492946.getClass(), "parent", null);
        setField(term492945, term492945.getClass(), "first", term492946);
        setField(term492945, term492945.getClass(), "last", null);
        setField(term492945, term492945.getClass(), "propListHead", null);
        setIntField(term492945, term492945.getClass(), "sourcePosition", 0);
        setField(term492945, term492945.getClass(), "jsType", null);
        setDoubleField(term492948, term492948.getClass(), "number", 0.0);
        setIntField(term492948, term492948.getClass(), "type", 2144337810);
        setField(term492948, term492948.getClass(), "next", null);
        setField(term492948, term492948.getClass(), "first", term492948);
        setField(term492948, term492948.getClass(), "last", null);
        setField(term492948, term492948.getClass(), "propListHead", null);
        setIntField(term492948, term492948.getClass(), "sourcePosition", 0);
        setField(term492948, term492948.getClass(), "jsType", term492947);
        setField(term492948, term492948.getClass(), "parent", null);
        setField(term492945, term492945.getClass(), "parent", term492948);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term492429;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term492337, args);
        assertTrue(recursiveEquals(term492337, term492944));
        assertTrue(recursiveEquals(term492429, term492945));
        assertTrue(recursiveEquals(retValue, null));
    }

};


