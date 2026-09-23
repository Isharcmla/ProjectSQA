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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120991;
     Object term121083;
     Object term123040;
     Object term123041;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120991 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term121083 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term121175 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term121267 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term121359 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        Object term121451 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term121083, term121083.getClass(), "type", 111);
        setIntField(term121267, term121267.getClass(), "type", 0);
        setField(term121267, term121267.getClass(), "jsType", term121359);
        setField(term121175, term121175.getClass(), "first", term121267);
        setField(term121083, term121083.getClass(), "parent", term121175);
        setIntField(term121451, term121451.getClass(), "type", 0);
        setField(term121451, term121451.getClass(), "jsType", null);
        setField(term121083, term121083.getClass(), "first", term121451);
        term123040 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term123040, term123040.getClass(), "INEQ", null);
        setField(term123040, term123040.getClass(), "convention", null);
        setField(term123040, term123040.getClass(), "typeRegistry", null);
        setField(term123040, term123040.getClass(), "firstLink", null);
        setField(term123040, term123040.getClass(), "nextLink", null);
        setField(term123040, term123040.getClass(), "restrictUndefinedVisitor", null);
        setField(term123040, term123040.getClass(), "restrictNullVisitor", null);
        term123041 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term123042 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term123043 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term123044 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term123045 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setDoubleField(term123041, term123041.getClass(), "number", 0.0);
        setIntField(term123041, term123041.getClass(), "type", 111);
        setField(term123041, term123041.getClass(), "next", null);
        setField(term123042, term123042.getClass(), "str", null);
        setIntField(term123042, term123042.getClass(), "type", 0);
        setField(term123042, term123042.getClass(), "next", null);
        setField(term123042, term123042.getClass(), "first", null);
        setField(term123042, term123042.getClass(), "last", null);
        setField(term123042, term123042.getClass(), "propListHead", null);
        setIntField(term123042, term123042.getClass(), "sourcePosition", 0);
        setField(term123042, term123042.getClass(), "jsType", null);
        setField(term123042, term123042.getClass(), "parent", null);
        setField(term123041, term123041.getClass(), "first", term123042);
        setField(term123041, term123041.getClass(), "last", null);
        setField(term123041, term123041.getClass(), "propListHead", null);
        setIntField(term123041, term123041.getClass(), "sourcePosition", 0);
        setField(term123041, term123041.getClass(), "jsType", null);
        setDoubleField(term123043, term123043.getClass(), "number", 0.0);
        setIntField(term123043, term123043.getClass(), "type", 0);
        setField(term123043, term123043.getClass(), "next", null);
        setDoubleField(term123044, term123044.getClass(), "number", 0.0);
        setIntField(term123044, term123044.getClass(), "type", 0);
        setField(term123044, term123044.getClass(), "next", null);
        setField(term123044, term123044.getClass(), "first", null);
        setField(term123044, term123044.getClass(), "last", null);
        setField(term123044, term123044.getClass(), "propListHead", null);
        setIntField(term123044, term123044.getClass(), "sourcePosition", 0);
        setField(term123045, term123045.getClass(), "source", null);
        setField(term123045, term123045.getClass(), "elementsType", null);
        setField(term123045, term123045.getClass(), "elements", null);
        setField(term123045, term123045.getClass(), "className", null);
        setField(term123045, term123045.getClass(), "properties", null);
        setBooleanField(term123045, term123045.getClass(), "nativeType", false);
        setField(term123045, term123045.getClass(), "implicitPrototypeFallback", null);
        setField(term123045, term123045.getClass(), "ownerFunction", null);
        setBooleanField(term123045, term123045.getClass(), "prettyPrint", false);
        setBooleanField(term123045, term123045.getClass(), "visited", false);
        setField(term123045, term123045.getClass(), "docInfo", null);
        setBooleanField(term123045, term123045.getClass(), "unknown", false);
        setBooleanField(term123045, term123045.getClass(), "resolved", false);
        setField(term123045, term123045.getClass(), "resolveResult", null);
        setBooleanField(term123045, term123045.getClass(), "inTemplatedCheckVisit", false);
        setField(term123045, term123045.getClass(), "registry", null);
        setField(term123044, term123044.getClass(), "jsType", term123045);
        setField(term123044, term123044.getClass(), "parent", null);
        setField(term123043, term123043.getClass(), "first", term123044);
        setField(term123043, term123043.getClass(), "last", null);
        setField(term123043, term123043.getClass(), "propListHead", null);
        setIntField(term123043, term123043.getClass(), "sourcePosition", 0);
        setField(term123043, term123043.getClass(), "jsType", null);
        setField(term123043, term123043.getClass(), "parent", null);
        setField(term123041, term123041.getClass(), "parent", term123043);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term121083;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term120991, args);
        assertTrue(recursiveEquals(term120991, term123040));
        assertTrue(recursiveEquals(term121083, term123041));
        assertTrue(recursiveEquals(retValue, null));
    }

};


