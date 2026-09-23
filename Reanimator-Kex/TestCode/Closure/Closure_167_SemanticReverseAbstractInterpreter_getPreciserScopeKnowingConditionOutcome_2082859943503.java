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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136349;
     Object term136419;
     Object term137001;
     Object term137002;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136349 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term136419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136587 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term136657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136767 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setIntField(term136419, term136419.getClass(), "type", 111);
        setField(term136489, term136489.getClass(), "first", term136489);
        setIntField(term136489, term136489.getClass(), "type", 111);
        setField(term136489, term136489.getClass(), "jsType", term136587);
        setField(term136419, term136419.getClass(), "parent", term136489);
        setIntField(term136657, term136657.getClass(), "type", 111);
        setField(term136657, term136657.getClass(), "jsType", term136767);
        setField(term136419, term136419.getClass(), "first", term136657);
        term137001 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term137001, term137001.getClass(), "INEQ", null);
        setField(term137001, term137001.getClass(), "convention", null);
        setField(term137001, term137001.getClass(), "typeRegistry", null);
        setField(term137001, term137001.getClass(), "firstLink", null);
        setField(term137001, term137001.getClass(), "nextLink", null);
        setField(term137001, term137001.getClass(), "restrictUndefinedVisitor", null);
        setField(term137001, term137001.getClass(), "restrictNullVisitor", null);
        term137002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137004 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term137005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137006 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setIntField(term137002, term137002.getClass(), "type", 111);
        setField(term137002, term137002.getClass(), "next", null);
        setIntField(term137003, term137003.getClass(), "type", 111);
        setField(term137003, term137003.getClass(), "next", null);
        setField(term137003, term137003.getClass(), "first", null);
        setField(term137003, term137003.getClass(), "last", null);
        setField(term137003, term137003.getClass(), "propListHead", null);
        setIntField(term137003, term137003.getClass(), "sourcePosition", 0);
        setField(term137004, term137004.getClass(), "call", null);
        setField(term137004, term137004.getClass(), "prototypeSlot", null);
        setField(term137004, term137004.getClass(), "kind", null);
        setField(term137004, term137004.getClass(), "typeOfThis", null);
        setField(term137004, term137004.getClass(), "source", null);
        setField(term137004, term137004.getClass(), "implementedInterfaces", null);
        setField(term137004, term137004.getClass(), "extendedInterfaces", null);
        setField(term137004, term137004.getClass(), "subTypes", null);
        setField(term137004, term137004.getClass(), "templateTypeNames", null);
        setField(term137004, term137004.getClass(), "className", null);
        setField(term137004, term137004.getClass(), "properties", null);
        setBooleanField(term137004, term137004.getClass(), "nativeType", false);
        setField(term137004, term137004.getClass(), "implicitPrototypeFallback", null);
        setField(term137004, term137004.getClass(), "ownerFunction", null);
        setBooleanField(term137004, term137004.getClass(), "prettyPrint", false);
        setBooleanField(term137004, term137004.getClass(), "visited", false);
        setField(term137004, term137004.getClass(), "docInfo", null);
        setBooleanField(term137004, term137004.getClass(), "unknown", false);
        setBooleanField(term137004, term137004.getClass(), "resolved", false);
        setField(term137004, term137004.getClass(), "resolveResult", null);
        setBooleanField(term137004, term137004.getClass(), "inTemplatedCheckVisit", false);
        setField(term137004, term137004.getClass(), "registry", null);
        setField(term137003, term137003.getClass(), "jsType", term137004);
        setField(term137003, term137003.getClass(), "parent", null);
        setField(term137002, term137002.getClass(), "first", term137003);
        setField(term137002, term137002.getClass(), "last", null);
        setField(term137002, term137002.getClass(), "propListHead", null);
        setIntField(term137002, term137002.getClass(), "sourcePosition", 0);
        setField(term137002, term137002.getClass(), "jsType", null);
        setIntField(term137005, term137005.getClass(), "type", 111);
        setField(term137005, term137005.getClass(), "next", null);
        setField(term137005, term137005.getClass(), "first", term137005);
        setField(term137005, term137005.getClass(), "last", null);
        setField(term137005, term137005.getClass(), "propListHead", null);
        setIntField(term137005, term137005.getClass(), "sourcePosition", 0);
        setField(term137006, term137006.getClass(), "indexType", null);
        setField(term137006, term137006.getClass(), "referencedType", null);
        setField(term137006, term137006.getClass(), "referencedObjType", null);
        setBooleanField(term137006, term137006.getClass(), "visited", false);
        setField(term137006, term137006.getClass(), "docInfo", null);
        setBooleanField(term137006, term137006.getClass(), "unknown", false);
        setBooleanField(term137006, term137006.getClass(), "resolved", false);
        setField(term137006, term137006.getClass(), "resolveResult", null);
        setBooleanField(term137006, term137006.getClass(), "inTemplatedCheckVisit", false);
        setField(term137006, term137006.getClass(), "registry", null);
        setField(term137005, term137005.getClass(), "jsType", term137006);
        setField(term137005, term137005.getClass(), "parent", null);
        setField(term137002, term137002.getClass(), "parent", term137005);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term136419;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term136349, args);
        assertTrue(recursiveEquals(term136349, term137001));
        assertTrue(recursiveEquals(term136419, term137002));
        assertTrue(recursiveEquals(retValue, null));
    }

};


