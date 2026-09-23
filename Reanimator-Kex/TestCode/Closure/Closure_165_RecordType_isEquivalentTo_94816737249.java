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

public class RecordType_isEquivalentTo_94816737249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7447;
     Object term7476;
     Object term7477;

    public RecordType_isEquivalentTo_94816737249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7447 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term7476 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term7476, term7476.getClass(), "properties", null);
        setBooleanField(term7476, term7476.getClass(), "isFrozen", false);
        setField(term7476, term7476.getClass(), "className", null);
        setField(term7476, term7476.getClass(), "properties", null);
        setBooleanField(term7476, term7476.getClass(), "nativeType", false);
        setField(term7476, term7476.getClass(), "implicitPrototypeFallback", null);
        setField(term7476, term7476.getClass(), "ownerFunction", null);
        setBooleanField(term7476, term7476.getClass(), "prettyPrint", false);
        setBooleanField(term7476, term7476.getClass(), "visited", false);
        setField(term7476, term7476.getClass(), "docInfo", null);
        setBooleanField(term7476, term7476.getClass(), "unknown", false);
        setBooleanField(term7476, term7476.getClass(), "resolved", false);
        setField(term7476, term7476.getClass(), "resolveResult", null);
        setField(term7476, term7476.getClass(), "registry", null);
        term7477 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term7477, term7477.getClass(), "properties", null);
        setBooleanField(term7477, term7477.getClass(), "isFrozen", false);
        setField(term7477, term7477.getClass(), "className", null);
        setField(term7477, term7477.getClass(), "properties", null);
        setBooleanField(term7477, term7477.getClass(), "nativeType", false);
        setField(term7477, term7477.getClass(), "implicitPrototypeFallback", null);
        setField(term7477, term7477.getClass(), "ownerFunction", null);
        setBooleanField(term7477, term7477.getClass(), "prettyPrint", false);
        setBooleanField(term7477, term7477.getClass(), "visited", false);
        setField(term7477, term7477.getClass(), "docInfo", null);
        setBooleanField(term7477, term7477.getClass(), "unknown", false);
        setBooleanField(term7477, term7477.getClass(), "resolved", false);
        setField(term7477, term7477.getClass(), "resolveResult", null);
        setField(term7477, term7477.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term7447;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term7447, args);
        assertTrue(recursiveEquals(term7447, term7476));
        assertTrue(recursiveEquals(term7447, term7477));
        assertTrue(recursiveEquals(retValue, true));
    }

};


