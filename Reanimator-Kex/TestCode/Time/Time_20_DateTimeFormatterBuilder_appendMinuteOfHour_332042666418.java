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

public class DateTimeFormatterBuilder_appendMinuteOfHour_332042666418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66437;
     Object term66816;
     Object term66796;

    public DateTimeFormatterBuilder_appendMinuteOfHour_332042666418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term66527 = new ArrayList();
        term66437 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term66475 = newInstance(Class.forName("java.lang.Object"));
        setField(term66437, term66437.getClass(), "iFormatter", term66475);
        setField(term66437, term66437.getClass(), "iElementPairs", term66527);
        Object term66819 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object term66820 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term66820, term66820.getClass(), "iOrdinal", (byte) 19);
        setField(term66820, term66820.getClass(), "iUnitType", null);
        setField(term66820, term66820.getClass(), "iRangeType", null);
        setField(term66820, term66820.getClass(), "iName", null);
        setField(term66819, term66819.getClass(), "iFieldType", term66820);
        setIntField(term66819, term66819.getClass(), "iMaxParsedDigits", 2);
        setBooleanField(term66819, term66819.getClass(), "iSigned", false);
        ArrayList term66817 = new ArrayList();
        ((ArrayList) term66817).add(term66819);
        ((ArrayList) term66817).add(term66819);
        term66816 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term66816, term66816.getClass(), "iElementPairs", term66817);
        setField(term66816, term66816.getClass(), "iFormatter", null);
        Object term66799 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object term66800 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term66800, term66800.getClass(), "iOrdinal", (byte) 19);
        setField(term66800, term66800.getClass(), "iUnitType", null);
        setField(term66800, term66800.getClass(), "iRangeType", null);
        setField(term66800, term66800.getClass(), "iName", null);
        setField(term66799, term66799.getClass(), "iFieldType", term66800);
        setIntField(term66799, term66799.getClass(), "iMaxParsedDigits", 2);
        setBooleanField(term66799, term66799.getClass(), "iSigned", false);
        ArrayList term66797 = new ArrayList();
        ((ArrayList) term66797).add(term66799);
        ((ArrayList) term66797).add(term66799);
        term66796 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term66796, term66796.getClass(), "iElementPairs", term66797);
        setField(term66796, term66796.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "appendMinuteOfHour", argTypes, term66437, args);
        assertTrue(recursiveEquals(term66437, term66816));
        assertTrue(recursiveEquals(retValue, term66796));
    }

};


