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

public class PeriodFormatterBuilder_appendSeparator_67308933780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term625;
     Object term4390;
     Object term4350;

    public PeriodFormatterBuilder_appendSeparator_67308933780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term630 = new ArrayList();
        term625 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term636 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term625, term625.getClass(), "iMinPrintedDigits", 1);
        setIntField(term625, term625.getClass(), "iPrintZeroSetting", 2);
        setIntField(term625, term625.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term625, term625.getClass(), "iRejectSignedValues", false);
        setField(term625, term625.getClass(), "iPrefix", null);
        setField(term625, term625.getClass(), "iElementPairs", term630);
        setBooleanField(term625, term625.getClass(), "iNotPrinter", true);
        setBooleanField(term625, term625.getClass(), "iNotParser", true);
        setField(term625, term625.getClass(), "iFieldFormatters", term636);
        ArrayList term4391 = new ArrayList();
        term4390 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term4393 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term4390, term4390.getClass(), "iMinPrintedDigits", 1);
        setIntField(term4390, term4390.getClass(), "iPrintZeroSetting", 2);
        setIntField(term4390, term4390.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term4390, term4390.getClass(), "iRejectSignedValues", false);
        setField(term4390, term4390.getClass(), "iPrefix", null);
        setField(term4390, term4390.getClass(), "iElementPairs", term4391);
        setBooleanField(term4390, term4390.getClass(), "iNotPrinter", true);
        setBooleanField(term4390, term4390.getClass(), "iNotParser", true);
        setField(term4390, term4390.getClass(), "iFieldFormatters", term4393);
        ArrayList term4355 = new ArrayList();
        term4350 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term4361 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term4350, term4350.getClass(), "iMinPrintedDigits", 1);
        setIntField(term4350, term4350.getClass(), "iPrintZeroSetting", 2);
        setIntField(term4350, term4350.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term4350, term4350.getClass(), "iRejectSignedValues", false);
        setField(term4350, term4350.getClass(), "iPrefix", null);
        setField(term4350, term4350.getClass(), "iElementPairs", term4355);
        setBooleanField(term4350, term4350.getClass(), "iNotPrinter", true);
        setBooleanField(term4350, term4350.getClass(), "iNotParser", true);
        setField(term4350, term4350.getClass(), "iFieldFormatters", term4361);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oVcInYnLWB";
        Object retValue = callMethod(klass, "appendSeparator", argTypes, term625, args);
        assertTrue(recursiveEquals(term625, term4390));
        assertTrue(recursiveEquals(retValue, term4350));
    }

};


