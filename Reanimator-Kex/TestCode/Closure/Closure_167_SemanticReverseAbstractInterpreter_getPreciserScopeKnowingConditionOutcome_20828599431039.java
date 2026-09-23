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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term495891;
     Object term495983;
     Object term496519;
     Object term496520;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term495891 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term495983 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term496075 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term496167 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term496265 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        Object term496357 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term495983, term495983.getClass(), "type", 111);
        setIntField(term496167, term496167.getClass(), "type", -12583159);
        setField(term496167, term496167.getClass(), "jsType", term496265);
        setField(term496075, term496075.getClass(), "first", term496167);
        setField(term495983, term495983.getClass(), "parent", term496075);
        setIntField(term496357, term496357.getClass(), "type", 0);
        setField(term496357, term496357.getClass(), "jsType", term496265);
        setField(term495983, term495983.getClass(), "first", term496357);
        term496519 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term496519, term496519.getClass(), "INEQ", null);
        setField(term496519, term496519.getClass(), "convention", null);
        setField(term496519, term496519.getClass(), "typeRegistry", null);
        setField(term496519, term496519.getClass(), "firstLink", null);
        setField(term496519, term496519.getClass(), "nextLink", null);
        setField(term496519, term496519.getClass(), "restrictUndefinedVisitor", null);
        setField(term496519, term496519.getClass(), "restrictNullVisitor", null);
        term496520 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term496521 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term496522 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        Object term496523 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term496524 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term496520, term496520.getClass(), "str", null);
        setIntField(term496520, term496520.getClass(), "type", 111);
        setField(term496520, term496520.getClass(), "next", null);
        setField(term496521, term496521.getClass(), "str", null);
        setIntField(term496521, term496521.getClass(), "type", 0);
        setField(term496521, term496521.getClass(), "next", null);
        setField(term496521, term496521.getClass(), "first", null);
        setField(term496521, term496521.getClass(), "last", null);
        setField(term496521, term496521.getClass(), "propListHead", null);
        setIntField(term496521, term496521.getClass(), "sourcePosition", 0);
        setBooleanField(term496522, term496522.getClass(), "resolved", false);
        setField(term496522, term496522.getClass(), "resolveResult", null);
        setBooleanField(term496522, term496522.getClass(), "inTemplatedCheckVisit", false);
        setField(term496522, term496522.getClass(), "registry", null);
        setField(term496521, term496521.getClass(), "jsType", term496522);
        setField(term496521, term496521.getClass(), "parent", null);
        setField(term496520, term496520.getClass(), "first", term496521);
        setField(term496520, term496520.getClass(), "last", null);
        setField(term496520, term496520.getClass(), "propListHead", null);
        setIntField(term496520, term496520.getClass(), "sourcePosition", 0);
        setField(term496520, term496520.getClass(), "jsType", null);
        setField(term496523, term496523.getClass(), "str", null);
        setIntField(term496523, term496523.getClass(), "type", 0);
        setField(term496523, term496523.getClass(), "next", null);
        setDoubleField(term496524, term496524.getClass(), "number", 0.0);
        setIntField(term496524, term496524.getClass(), "type", -12583159);
        setField(term496524, term496524.getClass(), "next", null);
        setField(term496524, term496524.getClass(), "first", null);
        setField(term496524, term496524.getClass(), "last", null);
        setField(term496524, term496524.getClass(), "propListHead", null);
        setIntField(term496524, term496524.getClass(), "sourcePosition", 0);
        setField(term496524, term496524.getClass(), "jsType", term496522);
        setField(term496524, term496524.getClass(), "parent", null);
        setField(term496523, term496523.getClass(), "first", term496524);
        setField(term496523, term496523.getClass(), "last", null);
        setField(term496523, term496523.getClass(), "propListHead", null);
        setIntField(term496523, term496523.getClass(), "sourcePosition", 0);
        setField(term496523, term496523.getClass(), "jsType", null);
        setField(term496523, term496523.getClass(), "parent", null);
        setField(term496520, term496520.getClass(), "parent", term496523);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term495983;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term495891, args);
        assertTrue(recursiveEquals(term495891, term496519));
        assertTrue(recursiveEquals(term495983, term496520));
        assertTrue(recursiveEquals(retValue, null));
    }

};


