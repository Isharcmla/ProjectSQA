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

public class DateTimeFormatterBuilder_appendYear_511540842398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62604;
     Object term62861;
     Object term62841;

    public DateTimeFormatterBuilder_appendYear_511540842398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term62694 = new ArrayList();
        term62604 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term62642 = newInstance(Class.forName("java.lang.Object"));
        setField(term62604, term62604.getClass(), "iFormatter", term62642);
        setField(term62604, term62604.getClass(), "iElementPairs", term62694);
        Object term62864 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object term62865 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term62865, term62865.getClass(), "iOrdinal", (byte) 5);
        setField(term62865, term62865.getClass(), "iUnitType", null);
        setField(term62865, term62865.getClass(), "iRangeType", null);
        setField(term62865, term62865.getClass(), "iName", null);
        setField(term62864, term62864.getClass(), "iFieldType", term62865);
        setIntField(term62864, term62864.getClass(), "iMaxParsedDigits", 1);
        setBooleanField(term62864, term62864.getClass(), "iSigned", true);
        ArrayList term62862 = new ArrayList();
        ((ArrayList) term62862).add(term62864);
        ((ArrayList) term62862).add(term62864);
        term62861 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term62861, term62861.getClass(), "iElementPairs", term62862);
        setField(term62861, term62861.getClass(), "iFormatter", null);
        Object term62844 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object term62845 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term62845, term62845.getClass(), "iOrdinal", (byte) 5);
        setField(term62845, term62845.getClass(), "iUnitType", null);
        setField(term62845, term62845.getClass(), "iRangeType", null);
        setField(term62845, term62845.getClass(), "iName", null);
        setField(term62844, term62844.getClass(), "iFieldType", term62845);
        setIntField(term62844, term62844.getClass(), "iMaxParsedDigits", 1);
        setBooleanField(term62844, term62844.getClass(), "iSigned", true);
        ArrayList term62842 = new ArrayList();
        ((ArrayList) term62842).add(term62844);
        ((ArrayList) term62842).add(term62844);
        term62841 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term62841, term62841.getClass(), "iElementPairs", term62842);
        setField(term62841, term62841.getClass(), "iFormatter", null);
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
        Object retValue = callMethod(klass, "appendYear", argTypes, term62604, args);
        assertTrue(recursiveEquals(term62604, term62861));
        assertTrue(recursiveEquals(retValue, term62841));
    }

};


