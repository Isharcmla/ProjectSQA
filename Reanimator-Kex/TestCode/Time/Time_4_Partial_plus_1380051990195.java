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

public class Partial_plus_1380051990195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100795;
     Object term101081;
     Object term104612;
     Object term104617;
     Object term104120;

    public Partial_plus_1380051990195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100795 = newInstance(Class.forName("org.joda.time.Partial"));
        int[] term98731 = (int[]) newIntArray(489);
        Object[] term100201 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 4);
        Object term100915 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term101035 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntElement(term98731, 0, 536870912);
        setIntElement(term98731, 1, 1);
        setIntElement(term98731, 2, 1);
        setIntElement(term98731, 3, 1);
        setIntElement(term98731, 4, 1);
        setField(term100795, term100795.getClass(), "iValues", term98731);
        setField(term100915, term100915.getClass(), "iUnitType", null);
        setElement(term100201, 0, term100915);
        setField(term101035, term101035.getClass(), "iUnitType", null);
        setElement(term100201, 1, term101035);
        setElement(term100201, 2, term101035);
        setElement(term100201, 3, term101035);
        setField(term100795, term100795.getClass(), "iTypes", term100201);
        term101081 = newInstance(Class.forName("org.joda.time.Months"));
        term104612 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term104613 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 4);
        Object term104614 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term104615 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        int[] term104616 = (int[]) newIntArray(489);
        setField(term104612, term104612.getClass(), "iChronology", null);
        setByteField(term104614, term104614.getClass(), "iOrdinal", (byte) 0);
        setField(term104614, term104614.getClass(), "iUnitType", null);
        setField(term104614, term104614.getClass(), "iRangeType", null);
        setField(term104614, term104614.getClass(), "iName", null);
        setElement(term104613, 0, term104614);
        setByteField(term104615, term104615.getClass(), "iOrdinal", (byte) 0);
        setField(term104615, term104615.getClass(), "iUnitType", null);
        setField(term104615, term104615.getClass(), "iRangeType", null);
        setField(term104615, term104615.getClass(), "iName", null);
        setElement(term104613, 1, term104615);
        setElement(term104613, 2, term104615);
        setElement(term104613, 3, term104615);
        setField(term104612, term104612.getClass(), "iTypes", term104613);
        setIntElement(term104616, 0, 536870912);
        setIntElement(term104616, 1, 1);
        setIntElement(term104616, 2, 1);
        setIntElement(term104616, 3, 1);
        setIntElement(term104616, 4, 1);
        setField(term104612, term104612.getClass(), "iValues", term104616);
        setField(term104612, term104612.getClass(), "iFormatter", null);
        term104617 = newInstance(Class.forName("org.joda.time.Months"));
        setIntField(term104617, term104617.getClass(), "iPeriod", 0);
        term104120 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term104121 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 4);
        Object term102065 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term102067 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        int[] term104122 = (int[]) newIntArray(489);
        setField(term104120, term104120.getClass(), "iChronology", null);
        setByteField(term102065, term102065.getClass(), "iOrdinal", (byte) 0);
        setField(term102065, term102065.getClass(), "iUnitType", null);
        setField(term102065, term102065.getClass(), "iRangeType", null);
        setField(term102065, term102065.getClass(), "iName", null);
        setElement(term104121, 0, term102065);
        setByteField(term102067, term102067.getClass(), "iOrdinal", (byte) 0);
        setField(term102067, term102067.getClass(), "iUnitType", null);
        setField(term102067, term102067.getClass(), "iRangeType", null);
        setField(term102067, term102067.getClass(), "iName", null);
        setElement(term104121, 1, term102067);
        setElement(term104121, 2, term102067);
        setElement(term104121, 3, term102067);
        setField(term104120, term104120.getClass(), "iTypes", term104121);
        setIntElement(term104122, 0, 536870912);
        setIntElement(term104122, 1, 1);
        setIntElement(term104122, 2, 1);
        setIntElement(term104122, 3, 1);
        setIntElement(term104122, 4, 1);
        setField(term104120, term104120.getClass(), "iValues", term104122);
        setField(term104120, term104120.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.ReadablePeriod");
        Object[] args = new Object[1];
        args[0] = term101081;
        Object retValue = callMethod(klass, "plus", argTypes, term100795, args);
        assertTrue(recursiveEquals(term100795, term104612));
        assertTrue(recursiveEquals(term101081, term104617));
        assertTrue(recursiveEquals(retValue, term104120));
    }

};


