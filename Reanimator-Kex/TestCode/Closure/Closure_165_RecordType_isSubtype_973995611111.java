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

public class RecordType_isSubtype_973995611111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29472;
     Object term29636;

    public RecordType_isSubtype_973995611111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29472 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term29512 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term29472, term29472.getClass(), "properties", term29512);
        term29636 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term29637 = newInstance(Class.forName("java.util.TreeMap"));
        Object term29638 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term29637, term29637.getClass(), "comparator", null);
        setField(term29637, term29637.getClass(), "root", null);
        setIntField(term29637, term29637.getClass(), "size", 0);
        setIntField(term29637, term29637.getClass(), "modCount", 0);
        setField(term29637, term29637.getClass(), "entrySet", null);
        setField(term29638, term29638.getClass(), "m", term29637);
        setField(term29637, term29637.getClass(), "navigableKeySet", term29638);
        setField(term29637, term29637.getClass(), "descendingMap", null);
        setField(term29637, term29637.getClass(), "keySet", null);
        setField(term29637, term29637.getClass(), "values", null);
        setField(term29636, term29636.getClass(), "properties", term29637);
        setBooleanField(term29636, term29636.getClass(), "isFrozen", false);
        setField(term29636, term29636.getClass(), "className", null);
        setField(term29636, term29636.getClass(), "properties", null);
        setBooleanField(term29636, term29636.getClass(), "nativeType", false);
        setField(term29636, term29636.getClass(), "implicitPrototypeFallback", null);
        setField(term29636, term29636.getClass(), "ownerFunction", null);
        setBooleanField(term29636, term29636.getClass(), "prettyPrint", false);
        setBooleanField(term29636, term29636.getClass(), "visited", false);
        setField(term29636, term29636.getClass(), "docInfo", null);
        setBooleanField(term29636, term29636.getClass(), "unknown", false);
        setBooleanField(term29636, term29636.getClass(), "resolved", false);
        setField(term29636, term29636.getClass(), "resolveResult", null);
        setField(term29636, term29636.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term29472;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term29472, term29636));
        assertTrue(recursiveEquals(retValue, true));
    }

};


