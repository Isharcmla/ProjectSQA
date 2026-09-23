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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85474;
     Object term85566;
     Object term85993;
     Object term85994;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85474 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term85566 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term85658 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term85750 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term85842 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term85566, term85566.getClass(), "type", 111);
        setIntField(term85750, term85750.getClass(), "type", 111);
        setField(term85658, term85658.getClass(), "first", term85750);
        setField(term85566, term85566.getClass(), "parent", term85658);
        setIntField(term85842, term85842.getClass(), "type", 0);
        setField(term85566, term85566.getClass(), "first", term85842);
        term85993 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term85993, term85993.getClass(), "INEQ", null);
        setField(term85993, term85993.getClass(), "convention", null);
        setField(term85993, term85993.getClass(), "typeRegistry", null);
        setField(term85993, term85993.getClass(), "firstLink", null);
        setField(term85993, term85993.getClass(), "nextLink", null);
        setField(term85993, term85993.getClass(), "restrictUndefinedVisitor", null);
        setField(term85993, term85993.getClass(), "restrictNullVisitor", null);
        term85994 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term85995 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term85996 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term85997 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term85994, term85994.getClass(), "number", 0.0);
        setIntField(term85994, term85994.getClass(), "type", 111);
        setField(term85994, term85994.getClass(), "next", null);
        setField(term85995, term85995.getClass(), "str", null);
        setIntField(term85995, term85995.getClass(), "type", 0);
        setField(term85995, term85995.getClass(), "next", null);
        setField(term85995, term85995.getClass(), "first", null);
        setField(term85995, term85995.getClass(), "last", null);
        setField(term85995, term85995.getClass(), "propListHead", null);
        setIntField(term85995, term85995.getClass(), "sourcePosition", 0);
        setField(term85995, term85995.getClass(), "jsType", null);
        setField(term85995, term85995.getClass(), "parent", null);
        setField(term85994, term85994.getClass(), "first", term85995);
        setField(term85994, term85994.getClass(), "last", null);
        setField(term85994, term85994.getClass(), "propListHead", null);
        setIntField(term85994, term85994.getClass(), "sourcePosition", 0);
        setField(term85994, term85994.getClass(), "jsType", null);
        setDoubleField(term85996, term85996.getClass(), "number", 0.0);
        setIntField(term85996, term85996.getClass(), "type", 0);
        setField(term85996, term85996.getClass(), "next", null);
        setDoubleField(term85997, term85997.getClass(), "number", 0.0);
        setIntField(term85997, term85997.getClass(), "type", 111);
        setField(term85997, term85997.getClass(), "next", null);
        setField(term85997, term85997.getClass(), "first", null);
        setField(term85997, term85997.getClass(), "last", null);
        setField(term85997, term85997.getClass(), "propListHead", null);
        setIntField(term85997, term85997.getClass(), "sourcePosition", 0);
        setField(term85997, term85997.getClass(), "jsType", null);
        setField(term85997, term85997.getClass(), "parent", null);
        setField(term85996, term85996.getClass(), "first", term85997);
        setField(term85996, term85996.getClass(), "last", null);
        setField(term85996, term85996.getClass(), "propListHead", null);
        setIntField(term85996, term85996.getClass(), "sourcePosition", 0);
        setField(term85996, term85996.getClass(), "jsType", null);
        setField(term85996, term85996.getClass(), "parent", null);
        setField(term85994, term85994.getClass(), "parent", term85996);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term85566;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term85474, args);
        assertTrue(recursiveEquals(term85474, term85993));
        assertTrue(recursiveEquals(term85566, term85994));
        assertTrue(recursiveEquals(retValue, null));
    }

};


