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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363723;
     Object term363815;
     Object term364179;
     Object term364180;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term363723 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term363815 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term363907 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term364005 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term364075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term363815, term363815.getClass(), "type", 46);
        setIntField(term363907, term363907.getClass(), "type", -458799);
        setField(term363907, term363907.getClass(), "jsType", term364005);
        setField(term363815, term363815.getClass(), "first", term363907);
        setIntField(term364075, term364075.getClass(), "type", 46);
        setField(term364075, term364075.getClass(), "jsType", null);
        setField(term363815, term363815.getClass(), "last", term364075);
        term364179 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term364179, term364179.getClass(), "INEQ", null);
        setField(term364179, term364179.getClass(), "convention", null);
        setField(term364179, term364179.getClass(), "typeRegistry", null);
        setField(term364179, term364179.getClass(), "firstLink", null);
        setField(term364179, term364179.getClass(), "nextLink", null);
        setField(term364179, term364179.getClass(), "restrictUndefinedVisitor", null);
        setField(term364179, term364179.getClass(), "restrictNullVisitor", null);
        term364180 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term364181 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term364182 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term364183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term364180, term364180.getClass(), "number", 0.0);
        setIntField(term364180, term364180.getClass(), "type", 46);
        setField(term364180, term364180.getClass(), "next", null);
        setField(term364181, term364181.getClass(), "str", null);
        setIntField(term364181, term364181.getClass(), "type", -458799);
        setField(term364181, term364181.getClass(), "next", null);
        setField(term364181, term364181.getClass(), "first", null);
        setField(term364181, term364181.getClass(), "last", null);
        setField(term364181, term364181.getClass(), "propListHead", null);
        setIntField(term364181, term364181.getClass(), "sourcePosition", 0);
        setField(term364182, term364182.getClass(), "indexType", null);
        setField(term364182, term364182.getClass(), "referencedType", null);
        setField(term364182, term364182.getClass(), "referencedObjType", null);
        setBooleanField(term364182, term364182.getClass(), "visited", false);
        setField(term364182, term364182.getClass(), "docInfo", null);
        setBooleanField(term364182, term364182.getClass(), "unknown", false);
        setBooleanField(term364182, term364182.getClass(), "resolved", false);
        setField(term364182, term364182.getClass(), "resolveResult", null);
        setBooleanField(term364182, term364182.getClass(), "inTemplatedCheckVisit", false);
        setField(term364182, term364182.getClass(), "registry", null);
        setField(term364181, term364181.getClass(), "jsType", term364182);
        setField(term364181, term364181.getClass(), "parent", null);
        setField(term364180, term364180.getClass(), "first", term364181);
        setIntField(term364183, term364183.getClass(), "type", 46);
        setField(term364183, term364183.getClass(), "next", null);
        setField(term364183, term364183.getClass(), "first", null);
        setField(term364183, term364183.getClass(), "last", null);
        setField(term364183, term364183.getClass(), "propListHead", null);
        setIntField(term364183, term364183.getClass(), "sourcePosition", 0);
        setField(term364183, term364183.getClass(), "jsType", null);
        setField(term364183, term364183.getClass(), "parent", null);
        setField(term364180, term364180.getClass(), "last", term364183);
        setField(term364180, term364180.getClass(), "propListHead", null);
        setIntField(term364180, term364180.getClass(), "sourcePosition", 0);
        setField(term364180, term364180.getClass(), "jsType", null);
        setField(term364180, term364180.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term363815;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term363723, args);
        assertTrue(recursiveEquals(term363723, term364179));
        assertTrue(recursiveEquals(term363815, term364180));
        assertTrue(recursiveEquals(retValue, null));
    }

};


