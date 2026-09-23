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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43397;
     Object term43489;
     Object term43644;
     Object term43645;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43397 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term43489 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term43581 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term43489, term43489.getClass(), "type", 12);
        setField(term43489, term43489.getClass(), "first", term43489);
        setField(term43489, term43489.getClass(), "last", term43581);
        term43644 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term43644, term43644.getClass(), "INEQ", null);
        setField(term43644, term43644.getClass(), "convention", null);
        setField(term43644, term43644.getClass(), "typeRegistry", null);
        setField(term43644, term43644.getClass(), "firstLink", null);
        setField(term43644, term43644.getClass(), "nextLink", null);
        setField(term43644, term43644.getClass(), "restrictUndefinedVisitor", null);
        setField(term43644, term43644.getClass(), "restrictNullVisitor", null);
        term43645 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term43646 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term43645, term43645.getClass(), "str", null);
        setIntField(term43645, term43645.getClass(), "type", 12);
        setField(term43645, term43645.getClass(), "next", null);
        setField(term43645, term43645.getClass(), "first", term43645);
        setField(term43646, term43646.getClass(), "str", null);
        setIntField(term43646, term43646.getClass(), "type", 0);
        setField(term43646, term43646.getClass(), "next", null);
        setField(term43646, term43646.getClass(), "first", null);
        setField(term43646, term43646.getClass(), "last", null);
        setField(term43646, term43646.getClass(), "propListHead", null);
        setIntField(term43646, term43646.getClass(), "sourcePosition", 0);
        setField(term43646, term43646.getClass(), "jsType", null);
        setField(term43646, term43646.getClass(), "parent", null);
        setField(term43645, term43645.getClass(), "last", term43646);
        setField(term43645, term43645.getClass(), "propListHead", null);
        setIntField(term43645, term43645.getClass(), "sourcePosition", 0);
        setField(term43645, term43645.getClass(), "jsType", null);
        setField(term43645, term43645.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term43489;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term43397, args);
        assertTrue(recursiveEquals(term43397, term43644));
        assertTrue(recursiveEquals(term43489, term43645));
        assertTrue(recursiveEquals(retValue, null));
    }

};


