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

public class JSType_isSubtypeHelper_677825053321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45982;
     Object term46078;
     Object term46123;
     Object term46124;

    public JSType_isSubtypeHelper_677825053321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45982 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        term46078 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        term46123 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setBooleanField(term46123, term46123.getClass(), "resolved", false);
        setField(term46123, term46123.getClass(), "resolveResult", null);
        setBooleanField(term46123, term46123.getClass(), "inTemplatedCheckVisit", false);
        setField(term46123, term46123.getClass(), "registry", null);
        term46124 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term46124, term46124.getClass(), "this$0", null);
        setField(term46124, term46124.getClass(), "call", null);
        setField(term46124, term46124.getClass(), "prototypeSlot", null);
        setField(term46124, term46124.getClass(), "kind", null);
        setField(term46124, term46124.getClass(), "propAccess", null);
        setField(term46124, term46124.getClass(), "typeOfThis", null);
        setField(term46124, term46124.getClass(), "source", null);
        setField(term46124, term46124.getClass(), "implementedInterfaces", null);
        setField(term46124, term46124.getClass(), "extendedInterfaces", null);
        setField(term46124, term46124.getClass(), "subTypes", null);
        setField(term46124, term46124.getClass(), "templateTypeNames", null);
        setField(term46124, term46124.getClass(), "className", null);
        setField(term46124, term46124.getClass(), "properties", null);
        setBooleanField(term46124, term46124.getClass(), "nativeType", false);
        setField(term46124, term46124.getClass(), "implicitPrototypeFallback", null);
        setField(term46124, term46124.getClass(), "ownerFunction", null);
        setBooleanField(term46124, term46124.getClass(), "prettyPrint", false);
        setBooleanField(term46124, term46124.getClass(), "visited", false);
        setField(term46124, term46124.getClass(), "docInfo", null);
        setBooleanField(term46124, term46124.getClass(), "unknown", false);
        setBooleanField(term46124, term46124.getClass(), "resolved", false);
        setField(term46124, term46124.getClass(), "resolveResult", null);
        setBooleanField(term46124, term46124.getClass(), "inTemplatedCheckVisit", false);
        setField(term46124, term46124.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term45982;
        args[1] = term46078;
        Object retValue = callMethod(klass, "isSubtypeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term45982, term46123));
        assertTrue(recursiveEquals(term46078, term46124));
        assertTrue(recursiveEquals(retValue, false));
    }

};


