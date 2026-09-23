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

public class PeriodFormatterBuilder_printZeroRarelyLast_42225443956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199;
     Object term1672;
     Object term1660;

    public PeriodFormatterBuilder_printZeroRarelyLast_42225443956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term204 = new ArrayList();
        term199 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term210 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term199, term199.getClass(), "iMinPrintedDigits", 1);
        setIntField(term199, term199.getClass(), "iPrintZeroSetting", 2);
        setIntField(term199, term199.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term199, term199.getClass(), "iRejectSignedValues", true);
        setField(term199, term199.getClass(), "iPrefix", null);
        setField(term199, term199.getClass(), "iElementPairs", term204);
        setBooleanField(term199, term199.getClass(), "iNotPrinter", true);
        setBooleanField(term199, term199.getClass(), "iNotParser", true);
        setField(term199, term199.getClass(), "iFieldFormatters", term210);
        ArrayList term1673 = new ArrayList();
        term1672 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term1675 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term1672, term1672.getClass(), "iMinPrintedDigits", 1);
        setIntField(term1672, term1672.getClass(), "iPrintZeroSetting", 2);
        setIntField(term1672, term1672.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term1672, term1672.getClass(), "iRejectSignedValues", true);
        setField(term1672, term1672.getClass(), "iPrefix", null);
        setField(term1672, term1672.getClass(), "iElementPairs", term1673);
        setBooleanField(term1672, term1672.getClass(), "iNotPrinter", true);
        setBooleanField(term1672, term1672.getClass(), "iNotParser", true);
        setField(term1672, term1672.getClass(), "iFieldFormatters", term1675);
        ArrayList term1665 = new ArrayList();
        term1660 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term1671 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term1660, term1660.getClass(), "iMinPrintedDigits", 1);
        setIntField(term1660, term1660.getClass(), "iPrintZeroSetting", 2);
        setIntField(term1660, term1660.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term1660, term1660.getClass(), "iRejectSignedValues", true);
        setField(term1660, term1660.getClass(), "iPrefix", null);
        setField(term1660, term1660.getClass(), "iElementPairs", term1665);
        setBooleanField(term1660, term1660.getClass(), "iNotPrinter", true);
        setBooleanField(term1660, term1660.getClass(), "iNotParser", true);
        setField(term1660, term1660.getClass(), "iFieldFormatters", term1671);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "printZeroRarelyLast", argTypes, term199, args);
        assertTrue(recursiveEquals(term199, term1672));
        assertTrue(recursiveEquals(retValue, term1660));
    }

};


