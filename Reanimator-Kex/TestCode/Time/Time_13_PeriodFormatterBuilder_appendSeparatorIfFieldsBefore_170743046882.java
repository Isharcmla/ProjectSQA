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
import java.util.ArrayList;
import java.lang.Object;

public class PeriodFormatterBuilder_appendSeparatorIfFieldsBefore_170743046882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term693;
     Object term4563;
     Object term4523;

    public PeriodFormatterBuilder_appendSeparatorIfFieldsBefore_170743046882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term698 = new ArrayList();
        term693 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term704 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term693, term693.getClass(), "iMinPrintedDigits", 1);
        setIntField(term693, term693.getClass(), "iPrintZeroSetting", 2);
        setIntField(term693, term693.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term693, term693.getClass(), "iRejectSignedValues", true);
        setField(term693, term693.getClass(), "iPrefix", null);
        setField(term693, term693.getClass(), "iElementPairs", term698);
        setBooleanField(term693, term693.getClass(), "iNotPrinter", true);
        setBooleanField(term693, term693.getClass(), "iNotParser", false);
        setField(term693, term693.getClass(), "iFieldFormatters", term704);
        ArrayList term4564 = new ArrayList();
        term4563 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term4566 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term4563, term4563.getClass(), "iMinPrintedDigits", 1);
        setIntField(term4563, term4563.getClass(), "iPrintZeroSetting", 2);
        setIntField(term4563, term4563.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term4563, term4563.getClass(), "iRejectSignedValues", true);
        setField(term4563, term4563.getClass(), "iPrefix", null);
        setField(term4563, term4563.getClass(), "iElementPairs", term4564);
        setBooleanField(term4563, term4563.getClass(), "iNotPrinter", true);
        setBooleanField(term4563, term4563.getClass(), "iNotParser", false);
        setField(term4563, term4563.getClass(), "iFieldFormatters", term4566);
        ArrayList term4528 = new ArrayList();
        term4523 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term4534 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term4523, term4523.getClass(), "iMinPrintedDigits", 1);
        setIntField(term4523, term4523.getClass(), "iPrintZeroSetting", 2);
        setIntField(term4523, term4523.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term4523, term4523.getClass(), "iRejectSignedValues", true);
        setField(term4523, term4523.getClass(), "iPrefix", null);
        setField(term4523, term4523.getClass(), "iElementPairs", term4528);
        setBooleanField(term4523, term4523.getClass(), "iNotPrinter", true);
        setBooleanField(term4523, term4523.getClass(), "iNotParser", false);
        setField(term4523, term4523.getClass(), "iFieldFormatters", term4534);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZiaGIbnzTs";
        Object retValue = callMethod(klass, "appendSeparatorIfFieldsBefore", argTypes, term693, args);
        assertTrue(recursiveEquals(term693, term4563));
        assertTrue(recursiveEquals(retValue, term4523));
    }

};


