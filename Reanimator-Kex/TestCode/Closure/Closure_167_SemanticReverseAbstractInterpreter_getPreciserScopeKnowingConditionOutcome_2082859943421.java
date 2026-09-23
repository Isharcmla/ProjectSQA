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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110236;
     Object term110328;
     Object term110613;
     Object term110614;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110236 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term110328 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term110420 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term110490 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term110328, term110328.getClass(), "type", 46);
        setIntField(term110420, term110420.getClass(), "type", -47);
        setField(term110328, term110328.getClass(), "first", term110420);
        setIntField(term110490, term110490.getClass(), "type", 46);
        setField(term110328, term110328.getClass(), "last", term110490);
        term110613 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term110613, term110613.getClass(), "INEQ", null);
        setField(term110613, term110613.getClass(), "convention", null);
        setField(term110613, term110613.getClass(), "typeRegistry", null);
        setField(term110613, term110613.getClass(), "firstLink", null);
        setField(term110613, term110613.getClass(), "nextLink", null);
        setField(term110613, term110613.getClass(), "restrictUndefinedVisitor", null);
        setField(term110613, term110613.getClass(), "restrictNullVisitor", null);
        term110614 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term110615 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term110616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term110614, term110614.getClass(), "str", null);
        setIntField(term110614, term110614.getClass(), "type", 46);
        setField(term110614, term110614.getClass(), "next", null);
        setDoubleField(term110615, term110615.getClass(), "number", 0.0);
        setIntField(term110615, term110615.getClass(), "type", -47);
        setField(term110615, term110615.getClass(), "next", null);
        setField(term110615, term110615.getClass(), "first", null);
        setField(term110615, term110615.getClass(), "last", null);
        setField(term110615, term110615.getClass(), "propListHead", null);
        setIntField(term110615, term110615.getClass(), "sourcePosition", 0);
        setField(term110615, term110615.getClass(), "jsType", null);
        setField(term110615, term110615.getClass(), "parent", null);
        setField(term110614, term110614.getClass(), "first", term110615);
        setIntField(term110616, term110616.getClass(), "type", 46);
        setField(term110616, term110616.getClass(), "next", null);
        setField(term110616, term110616.getClass(), "first", null);
        setField(term110616, term110616.getClass(), "last", null);
        setField(term110616, term110616.getClass(), "propListHead", null);
        setIntField(term110616, term110616.getClass(), "sourcePosition", 0);
        setField(term110616, term110616.getClass(), "jsType", null);
        setField(term110616, term110616.getClass(), "parent", null);
        setField(term110614, term110614.getClass(), "last", term110616);
        setField(term110614, term110614.getClass(), "propListHead", null);
        setIntField(term110614, term110614.getClass(), "sourcePosition", 0);
        setField(term110614, term110614.getClass(), "jsType", null);
        setField(term110614, term110614.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term110328;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term110236, args);
        assertTrue(recursiveEquals(term110236, term110613));
        assertTrue(recursiveEquals(term110328, term110614));
        assertTrue(recursiveEquals(retValue, null));
    }

};


