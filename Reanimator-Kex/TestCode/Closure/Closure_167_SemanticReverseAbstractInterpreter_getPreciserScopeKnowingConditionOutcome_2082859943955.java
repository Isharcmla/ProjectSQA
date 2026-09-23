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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term372691;
     Object term372783;
     Object term373176;
     Object term373177;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term372691 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term372783 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term372875 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term372973 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        Object term373043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term372783, term372783.getClass(), "type", 45);
        setIntField(term372875, term372875.getClass(), "type", 75366738);
        setField(term372875, term372875.getClass(), "jsType", term372973);
        setField(term372783, term372783.getClass(), "first", term372875);
        setIntField(term373043, term373043.getClass(), "type", -75381587);
        setField(term373043, term373043.getClass(), "jsType", term372973);
        setField(term372783, term372783.getClass(), "last", term373043);
        term373176 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term373176, term373176.getClass(), "INEQ", null);
        setField(term373176, term373176.getClass(), "convention", null);
        setField(term373176, term373176.getClass(), "typeRegistry", null);
        setField(term373176, term373176.getClass(), "firstLink", null);
        setField(term373176, term373176.getClass(), "nextLink", null);
        setField(term373176, term373176.getClass(), "restrictUndefinedVisitor", null);
        setField(term373176, term373176.getClass(), "restrictNullVisitor", null);
        term373177 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term373178 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term373179 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        Object term373180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term373177, term373177.getClass(), "str", null);
        setIntField(term373177, term373177.getClass(), "type", 45);
        setField(term373177, term373177.getClass(), "next", null);
        setDoubleField(term373178, term373178.getClass(), "number", 0.0);
        setIntField(term373178, term373178.getClass(), "type", 75366738);
        setField(term373178, term373178.getClass(), "next", null);
        setField(term373178, term373178.getClass(), "first", null);
        setField(term373178, term373178.getClass(), "last", null);
        setField(term373178, term373178.getClass(), "propListHead", null);
        setIntField(term373178, term373178.getClass(), "sourcePosition", 0);
        setBooleanField(term373179, term373179.getClass(), "resolved", false);
        setField(term373179, term373179.getClass(), "resolveResult", null);
        setBooleanField(term373179, term373179.getClass(), "inTemplatedCheckVisit", false);
        setField(term373179, term373179.getClass(), "registry", null);
        setField(term373178, term373178.getClass(), "jsType", term373179);
        setField(term373178, term373178.getClass(), "parent", null);
        setField(term373177, term373177.getClass(), "first", term373178);
        setIntField(term373180, term373180.getClass(), "type", -75381587);
        setField(term373180, term373180.getClass(), "next", null);
        setField(term373180, term373180.getClass(), "first", null);
        setField(term373180, term373180.getClass(), "last", null);
        setField(term373180, term373180.getClass(), "propListHead", null);
        setIntField(term373180, term373180.getClass(), "sourcePosition", 0);
        setField(term373180, term373180.getClass(), "jsType", term373179);
        setField(term373180, term373180.getClass(), "parent", null);
        setField(term373177, term373177.getClass(), "last", term373180);
        setField(term373177, term373177.getClass(), "propListHead", null);
        setIntField(term373177, term373177.getClass(), "sourcePosition", 0);
        setField(term373177, term373177.getClass(), "jsType", null);
        setField(term373177, term373177.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term372783;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term372691, args);
        assertTrue(recursiveEquals(term372691, term373176));
        assertTrue(recursiveEquals(term372783, term373177));
        assertTrue(recursiveEquals(retValue, null));
    }

};


