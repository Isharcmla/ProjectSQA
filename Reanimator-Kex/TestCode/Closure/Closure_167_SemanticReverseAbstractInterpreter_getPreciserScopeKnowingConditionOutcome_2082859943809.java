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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943809 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245993;
     Object term246085;
     Object term246738;
     Object term246739;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943809() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245993 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term246085 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term246177 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term246281 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term246373 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term246485 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setIntField(term246085, term246085.getClass(), "type", 45);
        setIntField(term246177, term246177.getClass(), "type", 0);
        setField(term246177, term246177.getClass(), "jsType", term246281);
        setField(term246085, term246085.getClass(), "first", term246177);
        setIntField(term246373, term246373.getClass(), "type", 45);
        setField(term246373, term246373.getClass(), "jsType", term246485);
        setField(term246085, term246085.getClass(), "last", term246373);
        term246738 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term246738, term246738.getClass(), "INEQ", null);
        setField(term246738, term246738.getClass(), "convention", null);
        setField(term246738, term246738.getClass(), "typeRegistry", null);
        setField(term246738, term246738.getClass(), "firstLink", null);
        setField(term246738, term246738.getClass(), "nextLink", null);
        setField(term246738, term246738.getClass(), "restrictUndefinedVisitor", null);
        setField(term246738, term246738.getClass(), "restrictNullVisitor", null);
        term246739 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term246740 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term246741 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term246742 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term246743 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setDoubleField(term246739, term246739.getClass(), "number", 0.0);
        setIntField(term246739, term246739.getClass(), "type", 45);
        setField(term246739, term246739.getClass(), "next", null);
        setDoubleField(term246740, term246740.getClass(), "number", 0.0);
        setIntField(term246740, term246740.getClass(), "type", 0);
        setField(term246740, term246740.getClass(), "next", null);
        setField(term246740, term246740.getClass(), "first", null);
        setField(term246740, term246740.getClass(), "last", null);
        setField(term246740, term246740.getClass(), "propListHead", null);
        setIntField(term246740, term246740.getClass(), "sourcePosition", 0);
        setField(term246741, term246741.getClass(), "call", null);
        setField(term246741, term246741.getClass(), "prototypeSlot", null);
        setField(term246741, term246741.getClass(), "kind", null);
        setField(term246741, term246741.getClass(), "typeOfThis", null);
        setField(term246741, term246741.getClass(), "source", null);
        setField(term246741, term246741.getClass(), "implementedInterfaces", null);
        setField(term246741, term246741.getClass(), "extendedInterfaces", null);
        setField(term246741, term246741.getClass(), "subTypes", null);
        setField(term246741, term246741.getClass(), "templateTypeNames", null);
        setField(term246741, term246741.getClass(), "className", null);
        setField(term246741, term246741.getClass(), "properties", null);
        setBooleanField(term246741, term246741.getClass(), "nativeType", false);
        setField(term246741, term246741.getClass(), "implicitPrototypeFallback", null);
        setField(term246741, term246741.getClass(), "ownerFunction", null);
        setBooleanField(term246741, term246741.getClass(), "prettyPrint", false);
        setBooleanField(term246741, term246741.getClass(), "visited", false);
        setField(term246741, term246741.getClass(), "docInfo", null);
        setBooleanField(term246741, term246741.getClass(), "unknown", false);
        setBooleanField(term246741, term246741.getClass(), "resolved", false);
        setField(term246741, term246741.getClass(), "resolveResult", null);
        setBooleanField(term246741, term246741.getClass(), "inTemplatedCheckVisit", false);
        setField(term246741, term246741.getClass(), "registry", null);
        setField(term246740, term246740.getClass(), "jsType", term246741);
        setField(term246740, term246740.getClass(), "parent", null);
        setField(term246739, term246739.getClass(), "first", term246740);
        setDoubleField(term246742, term246742.getClass(), "number", 0.0);
        setIntField(term246742, term246742.getClass(), "type", 45);
        setField(term246742, term246742.getClass(), "next", null);
        setField(term246742, term246742.getClass(), "first", null);
        setField(term246742, term246742.getClass(), "last", null);
        setField(term246742, term246742.getClass(), "propListHead", null);
        setIntField(term246742, term246742.getClass(), "sourcePosition", 0);
        setField(term246743, term246743.getClass(), "constructor", null);
        setField(term246743, term246743.getClass(), "className", null);
        setField(term246743, term246743.getClass(), "properties", null);
        setBooleanField(term246743, term246743.getClass(), "nativeType", false);
        setField(term246743, term246743.getClass(), "implicitPrototypeFallback", null);
        setField(term246743, term246743.getClass(), "ownerFunction", null);
        setBooleanField(term246743, term246743.getClass(), "prettyPrint", false);
        setBooleanField(term246743, term246743.getClass(), "visited", false);
        setField(term246743, term246743.getClass(), "docInfo", null);
        setBooleanField(term246743, term246743.getClass(), "unknown", false);
        setBooleanField(term246743, term246743.getClass(), "resolved", false);
        setField(term246743, term246743.getClass(), "resolveResult", null);
        setBooleanField(term246743, term246743.getClass(), "inTemplatedCheckVisit", false);
        setField(term246743, term246743.getClass(), "registry", null);
        setField(term246742, term246742.getClass(), "jsType", term246743);
        setField(term246742, term246742.getClass(), "parent", null);
        setField(term246739, term246739.getClass(), "last", term246742);
        setField(term246739, term246739.getClass(), "propListHead", null);
        setIntField(term246739, term246739.getClass(), "sourcePosition", 0);
        setField(term246739, term246739.getClass(), "jsType", null);
        setField(term246739, term246739.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term246085;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term245993, args);
        assertTrue(recursiveEquals(term245993, term246738));
        assertTrue(recursiveEquals(term246085, term246739));
        assertTrue(recursiveEquals(retValue, null));
    }

};


