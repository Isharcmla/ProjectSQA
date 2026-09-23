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

public class DateTimeFormatterBuilder_appendHourOfHalfday_189972139375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58450;
     Object term58974;
     Object term58953;

    public DateTimeFormatterBuilder_appendHourOfHalfday_189972139375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term58540 = new ArrayList();
        term58450 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term58488 = newInstance(Class.forName("java.lang.Object"));
        setField(term58450, term58450.getClass(), "iFormatter", term58488);
        setField(term58450, term58450.getClass(), "iElementPairs", term58540);
        Object term58977 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term58978 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term58977, term58977.getClass(), "iMinPrintedDigits", 2);
        setByteField(term58978, term58978.getClass(), "iOrdinal", (byte) 14);
        setField(term58978, term58978.getClass(), "iUnitType", null);
        setField(term58978, term58978.getClass(), "iRangeType", null);
        setField(term58978, term58978.getClass(), "iName", null);
        setField(term58977, term58977.getClass(), "iFieldType", term58978);
        setIntField(term58977, term58977.getClass(), "iMaxParsedDigits", 2);
        setBooleanField(term58977, term58977.getClass(), "iSigned", false);
        ArrayList term58975 = new ArrayList();
        ((ArrayList) term58975).add(term58977);
        ((ArrayList) term58975).add(term58977);
        term58974 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term58974, term58974.getClass(), "iElementPairs", term58975);
        setField(term58974, term58974.getClass(), "iFormatter", null);
        Object term58956 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term58958 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term58956, term58956.getClass(), "iMinPrintedDigits", 2);
        setByteField(term58958, term58958.getClass(), "iOrdinal", (byte) 14);
        setField(term58958, term58958.getClass(), "iUnitType", null);
        setField(term58958, term58958.getClass(), "iRangeType", null);
        setField(term58958, term58958.getClass(), "iName", null);
        setField(term58956, term58956.getClass(), "iFieldType", term58958);
        setIntField(term58956, term58956.getClass(), "iMaxParsedDigits", 2);
        setBooleanField(term58956, term58956.getClass(), "iSigned", false);
        ArrayList term58954 = new ArrayList();
        ((ArrayList) term58954).add(term58956);
        ((ArrayList) term58954).add(term58956);
        term58953 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term58953, term58953.getClass(), "iElementPairs", term58954);
        setField(term58953, term58953.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 2;
        Object retValue = callMethod(klass, "appendHourOfHalfday", argTypes, term58450, args);
        assertTrue(recursiveEquals(term58450, term58974));
        assertTrue(recursiveEquals(retValue, term58953));
    }

};


