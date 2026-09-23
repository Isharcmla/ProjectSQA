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

public class DateTimeFormatterBuilder_appendMillisOfSecond_760167252328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49149;
     Object term49724;
     Object term49703;

    public DateTimeFormatterBuilder_appendMillisOfSecond_760167252328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term49239 = new ArrayList();
        term49149 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term49187 = newInstance(Class.forName("java.lang.Object"));
        setField(term49149, term49149.getClass(), "iFormatter", term49187);
        setField(term49149, term49149.getClass(), "iElementPairs", term49239);
        Object term49727 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term49728 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term49727, term49727.getClass(), "iMinPrintedDigits", 880194700);
        setByteField(term49728, term49728.getClass(), "iOrdinal", (byte) 23);
        setField(term49728, term49728.getClass(), "iUnitType", null);
        setField(term49728, term49728.getClass(), "iRangeType", null);
        setField(term49728, term49728.getClass(), "iName", null);
        setField(term49727, term49727.getClass(), "iFieldType", term49728);
        setIntField(term49727, term49727.getClass(), "iMaxParsedDigits", 880194700);
        setBooleanField(term49727, term49727.getClass(), "iSigned", false);
        ArrayList term49725 = new ArrayList();
        ((ArrayList) term49725).add(term49727);
        ((ArrayList) term49725).add(term49727);
        term49724 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term49724, term49724.getClass(), "iElementPairs", term49725);
        setField(term49724, term49724.getClass(), "iFormatter", null);
        Object term49706 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term49708 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term49706, term49706.getClass(), "iMinPrintedDigits", 880194700);
        setByteField(term49708, term49708.getClass(), "iOrdinal", (byte) 23);
        setField(term49708, term49708.getClass(), "iUnitType", null);
        setField(term49708, term49708.getClass(), "iRangeType", null);
        setField(term49708, term49708.getClass(), "iName", null);
        setField(term49706, term49706.getClass(), "iFieldType", term49708);
        setIntField(term49706, term49706.getClass(), "iMaxParsedDigits", 880194700);
        setBooleanField(term49706, term49706.getClass(), "iSigned", false);
        ArrayList term49704 = new ArrayList();
        ((ArrayList) term49704).add(term49706);
        ((ArrayList) term49704).add(term49706);
        term49703 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term49703, term49703.getClass(), "iElementPairs", term49704);
        setField(term49703, term49703.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 880194700;
        Object retValue = callMethod(klass, "appendMillisOfSecond", argTypes, term49149, args);
        assertTrue(recursiveEquals(term49149, term49724));
        assertTrue(recursiveEquals(retValue, term49703));
    }

};


