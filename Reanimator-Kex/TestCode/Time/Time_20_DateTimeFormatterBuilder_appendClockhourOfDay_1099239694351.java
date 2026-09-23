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

public class DateTimeFormatterBuilder_appendClockhourOfDay_1099239694351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54122;
     Object term54740;
     Object term54720;

    public DateTimeFormatterBuilder_appendClockhourOfDay_1099239694351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term54212 = new ArrayList();
        term54122 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term54160 = newInstance(Class.forName("java.lang.Object"));
        setField(term54122, term54122.getClass(), "iFormatter", term54160);
        setField(term54122, term54122.getClass(), "iElementPairs", term54212);
        Object term54743 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object term54744 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term54744, term54744.getClass(), "iOrdinal", (byte) 16);
        setField(term54744, term54744.getClass(), "iUnitType", null);
        setField(term54744, term54744.getClass(), "iRangeType", null);
        setField(term54744, term54744.getClass(), "iName", null);
        setField(term54743, term54743.getClass(), "iFieldType", term54744);
        setIntField(term54743, term54743.getClass(), "iMaxParsedDigits", 2);
        setBooleanField(term54743, term54743.getClass(), "iSigned", false);
        ArrayList term54741 = new ArrayList();
        ((ArrayList) term54741).add(term54743);
        ((ArrayList) term54741).add(term54743);
        term54740 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term54740, term54740.getClass(), "iElementPairs", term54741);
        setField(term54740, term54740.getClass(), "iFormatter", null);
        Object term54723 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object term54724 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term54724, term54724.getClass(), "iOrdinal", (byte) 16);
        setField(term54724, term54724.getClass(), "iUnitType", null);
        setField(term54724, term54724.getClass(), "iRangeType", null);
        setField(term54724, term54724.getClass(), "iName", null);
        setField(term54723, term54723.getClass(), "iFieldType", term54724);
        setIntField(term54723, term54723.getClass(), "iMaxParsedDigits", 2);
        setBooleanField(term54723, term54723.getClass(), "iSigned", false);
        ArrayList term54721 = new ArrayList();
        ((ArrayList) term54721).add(term54723);
        ((ArrayList) term54721).add(term54723);
        term54720 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term54720, term54720.getClass(), "iElementPairs", term54721);
        setField(term54720, term54720.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "appendClockhourOfDay", argTypes, term54122, args);
        assertTrue(recursiveEquals(term54122, term54740));
        assertTrue(recursiveEquals(retValue, term54720));
    }

};


