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

public class DateTimeFormatterBuilder_appendMinuteOfHour_332042666378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59106;
     Object term59505;
     Object term59484;

    public DateTimeFormatterBuilder_appendMinuteOfHour_332042666378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term59196 = new ArrayList();
        term59106 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term59144 = newInstance(Class.forName("java.lang.Object"));
        setField(term59106, term59106.getClass(), "iFormatter", term59144);
        setField(term59106, term59106.getClass(), "iElementPairs", term59196);
        Object term59508 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term59509 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term59508, term59508.getClass(), "iMinPrintedDigits", 3);
        setByteField(term59509, term59509.getClass(), "iOrdinal", (byte) 19);
        setField(term59509, term59509.getClass(), "iUnitType", null);
        setField(term59509, term59509.getClass(), "iRangeType", null);
        setField(term59509, term59509.getClass(), "iName", null);
        setField(term59508, term59508.getClass(), "iFieldType", term59509);
        setIntField(term59508, term59508.getClass(), "iMaxParsedDigits", 3);
        setBooleanField(term59508, term59508.getClass(), "iSigned", false);
        ArrayList term59506 = new ArrayList();
        ((ArrayList) term59506).add(term59508);
        ((ArrayList) term59506).add(term59508);
        term59505 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term59505, term59505.getClass(), "iElementPairs", term59506);
        setField(term59505, term59505.getClass(), "iFormatter", null);
        Object term59487 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term59489 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term59487, term59487.getClass(), "iMinPrintedDigits", 3);
        setByteField(term59489, term59489.getClass(), "iOrdinal", (byte) 19);
        setField(term59489, term59489.getClass(), "iUnitType", null);
        setField(term59489, term59489.getClass(), "iRangeType", null);
        setField(term59489, term59489.getClass(), "iName", null);
        setField(term59487, term59487.getClass(), "iFieldType", term59489);
        setIntField(term59487, term59487.getClass(), "iMaxParsedDigits", 3);
        setBooleanField(term59487, term59487.getClass(), "iSigned", false);
        ArrayList term59485 = new ArrayList();
        ((ArrayList) term59485).add(term59487);
        ((ArrayList) term59485).add(term59487);
        term59484 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term59484, term59484.getClass(), "iElementPairs", term59485);
        setField(term59484, term59484.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 3;
        Object retValue = callMethod(klass, "appendMinuteOfHour", argTypes, term59106, args);
        assertTrue(recursiveEquals(term59106, term59505));
        assertTrue(recursiveEquals(retValue, term59484));
    }

};


