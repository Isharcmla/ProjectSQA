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

public class RecordType_checkRecordEquivalenceHelper_1934915268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14567;
     Object term14703;
     Object term15059;
     Object term15062;

    public RecordType_checkRecordEquivalenceHelper_1934915268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14567 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term14723 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term14567, term14567.getClass(), "properties", term14723);
        term14703 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term14703, term14703.getClass(), "properties", term14723);
        term15059 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term15060 = newInstance(Class.forName("java.util.TreeMap"));
        Object term15061 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term15060, term15060.getClass(), "comparator", null);
        setField(term15060, term15060.getClass(), "root", null);
        setIntField(term15060, term15060.getClass(), "size", 0);
        setIntField(term15060, term15060.getClass(), "modCount", 0);
        setField(term15060, term15060.getClass(), "entrySet", null);
        setField(term15061, term15061.getClass(), "m", term15060);
        setField(term15060, term15060.getClass(), "navigableKeySet", term15061);
        setField(term15060, term15060.getClass(), "descendingMap", null);
        setField(term15060, term15060.getClass(), "keySet", null);
        setField(term15060, term15060.getClass(), "values", null);
        setField(term15059, term15059.getClass(), "properties", term15060);
        setBooleanField(term15059, term15059.getClass(), "declared", false);
        setBooleanField(term15059, term15059.getClass(), "isFrozen", false);
        setField(term15059, term15059.getClass(), "className", null);
        setField(term15059, term15059.getClass(), "properties", null);
        setBooleanField(term15059, term15059.getClass(), "nativeType", false);
        setField(term15059, term15059.getClass(), "implicitPrototypeFallback", null);
        setField(term15059, term15059.getClass(), "ownerFunction", null);
        setBooleanField(term15059, term15059.getClass(), "prettyPrint", false);
        setBooleanField(term15059, term15059.getClass(), "visited", false);
        setField(term15059, term15059.getClass(), "docInfo", null);
        setBooleanField(term15059, term15059.getClass(), "unknown", false);
        setBooleanField(term15059, term15059.getClass(), "resolved", false);
        setField(term15059, term15059.getClass(), "resolveResult", null);
        setBooleanField(term15059, term15059.getClass(), "inTemplatedCheckVisit", false);
        setField(term15059, term15059.getClass(), "registry", null);
        term15062 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term15063 = newInstance(Class.forName("java.util.TreeMap"));
        Object term15064 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term15063, term15063.getClass(), "comparator", null);
        setField(term15063, term15063.getClass(), "root", null);
        setIntField(term15063, term15063.getClass(), "size", 0);
        setIntField(term15063, term15063.getClass(), "modCount", 0);
        setField(term15063, term15063.getClass(), "entrySet", null);
        setField(term15064, term15064.getClass(), "m", term15063);
        setField(term15063, term15063.getClass(), "navigableKeySet", term15064);
        setField(term15063, term15063.getClass(), "descendingMap", null);
        setField(term15063, term15063.getClass(), "keySet", null);
        setField(term15063, term15063.getClass(), "values", null);
        setField(term15062, term15062.getClass(), "properties", term15063);
        setBooleanField(term15062, term15062.getClass(), "declared", false);
        setBooleanField(term15062, term15062.getClass(), "isFrozen", false);
        setField(term15062, term15062.getClass(), "className", null);
        setField(term15062, term15062.getClass(), "properties", null);
        setBooleanField(term15062, term15062.getClass(), "nativeType", false);
        setField(term15062, term15062.getClass(), "implicitPrototypeFallback", null);
        setField(term15062, term15062.getClass(), "ownerFunction", null);
        setBooleanField(term15062, term15062.getClass(), "prettyPrint", false);
        setBooleanField(term15062, term15062.getClass(), "visited", false);
        setField(term15062, term15062.getClass(), "docInfo", null);
        setBooleanField(term15062, term15062.getClass(), "unknown", false);
        setBooleanField(term15062, term15062.getClass(), "resolved", false);
        setField(term15062, term15062.getClass(), "resolveResult", null);
        setBooleanField(term15062, term15062.getClass(), "inTemplatedCheckVisit", false);
        setField(term15062, term15062.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term14703;
        args[1] = false;
        Object retValue = callMethod(klass, "checkRecordEquivalenceHelper", argTypes, term14567, args);
        assertTrue(recursiveEquals(term14567, term15059));
        assertTrue(recursiveEquals(term14703, term15062));
        assertTrue(recursiveEquals(retValue, true));
    }

};


