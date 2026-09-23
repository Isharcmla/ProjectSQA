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

public class DateTimeFormatterBuilder_append_58061458457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77628;
     Object term77840;
     Object term77960;
     Object term77976;
     Object term77981;
     Object term77982;
     Object term77962;

    public DateTimeFormatterBuilder_append_58061458457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term77718 = new ArrayList();
        term77628 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term77666 = newInstance(Class.forName("java.lang.Object"));
        setField(term77628, term77628.getClass(), "iFormatter", term77666);
        setField(term77628, term77628.getClass(), "iElementPairs", term77718);
        term77840 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        term77960 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$FixedNumber"));
        Object term77979 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        setIntField(term77979, term77979.getClass(), "iMinPrintedDigits", 0);
        setField(term77979, term77979.getClass(), "iFieldType", null);
        setIntField(term77979, term77979.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term77979, term77979.getClass(), "iSigned", false);
        Object term77980 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$FixedNumber"));
        setIntField(term77980, term77980.getClass(), "iMinPrintedDigits", 0);
        setField(term77980, term77980.getClass(), "iFieldType", null);
        setIntField(term77980, term77980.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term77980, term77980.getClass(), "iSigned", false);
        ArrayList term77977 = new ArrayList();
        ((ArrayList) term77977).add(term77979);
        ((ArrayList) term77977).add(term77980);
        term77976 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term77976, term77976.getClass(), "iElementPairs", term77977);
        setField(term77976, term77976.getClass(), "iFormatter", null);
        term77981 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        setIntField(term77981, term77981.getClass(), "iMinPrintedDigits", 0);
        setField(term77981, term77981.getClass(), "iFieldType", null);
        setIntField(term77981, term77981.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term77981, term77981.getClass(), "iSigned", false);
        term77982 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$FixedNumber"));
        setIntField(term77982, term77982.getClass(), "iMinPrintedDigits", 0);
        setField(term77982, term77982.getClass(), "iFieldType", null);
        setIntField(term77982, term77982.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term77982, term77982.getClass(), "iSigned", false);
        Object term77965 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        setIntField(term77965, term77965.getClass(), "iMinPrintedDigits", 0);
        setField(term77965, term77965.getClass(), "iFieldType", null);
        setIntField(term77965, term77965.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term77965, term77965.getClass(), "iSigned", false);
        Object term77969 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$FixedNumber"));
        setIntField(term77969, term77969.getClass(), "iMinPrintedDigits", 0);
        setField(term77969, term77969.getClass(), "iFieldType", null);
        setIntField(term77969, term77969.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term77969, term77969.getClass(), "iSigned", false);
        ArrayList term77963 = new ArrayList();
        ((ArrayList) term77963).add(term77965);
        ((ArrayList) term77963).add(term77969);
        term77962 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term77962, term77962.getClass(), "iElementPairs", term77963);
        setField(term77962, term77962.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.format.DateTimePrinter");
        argTypes[1] = Class.forName("org.joda.time.format.DateTimeParser");
        Object[] args = new Object[2];
        args[0] = term77840;
        args[1] = term77960;
        Object retValue = callMethod(klass, "append", argTypes, term77628, args);
        assertTrue(recursiveEquals(term77628, term77976));
        assertTrue(recursiveEquals(term77840, term77981));
        assertTrue(recursiveEquals(term77960, term77982));
        assertTrue(recursiveEquals(retValue, term77962));
    }

};


