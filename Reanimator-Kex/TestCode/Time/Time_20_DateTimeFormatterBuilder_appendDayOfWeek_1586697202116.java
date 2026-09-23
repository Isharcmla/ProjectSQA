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
import java.lang.Integer;

public class DateTimeFormatterBuilder_appendDayOfWeek_1586697202116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344;
     Object term350;
     Object term8737;
     Object term8716;

    public DateTimeFormatterBuilder_appendDayOfWeek_1586697202116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term345 = new ArrayList();
        term344 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term349 = newInstance(Class.forName("java.lang.Object"));
        setField(term344, term344.getClass(), "iElementPairs", term345);
        setField(term344, term344.getClass(), "iFormatter", term349);
        term350 = new Integer(865208305);
        Object term8740 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term8741 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term8740, term8740.getClass(), "iMinPrintedDigits", 865208305);
        setByteField(term8741, term8741.getClass(), "iOrdinal", (byte) 12);
        setField(term8741, term8741.getClass(), "iUnitType", null);
        setField(term8741, term8741.getClass(), "iRangeType", null);
        setField(term8741, term8741.getClass(), "iName", null);
        setField(term8740, term8740.getClass(), "iFieldType", term8741);
        setIntField(term8740, term8740.getClass(), "iMaxParsedDigits", 865208305);
        setBooleanField(term8740, term8740.getClass(), "iSigned", false);
        ArrayList term8738 = new ArrayList();
        ((ArrayList) term8738).add(term8740);
        ((ArrayList) term8738).add(term8740);
        term8737 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term8737, term8737.getClass(), "iElementPairs", term8738);
        setField(term8737, term8737.getClass(), "iFormatter", null);
        Object term8719 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term8721 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term8719, term8719.getClass(), "iMinPrintedDigits", 865208305);
        setByteField(term8721, term8721.getClass(), "iOrdinal", (byte) 12);
        setField(term8721, term8721.getClass(), "iUnitType", null);
        setField(term8721, term8721.getClass(), "iRangeType", null);
        setField(term8721, term8721.getClass(), "iName", null);
        setField(term8719, term8719.getClass(), "iFieldType", term8721);
        setIntField(term8719, term8719.getClass(), "iMaxParsedDigits", 865208305);
        setBooleanField(term8719, term8719.getClass(), "iSigned", false);
        ArrayList term8717 = new ArrayList();
        ((ArrayList) term8717).add(term8719);
        ((ArrayList) term8717).add(term8719);
        term8716 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term8716, term8716.getClass(), "iElementPairs", term8717);
        setField(term8716, term8716.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term350;
        Object retValue = callMethod(klass, "appendDayOfWeek", argTypes, term344, args);
        assertTrue(recursiveEquals(term344, term8737));
        assertTrue(recursiveEquals(term350, 865208305));
        assertTrue(recursiveEquals(retValue, term8716));
    }

};


