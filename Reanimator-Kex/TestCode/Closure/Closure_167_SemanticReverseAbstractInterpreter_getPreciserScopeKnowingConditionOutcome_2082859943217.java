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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51425;
     Object term51517;
     Object term51773;
     Object term51774;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51425 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term51517 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term51609 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term51701 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term51517, term51517.getClass(), "type", 111);
        setIntField(term51701, term51701.getClass(), "type", 111);
        setField(term51609, term51609.getClass(), "first", term51701);
        setField(term51517, term51517.getClass(), "parent", term51609);
        setField(term51517, term51517.getClass(), "first", term51701);
        term51773 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term51773, term51773.getClass(), "INEQ", null);
        setField(term51773, term51773.getClass(), "convention", null);
        setField(term51773, term51773.getClass(), "typeRegistry", null);
        setField(term51773, term51773.getClass(), "firstLink", null);
        setField(term51773, term51773.getClass(), "nextLink", null);
        setField(term51773, term51773.getClass(), "restrictUndefinedVisitor", null);
        setField(term51773, term51773.getClass(), "restrictNullVisitor", null);
        term51774 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term51775 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term51776 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term51774, term51774.getClass(), "str", null);
        setIntField(term51774, term51774.getClass(), "type", 111);
        setField(term51774, term51774.getClass(), "next", null);
        setField(term51775, term51775.getClass(), "str", null);
        setIntField(term51775, term51775.getClass(), "type", 111);
        setField(term51775, term51775.getClass(), "next", null);
        setField(term51775, term51775.getClass(), "first", null);
        setField(term51775, term51775.getClass(), "last", null);
        setField(term51775, term51775.getClass(), "propListHead", null);
        setIntField(term51775, term51775.getClass(), "sourcePosition", 0);
        setField(term51775, term51775.getClass(), "jsType", null);
        setField(term51775, term51775.getClass(), "parent", null);
        setField(term51774, term51774.getClass(), "first", term51775);
        setField(term51774, term51774.getClass(), "last", null);
        setField(term51774, term51774.getClass(), "propListHead", null);
        setIntField(term51774, term51774.getClass(), "sourcePosition", 0);
        setField(term51774, term51774.getClass(), "jsType", null);
        setField(term51776, term51776.getClass(), "str", null);
        setIntField(term51776, term51776.getClass(), "type", 0);
        setField(term51776, term51776.getClass(), "next", null);
        setField(term51776, term51776.getClass(), "first", term51775);
        setField(term51776, term51776.getClass(), "last", null);
        setField(term51776, term51776.getClass(), "propListHead", null);
        setIntField(term51776, term51776.getClass(), "sourcePosition", 0);
        setField(term51776, term51776.getClass(), "jsType", null);
        setField(term51776, term51776.getClass(), "parent", null);
        setField(term51774, term51774.getClass(), "parent", term51776);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term51517;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term51425, args);
        assertTrue(recursiveEquals(term51425, term51773));
        assertTrue(recursiveEquals(term51517, term51774));
        assertTrue(recursiveEquals(retValue, null));
    }

};


