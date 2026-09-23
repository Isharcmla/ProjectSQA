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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_208285994367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12784;
     Object term12854;
     Object term13231;
     Object term13232;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_208285994367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12784 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term12854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12854, term12854.getClass(), "type", 52);
        setField(term12854, term12854.getClass(), "first", term12854);
        setField(term12854, term12854.getClass(), "last", term12924);
        term13231 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term13231, term13231.getClass(), "INEQ", null);
        setField(term13231, term13231.getClass(), "convention", null);
        setField(term13231, term13231.getClass(), "typeRegistry", null);
        setField(term13231, term13231.getClass(), "firstLink", null);
        setField(term13231, term13231.getClass(), "nextLink", null);
        setField(term13231, term13231.getClass(), "restrictUndefinedVisitor", null);
        setField(term13231, term13231.getClass(), "restrictNullVisitor", null);
        term13232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13232, term13232.getClass(), "type", 52);
        setField(term13232, term13232.getClass(), "next", null);
        setField(term13232, term13232.getClass(), "first", term13232);
        setIntField(term13233, term13233.getClass(), "type", 0);
        setField(term13233, term13233.getClass(), "next", null);
        setField(term13233, term13233.getClass(), "first", null);
        setField(term13233, term13233.getClass(), "last", null);
        setField(term13233, term13233.getClass(), "propListHead", null);
        setIntField(term13233, term13233.getClass(), "sourcePosition", 0);
        setField(term13233, term13233.getClass(), "jsType", null);
        setField(term13233, term13233.getClass(), "parent", null);
        setField(term13232, term13232.getClass(), "last", term13233);
        setField(term13232, term13232.getClass(), "propListHead", null);
        setIntField(term13232, term13232.getClass(), "sourcePosition", 0);
        setField(term13232, term13232.getClass(), "jsType", null);
        setField(term13232, term13232.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term12854;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term12784, args);
        assertTrue(recursiveEquals(term12784, term13231));
        assertTrue(recursiveEquals(term12854, term13232));
        assertTrue(recursiveEquals(retValue, null));
    }

};


