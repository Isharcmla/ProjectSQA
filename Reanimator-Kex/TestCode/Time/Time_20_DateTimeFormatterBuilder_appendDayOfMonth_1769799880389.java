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

public class DateTimeFormatterBuilder_appendDayOfMonth_1769799880389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60992;
     Object term61477;
     Object term61457;

    public DateTimeFormatterBuilder_appendDayOfMonth_1769799880389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term61082 = new ArrayList();
        term60992 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term61030 = newInstance(Class.forName("java.lang.Object"));
        setField(term60992, term60992.getClass(), "iFormatter", term61030);
        setField(term60992, term60992.getClass(), "iElementPairs", term61082);
        Object term61480 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object term61481 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term61481, term61481.getClass(), "iOrdinal", (byte) 8);
        setField(term61481, term61481.getClass(), "iUnitType", null);
        setField(term61481, term61481.getClass(), "iRangeType", null);
        setField(term61481, term61481.getClass(), "iName", null);
        setField(term61480, term61480.getClass(), "iFieldType", term61481);
        setIntField(term61480, term61480.getClass(), "iMaxParsedDigits", 2);
        setBooleanField(term61480, term61480.getClass(), "iSigned", false);
        ArrayList term61478 = new ArrayList();
        ((ArrayList) term61478).add(term61480);
        ((ArrayList) term61478).add(term61480);
        term61477 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term61477, term61477.getClass(), "iElementPairs", term61478);
        setField(term61477, term61477.getClass(), "iFormatter", null);
        Object term61460 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object term61461 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term61461, term61461.getClass(), "iOrdinal", (byte) 8);
        setField(term61461, term61461.getClass(), "iUnitType", null);
        setField(term61461, term61461.getClass(), "iRangeType", null);
        setField(term61461, term61461.getClass(), "iName", null);
        setField(term61460, term61460.getClass(), "iFieldType", term61461);
        setIntField(term61460, term61460.getClass(), "iMaxParsedDigits", 2);
        setBooleanField(term61460, term61460.getClass(), "iSigned", false);
        ArrayList term61458 = new ArrayList();
        ((ArrayList) term61458).add(term61460);
        ((ArrayList) term61458).add(term61460);
        term61457 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term61457, term61457.getClass(), "iElementPairs", term61458);
        setField(term61457, term61457.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "appendDayOfMonth", argTypes, term60992, args);
        assertTrue(recursiveEquals(term60992, term61477));
        assertTrue(recursiveEquals(retValue, term61457));
    }

};


