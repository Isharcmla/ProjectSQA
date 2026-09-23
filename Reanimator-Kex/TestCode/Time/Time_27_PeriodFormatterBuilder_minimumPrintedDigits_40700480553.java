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
import java.lang.Integer;

public class PeriodFormatterBuilder_minimumPrintedDigits_40700480553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157;
     Object term169;
     Object term1622;
     Object term1609;

    public PeriodFormatterBuilder_minimumPrintedDigits_40700480553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term162 = new ArrayList();
        term157 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term168 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term157, term157.getClass(), "iMinPrintedDigits", 1);
        setIntField(term157, term157.getClass(), "iPrintZeroSetting", 2);
        setIntField(term157, term157.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term157, term157.getClass(), "iRejectSignedValues", true);
        setField(term157, term157.getClass(), "iPrefix", null);
        setField(term157, term157.getClass(), "iElementPairs", term162);
        setBooleanField(term157, term157.getClass(), "iNotPrinter", true);
        setBooleanField(term157, term157.getClass(), "iNotParser", true);
        setField(term157, term157.getClass(), "iFieldFormatters", term168);
        term169 = new Integer(-469968304);
        ArrayList term1623 = new ArrayList();
        term1622 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term1625 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term1622, term1622.getClass(), "iMinPrintedDigits", -469968304);
        setIntField(term1622, term1622.getClass(), "iPrintZeroSetting", 2);
        setIntField(term1622, term1622.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term1622, term1622.getClass(), "iRejectSignedValues", true);
        setField(term1622, term1622.getClass(), "iPrefix", null);
        setField(term1622, term1622.getClass(), "iElementPairs", term1623);
        setBooleanField(term1622, term1622.getClass(), "iNotPrinter", true);
        setBooleanField(term1622, term1622.getClass(), "iNotParser", true);
        setField(term1622, term1622.getClass(), "iFieldFormatters", term1625);
        ArrayList term1614 = new ArrayList();
        term1609 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term1620 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term1609, term1609.getClass(), "iMinPrintedDigits", -469968304);
        setIntField(term1609, term1609.getClass(), "iPrintZeroSetting", 2);
        setIntField(term1609, term1609.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term1609, term1609.getClass(), "iRejectSignedValues", true);
        setField(term1609, term1609.getClass(), "iPrefix", null);
        setField(term1609, term1609.getClass(), "iElementPairs", term1614);
        setBooleanField(term1609, term1609.getClass(), "iNotPrinter", true);
        setBooleanField(term1609, term1609.getClass(), "iNotParser", true);
        setField(term1609, term1609.getClass(), "iFieldFormatters", term1620);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term169;
        Object retValue = callMethod(klass, "minimumPrintedDigits", argTypes, term157, args);
        assertTrue(recursiveEquals(term157, term1622));
        assertTrue(recursiveEquals(term169, -469968304));
        assertTrue(recursiveEquals(retValue, term1609));
    }

};


