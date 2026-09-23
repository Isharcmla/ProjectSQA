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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87441;
     Object term87533;
     Object term87780;
     Object term87781;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87441 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term87533 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term87625 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term87717 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term87533, term87533.getClass(), "type", 13);
        setIntField(term87625, term87625.getClass(), "type", 13);
        setField(term87533, term87533.getClass(), "first", term87625);
        setField(term87533, term87533.getClass(), "last", term87717);
        term87780 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term87780, term87780.getClass(), "INEQ", null);
        setField(term87780, term87780.getClass(), "convention", null);
        setField(term87780, term87780.getClass(), "typeRegistry", null);
        setField(term87780, term87780.getClass(), "firstLink", null);
        setField(term87780, term87780.getClass(), "nextLink", null);
        setField(term87780, term87780.getClass(), "restrictUndefinedVisitor", null);
        setField(term87780, term87780.getClass(), "restrictNullVisitor", null);
        term87781 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term87782 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term87783 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term87781, term87781.getClass(), "number", 0.0);
        setIntField(term87781, term87781.getClass(), "type", 13);
        setField(term87781, term87781.getClass(), "next", null);
        setDoubleField(term87782, term87782.getClass(), "number", 0.0);
        setIntField(term87782, term87782.getClass(), "type", 13);
        setField(term87782, term87782.getClass(), "next", null);
        setField(term87782, term87782.getClass(), "first", null);
        setField(term87782, term87782.getClass(), "last", null);
        setField(term87782, term87782.getClass(), "propListHead", null);
        setIntField(term87782, term87782.getClass(), "sourcePosition", 0);
        setField(term87782, term87782.getClass(), "jsType", null);
        setField(term87782, term87782.getClass(), "parent", null);
        setField(term87781, term87781.getClass(), "first", term87782);
        setField(term87783, term87783.getClass(), "str", null);
        setIntField(term87783, term87783.getClass(), "type", 0);
        setField(term87783, term87783.getClass(), "next", null);
        setField(term87783, term87783.getClass(), "first", null);
        setField(term87783, term87783.getClass(), "last", null);
        setField(term87783, term87783.getClass(), "propListHead", null);
        setIntField(term87783, term87783.getClass(), "sourcePosition", 0);
        setField(term87783, term87783.getClass(), "jsType", null);
        setField(term87783, term87783.getClass(), "parent", null);
        setField(term87781, term87781.getClass(), "last", term87783);
        setField(term87781, term87781.getClass(), "propListHead", null);
        setIntField(term87781, term87781.getClass(), "sourcePosition", 0);
        setField(term87781, term87781.getClass(), "jsType", null);
        setField(term87781, term87781.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term87533;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term87441, args);
        assertTrue(recursiveEquals(term87441, term87780));
        assertTrue(recursiveEquals(term87533, term87781));
        assertTrue(recursiveEquals(retValue, null));
    }

};


