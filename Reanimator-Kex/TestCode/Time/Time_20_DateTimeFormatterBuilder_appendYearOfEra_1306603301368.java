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

public class DateTimeFormatterBuilder_appendYearOfEra_1306603301368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57050;
     Object term57727;
     Object term57707;

    public DateTimeFormatterBuilder_appendYearOfEra_1306603301368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term57140 = new ArrayList();
        term57050 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term57088 = newInstance(Class.forName("java.lang.Object"));
        setField(term57050, term57050.getClass(), "iFormatter", term57088);
        setField(term57050, term57050.getClass(), "iElementPairs", term57140);
        Object term57730 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object term57731 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term57731, term57731.getClass(), "iOrdinal", (byte) 2);
        setField(term57731, term57731.getClass(), "iUnitType", null);
        setField(term57731, term57731.getClass(), "iRangeType", null);
        setField(term57731, term57731.getClass(), "iName", null);
        setField(term57730, term57730.getClass(), "iFieldType", term57731);
        setIntField(term57730, term57730.getClass(), "iMaxParsedDigits", 1);
        setBooleanField(term57730, term57730.getClass(), "iSigned", false);
        ArrayList term57728 = new ArrayList();
        ((ArrayList) term57728).add(term57730);
        ((ArrayList) term57728).add(term57730);
        term57727 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term57727, term57727.getClass(), "iElementPairs", term57728);
        setField(term57727, term57727.getClass(), "iFormatter", null);
        Object term57710 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object term57711 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term57711, term57711.getClass(), "iOrdinal", (byte) 2);
        setField(term57711, term57711.getClass(), "iUnitType", null);
        setField(term57711, term57711.getClass(), "iRangeType", null);
        setField(term57711, term57711.getClass(), "iName", null);
        setField(term57710, term57710.getClass(), "iFieldType", term57711);
        setIntField(term57710, term57710.getClass(), "iMaxParsedDigits", 1);
        setBooleanField(term57710, term57710.getClass(), "iSigned", false);
        ArrayList term57708 = new ArrayList();
        ((ArrayList) term57708).add(term57710);
        ((ArrayList) term57708).add(term57710);
        term57707 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term57707, term57707.getClass(), "iElementPairs", term57708);
        setField(term57707, term57707.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = 1;
        args[1] = 0;
        Object retValue = callMethod(klass, "appendYearOfEra", argTypes, term57050, args);
        assertTrue(recursiveEquals(term57050, term57727));
        assertTrue(recursiveEquals(retValue, term57707));
    }

};


