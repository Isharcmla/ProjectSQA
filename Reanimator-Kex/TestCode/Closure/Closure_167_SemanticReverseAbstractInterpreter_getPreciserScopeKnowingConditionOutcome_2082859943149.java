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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33448;
     Object term33518;
     Object term33537;
     Object term33538;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33448 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term33518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33518, term33518.getClass(), "type", 51);
        setField(term33518, term33518.getClass(), "first", term33518);
        term33537 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term33537, term33537.getClass(), "INEQ", null);
        setField(term33537, term33537.getClass(), "convention", null);
        setField(term33537, term33537.getClass(), "typeRegistry", null);
        setField(term33537, term33537.getClass(), "firstLink", null);
        setField(term33537, term33537.getClass(), "nextLink", null);
        setField(term33537, term33537.getClass(), "restrictUndefinedVisitor", null);
        setField(term33537, term33537.getClass(), "restrictNullVisitor", null);
        term33538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33538, term33538.getClass(), "type", 51);
        setField(term33538, term33538.getClass(), "next", null);
        setField(term33538, term33538.getClass(), "first", term33538);
        setField(term33538, term33538.getClass(), "last", null);
        setField(term33538, term33538.getClass(), "propListHead", null);
        setIntField(term33538, term33538.getClass(), "sourcePosition", 0);
        setField(term33538, term33538.getClass(), "jsType", null);
        setField(term33538, term33538.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term33518;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term33448, args);
        assertTrue(recursiveEquals(term33448, term33537));
        assertTrue(recursiveEquals(term33518, term33538));
        assertTrue(recursiveEquals(retValue, null));
    }

};


