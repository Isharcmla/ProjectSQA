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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term495085;
     Object term495177;
     Object term495664;
     Object term495665;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term495085 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term495177 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term495269 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term495361 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        Object term495453 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term495177, term495177.getClass(), "type", 45);
        setIntField(term495269, term495269.getClass(), "type", -198700);
        setField(term495269, term495269.getClass(), "jsType", term495361);
        setField(term495177, term495177.getClass(), "first", term495269);
        setIntField(term495453, term495453.getClass(), "type", 1);
        setField(term495453, term495453.getClass(), "jsType", term495361);
        setField(term495177, term495177.getClass(), "last", term495453);
        term495664 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term495664, term495664.getClass(), "INEQ", null);
        setField(term495664, term495664.getClass(), "convention", null);
        setField(term495664, term495664.getClass(), "typeRegistry", null);
        setField(term495664, term495664.getClass(), "firstLink", null);
        setField(term495664, term495664.getClass(), "nextLink", null);
        setField(term495664, term495664.getClass(), "restrictUndefinedVisitor", null);
        setField(term495664, term495664.getClass(), "restrictNullVisitor", null);
        term495665 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term495666 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term495667 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        Object term495668 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term495665, term495665.getClass(), "number", 0.0);
        setIntField(term495665, term495665.getClass(), "type", 45);
        setField(term495665, term495665.getClass(), "next", null);
        setDoubleField(term495666, term495666.getClass(), "number", 0.0);
        setIntField(term495666, term495666.getClass(), "type", -198700);
        setField(term495666, term495666.getClass(), "next", null);
        setField(term495666, term495666.getClass(), "first", null);
        setField(term495666, term495666.getClass(), "last", null);
        setField(term495666, term495666.getClass(), "propListHead", null);
        setIntField(term495666, term495666.getClass(), "sourcePosition", 0);
        setField(term495667, term495667.getClass(), "source", null);
        setField(term495667, term495667.getClass(), "elementsType", null);
        setField(term495667, term495667.getClass(), "elements", null);
        setField(term495667, term495667.getClass(), "className", null);
        setField(term495667, term495667.getClass(), "properties", null);
        setBooleanField(term495667, term495667.getClass(), "nativeType", false);
        setField(term495667, term495667.getClass(), "implicitPrototypeFallback", null);
        setField(term495667, term495667.getClass(), "ownerFunction", null);
        setBooleanField(term495667, term495667.getClass(), "prettyPrint", false);
        setBooleanField(term495667, term495667.getClass(), "visited", false);
        setField(term495667, term495667.getClass(), "docInfo", null);
        setBooleanField(term495667, term495667.getClass(), "unknown", false);
        setBooleanField(term495667, term495667.getClass(), "resolved", false);
        setField(term495667, term495667.getClass(), "resolveResult", null);
        setBooleanField(term495667, term495667.getClass(), "inTemplatedCheckVisit", false);
        setField(term495667, term495667.getClass(), "registry", null);
        setField(term495666, term495666.getClass(), "jsType", term495667);
        setField(term495666, term495666.getClass(), "parent", null);
        setField(term495665, term495665.getClass(), "first", term495666);
        setDoubleField(term495668, term495668.getClass(), "number", 0.0);
        setIntField(term495668, term495668.getClass(), "type", 1);
        setField(term495668, term495668.getClass(), "next", null);
        setField(term495668, term495668.getClass(), "first", null);
        setField(term495668, term495668.getClass(), "last", null);
        setField(term495668, term495668.getClass(), "propListHead", null);
        setIntField(term495668, term495668.getClass(), "sourcePosition", 0);
        setField(term495668, term495668.getClass(), "jsType", term495667);
        setField(term495668, term495668.getClass(), "parent", null);
        setField(term495665, term495665.getClass(), "last", term495668);
        setField(term495665, term495665.getClass(), "propListHead", null);
        setIntField(term495665, term495665.getClass(), "sourcePosition", 0);
        setField(term495665, term495665.getClass(), "jsType", null);
        setField(term495665, term495665.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term495177;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term495085, args);
        assertTrue(recursiveEquals(term495085, term495664));
        assertTrue(recursiveEquals(term495177, term495665));
        assertTrue(recursiveEquals(retValue, null));
    }

};


