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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123366;
     Object term123458;
     Object term123846;
     Object term123847;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123366 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term123458 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term123550 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term123654 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term123724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term123458, term123458.getClass(), "type", 45);
        setIntField(term123550, term123550.getClass(), "type", -458798);
        setField(term123550, term123550.getClass(), "jsType", term123654);
        setField(term123458, term123458.getClass(), "first", term123550);
        setIntField(term123724, term123724.getClass(), "type", 45);
        setField(term123724, term123724.getClass(), "jsType", null);
        setField(term123458, term123458.getClass(), "last", term123724);
        term123846 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term123846, term123846.getClass(), "INEQ", null);
        setField(term123846, term123846.getClass(), "convention", null);
        setField(term123846, term123846.getClass(), "typeRegistry", null);
        setField(term123846, term123846.getClass(), "firstLink", null);
        setField(term123846, term123846.getClass(), "nextLink", null);
        setField(term123846, term123846.getClass(), "restrictUndefinedVisitor", null);
        setField(term123846, term123846.getClass(), "restrictNullVisitor", null);
        term123847 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term123848 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term123849 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term123850 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term123847, term123847.getClass(), "number", 0.0);
        setIntField(term123847, term123847.getClass(), "type", 45);
        setField(term123847, term123847.getClass(), "next", null);
        setField(term123848, term123848.getClass(), "str", null);
        setIntField(term123848, term123848.getClass(), "type", -458798);
        setField(term123848, term123848.getClass(), "next", null);
        setField(term123848, term123848.getClass(), "first", null);
        setField(term123848, term123848.getClass(), "last", null);
        setField(term123848, term123848.getClass(), "propListHead", null);
        setIntField(term123848, term123848.getClass(), "sourcePosition", 0);
        setField(term123849, term123849.getClass(), "call", null);
        setField(term123849, term123849.getClass(), "prototypeSlot", null);
        setField(term123849, term123849.getClass(), "kind", null);
        setField(term123849, term123849.getClass(), "typeOfThis", null);
        setField(term123849, term123849.getClass(), "source", null);
        setField(term123849, term123849.getClass(), "implementedInterfaces", null);
        setField(term123849, term123849.getClass(), "extendedInterfaces", null);
        setField(term123849, term123849.getClass(), "subTypes", null);
        setField(term123849, term123849.getClass(), "templateTypeNames", null);
        setField(term123849, term123849.getClass(), "className", null);
        setField(term123849, term123849.getClass(), "properties", null);
        setBooleanField(term123849, term123849.getClass(), "nativeType", false);
        setField(term123849, term123849.getClass(), "implicitPrototypeFallback", null);
        setField(term123849, term123849.getClass(), "ownerFunction", null);
        setBooleanField(term123849, term123849.getClass(), "prettyPrint", false);
        setBooleanField(term123849, term123849.getClass(), "visited", false);
        setField(term123849, term123849.getClass(), "docInfo", null);
        setBooleanField(term123849, term123849.getClass(), "unknown", false);
        setBooleanField(term123849, term123849.getClass(), "resolved", false);
        setField(term123849, term123849.getClass(), "resolveResult", null);
        setBooleanField(term123849, term123849.getClass(), "inTemplatedCheckVisit", false);
        setField(term123849, term123849.getClass(), "registry", null);
        setField(term123848, term123848.getClass(), "jsType", term123849);
        setField(term123848, term123848.getClass(), "parent", null);
        setField(term123847, term123847.getClass(), "first", term123848);
        setIntField(term123850, term123850.getClass(), "type", 45);
        setField(term123850, term123850.getClass(), "next", null);
        setField(term123850, term123850.getClass(), "first", null);
        setField(term123850, term123850.getClass(), "last", null);
        setField(term123850, term123850.getClass(), "propListHead", null);
        setIntField(term123850, term123850.getClass(), "sourcePosition", 0);
        setField(term123850, term123850.getClass(), "jsType", null);
        setField(term123850, term123850.getClass(), "parent", null);
        setField(term123847, term123847.getClass(), "last", term123850);
        setField(term123847, term123847.getClass(), "propListHead", null);
        setIntField(term123847, term123847.getClass(), "sourcePosition", 0);
        setField(term123847, term123847.getClass(), "jsType", null);
        setField(term123847, term123847.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term123458;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term123366, args);
        assertTrue(recursiveEquals(term123366, term123846));
        assertTrue(recursiveEquals(term123458, term123847));
        assertTrue(recursiveEquals(retValue, null));
    }

};


