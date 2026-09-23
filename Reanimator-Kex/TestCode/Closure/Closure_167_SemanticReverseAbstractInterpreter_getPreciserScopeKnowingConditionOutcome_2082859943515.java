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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140904;
     Object term140996;
     Object term141974;
     Object term141975;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140904 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term140996 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term141088 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term141186 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        Object term141278 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term141370 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setIntField(term140996, term140996.getClass(), "type", 12);
        setIntField(term141088, term141088.getClass(), "type", 0);
        setField(term141088, term141088.getClass(), "jsType", term141186);
        setField(term140996, term140996.getClass(), "first", term141088);
        setIntField(term141278, term141278.getClass(), "type", 0);
        setField(term141278, term141278.getClass(), "jsType", term141370);
        setField(term140996, term140996.getClass(), "last", term141278);
        term141974 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term141974, term141974.getClass(), "INEQ", null);
        setField(term141974, term141974.getClass(), "convention", null);
        setField(term141974, term141974.getClass(), "typeRegistry", null);
        setField(term141974, term141974.getClass(), "firstLink", null);
        setField(term141974, term141974.getClass(), "nextLink", null);
        setField(term141974, term141974.getClass(), "restrictUndefinedVisitor", null);
        setField(term141974, term141974.getClass(), "restrictNullVisitor", null);
        term141975 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term141976 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term141977 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        Object term141978 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term141979 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setDoubleField(term141975, term141975.getClass(), "number", 0.0);
        setIntField(term141975, term141975.getClass(), "type", 12);
        setField(term141975, term141975.getClass(), "next", null);
        setDoubleField(term141976, term141976.getClass(), "number", 0.0);
        setIntField(term141976, term141976.getClass(), "type", 0);
        setField(term141976, term141976.getClass(), "next", null);
        setField(term141976, term141976.getClass(), "first", null);
        setField(term141976, term141976.getClass(), "last", null);
        setField(term141976, term141976.getClass(), "propListHead", null);
        setIntField(term141976, term141976.getClass(), "sourcePosition", 0);
        setBooleanField(term141977, term141977.getClass(), "isChecked", false);
        setBooleanField(term141977, term141977.getClass(), "visited", false);
        setField(term141977, term141977.getClass(), "docInfo", null);
        setBooleanField(term141977, term141977.getClass(), "unknown", false);
        setBooleanField(term141977, term141977.getClass(), "resolved", false);
        setField(term141977, term141977.getClass(), "resolveResult", null);
        setBooleanField(term141977, term141977.getClass(), "inTemplatedCheckVisit", false);
        setField(term141977, term141977.getClass(), "registry", null);
        setField(term141976, term141976.getClass(), "jsType", term141977);
        setField(term141976, term141976.getClass(), "parent", null);
        setField(term141975, term141975.getClass(), "first", term141976);
        setField(term141978, term141978.getClass(), "str", null);
        setIntField(term141978, term141978.getClass(), "type", 0);
        setField(term141978, term141978.getClass(), "next", null);
        setField(term141978, term141978.getClass(), "first", null);
        setField(term141978, term141978.getClass(), "last", null);
        setField(term141978, term141978.getClass(), "propListHead", null);
        setIntField(term141978, term141978.getClass(), "sourcePosition", 0);
        setField(term141979, term141979.getClass(), "source", null);
        setField(term141979, term141979.getClass(), "elementsType", null);
        setField(term141979, term141979.getClass(), "elements", null);
        setField(term141979, term141979.getClass(), "className", null);
        setField(term141979, term141979.getClass(), "properties", null);
        setBooleanField(term141979, term141979.getClass(), "nativeType", false);
        setField(term141979, term141979.getClass(), "implicitPrototypeFallback", null);
        setField(term141979, term141979.getClass(), "ownerFunction", null);
        setBooleanField(term141979, term141979.getClass(), "prettyPrint", false);
        setBooleanField(term141979, term141979.getClass(), "visited", false);
        setField(term141979, term141979.getClass(), "docInfo", null);
        setBooleanField(term141979, term141979.getClass(), "unknown", false);
        setBooleanField(term141979, term141979.getClass(), "resolved", false);
        setField(term141979, term141979.getClass(), "resolveResult", null);
        setBooleanField(term141979, term141979.getClass(), "inTemplatedCheckVisit", false);
        setField(term141979, term141979.getClass(), "registry", null);
        setField(term141978, term141978.getClass(), "jsType", term141979);
        setField(term141978, term141978.getClass(), "parent", null);
        setField(term141975, term141975.getClass(), "last", term141978);
        setField(term141975, term141975.getClass(), "propListHead", null);
        setIntField(term141975, term141975.getClass(), "sourcePosition", 0);
        setField(term141975, term141975.getClass(), "jsType", null);
        setField(term141975, term141975.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term140996;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term140904, args);
        assertTrue(recursiveEquals(term140904, term141974));
        assertTrue(recursiveEquals(term140996, term141975));
        assertTrue(recursiveEquals(retValue, null));
    }

};


