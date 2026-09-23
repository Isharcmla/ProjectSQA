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

public class DateTimeFormatterBuilder_appendMinuteOfDay_1272625016347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53809;
     Object term53990;
     Object term53970;

    public DateTimeFormatterBuilder_appendMinuteOfDay_1272625016347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term53899 = new ArrayList();
        term53809 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term53847 = newInstance(Class.forName("java.lang.Object"));
        setField(term53809, term53809.getClass(), "iFormatter", term53847);
        setField(term53809, term53809.getClass(), "iElementPairs", term53899);
        Object term53993 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object term53994 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term53994, term53994.getClass(), "iOrdinal", (byte) 18);
        setField(term53994, term53994.getClass(), "iUnitType", null);
        setField(term53994, term53994.getClass(), "iRangeType", null);
        setField(term53994, term53994.getClass(), "iName", null);
        setField(term53993, term53993.getClass(), "iFieldType", term53994);
        setIntField(term53993, term53993.getClass(), "iMaxParsedDigits", 4);
        setBooleanField(term53993, term53993.getClass(), "iSigned", false);
        ArrayList term53991 = new ArrayList();
        ((ArrayList) term53991).add(term53993);
        ((ArrayList) term53991).add(term53993);
        term53990 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term53990, term53990.getClass(), "iElementPairs", term53991);
        setField(term53990, term53990.getClass(), "iFormatter", null);
        Object term53973 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object term53974 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term53974, term53974.getClass(), "iOrdinal", (byte) 18);
        setField(term53974, term53974.getClass(), "iUnitType", null);
        setField(term53974, term53974.getClass(), "iRangeType", null);
        setField(term53974, term53974.getClass(), "iName", null);
        setField(term53973, term53973.getClass(), "iFieldType", term53974);
        setIntField(term53973, term53973.getClass(), "iMaxParsedDigits", 4);
        setBooleanField(term53973, term53973.getClass(), "iSigned", false);
        ArrayList term53971 = new ArrayList();
        ((ArrayList) term53971).add(term53973);
        ((ArrayList) term53971).add(term53973);
        term53970 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term53970, term53970.getClass(), "iElementPairs", term53971);
        setField(term53970, term53970.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "appendMinuteOfDay", argTypes, term53809, args);
        assertTrue(recursiveEquals(term53809, term53990));
        assertTrue(recursiveEquals(retValue, term53970));
    }

};


