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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210110;
     Object term210202;
     Object term210760;
     Object term210761;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210110 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term210202 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term210294 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term210386 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term210494 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term210586 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term210202, term210202.getClass(), "type", 111);
        setIntField(term210386, term210386.getClass(), "type", 0);
        setField(term210386, term210386.getClass(), "jsType", term210494);
        setField(term210294, term210294.getClass(), "first", term210386);
        setField(term210202, term210202.getClass(), "parent", term210294);
        setIntField(term210586, term210586.getClass(), "type", 111);
        setField(term210586, term210586.getClass(), "jsType", null);
        setField(term210202, term210202.getClass(), "first", term210586);
        term210760 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term210760, term210760.getClass(), "INEQ", null);
        setField(term210760, term210760.getClass(), "convention", null);
        setField(term210760, term210760.getClass(), "typeRegistry", null);
        setField(term210760, term210760.getClass(), "firstLink", null);
        setField(term210760, term210760.getClass(), "nextLink", null);
        setField(term210760, term210760.getClass(), "restrictUndefinedVisitor", null);
        setField(term210760, term210760.getClass(), "restrictNullVisitor", null);
        term210761 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term210762 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term210763 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term210764 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term210765 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setDoubleField(term210761, term210761.getClass(), "number", 0.0);
        setIntField(term210761, term210761.getClass(), "type", 111);
        setField(term210761, term210761.getClass(), "next", null);
        setDoubleField(term210762, term210762.getClass(), "number", 0.0);
        setIntField(term210762, term210762.getClass(), "type", 111);
        setField(term210762, term210762.getClass(), "next", null);
        setField(term210762, term210762.getClass(), "first", null);
        setField(term210762, term210762.getClass(), "last", null);
        setField(term210762, term210762.getClass(), "propListHead", null);
        setIntField(term210762, term210762.getClass(), "sourcePosition", 0);
        setField(term210762, term210762.getClass(), "jsType", null);
        setField(term210762, term210762.getClass(), "parent", null);
        setField(term210761, term210761.getClass(), "first", term210762);
        setField(term210761, term210761.getClass(), "last", null);
        setField(term210761, term210761.getClass(), "propListHead", null);
        setIntField(term210761, term210761.getClass(), "sourcePosition", 0);
        setField(term210761, term210761.getClass(), "jsType", null);
        setDoubleField(term210763, term210763.getClass(), "number", 0.0);
        setIntField(term210763, term210763.getClass(), "type", 0);
        setField(term210763, term210763.getClass(), "next", null);
        setDoubleField(term210764, term210764.getClass(), "number", 0.0);
        setIntField(term210764, term210764.getClass(), "type", 0);
        setField(term210764, term210764.getClass(), "next", null);
        setField(term210764, term210764.getClass(), "first", null);
        setField(term210764, term210764.getClass(), "last", null);
        setField(term210764, term210764.getClass(), "propListHead", null);
        setIntField(term210764, term210764.getClass(), "sourcePosition", 0);
        setField(term210765, term210765.getClass(), "this$0", null);
        setField(term210765, term210765.getClass(), "call", null);
        setField(term210765, term210765.getClass(), "prototypeSlot", null);
        setField(term210765, term210765.getClass(), "kind", null);
        setField(term210765, term210765.getClass(), "typeOfThis", null);
        setField(term210765, term210765.getClass(), "source", null);
        setField(term210765, term210765.getClass(), "implementedInterfaces", null);
        setField(term210765, term210765.getClass(), "extendedInterfaces", null);
        setField(term210765, term210765.getClass(), "subTypes", null);
        setField(term210765, term210765.getClass(), "templateTypeNames", null);
        setField(term210765, term210765.getClass(), "className", null);
        setField(term210765, term210765.getClass(), "properties", null);
        setBooleanField(term210765, term210765.getClass(), "nativeType", false);
        setField(term210765, term210765.getClass(), "implicitPrototypeFallback", null);
        setField(term210765, term210765.getClass(), "ownerFunction", null);
        setBooleanField(term210765, term210765.getClass(), "prettyPrint", false);
        setBooleanField(term210765, term210765.getClass(), "visited", false);
        setField(term210765, term210765.getClass(), "docInfo", null);
        setBooleanField(term210765, term210765.getClass(), "unknown", false);
        setBooleanField(term210765, term210765.getClass(), "resolved", false);
        setField(term210765, term210765.getClass(), "resolveResult", null);
        setBooleanField(term210765, term210765.getClass(), "inTemplatedCheckVisit", false);
        setField(term210765, term210765.getClass(), "registry", null);
        setField(term210764, term210764.getClass(), "jsType", term210765);
        setField(term210764, term210764.getClass(), "parent", null);
        setField(term210763, term210763.getClass(), "first", term210764);
        setField(term210763, term210763.getClass(), "last", null);
        setField(term210763, term210763.getClass(), "propListHead", null);
        setIntField(term210763, term210763.getClass(), "sourcePosition", 0);
        setField(term210763, term210763.getClass(), "jsType", null);
        setField(term210763, term210763.getClass(), "parent", null);
        setField(term210761, term210761.getClass(), "parent", term210763);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term210202;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term210110, args);
        assertTrue(recursiveEquals(term210110, term210760));
        assertTrue(recursiveEquals(term210202, term210761));
        assertTrue(recursiveEquals(retValue, null));
    }

};


