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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61767;
     Object term61859;
     Object term62105;
     Object term62106;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61767 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term61859 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term61951 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term62043 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term61859, term61859.getClass(), "type", 13);
        setIntField(term61951, term61951.getClass(), "type", 13);
        setField(term61859, term61859.getClass(), "first", term61951);
        setField(term61859, term61859.getClass(), "last", term62043);
        term62105 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term62105, term62105.getClass(), "INEQ", null);
        setField(term62105, term62105.getClass(), "convention", null);
        setField(term62105, term62105.getClass(), "typeRegistry", null);
        setField(term62105, term62105.getClass(), "firstLink", null);
        setField(term62105, term62105.getClass(), "nextLink", null);
        setField(term62105, term62105.getClass(), "restrictUndefinedVisitor", null);
        setField(term62105, term62105.getClass(), "restrictNullVisitor", null);
        term62106 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term62107 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term62108 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term62106, term62106.getClass(), "str", null);
        setIntField(term62106, term62106.getClass(), "type", 13);
        setField(term62106, term62106.getClass(), "next", null);
        setField(term62107, term62107.getClass(), "str", null);
        setIntField(term62107, term62107.getClass(), "type", 13);
        setField(term62107, term62107.getClass(), "next", null);
        setField(term62107, term62107.getClass(), "first", null);
        setField(term62107, term62107.getClass(), "last", null);
        setField(term62107, term62107.getClass(), "propListHead", null);
        setIntField(term62107, term62107.getClass(), "sourcePosition", 0);
        setField(term62107, term62107.getClass(), "jsType", null);
        setField(term62107, term62107.getClass(), "parent", null);
        setField(term62106, term62106.getClass(), "first", term62107);
        setDoubleField(term62108, term62108.getClass(), "number", 0.0);
        setIntField(term62108, term62108.getClass(), "type", 0);
        setField(term62108, term62108.getClass(), "next", null);
        setField(term62108, term62108.getClass(), "first", null);
        setField(term62108, term62108.getClass(), "last", null);
        setField(term62108, term62108.getClass(), "propListHead", null);
        setIntField(term62108, term62108.getClass(), "sourcePosition", 0);
        setField(term62108, term62108.getClass(), "jsType", null);
        setField(term62108, term62108.getClass(), "parent", null);
        setField(term62106, term62106.getClass(), "last", term62108);
        setField(term62106, term62106.getClass(), "propListHead", null);
        setIntField(term62106, term62106.getClass(), "sourcePosition", 0);
        setField(term62106, term62106.getClass(), "jsType", null);
        setField(term62106, term62106.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term61859;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term61767, args);
        assertTrue(recursiveEquals(term61767, term62105));
        assertTrue(recursiveEquals(term61859, term62106));
        assertTrue(recursiveEquals(retValue, null));
    }

};


