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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term374761;
     Object term374853;
     Object term375813;
     Object term375814;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term374761 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term374853 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term374945 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term375045 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term375137 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term374853, term374853.getClass(), "type", 46);
        setIntField(term374945, term374945.getClass(), "type", 0);
        setField(term374945, term374945.getClass(), "jsType", term375045);
        setField(term374853, term374853.getClass(), "first", term374945);
        setIntField(term375137, term375137.getClass(), "type", 0);
        setField(term375137, term375137.getClass(), "jsType", term375045);
        setField(term374853, term374853.getClass(), "last", term375137);
        term375813 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term375813, term375813.getClass(), "INEQ", null);
        setField(term375813, term375813.getClass(), "convention", null);
        setField(term375813, term375813.getClass(), "typeRegistry", null);
        setField(term375813, term375813.getClass(), "firstLink", null);
        setField(term375813, term375813.getClass(), "nextLink", null);
        setField(term375813, term375813.getClass(), "restrictUndefinedVisitor", null);
        setField(term375813, term375813.getClass(), "restrictNullVisitor", null);
        term375814 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term375815 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term375816 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term375817 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term375814, term375814.getClass(), "str", null);
        setIntField(term375814, term375814.getClass(), "type", 46);
        setField(term375814, term375814.getClass(), "next", null);
        setField(term375815, term375815.getClass(), "str", null);
        setIntField(term375815, term375815.getClass(), "type", 0);
        setField(term375815, term375815.getClass(), "next", null);
        setField(term375815, term375815.getClass(), "first", null);
        setField(term375815, term375815.getClass(), "last", null);
        setField(term375815, term375815.getClass(), "propListHead", null);
        setIntField(term375815, term375815.getClass(), "sourcePosition", 0);
        setField(term375816, term375816.getClass(), "call", null);
        setField(term375816, term375816.getClass(), "prototypeSlot", null);
        setField(term375816, term375816.getClass(), "kind", null);
        setField(term375816, term375816.getClass(), "typeOfThis", null);
        setField(term375816, term375816.getClass(), "source", null);
        setField(term375816, term375816.getClass(), "implementedInterfaces", null);
        setField(term375816, term375816.getClass(), "extendedInterfaces", null);
        setField(term375816, term375816.getClass(), "subTypes", null);
        setField(term375816, term375816.getClass(), "templateTypeNames", null);
        setField(term375816, term375816.getClass(), "className", null);
        setField(term375816, term375816.getClass(), "properties", null);
        setBooleanField(term375816, term375816.getClass(), "nativeType", false);
        setField(term375816, term375816.getClass(), "implicitPrototypeFallback", null);
        setField(term375816, term375816.getClass(), "ownerFunction", null);
        setBooleanField(term375816, term375816.getClass(), "prettyPrint", false);
        setBooleanField(term375816, term375816.getClass(), "visited", false);
        setField(term375816, term375816.getClass(), "docInfo", null);
        setBooleanField(term375816, term375816.getClass(), "unknown", false);
        setBooleanField(term375816, term375816.getClass(), "resolved", false);
        setField(term375816, term375816.getClass(), "resolveResult", null);
        setBooleanField(term375816, term375816.getClass(), "inTemplatedCheckVisit", false);
        setField(term375816, term375816.getClass(), "registry", null);
        setField(term375815, term375815.getClass(), "jsType", term375816);
        setField(term375815, term375815.getClass(), "parent", null);
        setField(term375814, term375814.getClass(), "first", term375815);
        setDoubleField(term375817, term375817.getClass(), "number", 0.0);
        setIntField(term375817, term375817.getClass(), "type", 0);
        setField(term375817, term375817.getClass(), "next", null);
        setField(term375817, term375817.getClass(), "first", null);
        setField(term375817, term375817.getClass(), "last", null);
        setField(term375817, term375817.getClass(), "propListHead", null);
        setIntField(term375817, term375817.getClass(), "sourcePosition", 0);
        setField(term375817, term375817.getClass(), "jsType", term375816);
        setField(term375817, term375817.getClass(), "parent", null);
        setField(term375814, term375814.getClass(), "last", term375817);
        setField(term375814, term375814.getClass(), "propListHead", null);
        setIntField(term375814, term375814.getClass(), "sourcePosition", 0);
        setField(term375814, term375814.getClass(), "jsType", null);
        setField(term375814, term375814.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term374853;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term374761, args);
        assertTrue(recursiveEquals(term374761, term375813));
        assertTrue(recursiveEquals(term374853, term375814));
        assertTrue(recursiveEquals(retValue, null));
    }

};


