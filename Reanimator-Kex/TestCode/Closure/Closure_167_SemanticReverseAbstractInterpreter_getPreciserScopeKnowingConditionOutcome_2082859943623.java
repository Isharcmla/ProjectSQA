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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176393;
     Object term176485;
     Object term176896;
     Object term176897;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176393 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term176485 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term176577 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term176677 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term176769 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term176485, term176485.getClass(), "type", 45);
        setIntField(term176577, term176577.getClass(), "type", 0);
        setField(term176577, term176577.getClass(), "jsType", term176677);
        setField(term176485, term176485.getClass(), "first", term176577);
        setIntField(term176769, term176769.getClass(), "type", 0);
        setField(term176769, term176769.getClass(), "jsType", null);
        setField(term176485, term176485.getClass(), "last", term176769);
        term176896 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term176896, term176896.getClass(), "INEQ", null);
        setField(term176896, term176896.getClass(), "convention", null);
        setField(term176896, term176896.getClass(), "typeRegistry", null);
        setField(term176896, term176896.getClass(), "firstLink", null);
        setField(term176896, term176896.getClass(), "nextLink", null);
        setField(term176896, term176896.getClass(), "restrictUndefinedVisitor", null);
        setField(term176896, term176896.getClass(), "restrictNullVisitor", null);
        term176897 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term176898 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term176899 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term176900 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term176897, term176897.getClass(), "number", 0.0);
        setIntField(term176897, term176897.getClass(), "type", 45);
        setField(term176897, term176897.getClass(), "next", null);
        setDoubleField(term176898, term176898.getClass(), "number", 0.0);
        setIntField(term176898, term176898.getClass(), "type", 0);
        setField(term176898, term176898.getClass(), "next", null);
        setField(term176898, term176898.getClass(), "first", null);
        setField(term176898, term176898.getClass(), "last", null);
        setField(term176898, term176898.getClass(), "propListHead", null);
        setIntField(term176898, term176898.getClass(), "sourcePosition", 0);
        setField(term176899, term176899.getClass(), "call", null);
        setField(term176899, term176899.getClass(), "prototypeSlot", null);
        setField(term176899, term176899.getClass(), "kind", null);
        setField(term176899, term176899.getClass(), "typeOfThis", null);
        setField(term176899, term176899.getClass(), "source", null);
        setField(term176899, term176899.getClass(), "implementedInterfaces", null);
        setField(term176899, term176899.getClass(), "extendedInterfaces", null);
        setField(term176899, term176899.getClass(), "subTypes", null);
        setField(term176899, term176899.getClass(), "templateTypeNames", null);
        setField(term176899, term176899.getClass(), "className", null);
        setField(term176899, term176899.getClass(), "properties", null);
        setBooleanField(term176899, term176899.getClass(), "nativeType", false);
        setField(term176899, term176899.getClass(), "implicitPrototypeFallback", null);
        setField(term176899, term176899.getClass(), "ownerFunction", null);
        setBooleanField(term176899, term176899.getClass(), "prettyPrint", false);
        setBooleanField(term176899, term176899.getClass(), "visited", false);
        setField(term176899, term176899.getClass(), "docInfo", null);
        setBooleanField(term176899, term176899.getClass(), "unknown", false);
        setBooleanField(term176899, term176899.getClass(), "resolved", false);
        setField(term176899, term176899.getClass(), "resolveResult", null);
        setBooleanField(term176899, term176899.getClass(), "inTemplatedCheckVisit", false);
        setField(term176899, term176899.getClass(), "registry", null);
        setField(term176898, term176898.getClass(), "jsType", term176899);
        setField(term176898, term176898.getClass(), "parent", null);
        setField(term176897, term176897.getClass(), "first", term176898);
        setField(term176900, term176900.getClass(), "str", null);
        setIntField(term176900, term176900.getClass(), "type", 0);
        setField(term176900, term176900.getClass(), "next", null);
        setField(term176900, term176900.getClass(), "first", null);
        setField(term176900, term176900.getClass(), "last", null);
        setField(term176900, term176900.getClass(), "propListHead", null);
        setIntField(term176900, term176900.getClass(), "sourcePosition", 0);
        setField(term176900, term176900.getClass(), "jsType", null);
        setField(term176900, term176900.getClass(), "parent", null);
        setField(term176897, term176897.getClass(), "last", term176900);
        setField(term176897, term176897.getClass(), "propListHead", null);
        setIntField(term176897, term176897.getClass(), "sourcePosition", 0);
        setField(term176897, term176897.getClass(), "jsType", null);
        setField(term176897, term176897.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term176485;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term176393, args);
        assertTrue(recursiveEquals(term176393, term176896));
        assertTrue(recursiveEquals(term176485, term176897));
        assertTrue(recursiveEquals(retValue, null));
    }

};


