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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227147;
     Object term227239;
     Object term227845;
     Object term227846;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227147 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term227239 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term227331 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term227423 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term227535 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        Object term227605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term227239, term227239.getClass(), "type", 111);
        setIntField(term227423, term227423.getClass(), "type", 4);
        setField(term227423, term227423.getClass(), "jsType", term227535);
        setField(term227331, term227331.getClass(), "first", term227423);
        setField(term227239, term227239.getClass(), "parent", term227331);
        setIntField(term227605, term227605.getClass(), "type", -4194317);
        setField(term227605, term227605.getClass(), "jsType", term227535);
        setField(term227239, term227239.getClass(), "first", term227605);
        term227845 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term227845, term227845.getClass(), "INEQ", null);
        setField(term227845, term227845.getClass(), "convention", null);
        setField(term227845, term227845.getClass(), "typeRegistry", null);
        setField(term227845, term227845.getClass(), "firstLink", null);
        setField(term227845, term227845.getClass(), "nextLink", null);
        setField(term227845, term227845.getClass(), "restrictUndefinedVisitor", null);
        setField(term227845, term227845.getClass(), "restrictNullVisitor", null);
        term227846 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term227847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term227848 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        Object term227849 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term227850 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term227846, term227846.getClass(), "number", 0.0);
        setIntField(term227846, term227846.getClass(), "type", 111);
        setField(term227846, term227846.getClass(), "next", null);
        setIntField(term227847, term227847.getClass(), "type", -4194317);
        setField(term227847, term227847.getClass(), "next", null);
        setField(term227847, term227847.getClass(), "first", null);
        setField(term227847, term227847.getClass(), "last", null);
        setField(term227847, term227847.getClass(), "propListHead", null);
        setIntField(term227847, term227847.getClass(), "sourcePosition", 0);
        setField(term227848, term227848.getClass(), "constructor", null);
        setField(term227848, term227848.getClass(), "className", null);
        setField(term227848, term227848.getClass(), "properties", null);
        setBooleanField(term227848, term227848.getClass(), "nativeType", false);
        setField(term227848, term227848.getClass(), "implicitPrototypeFallback", null);
        setField(term227848, term227848.getClass(), "ownerFunction", null);
        setBooleanField(term227848, term227848.getClass(), "prettyPrint", false);
        setBooleanField(term227848, term227848.getClass(), "visited", false);
        setField(term227848, term227848.getClass(), "docInfo", null);
        setBooleanField(term227848, term227848.getClass(), "unknown", false);
        setBooleanField(term227848, term227848.getClass(), "resolved", false);
        setField(term227848, term227848.getClass(), "resolveResult", null);
        setBooleanField(term227848, term227848.getClass(), "inTemplatedCheckVisit", false);
        setField(term227848, term227848.getClass(), "registry", null);
        setField(term227847, term227847.getClass(), "jsType", term227848);
        setField(term227847, term227847.getClass(), "parent", null);
        setField(term227846, term227846.getClass(), "first", term227847);
        setField(term227846, term227846.getClass(), "last", null);
        setField(term227846, term227846.getClass(), "propListHead", null);
        setIntField(term227846, term227846.getClass(), "sourcePosition", 0);
        setField(term227846, term227846.getClass(), "jsType", null);
        setDoubleField(term227849, term227849.getClass(), "number", 0.0);
        setIntField(term227849, term227849.getClass(), "type", 0);
        setField(term227849, term227849.getClass(), "next", null);
        setField(term227850, term227850.getClass(), "str", null);
        setIntField(term227850, term227850.getClass(), "type", 4);
        setField(term227850, term227850.getClass(), "next", null);
        setField(term227850, term227850.getClass(), "first", null);
        setField(term227850, term227850.getClass(), "last", null);
        setField(term227850, term227850.getClass(), "propListHead", null);
        setIntField(term227850, term227850.getClass(), "sourcePosition", 0);
        setField(term227850, term227850.getClass(), "jsType", term227848);
        setField(term227850, term227850.getClass(), "parent", null);
        setField(term227849, term227849.getClass(), "first", term227850);
        setField(term227849, term227849.getClass(), "last", null);
        setField(term227849, term227849.getClass(), "propListHead", null);
        setIntField(term227849, term227849.getClass(), "sourcePosition", 0);
        setField(term227849, term227849.getClass(), "jsType", null);
        setField(term227849, term227849.getClass(), "parent", null);
        setField(term227846, term227846.getClass(), "parent", term227849);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term227239;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term227147, args);
        assertTrue(recursiveEquals(term227147, term227845));
        assertTrue(recursiveEquals(term227239, term227846));
        assertTrue(recursiveEquals(retValue, null));
    }

};


