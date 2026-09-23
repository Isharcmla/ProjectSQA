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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943859 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268313;
     Object term268405;
     Object term268936;
     Object term268937;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943859() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term268313 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term268405 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term268497 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term268587 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        Object term268679 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term268771 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        setIntField(term268405, term268405.getClass(), "type", 13);
        setIntField(term268497, term268497.getClass(), "type", 0);
        setField(term268497, term268497.getClass(), "jsType", term268587);
        setField(term268405, term268405.getClass(), "first", term268497);
        setIntField(term268679, term268679.getClass(), "type", 13);
        setField(term268679, term268679.getClass(), "jsType", term268771);
        setField(term268405, term268405.getClass(), "last", term268679);
        term268936 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term268936, term268936.getClass(), "INEQ", null);
        setField(term268936, term268936.getClass(), "convention", null);
        setField(term268936, term268936.getClass(), "typeRegistry", null);
        setField(term268936, term268936.getClass(), "firstLink", null);
        setField(term268936, term268936.getClass(), "nextLink", null);
        setField(term268936, term268936.getClass(), "restrictUndefinedVisitor", null);
        setField(term268936, term268936.getClass(), "restrictNullVisitor", null);
        term268937 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term268938 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term268939 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        Object term268940 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term268941 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        setDoubleField(term268937, term268937.getClass(), "number", 0.0);
        setIntField(term268937, term268937.getClass(), "type", 13);
        setField(term268937, term268937.getClass(), "next", null);
        setDoubleField(term268938, term268938.getClass(), "number", 0.0);
        setIntField(term268938, term268938.getClass(), "type", 0);
        setField(term268938, term268938.getClass(), "next", null);
        setField(term268938, term268938.getClass(), "first", null);
        setField(term268938, term268938.getClass(), "last", null);
        setField(term268938, term268938.getClass(), "propListHead", null);
        setIntField(term268938, term268938.getClass(), "sourcePosition", 0);
        setBooleanField(term268939, term268939.getClass(), "resolved", false);
        setField(term268939, term268939.getClass(), "resolveResult", null);
        setBooleanField(term268939, term268939.getClass(), "inTemplatedCheckVisit", false);
        setField(term268939, term268939.getClass(), "registry", null);
        setField(term268938, term268938.getClass(), "jsType", term268939);
        setField(term268938, term268938.getClass(), "parent", null);
        setField(term268937, term268937.getClass(), "first", term268938);
        setDoubleField(term268940, term268940.getClass(), "number", 0.0);
        setIntField(term268940, term268940.getClass(), "type", 13);
        setField(term268940, term268940.getClass(), "next", null);
        setField(term268940, term268940.getClass(), "first", null);
        setField(term268940, term268940.getClass(), "last", null);
        setField(term268940, term268940.getClass(), "propListHead", null);
        setIntField(term268940, term268940.getClass(), "sourcePosition", 0);
        setBooleanField(term268941, term268941.getClass(), "resolved", false);
        setField(term268941, term268941.getClass(), "resolveResult", null);
        setBooleanField(term268941, term268941.getClass(), "inTemplatedCheckVisit", false);
        setField(term268941, term268941.getClass(), "registry", null);
        setField(term268940, term268940.getClass(), "jsType", term268941);
        setField(term268940, term268940.getClass(), "parent", null);
        setField(term268937, term268937.getClass(), "last", term268940);
        setField(term268937, term268937.getClass(), "propListHead", null);
        setIntField(term268937, term268937.getClass(), "sourcePosition", 0);
        setField(term268937, term268937.getClass(), "jsType", null);
        setField(term268937, term268937.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term268405;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term268313, args);
        assertTrue(recursiveEquals(term268313, term268936));
        assertTrue(recursiveEquals(term268405, term268937));
        assertTrue(recursiveEquals(retValue, null));
    }

};


