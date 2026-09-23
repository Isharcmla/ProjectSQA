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

public class PrototypeObjectType_getReferenceName_266521824176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27853;
     Object term60233;

    public PrototypeObjectType_getReferenceName_266521824176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27853 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term27853, term27853.getClass(), "className", null);
        term60233 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term60233, term60233.getClass(), "className", null);
        setField(term60233, term60233.getClass(), "properties", null);
        setBooleanField(term60233, term60233.getClass(), "nativeType", false);
        setField(term60233, term60233.getClass(), "implicitPrototypeFallback", null);
        setField(term60233, term60233.getClass(), "ownerFunction", null);
        setBooleanField(term60233, term60233.getClass(), "prettyPrint", false);
        setBooleanField(term60233, term60233.getClass(), "visited", false);
        setField(term60233, term60233.getClass(), "docInfo", null);
        setBooleanField(term60233, term60233.getClass(), "unknown", false);
        setBooleanField(term60233, term60233.getClass(), "resolved", false);
        setField(term60233, term60233.getClass(), "resolveResult", null);
        setBooleanField(term60233, term60233.getClass(), "inTemplatedCheckVisit", false);
        setField(term60233, term60233.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getReferenceName", argTypes, term27853, args);
        assertTrue(recursiveEquals(term27853, term60233));
        assertTrue(recursiveEquals(retValue, null));
    }

};


