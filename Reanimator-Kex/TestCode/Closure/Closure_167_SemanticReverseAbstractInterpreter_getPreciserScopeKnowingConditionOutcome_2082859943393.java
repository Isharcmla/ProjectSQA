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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102829;
     Object term102899;
     Object term103260;
     Object term103261;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102829 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term102899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103069 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term103139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term102899, term102899.getClass(), "type", 13);
        setIntField(term102969, term102969.getClass(), "type", 13);
        setField(term102969, term102969.getClass(), "jsType", term103069);
        setField(term102899, term102899.getClass(), "first", term102969);
        setIntField(term103139, term103139.getClass(), "type", 13);
        setField(term103139, term103139.getClass(), "jsType", null);
        setField(term102899, term102899.getClass(), "last", term103139);
        term103260 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term103260, term103260.getClass(), "INEQ", null);
        setField(term103260, term103260.getClass(), "convention", null);
        setField(term103260, term103260.getClass(), "typeRegistry", null);
        setField(term103260, term103260.getClass(), "firstLink", null);
        setField(term103260, term103260.getClass(), "nextLink", null);
        setField(term103260, term103260.getClass(), "restrictUndefinedVisitor", null);
        setField(term103260, term103260.getClass(), "restrictNullVisitor", null);
        term103261 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103263 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term103264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term103261, term103261.getClass(), "type", 13);
        setField(term103261, term103261.getClass(), "next", null);
        setIntField(term103262, term103262.getClass(), "type", 13);
        setField(term103262, term103262.getClass(), "next", null);
        setField(term103262, term103262.getClass(), "first", null);
        setField(term103262, term103262.getClass(), "last", null);
        setField(term103262, term103262.getClass(), "propListHead", null);
        setIntField(term103262, term103262.getClass(), "sourcePosition", 0);
        setField(term103263, term103263.getClass(), "call", null);
        setField(term103263, term103263.getClass(), "prototypeSlot", null);
        setField(term103263, term103263.getClass(), "kind", null);
        setField(term103263, term103263.getClass(), "typeOfThis", null);
        setField(term103263, term103263.getClass(), "source", null);
        setField(term103263, term103263.getClass(), "implementedInterfaces", null);
        setField(term103263, term103263.getClass(), "extendedInterfaces", null);
        setField(term103263, term103263.getClass(), "subTypes", null);
        setField(term103263, term103263.getClass(), "templateTypeNames", null);
        setField(term103263, term103263.getClass(), "className", null);
        setField(term103263, term103263.getClass(), "properties", null);
        setBooleanField(term103263, term103263.getClass(), "nativeType", false);
        setField(term103263, term103263.getClass(), "implicitPrototypeFallback", null);
        setField(term103263, term103263.getClass(), "ownerFunction", null);
        setBooleanField(term103263, term103263.getClass(), "prettyPrint", false);
        setBooleanField(term103263, term103263.getClass(), "visited", false);
        setField(term103263, term103263.getClass(), "docInfo", null);
        setBooleanField(term103263, term103263.getClass(), "unknown", false);
        setBooleanField(term103263, term103263.getClass(), "resolved", false);
        setField(term103263, term103263.getClass(), "resolveResult", null);
        setBooleanField(term103263, term103263.getClass(), "inTemplatedCheckVisit", false);
        setField(term103263, term103263.getClass(), "registry", null);
        setField(term103262, term103262.getClass(), "jsType", term103263);
        setField(term103262, term103262.getClass(), "parent", null);
        setField(term103261, term103261.getClass(), "first", term103262);
        setIntField(term103264, term103264.getClass(), "type", 13);
        setField(term103264, term103264.getClass(), "next", null);
        setField(term103264, term103264.getClass(), "first", null);
        setField(term103264, term103264.getClass(), "last", null);
        setField(term103264, term103264.getClass(), "propListHead", null);
        setIntField(term103264, term103264.getClass(), "sourcePosition", 0);
        setField(term103264, term103264.getClass(), "jsType", null);
        setField(term103264, term103264.getClass(), "parent", null);
        setField(term103261, term103261.getClass(), "last", term103264);
        setField(term103261, term103261.getClass(), "propListHead", null);
        setIntField(term103261, term103261.getClass(), "sourcePosition", 0);
        setField(term103261, term103261.getClass(), "jsType", null);
        setField(term103261, term103261.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term102899;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term102829, args);
        assertTrue(recursiveEquals(term102829, term103260));
        assertTrue(recursiveEquals(term102899, term103261));
        assertTrue(recursiveEquals(retValue, null));
    }

};


