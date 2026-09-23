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

public class RecordType_isSubtype_97399561156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10443;
     Object term10499;

    public RecordType_isSubtype_97399561156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10443 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term10483 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term10443, term10443.getClass(), "properties", term10483);
        term10499 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term10500 = newInstance(Class.forName("java.util.TreeMap"));
        Object term10501 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term10500, term10500.getClass(), "comparator", null);
        setField(term10500, term10500.getClass(), "root", null);
        setIntField(term10500, term10500.getClass(), "size", 0);
        setIntField(term10500, term10500.getClass(), "modCount", 0);
        setField(term10500, term10500.getClass(), "entrySet", null);
        setField(term10501, term10501.getClass(), "m", term10500);
        setField(term10500, term10500.getClass(), "navigableKeySet", term10501);
        setField(term10500, term10500.getClass(), "descendingMap", null);
        setField(term10500, term10500.getClass(), "keySet", null);
        setField(term10500, term10500.getClass(), "values", null);
        setField(term10499, term10499.getClass(), "properties", term10500);
        setBooleanField(term10499, term10499.getClass(), "declared", false);
        setBooleanField(term10499, term10499.getClass(), "isFrozen", false);
        setField(term10499, term10499.getClass(), "className", null);
        setField(term10499, term10499.getClass(), "properties", null);
        setBooleanField(term10499, term10499.getClass(), "nativeType", false);
        setField(term10499, term10499.getClass(), "implicitPrototypeFallback", null);
        setField(term10499, term10499.getClass(), "ownerFunction", null);
        setBooleanField(term10499, term10499.getClass(), "prettyPrint", false);
        setBooleanField(term10499, term10499.getClass(), "visited", false);
        setField(term10499, term10499.getClass(), "docInfo", null);
        setBooleanField(term10499, term10499.getClass(), "unknown", false);
        setBooleanField(term10499, term10499.getClass(), "resolved", false);
        setField(term10499, term10499.getClass(), "resolveResult", null);
        setBooleanField(term10499, term10499.getClass(), "inTemplatedCheckVisit", false);
        setField(term10499, term10499.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term10443;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term10443, term10499));
        assertTrue(recursiveEquals(retValue, true));
    }

};


