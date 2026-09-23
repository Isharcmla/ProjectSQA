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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142792;
     Object term143008;
     Object term143334;
     Object term143336;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142792 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object term142938 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$4"));
        setField(term142792, term142792.getClass(), "INEQ", term142938);
        term143008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143178 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term143248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term143008, term143008.getClass(), "type", 16);
        setIntField(term143078, term143078.getClass(), "type", 16);
        setField(term143078, term143078.getClass(), "jsType", term143178);
        setField(term143008, term143008.getClass(), "first", term143078);
        setField(term143008, term143008.getClass(), "last", term143248);
        term143334 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object term143335 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$4"));
        setField(term143334, term143334.getClass(), "INEQ", term143335);
        setField(term143334, term143334.getClass(), "convention", null);
        setField(term143334, term143334.getClass(), "typeRegistry", null);
        setField(term143334, term143334.getClass(), "firstLink", null);
        setField(term143334, term143334.getClass(), "nextLink", null);
        setField(term143334, term143334.getClass(), "restrictUndefinedVisitor", null);
        setField(term143334, term143334.getClass(), "restrictNullVisitor", null);
        term143336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143338 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term143339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term143336, term143336.getClass(), "type", 16);
        setField(term143336, term143336.getClass(), "next", null);
        setIntField(term143337, term143337.getClass(), "type", 16);
        setField(term143337, term143337.getClass(), "next", null);
        setField(term143337, term143337.getClass(), "first", null);
        setField(term143337, term143337.getClass(), "last", null);
        setField(term143337, term143337.getClass(), "propListHead", null);
        setIntField(term143337, term143337.getClass(), "sourcePosition", 0);
        setField(term143338, term143338.getClass(), "call", null);
        setField(term143338, term143338.getClass(), "prototypeSlot", null);
        setField(term143338, term143338.getClass(), "kind", null);
        setField(term143338, term143338.getClass(), "typeOfThis", null);
        setField(term143338, term143338.getClass(), "source", null);
        setField(term143338, term143338.getClass(), "implementedInterfaces", null);
        setField(term143338, term143338.getClass(), "extendedInterfaces", null);
        setField(term143338, term143338.getClass(), "subTypes", null);
        setField(term143338, term143338.getClass(), "templateTypeNames", null);
        setField(term143338, term143338.getClass(), "className", null);
        setField(term143338, term143338.getClass(), "properties", null);
        setBooleanField(term143338, term143338.getClass(), "nativeType", false);
        setField(term143338, term143338.getClass(), "implicitPrototypeFallback", null);
        setField(term143338, term143338.getClass(), "ownerFunction", null);
        setBooleanField(term143338, term143338.getClass(), "prettyPrint", false);
        setBooleanField(term143338, term143338.getClass(), "visited", false);
        setField(term143338, term143338.getClass(), "docInfo", null);
        setBooleanField(term143338, term143338.getClass(), "unknown", false);
        setBooleanField(term143338, term143338.getClass(), "resolved", false);
        setField(term143338, term143338.getClass(), "resolveResult", null);
        setBooleanField(term143338, term143338.getClass(), "inTemplatedCheckVisit", false);
        setField(term143338, term143338.getClass(), "registry", null);
        setField(term143337, term143337.getClass(), "jsType", term143338);
        setField(term143337, term143337.getClass(), "parent", null);
        setField(term143336, term143336.getClass(), "first", term143337);
        setIntField(term143339, term143339.getClass(), "type", 0);
        setField(term143339, term143339.getClass(), "next", null);
        setField(term143339, term143339.getClass(), "first", null);
        setField(term143339, term143339.getClass(), "last", null);
        setField(term143339, term143339.getClass(), "propListHead", null);
        setIntField(term143339, term143339.getClass(), "sourcePosition", 0);
        setField(term143339, term143339.getClass(), "jsType", null);
        setField(term143339, term143339.getClass(), "parent", null);
        setField(term143336, term143336.getClass(), "last", term143339);
        setField(term143336, term143336.getClass(), "propListHead", null);
        setIntField(term143336, term143336.getClass(), "sourcePosition", 0);
        setField(term143336, term143336.getClass(), "jsType", null);
        setField(term143336, term143336.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term143008;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term142792, args);
        assertTrue(recursiveEquals(term142792, term143334));
        assertTrue(recursiveEquals(term143008, term143336));
        assertTrue(recursiveEquals(retValue, null));
    }

};


