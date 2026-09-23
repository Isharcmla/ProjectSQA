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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83367;
     Object term83459;
     Object term83700;
     Object term83701;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83367 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term83459 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term83551 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term83643 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term83459, term83459.getClass(), "type", 46);
        setIntField(term83551, term83551.getClass(), "type", 46);
        setField(term83459, term83459.getClass(), "first", term83551);
        setIntField(term83643, term83643.getClass(), "type", 46);
        setField(term83459, term83459.getClass(), "last", term83643);
        term83700 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term83700, term83700.getClass(), "INEQ", null);
        setField(term83700, term83700.getClass(), "convention", null);
        setField(term83700, term83700.getClass(), "typeRegistry", null);
        setField(term83700, term83700.getClass(), "firstLink", null);
        setField(term83700, term83700.getClass(), "nextLink", null);
        setField(term83700, term83700.getClass(), "restrictUndefinedVisitor", null);
        setField(term83700, term83700.getClass(), "restrictNullVisitor", null);
        term83701 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term83702 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term83703 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term83701, term83701.getClass(), "str", null);
        setIntField(term83701, term83701.getClass(), "type", 46);
        setField(term83701, term83701.getClass(), "next", null);
        setField(term83702, term83702.getClass(), "str", null);
        setIntField(term83702, term83702.getClass(), "type", 46);
        setField(term83702, term83702.getClass(), "next", null);
        setField(term83702, term83702.getClass(), "first", null);
        setField(term83702, term83702.getClass(), "last", null);
        setField(term83702, term83702.getClass(), "propListHead", null);
        setIntField(term83702, term83702.getClass(), "sourcePosition", 0);
        setField(term83702, term83702.getClass(), "jsType", null);
        setField(term83702, term83702.getClass(), "parent", null);
        setField(term83701, term83701.getClass(), "first", term83702);
        setField(term83703, term83703.getClass(), "str", null);
        setIntField(term83703, term83703.getClass(), "type", 46);
        setField(term83703, term83703.getClass(), "next", null);
        setField(term83703, term83703.getClass(), "first", null);
        setField(term83703, term83703.getClass(), "last", null);
        setField(term83703, term83703.getClass(), "propListHead", null);
        setIntField(term83703, term83703.getClass(), "sourcePosition", 0);
        setField(term83703, term83703.getClass(), "jsType", null);
        setField(term83703, term83703.getClass(), "parent", null);
        setField(term83701, term83701.getClass(), "last", term83703);
        setField(term83701, term83701.getClass(), "propListHead", null);
        setIntField(term83701, term83701.getClass(), "sourcePosition", 0);
        setField(term83701, term83701.getClass(), "jsType", null);
        setField(term83701, term83701.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term83459;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term83367, args);
        assertTrue(recursiveEquals(term83367, term83700));
        assertTrue(recursiveEquals(term83459, term83701));
        assertTrue(recursiveEquals(retValue, null));
    }

};


