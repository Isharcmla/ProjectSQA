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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38945;
     Object term39037;
     Object term39289;
     Object term39290;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38945 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term39037 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term39129 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term39221 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term39037, term39037.getClass(), "type", 46);
        setIntField(term39129, term39129.getClass(), "type", 46);
        setField(term39037, term39037.getClass(), "first", term39129);
        setField(term39037, term39037.getClass(), "last", term39221);
        term39289 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term39289, term39289.getClass(), "INEQ", null);
        setField(term39289, term39289.getClass(), "convention", null);
        setField(term39289, term39289.getClass(), "typeRegistry", null);
        setField(term39289, term39289.getClass(), "firstLink", null);
        setField(term39289, term39289.getClass(), "nextLink", null);
        setField(term39289, term39289.getClass(), "restrictUndefinedVisitor", null);
        setField(term39289, term39289.getClass(), "restrictNullVisitor", null);
        term39290 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term39291 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term39292 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term39290, term39290.getClass(), "number", 0.0);
        setIntField(term39290, term39290.getClass(), "type", 46);
        setField(term39290, term39290.getClass(), "next", null);
        setDoubleField(term39291, term39291.getClass(), "number", 0.0);
        setIntField(term39291, term39291.getClass(), "type", 46);
        setField(term39291, term39291.getClass(), "next", null);
        setField(term39291, term39291.getClass(), "first", null);
        setField(term39291, term39291.getClass(), "last", null);
        setField(term39291, term39291.getClass(), "propListHead", null);
        setIntField(term39291, term39291.getClass(), "sourcePosition", 0);
        setField(term39291, term39291.getClass(), "jsType", null);
        setField(term39291, term39291.getClass(), "parent", null);
        setField(term39290, term39290.getClass(), "first", term39291);
        setDoubleField(term39292, term39292.getClass(), "number", 0.0);
        setIntField(term39292, term39292.getClass(), "type", 0);
        setField(term39292, term39292.getClass(), "next", null);
        setField(term39292, term39292.getClass(), "first", null);
        setField(term39292, term39292.getClass(), "last", null);
        setField(term39292, term39292.getClass(), "propListHead", null);
        setIntField(term39292, term39292.getClass(), "sourcePosition", 0);
        setField(term39292, term39292.getClass(), "jsType", null);
        setField(term39292, term39292.getClass(), "parent", null);
        setField(term39290, term39290.getClass(), "last", term39292);
        setField(term39290, term39290.getClass(), "propListHead", null);
        setIntField(term39290, term39290.getClass(), "sourcePosition", 0);
        setField(term39290, term39290.getClass(), "jsType", null);
        setField(term39290, term39290.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term39037;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term38945, args);
        assertTrue(recursiveEquals(term38945, term39289));
        assertTrue(recursiveEquals(term39037, term39290));
        assertTrue(recursiveEquals(retValue, null));
    }

};


