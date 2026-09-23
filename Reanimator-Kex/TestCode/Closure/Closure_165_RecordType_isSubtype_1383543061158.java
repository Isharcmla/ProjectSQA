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

public class RecordType_isSubtype_1383543061158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48918;
     Object term48938;
     Object term48939;

    public RecordType_isSubtype_1383543061158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48918 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setBooleanField(term48918, term48918.getClass(), "unknown", false);
        term48938 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term48938, term48938.getClass(), "properties", null);
        setBooleanField(term48938, term48938.getClass(), "isFrozen", false);
        setField(term48938, term48938.getClass(), "className", null);
        setField(term48938, term48938.getClass(), "properties", null);
        setBooleanField(term48938, term48938.getClass(), "nativeType", false);
        setField(term48938, term48938.getClass(), "implicitPrototypeFallback", null);
        setField(term48938, term48938.getClass(), "ownerFunction", null);
        setBooleanField(term48938, term48938.getClass(), "prettyPrint", false);
        setBooleanField(term48938, term48938.getClass(), "visited", false);
        setField(term48938, term48938.getClass(), "docInfo", null);
        setBooleanField(term48938, term48938.getClass(), "unknown", false);
        setBooleanField(term48938, term48938.getClass(), "resolved", false);
        setField(term48938, term48938.getClass(), "resolveResult", null);
        setField(term48938, term48938.getClass(), "registry", null);
        term48939 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term48939, term48939.getClass(), "properties", null);
        setBooleanField(term48939, term48939.getClass(), "isFrozen", false);
        setField(term48939, term48939.getClass(), "className", null);
        setField(term48939, term48939.getClass(), "properties", null);
        setBooleanField(term48939, term48939.getClass(), "nativeType", false);
        setField(term48939, term48939.getClass(), "implicitPrototypeFallback", null);
        setField(term48939, term48939.getClass(), "ownerFunction", null);
        setBooleanField(term48939, term48939.getClass(), "prettyPrint", false);
        setBooleanField(term48939, term48939.getClass(), "visited", false);
        setField(term48939, term48939.getClass(), "docInfo", null);
        setBooleanField(term48939, term48939.getClass(), "unknown", false);
        setBooleanField(term48939, term48939.getClass(), "resolved", false);
        setField(term48939, term48939.getClass(), "resolveResult", null);
        setField(term48939, term48939.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term48918;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term48918, args);
        assertTrue(recursiveEquals(term48918, term48938));
        assertTrue(recursiveEquals(term48918, term48939));
        assertTrue(recursiveEquals(retValue, true));
    }

};


