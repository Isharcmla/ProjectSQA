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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53066;
     Object term53282;
     Object term53622;
     Object term53624;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53066 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object term53212 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$1"));
        setField(term53066, term53066.getClass(), "INEQ", term53212);
        term53282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53466 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term53536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53282, term53282.getClass(), "type", 15);
        setIntField(term53352, term53352.getClass(), "type", 15);
        setField(term53352, term53352.getClass(), "jsType", term53466);
        setField(term53282, term53282.getClass(), "first", term53352);
        setField(term53282, term53282.getClass(), "last", term53536);
        term53622 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object term53623 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$1"));
        setField(term53622, term53622.getClass(), "INEQ", term53623);
        setField(term53622, term53622.getClass(), "convention", null);
        setField(term53622, term53622.getClass(), "typeRegistry", null);
        setField(term53622, term53622.getClass(), "firstLink", null);
        setField(term53622, term53622.getClass(), "nextLink", null);
        setField(term53622, term53622.getClass(), "restrictUndefinedVisitor", null);
        setField(term53622, term53622.getClass(), "restrictNullVisitor", null);
        term53624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53626 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term53627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53624, term53624.getClass(), "type", 15);
        setField(term53624, term53624.getClass(), "next", null);
        setIntField(term53625, term53625.getClass(), "type", 15);
        setField(term53625, term53625.getClass(), "next", null);
        setField(term53625, term53625.getClass(), "first", null);
        setField(term53625, term53625.getClass(), "last", null);
        setField(term53625, term53625.getClass(), "propListHead", null);
        setIntField(term53625, term53625.getClass(), "sourcePosition", 0);
        setField(term53626, term53626.getClass(), "className", null);
        setField(term53626, term53626.getClass(), "properties", null);
        setBooleanField(term53626, term53626.getClass(), "nativeType", false);
        setField(term53626, term53626.getClass(), "implicitPrototypeFallback", null);
        setField(term53626, term53626.getClass(), "ownerFunction", null);
        setBooleanField(term53626, term53626.getClass(), "prettyPrint", false);
        setBooleanField(term53626, term53626.getClass(), "visited", false);
        setField(term53626, term53626.getClass(), "docInfo", null);
        setBooleanField(term53626, term53626.getClass(), "unknown", false);
        setBooleanField(term53626, term53626.getClass(), "resolved", false);
        setField(term53626, term53626.getClass(), "resolveResult", null);
        setBooleanField(term53626, term53626.getClass(), "inTemplatedCheckVisit", false);
        setField(term53626, term53626.getClass(), "registry", null);
        setField(term53625, term53625.getClass(), "jsType", term53626);
        setField(term53625, term53625.getClass(), "parent", null);
        setField(term53624, term53624.getClass(), "first", term53625);
        setIntField(term53627, term53627.getClass(), "type", 0);
        setField(term53627, term53627.getClass(), "next", null);
        setField(term53627, term53627.getClass(), "first", null);
        setField(term53627, term53627.getClass(), "last", null);
        setField(term53627, term53627.getClass(), "propListHead", null);
        setIntField(term53627, term53627.getClass(), "sourcePosition", 0);
        setField(term53627, term53627.getClass(), "jsType", null);
        setField(term53627, term53627.getClass(), "parent", null);
        setField(term53624, term53624.getClass(), "last", term53627);
        setField(term53624, term53624.getClass(), "propListHead", null);
        setIntField(term53624, term53624.getClass(), "sourcePosition", 0);
        setField(term53624, term53624.getClass(), "jsType", null);
        setField(term53624, term53624.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term53282;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term53066, args);
        assertTrue(recursiveEquals(term53066, term53622));
        assertTrue(recursiveEquals(term53282, term53624));
        assertTrue(recursiveEquals(retValue, null));
    }

};


