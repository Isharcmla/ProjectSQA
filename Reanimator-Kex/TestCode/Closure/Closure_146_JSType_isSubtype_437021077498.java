package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;

public class JSType_isSubtype_437021077498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134747;
     Object term134841;
     Object term135532;
     Object term135534;

    public JSType_isSubtype_437021077498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134747 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        term134841 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term134929 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setBooleanField(term134929, term134929.getClass(), "unknown", false);
        setField(term134841, term134841.getClass(), "referencedType", term134929);
        term135532 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term135533 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term135532, term135532.getClass(), "reference", null);
        setField(term135532, term135532.getClass(), "sourceName", null);
        setIntField(term135532, term135532.getClass(), "lineno", 0);
        setIntField(term135532, term135532.getClass(), "charno", 0);
        setBooleanField(term135532, term135532.getClass(), "forgiving", false);
        setField(term135533, term135533.getClass(), "leastSupertypeVisitor", null);
        setField(term135533, term135533.getClass(), "greatestSubtypeVisitor", null);
        setField(term135533, term135533.getClass(), "call", null);
        setField(term135533, term135533.getClass(), "prototype", null);
        setField(term135533, term135533.getClass(), "kind", null);
        setField(term135533, term135533.getClass(), "typeOfThis", null);
        setField(term135533, term135533.getClass(), "source", null);
        setField(term135533, term135533.getClass(), "implementedInterfaces", null);
        setField(term135533, term135533.getClass(), "subTypes", null);
        setField(term135533, term135533.getClass(), "templateTypeName", null);
        setField(term135533, term135533.getClass(), "className", null);
        setField(term135533, term135533.getClass(), "properties", null);
        setField(term135533, term135533.getClass(), "implicitPrototype", null);
        setBooleanField(term135533, term135533.getClass(), "nativeType", false);
        setBooleanField(term135533, term135533.getClass(), "prettyPrint", false);
        setBooleanField(term135533, term135533.getClass(), "visited", false);
        setField(term135533, term135533.getClass(), "docInfo", null);
        setBooleanField(term135533, term135533.getClass(), "unknown", false);
        setBooleanField(term135533, term135533.getClass(), "resolved", false);
        setField(term135533, term135533.getClass(), "resolveResult", null);
        setField(term135533, term135533.getClass(), "registry", null);
        setField(term135532, term135532.getClass(), "referencedType", term135533);
        setBooleanField(term135532, term135532.getClass(), "visited", false);
        setField(term135532, term135532.getClass(), "docInfo", null);
        setBooleanField(term135532, term135532.getClass(), "unknown", false);
        setBooleanField(term135532, term135532.getClass(), "resolved", false);
        setField(term135532, term135532.getClass(), "resolveResult", null);
        setField(term135532, term135532.getClass(), "registry", null);
        term135534 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term135534, term135534.getClass(), "typeExpr", null);
        setField(term135534, term135534.getClass(), "sourceName", null);
        setBooleanField(term135534, term135534.getClass(), "forgiving", false);
        setBooleanField(term135534, term135534.getClass(), "isChecked", false);
        setBooleanField(term135534, term135534.getClass(), "visited", false);
        setField(term135534, term135534.getClass(), "docInfo", null);
        setBooleanField(term135534, term135534.getClass(), "unknown", false);
        setBooleanField(term135534, term135534.getClass(), "resolved", false);
        setField(term135534, term135534.getClass(), "resolveResult", null);
        setField(term135534, term135534.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term134747;
        args[1] = term134841;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term134747, term135532));
        assertTrue(recursiveEquals(term134841, term135534));
        assertTrue(recursiveEquals(retValue, true));
    }

};


