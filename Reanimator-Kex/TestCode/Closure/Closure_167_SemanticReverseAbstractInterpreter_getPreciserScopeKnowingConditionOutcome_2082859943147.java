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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33020;
     Object term33090;
     Object term33287;
     Object term33288;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33020 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term33090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33090, term33090.getClass(), "type", 46);
        setIntField(term33160, term33160.getClass(), "type", 46);
        setField(term33090, term33090.getClass(), "first", term33160);
        setIntField(term33230, term33230.getClass(), "type", 46);
        setField(term33090, term33090.getClass(), "last", term33230);
        term33287 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term33287, term33287.getClass(), "INEQ", null);
        setField(term33287, term33287.getClass(), "convention", null);
        setField(term33287, term33287.getClass(), "typeRegistry", null);
        setField(term33287, term33287.getClass(), "firstLink", null);
        setField(term33287, term33287.getClass(), "nextLink", null);
        setField(term33287, term33287.getClass(), "restrictUndefinedVisitor", null);
        setField(term33287, term33287.getClass(), "restrictNullVisitor", null);
        term33288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33290 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33288, term33288.getClass(), "type", 46);
        setField(term33288, term33288.getClass(), "next", null);
        setIntField(term33289, term33289.getClass(), "type", 46);
        setField(term33289, term33289.getClass(), "next", null);
        setField(term33289, term33289.getClass(), "first", null);
        setField(term33289, term33289.getClass(), "last", null);
        setField(term33289, term33289.getClass(), "propListHead", null);
        setIntField(term33289, term33289.getClass(), "sourcePosition", 0);
        setField(term33289, term33289.getClass(), "jsType", null);
        setField(term33289, term33289.getClass(), "parent", null);
        setField(term33288, term33288.getClass(), "first", term33289);
        setIntField(term33290, term33290.getClass(), "type", 46);
        setField(term33290, term33290.getClass(), "next", null);
        setField(term33290, term33290.getClass(), "first", null);
        setField(term33290, term33290.getClass(), "last", null);
        setField(term33290, term33290.getClass(), "propListHead", null);
        setIntField(term33290, term33290.getClass(), "sourcePosition", 0);
        setField(term33290, term33290.getClass(), "jsType", null);
        setField(term33290, term33290.getClass(), "parent", null);
        setField(term33288, term33288.getClass(), "last", term33290);
        setField(term33288, term33288.getClass(), "propListHead", null);
        setIntField(term33288, term33288.getClass(), "sourcePosition", 0);
        setField(term33288, term33288.getClass(), "jsType", null);
        setField(term33288, term33288.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term33090;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term33020, args);
        assertTrue(recursiveEquals(term33020, term33287));
        assertTrue(recursiveEquals(term33090, term33288));
        assertTrue(recursiveEquals(retValue, null));
    }

};


