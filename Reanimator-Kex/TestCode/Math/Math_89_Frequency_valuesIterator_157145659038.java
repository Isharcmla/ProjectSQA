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

public class Frequency_valuesIterator_157145659038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42;
     Object term984;
     Object term977;

    public Frequency_valuesIterator_157145659038() {
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
        term984 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term985 = newInstance(Class.forName("java.util.TreeMap"));
        Object term986 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term985, term985.getClass(), "comparator", null);
        setField(term985, term985.getClass(), "root", null);
        setIntField(term985, term985.getClass(), "size", 0);
        setIntField(term985, term985.getClass(), "modCount", 0);
        setField(term985, term985.getClass(), "entrySet", null);
        setField(term986, term986.getClass(), "m", term985);
        setField(term985, term985.getClass(), "navigableKeySet", term986);
        setField(term985, term985.getClass(), "descendingMap", null);
        setField(term985, term985.getClass(), "keySet", null);
        setField(term985, term985.getClass(), "values", null);
        setField(term984, term984.getClass(), "freqTable", term985);
        term977 = newInstance(Class.forName("java.util.TreeMap$KeyIterator"));
        Object term978 = newInstance(Class.forName("java.util.TreeMap"));
        Object term981 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term978, term978.getClass(), "comparator", null);
        setField(term978, term978.getClass(), "root", null);
        setIntField(term978, term978.getClass(), "size", 0);
        setIntField(term978, term978.getClass(), "modCount", 0);
        setField(term978, term978.getClass(), "entrySet", null);
        setField(term981, term981.getClass(), "m", term978);
        setField(term978, term978.getClass(), "navigableKeySet", term981);
        setField(term978, term978.getClass(), "descendingMap", null);
        setField(term978, term978.getClass(), "keySet", null);
        setField(term978, term978.getClass(), "values", null);
        setField(term977, term977.getClass(), "this$0", term978);
        setField(term977, term977.getClass(), "next", null);
        setField(term977, term977.getClass(), "lastReturned", null);
        setIntField(term977, term977.getClass(), "expectedModCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "valuesIterator", argTypes, term42, args);
        assertTrue(recursiveEquals(term42, term984));
        assertTrue(recursiveEquals(retValue, term977));
    }

};


