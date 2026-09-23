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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280532;
     Object term280624;
     Object term281239;
     Object term281240;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term280532 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term280624 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term280716 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term280808 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term280920 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        Object term281012 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term280624, term280624.getClass(), "type", 111);
        setIntField(term280808, term280808.getClass(), "type", 0);
        setField(term280808, term280808.getClass(), "jsType", term280920);
        setField(term280716, term280716.getClass(), "first", term280808);
        setField(term280624, term280624.getClass(), "parent", term280716);
        setIntField(term281012, term281012.getClass(), "type", 0);
        setField(term281012, term281012.getClass(), "jsType", term280920);
        setField(term280624, term280624.getClass(), "first", term281012);
        term281239 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term281239, term281239.getClass(), "INEQ", null);
        setField(term281239, term281239.getClass(), "convention", null);
        setField(term281239, term281239.getClass(), "typeRegistry", null);
        setField(term281239, term281239.getClass(), "firstLink", null);
        setField(term281239, term281239.getClass(), "nextLink", null);
        setField(term281239, term281239.getClass(), "restrictUndefinedVisitor", null);
        setField(term281239, term281239.getClass(), "restrictNullVisitor", null);
        term281240 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term281241 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term281242 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        Object term281243 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term281244 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term281240, term281240.getClass(), "number", 0.0);
        setIntField(term281240, term281240.getClass(), "type", 111);
        setField(term281240, term281240.getClass(), "next", null);
        setField(term281241, term281241.getClass(), "str", null);
        setIntField(term281241, term281241.getClass(), "type", 0);
        setField(term281241, term281241.getClass(), "next", null);
        setField(term281241, term281241.getClass(), "first", null);
        setField(term281241, term281241.getClass(), "last", null);
        setField(term281241, term281241.getClass(), "propListHead", null);
        setIntField(term281241, term281241.getClass(), "sourcePosition", 0);
        setField(term281242, term281242.getClass(), "constructor", null);
        setField(term281242, term281242.getClass(), "className", null);
        setField(term281242, term281242.getClass(), "properties", null);
        setBooleanField(term281242, term281242.getClass(), "nativeType", false);
        setField(term281242, term281242.getClass(), "implicitPrototypeFallback", null);
        setField(term281242, term281242.getClass(), "ownerFunction", null);
        setBooleanField(term281242, term281242.getClass(), "prettyPrint", false);
        setBooleanField(term281242, term281242.getClass(), "visited", false);
        setField(term281242, term281242.getClass(), "docInfo", null);
        setBooleanField(term281242, term281242.getClass(), "unknown", false);
        setBooleanField(term281242, term281242.getClass(), "resolved", false);
        setField(term281242, term281242.getClass(), "resolveResult", null);
        setBooleanField(term281242, term281242.getClass(), "inTemplatedCheckVisit", false);
        setField(term281242, term281242.getClass(), "registry", null);
        setField(term281241, term281241.getClass(), "jsType", term281242);
        setField(term281241, term281241.getClass(), "parent", null);
        setField(term281240, term281240.getClass(), "first", term281241);
        setField(term281240, term281240.getClass(), "last", null);
        setField(term281240, term281240.getClass(), "propListHead", null);
        setIntField(term281240, term281240.getClass(), "sourcePosition", 0);
        setField(term281240, term281240.getClass(), "jsType", null);
        setDoubleField(term281243, term281243.getClass(), "number", 0.0);
        setIntField(term281243, term281243.getClass(), "type", 0);
        setField(term281243, term281243.getClass(), "next", null);
        setField(term281244, term281244.getClass(), "str", null);
        setIntField(term281244, term281244.getClass(), "type", 0);
        setField(term281244, term281244.getClass(), "next", null);
        setField(term281244, term281244.getClass(), "first", null);
        setField(term281244, term281244.getClass(), "last", null);
        setField(term281244, term281244.getClass(), "propListHead", null);
        setIntField(term281244, term281244.getClass(), "sourcePosition", 0);
        setField(term281244, term281244.getClass(), "jsType", term281242);
        setField(term281244, term281244.getClass(), "parent", null);
        setField(term281243, term281243.getClass(), "first", term281244);
        setField(term281243, term281243.getClass(), "last", null);
        setField(term281243, term281243.getClass(), "propListHead", null);
        setIntField(term281243, term281243.getClass(), "sourcePosition", 0);
        setField(term281243, term281243.getClass(), "jsType", null);
        setField(term281243, term281243.getClass(), "parent", null);
        setField(term281240, term281240.getClass(), "parent", term281243);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term280624;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term280532, args);
        assertTrue(recursiveEquals(term280532, term281239));
        assertTrue(recursiveEquals(term280624, term281240));
        assertTrue(recursiveEquals(retValue, null));
    }

};


