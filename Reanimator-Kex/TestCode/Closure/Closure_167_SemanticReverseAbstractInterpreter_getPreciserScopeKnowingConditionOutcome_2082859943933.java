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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term362048;
     Object term362140;
     Object term362804;
     Object term362805;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term362048 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term362140 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term362232 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term362328 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term362420 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term362532 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setIntField(term362140, term362140.getClass(), "type", 46);
        setIntField(term362232, term362232.getClass(), "type", 0);
        setField(term362232, term362232.getClass(), "jsType", term362328);
        setField(term362140, term362140.getClass(), "first", term362232);
        setIntField(term362420, term362420.getClass(), "type", 46);
        setField(term362420, term362420.getClass(), "jsType", term362532);
        setField(term362140, term362140.getClass(), "last", term362420);
        term362804 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term362804, term362804.getClass(), "INEQ", null);
        setField(term362804, term362804.getClass(), "convention", null);
        setField(term362804, term362804.getClass(), "typeRegistry", null);
        setField(term362804, term362804.getClass(), "firstLink", null);
        setField(term362804, term362804.getClass(), "nextLink", null);
        setField(term362804, term362804.getClass(), "restrictUndefinedVisitor", null);
        setField(term362804, term362804.getClass(), "restrictNullVisitor", null);
        term362805 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term362806 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term362807 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term362808 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term362809 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setDoubleField(term362805, term362805.getClass(), "number", 0.0);
        setIntField(term362805, term362805.getClass(), "type", 46);
        setField(term362805, term362805.getClass(), "next", null);
        setField(term362806, term362806.getClass(), "str", null);
        setIntField(term362806, term362806.getClass(), "type", 0);
        setField(term362806, term362806.getClass(), "next", null);
        setField(term362806, term362806.getClass(), "first", null);
        setField(term362806, term362806.getClass(), "last", null);
        setField(term362806, term362806.getClass(), "propListHead", null);
        setIntField(term362806, term362806.getClass(), "sourcePosition", 0);
        setField(term362807, term362807.getClass(), "properties", null);
        setBooleanField(term362807, term362807.getClass(), "declared", false);
        setBooleanField(term362807, term362807.getClass(), "isFrozen", false);
        setField(term362807, term362807.getClass(), "className", null);
        setField(term362807, term362807.getClass(), "properties", null);
        setBooleanField(term362807, term362807.getClass(), "nativeType", false);
        setField(term362807, term362807.getClass(), "implicitPrototypeFallback", null);
        setField(term362807, term362807.getClass(), "ownerFunction", null);
        setBooleanField(term362807, term362807.getClass(), "prettyPrint", false);
        setBooleanField(term362807, term362807.getClass(), "visited", false);
        setField(term362807, term362807.getClass(), "docInfo", null);
        setBooleanField(term362807, term362807.getClass(), "unknown", false);
        setBooleanField(term362807, term362807.getClass(), "resolved", false);
        setField(term362807, term362807.getClass(), "resolveResult", null);
        setBooleanField(term362807, term362807.getClass(), "inTemplatedCheckVisit", false);
        setField(term362807, term362807.getClass(), "registry", null);
        setField(term362806, term362806.getClass(), "jsType", term362807);
        setField(term362806, term362806.getClass(), "parent", null);
        setField(term362805, term362805.getClass(), "first", term362806);
        setDoubleField(term362808, term362808.getClass(), "number", 0.0);
        setIntField(term362808, term362808.getClass(), "type", 46);
        setField(term362808, term362808.getClass(), "next", null);
        setField(term362808, term362808.getClass(), "first", null);
        setField(term362808, term362808.getClass(), "last", null);
        setField(term362808, term362808.getClass(), "propListHead", null);
        setIntField(term362808, term362808.getClass(), "sourcePosition", 0);
        setField(term362809, term362809.getClass(), "constructor", null);
        setField(term362809, term362809.getClass(), "className", null);
        setField(term362809, term362809.getClass(), "properties", null);
        setBooleanField(term362809, term362809.getClass(), "nativeType", false);
        setField(term362809, term362809.getClass(), "implicitPrototypeFallback", null);
        setField(term362809, term362809.getClass(), "ownerFunction", null);
        setBooleanField(term362809, term362809.getClass(), "prettyPrint", false);
        setBooleanField(term362809, term362809.getClass(), "visited", false);
        setField(term362809, term362809.getClass(), "docInfo", null);
        setBooleanField(term362809, term362809.getClass(), "unknown", false);
        setBooleanField(term362809, term362809.getClass(), "resolved", false);
        setField(term362809, term362809.getClass(), "resolveResult", null);
        setBooleanField(term362809, term362809.getClass(), "inTemplatedCheckVisit", false);
        setField(term362809, term362809.getClass(), "registry", null);
        setField(term362808, term362808.getClass(), "jsType", term362809);
        setField(term362808, term362808.getClass(), "parent", null);
        setField(term362805, term362805.getClass(), "last", term362808);
        setField(term362805, term362805.getClass(), "propListHead", null);
        setIntField(term362805, term362805.getClass(), "sourcePosition", 0);
        setField(term362805, term362805.getClass(), "jsType", null);
        setField(term362805, term362805.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term362140;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term362048, args);
        assertTrue(recursiveEquals(term362048, term362804));
        assertTrue(recursiveEquals(term362140, term362805));
        assertTrue(recursiveEquals(retValue, null));
    }

};


