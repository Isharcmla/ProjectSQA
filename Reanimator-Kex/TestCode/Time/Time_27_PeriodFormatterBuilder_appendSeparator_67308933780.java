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
     Object term4389;
     Object term4349;

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
        ArrayList term4390 = new ArrayList();
        term4389 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term4392 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term4389, term4389.getClass(), "iMinPrintedDigits", 1);
        setIntField(term4389, term4389.getClass(), "iPrintZeroSetting", 2);
        setIntField(term4389, term4389.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term4389, term4389.getClass(), "iRejectSignedValues", false);
        setField(term4389, term4389.getClass(), "iPrefix", null);
        setField(term4389, term4389.getClass(), "iElementPairs", term4390);
        setBooleanField(term4389, term4389.getClass(), "iNotPrinter", true);
        setBooleanField(term4389, term4389.getClass(), "iNotParser", true);
        setField(term4389, term4389.getClass(), "iFieldFormatters", term4392);
        ArrayList term4354 = new ArrayList();
        term4349 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term4360 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term4349, term4349.getClass(), "iMinPrintedDigits", 1);
        setIntField(term4349, term4349.getClass(), "iPrintZeroSetting", 2);
        setIntField(term4349, term4349.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term4349, term4349.getClass(), "iRejectSignedValues", false);
        setField(term4349, term4349.getClass(), "iPrefix", null);
        setField(term4349, term4349.getClass(), "iElementPairs", term4354);
        setBooleanField(term4349, term4349.getClass(), "iNotPrinter", true);
        setBooleanField(term4349, term4349.getClass(), "iNotParser", true);
        setField(term4349, term4349.getClass(), "iFieldFormatters", term4360);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oVcInYnLWB";
        Object retValue = callMethod(klass, "appendSeparator", argTypes, term625, args);
        assertTrue(recursiveEquals(term625, term4389));
        assertTrue(recursiveEquals(retValue, term4349));
    }

};


