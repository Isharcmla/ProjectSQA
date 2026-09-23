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

public class DateTimeFormatterBuilder_appendMonthOfYearText_432188678133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term488;
     Object term11175;
     Object term11159;

    public DateTimeFormatterBuilder_appendMonthOfYearText_432188678133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term489 = new ArrayList();
        term488 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term493 = newInstance(Class.forName("java.lang.Object"));
        setField(term488, term488.getClass(), "iElementPairs", term489);
        setField(term488, term488.getClass(), "iFormatter", term493);
        Object term11178 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TextField"));
        Object term11179 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term11179, term11179.getClass(), "iOrdinal", (byte) 7);
        setField(term11179, term11179.getClass(), "iUnitType", null);
        setField(term11179, term11179.getClass(), "iRangeType", null);
        setField(term11179, term11179.getClass(), "iName", null);
        setField(term11178, term11178.getClass(), "iFieldType", term11179);
        setBooleanField(term11178, term11178.getClass(), "iShort", false);
        ArrayList term11176 = new ArrayList();
        ((ArrayList) term11176).add(term11178);
        ((ArrayList) term11176).add(term11178);
        term11175 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term11175, term11175.getClass(), "iElementPairs", term11176);
        setField(term11175, term11175.getClass(), "iFormatter", null);
        Object term11162 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TextField"));
        Object term11163 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term11163, term11163.getClass(), "iOrdinal", (byte) 7);
        setField(term11163, term11163.getClass(), "iUnitType", null);
        setField(term11163, term11163.getClass(), "iRangeType", null);
        setField(term11163, term11163.getClass(), "iName", null);
        setField(term11162, term11162.getClass(), "iFieldType", term11163);
        setBooleanField(term11162, term11162.getClass(), "iShort", false);
        ArrayList term11160 = new ArrayList();
        ((ArrayList) term11160).add(term11162);
        ((ArrayList) term11160).add(term11162);
        term11159 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term11159, term11159.getClass(), "iElementPairs", term11160);
        setField(term11159, term11159.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "appendMonthOfYearText", argTypes, term488, args);
        assertTrue(recursiveEquals(term488, term11175));
        assertTrue(recursiveEquals(retValue, term11159));
    }

};


