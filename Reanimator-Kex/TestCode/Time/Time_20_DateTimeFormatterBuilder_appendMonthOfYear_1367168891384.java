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

public class DateTimeFormatterBuilder_appendMonthOfYear_1367168891384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60107;
     Object term60453;
     Object term60433;

    public DateTimeFormatterBuilder_appendMonthOfYear_1367168891384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term60197 = new ArrayList();
        term60107 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term60145 = newInstance(Class.forName("java.lang.Object"));
        setField(term60107, term60107.getClass(), "iFormatter", term60145);
        setField(term60107, term60107.getClass(), "iElementPairs", term60197);
        Object term60456 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object term60457 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term60457, term60457.getClass(), "iOrdinal", (byte) 7);
        setField(term60457, term60457.getClass(), "iUnitType", null);
        setField(term60457, term60457.getClass(), "iRangeType", null);
        setField(term60457, term60457.getClass(), "iName", null);
        setField(term60456, term60456.getClass(), "iFieldType", term60457);
        setIntField(term60456, term60456.getClass(), "iMaxParsedDigits", 2);
        setBooleanField(term60456, term60456.getClass(), "iSigned", false);
        ArrayList term60454 = new ArrayList();
        ((ArrayList) term60454).add(term60456);
        ((ArrayList) term60454).add(term60456);
        term60453 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term60453, term60453.getClass(), "iElementPairs", term60454);
        setField(term60453, term60453.getClass(), "iFormatter", null);
        Object term60436 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object term60437 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term60437, term60437.getClass(), "iOrdinal", (byte) 7);
        setField(term60437, term60437.getClass(), "iUnitType", null);
        setField(term60437, term60437.getClass(), "iRangeType", null);
        setField(term60437, term60437.getClass(), "iName", null);
        setField(term60436, term60436.getClass(), "iFieldType", term60437);
        setIntField(term60436, term60436.getClass(), "iMaxParsedDigits", 2);
        setBooleanField(term60436, term60436.getClass(), "iSigned", false);
        ArrayList term60434 = new ArrayList();
        ((ArrayList) term60434).add(term60436);
        ((ArrayList) term60434).add(term60436);
        term60433 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term60433, term60433.getClass(), "iElementPairs", term60434);
        setField(term60433, term60433.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "appendMonthOfYear", argTypes, term60107, args);
        assertTrue(recursiveEquals(term60107, term60453));
        assertTrue(recursiveEquals(retValue, term60433));
    }

};


