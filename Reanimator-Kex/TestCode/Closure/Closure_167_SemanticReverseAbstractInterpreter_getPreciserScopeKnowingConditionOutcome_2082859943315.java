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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80971;
     Object term81063;
     Object term81402;
     Object term81403;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80971 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term81063 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term81155 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term81247 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term81317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term81063, term81063.getClass(), "type", 111);
        setIntField(term81247, term81247.getClass(), "type", 111);
        setField(term81155, term81155.getClass(), "first", term81247);
        setField(term81063, term81063.getClass(), "parent", term81155);
        setField(term81063, term81063.getClass(), "first", term81317);
        term81402 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term81402, term81402.getClass(), "INEQ", null);
        setField(term81402, term81402.getClass(), "convention", null);
        setField(term81402, term81402.getClass(), "typeRegistry", null);
        setField(term81402, term81402.getClass(), "firstLink", null);
        setField(term81402, term81402.getClass(), "nextLink", null);
        setField(term81402, term81402.getClass(), "restrictUndefinedVisitor", null);
        setField(term81402, term81402.getClass(), "restrictNullVisitor", null);
        term81403 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term81404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81405 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term81406 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term81403, term81403.getClass(), "str", null);
        setIntField(term81403, term81403.getClass(), "type", 111);
        setField(term81403, term81403.getClass(), "next", null);
        setIntField(term81404, term81404.getClass(), "type", 0);
        setField(term81404, term81404.getClass(), "next", null);
        setField(term81404, term81404.getClass(), "first", null);
        setField(term81404, term81404.getClass(), "last", null);
        setField(term81404, term81404.getClass(), "propListHead", null);
        setIntField(term81404, term81404.getClass(), "sourcePosition", 0);
        setField(term81404, term81404.getClass(), "jsType", null);
        setField(term81404, term81404.getClass(), "parent", null);
        setField(term81403, term81403.getClass(), "first", term81404);
        setField(term81403, term81403.getClass(), "last", null);
        setField(term81403, term81403.getClass(), "propListHead", null);
        setIntField(term81403, term81403.getClass(), "sourcePosition", 0);
        setField(term81403, term81403.getClass(), "jsType", null);
        setField(term81405, term81405.getClass(), "str", null);
        setIntField(term81405, term81405.getClass(), "type", 0);
        setField(term81405, term81405.getClass(), "next", null);
        setDoubleField(term81406, term81406.getClass(), "number", 0.0);
        setIntField(term81406, term81406.getClass(), "type", 111);
        setField(term81406, term81406.getClass(), "next", null);
        setField(term81406, term81406.getClass(), "first", null);
        setField(term81406, term81406.getClass(), "last", null);
        setField(term81406, term81406.getClass(), "propListHead", null);
        setIntField(term81406, term81406.getClass(), "sourcePosition", 0);
        setField(term81406, term81406.getClass(), "jsType", null);
        setField(term81406, term81406.getClass(), "parent", null);
        setField(term81405, term81405.getClass(), "first", term81406);
        setField(term81405, term81405.getClass(), "last", null);
        setField(term81405, term81405.getClass(), "propListHead", null);
        setIntField(term81405, term81405.getClass(), "sourcePosition", 0);
        setField(term81405, term81405.getClass(), "jsType", null);
        setField(term81405, term81405.getClass(), "parent", null);
        setField(term81403, term81403.getClass(), "parent", term81405);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term81063;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term80971, args);
        assertTrue(recursiveEquals(term80971, term81402));
        assertTrue(recursiveEquals(term81063, term81403));
        assertTrue(recursiveEquals(retValue, null));
    }

};


