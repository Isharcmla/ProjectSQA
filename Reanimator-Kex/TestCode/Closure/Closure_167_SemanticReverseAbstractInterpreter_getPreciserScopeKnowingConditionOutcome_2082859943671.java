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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194385;
     Object term194477;
     Object term194719;
     Object term194720;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194385 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term194477 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term194569 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term194661 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term194477, term194477.getClass(), "type", 12);
        setIntField(term194569, term194569.getClass(), "type", 12);
        setField(term194477, term194477.getClass(), "first", term194569);
        setIntField(term194661, term194661.getClass(), "type", 12);
        setField(term194477, term194477.getClass(), "last", term194661);
        term194719 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term194719, term194719.getClass(), "INEQ", null);
        setField(term194719, term194719.getClass(), "convention", null);
        setField(term194719, term194719.getClass(), "typeRegistry", null);
        setField(term194719, term194719.getClass(), "firstLink", null);
        setField(term194719, term194719.getClass(), "nextLink", null);
        setField(term194719, term194719.getClass(), "restrictUndefinedVisitor", null);
        setField(term194719, term194719.getClass(), "restrictNullVisitor", null);
        term194720 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term194721 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term194722 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term194720, term194720.getClass(), "number", 0.0);
        setIntField(term194720, term194720.getClass(), "type", 12);
        setField(term194720, term194720.getClass(), "next", null);
        setField(term194721, term194721.getClass(), "str", null);
        setIntField(term194721, term194721.getClass(), "type", 12);
        setField(term194721, term194721.getClass(), "next", null);
        setField(term194721, term194721.getClass(), "first", null);
        setField(term194721, term194721.getClass(), "last", null);
        setField(term194721, term194721.getClass(), "propListHead", null);
        setIntField(term194721, term194721.getClass(), "sourcePosition", 0);
        setField(term194721, term194721.getClass(), "jsType", null);
        setField(term194721, term194721.getClass(), "parent", null);
        setField(term194720, term194720.getClass(), "first", term194721);
        setField(term194722, term194722.getClass(), "str", null);
        setIntField(term194722, term194722.getClass(), "type", 12);
        setField(term194722, term194722.getClass(), "next", null);
        setField(term194722, term194722.getClass(), "first", null);
        setField(term194722, term194722.getClass(), "last", null);
        setField(term194722, term194722.getClass(), "propListHead", null);
        setIntField(term194722, term194722.getClass(), "sourcePosition", 0);
        setField(term194722, term194722.getClass(), "jsType", null);
        setField(term194722, term194722.getClass(), "parent", null);
        setField(term194720, term194720.getClass(), "last", term194722);
        setField(term194720, term194720.getClass(), "propListHead", null);
        setIntField(term194720, term194720.getClass(), "sourcePosition", 0);
        setField(term194720, term194720.getClass(), "jsType", null);
        setField(term194720, term194720.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term194477;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term194385, args);
        assertTrue(recursiveEquals(term194385, term194719));
        assertTrue(recursiveEquals(term194477, term194720));
        assertTrue(recursiveEquals(retValue, null));
    }

};


