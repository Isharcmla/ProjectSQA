package org.joda.time.format;

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
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.format.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class DateTimeFormatterBuilder_appendDayOfWeekText_132104217131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term476;
     Object term11053;
     Object term11037;

    public DateTimeFormatterBuilder_appendDayOfWeekText_132104217131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term477 = new ArrayList();
        term476 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term481 = newInstance(Class.forName("java.lang.Object"));
        setField(term476, term476.getClass(), "iElementPairs", term477);
        setField(term476, term476.getClass(), "iFormatter", term481);
        Object term11056 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TextField"));
        Object term11057 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term11057, term11057.getClass(), "iOrdinal", (byte) 12);
        setField(term11057, term11057.getClass(), "iUnitType", null);
        setField(term11057, term11057.getClass(), "iRangeType", null);
        setField(term11057, term11057.getClass(), "iName", null);
        setField(term11056, term11056.getClass(), "iFieldType", term11057);
        setBooleanField(term11056, term11056.getClass(), "iShort", false);
        ArrayList term11054 = new ArrayList();
        ((ArrayList) term11054).add(term11056);
        ((ArrayList) term11054).add(term11056);
        term11053 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term11053, term11053.getClass(), "iElementPairs", term11054);
        setField(term11053, term11053.getClass(), "iFormatter", null);
        Object term11040 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TextField"));
        Object term11041 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term11041, term11041.getClass(), "iOrdinal", (byte) 12);
        setField(term11041, term11041.getClass(), "iUnitType", null);
        setField(term11041, term11041.getClass(), "iRangeType", null);
        setField(term11041, term11041.getClass(), "iName", null);
        setField(term11040, term11040.getClass(), "iFieldType", term11041);
        setBooleanField(term11040, term11040.getClass(), "iShort", false);
        ArrayList term11038 = new ArrayList();
        ((ArrayList) term11038).add(term11040);
        ((ArrayList) term11038).add(term11040);
        term11037 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term11037, term11037.getClass(), "iElementPairs", term11038);
        setField(term11037, term11037.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "appendDayOfWeekText", argTypes, term476, args);
        assertTrue(recursiveEquals(term476, term11053));
        assertTrue(recursiveEquals(retValue, term11037));
    }

};


