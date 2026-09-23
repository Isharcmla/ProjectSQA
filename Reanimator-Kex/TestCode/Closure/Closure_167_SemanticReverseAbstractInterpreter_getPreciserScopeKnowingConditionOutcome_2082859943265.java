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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65588;
     Object term65680;
     Object term65900;
     Object term65901;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65588 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term65680 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term65772 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term65842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term65680, term65680.getClass(), "type", 45);
        setIntField(term65772, term65772.getClass(), "type", 0);
        setField(term65680, term65680.getClass(), "first", term65772);
        setField(term65680, term65680.getClass(), "last", term65842);
        term65900 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term65900, term65900.getClass(), "INEQ", null);
        setField(term65900, term65900.getClass(), "convention", null);
        setField(term65900, term65900.getClass(), "typeRegistry", null);
        setField(term65900, term65900.getClass(), "firstLink", null);
        setField(term65900, term65900.getClass(), "nextLink", null);
        setField(term65900, term65900.getClass(), "restrictUndefinedVisitor", null);
        setField(term65900, term65900.getClass(), "restrictNullVisitor", null);
        term65901 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term65902 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term65903 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term65901, term65901.getClass(), "number", 0.0);
        setIntField(term65901, term65901.getClass(), "type", 45);
        setField(term65901, term65901.getClass(), "next", null);
        setField(term65902, term65902.getClass(), "str", null);
        setIntField(term65902, term65902.getClass(), "type", 0);
        setField(term65902, term65902.getClass(), "next", null);
        setField(term65902, term65902.getClass(), "first", null);
        setField(term65902, term65902.getClass(), "last", null);
        setField(term65902, term65902.getClass(), "propListHead", null);
        setIntField(term65902, term65902.getClass(), "sourcePosition", 0);
        setField(term65902, term65902.getClass(), "jsType", null);
        setField(term65902, term65902.getClass(), "parent", null);
        setField(term65901, term65901.getClass(), "first", term65902);
        setIntField(term65903, term65903.getClass(), "type", 0);
        setField(term65903, term65903.getClass(), "next", null);
        setField(term65903, term65903.getClass(), "first", null);
        setField(term65903, term65903.getClass(), "last", null);
        setField(term65903, term65903.getClass(), "propListHead", null);
        setIntField(term65903, term65903.getClass(), "sourcePosition", 0);
        setField(term65903, term65903.getClass(), "jsType", null);
        setField(term65903, term65903.getClass(), "parent", null);
        setField(term65901, term65901.getClass(), "last", term65903);
        setField(term65901, term65901.getClass(), "propListHead", null);
        setIntField(term65901, term65901.getClass(), "sourcePosition", 0);
        setField(term65901, term65901.getClass(), "jsType", null);
        setField(term65901, term65901.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term65680;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term65588, args);
        assertTrue(recursiveEquals(term65588, term65900));
        assertTrue(recursiveEquals(term65680, term65901));
        assertTrue(recursiveEquals(retValue, null));
    }

};


