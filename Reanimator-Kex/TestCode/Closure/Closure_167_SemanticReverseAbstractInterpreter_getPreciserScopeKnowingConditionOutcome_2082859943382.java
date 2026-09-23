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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100147;
     Object term100239;
     Object term100930;
     Object term100931;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100147 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term100239 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term100331 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term100423 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term100493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term100239, term100239.getClass(), "type", 111);
        setIntField(term100423, term100423.getClass(), "type", 111);
        setField(term100331, term100331.getClass(), "first", term100423);
        setField(term100239, term100239.getClass(), "parent", term100331);
        setIntField(term100493, term100493.getClass(), "type", 111);
        setField(term100239, term100239.getClass(), "first", term100493);
        term100930 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term100930, term100930.getClass(), "INEQ", null);
        setField(term100930, term100930.getClass(), "convention", null);
        setField(term100930, term100930.getClass(), "typeRegistry", null);
        setField(term100930, term100930.getClass(), "firstLink", null);
        setField(term100930, term100930.getClass(), "nextLink", null);
        setField(term100930, term100930.getClass(), "restrictUndefinedVisitor", null);
        setField(term100930, term100930.getClass(), "restrictNullVisitor", null);
        term100931 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term100932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100933 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term100934 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term100931, term100931.getClass(), "str", null);
        setIntField(term100931, term100931.getClass(), "type", 111);
        setField(term100931, term100931.getClass(), "next", null);
        setIntField(term100932, term100932.getClass(), "type", 111);
        setField(term100932, term100932.getClass(), "next", null);
        setField(term100932, term100932.getClass(), "first", null);
        setField(term100932, term100932.getClass(), "last", null);
        setField(term100932, term100932.getClass(), "propListHead", null);
        setIntField(term100932, term100932.getClass(), "sourcePosition", 0);
        setField(term100932, term100932.getClass(), "jsType", null);
        setField(term100932, term100932.getClass(), "parent", null);
        setField(term100931, term100931.getClass(), "first", term100932);
        setField(term100931, term100931.getClass(), "last", null);
        setField(term100931, term100931.getClass(), "propListHead", null);
        setIntField(term100931, term100931.getClass(), "sourcePosition", 0);
        setField(term100931, term100931.getClass(), "jsType", null);
        setField(term100933, term100933.getClass(), "str", null);
        setIntField(term100933, term100933.getClass(), "type", 0);
        setField(term100933, term100933.getClass(), "next", null);
        setDoubleField(term100934, term100934.getClass(), "number", 0.0);
        setIntField(term100934, term100934.getClass(), "type", 111);
        setField(term100934, term100934.getClass(), "next", null);
        setField(term100934, term100934.getClass(), "first", null);
        setField(term100934, term100934.getClass(), "last", null);
        setField(term100934, term100934.getClass(), "propListHead", null);
        setIntField(term100934, term100934.getClass(), "sourcePosition", 0);
        setField(term100934, term100934.getClass(), "jsType", null);
        setField(term100934, term100934.getClass(), "parent", null);
        setField(term100933, term100933.getClass(), "first", term100934);
        setField(term100933, term100933.getClass(), "last", null);
        setField(term100933, term100933.getClass(), "propListHead", null);
        setIntField(term100933, term100933.getClass(), "sourcePosition", 0);
        setField(term100933, term100933.getClass(), "jsType", null);
        setField(term100933, term100933.getClass(), "parent", null);
        setField(term100931, term100931.getClass(), "parent", term100933);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term100239;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term100147, args);
        assertTrue(recursiveEquals(term100147, term100930));
        assertTrue(recursiveEquals(term100239, term100931));
        assertTrue(recursiveEquals(retValue, null));
    }

};


