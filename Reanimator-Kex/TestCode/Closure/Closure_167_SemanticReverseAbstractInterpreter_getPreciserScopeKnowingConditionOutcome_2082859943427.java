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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111668;
     Object term111760;
     Object term111770;
     Object term111771;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111668 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term111760 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term111760, term111760.getClass(), "type", 17);
        term111770 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term111770, term111770.getClass(), "INEQ", null);
        setField(term111770, term111770.getClass(), "convention", null);
        setField(term111770, term111770.getClass(), "typeRegistry", null);
        setField(term111770, term111770.getClass(), "firstLink", null);
        setField(term111770, term111770.getClass(), "nextLink", null);
        setField(term111770, term111770.getClass(), "restrictUndefinedVisitor", null);
        setField(term111770, term111770.getClass(), "restrictNullVisitor", null);
        term111771 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term111771, term111771.getClass(), "number", 0.0);
        setIntField(term111771, term111771.getClass(), "type", 17);
        setField(term111771, term111771.getClass(), "next", null);
        setField(term111771, term111771.getClass(), "first", null);
        setField(term111771, term111771.getClass(), "last", null);
        setField(term111771, term111771.getClass(), "propListHead", null);
        setIntField(term111771, term111771.getClass(), "sourcePosition", 0);
        setField(term111771, term111771.getClass(), "jsType", null);
        setField(term111771, term111771.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term111760;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term111668, args);
        assertTrue(recursiveEquals(term111668, term111770));
        assertTrue(recursiveEquals(term111760, term111771));
        assertTrue(recursiveEquals(retValue, null));
    }

};


