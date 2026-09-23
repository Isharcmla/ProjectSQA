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

public class Period_millis_214480984995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109;
     Object term10835;

    public Period_millis_214480984995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109 = new Integer(-1530420153);
        term10835 = newInstance(Class.forName("org.joda.time.Period"));
        Object term10836 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term10847 = (Object[]) newArray("org.joda.time.DurationFieldType", 8);
        Object term10848 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term10851 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term10854 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term10857 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term10860 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term10863 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term10866 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term10869 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        int[] term10872 = (int[]) newIntArray(8);
        int[] term10881 = (int[]) newIntArray(8);
        setField(term10836, term10836.getClass(), "iName", "Standard");
        setByteField(term10848, term10848.getClass(), "iOrdinal", (byte) 4);
        setField(term10848, term10848.getClass(), "iName", "");
        setElement(term10847, 0, term10848);
        setByteField(term10851, term10851.getClass(), "iOrdinal", (byte) 5);
        setField(term10851, term10851.getClass(), "iName", "");
        setElement(term10847, 1, term10851);
        setByteField(term10854, term10854.getClass(), "iOrdinal", (byte) 6);
        setField(term10854, term10854.getClass(), "iName", "");
        setElement(term10847, 2, term10854);
        setByteField(term10857, term10857.getClass(), "iOrdinal", (byte) 7);
        setField(term10857, term10857.getClass(), "iName", "");
        setElement(term10847, 3, term10857);
        setByteField(term10860, term10860.getClass(), "iOrdinal", (byte) 9);
        setField(term10860, term10860.getClass(), "iName", "");
        setElement(term10847, 4, term10860);
        setByteField(term10863, term10863.getClass(), "iOrdinal", (byte) 10);
        setField(term10863, term10863.getClass(), "iName", "");
        setElement(term10847, 5, term10863);
        setByteField(term10866, term10866.getClass(), "iOrdinal", (byte) 11);
        setField(term10866, term10866.getClass(), "iName", "");
        setElement(term10847, 6, term10866);
        setByteField(term10869, term10869.getClass(), "iOrdinal", (byte) 12);
        setField(term10869, term10869.getClass(), "iName", "");
        setElement(term10847, 7, term10869);
        setField(term10836, term10836.getClass(), "iTypes", term10847);
        setIntElement(term10872, 1, 1);
        setIntElement(term10872, 2, 2);
        setIntElement(term10872, 3, 3);
        setIntElement(term10872, 4, 4);
        setIntElement(term10872, 5, 5);
        setIntElement(term10872, 6, 6);
        setIntElement(term10872, 7, 7);
        setField(term10836, term10836.getClass(), "iIndices", term10872);
        setField(term10835, term10835.getClass(), "iType", term10836);
        setIntElement(term10881, 7, -1530420153);
        setField(term10835, term10835.getClass(), "iValues", term10881);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term109;
        Object retValue = callMethod(klass, "millis", argTypes, null, args);
        assertTrue(recursiveEquals(term109, -1530420153));
        assertTrue(recursiveEquals(retValue, term10835));
    }

};


