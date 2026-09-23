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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54954;
     Object term55046;
     Object term55358;
     Object term55359;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54954 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term55046 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term55138 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term55230 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term55046, term55046.getClass(), "type", 12);
        setField(term55046, term55046.getClass(), "first", term55138);
        setField(term55046, term55046.getClass(), "last", term55230);
        term55358 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term55358, term55358.getClass(), "INEQ", null);
        setField(term55358, term55358.getClass(), "convention", null);
        setField(term55358, term55358.getClass(), "typeRegistry", null);
        setField(term55358, term55358.getClass(), "firstLink", null);
        setField(term55358, term55358.getClass(), "nextLink", null);
        setField(term55358, term55358.getClass(), "restrictUndefinedVisitor", null);
        setField(term55358, term55358.getClass(), "restrictNullVisitor", null);
        term55359 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term55360 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term55361 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term55359, term55359.getClass(), "number", 0.0);
        setIntField(term55359, term55359.getClass(), "type", 12);
        setField(term55359, term55359.getClass(), "next", null);
        setDoubleField(term55360, term55360.getClass(), "number", 0.0);
        setIntField(term55360, term55360.getClass(), "type", 0);
        setField(term55360, term55360.getClass(), "next", null);
        setField(term55360, term55360.getClass(), "first", null);
        setField(term55360, term55360.getClass(), "last", null);
        setField(term55360, term55360.getClass(), "propListHead", null);
        setIntField(term55360, term55360.getClass(), "sourcePosition", 0);
        setField(term55360, term55360.getClass(), "jsType", null);
        setField(term55360, term55360.getClass(), "parent", null);
        setField(term55359, term55359.getClass(), "first", term55360);
        setDoubleField(term55361, term55361.getClass(), "number", 0.0);
        setIntField(term55361, term55361.getClass(), "type", 0);
        setField(term55361, term55361.getClass(), "next", null);
        setField(term55361, term55361.getClass(), "first", null);
        setField(term55361, term55361.getClass(), "last", null);
        setField(term55361, term55361.getClass(), "propListHead", null);
        setIntField(term55361, term55361.getClass(), "sourcePosition", 0);
        setField(term55361, term55361.getClass(), "jsType", null);
        setField(term55361, term55361.getClass(), "parent", null);
        setField(term55359, term55359.getClass(), "last", term55361);
        setField(term55359, term55359.getClass(), "propListHead", null);
        setIntField(term55359, term55359.getClass(), "sourcePosition", 0);
        setField(term55359, term55359.getClass(), "jsType", null);
        setField(term55359, term55359.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term55046;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term54954, args);
        assertTrue(recursiveEquals(term54954, term55358));
        assertTrue(recursiveEquals(term55046, term55359));
        assertTrue(recursiveEquals(retValue, null));
    }

};


