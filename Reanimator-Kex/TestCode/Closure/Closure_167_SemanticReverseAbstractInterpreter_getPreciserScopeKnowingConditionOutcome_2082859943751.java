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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223460;
     Object term223552;
     Object term223894;
     Object term223895;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223460 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term223552 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term223644 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term223734 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        Object term223804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term223552, term223552.getClass(), "type", 46);
        setIntField(term223644, term223644.getClass(), "type", -458799);
        setField(term223644, term223644.getClass(), "jsType", term223734);
        setField(term223552, term223552.getClass(), "first", term223644);
        setIntField(term223804, term223804.getClass(), "type", 46);
        setField(term223804, term223804.getClass(), "jsType", null);
        setField(term223552, term223552.getClass(), "last", term223804);
        term223894 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term223894, term223894.getClass(), "INEQ", null);
        setField(term223894, term223894.getClass(), "convention", null);
        setField(term223894, term223894.getClass(), "typeRegistry", null);
        setField(term223894, term223894.getClass(), "firstLink", null);
        setField(term223894, term223894.getClass(), "nextLink", null);
        setField(term223894, term223894.getClass(), "restrictUndefinedVisitor", null);
        setField(term223894, term223894.getClass(), "restrictNullVisitor", null);
        term223895 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term223896 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term223897 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        Object term223898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term223895, term223895.getClass(), "str", null);
        setIntField(term223895, term223895.getClass(), "type", 46);
        setField(term223895, term223895.getClass(), "next", null);
        setDoubleField(term223896, term223896.getClass(), "number", 0.0);
        setIntField(term223896, term223896.getClass(), "type", -458799);
        setField(term223896, term223896.getClass(), "next", null);
        setField(term223896, term223896.getClass(), "first", null);
        setField(term223896, term223896.getClass(), "last", null);
        setField(term223896, term223896.getClass(), "propListHead", null);
        setIntField(term223896, term223896.getClass(), "sourcePosition", 0);
        setBooleanField(term223897, term223897.getClass(), "resolved", false);
        setField(term223897, term223897.getClass(), "resolveResult", null);
        setBooleanField(term223897, term223897.getClass(), "inTemplatedCheckVisit", false);
        setField(term223897, term223897.getClass(), "registry", null);
        setField(term223896, term223896.getClass(), "jsType", term223897);
        setField(term223896, term223896.getClass(), "parent", null);
        setField(term223895, term223895.getClass(), "first", term223896);
        setIntField(term223898, term223898.getClass(), "type", 46);
        setField(term223898, term223898.getClass(), "next", null);
        setField(term223898, term223898.getClass(), "first", null);
        setField(term223898, term223898.getClass(), "last", null);
        setField(term223898, term223898.getClass(), "propListHead", null);
        setIntField(term223898, term223898.getClass(), "sourcePosition", 0);
        setField(term223898, term223898.getClass(), "jsType", null);
        setField(term223898, term223898.getClass(), "parent", null);
        setField(term223895, term223895.getClass(), "last", term223898);
        setField(term223895, term223895.getClass(), "propListHead", null);
        setIntField(term223895, term223895.getClass(), "sourcePosition", 0);
        setField(term223895, term223895.getClass(), "jsType", null);
        setField(term223895, term223895.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term223552;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term223460, args);
        assertTrue(recursiveEquals(term223460, term223894));
        assertTrue(recursiveEquals(term223552, term223895));
        assertTrue(recursiveEquals(retValue, null));
    }

};


