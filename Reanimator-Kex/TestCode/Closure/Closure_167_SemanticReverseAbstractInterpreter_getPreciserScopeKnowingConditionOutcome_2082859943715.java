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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209281;
     Object term209373;
     Object term209899;
     Object term209900;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209281 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term209373 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term209465 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term209557 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term209667 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term209737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term209373, term209373.getClass(), "type", 111);
        setIntField(term209557, term209557.getClass(), "type", 0);
        setField(term209557, term209557.getClass(), "jsType", term209667);
        setField(term209465, term209465.getClass(), "first", term209557);
        setField(term209373, term209373.getClass(), "parent", term209465);
        setIntField(term209737, term209737.getClass(), "type", 1431666654);
        setField(term209737, term209737.getClass(), "jsType", null);
        setField(term209373, term209373.getClass(), "first", term209737);
        term209899 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term209899, term209899.getClass(), "INEQ", null);
        setField(term209899, term209899.getClass(), "convention", null);
        setField(term209899, term209899.getClass(), "typeRegistry", null);
        setField(term209899, term209899.getClass(), "firstLink", null);
        setField(term209899, term209899.getClass(), "nextLink", null);
        setField(term209899, term209899.getClass(), "restrictUndefinedVisitor", null);
        setField(term209899, term209899.getClass(), "restrictNullVisitor", null);
        term209900 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term209901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term209902 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term209903 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term209904 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setDoubleField(term209900, term209900.getClass(), "number", 0.0);
        setIntField(term209900, term209900.getClass(), "type", 111);
        setField(term209900, term209900.getClass(), "next", null);
        setIntField(term209901, term209901.getClass(), "type", 1431666654);
        setField(term209901, term209901.getClass(), "next", null);
        setField(term209901, term209901.getClass(), "first", null);
        setField(term209901, term209901.getClass(), "last", null);
        setField(term209901, term209901.getClass(), "propListHead", null);
        setIntField(term209901, term209901.getClass(), "sourcePosition", 0);
        setField(term209901, term209901.getClass(), "jsType", null);
        setField(term209901, term209901.getClass(), "parent", null);
        setField(term209900, term209900.getClass(), "first", term209901);
        setField(term209900, term209900.getClass(), "last", null);
        setField(term209900, term209900.getClass(), "propListHead", null);
        setIntField(term209900, term209900.getClass(), "sourcePosition", 0);
        setField(term209900, term209900.getClass(), "jsType", null);
        setDoubleField(term209902, term209902.getClass(), "number", 0.0);
        setIntField(term209902, term209902.getClass(), "type", 0);
        setField(term209902, term209902.getClass(), "next", null);
        setField(term209903, term209903.getClass(), "str", null);
        setIntField(term209903, term209903.getClass(), "type", 0);
        setField(term209903, term209903.getClass(), "next", null);
        setField(term209903, term209903.getClass(), "first", null);
        setField(term209903, term209903.getClass(), "last", null);
        setField(term209903, term209903.getClass(), "propListHead", null);
        setIntField(term209903, term209903.getClass(), "sourcePosition", 0);
        setField(term209904, term209904.getClass(), "call", null);
        setField(term209904, term209904.getClass(), "prototypeSlot", null);
        setField(term209904, term209904.getClass(), "kind", null);
        setField(term209904, term209904.getClass(), "typeOfThis", null);
        setField(term209904, term209904.getClass(), "source", null);
        setField(term209904, term209904.getClass(), "implementedInterfaces", null);
        setField(term209904, term209904.getClass(), "extendedInterfaces", null);
        setField(term209904, term209904.getClass(), "subTypes", null);
        setField(term209904, term209904.getClass(), "templateTypeNames", null);
        setField(term209904, term209904.getClass(), "className", null);
        setField(term209904, term209904.getClass(), "properties", null);
        setBooleanField(term209904, term209904.getClass(), "nativeType", false);
        setField(term209904, term209904.getClass(), "implicitPrototypeFallback", null);
        setField(term209904, term209904.getClass(), "ownerFunction", null);
        setBooleanField(term209904, term209904.getClass(), "prettyPrint", false);
        setBooleanField(term209904, term209904.getClass(), "visited", false);
        setField(term209904, term209904.getClass(), "docInfo", null);
        setBooleanField(term209904, term209904.getClass(), "unknown", false);
        setBooleanField(term209904, term209904.getClass(), "resolved", false);
        setField(term209904, term209904.getClass(), "resolveResult", null);
        setBooleanField(term209904, term209904.getClass(), "inTemplatedCheckVisit", false);
        setField(term209904, term209904.getClass(), "registry", null);
        setField(term209903, term209903.getClass(), "jsType", term209904);
        setField(term209903, term209903.getClass(), "parent", null);
        setField(term209902, term209902.getClass(), "first", term209903);
        setField(term209902, term209902.getClass(), "last", null);
        setField(term209902, term209902.getClass(), "propListHead", null);
        setIntField(term209902, term209902.getClass(), "sourcePosition", 0);
        setField(term209902, term209902.getClass(), "jsType", null);
        setField(term209902, term209902.getClass(), "parent", null);
        setField(term209900, term209900.getClass(), "parent", term209902);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term209373;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term209281, args);
        assertTrue(recursiveEquals(term209281, term209899));
        assertTrue(recursiveEquals(term209373, term209900));
        assertTrue(recursiveEquals(retValue, null));
    }

};


