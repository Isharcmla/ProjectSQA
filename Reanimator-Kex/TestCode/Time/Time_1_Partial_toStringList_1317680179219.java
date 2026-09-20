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
import java.lang.Object;

public class Partial_toStringList_1317680179219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106862;
     Object term107390;

    public Partial_toStringList_1317680179219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106862 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term106398 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 2);
        Object term106982 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term107140 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        int[] term106667 = (int[]) newIntArray(106);
        setField(term106982, term106982.getClass(), "iName", "");
        setElement(term106398, 0, term106982);
        setElement(term106398, 1, term107140);
        setField(term106862, term106862.getClass(), "iTypes", term106398);
        setField(term106862, term106862.getClass(), "iValues", term106667);
        term107390 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term107391 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 2);
        Object term107392 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term107395 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        int[] term107396 = (int[]) newIntArray(106);
        setField(term107390, term107390.getClass(), "iChronology", null);
        setByteField(term107392, term107392.getClass(), "iOrdinal", (byte) 0);
        setField(term107392, term107392.getClass(), "iUnitType", null);
        setField(term107392, term107392.getClass(), "iRangeType", null);
        setField(term107392, term107392.getClass(), "iName", "");
        setElement(term107391, 0, term107392);
        setByteField(term107395, term107395.getClass(), "iOrdinal", (byte) 0);
        setField(term107395, term107395.getClass(), "iUnitType", null);
        setField(term107395, term107395.getClass(), "iRangeType", null);
        setField(term107395, term107395.getClass(), "iName", null);
        setElement(term107391, 1, term107395);
        setField(term107390, term107390.getClass(), "iTypes", term107391);
        setField(term107390, term107390.getClass(), "iValues", term107396);
        setField(term107390, term107390.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toStringList", argTypes, term106862, args);
        assertTrue(recursiveEquals(term106862, term107390));
        assertTrue(recursiveEquals(retValue, "[=0, null=0]"));
    }

};
