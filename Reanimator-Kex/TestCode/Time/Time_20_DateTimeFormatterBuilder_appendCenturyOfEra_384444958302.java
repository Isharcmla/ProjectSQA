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

public class DateTimeFormatterBuilder_appendCenturyOfEra_384444958302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44293;
     Object term44821;
     Object term44801;

    public DateTimeFormatterBuilder_appendCenturyOfEra_384444958302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term44383 = new ArrayList();
        term44293 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term44331 = newInstance(Class.forName("java.lang.Object"));
        setField(term44293, term44293.getClass(), "iFormatter", term44331);
        setField(term44293, term44293.getClass(), "iElementPairs", term44383);
        Object term44824 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object term44825 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term44825, term44825.getClass(), "iOrdinal", (byte) 3);
        setField(term44825, term44825.getClass(), "iUnitType", null);
        setField(term44825, term44825.getClass(), "iRangeType", null);
        setField(term44825, term44825.getClass(), "iName", null);
        setField(term44824, term44824.getClass(), "iFieldType", term44825);
        setIntField(term44824, term44824.getClass(), "iMaxParsedDigits", 1);
        setBooleanField(term44824, term44824.getClass(), "iSigned", true);
        ArrayList term44822 = new ArrayList();
        ((ArrayList) term44822).add(term44824);
        ((ArrayList) term44822).add(term44824);
        term44821 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term44821, term44821.getClass(), "iElementPairs", term44822);
        setField(term44821, term44821.getClass(), "iFormatter", null);
        Object term44804 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object term44805 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term44805, term44805.getClass(), "iOrdinal", (byte) 3);
        setField(term44805, term44805.getClass(), "iUnitType", null);
        setField(term44805, term44805.getClass(), "iRangeType", null);
        setField(term44805, term44805.getClass(), "iName", null);
        setField(term44804, term44804.getClass(), "iFieldType", term44805);
        setIntField(term44804, term44804.getClass(), "iMaxParsedDigits", 1);
        setBooleanField(term44804, term44804.getClass(), "iSigned", true);
        ArrayList term44802 = new ArrayList();
        ((ArrayList) term44802).add(term44804);
        ((ArrayList) term44802).add(term44804);
        term44801 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term44801, term44801.getClass(), "iElementPairs", term44802);
        setField(term44801, term44801.getClass(), "iFormatter", null);
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
        Object retValue = callMethod(klass, "appendCenturyOfEra", argTypes, term44293, args);
        assertTrue(recursiveEquals(term44293, term44821));
        assertTrue(recursiveEquals(retValue, term44801));
    }

};


