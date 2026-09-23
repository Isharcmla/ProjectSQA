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

public class RecordType_isSubtype_973995611180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79853;
     Object term79909;

    public RecordType_isSubtype_973995611180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79853 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term79893 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term79853, term79853.getClass(), "properties", term79893);
        term79909 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term79910 = newInstance(Class.forName("java.util.TreeMap"));
        Object term79911 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term79910, term79910.getClass(), "comparator", null);
        setField(term79910, term79910.getClass(), "root", null);
        setIntField(term79910, term79910.getClass(), "size", 0);
        setIntField(term79910, term79910.getClass(), "modCount", 0);
        setField(term79910, term79910.getClass(), "entrySet", null);
        setField(term79911, term79911.getClass(), "m", term79910);
        setField(term79910, term79910.getClass(), "navigableKeySet", term79911);
        setField(term79910, term79910.getClass(), "descendingMap", null);
        setField(term79910, term79910.getClass(), "keySet", null);
        setField(term79910, term79910.getClass(), "values", null);
        setField(term79909, term79909.getClass(), "properties", term79910);
        setBooleanField(term79909, term79909.getClass(), "declared", false);
        setBooleanField(term79909, term79909.getClass(), "isFrozen", false);
        setField(term79909, term79909.getClass(), "className", null);
        setField(term79909, term79909.getClass(), "properties", null);
        setBooleanField(term79909, term79909.getClass(), "nativeType", false);
        setField(term79909, term79909.getClass(), "implicitPrototypeFallback", null);
        setField(term79909, term79909.getClass(), "ownerFunction", null);
        setBooleanField(term79909, term79909.getClass(), "prettyPrint", false);
        setBooleanField(term79909, term79909.getClass(), "visited", false);
        setField(term79909, term79909.getClass(), "docInfo", null);
        setBooleanField(term79909, term79909.getClass(), "unknown", false);
        setBooleanField(term79909, term79909.getClass(), "resolved", false);
        setField(term79909, term79909.getClass(), "resolveResult", null);
        setBooleanField(term79909, term79909.getClass(), "inTemplatedCheckVisit", false);
        setField(term79909, term79909.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term79853;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term79853, term79909));
        assertTrue(recursiveEquals(retValue, true));
    }

};


