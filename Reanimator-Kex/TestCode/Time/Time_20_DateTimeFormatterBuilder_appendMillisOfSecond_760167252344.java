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

public class DateTimeFormatterBuilder_appendMillisOfSecond_760167252344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53272;
     Object term53677;
     Object term53657;

    public DateTimeFormatterBuilder_appendMillisOfSecond_760167252344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term53362 = new ArrayList();
        term53272 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term53310 = newInstance(Class.forName("java.lang.Object"));
        setField(term53272, term53272.getClass(), "iFormatter", term53310);
        setField(term53272, term53272.getClass(), "iElementPairs", term53362);
        Object term53680 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object term53681 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term53681, term53681.getClass(), "iOrdinal", (byte) 23);
        setField(term53681, term53681.getClass(), "iUnitType", null);
        setField(term53681, term53681.getClass(), "iRangeType", null);
        setField(term53681, term53681.getClass(), "iName", null);
        setField(term53680, term53680.getClass(), "iFieldType", term53681);
        setIntField(term53680, term53680.getClass(), "iMaxParsedDigits", 3);
        setBooleanField(term53680, term53680.getClass(), "iSigned", false);
        ArrayList term53678 = new ArrayList();
        ((ArrayList) term53678).add(term53680);
        ((ArrayList) term53678).add(term53680);
        term53677 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term53677, term53677.getClass(), "iElementPairs", term53678);
        setField(term53677, term53677.getClass(), "iFormatter", null);
        Object term53660 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object term53661 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term53661, term53661.getClass(), "iOrdinal", (byte) 23);
        setField(term53661, term53661.getClass(), "iUnitType", null);
        setField(term53661, term53661.getClass(), "iRangeType", null);
        setField(term53661, term53661.getClass(), "iName", null);
        setField(term53660, term53660.getClass(), "iFieldType", term53661);
        setIntField(term53660, term53660.getClass(), "iMaxParsedDigits", 3);
        setBooleanField(term53660, term53660.getClass(), "iSigned", false);
        ArrayList term53658 = new ArrayList();
        ((ArrayList) term53658).add(term53660);
        ((ArrayList) term53658).add(term53660);
        term53657 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term53657, term53657.getClass(), "iElementPairs", term53658);
        setField(term53657, term53657.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "appendMillisOfSecond", argTypes, term53272, args);
        assertTrue(recursiveEquals(term53272, term53677));
        assertTrue(recursiveEquals(retValue, term53657));
    }

};


