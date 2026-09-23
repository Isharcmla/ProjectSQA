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

public class RecordType_isSubtype_1383543061114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29294;
     Object term29430;
     Object term29507;
     Object term29510;

    public RecordType_isSubtype_1383543061114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29294 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term29334 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term29294, term29294.getClass(), "properties", term29334);
        term29430 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term29470 = newInstance(Class.forName("java.util.TreeMap"));
        setBooleanField(term29430, term29430.getClass(), "unknown", false);
        setField(term29430, term29430.getClass(), "properties", term29470);
        term29507 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term29508 = newInstance(Class.forName("java.util.TreeMap"));
        Object term29509 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term29508, term29508.getClass(), "comparator", null);
        setField(term29508, term29508.getClass(), "root", null);
        setIntField(term29508, term29508.getClass(), "size", 0);
        setIntField(term29508, term29508.getClass(), "modCount", 0);
        setField(term29508, term29508.getClass(), "entrySet", null);
        setField(term29509, term29509.getClass(), "m", term29508);
        setField(term29508, term29508.getClass(), "navigableKeySet", term29509);
        setField(term29508, term29508.getClass(), "descendingMap", null);
        setField(term29508, term29508.getClass(), "keySet", null);
        setField(term29508, term29508.getClass(), "values", null);
        setField(term29507, term29507.getClass(), "properties", term29508);
        setBooleanField(term29507, term29507.getClass(), "isFrozen", false);
        setField(term29507, term29507.getClass(), "className", null);
        setField(term29507, term29507.getClass(), "properties", null);
        setBooleanField(term29507, term29507.getClass(), "nativeType", false);
        setField(term29507, term29507.getClass(), "implicitPrototypeFallback", null);
        setField(term29507, term29507.getClass(), "ownerFunction", null);
        setBooleanField(term29507, term29507.getClass(), "prettyPrint", false);
        setBooleanField(term29507, term29507.getClass(), "visited", false);
        setField(term29507, term29507.getClass(), "docInfo", null);
        setBooleanField(term29507, term29507.getClass(), "unknown", false);
        setBooleanField(term29507, term29507.getClass(), "resolved", false);
        setField(term29507, term29507.getClass(), "resolveResult", null);
        setField(term29507, term29507.getClass(), "registry", null);
        term29510 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term29511 = newInstance(Class.forName("java.util.TreeMap"));
        Object term29512 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term29511, term29511.getClass(), "comparator", null);
        setField(term29511, term29511.getClass(), "root", null);
        setIntField(term29511, term29511.getClass(), "size", 0);
        setIntField(term29511, term29511.getClass(), "modCount", 0);
        setField(term29511, term29511.getClass(), "entrySet", null);
        setField(term29512, term29512.getClass(), "m", term29511);
        setField(term29511, term29511.getClass(), "navigableKeySet", term29512);
        setField(term29511, term29511.getClass(), "descendingMap", null);
        setField(term29511, term29511.getClass(), "keySet", null);
        setField(term29511, term29511.getClass(), "values", null);
        setField(term29510, term29510.getClass(), "properties", term29511);
        setBooleanField(term29510, term29510.getClass(), "isFrozen", false);
        setField(term29510, term29510.getClass(), "className", null);
        setField(term29510, term29510.getClass(), "properties", null);
        setBooleanField(term29510, term29510.getClass(), "nativeType", false);
        setField(term29510, term29510.getClass(), "implicitPrototypeFallback", null);
        setField(term29510, term29510.getClass(), "ownerFunction", null);
        setBooleanField(term29510, term29510.getClass(), "prettyPrint", false);
        setBooleanField(term29510, term29510.getClass(), "visited", false);
        setField(term29510, term29510.getClass(), "docInfo", null);
        setBooleanField(term29510, term29510.getClass(), "unknown", false);
        setBooleanField(term29510, term29510.getClass(), "resolved", false);
        setField(term29510, term29510.getClass(), "resolveResult", null);
        setField(term29510, term29510.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term29430;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term29294, args);
        assertTrue(recursiveEquals(term29294, term29507));
        assertTrue(recursiveEquals(term29430, term29510));
        assertTrue(recursiveEquals(retValue, true));
    }

};


