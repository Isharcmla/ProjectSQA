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

public class DateTimeFormatterBuilder_appendClockhourOfHalfday_1520637893353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54580;
     Object term54851;
     Object term54830;

    public DateTimeFormatterBuilder_appendClockhourOfHalfday_1520637893353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term54670 = new ArrayList();
        term54580 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term54618 = newInstance(Class.forName("java.lang.Object"));
        setField(term54580, term54580.getClass(), "iFormatter", term54618);
        setField(term54580, term54580.getClass(), "iElementPairs", term54670);
        Object term54854 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term54855 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term54854, term54854.getClass(), "iMinPrintedDigits", 2);
        setByteField(term54855, term54855.getClass(), "iOrdinal", (byte) 15);
        setField(term54855, term54855.getClass(), "iUnitType", null);
        setField(term54855, term54855.getClass(), "iRangeType", null);
        setField(term54855, term54855.getClass(), "iName", null);
        setField(term54854, term54854.getClass(), "iFieldType", term54855);
        setIntField(term54854, term54854.getClass(), "iMaxParsedDigits", 2);
        setBooleanField(term54854, term54854.getClass(), "iSigned", false);
        ArrayList term54852 = new ArrayList();
        ((ArrayList) term54852).add(term54854);
        ((ArrayList) term54852).add(term54854);
        term54851 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term54851, term54851.getClass(), "iElementPairs", term54852);
        setField(term54851, term54851.getClass(), "iFormatter", null);
        Object term54833 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term54835 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setIntField(term54833, term54833.getClass(), "iMinPrintedDigits", 2);
        setByteField(term54835, term54835.getClass(), "iOrdinal", (byte) 15);
        setField(term54835, term54835.getClass(), "iUnitType", null);
        setField(term54835, term54835.getClass(), "iRangeType", null);
        setField(term54835, term54835.getClass(), "iName", null);
        setField(term54833, term54833.getClass(), "iFieldType", term54835);
        setIntField(term54833, term54833.getClass(), "iMaxParsedDigits", 2);
        setBooleanField(term54833, term54833.getClass(), "iSigned", false);
        ArrayList term54831 = new ArrayList();
        ((ArrayList) term54831).add(term54833);
        ((ArrayList) term54831).add(term54833);
        term54830 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term54830, term54830.getClass(), "iElementPairs", term54831);
        setField(term54830, term54830.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 2;
        Object retValue = callMethod(klass, "appendClockhourOfHalfday", argTypes, term54580, args);
        assertTrue(recursiveEquals(term54580, term54851));
        assertTrue(recursiveEquals(retValue, term54830));
    }

};


