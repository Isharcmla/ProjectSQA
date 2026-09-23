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

public class JSType_getGreatestSubtype_1951394506337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68710;
     Object term68896;
     Object term71745;
     Object term71746;
     Object term71740;

    public JSType_getGreatestSubtype_1951394506337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68710 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        term68896 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term68710, term68710.getClass(), "referencedType", term68896);
        term71745 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term71745, term71745.getClass(), "typeExpr", null);
        setField(term71745, term71745.getClass(), "sourceName", null);
        setBooleanField(term71745, term71745.getClass(), "forgiving", false);
        setBooleanField(term71745, term71745.getClass(), "isChecked", false);
        setBooleanField(term71745, term71745.getClass(), "visited", false);
        setField(term71745, term71745.getClass(), "docInfo", null);
        setBooleanField(term71745, term71745.getClass(), "unknown", false);
        setBooleanField(term71745, term71745.getClass(), "resolved", false);
        setField(term71745, term71745.getClass(), "resolveResult", null);
        setField(term71745, term71745.getClass(), "registry", null);
        term71746 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term71747 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term71746, term71746.getClass(), "parameterType", null);
        setField(term71747, term71747.getClass(), "typeExpr", null);
        setField(term71747, term71747.getClass(), "sourceName", null);
        setBooleanField(term71747, term71747.getClass(), "forgiving", false);
        setBooleanField(term71747, term71747.getClass(), "isChecked", false);
        setBooleanField(term71747, term71747.getClass(), "visited", false);
        setField(term71747, term71747.getClass(), "docInfo", null);
        setBooleanField(term71747, term71747.getClass(), "unknown", false);
        setBooleanField(term71747, term71747.getClass(), "resolved", false);
        setField(term71747, term71747.getClass(), "resolveResult", null);
        setField(term71747, term71747.getClass(), "registry", null);
        setField(term71746, term71746.getClass(), "referencedType", term71747);
        setField(term71746, term71746.getClass(), "referencedObjType", null);
        setBooleanField(term71746, term71746.getClass(), "visited", false);
        setField(term71746, term71746.getClass(), "docInfo", null);
        setBooleanField(term71746, term71746.getClass(), "unknown", false);
        setBooleanField(term71746, term71746.getClass(), "resolved", false);
        setField(term71746, term71746.getClass(), "resolveResult", null);
        setField(term71746, term71746.getClass(), "registry", null);
        term71740 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term71733 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term71740, term71740.getClass(), "parameterType", null);
        setField(term71733, term71733.getClass(), "typeExpr", null);
        setField(term71733, term71733.getClass(), "sourceName", null);
        setBooleanField(term71733, term71733.getClass(), "forgiving", false);
        setBooleanField(term71733, term71733.getClass(), "isChecked", false);
        setBooleanField(term71733, term71733.getClass(), "visited", false);
        setField(term71733, term71733.getClass(), "docInfo", null);
        setBooleanField(term71733, term71733.getClass(), "unknown", false);
        setBooleanField(term71733, term71733.getClass(), "resolved", false);
        setField(term71733, term71733.getClass(), "resolveResult", null);
        setField(term71733, term71733.getClass(), "registry", null);
        setField(term71740, term71740.getClass(), "referencedType", term71733);
        setField(term71740, term71740.getClass(), "referencedObjType", null);
        setBooleanField(term71740, term71740.getClass(), "visited", false);
        setField(term71740, term71740.getClass(), "docInfo", null);
        setBooleanField(term71740, term71740.getClass(), "unknown", false);
        setBooleanField(term71740, term71740.getClass(), "resolved", false);
        setField(term71740, term71740.getClass(), "resolveResult", null);
        setField(term71740, term71740.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term68710;
        args[1] = term68896;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term68710, term71745));
        assertTrue(recursiveEquals(term68896, term71746));
        assertTrue(recursiveEquals(retValue, term71740));
    }

};


