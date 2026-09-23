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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162304;
     Object term162396;
     Object term162746;
     Object term162747;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162304 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term162396 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term162488 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term162586 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        Object term162656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term162396, term162396.getClass(), "type", 13);
        setIntField(term162488, term162488.getClass(), "type", -458766);
        setField(term162488, term162488.getClass(), "jsType", term162586);
        setField(term162396, term162396.getClass(), "first", term162488);
        setIntField(term162656, term162656.getClass(), "type", 13);
        setField(term162656, term162656.getClass(), "jsType", null);
        setField(term162396, term162396.getClass(), "last", term162656);
        term162746 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term162746, term162746.getClass(), "INEQ", null);
        setField(term162746, term162746.getClass(), "convention", null);
        setField(term162746, term162746.getClass(), "typeRegistry", null);
        setField(term162746, term162746.getClass(), "firstLink", null);
        setField(term162746, term162746.getClass(), "nextLink", null);
        setField(term162746, term162746.getClass(), "restrictUndefinedVisitor", null);
        setField(term162746, term162746.getClass(), "restrictNullVisitor", null);
        term162747 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term162748 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term162749 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        Object term162750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term162747, term162747.getClass(), "str", null);
        setIntField(term162747, term162747.getClass(), "type", 13);
        setField(term162747, term162747.getClass(), "next", null);
        setDoubleField(term162748, term162748.getClass(), "number", 0.0);
        setIntField(term162748, term162748.getClass(), "type", -458766);
        setField(term162748, term162748.getClass(), "next", null);
        setField(term162748, term162748.getClass(), "first", null);
        setField(term162748, term162748.getClass(), "last", null);
        setField(term162748, term162748.getClass(), "propListHead", null);
        setIntField(term162748, term162748.getClass(), "sourcePosition", 0);
        setBooleanField(term162749, term162749.getClass(), "resolved", false);
        setField(term162749, term162749.getClass(), "resolveResult", null);
        setBooleanField(term162749, term162749.getClass(), "inTemplatedCheckVisit", false);
        setField(term162749, term162749.getClass(), "registry", null);
        setField(term162748, term162748.getClass(), "jsType", term162749);
        setField(term162748, term162748.getClass(), "parent", null);
        setField(term162747, term162747.getClass(), "first", term162748);
        setIntField(term162750, term162750.getClass(), "type", 13);
        setField(term162750, term162750.getClass(), "next", null);
        setField(term162750, term162750.getClass(), "first", null);
        setField(term162750, term162750.getClass(), "last", null);
        setField(term162750, term162750.getClass(), "propListHead", null);
        setIntField(term162750, term162750.getClass(), "sourcePosition", 0);
        setField(term162750, term162750.getClass(), "jsType", null);
        setField(term162750, term162750.getClass(), "parent", null);
        setField(term162747, term162747.getClass(), "last", term162750);
        setField(term162747, term162747.getClass(), "propListHead", null);
        setIntField(term162747, term162747.getClass(), "sourcePosition", 0);
        setField(term162747, term162747.getClass(), "jsType", null);
        setField(term162747, term162747.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term162396;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term162304, args);
        assertTrue(recursiveEquals(term162304, term162746));
        assertTrue(recursiveEquals(term162396, term162747));
        assertTrue(recursiveEquals(retValue, null));
    }

};


