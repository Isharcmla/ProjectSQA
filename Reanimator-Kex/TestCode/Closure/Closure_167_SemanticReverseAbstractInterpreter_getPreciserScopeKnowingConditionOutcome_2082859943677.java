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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196111;
     Object term196203;
     Object term196450;
     Object term196451;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196111 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term196203 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term196295 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term196387 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term196203, term196203.getClass(), "type", 46);
        setIntField(term196295, term196295.getClass(), "type", -47);
        setField(term196203, term196203.getClass(), "first", term196295);
        setIntField(term196387, term196387.getClass(), "type", 46);
        setField(term196203, term196203.getClass(), "last", term196387);
        term196450 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term196450, term196450.getClass(), "INEQ", null);
        setField(term196450, term196450.getClass(), "convention", null);
        setField(term196450, term196450.getClass(), "typeRegistry", null);
        setField(term196450, term196450.getClass(), "firstLink", null);
        setField(term196450, term196450.getClass(), "nextLink", null);
        setField(term196450, term196450.getClass(), "restrictUndefinedVisitor", null);
        setField(term196450, term196450.getClass(), "restrictNullVisitor", null);
        term196451 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term196452 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term196453 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term196451, term196451.getClass(), "number", 0.0);
        setIntField(term196451, term196451.getClass(), "type", 46);
        setField(term196451, term196451.getClass(), "next", null);
        setField(term196452, term196452.getClass(), "str", null);
        setIntField(term196452, term196452.getClass(), "type", -47);
        setField(term196452, term196452.getClass(), "next", null);
        setField(term196452, term196452.getClass(), "first", null);
        setField(term196452, term196452.getClass(), "last", null);
        setField(term196452, term196452.getClass(), "propListHead", null);
        setIntField(term196452, term196452.getClass(), "sourcePosition", 0);
        setField(term196452, term196452.getClass(), "jsType", null);
        setField(term196452, term196452.getClass(), "parent", null);
        setField(term196451, term196451.getClass(), "first", term196452);
        setDoubleField(term196453, term196453.getClass(), "number", 0.0);
        setIntField(term196453, term196453.getClass(), "type", 46);
        setField(term196453, term196453.getClass(), "next", null);
        setField(term196453, term196453.getClass(), "first", null);
        setField(term196453, term196453.getClass(), "last", null);
        setField(term196453, term196453.getClass(), "propListHead", null);
        setIntField(term196453, term196453.getClass(), "sourcePosition", 0);
        setField(term196453, term196453.getClass(), "jsType", null);
        setField(term196453, term196453.getClass(), "parent", null);
        setField(term196451, term196451.getClass(), "last", term196453);
        setField(term196451, term196451.getClass(), "propListHead", null);
        setIntField(term196451, term196451.getClass(), "sourcePosition", 0);
        setField(term196451, term196451.getClass(), "jsType", null);
        setField(term196451, term196451.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term196203;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term196111, args);
        assertTrue(recursiveEquals(term196111, term196450));
        assertTrue(recursiveEquals(term196203, term196451));
        assertTrue(recursiveEquals(retValue, null));
    }

};


