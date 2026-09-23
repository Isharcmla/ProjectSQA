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

public class DateTimeFormatterBuilder_appendDayOfWeekShortText_135428283132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term482;
     Object term11112;
     Object term11096;

    public DateTimeFormatterBuilder_appendDayOfWeekShortText_135428283132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term483 = new ArrayList();
        term482 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term487 = newInstance(Class.forName("java.lang.Object"));
        setField(term482, term482.getClass(), "iElementPairs", term483);
        setField(term482, term482.getClass(), "iFormatter", term487);
        Object term11115 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TextField"));
        Object term11116 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term11116, term11116.getClass(), "iOrdinal", (byte) 12);
        setField(term11116, term11116.getClass(), "iUnitType", null);
        setField(term11116, term11116.getClass(), "iRangeType", null);
        setField(term11116, term11116.getClass(), "iName", null);
        setField(term11115, term11115.getClass(), "iFieldType", term11116);
        setBooleanField(term11115, term11115.getClass(), "iShort", true);
        ArrayList term11113 = new ArrayList();
        ((ArrayList) term11113).add(term11115);
        ((ArrayList) term11113).add(term11115);
        term11112 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term11112, term11112.getClass(), "iElementPairs", term11113);
        setField(term11112, term11112.getClass(), "iFormatter", null);
        Object term11099 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TextField"));
        Object term11100 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term11100, term11100.getClass(), "iOrdinal", (byte) 12);
        setField(term11100, term11100.getClass(), "iUnitType", null);
        setField(term11100, term11100.getClass(), "iRangeType", null);
        setField(term11100, term11100.getClass(), "iName", null);
        setField(term11099, term11099.getClass(), "iFieldType", term11100);
        setBooleanField(term11099, term11099.getClass(), "iShort", true);
        ArrayList term11097 = new ArrayList();
        ((ArrayList) term11097).add(term11099);
        ((ArrayList) term11097).add(term11099);
        term11096 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term11096, term11096.getClass(), "iElementPairs", term11097);
        setField(term11096, term11096.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "appendDayOfWeekShortText", argTypes, term482, args);
        assertTrue(recursiveEquals(term482, term11112));
        assertTrue(recursiveEquals(retValue, term11096));
    }

};


