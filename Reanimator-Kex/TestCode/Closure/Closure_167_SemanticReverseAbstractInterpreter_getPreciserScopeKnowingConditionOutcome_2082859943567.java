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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158315;
     Object term158407;
     Object term158889;
     Object term158890;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158315 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term158407 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term158499 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term158609 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term158701 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term158407, term158407.getClass(), "type", 45);
        setIntField(term158499, term158499.getClass(), "type", 0);
        setField(term158499, term158499.getClass(), "jsType", term158609);
        setField(term158407, term158407.getClass(), "first", term158499);
        setIntField(term158701, term158701.getClass(), "type", 45);
        setField(term158701, term158701.getClass(), "jsType", null);
        setField(term158407, term158407.getClass(), "last", term158701);
        term158889 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term158889, term158889.getClass(), "INEQ", null);
        setField(term158889, term158889.getClass(), "convention", null);
        setField(term158889, term158889.getClass(), "typeRegistry", null);
        setField(term158889, term158889.getClass(), "firstLink", null);
        setField(term158889, term158889.getClass(), "nextLink", null);
        setField(term158889, term158889.getClass(), "restrictUndefinedVisitor", null);
        setField(term158889, term158889.getClass(), "restrictNullVisitor", null);
        term158890 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term158891 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term158892 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term158893 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term158890, term158890.getClass(), "number", 0.0);
        setIntField(term158890, term158890.getClass(), "type", 45);
        setField(term158890, term158890.getClass(), "next", null);
        setField(term158891, term158891.getClass(), "str", null);
        setIntField(term158891, term158891.getClass(), "type", 0);
        setField(term158891, term158891.getClass(), "next", null);
        setField(term158891, term158891.getClass(), "first", null);
        setField(term158891, term158891.getClass(), "last", null);
        setField(term158891, term158891.getClass(), "propListHead", null);
        setIntField(term158891, term158891.getClass(), "sourcePosition", 0);
        setField(term158892, term158892.getClass(), "call", null);
        setField(term158892, term158892.getClass(), "prototypeSlot", null);
        setField(term158892, term158892.getClass(), "kind", null);
        setField(term158892, term158892.getClass(), "typeOfThis", null);
        setField(term158892, term158892.getClass(), "source", null);
        setField(term158892, term158892.getClass(), "implementedInterfaces", null);
        setField(term158892, term158892.getClass(), "extendedInterfaces", null);
        setField(term158892, term158892.getClass(), "subTypes", null);
        setField(term158892, term158892.getClass(), "templateTypeNames", null);
        setField(term158892, term158892.getClass(), "className", null);
        setField(term158892, term158892.getClass(), "properties", null);
        setBooleanField(term158892, term158892.getClass(), "nativeType", false);
        setField(term158892, term158892.getClass(), "implicitPrototypeFallback", null);
        setField(term158892, term158892.getClass(), "ownerFunction", null);
        setBooleanField(term158892, term158892.getClass(), "prettyPrint", false);
        setBooleanField(term158892, term158892.getClass(), "visited", false);
        setField(term158892, term158892.getClass(), "docInfo", null);
        setBooleanField(term158892, term158892.getClass(), "unknown", false);
        setBooleanField(term158892, term158892.getClass(), "resolved", false);
        setField(term158892, term158892.getClass(), "resolveResult", null);
        setBooleanField(term158892, term158892.getClass(), "inTemplatedCheckVisit", false);
        setField(term158892, term158892.getClass(), "registry", null);
        setField(term158891, term158891.getClass(), "jsType", term158892);
        setField(term158891, term158891.getClass(), "parent", null);
        setField(term158890, term158890.getClass(), "first", term158891);
        setDoubleField(term158893, term158893.getClass(), "number", 0.0);
        setIntField(term158893, term158893.getClass(), "type", 45);
        setField(term158893, term158893.getClass(), "next", null);
        setField(term158893, term158893.getClass(), "first", null);
        setField(term158893, term158893.getClass(), "last", null);
        setField(term158893, term158893.getClass(), "propListHead", null);
        setIntField(term158893, term158893.getClass(), "sourcePosition", 0);
        setField(term158893, term158893.getClass(), "jsType", null);
        setField(term158893, term158893.getClass(), "parent", null);
        setField(term158890, term158890.getClass(), "last", term158893);
        setField(term158890, term158890.getClass(), "propListHead", null);
        setIntField(term158890, term158890.getClass(), "sourcePosition", 0);
        setField(term158890, term158890.getClass(), "jsType", null);
        setField(term158890, term158890.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term158407;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term158315, args);
        assertTrue(recursiveEquals(term158315, term158889));
        assertTrue(recursiveEquals(term158407, term158890));
        assertTrue(recursiveEquals(retValue, null));
    }

};


