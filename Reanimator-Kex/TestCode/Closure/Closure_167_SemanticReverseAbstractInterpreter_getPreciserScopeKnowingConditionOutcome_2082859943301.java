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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76392;
     Object term76484;
     Object term76644;
     Object term76645;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76392 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term76484 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term76576 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term76484, term76484.getClass(), "type", 111);
        setField(term76576, term76576.getClass(), "first", term76576);
        setIntField(term76576, term76576.getClass(), "type", 111);
        setField(term76484, term76484.getClass(), "parent", term76576);
        setField(term76484, term76484.getClass(), "first", term76576);
        term76644 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term76644, term76644.getClass(), "INEQ", null);
        setField(term76644, term76644.getClass(), "convention", null);
        setField(term76644, term76644.getClass(), "typeRegistry", null);
        setField(term76644, term76644.getClass(), "firstLink", null);
        setField(term76644, term76644.getClass(), "nextLink", null);
        setField(term76644, term76644.getClass(), "restrictUndefinedVisitor", null);
        setField(term76644, term76644.getClass(), "restrictNullVisitor", null);
        term76645 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term76646 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term76645, term76645.getClass(), "number", 0.0);
        setIntField(term76645, term76645.getClass(), "type", 111);
        setField(term76645, term76645.getClass(), "next", null);
        setDoubleField(term76646, term76646.getClass(), "number", 0.0);
        setIntField(term76646, term76646.getClass(), "type", 111);
        setField(term76646, term76646.getClass(), "next", null);
        setField(term76646, term76646.getClass(), "first", term76646);
        setField(term76646, term76646.getClass(), "last", null);
        setField(term76646, term76646.getClass(), "propListHead", null);
        setIntField(term76646, term76646.getClass(), "sourcePosition", 0);
        setField(term76646, term76646.getClass(), "jsType", null);
        setField(term76646, term76646.getClass(), "parent", null);
        setField(term76645, term76645.getClass(), "first", term76646);
        setField(term76645, term76645.getClass(), "last", null);
        setField(term76645, term76645.getClass(), "propListHead", null);
        setIntField(term76645, term76645.getClass(), "sourcePosition", 0);
        setField(term76645, term76645.getClass(), "jsType", null);
        setField(term76645, term76645.getClass(), "parent", term76646);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term76484;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term76392, args);
        assertTrue(recursiveEquals(term76392, term76644));
        assertTrue(recursiveEquals(term76484, term76645));
        assertTrue(recursiveEquals(retValue, null));
    }

};


