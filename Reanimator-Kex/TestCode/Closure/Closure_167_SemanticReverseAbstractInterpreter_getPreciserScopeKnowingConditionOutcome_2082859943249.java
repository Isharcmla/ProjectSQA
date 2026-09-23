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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60543;
     Object term60635;
     Object term60989;
     Object term60990;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60543 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term60635 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term60727 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term60819 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term60911 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term60635, term60635.getClass(), "type", 111);
        setIntField(term60819, term60819.getClass(), "type", 111);
        setField(term60727, term60727.getClass(), "first", term60819);
        setField(term60635, term60635.getClass(), "parent", term60727);
        setIntField(term60911, term60911.getClass(), "type", 111);
        setField(term60635, term60635.getClass(), "first", term60911);
        term60989 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term60989, term60989.getClass(), "INEQ", null);
        setField(term60989, term60989.getClass(), "convention", null);
        setField(term60989, term60989.getClass(), "typeRegistry", null);
        setField(term60989, term60989.getClass(), "firstLink", null);
        setField(term60989, term60989.getClass(), "nextLink", null);
        setField(term60989, term60989.getClass(), "restrictUndefinedVisitor", null);
        setField(term60989, term60989.getClass(), "restrictNullVisitor", null);
        term60990 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term60991 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term60992 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term60993 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term60990, term60990.getClass(), "str", null);
        setIntField(term60990, term60990.getClass(), "type", 111);
        setField(term60990, term60990.getClass(), "next", null);
        setField(term60991, term60991.getClass(), "str", null);
        setIntField(term60991, term60991.getClass(), "type", 111);
        setField(term60991, term60991.getClass(), "next", null);
        setField(term60991, term60991.getClass(), "first", null);
        setField(term60991, term60991.getClass(), "last", null);
        setField(term60991, term60991.getClass(), "propListHead", null);
        setIntField(term60991, term60991.getClass(), "sourcePosition", 0);
        setField(term60991, term60991.getClass(), "jsType", null);
        setField(term60991, term60991.getClass(), "parent", null);
        setField(term60990, term60990.getClass(), "first", term60991);
        setField(term60990, term60990.getClass(), "last", null);
        setField(term60990, term60990.getClass(), "propListHead", null);
        setIntField(term60990, term60990.getClass(), "sourcePosition", 0);
        setField(term60990, term60990.getClass(), "jsType", null);
        setField(term60992, term60992.getClass(), "str", null);
        setIntField(term60992, term60992.getClass(), "type", 0);
        setField(term60992, term60992.getClass(), "next", null);
        setField(term60993, term60993.getClass(), "str", null);
        setIntField(term60993, term60993.getClass(), "type", 111);
        setField(term60993, term60993.getClass(), "next", null);
        setField(term60993, term60993.getClass(), "first", null);
        setField(term60993, term60993.getClass(), "last", null);
        setField(term60993, term60993.getClass(), "propListHead", null);
        setIntField(term60993, term60993.getClass(), "sourcePosition", 0);
        setField(term60993, term60993.getClass(), "jsType", null);
        setField(term60993, term60993.getClass(), "parent", null);
        setField(term60992, term60992.getClass(), "first", term60993);
        setField(term60992, term60992.getClass(), "last", null);
        setField(term60992, term60992.getClass(), "propListHead", null);
        setIntField(term60992, term60992.getClass(), "sourcePosition", 0);
        setField(term60992, term60992.getClass(), "jsType", null);
        setField(term60992, term60992.getClass(), "parent", null);
        setField(term60990, term60990.getClass(), "parent", term60992);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term60635;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term60543, args);
        assertTrue(recursiveEquals(term60543, term60989));
        assertTrue(recursiveEquals(term60635, term60990));
        assertTrue(recursiveEquals(retValue, null));
    }

};


