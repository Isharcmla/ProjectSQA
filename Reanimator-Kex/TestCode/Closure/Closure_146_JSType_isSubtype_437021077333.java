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

public class JSType_isSubtype_437021077333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68381;
     Object term68487;
     Object term68925;
     Object term68927;

    public JSType_isSubtype_437021077333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68381 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term68487 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term68583 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setBooleanField(term68583, term68583.getClass(), "unknown", false);
        setField(term68487, term68487.getClass(), "referencedType", term68583);
        term68925 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term68926 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term68926, term68926.getClass(), "properties", null);
        setBooleanField(term68926, term68926.getClass(), "isFrozen", false);
        setField(term68926, term68926.getClass(), "className", null);
        setField(term68926, term68926.getClass(), "implicitPrototype", null);
        setBooleanField(term68926, term68926.getClass(), "nativeType", false);
        setBooleanField(term68926, term68926.getClass(), "prettyPrint", false);
        setBooleanField(term68926, term68926.getClass(), "visited", false);
        setField(term68926, term68926.getClass(), "docInfo", null);
        setBooleanField(term68926, term68926.getClass(), "unknown", false);
        setBooleanField(term68926, term68926.getClass(), "resolved", false);
        setField(term68926, term68926.getClass(), "resolveResult", null);
        setField(term68926, term68926.getClass(), "registry", null);
        setField(term68925, term68925.getClass(), "referencedType", term68926);
        setBooleanField(term68925, term68925.getClass(), "visited", false);
        setField(term68925, term68925.getClass(), "docInfo", null);
        setBooleanField(term68925, term68925.getClass(), "unknown", false);
        setBooleanField(term68925, term68925.getClass(), "resolved", false);
        setField(term68925, term68925.getClass(), "resolveResult", null);
        setField(term68925, term68925.getClass(), "registry", null);
        term68927 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term68927, term68927.getClass(), "properties", null);
        setBooleanField(term68927, term68927.getClass(), "isFrozen", false);
        setField(term68927, term68927.getClass(), "className", null);
        setField(term68927, term68927.getClass(), "implicitPrototype", null);
        setBooleanField(term68927, term68927.getClass(), "nativeType", false);
        setBooleanField(term68927, term68927.getClass(), "prettyPrint", false);
        setBooleanField(term68927, term68927.getClass(), "visited", false);
        setField(term68927, term68927.getClass(), "docInfo", null);
        setBooleanField(term68927, term68927.getClass(), "unknown", false);
        setBooleanField(term68927, term68927.getClass(), "resolved", false);
        setField(term68927, term68927.getClass(), "resolveResult", null);
        setField(term68927, term68927.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term68381;
        args[1] = term68487;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term68381, term68925));
        assertTrue(recursiveEquals(term68487, term68927));
        assertTrue(recursiveEquals(retValue, false));
    }

};


