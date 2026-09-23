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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150097;
     Object term150189;
     Object term150793;
     Object term150794;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150097 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term150189 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term150281 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term150377 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        Object term150469 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term150565 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setIntField(term150189, term150189.getClass(), "type", 46);
        setIntField(term150281, term150281.getClass(), "type", 34);
        setField(term150281, term150281.getClass(), "jsType", term150377);
        setField(term150189, term150189.getClass(), "first", term150281);
        setIntField(term150469, term150469.getClass(), "type", -8227);
        setField(term150469, term150469.getClass(), "jsType", term150565);
        setField(term150189, term150189.getClass(), "last", term150469);
        term150793 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term150793, term150793.getClass(), "INEQ", null);
        setField(term150793, term150793.getClass(), "convention", null);
        setField(term150793, term150793.getClass(), "typeRegistry", null);
        setField(term150793, term150793.getClass(), "firstLink", null);
        setField(term150793, term150793.getClass(), "nextLink", null);
        setField(term150793, term150793.getClass(), "restrictUndefinedVisitor", null);
        setField(term150793, term150793.getClass(), "restrictNullVisitor", null);
        term150794 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term150795 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term150796 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        Object term150797 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term150798 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term150794, term150794.getClass(), "str", null);
        setIntField(term150794, term150794.getClass(), "type", 46);
        setField(term150794, term150794.getClass(), "next", null);
        setDoubleField(term150795, term150795.getClass(), "number", 0.0);
        setIntField(term150795, term150795.getClass(), "type", 34);
        setField(term150795, term150795.getClass(), "next", null);
        setField(term150795, term150795.getClass(), "first", null);
        setField(term150795, term150795.getClass(), "last", null);
        setField(term150795, term150795.getClass(), "propListHead", null);
        setIntField(term150795, term150795.getClass(), "sourcePosition", 0);
        setBooleanField(term150796, term150796.getClass(), "resolved", false);
        setField(term150796, term150796.getClass(), "resolveResult", null);
        setBooleanField(term150796, term150796.getClass(), "inTemplatedCheckVisit", false);
        setField(term150796, term150796.getClass(), "registry", null);
        setField(term150795, term150795.getClass(), "jsType", term150796);
        setField(term150795, term150795.getClass(), "parent", null);
        setField(term150794, term150794.getClass(), "first", term150795);
        setDoubleField(term150797, term150797.getClass(), "number", 0.0);
        setIntField(term150797, term150797.getClass(), "type", -8227);
        setField(term150797, term150797.getClass(), "next", null);
        setField(term150797, term150797.getClass(), "first", null);
        setField(term150797, term150797.getClass(), "last", null);
        setField(term150797, term150797.getClass(), "propListHead", null);
        setIntField(term150797, term150797.getClass(), "sourcePosition", 0);
        setField(term150798, term150798.getClass(), "properties", null);
        setBooleanField(term150798, term150798.getClass(), "declared", false);
        setBooleanField(term150798, term150798.getClass(), "isFrozen", false);
        setField(term150798, term150798.getClass(), "className", null);
        setField(term150798, term150798.getClass(), "properties", null);
        setBooleanField(term150798, term150798.getClass(), "nativeType", false);
        setField(term150798, term150798.getClass(), "implicitPrototypeFallback", null);
        setField(term150798, term150798.getClass(), "ownerFunction", null);
        setBooleanField(term150798, term150798.getClass(), "prettyPrint", false);
        setBooleanField(term150798, term150798.getClass(), "visited", false);
        setField(term150798, term150798.getClass(), "docInfo", null);
        setBooleanField(term150798, term150798.getClass(), "unknown", false);
        setBooleanField(term150798, term150798.getClass(), "resolved", false);
        setField(term150798, term150798.getClass(), "resolveResult", null);
        setBooleanField(term150798, term150798.getClass(), "inTemplatedCheckVisit", false);
        setField(term150798, term150798.getClass(), "registry", null);
        setField(term150797, term150797.getClass(), "jsType", term150798);
        setField(term150797, term150797.getClass(), "parent", null);
        setField(term150794, term150794.getClass(), "last", term150797);
        setField(term150794, term150794.getClass(), "propListHead", null);
        setIntField(term150794, term150794.getClass(), "sourcePosition", 0);
        setField(term150794, term150794.getClass(), "jsType", null);
        setField(term150794, term150794.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term150189;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term150097, args);
        assertTrue(recursiveEquals(term150097, term150793));
        assertTrue(recursiveEquals(term150189, term150794));
        assertTrue(recursiveEquals(retValue, null));
    }

};


