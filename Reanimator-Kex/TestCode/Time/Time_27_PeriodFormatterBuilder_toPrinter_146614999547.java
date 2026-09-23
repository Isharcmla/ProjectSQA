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

public class PeriodFormatterBuilder_toPrinter_146614999547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term1095;

    public PeriodFormatterBuilder_toPrinter_146614999547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18 = new ArrayList();
        term13 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term24 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term13, term13.getClass(), "iMinPrintedDigits", 1);
        setIntField(term13, term13.getClass(), "iPrintZeroSetting", 2);
        setIntField(term13, term13.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term13, term13.getClass(), "iRejectSignedValues", false);
        setField(term13, term13.getClass(), "iPrefix", null);
        setField(term13, term13.getClass(), "iElementPairs", term18);
        setBooleanField(term13, term13.getClass(), "iNotPrinter", true);
        setBooleanField(term13, term13.getClass(), "iNotParser", true);
        setField(term13, term13.getClass(), "iFieldFormatters", term24);
        ArrayList term1096 = new ArrayList();
        term1095 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term1098 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term1095, term1095.getClass(), "iMinPrintedDigits", 1);
        setIntField(term1095, term1095.getClass(), "iPrintZeroSetting", 2);
        setIntField(term1095, term1095.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term1095, term1095.getClass(), "iRejectSignedValues", false);
        setField(term1095, term1095.getClass(), "iPrefix", null);
        setField(term1095, term1095.getClass(), "iElementPairs", term1096);
        setBooleanField(term1095, term1095.getClass(), "iNotPrinter", true);
        setBooleanField(term1095, term1095.getClass(), "iNotParser", true);
        setField(term1095, term1095.getClass(), "iFieldFormatters", term1098);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toPrinter", argTypes, term13, args);
        assertTrue(recursiveEquals(term13, term1095));
        assertTrue(recursiveEquals(retValue, null));
    }

};


