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

public class DateTimeFormatterBuilder_appendMinuteOfDay_1272625016323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48292;
     Object term48774;
     Object term48753;

    public DateTimeFormatterBuilder_appendMinuteOfDay_1272625016323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term48382 = new ArrayList();
        term48292 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term48330 = newInstance(Class.forName("java.lang.Object"));
        setField(term48292, term48292.getClass(), "iFormatter", term48330);
        setField(term48292, term48292.getClass(), "iElementPairs", term48382);
        Object term48777 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term48778 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term48777, term48777.getClass(), "iMinPrintedDigits", 1162308430);
        setByteField(term48778, term48778.getClass(), "iOrdinal", (byte) 18);
        setField(term48778, term48778.getClass(), "iUnitType", null);
        setField(term48778, term48778.getClass(), "iRangeType", null);
        setField(term48778, term48778.getClass(), "iName", null);
        setField(term48777, term48777.getClass(), "iFieldType", term48778);
        setIntField(term48777, term48777.getClass(), "iMaxParsedDigits", 1162308430);
        setBooleanField(term48777, term48777.getClass(), "iSigned", false);
        ArrayList term48775 = new ArrayList();
        ((ArrayList) term48775).add(term48777);
        ((ArrayList) term48775).add(term48777);
        term48774 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term48774, term48774.getClass(), "iElementPairs", term48775);
        setField(term48774, term48774.getClass(), "iFormatter", null);
        Object term48756 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term48758 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term48756, term48756.getClass(), "iMinPrintedDigits", 1162308430);
        setByteField(term48758, term48758.getClass(), "iOrdinal", (byte) 18);
        setField(term48758, term48758.getClass(), "iUnitType", null);
        setField(term48758, term48758.getClass(), "iRangeType", null);
        setField(term48758, term48758.getClass(), "iName", null);
        setField(term48756, term48756.getClass(), "iFieldType", term48758);
        setIntField(term48756, term48756.getClass(), "iMaxParsedDigits", 1162308430);
        setBooleanField(term48756, term48756.getClass(), "iSigned", false);
        ArrayList term48754 = new ArrayList();
        ((ArrayList) term48754).add(term48756);
        ((ArrayList) term48754).add(term48756);
        term48753 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term48753, term48753.getClass(), "iElementPairs", term48754);
        setField(term48753, term48753.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1162308430;
        Object retValue = callMethod(klass, "appendMinuteOfDay", argTypes, term48292, args);
        assertTrue(recursiveEquals(term48292, term48774));
        assertTrue(recursiveEquals(retValue, term48753));
    }

};


