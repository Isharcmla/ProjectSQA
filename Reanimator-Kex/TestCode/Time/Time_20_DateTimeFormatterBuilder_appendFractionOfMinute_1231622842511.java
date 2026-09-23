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
import java.lang.Object;
import java.util.ArrayList;

public class DateTimeFormatterBuilder_appendFractionOfMinute_1231622842511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101537;
     Object term101695;
     Object term101676;

    public DateTimeFormatterBuilder_appendFractionOfMinute_1231622842511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term101627 = new ArrayList();
        term101537 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term101575 = newInstance(Class.forName("java.lang.Object"));
        setField(term101537, term101537.getClass(), "iFormatter", term101575);
        setField(term101537, term101537.getClass(), "iElementPairs", term101627);
        Object term101698 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Fraction"));
        Object term101699 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term101699, term101699.getClass(), "iOrdinal", (byte) 18);
        setField(term101699, term101699.getClass(), "iUnitType", null);
        setField(term101699, term101699.getClass(), "iRangeType", null);
        setField(term101699, term101699.getClass(), "iName", null);
        setField(term101698, term101698.getClass(), "iFieldType", term101699);
        setIntField(term101698, term101698.getClass(), "iMinDigits", 0);
        setIntField(term101698, term101698.getClass(), "iMaxDigits", 18);
        ArrayList term101696 = new ArrayList();
        ((ArrayList) term101696).add(term101698);
        ((ArrayList) term101696).add(term101698);
        term101695 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term101695, term101695.getClass(), "iElementPairs", term101696);
        setField(term101695, term101695.getClass(), "iFormatter", null);
        Object term101679 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Fraction"));
        Object term101680 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term101680, term101680.getClass(), "iOrdinal", (byte) 18);
        setField(term101680, term101680.getClass(), "iUnitType", null);
        setField(term101680, term101680.getClass(), "iRangeType", null);
        setField(term101680, term101680.getClass(), "iName", null);
        setField(term101679, term101679.getClass(), "iFieldType", term101680);
        setIntField(term101679, term101679.getClass(), "iMinDigits", 0);
        setIntField(term101679, term101679.getClass(), "iMaxDigits", 18);
        ArrayList term101677 = new ArrayList();
        ((ArrayList) term101677).add(term101679);
        ((ArrayList) term101677).add(term101679);
        term101676 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term101676, term101676.getClass(), "iElementPairs", term101677);
        setField(term101676, term101676.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = 19;
        Object retValue = callMethod(klass, "appendFractionOfMinute", argTypes, term101537, args);
        assertTrue(recursiveEquals(term101537, term101695));
        assertTrue(recursiveEquals(retValue, term101676));
    }

};


