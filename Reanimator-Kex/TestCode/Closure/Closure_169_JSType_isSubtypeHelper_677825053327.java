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

public class JSType_isSubtypeHelper_677825053327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47119;
     Object term47215;
     Object term47257;
     Object term47258;

    public JSType_isSubtypeHelper_677825053327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47119 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term47215 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        term47257 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setBooleanField(term47257, term47257.getClass(), "resolved", false);
        setField(term47257, term47257.getClass(), "resolveResult", null);
        setBooleanField(term47257, term47257.getClass(), "inTemplatedCheckVisit", false);
        setField(term47257, term47257.getClass(), "registry", null);
        term47258 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term47258, term47258.getClass(), "call", null);
        setField(term47258, term47258.getClass(), "prototypeSlot", null);
        setField(term47258, term47258.getClass(), "kind", null);
        setField(term47258, term47258.getClass(), "propAccess", null);
        setField(term47258, term47258.getClass(), "typeOfThis", null);
        setField(term47258, term47258.getClass(), "source", null);
        setField(term47258, term47258.getClass(), "implementedInterfaces", null);
        setField(term47258, term47258.getClass(), "extendedInterfaces", null);
        setField(term47258, term47258.getClass(), "subTypes", null);
        setField(term47258, term47258.getClass(), "templateTypeNames", null);
        setField(term47258, term47258.getClass(), "className", null);
        setField(term47258, term47258.getClass(), "properties", null);
        setBooleanField(term47258, term47258.getClass(), "nativeType", false);
        setField(term47258, term47258.getClass(), "implicitPrototypeFallback", null);
        setField(term47258, term47258.getClass(), "ownerFunction", null);
        setBooleanField(term47258, term47258.getClass(), "prettyPrint", false);
        setBooleanField(term47258, term47258.getClass(), "visited", false);
        setField(term47258, term47258.getClass(), "docInfo", null);
        setBooleanField(term47258, term47258.getClass(), "unknown", false);
        setBooleanField(term47258, term47258.getClass(), "resolved", false);
        setField(term47258, term47258.getClass(), "resolveResult", null);
        setBooleanField(term47258, term47258.getClass(), "inTemplatedCheckVisit", false);
        setField(term47258, term47258.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term47119;
        args[1] = term47215;
        Object retValue = callMethod(klass, "isSubtypeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term47119, term47257));
        assertTrue(recursiveEquals(term47215, term47258));
        assertTrue(recursiveEquals(retValue, false));
    }

};


