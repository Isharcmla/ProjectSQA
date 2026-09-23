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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21173;
     Object term21265;
     Object term21695;
     Object term21696;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21173 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term21265 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term21357 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term21265, term21265.getClass(), "type", 45);
        setField(term21265, term21265.getClass(), "first", term21265);
        setField(term21265, term21265.getClass(), "last", term21357);
        term21695 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term21695, term21695.getClass(), "INEQ", null);
        setField(term21695, term21695.getClass(), "convention", null);
        setField(term21695, term21695.getClass(), "typeRegistry", null);
        setField(term21695, term21695.getClass(), "firstLink", null);
        setField(term21695, term21695.getClass(), "nextLink", null);
        setField(term21695, term21695.getClass(), "restrictUndefinedVisitor", null);
        setField(term21695, term21695.getClass(), "restrictNullVisitor", null);
        term21696 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term21697 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term21696, term21696.getClass(), "str", null);
        setIntField(term21696, term21696.getClass(), "type", 45);
        setField(term21696, term21696.getClass(), "next", null);
        setField(term21696, term21696.getClass(), "first", term21696);
        setField(term21697, term21697.getClass(), "str", null);
        setIntField(term21697, term21697.getClass(), "type", 0);
        setField(term21697, term21697.getClass(), "next", null);
        setField(term21697, term21697.getClass(), "first", null);
        setField(term21697, term21697.getClass(), "last", null);
        setField(term21697, term21697.getClass(), "propListHead", null);
        setIntField(term21697, term21697.getClass(), "sourcePosition", 0);
        setField(term21697, term21697.getClass(), "jsType", null);
        setField(term21697, term21697.getClass(), "parent", null);
        setField(term21696, term21696.getClass(), "last", term21697);
        setField(term21696, term21696.getClass(), "propListHead", null);
        setIntField(term21696, term21696.getClass(), "sourcePosition", 0);
        setField(term21696, term21696.getClass(), "jsType", null);
        setField(term21696, term21696.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term21265;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term21173, args);
        assertTrue(recursiveEquals(term21173, term21695));
        assertTrue(recursiveEquals(term21265, term21696));
        assertTrue(recursiveEquals(retValue, null));
    }

};


