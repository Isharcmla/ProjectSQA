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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50406;
     Object term50498;
     Object term50739;
     Object term50740;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50406 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term50498 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term50590 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term50682 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term50498, term50498.getClass(), "type", 46);
        setIntField(term50590, term50590.getClass(), "type", 46);
        setField(term50498, term50498.getClass(), "first", term50590);
        setField(term50498, term50498.getClass(), "last", term50682);
        term50739 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term50739, term50739.getClass(), "INEQ", null);
        setField(term50739, term50739.getClass(), "convention", null);
        setField(term50739, term50739.getClass(), "typeRegistry", null);
        setField(term50739, term50739.getClass(), "firstLink", null);
        setField(term50739, term50739.getClass(), "nextLink", null);
        setField(term50739, term50739.getClass(), "restrictUndefinedVisitor", null);
        setField(term50739, term50739.getClass(), "restrictNullVisitor", null);
        term50740 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term50741 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term50742 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term50740, term50740.getClass(), "str", null);
        setIntField(term50740, term50740.getClass(), "type", 46);
        setField(term50740, term50740.getClass(), "next", null);
        setField(term50741, term50741.getClass(), "str", null);
        setIntField(term50741, term50741.getClass(), "type", 46);
        setField(term50741, term50741.getClass(), "next", null);
        setField(term50741, term50741.getClass(), "first", null);
        setField(term50741, term50741.getClass(), "last", null);
        setField(term50741, term50741.getClass(), "propListHead", null);
        setIntField(term50741, term50741.getClass(), "sourcePosition", 0);
        setField(term50741, term50741.getClass(), "jsType", null);
        setField(term50741, term50741.getClass(), "parent", null);
        setField(term50740, term50740.getClass(), "first", term50741);
        setField(term50742, term50742.getClass(), "str", null);
        setIntField(term50742, term50742.getClass(), "type", 0);
        setField(term50742, term50742.getClass(), "next", null);
        setField(term50742, term50742.getClass(), "first", null);
        setField(term50742, term50742.getClass(), "last", null);
        setField(term50742, term50742.getClass(), "propListHead", null);
        setIntField(term50742, term50742.getClass(), "sourcePosition", 0);
        setField(term50742, term50742.getClass(), "jsType", null);
        setField(term50742, term50742.getClass(), "parent", null);
        setField(term50740, term50740.getClass(), "last", term50742);
        setField(term50740, term50740.getClass(), "propListHead", null);
        setIntField(term50740, term50740.getClass(), "sourcePosition", 0);
        setField(term50740, term50740.getClass(), "jsType", null);
        setField(term50740, term50740.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term50498;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term50406, args);
        assertTrue(recursiveEquals(term50406, term50739));
        assertTrue(recursiveEquals(term50498, term50740));
        assertTrue(recursiveEquals(retValue, null));
    }

};


