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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356402;
     Object term356494;
     Object term357044;
     Object term357045;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term356402 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term356494 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term356586 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term356678 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term356772 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term356864 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term356494, term356494.getClass(), "type", 111);
        setIntField(term356678, term356678.getClass(), "type", -1838535544);
        setField(term356678, term356678.getClass(), "jsType", term356772);
        setField(term356586, term356586.getClass(), "first", term356678);
        setField(term356494, term356494.getClass(), "parent", term356586);
        setIntField(term356864, term356864.getClass(), "type", 1838273399);
        setField(term356864, term356864.getClass(), "jsType", term356772);
        setField(term356494, term356494.getClass(), "first", term356864);
        term357044 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term357044, term357044.getClass(), "INEQ", null);
        setField(term357044, term357044.getClass(), "convention", null);
        setField(term357044, term357044.getClass(), "typeRegistry", null);
        setField(term357044, term357044.getClass(), "firstLink", null);
        setField(term357044, term357044.getClass(), "nextLink", null);
        setField(term357044, term357044.getClass(), "restrictUndefinedVisitor", null);
        setField(term357044, term357044.getClass(), "restrictNullVisitor", null);
        term357045 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term357046 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term357047 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term357048 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term357049 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term357045, term357045.getClass(), "number", 0.0);
        setIntField(term357045, term357045.getClass(), "type", 111);
        setField(term357045, term357045.getClass(), "next", null);
        setField(term357046, term357046.getClass(), "str", null);
        setIntField(term357046, term357046.getClass(), "type", 1838273399);
        setField(term357046, term357046.getClass(), "next", null);
        setField(term357046, term357046.getClass(), "first", null);
        setField(term357046, term357046.getClass(), "last", null);
        setField(term357046, term357046.getClass(), "propListHead", null);
        setIntField(term357046, term357046.getClass(), "sourcePosition", 0);
        setField(term357047, term357047.getClass(), "parameters", null);
        setField(term357047, term357047.getClass(), "returnType", null);
        setBooleanField(term357047, term357047.getClass(), "returnTypeInferred", false);
        setBooleanField(term357047, term357047.getClass(), "resolved", false);
        setField(term357047, term357047.getClass(), "resolveResult", null);
        setBooleanField(term357047, term357047.getClass(), "inTemplatedCheckVisit", false);
        setField(term357047, term357047.getClass(), "registry", null);
        setField(term357046, term357046.getClass(), "jsType", term357047);
        setField(term357046, term357046.getClass(), "parent", null);
        setField(term357045, term357045.getClass(), "first", term357046);
        setField(term357045, term357045.getClass(), "last", null);
        setField(term357045, term357045.getClass(), "propListHead", null);
        setIntField(term357045, term357045.getClass(), "sourcePosition", 0);
        setField(term357045, term357045.getClass(), "jsType", null);
        setDoubleField(term357048, term357048.getClass(), "number", 0.0);
        setIntField(term357048, term357048.getClass(), "type", 0);
        setField(term357048, term357048.getClass(), "next", null);
        setDoubleField(term357049, term357049.getClass(), "number", 0.0);
        setIntField(term357049, term357049.getClass(), "type", -1838535544);
        setField(term357049, term357049.getClass(), "next", null);
        setField(term357049, term357049.getClass(), "first", null);
        setField(term357049, term357049.getClass(), "last", null);
        setField(term357049, term357049.getClass(), "propListHead", null);
        setIntField(term357049, term357049.getClass(), "sourcePosition", 0);
        setField(term357049, term357049.getClass(), "jsType", term357047);
        setField(term357049, term357049.getClass(), "parent", null);
        setField(term357048, term357048.getClass(), "first", term357049);
        setField(term357048, term357048.getClass(), "last", null);
        setField(term357048, term357048.getClass(), "propListHead", null);
        setIntField(term357048, term357048.getClass(), "sourcePosition", 0);
        setField(term357048, term357048.getClass(), "jsType", null);
        setField(term357048, term357048.getClass(), "parent", null);
        setField(term357045, term357045.getClass(), "parent", term357048);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term356494;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term356402, args);
        assertTrue(recursiveEquals(term356402, term357044));
        assertTrue(recursiveEquals(term356494, term357045));
        assertTrue(recursiveEquals(retValue, null));
    }

};


