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

public class JSType_isSubtype_437021077401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96416;
     Object term96522;
     Object term96655;
     Object term96657;

    public JSType_isSubtype_437021077401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96416 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        term96522 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term96610 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setBooleanField(term96610, term96610.getClass(), "unknown", false);
        setField(term96522, term96522.getClass(), "referencedType", term96610);
        term96655 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term96656 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term96656, term96656.getClass(), "leastSupertypeVisitor", null);
        setField(term96656, term96656.getClass(), "greatestSubtypeVisitor", null);
        setField(term96656, term96656.getClass(), "call", null);
        setField(term96656, term96656.getClass(), "prototype", null);
        setField(term96656, term96656.getClass(), "kind", null);
        setField(term96656, term96656.getClass(), "typeOfThis", null);
        setField(term96656, term96656.getClass(), "source", null);
        setField(term96656, term96656.getClass(), "implementedInterfaces", null);
        setField(term96656, term96656.getClass(), "subTypes", null);
        setField(term96656, term96656.getClass(), "templateTypeName", null);
        setField(term96656, term96656.getClass(), "className", null);
        setField(term96656, term96656.getClass(), "properties", null);
        setField(term96656, term96656.getClass(), "implicitPrototype", null);
        setBooleanField(term96656, term96656.getClass(), "nativeType", false);
        setBooleanField(term96656, term96656.getClass(), "prettyPrint", false);
        setBooleanField(term96656, term96656.getClass(), "visited", false);
        setField(term96656, term96656.getClass(), "docInfo", null);
        setBooleanField(term96656, term96656.getClass(), "unknown", false);
        setBooleanField(term96656, term96656.getClass(), "resolved", false);
        setField(term96656, term96656.getClass(), "resolveResult", null);
        setField(term96656, term96656.getClass(), "registry", null);
        setField(term96655, term96655.getClass(), "referencedType", term96656);
        setBooleanField(term96655, term96655.getClass(), "visited", false);
        setField(term96655, term96655.getClass(), "docInfo", null);
        setBooleanField(term96655, term96655.getClass(), "unknown", false);
        setBooleanField(term96655, term96655.getClass(), "resolved", false);
        setField(term96655, term96655.getClass(), "resolveResult", null);
        setField(term96655, term96655.getClass(), "registry", null);
        term96657 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term96657, term96657.getClass(), "typeExpr", null);
        setField(term96657, term96657.getClass(), "sourceName", null);
        setBooleanField(term96657, term96657.getClass(), "forgiving", false);
        setBooleanField(term96657, term96657.getClass(), "isChecked", false);
        setBooleanField(term96657, term96657.getClass(), "visited", false);
        setField(term96657, term96657.getClass(), "docInfo", null);
        setBooleanField(term96657, term96657.getClass(), "unknown", false);
        setBooleanField(term96657, term96657.getClass(), "resolved", false);
        setField(term96657, term96657.getClass(), "resolveResult", null);
        setField(term96657, term96657.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term96416;
        args[1] = term96522;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term96416, term96655));
        assertTrue(recursiveEquals(term96522, term96657));
        assertTrue(recursiveEquals(retValue, false));
    }

};


