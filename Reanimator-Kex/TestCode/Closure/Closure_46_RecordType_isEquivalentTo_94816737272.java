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

public class RecordType_isEquivalentTo_94816737272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13123;
     Object term13219;
     Object term13233;
     Object term13234;

    public RecordType_isEquivalentTo_94816737272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13123 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term13219 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        term13233 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term13233, term13233.getClass(), "properties", null);
        setBooleanField(term13233, term13233.getClass(), "isFrozen", false);
        setField(term13233, term13233.getClass(), "className", null);
        setField(term13233, term13233.getClass(), "properties", null);
        setBooleanField(term13233, term13233.getClass(), "nativeType", false);
        setField(term13233, term13233.getClass(), "implicitPrototypeFallback", null);
        setField(term13233, term13233.getClass(), "ownerFunction", null);
        setBooleanField(term13233, term13233.getClass(), "prettyPrint", false);
        setBooleanField(term13233, term13233.getClass(), "visited", false);
        setField(term13233, term13233.getClass(), "docInfo", null);
        setBooleanField(term13233, term13233.getClass(), "unknown", false);
        setBooleanField(term13233, term13233.getClass(), "resolved", false);
        setField(term13233, term13233.getClass(), "resolveResult", null);
        setField(term13233, term13233.getClass(), "registry", null);
        term13234 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setBooleanField(term13234, term13234.getClass(), "resolved", false);
        setField(term13234, term13234.getClass(), "resolveResult", null);
        setField(term13234, term13234.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term13219;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term13123, args);
        assertTrue(recursiveEquals(term13123, term13233));
        assertTrue(recursiveEquals(term13219, term13234));
        assertTrue(recursiveEquals(retValue, false));
    }

};


