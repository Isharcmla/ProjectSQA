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

public class PrototypeObjectType_hasReferenceName_74483355990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11648;
     Object term11940;

    public PrototypeObjectType_hasReferenceName_74483355990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11648 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term11648, term11648.getClass(), "className", null);
        term11940 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term11940, term11940.getClass(), "className", null);
        setField(term11940, term11940.getClass(), "properties", null);
        setBooleanField(term11940, term11940.getClass(), "nativeType", false);
        setField(term11940, term11940.getClass(), "implicitPrototypeFallback", null);
        setField(term11940, term11940.getClass(), "ownerFunction", null);
        setBooleanField(term11940, term11940.getClass(), "prettyPrint", false);
        setBooleanField(term11940, term11940.getClass(), "visited", false);
        setField(term11940, term11940.getClass(), "docInfo", null);
        setBooleanField(term11940, term11940.getClass(), "unknown", false);
        setBooleanField(term11940, term11940.getClass(), "resolved", false);
        setField(term11940, term11940.getClass(), "resolveResult", null);
        setBooleanField(term11940, term11940.getClass(), "inTemplatedCheckVisit", false);
        setField(term11940, term11940.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasReferenceName", argTypes, term11648, args);
        assertTrue(recursiveEquals(term11648, term11940));
        assertTrue(recursiveEquals(retValue, false));
    }

};


