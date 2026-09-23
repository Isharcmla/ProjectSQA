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

public class DateTimeFormatterBuilder_appendHourOfDay_1965947096410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64638;
     Object term65236;
     Object term65215;

    public DateTimeFormatterBuilder_appendHourOfDay_1965947096410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term64728 = new ArrayList();
        term64638 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term64676 = newInstance(Class.forName("java.lang.Object"));
        setField(term64638, term64638.getClass(), "iFormatter", term64676);
        setField(term64638, term64638.getClass(), "iElementPairs", term64728);
        Object term65239 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term65240 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term65239, term65239.getClass(), "iMinPrintedDigits", 3);
        setByteField(term65240, term65240.getClass(), "iOrdinal", (byte) 17);
        setField(term65240, term65240.getClass(), "iUnitType", null);
        setField(term65240, term65240.getClass(), "iRangeType", null);
        setField(term65240, term65240.getClass(), "iName", null);
        setField(term65239, term65239.getClass(), "iFieldType", term65240);
        setIntField(term65239, term65239.getClass(), "iMaxParsedDigits", 3);
        setBooleanField(term65239, term65239.getClass(), "iSigned", false);
        ArrayList term65237 = new ArrayList();
        ((ArrayList) term65237).add(term65239);
        ((ArrayList) term65237).add(term65239);
        term65236 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term65236, term65236.getClass(), "iElementPairs", term65237);
        setField(term65236, term65236.getClass(), "iFormatter", null);
        Object term65218 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term65220 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term65218, term65218.getClass(), "iMinPrintedDigits", 3);
        setByteField(term65220, term65220.getClass(), "iOrdinal", (byte) 17);
        setField(term65220, term65220.getClass(), "iUnitType", null);
        setField(term65220, term65220.getClass(), "iRangeType", null);
        setField(term65220, term65220.getClass(), "iName", null);
        setField(term65218, term65218.getClass(), "iFieldType", term65220);
        setIntField(term65218, term65218.getClass(), "iMaxParsedDigits", 3);
        setBooleanField(term65218, term65218.getClass(), "iSigned", false);
        ArrayList term65216 = new ArrayList();
        ((ArrayList) term65216).add(term65218);
        ((ArrayList) term65216).add(term65218);
        term65215 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term65215, term65215.getClass(), "iElementPairs", term65216);
        setField(term65215, term65215.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 3;
        Object retValue = callMethod(klass, "appendHourOfDay", argTypes, term64638, args);
        assertTrue(recursiveEquals(term64638, term65236));
        assertTrue(recursiveEquals(retValue, term65215));
    }

};


