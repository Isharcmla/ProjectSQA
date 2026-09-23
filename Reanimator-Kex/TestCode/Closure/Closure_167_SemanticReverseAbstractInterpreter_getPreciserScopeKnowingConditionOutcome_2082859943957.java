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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term373383;
     Object term373475;
     Object term373866;
     Object term373867;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term373383 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term373475 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term373567 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term373665 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term373757 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term373475, term373475.getClass(), "type", 45);
        setIntField(term373567, term373567.getClass(), "type", 0);
        setField(term373567, term373567.getClass(), "jsType", term373665);
        setField(term373475, term373475.getClass(), "first", term373567);
        setIntField(term373757, term373757.getClass(), "type", 0);
        setField(term373757, term373757.getClass(), "jsType", null);
        setField(term373475, term373475.getClass(), "last", term373757);
        term373866 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term373866, term373866.getClass(), "INEQ", null);
        setField(term373866, term373866.getClass(), "convention", null);
        setField(term373866, term373866.getClass(), "typeRegistry", null);
        setField(term373866, term373866.getClass(), "firstLink", null);
        setField(term373866, term373866.getClass(), "nextLink", null);
        setField(term373866, term373866.getClass(), "restrictUndefinedVisitor", null);
        setField(term373866, term373866.getClass(), "restrictNullVisitor", null);
        term373867 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term373868 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term373869 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term373870 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term373867, term373867.getClass(), "number", 0.0);
        setIntField(term373867, term373867.getClass(), "type", 45);
        setField(term373867, term373867.getClass(), "next", null);
        setDoubleField(term373868, term373868.getClass(), "number", 0.0);
        setIntField(term373868, term373868.getClass(), "type", 0);
        setField(term373868, term373868.getClass(), "next", null);
        setField(term373868, term373868.getClass(), "first", null);
        setField(term373868, term373868.getClass(), "last", null);
        setField(term373868, term373868.getClass(), "propListHead", null);
        setIntField(term373868, term373868.getClass(), "sourcePosition", 0);
        setField(term373869, term373869.getClass(), "indexType", null);
        setField(term373869, term373869.getClass(), "referencedType", null);
        setField(term373869, term373869.getClass(), "referencedObjType", null);
        setBooleanField(term373869, term373869.getClass(), "visited", false);
        setField(term373869, term373869.getClass(), "docInfo", null);
        setBooleanField(term373869, term373869.getClass(), "unknown", false);
        setBooleanField(term373869, term373869.getClass(), "resolved", false);
        setField(term373869, term373869.getClass(), "resolveResult", null);
        setBooleanField(term373869, term373869.getClass(), "inTemplatedCheckVisit", false);
        setField(term373869, term373869.getClass(), "registry", null);
        setField(term373868, term373868.getClass(), "jsType", term373869);
        setField(term373868, term373868.getClass(), "parent", null);
        setField(term373867, term373867.getClass(), "first", term373868);
        setField(term373870, term373870.getClass(), "str", null);
        setIntField(term373870, term373870.getClass(), "type", 0);
        setField(term373870, term373870.getClass(), "next", null);
        setField(term373870, term373870.getClass(), "first", null);
        setField(term373870, term373870.getClass(), "last", null);
        setField(term373870, term373870.getClass(), "propListHead", null);
        setIntField(term373870, term373870.getClass(), "sourcePosition", 0);
        setField(term373870, term373870.getClass(), "jsType", null);
        setField(term373870, term373870.getClass(), "parent", null);
        setField(term373867, term373867.getClass(), "last", term373870);
        setField(term373867, term373867.getClass(), "propListHead", null);
        setIntField(term373867, term373867.getClass(), "sourcePosition", 0);
        setField(term373867, term373867.getClass(), "jsType", null);
        setField(term373867, term373867.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term373475;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term373383, args);
        assertTrue(recursiveEquals(term373383, term373866));
        assertTrue(recursiveEquals(term373475, term373867));
        assertTrue(recursiveEquals(retValue, null));
    }

};


