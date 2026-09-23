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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249795;
     Object term249887;
     Object term250356;
     Object term250357;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term249795 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term249887 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term249979 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term250071 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term250167 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        Object term250237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term249887, term249887.getClass(), "type", 111);
        setIntField(term250071, term250071.getClass(), "type", 0);
        setField(term250071, term250071.getClass(), "jsType", term250167);
        setField(term249979, term249979.getClass(), "first", term250071);
        setField(term249887, term249887.getClass(), "parent", term249979);
        setIntField(term250237, term250237.getClass(), "type", 1431666654);
        setField(term250237, term250237.getClass(), "jsType", null);
        setField(term249887, term249887.getClass(), "first", term250237);
        term250356 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term250356, term250356.getClass(), "INEQ", null);
        setField(term250356, term250356.getClass(), "convention", null);
        setField(term250356, term250356.getClass(), "typeRegistry", null);
        setField(term250356, term250356.getClass(), "firstLink", null);
        setField(term250356, term250356.getClass(), "nextLink", null);
        setField(term250356, term250356.getClass(), "restrictUndefinedVisitor", null);
        setField(term250356, term250356.getClass(), "restrictNullVisitor", null);
        term250357 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term250358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term250359 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term250360 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term250361 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setField(term250357, term250357.getClass(), "str", null);
        setIntField(term250357, term250357.getClass(), "type", 111);
        setField(term250357, term250357.getClass(), "next", null);
        setIntField(term250358, term250358.getClass(), "type", 1431666654);
        setField(term250358, term250358.getClass(), "next", null);
        setField(term250358, term250358.getClass(), "first", null);
        setField(term250358, term250358.getClass(), "last", null);
        setField(term250358, term250358.getClass(), "propListHead", null);
        setIntField(term250358, term250358.getClass(), "sourcePosition", 0);
        setField(term250358, term250358.getClass(), "jsType", null);
        setField(term250358, term250358.getClass(), "parent", null);
        setField(term250357, term250357.getClass(), "first", term250358);
        setField(term250357, term250357.getClass(), "last", null);
        setField(term250357, term250357.getClass(), "propListHead", null);
        setIntField(term250357, term250357.getClass(), "sourcePosition", 0);
        setField(term250357, term250357.getClass(), "jsType", null);
        setField(term250359, term250359.getClass(), "str", null);
        setIntField(term250359, term250359.getClass(), "type", 0);
        setField(term250359, term250359.getClass(), "next", null);
        setDoubleField(term250360, term250360.getClass(), "number", 0.0);
        setIntField(term250360, term250360.getClass(), "type", 0);
        setField(term250360, term250360.getClass(), "next", null);
        setField(term250360, term250360.getClass(), "first", null);
        setField(term250360, term250360.getClass(), "last", null);
        setField(term250360, term250360.getClass(), "propListHead", null);
        setIntField(term250360, term250360.getClass(), "sourcePosition", 0);
        setBooleanField(term250361, term250361.getClass(), "resolved", false);
        setField(term250361, term250361.getClass(), "resolveResult", null);
        setBooleanField(term250361, term250361.getClass(), "inTemplatedCheckVisit", false);
        setField(term250361, term250361.getClass(), "registry", null);
        setField(term250360, term250360.getClass(), "jsType", term250361);
        setField(term250360, term250360.getClass(), "parent", null);
        setField(term250359, term250359.getClass(), "first", term250360);
        setField(term250359, term250359.getClass(), "last", null);
        setField(term250359, term250359.getClass(), "propListHead", null);
        setIntField(term250359, term250359.getClass(), "sourcePosition", 0);
        setField(term250359, term250359.getClass(), "jsType", null);
        setField(term250359, term250359.getClass(), "parent", null);
        setField(term250357, term250357.getClass(), "parent", term250359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term249887;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term249795, args);
        assertTrue(recursiveEquals(term249795, term250356));
        assertTrue(recursiveEquals(term249887, term250357));
        assertTrue(recursiveEquals(retValue, null));
    }

};


