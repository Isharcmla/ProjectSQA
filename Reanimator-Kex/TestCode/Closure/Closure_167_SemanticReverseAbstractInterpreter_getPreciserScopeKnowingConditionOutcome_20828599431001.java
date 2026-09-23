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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406238;
     Object term406330;
     Object term407044;
     Object term407045;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term406238 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term406330 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term406422 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term406514 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term406602 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term406694 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term406784 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setIntField(term406330, term406330.getClass(), "type", 111);
        setIntField(term406514, term406514.getClass(), "type", 111);
        setField(term406514, term406514.getClass(), "jsType", term406602);
        setField(term406422, term406422.getClass(), "first", term406514);
        setField(term406330, term406330.getClass(), "parent", term406422);
        setIntField(term406694, term406694.getClass(), "type", 111);
        setField(term406694, term406694.getClass(), "jsType", term406784);
        setField(term406330, term406330.getClass(), "first", term406694);
        term407044 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term407044, term407044.getClass(), "INEQ", null);
        setField(term407044, term407044.getClass(), "convention", null);
        setField(term407044, term407044.getClass(), "typeRegistry", null);
        setField(term407044, term407044.getClass(), "firstLink", null);
        setField(term407044, term407044.getClass(), "nextLink", null);
        setField(term407044, term407044.getClass(), "restrictUndefinedVisitor", null);
        setField(term407044, term407044.getClass(), "restrictNullVisitor", null);
        term407045 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term407046 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term407047 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        Object term407048 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term407049 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term407050 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setDoubleField(term407045, term407045.getClass(), "number", 0.0);
        setIntField(term407045, term407045.getClass(), "type", 111);
        setField(term407045, term407045.getClass(), "next", null);
        setField(term407046, term407046.getClass(), "str", null);
        setIntField(term407046, term407046.getClass(), "type", 111);
        setField(term407046, term407046.getClass(), "next", null);
        setField(term407046, term407046.getClass(), "first", null);
        setField(term407046, term407046.getClass(), "last", null);
        setField(term407046, term407046.getClass(), "propListHead", null);
        setIntField(term407046, term407046.getClass(), "sourcePosition", 0);
        setBooleanField(term407047, term407047.getClass(), "resolved", false);
        setField(term407047, term407047.getClass(), "resolveResult", null);
        setBooleanField(term407047, term407047.getClass(), "inTemplatedCheckVisit", false);
        setField(term407047, term407047.getClass(), "registry", null);
        setField(term407046, term407046.getClass(), "jsType", term407047);
        setField(term407046, term407046.getClass(), "parent", null);
        setField(term407045, term407045.getClass(), "first", term407046);
        setField(term407045, term407045.getClass(), "last", null);
        setField(term407045, term407045.getClass(), "propListHead", null);
        setIntField(term407045, term407045.getClass(), "sourcePosition", 0);
        setField(term407045, term407045.getClass(), "jsType", null);
        setDoubleField(term407048, term407048.getClass(), "number", 0.0);
        setIntField(term407048, term407048.getClass(), "type", 0);
        setField(term407048, term407048.getClass(), "next", null);
        setField(term407049, term407049.getClass(), "str", null);
        setIntField(term407049, term407049.getClass(), "type", 111);
        setField(term407049, term407049.getClass(), "next", null);
        setField(term407049, term407049.getClass(), "first", null);
        setField(term407049, term407049.getClass(), "last", null);
        setField(term407049, term407049.getClass(), "propListHead", null);
        setIntField(term407049, term407049.getClass(), "sourcePosition", 0);
        setField(term407050, term407050.getClass(), "call", null);
        setField(term407050, term407050.getClass(), "prototypeSlot", null);
        setField(term407050, term407050.getClass(), "kind", null);
        setField(term407050, term407050.getClass(), "typeOfThis", null);
        setField(term407050, term407050.getClass(), "source", null);
        setField(term407050, term407050.getClass(), "implementedInterfaces", null);
        setField(term407050, term407050.getClass(), "extendedInterfaces", null);
        setField(term407050, term407050.getClass(), "subTypes", null);
        setField(term407050, term407050.getClass(), "templateTypeNames", null);
        setField(term407050, term407050.getClass(), "className", null);
        setField(term407050, term407050.getClass(), "properties", null);
        setBooleanField(term407050, term407050.getClass(), "nativeType", false);
        setField(term407050, term407050.getClass(), "implicitPrototypeFallback", null);
        setField(term407050, term407050.getClass(), "ownerFunction", null);
        setBooleanField(term407050, term407050.getClass(), "prettyPrint", false);
        setBooleanField(term407050, term407050.getClass(), "visited", false);
        setField(term407050, term407050.getClass(), "docInfo", null);
        setBooleanField(term407050, term407050.getClass(), "unknown", false);
        setBooleanField(term407050, term407050.getClass(), "resolved", false);
        setField(term407050, term407050.getClass(), "resolveResult", null);
        setBooleanField(term407050, term407050.getClass(), "inTemplatedCheckVisit", false);
        setField(term407050, term407050.getClass(), "registry", null);
        setField(term407049, term407049.getClass(), "jsType", term407050);
        setField(term407049, term407049.getClass(), "parent", null);
        setField(term407048, term407048.getClass(), "first", term407049);
        setField(term407048, term407048.getClass(), "last", null);
        setField(term407048, term407048.getClass(), "propListHead", null);
        setIntField(term407048, term407048.getClass(), "sourcePosition", 0);
        setField(term407048, term407048.getClass(), "jsType", null);
        setField(term407048, term407048.getClass(), "parent", null);
        setField(term407045, term407045.getClass(), "parent", term407048);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term406330;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term406238, args);
        assertTrue(recursiveEquals(term406238, term407044));
        assertTrue(recursiveEquals(term406330, term407045));
        assertTrue(recursiveEquals(retValue, null));
    }

};


