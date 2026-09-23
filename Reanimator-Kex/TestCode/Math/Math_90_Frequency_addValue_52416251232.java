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
import java.lang.Integer;
import java.lang.Long;

public class Frequency_addValue_52416251232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16;
     Object term20;
     Object term899;
     Object term904;

    public Frequency_addValue_52416251232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term17 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term17, term17.getClass(), "comparator", null);
        setField(term17, term17.getClass(), "root", null);
        setIntField(term17, term17.getClass(), "size", 0);
        setIntField(term17, term17.getClass(), "modCount", 0);
        setField(term17, term17.getClass(), "entrySet", null);
        setField(term17, term17.getClass(), "navigableKeySet", null);
        setField(term17, term17.getClass(), "descendingMap", null);
        setField(term17, term17.getClass(), "keySet", null);
        setField(term17, term17.getClass(), "values", null);
        setField(term16, term16.getClass(), "freqTable", term17);
        term20 = new Integer(568599855);
        Long term902 = new Long(568599855L);
        Long term903 = new Long(1L);
        term899 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term900 = newInstance(Class.forName("java.util.TreeMap"));
        Object term901 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term900, term900.getClass(), "comparator", null);
        setField(term901, term901.getClass(), "key", term902);
        setField(term901, term901.getClass(), "value", term903);
        setField(term901, term901.getClass(), "left", null);
        setField(term901, term901.getClass(), "right", null);
        setField(term901, term901.getClass(), "parent", null);
        setBooleanField(term901, term901.getClass(), "color", true);
        setField(term900, term900.getClass(), "root", term901);
        setIntField(term900, term900.getClass(), "size", 1);
        setIntField(term900, term900.getClass(), "modCount", 1);
        setField(term900, term900.getClass(), "entrySet", null);
        setField(term900, term900.getClass(), "navigableKeySet", null);
        setField(term900, term900.getClass(), "descendingMap", null);
        setField(term900, term900.getClass(), "keySet", null);
        setField(term900, term900.getClass(), "values", null);
        setField(term899, term899.getClass(), "freqTable", term900);
        term904 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term20;
        callMethod(klass, "addValue", argTypes, term16, args);
        assertTrue(recursiveEquals(term16, term899));
        assertTrue(recursiveEquals(term20, term904));
    }

};


