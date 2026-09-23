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

public class JSType_getGreatestSubtype_1951394506209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33748;
     Object term33767;
     Object term33768;
     Object term33750;

    public JSType_getGreatestSubtype_1951394506209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33748 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        term33767 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term33767, term33767.getClass(), "typeExpr", null);
        setField(term33767, term33767.getClass(), "sourceName", null);
        setBooleanField(term33767, term33767.getClass(), "forgiving", false);
        setBooleanField(term33767, term33767.getClass(), "isChecked", false);
        setBooleanField(term33767, term33767.getClass(), "visited", false);
        setField(term33767, term33767.getClass(), "docInfo", null);
        setBooleanField(term33767, term33767.getClass(), "unknown", false);
        setBooleanField(term33767, term33767.getClass(), "resolved", false);
        setField(term33767, term33767.getClass(), "resolveResult", null);
        setField(term33767, term33767.getClass(), "registry", null);
        term33768 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term33768, term33768.getClass(), "typeExpr", null);
        setField(term33768, term33768.getClass(), "sourceName", null);
        setBooleanField(term33768, term33768.getClass(), "forgiving", false);
        setBooleanField(term33768, term33768.getClass(), "isChecked", false);
        setBooleanField(term33768, term33768.getClass(), "visited", false);
        setField(term33768, term33768.getClass(), "docInfo", null);
        setBooleanField(term33768, term33768.getClass(), "unknown", false);
        setBooleanField(term33768, term33768.getClass(), "resolved", false);
        setField(term33768, term33768.getClass(), "resolveResult", null);
        setField(term33768, term33768.getClass(), "registry", null);
        term33750 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term33750, term33750.getClass(), "typeExpr", null);
        setField(term33750, term33750.getClass(), "sourceName", null);
        setBooleanField(term33750, term33750.getClass(), "forgiving", false);
        setBooleanField(term33750, term33750.getClass(), "isChecked", false);
        setBooleanField(term33750, term33750.getClass(), "visited", false);
        setField(term33750, term33750.getClass(), "docInfo", null);
        setBooleanField(term33750, term33750.getClass(), "unknown", false);
        setBooleanField(term33750, term33750.getClass(), "resolved", false);
        setField(term33750, term33750.getClass(), "resolveResult", null);
        setField(term33750, term33750.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term33748;
        args[1] = term33748;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term33748, term33767));
        assertTrue(recursiveEquals(term33748, term33768));
        assertTrue(recursiveEquals(retValue, term33750));
    }

};


