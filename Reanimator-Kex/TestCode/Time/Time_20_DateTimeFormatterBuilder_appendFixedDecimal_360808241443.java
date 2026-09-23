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

public class DateTimeFormatterBuilder_appendFixedDecimal_360808241443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73443;
     Object term73653;
     Object term73675;
     Object term73680;
     Object term73666;

    public DateTimeFormatterBuilder_appendFixedDecimal_360808241443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term73533 = new ArrayList();
        term73443 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term73481 = newInstance(Class.forName("java.lang.Object"));
        setField(term73443, term73443.getClass(), "iFormatter", term73481);
        setField(term73443, term73443.getClass(), "iElementPairs", term73533);
        term73653 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term73678 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$FixedNumber"));
        Object term73679 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term73678, term73678.getClass(), "iMinPrintedDigits", 1);
        setByteField(term73679, term73679.getClass(), "iOrdinal", (byte) 0);
        setField(term73679, term73679.getClass(), "iUnitType", null);
        setField(term73679, term73679.getClass(), "iRangeType", null);
        setField(term73679, term73679.getClass(), "iName", null);
        setField(term73678, term73678.getClass(), "iFieldType", term73679);
        setIntField(term73678, term73678.getClass(), "iMaxParsedDigits", 1);
        setBooleanField(term73678, term73678.getClass(), "iSigned", false);
        ArrayList term73676 = new ArrayList();
        ((ArrayList) term73676).add(term73678);
        ((ArrayList) term73676).add(term73678);
        term73675 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term73675, term73675.getClass(), "iElementPairs", term73676);
        setField(term73675, term73675.getClass(), "iFormatter", null);
        term73680 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term73680, term73680.getClass(), "iOrdinal", (byte) 0);
        setField(term73680, term73680.getClass(), "iUnitType", null);
        setField(term73680, term73680.getClass(), "iRangeType", null);
        setField(term73680, term73680.getClass(), "iName", null);
        Object term73669 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$FixedNumber"));
        Object term73662 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term73669, term73669.getClass(), "iMinPrintedDigits", 1);
        setByteField(term73662, term73662.getClass(), "iOrdinal", (byte) 0);
        setField(term73662, term73662.getClass(), "iUnitType", null);
        setField(term73662, term73662.getClass(), "iRangeType", null);
        setField(term73662, term73662.getClass(), "iName", null);
        setField(term73669, term73669.getClass(), "iFieldType", term73662);
        setIntField(term73669, term73669.getClass(), "iMaxParsedDigits", 1);
        setBooleanField(term73669, term73669.getClass(), "iSigned", false);
        ArrayList term73667 = new ArrayList();
        ((ArrayList) term73667).add(term73669);
        ((ArrayList) term73667).add(term73669);
        term73666 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term73666, term73666.getClass(), "iElementPairs", term73667);
        setField(term73666, term73666.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term73653;
        args[1] = 1;
        Object retValue = callMethod(klass, "appendFixedDecimal", argTypes, term73443, args);
        assertTrue(recursiveEquals(term73443, term73675));
        assertTrue(recursiveEquals(term73653, term73680));
        assertTrue(recursiveEquals(retValue, term73666));
    }

};


