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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75837;
     Object term75929;
     Object term76220;
     Object term76221;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75837 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term75929 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term76021 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term76091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term75929, term75929.getClass(), "type", 13);
        setIntField(term76021, term76021.getClass(), "type", 0);
        setField(term75929, term75929.getClass(), "first", term76021);
        setField(term75929, term75929.getClass(), "last", term76091);
        term76220 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term76220, term76220.getClass(), "INEQ", null);
        setField(term76220, term76220.getClass(), "convention", null);
        setField(term76220, term76220.getClass(), "typeRegistry", null);
        setField(term76220, term76220.getClass(), "firstLink", null);
        setField(term76220, term76220.getClass(), "nextLink", null);
        setField(term76220, term76220.getClass(), "restrictUndefinedVisitor", null);
        setField(term76220, term76220.getClass(), "restrictNullVisitor", null);
        term76221 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term76222 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term76223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term76221, term76221.getClass(), "number", 0.0);
        setIntField(term76221, term76221.getClass(), "type", 13);
        setField(term76221, term76221.getClass(), "next", null);
        setField(term76222, term76222.getClass(), "str", null);
        setIntField(term76222, term76222.getClass(), "type", 0);
        setField(term76222, term76222.getClass(), "next", null);
        setField(term76222, term76222.getClass(), "first", null);
        setField(term76222, term76222.getClass(), "last", null);
        setField(term76222, term76222.getClass(), "propListHead", null);
        setIntField(term76222, term76222.getClass(), "sourcePosition", 0);
        setField(term76222, term76222.getClass(), "jsType", null);
        setField(term76222, term76222.getClass(), "parent", null);
        setField(term76221, term76221.getClass(), "first", term76222);
        setIntField(term76223, term76223.getClass(), "type", 0);
        setField(term76223, term76223.getClass(), "next", null);
        setField(term76223, term76223.getClass(), "first", null);
        setField(term76223, term76223.getClass(), "last", null);
        setField(term76223, term76223.getClass(), "propListHead", null);
        setIntField(term76223, term76223.getClass(), "sourcePosition", 0);
        setField(term76223, term76223.getClass(), "jsType", null);
        setField(term76223, term76223.getClass(), "parent", null);
        setField(term76221, term76221.getClass(), "last", term76223);
        setField(term76221, term76221.getClass(), "propListHead", null);
        setIntField(term76221, term76221.getClass(), "sourcePosition", 0);
        setField(term76221, term76221.getClass(), "jsType", null);
        setField(term76221, term76221.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term75929;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term75837, args);
        assertTrue(recursiveEquals(term75837, term76220));
        assertTrue(recursiveEquals(term75929, term76221));
        assertTrue(recursiveEquals(retValue, null));
    }

};


