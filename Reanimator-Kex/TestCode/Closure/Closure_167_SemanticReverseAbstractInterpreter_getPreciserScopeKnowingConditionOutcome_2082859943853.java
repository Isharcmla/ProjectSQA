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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265997;
     Object term266089;
     Object term266516;
     Object term266517;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265997 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term266089 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term266181 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term266273 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term266363 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setIntField(term266089, term266089.getClass(), "type", 111);
        setIntField(term266273, term266273.getClass(), "type", -112);
        setField(term266273, term266273.getClass(), "jsType", term266363);
        setField(term266181, term266181.getClass(), "first", term266273);
        setField(term266089, term266089.getClass(), "parent", term266181);
        setField(term266089, term266089.getClass(), "first", term266089);
        setField(term266089, term266089.getClass(), "jsType", null);
        term266516 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term266516, term266516.getClass(), "INEQ", null);
        setField(term266516, term266516.getClass(), "convention", null);
        setField(term266516, term266516.getClass(), "typeRegistry", null);
        setField(term266516, term266516.getClass(), "firstLink", null);
        setField(term266516, term266516.getClass(), "nextLink", null);
        setField(term266516, term266516.getClass(), "restrictUndefinedVisitor", null);
        setField(term266516, term266516.getClass(), "restrictNullVisitor", null);
        term266517 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term266518 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term266519 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term266520 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setDoubleField(term266517, term266517.getClass(), "number", 0.0);
        setIntField(term266517, term266517.getClass(), "type", 111);
        setField(term266517, term266517.getClass(), "next", null);
        setField(term266517, term266517.getClass(), "first", term266517);
        setField(term266517, term266517.getClass(), "last", null);
        setField(term266517, term266517.getClass(), "propListHead", null);
        setIntField(term266517, term266517.getClass(), "sourcePosition", 0);
        setField(term266517, term266517.getClass(), "jsType", null);
        setDoubleField(term266518, term266518.getClass(), "number", 0.0);
        setIntField(term266518, term266518.getClass(), "type", 0);
        setField(term266518, term266518.getClass(), "next", null);
        setField(term266519, term266519.getClass(), "str", null);
        setIntField(term266519, term266519.getClass(), "type", -112);
        setField(term266519, term266519.getClass(), "next", null);
        setField(term266519, term266519.getClass(), "first", null);
        setField(term266519, term266519.getClass(), "last", null);
        setField(term266519, term266519.getClass(), "propListHead", null);
        setIntField(term266519, term266519.getClass(), "sourcePosition", 0);
        setBooleanField(term266520, term266520.getClass(), "resolved", false);
        setField(term266520, term266520.getClass(), "resolveResult", null);
        setBooleanField(term266520, term266520.getClass(), "inTemplatedCheckVisit", false);
        setField(term266520, term266520.getClass(), "registry", null);
        setField(term266519, term266519.getClass(), "jsType", term266520);
        setField(term266519, term266519.getClass(), "parent", null);
        setField(term266518, term266518.getClass(), "first", term266519);
        setField(term266518, term266518.getClass(), "last", null);
        setField(term266518, term266518.getClass(), "propListHead", null);
        setIntField(term266518, term266518.getClass(), "sourcePosition", 0);
        setField(term266518, term266518.getClass(), "jsType", null);
        setField(term266518, term266518.getClass(), "parent", null);
        setField(term266517, term266517.getClass(), "parent", term266518);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term266089;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term265997, args);
        assertTrue(recursiveEquals(term265997, term266516));
        assertTrue(recursiveEquals(term266089, term266517));
        assertTrue(recursiveEquals(retValue, null));
    }

};


