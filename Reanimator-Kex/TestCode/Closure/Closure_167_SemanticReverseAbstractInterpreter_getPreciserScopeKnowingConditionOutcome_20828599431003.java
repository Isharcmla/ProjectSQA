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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431003 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term407250;
     Object term407342;
     Object term407657;
     Object term407658;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431003() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term407250 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term407342 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term407434 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term407532 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setIntField(term407342, term407342.getClass(), "type", 46);
        setIntField(term407434, term407434.getClass(), "type", 0);
        setField(term407434, term407434.getClass(), "jsType", null);
        setField(term407342, term407342.getClass(), "first", term407434);
        setField(term407342, term407342.getClass(), "last", term407342);
        setField(term407342, term407342.getClass(), "jsType", term407532);
        term407657 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term407657, term407657.getClass(), "INEQ", null);
        setField(term407657, term407657.getClass(), "convention", null);
        setField(term407657, term407657.getClass(), "typeRegistry", null);
        setField(term407657, term407657.getClass(), "firstLink", null);
        setField(term407657, term407657.getClass(), "nextLink", null);
        setField(term407657, term407657.getClass(), "restrictUndefinedVisitor", null);
        setField(term407657, term407657.getClass(), "restrictNullVisitor", null);
        term407658 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term407659 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term407660 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term407658, term407658.getClass(), "str", null);
        setIntField(term407658, term407658.getClass(), "type", 46);
        setField(term407658, term407658.getClass(), "next", null);
        setDoubleField(term407659, term407659.getClass(), "number", 0.0);
        setIntField(term407659, term407659.getClass(), "type", 0);
        setField(term407659, term407659.getClass(), "next", null);
        setField(term407659, term407659.getClass(), "first", null);
        setField(term407659, term407659.getClass(), "last", null);
        setField(term407659, term407659.getClass(), "propListHead", null);
        setIntField(term407659, term407659.getClass(), "sourcePosition", 0);
        setField(term407659, term407659.getClass(), "jsType", null);
        setField(term407659, term407659.getClass(), "parent", null);
        setField(term407658, term407658.getClass(), "first", term407659);
        setField(term407658, term407658.getClass(), "last", term407658);
        setField(term407658, term407658.getClass(), "propListHead", null);
        setIntField(term407658, term407658.getClass(), "sourcePosition", 0);
        setBooleanField(term407660, term407660.getClass(), "isChecked", false);
        setBooleanField(term407660, term407660.getClass(), "visited", false);
        setField(term407660, term407660.getClass(), "docInfo", null);
        setBooleanField(term407660, term407660.getClass(), "unknown", false);
        setBooleanField(term407660, term407660.getClass(), "resolved", false);
        setField(term407660, term407660.getClass(), "resolveResult", null);
        setBooleanField(term407660, term407660.getClass(), "inTemplatedCheckVisit", false);
        setField(term407660, term407660.getClass(), "registry", null);
        setField(term407658, term407658.getClass(), "jsType", term407660);
        setField(term407658, term407658.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term407342;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term407250, args);
        assertTrue(recursiveEquals(term407250, term407657));
        assertTrue(recursiveEquals(term407342, term407658));
        assertTrue(recursiveEquals(retValue, null));
    }

};


