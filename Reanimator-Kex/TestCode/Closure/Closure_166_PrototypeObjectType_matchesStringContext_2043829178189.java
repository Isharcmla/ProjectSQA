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

public class PrototypeObjectType_matchesStringContext_2043829178189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33310;
     Object term62604;

    public PrototypeObjectType_matchesStringContext_2043829178189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33310 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setBooleanField(term33310, term33310.getClass(), "nativeType", true);
        term62604 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term62604, term62604.getClass(), "className", null);
        setField(term62604, term62604.getClass(), "properties", null);
        setBooleanField(term62604, term62604.getClass(), "nativeType", true);
        setField(term62604, term62604.getClass(), "implicitPrototypeFallback", null);
        setField(term62604, term62604.getClass(), "ownerFunction", null);
        setBooleanField(term62604, term62604.getClass(), "prettyPrint", false);
        setBooleanField(term62604, term62604.getClass(), "visited", false);
        setField(term62604, term62604.getClass(), "docInfo", null);
        setBooleanField(term62604, term62604.getClass(), "unknown", false);
        setBooleanField(term62604, term62604.getClass(), "resolved", false);
        setField(term62604, term62604.getClass(), "resolveResult", null);
        setBooleanField(term62604, term62604.getClass(), "inTemplatedCheckVisit", false);
        setField(term62604, term62604.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesStringContext", argTypes, term33310, args);
        assertTrue(recursiveEquals(term33310, term62604));
        assertTrue(recursiveEquals(retValue, false));
    }

};


