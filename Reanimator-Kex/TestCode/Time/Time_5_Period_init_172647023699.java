package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.EqualityUtils.*;
import java.lang.Integer;
import java.lang.Object;

public class Period_init_172647023699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119;
     Object term121;
     Object term123;
     Object term125;
     Object term127;
     Object term129;
     Object term131;
     Object term133;
     Object term18247;

    public Period_init_172647023699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119 = new Integer(767834723);
        term121 = new Integer(-602026508);
        term123 = new Integer(-157887805);
        term125 = new Integer(1876565163);
        term127 = new Integer(-817164822);
        term129 = new Integer(-1016503459);
        term131 = new Integer(-1968847291);
        term133 = new Integer(579005622);
        term18247 = newInstance(Class.forName("org.joda.time.Period"));
        Object term18248 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term18251 = (Object[]) newArray("org.joda.time.DurationFieldType", 8);
        Object term18252 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term18254 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term18256 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term18258 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term18260 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term18262 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term18264 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term18266 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        int[] term18268 = (int[]) newIntArray(8);
        int[] term18269 = (int[]) newIntArray(8);
        setField(term18248, term18248.getClass(), "iName", "Standard");
        setByteField(term18252, term18252.getClass(), "iOrdinal", (byte) 4);
        setField(term18252, term18252.getClass(), "iName", "");
        setElement(term18251, 0, term18252);
        setByteField(term18254, term18254.getClass(), "iOrdinal", (byte) 5);
        setField(term18254, term18254.getClass(), "iName", "");
        setElement(term18251, 1, term18254);
        setByteField(term18256, term18256.getClass(), "iOrdinal", (byte) 6);
        setField(term18256, term18256.getClass(), "iName", "");
        setElement(term18251, 2, term18256);
        setByteField(term18258, term18258.getClass(), "iOrdinal", (byte) 7);
        setField(term18258, term18258.getClass(), "iName", "");
        setElement(term18251, 3, term18258);
        setByteField(term18260, term18260.getClass(), "iOrdinal", (byte) 9);
        setField(term18260, term18260.getClass(), "iName", "");
        setElement(term18251, 4, term18260);
        setByteField(term18262, term18262.getClass(), "iOrdinal", (byte) 10);
        setField(term18262, term18262.getClass(), "iName", "");
        setElement(term18251, 5, term18262);
        setByteField(term18264, term18264.getClass(), "iOrdinal", (byte) 11);
        setField(term18264, term18264.getClass(), "iName", "");
        setElement(term18251, 6, term18264);
        setByteField(term18266, term18266.getClass(), "iOrdinal", (byte) 12);
        setField(term18266, term18266.getClass(), "iName", "");
        setElement(term18251, 7, term18266);
        setField(term18248, term18248.getClass(), "iTypes", term18251);
        setIntElement(term18268, 1, 1);
        setIntElement(term18268, 2, 2);
        setIntElement(term18268, 3, 3);
        setIntElement(term18268, 4, 4);
        setIntElement(term18268, 5, 5);
        setIntElement(term18268, 6, 6);
        setIntElement(term18268, 7, 7);
        setField(term18248, term18248.getClass(), "iIndices", term18268);
        setField(term18247, term18247.getClass(), "iType", term18248);
        setIntElement(term18269, 0, 767834723);
        setIntElement(term18269, 1, -602026508);
        setIntElement(term18269, 2, -157887805);
        setIntElement(term18269, 3, 1876565163);
        setIntElement(term18269, 4, -817164822);
        setIntElement(term18269, 5, -1016503459);
        setIntElement(term18269, 6, -1968847291);
        setIntElement(term18269, 7, 579005622);
        setField(term18247, term18247.getClass(), "iValues", term18269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        Object[] args = new Object[8];
        args[0] = term119;
        args[1] = term121;
        args[2] = term123;
        args[3] = term125;
        args[4] = term127;
        args[5] = term129;
        args[6] = term131;
        args[7] = term133;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term18247));
        assertTrue(recursiveEquals(term119, 767834723));
        assertTrue(recursiveEquals(term121, -602026508));
        assertTrue(recursiveEquals(term123, -157887805));
        assertTrue(recursiveEquals(term125, 1876565163));
        assertTrue(recursiveEquals(term127, -817164822));
        assertTrue(recursiveEquals(term129, -1016503459));
        assertTrue(recursiveEquals(term131, -1968847291));
        assertTrue(recursiveEquals(term133, 579005622));
    }

};


