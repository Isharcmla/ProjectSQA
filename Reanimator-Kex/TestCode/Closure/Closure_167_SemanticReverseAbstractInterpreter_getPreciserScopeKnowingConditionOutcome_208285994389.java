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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_208285994389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18626;
     Object term18696;
     Object term18829;
     Object term18830;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_208285994389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18626 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term18696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18696, term18696.getClass(), "type", 12);
        setField(term18696, term18696.getClass(), "first", term18696);
        setField(term18696, term18696.getClass(), "last", term18766);
        term18829 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term18829, term18829.getClass(), "INEQ", null);
        setField(term18829, term18829.getClass(), "convention", null);
        setField(term18829, term18829.getClass(), "typeRegistry", null);
        setField(term18829, term18829.getClass(), "firstLink", null);
        setField(term18829, term18829.getClass(), "nextLink", null);
        setField(term18829, term18829.getClass(), "restrictUndefinedVisitor", null);
        setField(term18829, term18829.getClass(), "restrictNullVisitor", null);
        term18830 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18831 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18830, term18830.getClass(), "type", 12);
        setField(term18830, term18830.getClass(), "next", null);
        setField(term18830, term18830.getClass(), "first", term18830);
        setIntField(term18831, term18831.getClass(), "type", 0);
        setField(term18831, term18831.getClass(), "next", null);
        setField(term18831, term18831.getClass(), "first", null);
        setField(term18831, term18831.getClass(), "last", null);
        setField(term18831, term18831.getClass(), "propListHead", null);
        setIntField(term18831, term18831.getClass(), "sourcePosition", 0);
        setField(term18831, term18831.getClass(), "jsType", null);
        setField(term18831, term18831.getClass(), "parent", null);
        setField(term18830, term18830.getClass(), "last", term18831);
        setField(term18830, term18830.getClass(), "propListHead", null);
        setIntField(term18830, term18830.getClass(), "sourcePosition", 0);
        setField(term18830, term18830.getClass(), "jsType", null);
        setField(term18830, term18830.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term18696;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term18626, args);
        assertTrue(recursiveEquals(term18626, term18829));
        assertTrue(recursiveEquals(term18696, term18830));
        assertTrue(recursiveEquals(retValue, null));
    }

};


