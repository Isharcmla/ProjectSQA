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

public class JSType_isSubtype_437021077471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125232;
     Object term125307;
     Object term125309;

    public JSType_isSubtype_437021077471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125232 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term125280 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setBooleanField(term125280, term125280.getClass(), "unknown", false);
        setField(term125232, term125232.getClass(), "referencedType", term125280);
        term125307 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term125308 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term125308, term125308.getClass(), "properties", null);
        setBooleanField(term125308, term125308.getClass(), "isFrozen", false);
        setField(term125308, term125308.getClass(), "className", null);
        setField(term125308, term125308.getClass(), "implicitPrototype", null);
        setBooleanField(term125308, term125308.getClass(), "nativeType", false);
        setBooleanField(term125308, term125308.getClass(), "prettyPrint", false);
        setBooleanField(term125308, term125308.getClass(), "visited", false);
        setField(term125308, term125308.getClass(), "docInfo", null);
        setBooleanField(term125308, term125308.getClass(), "unknown", false);
        setBooleanField(term125308, term125308.getClass(), "resolved", false);
        setField(term125308, term125308.getClass(), "resolveResult", null);
        setField(term125308, term125308.getClass(), "registry", null);
        setField(term125307, term125307.getClass(), "referencedType", term125308);
        setBooleanField(term125307, term125307.getClass(), "visited", false);
        setField(term125307, term125307.getClass(), "docInfo", null);
        setBooleanField(term125307, term125307.getClass(), "unknown", false);
        setBooleanField(term125307, term125307.getClass(), "resolved", false);
        setField(term125307, term125307.getClass(), "resolveResult", null);
        setField(term125307, term125307.getClass(), "registry", null);
        term125309 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term125310 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term125310, term125310.getClass(), "properties", null);
        setBooleanField(term125310, term125310.getClass(), "isFrozen", false);
        setField(term125310, term125310.getClass(), "className", null);
        setField(term125310, term125310.getClass(), "implicitPrototype", null);
        setBooleanField(term125310, term125310.getClass(), "nativeType", false);
        setBooleanField(term125310, term125310.getClass(), "prettyPrint", false);
        setBooleanField(term125310, term125310.getClass(), "visited", false);
        setField(term125310, term125310.getClass(), "docInfo", null);
        setBooleanField(term125310, term125310.getClass(), "unknown", false);
        setBooleanField(term125310, term125310.getClass(), "resolved", false);
        setField(term125310, term125310.getClass(), "resolveResult", null);
        setField(term125310, term125310.getClass(), "registry", null);
        setField(term125309, term125309.getClass(), "referencedType", term125310);
        setBooleanField(term125309, term125309.getClass(), "visited", false);
        setField(term125309, term125309.getClass(), "docInfo", null);
        setBooleanField(term125309, term125309.getClass(), "unknown", false);
        setBooleanField(term125309, term125309.getClass(), "resolved", false);
        setField(term125309, term125309.getClass(), "resolveResult", null);
        setField(term125309, term125309.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term125232;
        args[1] = term125232;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term125232, term125307));
        assertTrue(recursiveEquals(term125232, term125309));
        assertTrue(recursiveEquals(retValue, true));
    }

};


