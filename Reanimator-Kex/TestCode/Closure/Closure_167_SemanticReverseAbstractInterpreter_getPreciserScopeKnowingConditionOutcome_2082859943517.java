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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142161;
     Object term142253;
     Object term142614;
     Object term142615;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142161 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term142253 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term142345 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term142437 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term142529 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term142253, term142253.getClass(), "type", 111);
        setIntField(term142437, term142437.getClass(), "type", 0);
        setField(term142345, term142345.getClass(), "first", term142437);
        setField(term142253, term142253.getClass(), "parent", term142345);
        setIntField(term142529, term142529.getClass(), "type", 111);
        setField(term142253, term142253.getClass(), "first", term142529);
        term142614 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term142614, term142614.getClass(), "INEQ", null);
        setField(term142614, term142614.getClass(), "convention", null);
        setField(term142614, term142614.getClass(), "typeRegistry", null);
        setField(term142614, term142614.getClass(), "firstLink", null);
        setField(term142614, term142614.getClass(), "nextLink", null);
        setField(term142614, term142614.getClass(), "restrictUndefinedVisitor", null);
        setField(term142614, term142614.getClass(), "restrictNullVisitor", null);
        term142615 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term142616 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term142617 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term142618 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term142615, term142615.getClass(), "str", null);
        setIntField(term142615, term142615.getClass(), "type", 111);
        setField(term142615, term142615.getClass(), "next", null);
        setField(term142616, term142616.getClass(), "str", null);
        setIntField(term142616, term142616.getClass(), "type", 111);
        setField(term142616, term142616.getClass(), "next", null);
        setField(term142616, term142616.getClass(), "first", null);
        setField(term142616, term142616.getClass(), "last", null);
        setField(term142616, term142616.getClass(), "propListHead", null);
        setIntField(term142616, term142616.getClass(), "sourcePosition", 0);
        setField(term142616, term142616.getClass(), "jsType", null);
        setField(term142616, term142616.getClass(), "parent", null);
        setField(term142615, term142615.getClass(), "first", term142616);
        setField(term142615, term142615.getClass(), "last", null);
        setField(term142615, term142615.getClass(), "propListHead", null);
        setIntField(term142615, term142615.getClass(), "sourcePosition", 0);
        setField(term142615, term142615.getClass(), "jsType", null);
        setField(term142617, term142617.getClass(), "str", null);
        setIntField(term142617, term142617.getClass(), "type", 0);
        setField(term142617, term142617.getClass(), "next", null);
        setDoubleField(term142618, term142618.getClass(), "number", 0.0);
        setIntField(term142618, term142618.getClass(), "type", 0);
        setField(term142618, term142618.getClass(), "next", null);
        setField(term142618, term142618.getClass(), "first", null);
        setField(term142618, term142618.getClass(), "last", null);
        setField(term142618, term142618.getClass(), "propListHead", null);
        setIntField(term142618, term142618.getClass(), "sourcePosition", 0);
        setField(term142618, term142618.getClass(), "jsType", null);
        setField(term142618, term142618.getClass(), "parent", null);
        setField(term142617, term142617.getClass(), "first", term142618);
        setField(term142617, term142617.getClass(), "last", null);
        setField(term142617, term142617.getClass(), "propListHead", null);
        setIntField(term142617, term142617.getClass(), "sourcePosition", 0);
        setField(term142617, term142617.getClass(), "jsType", null);
        setField(term142617, term142617.getClass(), "parent", null);
        setField(term142615, term142615.getClass(), "parent", term142617);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term142253;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term142161, args);
        assertTrue(recursiveEquals(term142161, term142614));
        assertTrue(recursiveEquals(term142253, term142615));
        assertTrue(recursiveEquals(retValue, null));
    }

};


