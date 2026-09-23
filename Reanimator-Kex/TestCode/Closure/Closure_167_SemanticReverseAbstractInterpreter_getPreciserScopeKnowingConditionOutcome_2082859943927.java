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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358860;
     Object term358952;
     Object term359522;
     Object term359523;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term358860 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term358952 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term359044 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term359154 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term359246 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term359342 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setIntField(term358952, term358952.getClass(), "type", 45);
        setIntField(term359044, term359044.getClass(), "type", 34);
        setField(term359044, term359044.getClass(), "jsType", term359154);
        setField(term358952, term358952.getClass(), "first", term359044);
        setIntField(term359246, term359246.getClass(), "type", -8227);
        setField(term359246, term359246.getClass(), "jsType", term359342);
        setField(term358952, term358952.getClass(), "last", term359246);
        term359522 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term359522, term359522.getClass(), "INEQ", null);
        setField(term359522, term359522.getClass(), "convention", null);
        setField(term359522, term359522.getClass(), "typeRegistry", null);
        setField(term359522, term359522.getClass(), "firstLink", null);
        setField(term359522, term359522.getClass(), "nextLink", null);
        setField(term359522, term359522.getClass(), "restrictUndefinedVisitor", null);
        setField(term359522, term359522.getClass(), "restrictNullVisitor", null);
        term359523 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term359524 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term359525 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term359526 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term359527 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setField(term359523, term359523.getClass(), "str", null);
        setIntField(term359523, term359523.getClass(), "type", 45);
        setField(term359523, term359523.getClass(), "next", null);
        setDoubleField(term359524, term359524.getClass(), "number", 0.0);
        setIntField(term359524, term359524.getClass(), "type", 34);
        setField(term359524, term359524.getClass(), "next", null);
        setField(term359524, term359524.getClass(), "first", null);
        setField(term359524, term359524.getClass(), "last", null);
        setField(term359524, term359524.getClass(), "propListHead", null);
        setIntField(term359524, term359524.getClass(), "sourcePosition", 0);
        setField(term359525, term359525.getClass(), "parameterType", null);
        setField(term359525, term359525.getClass(), "referencedType", null);
        setField(term359525, term359525.getClass(), "referencedObjType", null);
        setBooleanField(term359525, term359525.getClass(), "visited", false);
        setField(term359525, term359525.getClass(), "docInfo", null);
        setBooleanField(term359525, term359525.getClass(), "unknown", false);
        setBooleanField(term359525, term359525.getClass(), "resolved", false);
        setField(term359525, term359525.getClass(), "resolveResult", null);
        setBooleanField(term359525, term359525.getClass(), "inTemplatedCheckVisit", false);
        setField(term359525, term359525.getClass(), "registry", null);
        setField(term359524, term359524.getClass(), "jsType", term359525);
        setField(term359524, term359524.getClass(), "parent", null);
        setField(term359523, term359523.getClass(), "first", term359524);
        setDoubleField(term359526, term359526.getClass(), "number", 0.0);
        setIntField(term359526, term359526.getClass(), "type", -8227);
        setField(term359526, term359526.getClass(), "next", null);
        setField(term359526, term359526.getClass(), "first", null);
        setField(term359526, term359526.getClass(), "last", null);
        setField(term359526, term359526.getClass(), "propListHead", null);
        setIntField(term359526, term359526.getClass(), "sourcePosition", 0);
        setBooleanField(term359527, term359527.getClass(), "resolved", false);
        setField(term359527, term359527.getClass(), "resolveResult", null);
        setBooleanField(term359527, term359527.getClass(), "inTemplatedCheckVisit", false);
        setField(term359527, term359527.getClass(), "registry", null);
        setField(term359526, term359526.getClass(), "jsType", term359527);
        setField(term359526, term359526.getClass(), "parent", null);
        setField(term359523, term359523.getClass(), "last", term359526);
        setField(term359523, term359523.getClass(), "propListHead", null);
        setIntField(term359523, term359523.getClass(), "sourcePosition", 0);
        setField(term359523, term359523.getClass(), "jsType", null);
        setField(term359523, term359523.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term358952;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term358860, args);
        assertTrue(recursiveEquals(term358860, term359522));
        assertTrue(recursiveEquals(term358952, term359523));
        assertTrue(recursiveEquals(retValue, null));
    }

};


