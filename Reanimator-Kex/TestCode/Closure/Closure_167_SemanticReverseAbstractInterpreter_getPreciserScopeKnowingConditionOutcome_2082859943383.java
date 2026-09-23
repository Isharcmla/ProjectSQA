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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100661;
     Object term100753;
     Object term100997;
     Object term100998;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100661 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term100753 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term100845 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term100753, term100753.getClass(), "type", 13);
        setField(term100753, term100753.getClass(), "first", term100753);
        setField(term100753, term100753.getClass(), "last", term100845);
        term100997 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term100997, term100997.getClass(), "INEQ", null);
        setField(term100997, term100997.getClass(), "convention", null);
        setField(term100997, term100997.getClass(), "typeRegistry", null);
        setField(term100997, term100997.getClass(), "firstLink", null);
        setField(term100997, term100997.getClass(), "nextLink", null);
        setField(term100997, term100997.getClass(), "restrictUndefinedVisitor", null);
        setField(term100997, term100997.getClass(), "restrictNullVisitor", null);
        term100998 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term100999 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term100998, term100998.getClass(), "str", null);
        setIntField(term100998, term100998.getClass(), "type", 13);
        setField(term100998, term100998.getClass(), "next", null);
        setField(term100998, term100998.getClass(), "first", term100998);
        setField(term100999, term100999.getClass(), "str", null);
        setIntField(term100999, term100999.getClass(), "type", 0);
        setField(term100999, term100999.getClass(), "next", null);
        setField(term100999, term100999.getClass(), "first", null);
        setField(term100999, term100999.getClass(), "last", null);
        setField(term100999, term100999.getClass(), "propListHead", null);
        setIntField(term100999, term100999.getClass(), "sourcePosition", 0);
        setField(term100999, term100999.getClass(), "jsType", null);
        setField(term100999, term100999.getClass(), "parent", null);
        setField(term100998, term100998.getClass(), "last", term100999);
        setField(term100998, term100998.getClass(), "propListHead", null);
        setIntField(term100998, term100998.getClass(), "sourcePosition", 0);
        setField(term100998, term100998.getClass(), "jsType", null);
        setField(term100998, term100998.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term100753;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term100661, args);
        assertTrue(recursiveEquals(term100661, term100997));
        assertTrue(recursiveEquals(term100753, term100998));
        assertTrue(recursiveEquals(retValue, null));
    }

};


