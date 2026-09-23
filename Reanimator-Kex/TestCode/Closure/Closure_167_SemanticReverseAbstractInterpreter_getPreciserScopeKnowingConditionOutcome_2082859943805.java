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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943805 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244381;
     Object term244473;
     Object term244898;
     Object term244899;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943805() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term244381 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term244473 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term244565 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term244661 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term244753 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term244473, term244473.getClass(), "type", 45);
        setIntField(term244565, term244565.getClass(), "type", 0);
        setField(term244565, term244565.getClass(), "jsType", term244661);
        setField(term244473, term244473.getClass(), "first", term244565);
        setIntField(term244753, term244753.getClass(), "type", 45);
        setField(term244753, term244753.getClass(), "jsType", null);
        setField(term244473, term244473.getClass(), "last", term244753);
        term244898 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term244898, term244898.getClass(), "INEQ", null);
        setField(term244898, term244898.getClass(), "convention", null);
        setField(term244898, term244898.getClass(), "typeRegistry", null);
        setField(term244898, term244898.getClass(), "firstLink", null);
        setField(term244898, term244898.getClass(), "nextLink", null);
        setField(term244898, term244898.getClass(), "restrictUndefinedVisitor", null);
        setField(term244898, term244898.getClass(), "restrictNullVisitor", null);
        term244899 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term244900 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term244901 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term244902 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term244899, term244899.getClass(), "number", 0.0);
        setIntField(term244899, term244899.getClass(), "type", 45);
        setField(term244899, term244899.getClass(), "next", null);
        setField(term244900, term244900.getClass(), "str", null);
        setIntField(term244900, term244900.getClass(), "type", 0);
        setField(term244900, term244900.getClass(), "next", null);
        setField(term244900, term244900.getClass(), "first", null);
        setField(term244900, term244900.getClass(), "last", null);
        setField(term244900, term244900.getClass(), "propListHead", null);
        setIntField(term244900, term244900.getClass(), "sourcePosition", 0);
        setField(term244901, term244901.getClass(), "properties", null);
        setBooleanField(term244901, term244901.getClass(), "declared", false);
        setBooleanField(term244901, term244901.getClass(), "isFrozen", false);
        setField(term244901, term244901.getClass(), "className", null);
        setField(term244901, term244901.getClass(), "properties", null);
        setBooleanField(term244901, term244901.getClass(), "nativeType", false);
        setField(term244901, term244901.getClass(), "implicitPrototypeFallback", null);
        setField(term244901, term244901.getClass(), "ownerFunction", null);
        setBooleanField(term244901, term244901.getClass(), "prettyPrint", false);
        setBooleanField(term244901, term244901.getClass(), "visited", false);
        setField(term244901, term244901.getClass(), "docInfo", null);
        setBooleanField(term244901, term244901.getClass(), "unknown", false);
        setBooleanField(term244901, term244901.getClass(), "resolved", false);
        setField(term244901, term244901.getClass(), "resolveResult", null);
        setBooleanField(term244901, term244901.getClass(), "inTemplatedCheckVisit", false);
        setField(term244901, term244901.getClass(), "registry", null);
        setField(term244900, term244900.getClass(), "jsType", term244901);
        setField(term244900, term244900.getClass(), "parent", null);
        setField(term244899, term244899.getClass(), "first", term244900);
        setDoubleField(term244902, term244902.getClass(), "number", 0.0);
        setIntField(term244902, term244902.getClass(), "type", 45);
        setField(term244902, term244902.getClass(), "next", null);
        setField(term244902, term244902.getClass(), "first", null);
        setField(term244902, term244902.getClass(), "last", null);
        setField(term244902, term244902.getClass(), "propListHead", null);
        setIntField(term244902, term244902.getClass(), "sourcePosition", 0);
        setField(term244902, term244902.getClass(), "jsType", null);
        setField(term244902, term244902.getClass(), "parent", null);
        setField(term244899, term244899.getClass(), "last", term244902);
        setField(term244899, term244899.getClass(), "propListHead", null);
        setIntField(term244899, term244899.getClass(), "sourcePosition", 0);
        setField(term244899, term244899.getClass(), "jsType", null);
        setField(term244899, term244899.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term244473;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term244381, args);
        assertTrue(recursiveEquals(term244381, term244898));
        assertTrue(recursiveEquals(term244473, term244899));
        assertTrue(recursiveEquals(retValue, null));
    }

};


