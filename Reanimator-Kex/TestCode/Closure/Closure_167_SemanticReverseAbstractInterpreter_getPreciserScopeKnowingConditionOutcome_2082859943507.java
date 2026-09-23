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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138072;
     Object term138164;
     Object term138770;
     Object term138771;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138072 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term138164 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term138256 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term138362 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term138454 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term138546 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setIntField(term138164, term138164.getClass(), "type", 46);
        setIntField(term138256, term138256.getClass(), "type", 0);
        setField(term138256, term138256.getClass(), "jsType", term138362);
        setField(term138164, term138164.getClass(), "first", term138256);
        setIntField(term138454, term138454.getClass(), "type", 0);
        setField(term138454, term138454.getClass(), "jsType", term138546);
        setField(term138164, term138164.getClass(), "last", term138454);
        term138770 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term138770, term138770.getClass(), "INEQ", null);
        setField(term138770, term138770.getClass(), "convention", null);
        setField(term138770, term138770.getClass(), "typeRegistry", null);
        setField(term138770, term138770.getClass(), "firstLink", null);
        setField(term138770, term138770.getClass(), "nextLink", null);
        setField(term138770, term138770.getClass(), "restrictUndefinedVisitor", null);
        setField(term138770, term138770.getClass(), "restrictNullVisitor", null);
        term138771 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term138772 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term138773 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term138774 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term138775 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setDoubleField(term138771, term138771.getClass(), "number", 0.0);
        setIntField(term138771, term138771.getClass(), "type", 46);
        setField(term138771, term138771.getClass(), "next", null);
        setDoubleField(term138772, term138772.getClass(), "number", 0.0);
        setIntField(term138772, term138772.getClass(), "type", 0);
        setField(term138772, term138772.getClass(), "next", null);
        setField(term138772, term138772.getClass(), "first", null);
        setField(term138772, term138772.getClass(), "last", null);
        setField(term138772, term138772.getClass(), "propListHead", null);
        setIntField(term138772, term138772.getClass(), "sourcePosition", 0);
        setField(term138773, term138773.getClass(), "referencedType", null);
        setField(term138773, term138773.getClass(), "referencedObjType", null);
        setBooleanField(term138773, term138773.getClass(), "visited", false);
        setField(term138773, term138773.getClass(), "docInfo", null);
        setBooleanField(term138773, term138773.getClass(), "unknown", false);
        setBooleanField(term138773, term138773.getClass(), "resolved", false);
        setField(term138773, term138773.getClass(), "resolveResult", null);
        setBooleanField(term138773, term138773.getClass(), "inTemplatedCheckVisit", false);
        setField(term138773, term138773.getClass(), "registry", null);
        setField(term138772, term138772.getClass(), "jsType", term138773);
        setField(term138772, term138772.getClass(), "parent", null);
        setField(term138771, term138771.getClass(), "first", term138772);
        setField(term138774, term138774.getClass(), "str", null);
        setIntField(term138774, term138774.getClass(), "type", 0);
        setField(term138774, term138774.getClass(), "next", null);
        setField(term138774, term138774.getClass(), "first", null);
        setField(term138774, term138774.getClass(), "last", null);
        setField(term138774, term138774.getClass(), "propListHead", null);
        setIntField(term138774, term138774.getClass(), "sourcePosition", 0);
        setField(term138775, term138775.getClass(), "source", null);
        setField(term138775, term138775.getClass(), "elementsType", null);
        setField(term138775, term138775.getClass(), "elements", null);
        setField(term138775, term138775.getClass(), "className", null);
        setField(term138775, term138775.getClass(), "properties", null);
        setBooleanField(term138775, term138775.getClass(), "nativeType", false);
        setField(term138775, term138775.getClass(), "implicitPrototypeFallback", null);
        setField(term138775, term138775.getClass(), "ownerFunction", null);
        setBooleanField(term138775, term138775.getClass(), "prettyPrint", false);
        setBooleanField(term138775, term138775.getClass(), "visited", false);
        setField(term138775, term138775.getClass(), "docInfo", null);
        setBooleanField(term138775, term138775.getClass(), "unknown", false);
        setBooleanField(term138775, term138775.getClass(), "resolved", false);
        setField(term138775, term138775.getClass(), "resolveResult", null);
        setBooleanField(term138775, term138775.getClass(), "inTemplatedCheckVisit", false);
        setField(term138775, term138775.getClass(), "registry", null);
        setField(term138774, term138774.getClass(), "jsType", term138775);
        setField(term138774, term138774.getClass(), "parent", null);
        setField(term138771, term138771.getClass(), "last", term138774);
        setField(term138771, term138771.getClass(), "propListHead", null);
        setIntField(term138771, term138771.getClass(), "sourcePosition", 0);
        setField(term138771, term138771.getClass(), "jsType", null);
        setField(term138771, term138771.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term138164;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term138072, args);
        assertTrue(recursiveEquals(term138072, term138770));
        assertTrue(recursiveEquals(term138164, term138771));
        assertTrue(recursiveEquals(retValue, null));
    }

};


