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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155750;
     Object term155820;
     Object term156370;
     Object term156371;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155750 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term155820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term155890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term155996 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        Object term156066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term156164 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setIntField(term155820, term155820.getClass(), "type", 45);
        setIntField(term155890, term155890.getClass(), "type", 45);
        setField(term155890, term155890.getClass(), "jsType", term155996);
        setField(term155820, term155820.getClass(), "first", term155890);
        setIntField(term156066, term156066.getClass(), "type", 45);
        setField(term156066, term156066.getClass(), "jsType", term156164);
        setField(term155820, term155820.getClass(), "last", term156066);
        term156370 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term156370, term156370.getClass(), "INEQ", null);
        setField(term156370, term156370.getClass(), "convention", null);
        setField(term156370, term156370.getClass(), "typeRegistry", null);
        setField(term156370, term156370.getClass(), "firstLink", null);
        setField(term156370, term156370.getClass(), "nextLink", null);
        setField(term156370, term156370.getClass(), "restrictUndefinedVisitor", null);
        setField(term156370, term156370.getClass(), "restrictNullVisitor", null);
        term156371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term156372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term156373 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        Object term156374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term156375 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setIntField(term156371, term156371.getClass(), "type", 45);
        setField(term156371, term156371.getClass(), "next", null);
        setIntField(term156372, term156372.getClass(), "type", 45);
        setField(term156372, term156372.getClass(), "next", null);
        setField(term156372, term156372.getClass(), "first", null);
        setField(term156372, term156372.getClass(), "last", null);
        setField(term156372, term156372.getClass(), "propListHead", null);
        setIntField(term156372, term156372.getClass(), "sourcePosition", 0);
        setField(term156373, term156373.getClass(), "primitiveType", null);
        setField(term156373, term156373.getClass(), "primitiveObjectType", null);
        setField(term156373, term156373.getClass(), "name", null);
        setBooleanField(term156373, term156373.getClass(), "visited", false);
        setField(term156373, term156373.getClass(), "docInfo", null);
        setBooleanField(term156373, term156373.getClass(), "unknown", false);
        setBooleanField(term156373, term156373.getClass(), "resolved", false);
        setField(term156373, term156373.getClass(), "resolveResult", null);
        setBooleanField(term156373, term156373.getClass(), "inTemplatedCheckVisit", false);
        setField(term156373, term156373.getClass(), "registry", null);
        setField(term156372, term156372.getClass(), "jsType", term156373);
        setField(term156372, term156372.getClass(), "parent", null);
        setField(term156371, term156371.getClass(), "first", term156372);
        setIntField(term156374, term156374.getClass(), "type", 45);
        setField(term156374, term156374.getClass(), "next", null);
        setField(term156374, term156374.getClass(), "first", null);
        setField(term156374, term156374.getClass(), "last", null);
        setField(term156374, term156374.getClass(), "propListHead", null);
        setIntField(term156374, term156374.getClass(), "sourcePosition", 0);
        setBooleanField(term156375, term156375.getClass(), "isChecked", false);
        setBooleanField(term156375, term156375.getClass(), "visited", false);
        setField(term156375, term156375.getClass(), "docInfo", null);
        setBooleanField(term156375, term156375.getClass(), "unknown", false);
        setBooleanField(term156375, term156375.getClass(), "resolved", false);
        setField(term156375, term156375.getClass(), "resolveResult", null);
        setBooleanField(term156375, term156375.getClass(), "inTemplatedCheckVisit", false);
        setField(term156375, term156375.getClass(), "registry", null);
        setField(term156374, term156374.getClass(), "jsType", term156375);
        setField(term156374, term156374.getClass(), "parent", null);
        setField(term156371, term156371.getClass(), "last", term156374);
        setField(term156371, term156371.getClass(), "propListHead", null);
        setIntField(term156371, term156371.getClass(), "sourcePosition", 0);
        setField(term156371, term156371.getClass(), "jsType", null);
        setField(term156371, term156371.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term155820;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term155750, args);
        assertTrue(recursiveEquals(term155750, term156370));
        assertTrue(recursiveEquals(term155820, term156371));
        assertTrue(recursiveEquals(retValue, null));
    }

};


