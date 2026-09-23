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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267493;
     Object term267585;
     Object term268103;
     Object term268104;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term267493 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term267585 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term267677 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term267767 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        Object term267859 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term267951 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        setIntField(term267585, term267585.getClass(), "type", 45);
        setIntField(term267677, term267677.getClass(), "type", 0);
        setField(term267677, term267677.getClass(), "jsType", term267767);
        setField(term267585, term267585.getClass(), "first", term267677);
        setIntField(term267859, term267859.getClass(), "type", 45);
        setField(term267859, term267859.getClass(), "jsType", term267951);
        setField(term267585, term267585.getClass(), "last", term267859);
        term268103 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term268103, term268103.getClass(), "INEQ", null);
        setField(term268103, term268103.getClass(), "convention", null);
        setField(term268103, term268103.getClass(), "typeRegistry", null);
        setField(term268103, term268103.getClass(), "firstLink", null);
        setField(term268103, term268103.getClass(), "nextLink", null);
        setField(term268103, term268103.getClass(), "restrictUndefinedVisitor", null);
        setField(term268103, term268103.getClass(), "restrictNullVisitor", null);
        term268104 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term268105 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term268106 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        Object term268107 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term268108 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        setDoubleField(term268104, term268104.getClass(), "number", 0.0);
        setIntField(term268104, term268104.getClass(), "type", 45);
        setField(term268104, term268104.getClass(), "next", null);
        setField(term268105, term268105.getClass(), "str", null);
        setIntField(term268105, term268105.getClass(), "type", 0);
        setField(term268105, term268105.getClass(), "next", null);
        setField(term268105, term268105.getClass(), "first", null);
        setField(term268105, term268105.getClass(), "last", null);
        setField(term268105, term268105.getClass(), "propListHead", null);
        setIntField(term268105, term268105.getClass(), "sourcePosition", 0);
        setBooleanField(term268106, term268106.getClass(), "resolved", false);
        setField(term268106, term268106.getClass(), "resolveResult", null);
        setBooleanField(term268106, term268106.getClass(), "inTemplatedCheckVisit", false);
        setField(term268106, term268106.getClass(), "registry", null);
        setField(term268105, term268105.getClass(), "jsType", term268106);
        setField(term268105, term268105.getClass(), "parent", null);
        setField(term268104, term268104.getClass(), "first", term268105);
        setDoubleField(term268107, term268107.getClass(), "number", 0.0);
        setIntField(term268107, term268107.getClass(), "type", 45);
        setField(term268107, term268107.getClass(), "next", null);
        setField(term268107, term268107.getClass(), "first", null);
        setField(term268107, term268107.getClass(), "last", null);
        setField(term268107, term268107.getClass(), "propListHead", null);
        setIntField(term268107, term268107.getClass(), "sourcePosition", 0);
        setBooleanField(term268108, term268108.getClass(), "resolved", false);
        setField(term268108, term268108.getClass(), "resolveResult", null);
        setBooleanField(term268108, term268108.getClass(), "inTemplatedCheckVisit", false);
        setField(term268108, term268108.getClass(), "registry", null);
        setField(term268107, term268107.getClass(), "jsType", term268108);
        setField(term268107, term268107.getClass(), "parent", null);
        setField(term268104, term268104.getClass(), "last", term268107);
        setField(term268104, term268104.getClass(), "propListHead", null);
        setIntField(term268104, term268104.getClass(), "sourcePosition", 0);
        setField(term268104, term268104.getClass(), "jsType", null);
        setField(term268104, term268104.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term267585;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term267493, args);
        assertTrue(recursiveEquals(term267493, term268103));
        assertTrue(recursiveEquals(term267585, term268104));
        assertTrue(recursiveEquals(retValue, null));
    }

};


