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
import java.util.ArrayList;

public class NamedType_finishPropertyContinuations_167806891183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45056;
     Object term45243;

    public NamedType_finishPropertyContinuations_167806891183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term45208 = new ArrayList();
        term45056 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term45156 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setBooleanField(term45156, term45156.getClass(), "unknown", false);
        setField(term45056, term45056.getClass(), "referencedObjType", term45156);
        setField(term45056, term45056.getClass(), "propertyContinuations", term45208);
        term45243 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term45244 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term45243, term45243.getClass(), "reference", null);
        setField(term45243, term45243.getClass(), "sourceName", null);
        setIntField(term45243, term45243.getClass(), "lineno", 0);
        setIntField(term45243, term45243.getClass(), "charno", 0);
        setField(term45243, term45243.getClass(), "validator", null);
        setField(term45243, term45243.getClass(), "propertyContinuations", null);
        setField(term45243, term45243.getClass(), "referencedType", null);
        setField(term45244, term45244.getClass(), "call", null);
        setField(term45244, term45244.getClass(), "prototypeSlot", null);
        setField(term45244, term45244.getClass(), "kind", null);
        setField(term45244, term45244.getClass(), "propAccess", null);
        setField(term45244, term45244.getClass(), "typeOfThis", null);
        setField(term45244, term45244.getClass(), "source", null);
        setField(term45244, term45244.getClass(), "implementedInterfaces", null);
        setField(term45244, term45244.getClass(), "extendedInterfaces", null);
        setField(term45244, term45244.getClass(), "subTypes", null);
        setField(term45244, term45244.getClass(), "className", null);
        setField(term45244, term45244.getClass(), "properties", null);
        setBooleanField(term45244, term45244.getClass(), "nativeType", false);
        setField(term45244, term45244.getClass(), "implicitPrototypeFallback", null);
        setField(term45244, term45244.getClass(), "ownerFunction", null);
        setBooleanField(term45244, term45244.getClass(), "prettyPrint", false);
        setBooleanField(term45244, term45244.getClass(), "visited", false);
        setField(term45244, term45244.getClass(), "docInfo", null);
        setBooleanField(term45244, term45244.getClass(), "unknown", false);
        setBooleanField(term45244, term45244.getClass(), "resolved", false);
        setField(term45244, term45244.getClass(), "resolveResult", null);
        setField(term45244, term45244.getClass(), "templateKeys", null);
        setField(term45244, term45244.getClass(), "templatizedTypes", null);
        setBooleanField(term45244, term45244.getClass(), "inTemplatedCheckVisit", false);
        setField(term45244, term45244.getClass(), "registry", null);
        setField(term45243, term45243.getClass(), "referencedObjType", term45244);
        setBooleanField(term45243, term45243.getClass(), "visited", false);
        setField(term45243, term45243.getClass(), "docInfo", null);
        setBooleanField(term45243, term45243.getClass(), "unknown", false);
        setBooleanField(term45243, term45243.getClass(), "resolved", false);
        setField(term45243, term45243.getClass(), "resolveResult", null);
        setField(term45243, term45243.getClass(), "templateKeys", null);
        setField(term45243, term45243.getClass(), "templatizedTypes", null);
        setBooleanField(term45243, term45243.getClass(), "inTemplatedCheckVisit", false);
        setField(term45243, term45243.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "finishPropertyContinuations", argTypes, term45056, args);
        assertTrue(recursiveEquals(term45056, term45243));
    }

};


