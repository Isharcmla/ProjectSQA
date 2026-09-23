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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182134;
     Object term182204;
     Object term182664;
     Object term182665;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182134 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term182204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term182274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term182344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term182438 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term182508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term182204, term182204.getClass(), "type", 111);
        setIntField(term182344, term182344.getClass(), "type", 111);
        setField(term182344, term182344.getClass(), "jsType", term182438);
        setField(term182274, term182274.getClass(), "first", term182344);
        setField(term182204, term182204.getClass(), "parent", term182274);
        setIntField(term182508, term182508.getClass(), "type", 111);
        setField(term182508, term182508.getClass(), "jsType", null);
        setField(term182204, term182204.getClass(), "first", term182508);
        term182664 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term182664, term182664.getClass(), "INEQ", null);
        setField(term182664, term182664.getClass(), "convention", null);
        setField(term182664, term182664.getClass(), "typeRegistry", null);
        setField(term182664, term182664.getClass(), "firstLink", null);
        setField(term182664, term182664.getClass(), "nextLink", null);
        setField(term182664, term182664.getClass(), "restrictUndefinedVisitor", null);
        setField(term182664, term182664.getClass(), "restrictNullVisitor", null);
        term182665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term182666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term182667 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term182668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term182669 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setIntField(term182665, term182665.getClass(), "type", 111);
        setField(term182665, term182665.getClass(), "next", null);
        setIntField(term182666, term182666.getClass(), "type", 111);
        setField(term182666, term182666.getClass(), "next", null);
        setField(term182666, term182666.getClass(), "first", null);
        setField(term182666, term182666.getClass(), "last", null);
        setField(term182666, term182666.getClass(), "propListHead", null);
        setIntField(term182666, term182666.getClass(), "sourcePosition", 0);
        setField(term182666, term182666.getClass(), "jsType", null);
        setField(term182666, term182666.getClass(), "parent", null);
        setField(term182665, term182665.getClass(), "first", term182666);
        setField(term182665, term182665.getClass(), "last", null);
        setField(term182665, term182665.getClass(), "propListHead", null);
        setIntField(term182665, term182665.getClass(), "sourcePosition", 0);
        setField(term182665, term182665.getClass(), "jsType", null);
        setIntField(term182667, term182667.getClass(), "type", 0);
        setField(term182667, term182667.getClass(), "next", null);
        setIntField(term182668, term182668.getClass(), "type", 111);
        setField(term182668, term182668.getClass(), "next", null);
        setField(term182668, term182668.getClass(), "first", null);
        setField(term182668, term182668.getClass(), "last", null);
        setField(term182668, term182668.getClass(), "propListHead", null);
        setIntField(term182668, term182668.getClass(), "sourcePosition", 0);
        setField(term182669, term182669.getClass(), "reference", null);
        setField(term182669, term182669.getClass(), "sourceName", null);
        setIntField(term182669, term182669.getClass(), "lineno", 0);
        setIntField(term182669, term182669.getClass(), "charno", 0);
        setField(term182669, term182669.getClass(), "validator", null);
        setField(term182669, term182669.getClass(), "propertyContinuations", null);
        setField(term182669, term182669.getClass(), "referencedType", null);
        setField(term182669, term182669.getClass(), "referencedObjType", null);
        setBooleanField(term182669, term182669.getClass(), "visited", false);
        setField(term182669, term182669.getClass(), "docInfo", null);
        setBooleanField(term182669, term182669.getClass(), "unknown", false);
        setBooleanField(term182669, term182669.getClass(), "resolved", false);
        setField(term182669, term182669.getClass(), "resolveResult", null);
        setBooleanField(term182669, term182669.getClass(), "inTemplatedCheckVisit", false);
        setField(term182669, term182669.getClass(), "registry", null);
        setField(term182668, term182668.getClass(), "jsType", term182669);
        setField(term182668, term182668.getClass(), "parent", null);
        setField(term182667, term182667.getClass(), "first", term182668);
        setField(term182667, term182667.getClass(), "last", null);
        setField(term182667, term182667.getClass(), "propListHead", null);
        setIntField(term182667, term182667.getClass(), "sourcePosition", 0);
        setField(term182667, term182667.getClass(), "jsType", null);
        setField(term182667, term182667.getClass(), "parent", null);
        setField(term182665, term182665.getClass(), "parent", term182667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term182204;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term182134, args);
        assertTrue(recursiveEquals(term182134, term182664));
        assertTrue(recursiveEquals(term182204, term182665));
        assertTrue(recursiveEquals(retValue, null));
    }

};


