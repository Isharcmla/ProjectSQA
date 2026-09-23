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

public class DateTimeFormatterBuilder_appendWeekOfWeekyear_2047606633419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66655;
     Object term66898;
     Object term66877;

    public DateTimeFormatterBuilder_appendWeekOfWeekyear_2047606633419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term66745 = new ArrayList();
        term66655 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term66693 = newInstance(Class.forName("java.lang.Object"));
        setField(term66655, term66655.getClass(), "iFormatter", term66693);
        setField(term66655, term66655.getClass(), "iElementPairs", term66745);
        Object term66901 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term66902 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term66901, term66901.getClass(), "iMinPrintedDigits", 3);
        setByteField(term66902, term66902.getClass(), "iOrdinal", (byte) 11);
        setField(term66902, term66902.getClass(), "iUnitType", null);
        setField(term66902, term66902.getClass(), "iRangeType", null);
        setField(term66902, term66902.getClass(), "iName", null);
        setField(term66901, term66901.getClass(), "iFieldType", term66902);
        setIntField(term66901, term66901.getClass(), "iMaxParsedDigits", 3);
        setBooleanField(term66901, term66901.getClass(), "iSigned", false);
        ArrayList term66899 = new ArrayList();
        ((ArrayList) term66899).add(term66901);
        ((ArrayList) term66899).add(term66901);
        term66898 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term66898, term66898.getClass(), "iElementPairs", term66899);
        setField(term66898, term66898.getClass(), "iFormatter", null);
        Object term66880 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term66882 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term66880, term66880.getClass(), "iMinPrintedDigits", 3);
        setByteField(term66882, term66882.getClass(), "iOrdinal", (byte) 11);
        setField(term66882, term66882.getClass(), "iUnitType", null);
        setField(term66882, term66882.getClass(), "iRangeType", null);
        setField(term66882, term66882.getClass(), "iName", null);
        setField(term66880, term66880.getClass(), "iFieldType", term66882);
        setIntField(term66880, term66880.getClass(), "iMaxParsedDigits", 3);
        setBooleanField(term66880, term66880.getClass(), "iSigned", false);
        ArrayList term66878 = new ArrayList();
        ((ArrayList) term66878).add(term66880);
        ((ArrayList) term66878).add(term66880);
        term66877 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term66877, term66877.getClass(), "iElementPairs", term66878);
        setField(term66877, term66877.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 3;
        Object retValue = callMethod(klass, "appendWeekOfWeekyear", argTypes, term66655, args);
        assertTrue(recursiveEquals(term66655, term66898));
        assertTrue(recursiveEquals(retValue, term66877));
    }

};


