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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124871;
     Object term124963;
     Object term125827;
     Object term125828;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124871 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term124963 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term125055 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term125147 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term125245 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term125315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term124963, term124963.getClass(), "type", 111);
        setIntField(term125147, term125147.getClass(), "type", 0);
        setField(term125147, term125147.getClass(), "jsType", term125245);
        setField(term125055, term125055.getClass(), "first", term125147);
        setField(term124963, term124963.getClass(), "parent", term125055);
        setIntField(term125315, term125315.getClass(), "type", 1431666654);
        setField(term125315, term125315.getClass(), "jsType", null);
        setField(term124963, term124963.getClass(), "first", term125315);
        term125827 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term125827, term125827.getClass(), "INEQ", null);
        setField(term125827, term125827.getClass(), "convention", null);
        setField(term125827, term125827.getClass(), "typeRegistry", null);
        setField(term125827, term125827.getClass(), "firstLink", null);
        setField(term125827, term125827.getClass(), "nextLink", null);
        setField(term125827, term125827.getClass(), "restrictUndefinedVisitor", null);
        setField(term125827, term125827.getClass(), "restrictNullVisitor", null);
        term125828 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term125829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125830 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term125831 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term125832 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term125828, term125828.getClass(), "str", null);
        setIntField(term125828, term125828.getClass(), "type", 111);
        setField(term125828, term125828.getClass(), "next", null);
        setIntField(term125829, term125829.getClass(), "type", 1431666654);
        setField(term125829, term125829.getClass(), "next", null);
        setField(term125829, term125829.getClass(), "first", null);
        setField(term125829, term125829.getClass(), "last", null);
        setField(term125829, term125829.getClass(), "propListHead", null);
        setIntField(term125829, term125829.getClass(), "sourcePosition", 0);
        setField(term125829, term125829.getClass(), "jsType", null);
        setField(term125829, term125829.getClass(), "parent", null);
        setField(term125828, term125828.getClass(), "first", term125829);
        setField(term125828, term125828.getClass(), "last", null);
        setField(term125828, term125828.getClass(), "propListHead", null);
        setIntField(term125828, term125828.getClass(), "sourcePosition", 0);
        setField(term125828, term125828.getClass(), "jsType", null);
        setField(term125830, term125830.getClass(), "str", null);
        setIntField(term125830, term125830.getClass(), "type", 0);
        setField(term125830, term125830.getClass(), "next", null);
        setDoubleField(term125831, term125831.getClass(), "number", 0.0);
        setIntField(term125831, term125831.getClass(), "type", 0);
        setField(term125831, term125831.getClass(), "next", null);
        setField(term125831, term125831.getClass(), "first", null);
        setField(term125831, term125831.getClass(), "last", null);
        setField(term125831, term125831.getClass(), "propListHead", null);
        setIntField(term125831, term125831.getClass(), "sourcePosition", 0);
        setField(term125832, term125832.getClass(), "indexType", null);
        setField(term125832, term125832.getClass(), "referencedType", null);
        setField(term125832, term125832.getClass(), "referencedObjType", null);
        setBooleanField(term125832, term125832.getClass(), "visited", false);
        setField(term125832, term125832.getClass(), "docInfo", null);
        setBooleanField(term125832, term125832.getClass(), "unknown", false);
        setBooleanField(term125832, term125832.getClass(), "resolved", false);
        setField(term125832, term125832.getClass(), "resolveResult", null);
        setBooleanField(term125832, term125832.getClass(), "inTemplatedCheckVisit", false);
        setField(term125832, term125832.getClass(), "registry", null);
        setField(term125831, term125831.getClass(), "jsType", term125832);
        setField(term125831, term125831.getClass(), "parent", null);
        setField(term125830, term125830.getClass(), "first", term125831);
        setField(term125830, term125830.getClass(), "last", null);
        setField(term125830, term125830.getClass(), "propListHead", null);
        setIntField(term125830, term125830.getClass(), "sourcePosition", 0);
        setField(term125830, term125830.getClass(), "jsType", null);
        setField(term125830, term125830.getClass(), "parent", null);
        setField(term125828, term125828.getClass(), "parent", term125830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term124963;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term124871, args);
        assertTrue(recursiveEquals(term124871, term125827));
        assertTrue(recursiveEquals(term124963, term125828));
        assertTrue(recursiveEquals(retValue, null));
    }

};


