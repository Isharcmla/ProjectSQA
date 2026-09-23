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

public class RecordType_toMaybeRecordType_2997245727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2222;
     Object term3442;

    public RecordType_toMaybeRecordType_2997245727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2222 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term2222, term2222.getClass(), "properties", null);
        setBooleanField(term2222, term2222.getClass(), "declared", false);
        setBooleanField(term2222, term2222.getClass(), "isFrozen", false);
        setField(term2222, term2222.getClass(), "className", null);
        setField(term2222, term2222.getClass(), "properties", null);
        setBooleanField(term2222, term2222.getClass(), "nativeType", false);
        setField(term2222, term2222.getClass(), "implicitPrototypeFallback", null);
        setField(term2222, term2222.getClass(), "ownerFunction", null);
        setBooleanField(term2222, term2222.getClass(), "prettyPrint", false);
        setBooleanField(term2222, term2222.getClass(), "visited", false);
        setField(term2222, term2222.getClass(), "docInfo", null);
        setBooleanField(term2222, term2222.getClass(), "unknown", false);
        setBooleanField(term2222, term2222.getClass(), "resolved", false);
        setField(term2222, term2222.getClass(), "resolveResult", null);
        setBooleanField(term2222, term2222.getClass(), "inTemplatedCheckVisit", false);
        setField(term2222, term2222.getClass(), "registry", null);
        term3442 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term3442, term3442.getClass(), "properties", null);
        setBooleanField(term3442, term3442.getClass(), "declared", false);
        setBooleanField(term3442, term3442.getClass(), "isFrozen", false);
        setField(term3442, term3442.getClass(), "className", null);
        setField(term3442, term3442.getClass(), "properties", null);
        setBooleanField(term3442, term3442.getClass(), "nativeType", false);
        setField(term3442, term3442.getClass(), "implicitPrototypeFallback", null);
        setField(term3442, term3442.getClass(), "ownerFunction", null);
        setBooleanField(term3442, term3442.getClass(), "prettyPrint", false);
        setBooleanField(term3442, term3442.getClass(), "visited", false);
        setField(term3442, term3442.getClass(), "docInfo", null);
        setBooleanField(term3442, term3442.getClass(), "unknown", false);
        setBooleanField(term3442, term3442.getClass(), "resolved", false);
        setField(term3442, term3442.getClass(), "resolveResult", null);
        setBooleanField(term3442, term3442.getClass(), "inTemplatedCheckVisit", false);
        setField(term3442, term3442.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toMaybeRecordType", argTypes, term2222, args);
        assertTrue(recursiveEquals(term2222, term3442));
    }

};


