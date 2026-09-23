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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143951;
     Object term144043;
     Object term144418;
     Object term144419;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143951 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term144043 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term144135 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term144227 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term144297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term144043, term144043.getClass(), "type", 111);
        setIntField(term144227, term144227.getClass(), "type", 111);
        setField(term144135, term144135.getClass(), "first", term144227);
        setField(term144043, term144043.getClass(), "parent", term144135);
        setField(term144043, term144043.getClass(), "first", term144297);
        term144418 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term144418, term144418.getClass(), "INEQ", null);
        setField(term144418, term144418.getClass(), "convention", null);
        setField(term144418, term144418.getClass(), "typeRegistry", null);
        setField(term144418, term144418.getClass(), "firstLink", null);
        setField(term144418, term144418.getClass(), "nextLink", null);
        setField(term144418, term144418.getClass(), "restrictUndefinedVisitor", null);
        setField(term144418, term144418.getClass(), "restrictNullVisitor", null);
        term144419 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term144420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144421 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term144422 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term144419, term144419.getClass(), "number", 0.0);
        setIntField(term144419, term144419.getClass(), "type", 111);
        setField(term144419, term144419.getClass(), "next", null);
        setIntField(term144420, term144420.getClass(), "type", 0);
        setField(term144420, term144420.getClass(), "next", null);
        setField(term144420, term144420.getClass(), "first", null);
        setField(term144420, term144420.getClass(), "last", null);
        setField(term144420, term144420.getClass(), "propListHead", null);
        setIntField(term144420, term144420.getClass(), "sourcePosition", 0);
        setField(term144420, term144420.getClass(), "jsType", null);
        setField(term144420, term144420.getClass(), "parent", null);
        setField(term144419, term144419.getClass(), "first", term144420);
        setField(term144419, term144419.getClass(), "last", null);
        setField(term144419, term144419.getClass(), "propListHead", null);
        setIntField(term144419, term144419.getClass(), "sourcePosition", 0);
        setField(term144419, term144419.getClass(), "jsType", null);
        setDoubleField(term144421, term144421.getClass(), "number", 0.0);
        setIntField(term144421, term144421.getClass(), "type", 0);
        setField(term144421, term144421.getClass(), "next", null);
        setField(term144422, term144422.getClass(), "str", null);
        setIntField(term144422, term144422.getClass(), "type", 111);
        setField(term144422, term144422.getClass(), "next", null);
        setField(term144422, term144422.getClass(), "first", null);
        setField(term144422, term144422.getClass(), "last", null);
        setField(term144422, term144422.getClass(), "propListHead", null);
        setIntField(term144422, term144422.getClass(), "sourcePosition", 0);
        setField(term144422, term144422.getClass(), "jsType", null);
        setField(term144422, term144422.getClass(), "parent", null);
        setField(term144421, term144421.getClass(), "first", term144422);
        setField(term144421, term144421.getClass(), "last", null);
        setField(term144421, term144421.getClass(), "propListHead", null);
        setIntField(term144421, term144421.getClass(), "sourcePosition", 0);
        setField(term144421, term144421.getClass(), "jsType", null);
        setField(term144421, term144421.getClass(), "parent", null);
        setField(term144419, term144419.getClass(), "parent", term144421);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term144043;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term143951, args);
        assertTrue(recursiveEquals(term143951, term144418));
        assertTrue(recursiveEquals(term144043, term144419));
        assertTrue(recursiveEquals(retValue, null));
    }

};


