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

public class Period_weeks_49573248090 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99;
     Object term9670;

    public Period_weeks_49573248090() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99 = new Integer(-1179120542);
        term9670 = newInstance(Class.forName("org.joda.time.Period"));
        Object term9671 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term9682 = (Object[]) newArray("org.joda.time.DurationFieldType", 8);
        Object term9683 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term9686 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term9689 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term9692 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term9695 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term9698 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term9701 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term9704 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        int[] term9707 = (int[]) newIntArray(8);
        int[] term9716 = (int[]) newIntArray(8);
        setField(term9671, term9671.getClass(), "iName", "Standard");
        setByteField(term9683, term9683.getClass(), "iOrdinal", (byte) 4);
        setField(term9683, term9683.getClass(), "iName", "");
        setElement(term9682, 0, term9683);
        setByteField(term9686, term9686.getClass(), "iOrdinal", (byte) 5);
        setField(term9686, term9686.getClass(), "iName", "");
        setElement(term9682, 1, term9686);
        setByteField(term9689, term9689.getClass(), "iOrdinal", (byte) 6);
        setField(term9689, term9689.getClass(), "iName", "");
        setElement(term9682, 2, term9689);
        setByteField(term9692, term9692.getClass(), "iOrdinal", (byte) 7);
        setField(term9692, term9692.getClass(), "iName", "");
        setElement(term9682, 3, term9692);
        setByteField(term9695, term9695.getClass(), "iOrdinal", (byte) 9);
        setField(term9695, term9695.getClass(), "iName", "");
        setElement(term9682, 4, term9695);
        setByteField(term9698, term9698.getClass(), "iOrdinal", (byte) 10);
        setField(term9698, term9698.getClass(), "iName", "");
        setElement(term9682, 5, term9698);
        setByteField(term9701, term9701.getClass(), "iOrdinal", (byte) 11);
        setField(term9701, term9701.getClass(), "iName", "");
        setElement(term9682, 6, term9701);
        setByteField(term9704, term9704.getClass(), "iOrdinal", (byte) 12);
        setField(term9704, term9704.getClass(), "iName", "");
        setElement(term9682, 7, term9704);
        setField(term9671, term9671.getClass(), "iTypes", term9682);
        setIntElement(term9707, 1, 1);
        setIntElement(term9707, 2, 2);
        setIntElement(term9707, 3, 3);
        setIntElement(term9707, 4, 4);
        setIntElement(term9707, 5, 5);
        setIntElement(term9707, 6, 6);
        setIntElement(term9707, 7, 7);
        setField(term9671, term9671.getClass(), "iIndices", term9707);
        setField(term9670, term9670.getClass(), "iType", term9671);
        setIntElement(term9716, 2, -1179120542);
        setField(term9670, term9670.getClass(), "iValues", term9716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term99;
        Object retValue = callMethod(klass, "weeks", argTypes, null, args);
        assertTrue(recursiveEquals(term99, -1179120542));
        assertTrue(recursiveEquals(retValue, term9670));
    }

};


