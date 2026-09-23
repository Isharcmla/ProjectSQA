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

public class RecordType_isEquivalentTo_94816737248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7200;
     Object term7290;
     Object term7461;
     Object term7462;

    public RecordType_isEquivalentTo_94816737248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7200 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term7290 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term7461 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term7461, term7461.getClass(), "properties", null);
        setBooleanField(term7461, term7461.getClass(), "isFrozen", false);
        setField(term7461, term7461.getClass(), "className", null);
        setField(term7461, term7461.getClass(), "properties", null);
        setBooleanField(term7461, term7461.getClass(), "nativeType", false);
        setField(term7461, term7461.getClass(), "implicitPrototypeFallback", null);
        setField(term7461, term7461.getClass(), "ownerFunction", null);
        setBooleanField(term7461, term7461.getClass(), "prettyPrint", false);
        setBooleanField(term7461, term7461.getClass(), "visited", false);
        setField(term7461, term7461.getClass(), "docInfo", null);
        setBooleanField(term7461, term7461.getClass(), "unknown", false);
        setBooleanField(term7461, term7461.getClass(), "resolved", false);
        setField(term7461, term7461.getClass(), "resolveResult", null);
        setField(term7461, term7461.getClass(), "registry", null);
        term7462 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term7462, term7462.getClass(), "resolved", false);
        setField(term7462, term7462.getClass(), "resolveResult", null);
        setField(term7462, term7462.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term7290;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term7200, args);
        assertTrue(recursiveEquals(term7200, term7461));
        assertTrue(recursiveEquals(term7290, term7462));
        assertTrue(recursiveEquals(retValue, false));
    }

};


