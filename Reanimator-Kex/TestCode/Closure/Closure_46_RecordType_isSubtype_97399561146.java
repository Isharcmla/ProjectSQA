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

public class RecordType_isSubtype_97399561146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7012;
     Object term7066;

    public RecordType_isSubtype_97399561146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7012 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term7052 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term7012, term7012.getClass(), "properties", term7052);
        term7066 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term7067 = newInstance(Class.forName("java.util.TreeMap"));
        Object term7068 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term7067, term7067.getClass(), "comparator", null);
        setField(term7067, term7067.getClass(), "root", null);
        setIntField(term7067, term7067.getClass(), "size", 0);
        setIntField(term7067, term7067.getClass(), "modCount", 0);
        setField(term7067, term7067.getClass(), "entrySet", null);
        setField(term7068, term7068.getClass(), "m", term7067);
        setField(term7067, term7067.getClass(), "navigableKeySet", term7068);
        setField(term7067, term7067.getClass(), "descendingMap", null);
        setField(term7067, term7067.getClass(), "keySet", null);
        setField(term7067, term7067.getClass(), "values", null);
        setField(term7066, term7066.getClass(), "properties", term7067);
        setBooleanField(term7066, term7066.getClass(), "isFrozen", false);
        setField(term7066, term7066.getClass(), "className", null);
        setField(term7066, term7066.getClass(), "properties", null);
        setBooleanField(term7066, term7066.getClass(), "nativeType", false);
        setField(term7066, term7066.getClass(), "implicitPrototypeFallback", null);
        setField(term7066, term7066.getClass(), "ownerFunction", null);
        setBooleanField(term7066, term7066.getClass(), "prettyPrint", false);
        setBooleanField(term7066, term7066.getClass(), "visited", false);
        setField(term7066, term7066.getClass(), "docInfo", null);
        setBooleanField(term7066, term7066.getClass(), "unknown", false);
        setBooleanField(term7066, term7066.getClass(), "resolved", false);
        setField(term7066, term7066.getClass(), "resolveResult", null);
        setField(term7066, term7066.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term7012;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term7012, term7066));
        assertTrue(recursiveEquals(retValue, true));
    }

};


