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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283974;
     Object term284066;
     Object term284652;
     Object term284653;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term283974 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term284066 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term284158 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term284250 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        Object term284342 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term284450 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setIntField(term284066, term284066.getClass(), "type", 45);
        setIntField(term284158, term284158.getClass(), "type", 0);
        setField(term284158, term284158.getClass(), "jsType", term284250);
        setField(term284066, term284066.getClass(), "first", term284158);
        setIntField(term284342, term284342.getClass(), "type", 0);
        setField(term284342, term284342.getClass(), "jsType", term284450);
        setField(term284066, term284066.getClass(), "last", term284342);
        term284652 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term284652, term284652.getClass(), "INEQ", null);
        setField(term284652, term284652.getClass(), "convention", null);
        setField(term284652, term284652.getClass(), "typeRegistry", null);
        setField(term284652, term284652.getClass(), "firstLink", null);
        setField(term284652, term284652.getClass(), "nextLink", null);
        setField(term284652, term284652.getClass(), "restrictUndefinedVisitor", null);
        setField(term284652, term284652.getClass(), "restrictNullVisitor", null);
        term284653 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term284654 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term284655 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        Object term284656 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term284657 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setDoubleField(term284653, term284653.getClass(), "number", 0.0);
        setIntField(term284653, term284653.getClass(), "type", 45);
        setField(term284653, term284653.getClass(), "next", null);
        setDoubleField(term284654, term284654.getClass(), "number", 0.0);
        setIntField(term284654, term284654.getClass(), "type", 0);
        setField(term284654, term284654.getClass(), "next", null);
        setField(term284654, term284654.getClass(), "first", null);
        setField(term284654, term284654.getClass(), "last", null);
        setField(term284654, term284654.getClass(), "propListHead", null);
        setIntField(term284654, term284654.getClass(), "sourcePosition", 0);
        setBooleanField(term284655, term284655.getClass(), "resolved", false);
        setField(term284655, term284655.getClass(), "resolveResult", null);
        setBooleanField(term284655, term284655.getClass(), "inTemplatedCheckVisit", false);
        setField(term284655, term284655.getClass(), "registry", null);
        setField(term284654, term284654.getClass(), "jsType", term284655);
        setField(term284654, term284654.getClass(), "parent", null);
        setField(term284653, term284653.getClass(), "first", term284654);
        setField(term284656, term284656.getClass(), "str", null);
        setIntField(term284656, term284656.getClass(), "type", 0);
        setField(term284656, term284656.getClass(), "next", null);
        setField(term284656, term284656.getClass(), "first", null);
        setField(term284656, term284656.getClass(), "last", null);
        setField(term284656, term284656.getClass(), "propListHead", null);
        setIntField(term284656, term284656.getClass(), "sourcePosition", 0);
        setField(term284657, term284657.getClass(), "this$0", null);
        setField(term284657, term284657.getClass(), "call", null);
        setField(term284657, term284657.getClass(), "prototypeSlot", null);
        setField(term284657, term284657.getClass(), "kind", null);
        setField(term284657, term284657.getClass(), "typeOfThis", null);
        setField(term284657, term284657.getClass(), "source", null);
        setField(term284657, term284657.getClass(), "implementedInterfaces", null);
        setField(term284657, term284657.getClass(), "extendedInterfaces", null);
        setField(term284657, term284657.getClass(), "subTypes", null);
        setField(term284657, term284657.getClass(), "templateTypeNames", null);
        setField(term284657, term284657.getClass(), "className", null);
        setField(term284657, term284657.getClass(), "properties", null);
        setBooleanField(term284657, term284657.getClass(), "nativeType", false);
        setField(term284657, term284657.getClass(), "implicitPrototypeFallback", null);
        setField(term284657, term284657.getClass(), "ownerFunction", null);
        setBooleanField(term284657, term284657.getClass(), "prettyPrint", false);
        setBooleanField(term284657, term284657.getClass(), "visited", false);
        setField(term284657, term284657.getClass(), "docInfo", null);
        setBooleanField(term284657, term284657.getClass(), "unknown", false);
        setBooleanField(term284657, term284657.getClass(), "resolved", false);
        setField(term284657, term284657.getClass(), "resolveResult", null);
        setBooleanField(term284657, term284657.getClass(), "inTemplatedCheckVisit", false);
        setField(term284657, term284657.getClass(), "registry", null);
        setField(term284656, term284656.getClass(), "jsType", term284657);
        setField(term284656, term284656.getClass(), "parent", null);
        setField(term284653, term284653.getClass(), "last", term284656);
        setField(term284653, term284653.getClass(), "propListHead", null);
        setIntField(term284653, term284653.getClass(), "sourcePosition", 0);
        setField(term284653, term284653.getClass(), "jsType", null);
        setField(term284653, term284653.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term284066;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term283974, args);
        assertTrue(recursiveEquals(term283974, term284652));
        assertTrue(recursiveEquals(term284066, term284653));
        assertTrue(recursiveEquals(retValue, null));
    }

};


