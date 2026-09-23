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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259087;
     Object term259179;
     Object term259838;
     Object term259839;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term259087 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term259179 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term259271 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term259395 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term259487 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term259583 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setIntField(term259179, term259179.getClass(), "type", 45);
        setIntField(term259271, term259271.getClass(), "type", 34);
        setField(term259271, term259271.getClass(), "jsType", term259395);
        setField(term259179, term259179.getClass(), "first", term259271);
        setIntField(term259487, term259487.getClass(), "type", -8227);
        setField(term259487, term259487.getClass(), "jsType", term259583);
        setField(term259179, term259179.getClass(), "last", term259487);
        term259838 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term259838, term259838.getClass(), "INEQ", null);
        setField(term259838, term259838.getClass(), "convention", null);
        setField(term259838, term259838.getClass(), "typeRegistry", null);
        setField(term259838, term259838.getClass(), "firstLink", null);
        setField(term259838, term259838.getClass(), "nextLink", null);
        setField(term259838, term259838.getClass(), "restrictUndefinedVisitor", null);
        setField(term259838, term259838.getClass(), "restrictNullVisitor", null);
        term259839 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term259840 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term259841 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term259842 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term259843 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setDoubleField(term259839, term259839.getClass(), "number", 0.0);
        setIntField(term259839, term259839.getClass(), "type", 45);
        setField(term259839, term259839.getClass(), "next", null);
        setField(term259840, term259840.getClass(), "str", null);
        setIntField(term259840, term259840.getClass(), "type", 34);
        setField(term259840, term259840.getClass(), "next", null);
        setField(term259840, term259840.getClass(), "first", null);
        setField(term259840, term259840.getClass(), "last", null);
        setField(term259840, term259840.getClass(), "propListHead", null);
        setIntField(term259840, term259840.getClass(), "sourcePosition", 0);
        setField(term259841, term259841.getClass(), "typeExpr", null);
        setField(term259841, term259841.getClass(), "sourceName", null);
        setBooleanField(term259841, term259841.getClass(), "isChecked", false);
        setBooleanField(term259841, term259841.getClass(), "visited", false);
        setField(term259841, term259841.getClass(), "docInfo", null);
        setBooleanField(term259841, term259841.getClass(), "unknown", false);
        setBooleanField(term259841, term259841.getClass(), "resolved", false);
        setField(term259841, term259841.getClass(), "resolveResult", null);
        setBooleanField(term259841, term259841.getClass(), "inTemplatedCheckVisit", false);
        setField(term259841, term259841.getClass(), "registry", null);
        setField(term259840, term259840.getClass(), "jsType", term259841);
        setField(term259840, term259840.getClass(), "parent", null);
        setField(term259839, term259839.getClass(), "first", term259840);
        setField(term259842, term259842.getClass(), "str", null);
        setIntField(term259842, term259842.getClass(), "type", -8227);
        setField(term259842, term259842.getClass(), "next", null);
        setField(term259842, term259842.getClass(), "first", null);
        setField(term259842, term259842.getClass(), "last", null);
        setField(term259842, term259842.getClass(), "propListHead", null);
        setIntField(term259842, term259842.getClass(), "sourcePosition", 0);
        setField(term259843, term259843.getClass(), "properties", null);
        setBooleanField(term259843, term259843.getClass(), "declared", false);
        setBooleanField(term259843, term259843.getClass(), "isFrozen", false);
        setField(term259843, term259843.getClass(), "className", null);
        setField(term259843, term259843.getClass(), "properties", null);
        setBooleanField(term259843, term259843.getClass(), "nativeType", false);
        setField(term259843, term259843.getClass(), "implicitPrototypeFallback", null);
        setField(term259843, term259843.getClass(), "ownerFunction", null);
        setBooleanField(term259843, term259843.getClass(), "prettyPrint", false);
        setBooleanField(term259843, term259843.getClass(), "visited", false);
        setField(term259843, term259843.getClass(), "docInfo", null);
        setBooleanField(term259843, term259843.getClass(), "unknown", false);
        setBooleanField(term259843, term259843.getClass(), "resolved", false);
        setField(term259843, term259843.getClass(), "resolveResult", null);
        setBooleanField(term259843, term259843.getClass(), "inTemplatedCheckVisit", false);
        setField(term259843, term259843.getClass(), "registry", null);
        setField(term259842, term259842.getClass(), "jsType", term259843);
        setField(term259842, term259842.getClass(), "parent", null);
        setField(term259839, term259839.getClass(), "last", term259842);
        setField(term259839, term259839.getClass(), "propListHead", null);
        setIntField(term259839, term259839.getClass(), "sourcePosition", 0);
        setField(term259839, term259839.getClass(), "jsType", null);
        setField(term259839, term259839.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term259179;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term259087, args);
        assertTrue(recursiveEquals(term259087, term259838));
        assertTrue(recursiveEquals(term259179, term259839));
        assertTrue(recursiveEquals(retValue, null));
    }

};


