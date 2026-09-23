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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112995;
     Object term113087;
     Object term113307;
     Object term113308;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112995 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term113087 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term113179 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term113249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term113087, term113087.getClass(), "type", 13);
        setIntField(term113179, term113179.getClass(), "type", -14);
        setField(term113087, term113087.getClass(), "first", term113179);
        setIntField(term113249, term113249.getClass(), "type", 13);
        setField(term113087, term113087.getClass(), "last", term113249);
        term113307 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term113307, term113307.getClass(), "INEQ", null);
        setField(term113307, term113307.getClass(), "convention", null);
        setField(term113307, term113307.getClass(), "typeRegistry", null);
        setField(term113307, term113307.getClass(), "firstLink", null);
        setField(term113307, term113307.getClass(), "nextLink", null);
        setField(term113307, term113307.getClass(), "restrictUndefinedVisitor", null);
        setField(term113307, term113307.getClass(), "restrictNullVisitor", null);
        term113308 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term113309 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term113310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term113308, term113308.getClass(), "number", 0.0);
        setIntField(term113308, term113308.getClass(), "type", 13);
        setField(term113308, term113308.getClass(), "next", null);
        setField(term113309, term113309.getClass(), "str", null);
        setIntField(term113309, term113309.getClass(), "type", -14);
        setField(term113309, term113309.getClass(), "next", null);
        setField(term113309, term113309.getClass(), "first", null);
        setField(term113309, term113309.getClass(), "last", null);
        setField(term113309, term113309.getClass(), "propListHead", null);
        setIntField(term113309, term113309.getClass(), "sourcePosition", 0);
        setField(term113309, term113309.getClass(), "jsType", null);
        setField(term113309, term113309.getClass(), "parent", null);
        setField(term113308, term113308.getClass(), "first", term113309);
        setIntField(term113310, term113310.getClass(), "type", 13);
        setField(term113310, term113310.getClass(), "next", null);
        setField(term113310, term113310.getClass(), "first", null);
        setField(term113310, term113310.getClass(), "last", null);
        setField(term113310, term113310.getClass(), "propListHead", null);
        setIntField(term113310, term113310.getClass(), "sourcePosition", 0);
        setField(term113310, term113310.getClass(), "jsType", null);
        setField(term113310, term113310.getClass(), "parent", null);
        setField(term113308, term113308.getClass(), "last", term113310);
        setField(term113308, term113308.getClass(), "propListHead", null);
        setIntField(term113308, term113308.getClass(), "sourcePosition", 0);
        setField(term113308, term113308.getClass(), "jsType", null);
        setField(term113308, term113308.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term113087;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term112995, args);
        assertTrue(recursiveEquals(term112995, term113307));
        assertTrue(recursiveEquals(term113087, term113308));
        assertTrue(recursiveEquals(retValue, null));
    }

};


