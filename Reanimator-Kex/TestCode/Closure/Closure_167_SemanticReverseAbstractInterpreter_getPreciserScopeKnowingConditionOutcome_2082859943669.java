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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193892;
     Object term193984;
     Object term194204;
     Object term194205;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193892 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term193984 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term194076 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term194146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term193984, term193984.getClass(), "type", 46);
        setIntField(term194076, term194076.getClass(), "type", -47);
        setField(term193984, term193984.getClass(), "first", term194076);
        setIntField(term194146, term194146.getClass(), "type", 46);
        setField(term193984, term193984.getClass(), "last", term194146);
        term194204 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term194204, term194204.getClass(), "INEQ", null);
        setField(term194204, term194204.getClass(), "convention", null);
        setField(term194204, term194204.getClass(), "typeRegistry", null);
        setField(term194204, term194204.getClass(), "firstLink", null);
        setField(term194204, term194204.getClass(), "nextLink", null);
        setField(term194204, term194204.getClass(), "restrictUndefinedVisitor", null);
        setField(term194204, term194204.getClass(), "restrictNullVisitor", null);
        term194205 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term194206 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term194207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term194205, term194205.getClass(), "number", 0.0);
        setIntField(term194205, term194205.getClass(), "type", 46);
        setField(term194205, term194205.getClass(), "next", null);
        setField(term194206, term194206.getClass(), "str", null);
        setIntField(term194206, term194206.getClass(), "type", -47);
        setField(term194206, term194206.getClass(), "next", null);
        setField(term194206, term194206.getClass(), "first", null);
        setField(term194206, term194206.getClass(), "last", null);
        setField(term194206, term194206.getClass(), "propListHead", null);
        setIntField(term194206, term194206.getClass(), "sourcePosition", 0);
        setField(term194206, term194206.getClass(), "jsType", null);
        setField(term194206, term194206.getClass(), "parent", null);
        setField(term194205, term194205.getClass(), "first", term194206);
        setIntField(term194207, term194207.getClass(), "type", 46);
        setField(term194207, term194207.getClass(), "next", null);
        setField(term194207, term194207.getClass(), "first", null);
        setField(term194207, term194207.getClass(), "last", null);
        setField(term194207, term194207.getClass(), "propListHead", null);
        setIntField(term194207, term194207.getClass(), "sourcePosition", 0);
        setField(term194207, term194207.getClass(), "jsType", null);
        setField(term194207, term194207.getClass(), "parent", null);
        setField(term194205, term194205.getClass(), "last", term194207);
        setField(term194205, term194205.getClass(), "propListHead", null);
        setIntField(term194205, term194205.getClass(), "sourcePosition", 0);
        setField(term194205, term194205.getClass(), "jsType", null);
        setField(term194205, term194205.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term193984;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term193892, args);
        assertTrue(recursiveEquals(term193892, term194204));
        assertTrue(recursiveEquals(term193984, term194205));
        assertTrue(recursiveEquals(retValue, null));
    }

};


