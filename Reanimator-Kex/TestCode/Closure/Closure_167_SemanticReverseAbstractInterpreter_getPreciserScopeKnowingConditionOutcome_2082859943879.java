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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276247;
     Object term276339;
     Object term276925;
     Object term276926;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276247 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term276339 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term276431 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term276523 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term276627 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term276697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term276339, term276339.getClass(), "type", 111);
        setIntField(term276523, term276523.getClass(), "type", 4);
        setField(term276523, term276523.getClass(), "jsType", term276627);
        setField(term276431, term276431.getClass(), "first", term276523);
        setField(term276339, term276339.getClass(), "parent", term276431);
        setIntField(term276697, term276697.getClass(), "type", -4194317);
        setField(term276697, term276697.getClass(), "jsType", term276627);
        setField(term276339, term276339.getClass(), "first", term276697);
        term276925 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term276925, term276925.getClass(), "INEQ", null);
        setField(term276925, term276925.getClass(), "convention", null);
        setField(term276925, term276925.getClass(), "typeRegistry", null);
        setField(term276925, term276925.getClass(), "firstLink", null);
        setField(term276925, term276925.getClass(), "nextLink", null);
        setField(term276925, term276925.getClass(), "restrictUndefinedVisitor", null);
        setField(term276925, term276925.getClass(), "restrictNullVisitor", null);
        term276926 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term276927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term276928 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term276929 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term276930 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term276926, term276926.getClass(), "str", null);
        setIntField(term276926, term276926.getClass(), "type", 111);
        setField(term276926, term276926.getClass(), "next", null);
        setIntField(term276927, term276927.getClass(), "type", -4194317);
        setField(term276927, term276927.getClass(), "next", null);
        setField(term276927, term276927.getClass(), "first", null);
        setField(term276927, term276927.getClass(), "last", null);
        setField(term276927, term276927.getClass(), "propListHead", null);
        setIntField(term276927, term276927.getClass(), "sourcePosition", 0);
        setField(term276928, term276928.getClass(), "call", null);
        setField(term276928, term276928.getClass(), "prototypeSlot", null);
        setField(term276928, term276928.getClass(), "kind", null);
        setField(term276928, term276928.getClass(), "typeOfThis", null);
        setField(term276928, term276928.getClass(), "source", null);
        setField(term276928, term276928.getClass(), "implementedInterfaces", null);
        setField(term276928, term276928.getClass(), "extendedInterfaces", null);
        setField(term276928, term276928.getClass(), "subTypes", null);
        setField(term276928, term276928.getClass(), "templateTypeNames", null);
        setField(term276928, term276928.getClass(), "className", null);
        setField(term276928, term276928.getClass(), "properties", null);
        setBooleanField(term276928, term276928.getClass(), "nativeType", false);
        setField(term276928, term276928.getClass(), "implicitPrototypeFallback", null);
        setField(term276928, term276928.getClass(), "ownerFunction", null);
        setBooleanField(term276928, term276928.getClass(), "prettyPrint", false);
        setBooleanField(term276928, term276928.getClass(), "visited", false);
        setField(term276928, term276928.getClass(), "docInfo", null);
        setBooleanField(term276928, term276928.getClass(), "unknown", false);
        setBooleanField(term276928, term276928.getClass(), "resolved", false);
        setField(term276928, term276928.getClass(), "resolveResult", null);
        setBooleanField(term276928, term276928.getClass(), "inTemplatedCheckVisit", false);
        setField(term276928, term276928.getClass(), "registry", null);
        setField(term276927, term276927.getClass(), "jsType", term276928);
        setField(term276927, term276927.getClass(), "parent", null);
        setField(term276926, term276926.getClass(), "first", term276927);
        setField(term276926, term276926.getClass(), "last", null);
        setField(term276926, term276926.getClass(), "propListHead", null);
        setIntField(term276926, term276926.getClass(), "sourcePosition", 0);
        setField(term276926, term276926.getClass(), "jsType", null);
        setField(term276929, term276929.getClass(), "str", null);
        setIntField(term276929, term276929.getClass(), "type", 0);
        setField(term276929, term276929.getClass(), "next", null);
        setDoubleField(term276930, term276930.getClass(), "number", 0.0);
        setIntField(term276930, term276930.getClass(), "type", 4);
        setField(term276930, term276930.getClass(), "next", null);
        setField(term276930, term276930.getClass(), "first", null);
        setField(term276930, term276930.getClass(), "last", null);
        setField(term276930, term276930.getClass(), "propListHead", null);
        setIntField(term276930, term276930.getClass(), "sourcePosition", 0);
        setField(term276930, term276930.getClass(), "jsType", term276928);
        setField(term276930, term276930.getClass(), "parent", null);
        setField(term276929, term276929.getClass(), "first", term276930);
        setField(term276929, term276929.getClass(), "last", null);
        setField(term276929, term276929.getClass(), "propListHead", null);
        setIntField(term276929, term276929.getClass(), "sourcePosition", 0);
        setField(term276929, term276929.getClass(), "jsType", null);
        setField(term276929, term276929.getClass(), "parent", null);
        setField(term276926, term276926.getClass(), "parent", term276929);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term276339;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term276247, args);
        assertTrue(recursiveEquals(term276247, term276925));
        assertTrue(recursiveEquals(term276339, term276926));
        assertTrue(recursiveEquals(retValue, null));
    }

};


