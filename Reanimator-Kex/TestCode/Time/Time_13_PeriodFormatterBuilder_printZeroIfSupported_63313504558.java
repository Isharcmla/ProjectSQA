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

public class PeriodFormatterBuilder_printZeroIfSupported_63313504558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223;
     Object term1716;
     Object term1692;

    public PeriodFormatterBuilder_printZeroIfSupported_63313504558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term228 = new ArrayList();
        term223 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term234 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term223, term223.getClass(), "iMinPrintedDigits", 1);
        setIntField(term223, term223.getClass(), "iPrintZeroSetting", 2);
        setIntField(term223, term223.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term223, term223.getClass(), "iRejectSignedValues", true);
        setField(term223, term223.getClass(), "iPrefix", null);
        setField(term223, term223.getClass(), "iElementPairs", term228);
        setBooleanField(term223, term223.getClass(), "iNotPrinter", true);
        setBooleanField(term223, term223.getClass(), "iNotParser", false);
        setField(term223, term223.getClass(), "iFieldFormatters", term234);
        ArrayList term1719 = new ArrayList();
        term1716 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term1723 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term1716, term1716.getClass(), "iMinPrintedDigits", 1);
        setIntField(term1716, term1716.getClass(), "iPrintZeroSetting", 3);
        setIntField(term1716, term1716.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term1716, term1716.getClass(), "iRejectSignedValues", true);
        setField(term1716, term1716.getClass(), "iPrefix", null);
        setField(term1716, term1716.getClass(), "iElementPairs", term1719);
        setBooleanField(term1716, term1716.getClass(), "iNotPrinter", true);
        setBooleanField(term1716, term1716.getClass(), "iNotParser", false);
        setField(term1716, term1716.getClass(), "iFieldFormatters", term1723);
        ArrayList term1697 = new ArrayList();
        term1692 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term1703 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term1692, term1692.getClass(), "iMinPrintedDigits", 1);
        setIntField(term1692, term1692.getClass(), "iPrintZeroSetting", 3);
        setIntField(term1692, term1692.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term1692, term1692.getClass(), "iRejectSignedValues", true);
        setField(term1692, term1692.getClass(), "iPrefix", null);
        setField(term1692, term1692.getClass(), "iElementPairs", term1697);
        setBooleanField(term1692, term1692.getClass(), "iNotPrinter", true);
        setBooleanField(term1692, term1692.getClass(), "iNotParser", false);
        setField(term1692, term1692.getClass(), "iFieldFormatters", term1703);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "printZeroIfSupported", argTypes, term223, args);
        assertTrue(recursiveEquals(term223, term1716));
        assertTrue(recursiveEquals(retValue, term1692));
    }

};


