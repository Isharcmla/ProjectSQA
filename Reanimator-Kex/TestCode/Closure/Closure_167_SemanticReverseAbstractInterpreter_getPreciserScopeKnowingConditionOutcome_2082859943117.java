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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25256;
     Object term25326;
     Object term25523;
     Object term25524;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25256 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term25326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25326, term25326.getClass(), "type", 12);
        setIntField(term25396, term25396.getClass(), "type", 12);
        setField(term25326, term25326.getClass(), "first", term25396);
        setIntField(term25466, term25466.getClass(), "type", 12);
        setField(term25326, term25326.getClass(), "last", term25466);
        term25523 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term25523, term25523.getClass(), "INEQ", null);
        setField(term25523, term25523.getClass(), "convention", null);
        setField(term25523, term25523.getClass(), "typeRegistry", null);
        setField(term25523, term25523.getClass(), "firstLink", null);
        setField(term25523, term25523.getClass(), "nextLink", null);
        setField(term25523, term25523.getClass(), "restrictUndefinedVisitor", null);
        setField(term25523, term25523.getClass(), "restrictNullVisitor", null);
        term25524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25526 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25524, term25524.getClass(), "type", 12);
        setField(term25524, term25524.getClass(), "next", null);
        setIntField(term25525, term25525.getClass(), "type", 12);
        setField(term25525, term25525.getClass(), "next", null);
        setField(term25525, term25525.getClass(), "first", null);
        setField(term25525, term25525.getClass(), "last", null);
        setField(term25525, term25525.getClass(), "propListHead", null);
        setIntField(term25525, term25525.getClass(), "sourcePosition", 0);
        setField(term25525, term25525.getClass(), "jsType", null);
        setField(term25525, term25525.getClass(), "parent", null);
        setField(term25524, term25524.getClass(), "first", term25525);
        setIntField(term25526, term25526.getClass(), "type", 12);
        setField(term25526, term25526.getClass(), "next", null);
        setField(term25526, term25526.getClass(), "first", null);
        setField(term25526, term25526.getClass(), "last", null);
        setField(term25526, term25526.getClass(), "propListHead", null);
        setIntField(term25526, term25526.getClass(), "sourcePosition", 0);
        setField(term25526, term25526.getClass(), "jsType", null);
        setField(term25526, term25526.getClass(), "parent", null);
        setField(term25524, term25524.getClass(), "last", term25526);
        setField(term25524, term25524.getClass(), "propListHead", null);
        setIntField(term25524, term25524.getClass(), "sourcePosition", 0);
        setField(term25524, term25524.getClass(), "jsType", null);
        setField(term25524, term25524.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term25326;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term25256, args);
        assertTrue(recursiveEquals(term25256, term25523));
        assertTrue(recursiveEquals(term25326, term25524));
        assertTrue(recursiveEquals(retValue, null));
    }

};


