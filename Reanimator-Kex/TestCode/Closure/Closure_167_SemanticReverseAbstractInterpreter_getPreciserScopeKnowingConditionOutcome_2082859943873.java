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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273762;
     Object term273854;
     Object term274230;
     Object term274231;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273762 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term273854 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term273946 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term274038 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        Object term274108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term273854, term273854.getClass(), "type", 46);
        setIntField(term273946, term273946.getClass(), "type", -458799);
        setField(term273946, term273946.getClass(), "jsType", term274038);
        setField(term273854, term273854.getClass(), "first", term273946);
        setIntField(term274108, term274108.getClass(), "type", 46);
        setField(term274108, term274108.getClass(), "jsType", null);
        setField(term273854, term273854.getClass(), "last", term274108);
        term274230 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term274230, term274230.getClass(), "INEQ", null);
        setField(term274230, term274230.getClass(), "convention", null);
        setField(term274230, term274230.getClass(), "typeRegistry", null);
        setField(term274230, term274230.getClass(), "firstLink", null);
        setField(term274230, term274230.getClass(), "nextLink", null);
        setField(term274230, term274230.getClass(), "restrictUndefinedVisitor", null);
        setField(term274230, term274230.getClass(), "restrictNullVisitor", null);
        term274231 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term274232 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term274233 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        Object term274234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term274231, term274231.getClass(), "number", 0.0);
        setIntField(term274231, term274231.getClass(), "type", 46);
        setField(term274231, term274231.getClass(), "next", null);
        setField(term274232, term274232.getClass(), "str", null);
        setIntField(term274232, term274232.getClass(), "type", -458799);
        setField(term274232, term274232.getClass(), "next", null);
        setField(term274232, term274232.getClass(), "first", null);
        setField(term274232, term274232.getClass(), "last", null);
        setField(term274232, term274232.getClass(), "propListHead", null);
        setIntField(term274232, term274232.getClass(), "sourcePosition", 0);
        setField(term274233, term274233.getClass(), "source", null);
        setField(term274233, term274233.getClass(), "elementsType", null);
        setField(term274233, term274233.getClass(), "elements", null);
        setField(term274233, term274233.getClass(), "className", null);
        setField(term274233, term274233.getClass(), "properties", null);
        setBooleanField(term274233, term274233.getClass(), "nativeType", false);
        setField(term274233, term274233.getClass(), "implicitPrototypeFallback", null);
        setField(term274233, term274233.getClass(), "ownerFunction", null);
        setBooleanField(term274233, term274233.getClass(), "prettyPrint", false);
        setBooleanField(term274233, term274233.getClass(), "visited", false);
        setField(term274233, term274233.getClass(), "docInfo", null);
        setBooleanField(term274233, term274233.getClass(), "unknown", false);
        setBooleanField(term274233, term274233.getClass(), "resolved", false);
        setField(term274233, term274233.getClass(), "resolveResult", null);
        setBooleanField(term274233, term274233.getClass(), "inTemplatedCheckVisit", false);
        setField(term274233, term274233.getClass(), "registry", null);
        setField(term274232, term274232.getClass(), "jsType", term274233);
        setField(term274232, term274232.getClass(), "parent", null);
        setField(term274231, term274231.getClass(), "first", term274232);
        setIntField(term274234, term274234.getClass(), "type", 46);
        setField(term274234, term274234.getClass(), "next", null);
        setField(term274234, term274234.getClass(), "first", null);
        setField(term274234, term274234.getClass(), "last", null);
        setField(term274234, term274234.getClass(), "propListHead", null);
        setIntField(term274234, term274234.getClass(), "sourcePosition", 0);
        setField(term274234, term274234.getClass(), "jsType", null);
        setField(term274234, term274234.getClass(), "parent", null);
        setField(term274231, term274231.getClass(), "last", term274234);
        setField(term274231, term274231.getClass(), "propListHead", null);
        setIntField(term274231, term274231.getClass(), "sourcePosition", 0);
        setField(term274231, term274231.getClass(), "jsType", null);
        setField(term274231, term274231.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term273854;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term273762, args);
        assertTrue(recursiveEquals(term273762, term274230));
        assertTrue(recursiveEquals(term273854, term274231));
        assertTrue(recursiveEquals(retValue, null));
    }

};


