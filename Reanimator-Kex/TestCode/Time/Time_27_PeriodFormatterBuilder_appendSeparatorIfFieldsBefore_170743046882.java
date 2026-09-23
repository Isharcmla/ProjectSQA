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
     Object term4562;
     Object term4522;

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
        ArrayList term4563 = new ArrayList();
        term4562 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term4565 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term4562, term4562.getClass(), "iMinPrintedDigits", 1);
        setIntField(term4562, term4562.getClass(), "iPrintZeroSetting", 2);
        setIntField(term4562, term4562.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term4562, term4562.getClass(), "iRejectSignedValues", true);
        setField(term4562, term4562.getClass(), "iPrefix", null);
        setField(term4562, term4562.getClass(), "iElementPairs", term4563);
        setBooleanField(term4562, term4562.getClass(), "iNotPrinter", true);
        setBooleanField(term4562, term4562.getClass(), "iNotParser", false);
        setField(term4562, term4562.getClass(), "iFieldFormatters", term4565);
        ArrayList term4527 = new ArrayList();
        term4522 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term4533 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term4522, term4522.getClass(), "iMinPrintedDigits", 1);
        setIntField(term4522, term4522.getClass(), "iPrintZeroSetting", 2);
        setIntField(term4522, term4522.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term4522, term4522.getClass(), "iRejectSignedValues", true);
        setField(term4522, term4522.getClass(), "iPrefix", null);
        setField(term4522, term4522.getClass(), "iElementPairs", term4527);
        setBooleanField(term4522, term4522.getClass(), "iNotPrinter", true);
        setBooleanField(term4522, term4522.getClass(), "iNotParser", false);
        setField(term4522, term4522.getClass(), "iFieldFormatters", term4533);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZiaGIbnzTs";
        Object retValue = callMethod(klass, "appendSeparatorIfFieldsBefore", argTypes, term693, args);
        assertTrue(recursiveEquals(term693, term4562));
        assertTrue(recursiveEquals(retValue, term4522));
    }

};


