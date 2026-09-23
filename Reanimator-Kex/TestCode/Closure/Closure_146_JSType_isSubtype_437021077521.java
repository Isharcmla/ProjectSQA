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

public class JSType_isSubtype_437021077521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143852;
     Object term143958;
     Object term144091;
     Object term144093;

    public JSType_isSubtype_437021077521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143852 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        term143958 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term144046 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setBooleanField(term144046, term144046.getClass(), "unknown", false);
        setField(term143958, term143958.getClass(), "referencedType", term144046);
        term144091 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term144092 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term144092, term144092.getClass(), "leastSupertypeVisitor", null);
        setField(term144092, term144092.getClass(), "greatestSubtypeVisitor", null);
        setField(term144092, term144092.getClass(), "call", null);
        setField(term144092, term144092.getClass(), "prototype", null);
        setField(term144092, term144092.getClass(), "kind", null);
        setField(term144092, term144092.getClass(), "typeOfThis", null);
        setField(term144092, term144092.getClass(), "source", null);
        setField(term144092, term144092.getClass(), "implementedInterfaces", null);
        setField(term144092, term144092.getClass(), "subTypes", null);
        setField(term144092, term144092.getClass(), "templateTypeName", null);
        setField(term144092, term144092.getClass(), "className", null);
        setField(term144092, term144092.getClass(), "properties", null);
        setField(term144092, term144092.getClass(), "implicitPrototype", null);
        setBooleanField(term144092, term144092.getClass(), "nativeType", false);
        setBooleanField(term144092, term144092.getClass(), "prettyPrint", false);
        setBooleanField(term144092, term144092.getClass(), "visited", false);
        setField(term144092, term144092.getClass(), "docInfo", null);
        setBooleanField(term144092, term144092.getClass(), "unknown", false);
        setBooleanField(term144092, term144092.getClass(), "resolved", false);
        setField(term144092, term144092.getClass(), "resolveResult", null);
        setField(term144092, term144092.getClass(), "registry", null);
        setField(term144091, term144091.getClass(), "referencedType", term144092);
        setBooleanField(term144091, term144091.getClass(), "visited", false);
        setField(term144091, term144091.getClass(), "docInfo", null);
        setBooleanField(term144091, term144091.getClass(), "unknown", false);
        setBooleanField(term144091, term144091.getClass(), "resolved", false);
        setField(term144091, term144091.getClass(), "resolveResult", null);
        setField(term144091, term144091.getClass(), "registry", null);
        term144093 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term144093, term144093.getClass(), "typeExpr", null);
        setField(term144093, term144093.getClass(), "sourceName", null);
        setBooleanField(term144093, term144093.getClass(), "forgiving", false);
        setBooleanField(term144093, term144093.getClass(), "isChecked", false);
        setBooleanField(term144093, term144093.getClass(), "visited", false);
        setField(term144093, term144093.getClass(), "docInfo", null);
        setBooleanField(term144093, term144093.getClass(), "unknown", false);
        setBooleanField(term144093, term144093.getClass(), "resolved", false);
        setField(term144093, term144093.getClass(), "resolveResult", null);
        setField(term144093, term144093.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term143852;
        args[1] = term143958;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term143852, term144091));
        assertTrue(recursiveEquals(term143958, term144093));
        assertTrue(recursiveEquals(retValue, false));
    }

};


