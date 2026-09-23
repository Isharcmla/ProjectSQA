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

public class RecordType_isSubtype_973995611124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31166;
     Object term31220;

    public RecordType_isSubtype_973995611124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31166 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term31206 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term31166, term31166.getClass(), "properties", term31206);
        term31220 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term31221 = newInstance(Class.forName("java.util.TreeMap"));
        Object term31222 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term31221, term31221.getClass(), "comparator", null);
        setField(term31221, term31221.getClass(), "root", null);
        setIntField(term31221, term31221.getClass(), "size", 0);
        setIntField(term31221, term31221.getClass(), "modCount", 0);
        setField(term31221, term31221.getClass(), "entrySet", null);
        setField(term31222, term31222.getClass(), "m", term31221);
        setField(term31221, term31221.getClass(), "navigableKeySet", term31222);
        setField(term31221, term31221.getClass(), "descendingMap", null);
        setField(term31221, term31221.getClass(), "keySet", null);
        setField(term31221, term31221.getClass(), "values", null);
        setField(term31220, term31220.getClass(), "properties", term31221);
        setBooleanField(term31220, term31220.getClass(), "isFrozen", false);
        setField(term31220, term31220.getClass(), "className", null);
        setField(term31220, term31220.getClass(), "properties", null);
        setBooleanField(term31220, term31220.getClass(), "nativeType", false);
        setField(term31220, term31220.getClass(), "implicitPrototypeFallback", null);
        setField(term31220, term31220.getClass(), "ownerFunction", null);
        setBooleanField(term31220, term31220.getClass(), "prettyPrint", false);
        setBooleanField(term31220, term31220.getClass(), "visited", false);
        setField(term31220, term31220.getClass(), "docInfo", null);
        setBooleanField(term31220, term31220.getClass(), "unknown", false);
        setBooleanField(term31220, term31220.getClass(), "resolved", false);
        setField(term31220, term31220.getClass(), "resolveResult", null);
        setField(term31220, term31220.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term31166;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term31166, term31220));
        assertTrue(recursiveEquals(retValue, true));
    }

};


