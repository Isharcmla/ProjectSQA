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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32559;
     Object term32629;
     Object term32841;
     Object term32842;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32559 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term32629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32629, term32629.getClass(), "type", 111);
        setField(term32699, term32699.getClass(), "first", term32769);
        setField(term32629, term32629.getClass(), "parent", term32699);
        setField(term32629, term32629.getClass(), "first", term32769);
        term32841 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term32841, term32841.getClass(), "INEQ", null);
        setField(term32841, term32841.getClass(), "convention", null);
        setField(term32841, term32841.getClass(), "typeRegistry", null);
        setField(term32841, term32841.getClass(), "firstLink", null);
        setField(term32841, term32841.getClass(), "nextLink", null);
        setField(term32841, term32841.getClass(), "restrictUndefinedVisitor", null);
        setField(term32841, term32841.getClass(), "restrictNullVisitor", null);
        term32842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32844 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32842, term32842.getClass(), "type", 111);
        setField(term32842, term32842.getClass(), "next", null);
        setIntField(term32843, term32843.getClass(), "type", 0);
        setField(term32843, term32843.getClass(), "next", null);
        setField(term32843, term32843.getClass(), "first", null);
        setField(term32843, term32843.getClass(), "last", null);
        setField(term32843, term32843.getClass(), "propListHead", null);
        setIntField(term32843, term32843.getClass(), "sourcePosition", 0);
        setField(term32843, term32843.getClass(), "jsType", null);
        setField(term32843, term32843.getClass(), "parent", null);
        setField(term32842, term32842.getClass(), "first", term32843);
        setField(term32842, term32842.getClass(), "last", null);
        setField(term32842, term32842.getClass(), "propListHead", null);
        setIntField(term32842, term32842.getClass(), "sourcePosition", 0);
        setField(term32842, term32842.getClass(), "jsType", null);
        setIntField(term32844, term32844.getClass(), "type", 0);
        setField(term32844, term32844.getClass(), "next", null);
        setField(term32844, term32844.getClass(), "first", term32843);
        setField(term32844, term32844.getClass(), "last", null);
        setField(term32844, term32844.getClass(), "propListHead", null);
        setIntField(term32844, term32844.getClass(), "sourcePosition", 0);
        setField(term32844, term32844.getClass(), "jsType", null);
        setField(term32844, term32844.getClass(), "parent", null);
        setField(term32842, term32842.getClass(), "parent", term32844);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term32629;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term32559, args);
        assertTrue(recursiveEquals(term32559, term32841));
        assertTrue(recursiveEquals(term32629, term32842));
        assertTrue(recursiveEquals(retValue, null));
    }

};


