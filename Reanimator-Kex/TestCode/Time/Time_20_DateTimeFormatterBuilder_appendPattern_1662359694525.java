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

public class DateTimeFormatterBuilder_appendPattern_1662359694525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108587;
     Object term109065;
     Object term108813;

    public DateTimeFormatterBuilder_appendPattern_1662359694525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term108677 = new ArrayList();
        term108587 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term108625 = newInstance(Class.forName("java.lang.Object"));
        setField(term108587, term108587.getClass(), "iFormatter", term108625);
        setField(term108587, term108587.getClass(), "iElementPairs", term108677);
        Object term109068 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Fraction"));
        Object term109069 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term109069, term109069.getClass(), "iOrdinal", (byte) 20);
        setField(term109069, term109069.getClass(), "iUnitType", null);
        setField(term109069, term109069.getClass(), "iRangeType", null);
        setField(term109069, term109069.getClass(), "iName", null);
        setField(term109068, term109068.getClass(), "iFieldType", term109069);
        setIntField(term109068, term109068.getClass(), "iMinDigits", 1);
        setIntField(term109068, term109068.getClass(), "iMaxDigits", 1);
        Object term109070 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object term109071 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term109071, term109071.getClass(), "iOrdinal", (byte) 8);
        setField(term109071, term109071.getClass(), "iUnitType", null);
        setField(term109071, term109071.getClass(), "iRangeType", null);
        setField(term109071, term109071.getClass(), "iName", null);
        setField(term109070, term109070.getClass(), "iFieldType", term109071);
        setIntField(term109070, term109070.getClass(), "iMaxParsedDigits", 2);
        setBooleanField(term109070, term109070.getClass(), "iSigned", false);
        Object term109072 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral"));
        setField(term109072, term109072.getClass(), "iValue", "");
        ArrayList term109066 = new ArrayList();
        ((ArrayList) term109066).add(term109068);
        ((ArrayList) term109066).add(term109068);
        ((ArrayList) term109066).add(term109070);
        ((ArrayList) term109066).add(term109070);
        ((ArrayList) term109066).add(term109072);
        ((ArrayList) term109066).add(term109072);
        term109065 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term109065, term109065.getClass(), "iElementPairs", term109066);
        setField(term109065, term109065.getClass(), "iFormatter", null);
        Object term108816 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Fraction"));
        Object term108817 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term108817, term108817.getClass(), "iOrdinal", (byte) 20);
        setField(term108817, term108817.getClass(), "iUnitType", null);
        setField(term108817, term108817.getClass(), "iRangeType", null);
        setField(term108817, term108817.getClass(), "iName", null);
        setField(term108816, term108816.getClass(), "iFieldType", term108817);
        setIntField(term108816, term108816.getClass(), "iMinDigits", 1);
        setIntField(term108816, term108816.getClass(), "iMaxDigits", 1);
        Object term108821 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object term108822 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term108822, term108822.getClass(), "iOrdinal", (byte) 8);
        setField(term108822, term108822.getClass(), "iUnitType", null);
        setField(term108822, term108822.getClass(), "iRangeType", null);
        setField(term108822, term108822.getClass(), "iName", null);
        setField(term108821, term108821.getClass(), "iFieldType", term108822);
        setIntField(term108821, term108821.getClass(), "iMaxParsedDigits", 2);
        setBooleanField(term108821, term108821.getClass(), "iSigned", false);
        Object term108826 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral"));
        setField(term108826, term108826.getClass(), "iValue", "");
        ArrayList term108814 = new ArrayList();
        ((ArrayList) term108814).add(term108816);
        ((ArrayList) term108814).add(term108816);
        ((ArrayList) term108814).add(term108821);
        ((ArrayList) term108814).add(term108821);
        ((ArrayList) term108814).add(term108826);
        ((ArrayList) term108814).add(term108826);
        term108813 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term108813, term108813.getClass(), "iElementPairs", term108814);
        setField(term108813, term108813.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "Sd              ";
        Object retValue = callMethod(klass, "appendPattern", argTypes, term108587, args);
        assertTrue(recursiveEquals(term108587, term109065));
        assertTrue(recursiveEquals(retValue, term108813));
    }

};


