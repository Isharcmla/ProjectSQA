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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22086;
     Object term22156;
     Object term22547;
     Object term22548;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22086 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term22156 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22156, term22156.getClass(), "type", 13);
        setField(term22156, term22156.getClass(), "first", term22156);
        setField(term22156, term22156.getClass(), "last", term22226);
        term22547 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term22547, term22547.getClass(), "INEQ", null);
        setField(term22547, term22547.getClass(), "convention", null);
        setField(term22547, term22547.getClass(), "typeRegistry", null);
        setField(term22547, term22547.getClass(), "firstLink", null);
        setField(term22547, term22547.getClass(), "nextLink", null);
        setField(term22547, term22547.getClass(), "restrictUndefinedVisitor", null);
        setField(term22547, term22547.getClass(), "restrictNullVisitor", null);
        term22548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22549 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22548, term22548.getClass(), "type", 13);
        setField(term22548, term22548.getClass(), "next", null);
        setField(term22548, term22548.getClass(), "first", term22548);
        setIntField(term22549, term22549.getClass(), "type", 0);
        setField(term22549, term22549.getClass(), "next", null);
        setField(term22549, term22549.getClass(), "first", null);
        setField(term22549, term22549.getClass(), "last", null);
        setField(term22549, term22549.getClass(), "propListHead", null);
        setIntField(term22549, term22549.getClass(), "sourcePosition", 0);
        setField(term22549, term22549.getClass(), "jsType", null);
        setField(term22549, term22549.getClass(), "parent", null);
        setField(term22548, term22548.getClass(), "last", term22549);
        setField(term22548, term22548.getClass(), "propListHead", null);
        setIntField(term22548, term22548.getClass(), "sourcePosition", 0);
        setField(term22548, term22548.getClass(), "jsType", null);
        setField(term22548, term22548.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term22156;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term22086, args);
        assertTrue(recursiveEquals(term22086, term22547));
        assertTrue(recursiveEquals(term22156, term22548));
        assertTrue(recursiveEquals(retValue, null));
    }

};


