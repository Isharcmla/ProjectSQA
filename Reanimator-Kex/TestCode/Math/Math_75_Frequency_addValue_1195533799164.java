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
import java.lang.String;
import java.lang.Long;

public class Frequency_addValue_1195533799164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29571;
     Object enum3;
     Object term30365;
     Object enum5;

    public Frequency_addValue_1195533799164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29571 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term29611 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term29571, term29571.getClass(), "freqTable", term29611);
        Class<? extends Object> term30374 = Class.forName((String) "java.nio.file.attribute.PosixFilePermission");
        Field term30373 = ((Class) term30374).getDeclaredField((String) "OWNER_READ");
        ((Field) term30373).setAccessible(true);
        enum3 = ((Field) term30373).get((Object) null);
        Class<? extends Object> term30626 = Class.forName((String) "java.nio.file.attribute.PosixFilePermission");
        Field term30625 = ((Class) term30626).getDeclaredField((String) "GROUP_EXECUTE");
        ((Field) term30625).setAccessible(true);
        Object enum4 = ((Field) term30625).get((Object) null);
        Long term30370 = new Long(1L);
        term30365 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term30366 = newInstance(Class.forName("java.util.TreeMap"));
        Object term30367 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term30366, term30366.getClass(), "comparator", null);
        setField(term30367, term30367.getClass(), "key", enum4);
        setField(term30367, term30367.getClass(), "value", term30370);
        setField(term30367, term30367.getClass(), "left", null);
        setField(term30367, term30367.getClass(), "right", null);
        setField(term30367, term30367.getClass(), "parent", null);
        setBooleanField(term30367, term30367.getClass(), "color", true);
        setField(term30366, term30366.getClass(), "root", term30367);
        setIntField(term30366, term30366.getClass(), "size", 1);
        setIntField(term30366, term30366.getClass(), "modCount", 1);
        setField(term30366, term30366.getClass(), "entrySet", null);
        setField(term30366, term30366.getClass(), "navigableKeySet", null);
        setField(term30366, term30366.getClass(), "descendingMap", null);
        setField(term30366, term30366.getClass(), "keySet", null);
        setField(term30366, term30366.getClass(), "values", null);
        setField(term30365, term30365.getClass(), "freqTable", term30366);
        Class<? extends Object> term30887 = Class.forName((String) "java.nio.file.attribute.PosixFilePermission");
        Field term30886 = ((Class) term30887).getDeclaredField((String) "GROUP_READ");
        ((Field) term30886).setAccessible(true);
        enum5 = ((Field) term30886).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = enum3;
        callMethod(klass, "addValue", argTypes, term29571, args);
        assertTrue(recursiveEquals(term29571, term30365));
        assertTrue(recursiveEquals(enum3, enum5));
    }

};


