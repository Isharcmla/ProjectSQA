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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368761;
     Object term368853;
     Object term370110;
     Object term370111;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term368761 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term368853 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term368945 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term369037 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term369125 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term369217 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term368853, term368853.getClass(), "type", 111);
        setIntField(term369037, term369037.getClass(), "type", 0);
        setField(term369037, term369037.getClass(), "jsType", term369125);
        setField(term368945, term368945.getClass(), "first", term369037);
        setField(term368853, term368853.getClass(), "parent", term368945);
        setIntField(term369217, term369217.getClass(), "type", 0);
        setField(term369217, term369217.getClass(), "jsType", term369125);
        setField(term368853, term368853.getClass(), "first", term369217);
        term370110 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term370110, term370110.getClass(), "INEQ", null);
        setField(term370110, term370110.getClass(), "convention", null);
        setField(term370110, term370110.getClass(), "typeRegistry", null);
        setField(term370110, term370110.getClass(), "firstLink", null);
        setField(term370110, term370110.getClass(), "nextLink", null);
        setField(term370110, term370110.getClass(), "restrictUndefinedVisitor", null);
        setField(term370110, term370110.getClass(), "restrictNullVisitor", null);
        term370111 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term370112 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term370113 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term370114 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term370115 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term370111, term370111.getClass(), "number", 0.0);
        setIntField(term370111, term370111.getClass(), "type", 111);
        setField(term370111, term370111.getClass(), "next", null);
        setField(term370112, term370112.getClass(), "str", null);
        setIntField(term370112, term370112.getClass(), "type", 0);
        setField(term370112, term370112.getClass(), "next", null);
        setField(term370112, term370112.getClass(), "first", null);
        setField(term370112, term370112.getClass(), "last", null);
        setField(term370112, term370112.getClass(), "propListHead", null);
        setIntField(term370112, term370112.getClass(), "sourcePosition", 0);
        setField(term370113, term370113.getClass(), "call", null);
        setField(term370113, term370113.getClass(), "prototypeSlot", null);
        setField(term370113, term370113.getClass(), "kind", null);
        setField(term370113, term370113.getClass(), "typeOfThis", null);
        setField(term370113, term370113.getClass(), "source", null);
        setField(term370113, term370113.getClass(), "implementedInterfaces", null);
        setField(term370113, term370113.getClass(), "extendedInterfaces", null);
        setField(term370113, term370113.getClass(), "subTypes", null);
        setField(term370113, term370113.getClass(), "templateTypeNames", null);
        setField(term370113, term370113.getClass(), "className", null);
        setField(term370113, term370113.getClass(), "properties", null);
        setBooleanField(term370113, term370113.getClass(), "nativeType", false);
        setField(term370113, term370113.getClass(), "implicitPrototypeFallback", null);
        setField(term370113, term370113.getClass(), "ownerFunction", null);
        setBooleanField(term370113, term370113.getClass(), "prettyPrint", false);
        setBooleanField(term370113, term370113.getClass(), "visited", false);
        setField(term370113, term370113.getClass(), "docInfo", null);
        setBooleanField(term370113, term370113.getClass(), "unknown", false);
        setBooleanField(term370113, term370113.getClass(), "resolved", false);
        setField(term370113, term370113.getClass(), "resolveResult", null);
        setBooleanField(term370113, term370113.getClass(), "inTemplatedCheckVisit", false);
        setField(term370113, term370113.getClass(), "registry", null);
        setField(term370112, term370112.getClass(), "jsType", term370113);
        setField(term370112, term370112.getClass(), "parent", null);
        setField(term370111, term370111.getClass(), "first", term370112);
        setField(term370111, term370111.getClass(), "last", null);
        setField(term370111, term370111.getClass(), "propListHead", null);
        setIntField(term370111, term370111.getClass(), "sourcePosition", 0);
        setField(term370111, term370111.getClass(), "jsType", null);
        setDoubleField(term370114, term370114.getClass(), "number", 0.0);
        setIntField(term370114, term370114.getClass(), "type", 0);
        setField(term370114, term370114.getClass(), "next", null);
        setField(term370115, term370115.getClass(), "str", null);
        setIntField(term370115, term370115.getClass(), "type", 0);
        setField(term370115, term370115.getClass(), "next", null);
        setField(term370115, term370115.getClass(), "first", null);
        setField(term370115, term370115.getClass(), "last", null);
        setField(term370115, term370115.getClass(), "propListHead", null);
        setIntField(term370115, term370115.getClass(), "sourcePosition", 0);
        setField(term370115, term370115.getClass(), "jsType", term370113);
        setField(term370115, term370115.getClass(), "parent", null);
        setField(term370114, term370114.getClass(), "first", term370115);
        setField(term370114, term370114.getClass(), "last", null);
        setField(term370114, term370114.getClass(), "propListHead", null);
        setIntField(term370114, term370114.getClass(), "sourcePosition", 0);
        setField(term370114, term370114.getClass(), "jsType", null);
        setField(term370114, term370114.getClass(), "parent", null);
        setField(term370111, term370111.getClass(), "parent", term370114);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term368853;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term368761, args);
        assertTrue(recursiveEquals(term368761, term370110));
        assertTrue(recursiveEquals(term368853, term370111));
        assertTrue(recursiveEquals(retValue, null));
    }

};


