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

public class RecordType_checkRecordEquivalenceHelper_19349152148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65640;
     Object term65776;
     Object term65847;
     Object term65850;

    public RecordType_checkRecordEquivalenceHelper_19349152148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65640 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term65680 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term65640, term65640.getClass(), "properties", term65680);
        term65776 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term65816 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term65776, term65776.getClass(), "properties", term65816);
        term65847 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term65848 = newInstance(Class.forName("java.util.TreeMap"));
        Object term65849 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term65848, term65848.getClass(), "comparator", null);
        setField(term65848, term65848.getClass(), "root", null);
        setIntField(term65848, term65848.getClass(), "size", 0);
        setIntField(term65848, term65848.getClass(), "modCount", 0);
        setField(term65848, term65848.getClass(), "entrySet", null);
        setField(term65849, term65849.getClass(), "m", term65848);
        setField(term65848, term65848.getClass(), "navigableKeySet", term65849);
        setField(term65848, term65848.getClass(), "descendingMap", null);
        setField(term65848, term65848.getClass(), "keySet", null);
        setField(term65848, term65848.getClass(), "values", null);
        setField(term65847, term65847.getClass(), "properties", term65848);
        setBooleanField(term65847, term65847.getClass(), "declared", false);
        setBooleanField(term65847, term65847.getClass(), "isFrozen", false);
        setField(term65847, term65847.getClass(), "className", null);
        setField(term65847, term65847.getClass(), "properties", null);
        setBooleanField(term65847, term65847.getClass(), "nativeType", false);
        setField(term65847, term65847.getClass(), "implicitPrototypeFallback", null);
        setField(term65847, term65847.getClass(), "ownerFunction", null);
        setBooleanField(term65847, term65847.getClass(), "prettyPrint", false);
        setBooleanField(term65847, term65847.getClass(), "visited", false);
        setField(term65847, term65847.getClass(), "docInfo", null);
        setBooleanField(term65847, term65847.getClass(), "unknown", false);
        setBooleanField(term65847, term65847.getClass(), "resolved", false);
        setField(term65847, term65847.getClass(), "resolveResult", null);
        setBooleanField(term65847, term65847.getClass(), "inTemplatedCheckVisit", false);
        setField(term65847, term65847.getClass(), "registry", null);
        term65850 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term65851 = newInstance(Class.forName("java.util.TreeMap"));
        Object term65852 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term65851, term65851.getClass(), "comparator", null);
        setField(term65851, term65851.getClass(), "root", null);
        setIntField(term65851, term65851.getClass(), "size", 0);
        setIntField(term65851, term65851.getClass(), "modCount", 0);
        setField(term65851, term65851.getClass(), "entrySet", null);
        setField(term65852, term65852.getClass(), "m", term65851);
        setField(term65851, term65851.getClass(), "navigableKeySet", term65852);
        setField(term65851, term65851.getClass(), "descendingMap", null);
        setField(term65851, term65851.getClass(), "keySet", null);
        setField(term65851, term65851.getClass(), "values", null);
        setField(term65850, term65850.getClass(), "properties", term65851);
        setBooleanField(term65850, term65850.getClass(), "declared", false);
        setBooleanField(term65850, term65850.getClass(), "isFrozen", false);
        setField(term65850, term65850.getClass(), "className", null);
        setField(term65850, term65850.getClass(), "properties", null);
        setBooleanField(term65850, term65850.getClass(), "nativeType", false);
        setField(term65850, term65850.getClass(), "implicitPrototypeFallback", null);
        setField(term65850, term65850.getClass(), "ownerFunction", null);
        setBooleanField(term65850, term65850.getClass(), "prettyPrint", false);
        setBooleanField(term65850, term65850.getClass(), "visited", false);
        setField(term65850, term65850.getClass(), "docInfo", null);
        setBooleanField(term65850, term65850.getClass(), "unknown", false);
        setBooleanField(term65850, term65850.getClass(), "resolved", false);
        setField(term65850, term65850.getClass(), "resolveResult", null);
        setBooleanField(term65850, term65850.getClass(), "inTemplatedCheckVisit", false);
        setField(term65850, term65850.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term65776;
        args[1] = false;
        Object retValue = callMethod(klass, "checkRecordEquivalenceHelper", argTypes, term65640, args);
        assertTrue(recursiveEquals(term65640, term65847));
        assertTrue(recursiveEquals(term65776, term65850));
        assertTrue(recursiveEquals(retValue, true));
    }

};


