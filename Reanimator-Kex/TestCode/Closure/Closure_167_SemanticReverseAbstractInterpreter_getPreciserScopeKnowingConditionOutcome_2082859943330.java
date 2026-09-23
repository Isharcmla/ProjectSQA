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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85016;
     Object term85108;
     Object term85899;
     Object term85900;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85016 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term85108 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term85200 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term85292 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term85108, term85108.getClass(), "type", 46);
        setField(term85108, term85108.getClass(), "first", term85200);
        setField(term85108, term85108.getClass(), "last", term85292);
        term85899 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term85899, term85899.getClass(), "INEQ", null);
        setField(term85899, term85899.getClass(), "convention", null);
        setField(term85899, term85899.getClass(), "typeRegistry", null);
        setField(term85899, term85899.getClass(), "firstLink", null);
        setField(term85899, term85899.getClass(), "nextLink", null);
        setField(term85899, term85899.getClass(), "restrictUndefinedVisitor", null);
        setField(term85899, term85899.getClass(), "restrictNullVisitor", null);
        term85900 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term85901 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term85902 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term85900, term85900.getClass(), "str", null);
        setIntField(term85900, term85900.getClass(), "type", 46);
        setField(term85900, term85900.getClass(), "next", null);
        setField(term85901, term85901.getClass(), "str", null);
        setIntField(term85901, term85901.getClass(), "type", 0);
        setField(term85901, term85901.getClass(), "next", null);
        setField(term85901, term85901.getClass(), "first", null);
        setField(term85901, term85901.getClass(), "last", null);
        setField(term85901, term85901.getClass(), "propListHead", null);
        setIntField(term85901, term85901.getClass(), "sourcePosition", 0);
        setField(term85901, term85901.getClass(), "jsType", null);
        setField(term85901, term85901.getClass(), "parent", null);
        setField(term85900, term85900.getClass(), "first", term85901);
        setField(term85902, term85902.getClass(), "str", null);
        setIntField(term85902, term85902.getClass(), "type", 0);
        setField(term85902, term85902.getClass(), "next", null);
        setField(term85902, term85902.getClass(), "first", null);
        setField(term85902, term85902.getClass(), "last", null);
        setField(term85902, term85902.getClass(), "propListHead", null);
        setIntField(term85902, term85902.getClass(), "sourcePosition", 0);
        setField(term85902, term85902.getClass(), "jsType", null);
        setField(term85902, term85902.getClass(), "parent", null);
        setField(term85900, term85900.getClass(), "last", term85902);
        setField(term85900, term85900.getClass(), "propListHead", null);
        setIntField(term85900, term85900.getClass(), "sourcePosition", 0);
        setField(term85900, term85900.getClass(), "jsType", null);
        setField(term85900, term85900.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term85108;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term85016, args);
        assertTrue(recursiveEquals(term85016, term85899));
        assertTrue(recursiveEquals(term85108, term85900));
        assertTrue(recursiveEquals(retValue, null));
    }

};


