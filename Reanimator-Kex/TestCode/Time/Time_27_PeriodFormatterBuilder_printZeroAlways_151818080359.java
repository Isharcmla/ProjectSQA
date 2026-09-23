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

public class PeriodFormatterBuilder_printZeroAlways_151818080359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235;
     Object term1720;
     Object term1708;

    public PeriodFormatterBuilder_printZeroAlways_151818080359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term240 = new ArrayList();
        term235 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term246 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term235, term235.getClass(), "iMinPrintedDigits", 1);
        setIntField(term235, term235.getClass(), "iPrintZeroSetting", 2);
        setIntField(term235, term235.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term235, term235.getClass(), "iRejectSignedValues", false);
        setField(term235, term235.getClass(), "iPrefix", null);
        setField(term235, term235.getClass(), "iElementPairs", term240);
        setBooleanField(term235, term235.getClass(), "iNotPrinter", false);
        setBooleanField(term235, term235.getClass(), "iNotParser", true);
        setField(term235, term235.getClass(), "iFieldFormatters", term246);
        ArrayList term1721 = new ArrayList();
        term1720 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term1723 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term1720, term1720.getClass(), "iMinPrintedDigits", 1);
        setIntField(term1720, term1720.getClass(), "iPrintZeroSetting", 4);
        setIntField(term1720, term1720.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term1720, term1720.getClass(), "iRejectSignedValues", false);
        setField(term1720, term1720.getClass(), "iPrefix", null);
        setField(term1720, term1720.getClass(), "iElementPairs", term1721);
        setBooleanField(term1720, term1720.getClass(), "iNotPrinter", false);
        setBooleanField(term1720, term1720.getClass(), "iNotParser", true);
        setField(term1720, term1720.getClass(), "iFieldFormatters", term1723);
        ArrayList term1713 = new ArrayList();
        term1708 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term1719 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term1708, term1708.getClass(), "iMinPrintedDigits", 1);
        setIntField(term1708, term1708.getClass(), "iPrintZeroSetting", 4);
        setIntField(term1708, term1708.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term1708, term1708.getClass(), "iRejectSignedValues", false);
        setField(term1708, term1708.getClass(), "iPrefix", null);
        setField(term1708, term1708.getClass(), "iElementPairs", term1713);
        setBooleanField(term1708, term1708.getClass(), "iNotPrinter", false);
        setBooleanField(term1708, term1708.getClass(), "iNotParser", true);
        setField(term1708, term1708.getClass(), "iFieldFormatters", term1719);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "printZeroAlways", argTypes, term235, args);
        assertTrue(recursiveEquals(term235, term1720));
        assertTrue(recursiveEquals(retValue, term1708));
    }

};


