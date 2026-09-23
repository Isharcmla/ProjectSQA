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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265288;
     Object term265380;
     Object term265787;
     Object term265788;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265288 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term265380 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term265472 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term265564 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        Object term265656 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term265380, term265380.getClass(), "type", 45);
        setIntField(term265472, term265472.getClass(), "type", 1078385728);
        setField(term265472, term265472.getClass(), "jsType", term265564);
        setField(term265380, term265380.getClass(), "first", term265472);
        setIntField(term265656, term265656.getClass(), "type", -1078385729);
        setField(term265656, term265656.getClass(), "jsType", null);
        setField(term265380, term265380.getClass(), "last", term265656);
        term265787 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term265787, term265787.getClass(), "INEQ", null);
        setField(term265787, term265787.getClass(), "convention", null);
        setField(term265787, term265787.getClass(), "typeRegistry", null);
        setField(term265787, term265787.getClass(), "firstLink", null);
        setField(term265787, term265787.getClass(), "nextLink", null);
        setField(term265787, term265787.getClass(), "restrictUndefinedVisitor", null);
        setField(term265787, term265787.getClass(), "restrictNullVisitor", null);
        term265788 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term265789 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term265790 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        Object term265791 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term265788, term265788.getClass(), "str", null);
        setIntField(term265788, term265788.getClass(), "type", 45);
        setField(term265788, term265788.getClass(), "next", null);
        setDoubleField(term265789, term265789.getClass(), "number", 0.0);
        setIntField(term265789, term265789.getClass(), "type", 1078385728);
        setField(term265789, term265789.getClass(), "next", null);
        setField(term265789, term265789.getClass(), "first", null);
        setField(term265789, term265789.getClass(), "last", null);
        setField(term265789, term265789.getClass(), "propListHead", null);
        setIntField(term265789, term265789.getClass(), "sourcePosition", 0);
        setField(term265790, term265790.getClass(), "source", null);
        setField(term265790, term265790.getClass(), "elementsType", null);
        setField(term265790, term265790.getClass(), "elements", null);
        setField(term265790, term265790.getClass(), "className", null);
        setField(term265790, term265790.getClass(), "properties", null);
        setBooleanField(term265790, term265790.getClass(), "nativeType", false);
        setField(term265790, term265790.getClass(), "implicitPrototypeFallback", null);
        setField(term265790, term265790.getClass(), "ownerFunction", null);
        setBooleanField(term265790, term265790.getClass(), "prettyPrint", false);
        setBooleanField(term265790, term265790.getClass(), "visited", false);
        setField(term265790, term265790.getClass(), "docInfo", null);
        setBooleanField(term265790, term265790.getClass(), "unknown", false);
        setBooleanField(term265790, term265790.getClass(), "resolved", false);
        setField(term265790, term265790.getClass(), "resolveResult", null);
        setBooleanField(term265790, term265790.getClass(), "inTemplatedCheckVisit", false);
        setField(term265790, term265790.getClass(), "registry", null);
        setField(term265789, term265789.getClass(), "jsType", term265790);
        setField(term265789, term265789.getClass(), "parent", null);
        setField(term265788, term265788.getClass(), "first", term265789);
        setDoubleField(term265791, term265791.getClass(), "number", 0.0);
        setIntField(term265791, term265791.getClass(), "type", -1078385729);
        setField(term265791, term265791.getClass(), "next", null);
        setField(term265791, term265791.getClass(), "first", null);
        setField(term265791, term265791.getClass(), "last", null);
        setField(term265791, term265791.getClass(), "propListHead", null);
        setIntField(term265791, term265791.getClass(), "sourcePosition", 0);
        setField(term265791, term265791.getClass(), "jsType", null);
        setField(term265791, term265791.getClass(), "parent", null);
        setField(term265788, term265788.getClass(), "last", term265791);
        setField(term265788, term265788.getClass(), "propListHead", null);
        setIntField(term265788, term265788.getClass(), "sourcePosition", 0);
        setField(term265788, term265788.getClass(), "jsType", null);
        setField(term265788, term265788.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term265380;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term265288, args);
        assertTrue(recursiveEquals(term265288, term265787));
        assertTrue(recursiveEquals(term265380, term265788));
        assertTrue(recursiveEquals(retValue, null));
    }

};


