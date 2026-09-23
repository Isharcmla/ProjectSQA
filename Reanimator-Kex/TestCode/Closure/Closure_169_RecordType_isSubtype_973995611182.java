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

public class RecordType_isSubtype_973995611182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80140;
     Object term80196;

    public RecordType_isSubtype_973995611182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80140 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term80180 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term80140, term80140.getClass(), "properties", term80180);
        term80196 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term80197 = newInstance(Class.forName("java.util.TreeMap"));
        Object term80198 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term80197, term80197.getClass(), "comparator", null);
        setField(term80197, term80197.getClass(), "root", null);
        setIntField(term80197, term80197.getClass(), "size", 0);
        setIntField(term80197, term80197.getClass(), "modCount", 0);
        setField(term80197, term80197.getClass(), "entrySet", null);
        setField(term80198, term80198.getClass(), "m", term80197);
        setField(term80197, term80197.getClass(), "navigableKeySet", term80198);
        setField(term80197, term80197.getClass(), "descendingMap", null);
        setField(term80197, term80197.getClass(), "keySet", null);
        setField(term80197, term80197.getClass(), "values", null);
        setField(term80196, term80196.getClass(), "properties", term80197);
        setBooleanField(term80196, term80196.getClass(), "declared", false);
        setBooleanField(term80196, term80196.getClass(), "isFrozen", false);
        setField(term80196, term80196.getClass(), "className", null);
        setField(term80196, term80196.getClass(), "properties", null);
        setBooleanField(term80196, term80196.getClass(), "nativeType", false);
        setField(term80196, term80196.getClass(), "implicitPrototypeFallback", null);
        setField(term80196, term80196.getClass(), "ownerFunction", null);
        setBooleanField(term80196, term80196.getClass(), "prettyPrint", false);
        setBooleanField(term80196, term80196.getClass(), "visited", false);
        setField(term80196, term80196.getClass(), "docInfo", null);
        setBooleanField(term80196, term80196.getClass(), "unknown", false);
        setBooleanField(term80196, term80196.getClass(), "resolved", false);
        setField(term80196, term80196.getClass(), "resolveResult", null);
        setBooleanField(term80196, term80196.getClass(), "inTemplatedCheckVisit", false);
        setField(term80196, term80196.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term80140;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term80140, term80196));
        assertTrue(recursiveEquals(retValue, true));
    }

};


