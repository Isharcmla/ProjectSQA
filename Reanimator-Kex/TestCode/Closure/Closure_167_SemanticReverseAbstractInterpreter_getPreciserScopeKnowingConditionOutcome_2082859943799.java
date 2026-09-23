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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943799 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241940;
     Object term242032;
     Object term242582;
     Object term242583;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943799() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term241940 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term242032 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term242124 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term242216 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term242328 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        Object term242420 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term242032, term242032.getClass(), "type", 111);
        setIntField(term242216, term242216.getClass(), "type", 0);
        setField(term242216, term242216.getClass(), "jsType", term242328);
        setField(term242124, term242124.getClass(), "first", term242216);
        setField(term242032, term242032.getClass(), "parent", term242124);
        setIntField(term242420, term242420.getClass(), "type", -1431654433);
        setField(term242420, term242420.getClass(), "jsType", null);
        setField(term242032, term242032.getClass(), "first", term242420);
        term242582 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term242582, term242582.getClass(), "INEQ", null);
        setField(term242582, term242582.getClass(), "convention", null);
        setField(term242582, term242582.getClass(), "typeRegistry", null);
        setField(term242582, term242582.getClass(), "firstLink", null);
        setField(term242582, term242582.getClass(), "nextLink", null);
        setField(term242582, term242582.getClass(), "restrictUndefinedVisitor", null);
        setField(term242582, term242582.getClass(), "restrictNullVisitor", null);
        term242583 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term242584 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term242585 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term242586 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term242587 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setDoubleField(term242583, term242583.getClass(), "number", 0.0);
        setIntField(term242583, term242583.getClass(), "type", 111);
        setField(term242583, term242583.getClass(), "next", null);
        setField(term242584, term242584.getClass(), "str", null);
        setIntField(term242584, term242584.getClass(), "type", -1431654433);
        setField(term242584, term242584.getClass(), "next", null);
        setField(term242584, term242584.getClass(), "first", null);
        setField(term242584, term242584.getClass(), "last", null);
        setField(term242584, term242584.getClass(), "propListHead", null);
        setIntField(term242584, term242584.getClass(), "sourcePosition", 0);
        setField(term242584, term242584.getClass(), "jsType", null);
        setField(term242584, term242584.getClass(), "parent", null);
        setField(term242583, term242583.getClass(), "first", term242584);
        setField(term242583, term242583.getClass(), "last", null);
        setField(term242583, term242583.getClass(), "propListHead", null);
        setIntField(term242583, term242583.getClass(), "sourcePosition", 0);
        setField(term242583, term242583.getClass(), "jsType", null);
        setDoubleField(term242585, term242585.getClass(), "number", 0.0);
        setIntField(term242585, term242585.getClass(), "type", 0);
        setField(term242585, term242585.getClass(), "next", null);
        setField(term242586, term242586.getClass(), "str", null);
        setIntField(term242586, term242586.getClass(), "type", 0);
        setField(term242586, term242586.getClass(), "next", null);
        setField(term242586, term242586.getClass(), "first", null);
        setField(term242586, term242586.getClass(), "last", null);
        setField(term242586, term242586.getClass(), "propListHead", null);
        setIntField(term242586, term242586.getClass(), "sourcePosition", 0);
        setField(term242587, term242587.getClass(), "constructor", null);
        setField(term242587, term242587.getClass(), "className", null);
        setField(term242587, term242587.getClass(), "properties", null);
        setBooleanField(term242587, term242587.getClass(), "nativeType", false);
        setField(term242587, term242587.getClass(), "implicitPrototypeFallback", null);
        setField(term242587, term242587.getClass(), "ownerFunction", null);
        setBooleanField(term242587, term242587.getClass(), "prettyPrint", false);
        setBooleanField(term242587, term242587.getClass(), "visited", false);
        setField(term242587, term242587.getClass(), "docInfo", null);
        setBooleanField(term242587, term242587.getClass(), "unknown", false);
        setBooleanField(term242587, term242587.getClass(), "resolved", false);
        setField(term242587, term242587.getClass(), "resolveResult", null);
        setBooleanField(term242587, term242587.getClass(), "inTemplatedCheckVisit", false);
        setField(term242587, term242587.getClass(), "registry", null);
        setField(term242586, term242586.getClass(), "jsType", term242587);
        setField(term242586, term242586.getClass(), "parent", null);
        setField(term242585, term242585.getClass(), "first", term242586);
        setField(term242585, term242585.getClass(), "last", null);
        setField(term242585, term242585.getClass(), "propListHead", null);
        setIntField(term242585, term242585.getClass(), "sourcePosition", 0);
        setField(term242585, term242585.getClass(), "jsType", null);
        setField(term242585, term242585.getClass(), "parent", null);
        setField(term242583, term242583.getClass(), "parent", term242585);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term242032;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term241940, args);
        assertTrue(recursiveEquals(term241940, term242582));
        assertTrue(recursiveEquals(term242032, term242583));
        assertTrue(recursiveEquals(retValue, null));
    }

};


