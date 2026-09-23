package org.apache.commons.math.stat;

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
import static org.apache.commons.math.stat.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.stat.EqualityUtils.*;
import java.lang.Object;

public class Frequency_valuesIterator_157145659044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42;
     Object term1225;
     Object term1218;

    public Frequency_valuesIterator_157145659044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term43 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term43, term43.getClass(), "comparator", null);
        setField(term43, term43.getClass(), "root", null);
        setIntField(term43, term43.getClass(), "size", 0);
        setIntField(term43, term43.getClass(), "modCount", 0);
        setField(term43, term43.getClass(), "entrySet", null);
        setField(term43, term43.getClass(), "navigableKeySet", null);
        setField(term43, term43.getClass(), "descendingMap", null);
        setField(term43, term43.getClass(), "keySet", null);
        setField(term43, term43.getClass(), "values", null);
        setField(term42, term42.getClass(), "freqTable", term43);
        term1225 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term1226 = newInstance(Class.forName("java.util.TreeMap"));
        Object term1227 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term1226, term1226.getClass(), "comparator", null);
        setField(term1226, term1226.getClass(), "root", null);
        setIntField(term1226, term1226.getClass(), "size", 0);
        setIntField(term1226, term1226.getClass(), "modCount", 0);
        setField(term1226, term1226.getClass(), "entrySet", null);
        setField(term1227, term1227.getClass(), "m", term1226);
        setField(term1226, term1226.getClass(), "navigableKeySet", term1227);
        setField(term1226, term1226.getClass(), "descendingMap", null);
        setField(term1226, term1226.getClass(), "keySet", null);
        setField(term1226, term1226.getClass(), "values", null);
        setField(term1225, term1225.getClass(), "freqTable", term1226);
        term1218 = newInstance(Class.forName("java.util.TreeMap$KeyIterator"));
        Object term1219 = newInstance(Class.forName("java.util.TreeMap"));
        Object term1222 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term1219, term1219.getClass(), "comparator", null);
        setField(term1219, term1219.getClass(), "root", null);
        setIntField(term1219, term1219.getClass(), "size", 0);
        setIntField(term1219, term1219.getClass(), "modCount", 0);
        setField(term1219, term1219.getClass(), "entrySet", null);
        setField(term1222, term1222.getClass(), "m", term1219);
        setField(term1219, term1219.getClass(), "navigableKeySet", term1222);
        setField(term1219, term1219.getClass(), "descendingMap", null);
        setField(term1219, term1219.getClass(), "keySet", null);
        setField(term1219, term1219.getClass(), "values", null);
        setField(term1218, term1218.getClass(), "this$0", term1219);
        setField(term1218, term1218.getClass(), "next", null);
        setField(term1218, term1218.getClass(), "lastReturned", null);
        setIntField(term1218, term1218.getClass(), "expectedModCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "valuesIterator", argTypes, term42, args);
        assertTrue(recursiveEquals(term42, term1225));
        assertTrue(recursiveEquals(retValue, term1218));
    }

};


