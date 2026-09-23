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

public class RecordType_checkRecordEquivalenceHelper_1934915248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7355;
     Object term7393;
     Object term7396;

    public RecordType_checkRecordEquivalenceHelper_1934915248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7355 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term7375 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term7355, term7355.getClass(), "properties", term7375);
        term7393 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term7394 = newInstance(Class.forName("java.util.TreeMap"));
        Object term7395 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term7394, term7394.getClass(), "comparator", null);
        setField(term7394, term7394.getClass(), "root", null);
        setIntField(term7394, term7394.getClass(), "size", 0);
        setIntField(term7394, term7394.getClass(), "modCount", 0);
        setField(term7394, term7394.getClass(), "entrySet", null);
        setField(term7395, term7395.getClass(), "m", term7394);
        setField(term7394, term7394.getClass(), "navigableKeySet", term7395);
        setField(term7394, term7394.getClass(), "descendingMap", null);
        setField(term7394, term7394.getClass(), "keySet", null);
        setField(term7394, term7394.getClass(), "values", null);
        setField(term7393, term7393.getClass(), "properties", term7394);
        setBooleanField(term7393, term7393.getClass(), "declared", false);
        setBooleanField(term7393, term7393.getClass(), "isFrozen", false);
        setField(term7393, term7393.getClass(), "className", null);
        setField(term7393, term7393.getClass(), "properties", null);
        setBooleanField(term7393, term7393.getClass(), "nativeType", false);
        setField(term7393, term7393.getClass(), "implicitPrototypeFallback", null);
        setField(term7393, term7393.getClass(), "ownerFunction", null);
        setBooleanField(term7393, term7393.getClass(), "prettyPrint", false);
        setBooleanField(term7393, term7393.getClass(), "visited", false);
        setField(term7393, term7393.getClass(), "docInfo", null);
        setBooleanField(term7393, term7393.getClass(), "unknown", false);
        setBooleanField(term7393, term7393.getClass(), "resolved", false);
        setField(term7393, term7393.getClass(), "resolveResult", null);
        setBooleanField(term7393, term7393.getClass(), "inTemplatedCheckVisit", false);
        setField(term7393, term7393.getClass(), "registry", null);
        term7396 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term7397 = newInstance(Class.forName("java.util.TreeMap"));
        Object term7398 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term7397, term7397.getClass(), "comparator", null);
        setField(term7397, term7397.getClass(), "root", null);
        setIntField(term7397, term7397.getClass(), "size", 0);
        setIntField(term7397, term7397.getClass(), "modCount", 0);
        setField(term7397, term7397.getClass(), "entrySet", null);
        setField(term7398, term7398.getClass(), "m", term7397);
        setField(term7397, term7397.getClass(), "navigableKeySet", term7398);
        setField(term7397, term7397.getClass(), "descendingMap", null);
        setField(term7397, term7397.getClass(), "keySet", null);
        setField(term7397, term7397.getClass(), "values", null);
        setField(term7396, term7396.getClass(), "properties", term7397);
        setBooleanField(term7396, term7396.getClass(), "declared", false);
        setBooleanField(term7396, term7396.getClass(), "isFrozen", false);
        setField(term7396, term7396.getClass(), "className", null);
        setField(term7396, term7396.getClass(), "properties", null);
        setBooleanField(term7396, term7396.getClass(), "nativeType", false);
        setField(term7396, term7396.getClass(), "implicitPrototypeFallback", null);
        setField(term7396, term7396.getClass(), "ownerFunction", null);
        setBooleanField(term7396, term7396.getClass(), "prettyPrint", false);
        setBooleanField(term7396, term7396.getClass(), "visited", false);
        setField(term7396, term7396.getClass(), "docInfo", null);
        setBooleanField(term7396, term7396.getClass(), "unknown", false);
        setBooleanField(term7396, term7396.getClass(), "resolved", false);
        setField(term7396, term7396.getClass(), "resolveResult", null);
        setBooleanField(term7396, term7396.getClass(), "inTemplatedCheckVisit", false);
        setField(term7396, term7396.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term7355;
        args[1] = false;
        Object retValue = callMethod(klass, "checkRecordEquivalenceHelper", argTypes, term7355, args);
        assertTrue(recursiveEquals(term7355, term7393));
        assertTrue(recursiveEquals(term7355, term7396));
        assertTrue(recursiveEquals(retValue, true));
    }

};


