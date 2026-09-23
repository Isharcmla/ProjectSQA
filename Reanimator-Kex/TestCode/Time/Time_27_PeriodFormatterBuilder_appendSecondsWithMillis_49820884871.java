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

public class PeriodFormatterBuilder_appendSecondsWithMillis_49820884871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term445;
     Object term2588;
     Object term2569;

    public PeriodFormatterBuilder_appendSecondsWithMillis_49820884871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term450 = new ArrayList();
        term445 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term456 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term445, term445.getClass(), "iMinPrintedDigits", 1);
        setIntField(term445, term445.getClass(), "iPrintZeroSetting", 2);
        setIntField(term445, term445.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term445, term445.getClass(), "iRejectSignedValues", true);
        setField(term445, term445.getClass(), "iPrefix", null);
        setField(term445, term445.getClass(), "iElementPairs", term450);
        setBooleanField(term445, term445.getClass(), "iNotPrinter", false);
        setBooleanField(term445, term445.getClass(), "iNotParser", false);
        setField(term445, term445.getClass(), "iFieldFormatters", term456);
        Object term2591 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        Object[] term2592 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2591, term2591.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2591, term2591.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2591, term2591.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2591, term2591.getClass(), "iRejectSignedValues", true);
        setIntField(term2591, term2591.getClass(), "iFieldType", 8);
        setElement(term2592, 8, term2591);
        setField(term2591, term2591.getClass(), "iFieldFormatters", term2592);
        setField(term2591, term2591.getClass(), "iPrefix", null);
        setField(term2591, term2591.getClass(), "iSuffix", null);
        ArrayList term2589 = new ArrayList();
        ((ArrayList) term2589).add(term2591);
        ((ArrayList) term2589).add(term2591);
        term2588 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term2593 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2588, term2588.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2588, term2588.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2588, term2588.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2588, term2588.getClass(), "iRejectSignedValues", true);
        setField(term2588, term2588.getClass(), "iPrefix", null);
        setField(term2588, term2588.getClass(), "iElementPairs", term2589);
        setBooleanField(term2588, term2588.getClass(), "iNotPrinter", false);
        setBooleanField(term2588, term2588.getClass(), "iNotParser", false);
        setElement(term2593, 8, term2591);
        setField(term2588, term2588.getClass(), "iFieldFormatters", term2593);
        Object term2576 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        Object[] term2582 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2576, term2576.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2576, term2576.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2576, term2576.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2576, term2576.getClass(), "iRejectSignedValues", true);
        setIntField(term2576, term2576.getClass(), "iFieldType", 8);
        setElement(term2582, 8, term2576);
        setField(term2576, term2576.getClass(), "iFieldFormatters", term2582);
        setField(term2576, term2576.getClass(), "iPrefix", null);
        setField(term2576, term2576.getClass(), "iSuffix", null);
        ArrayList term2574 = new ArrayList();
        ((ArrayList) term2574).add(term2576);
        ((ArrayList) term2574).add(term2576);
        term2569 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term2587 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2569, term2569.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2569, term2569.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2569, term2569.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2569, term2569.getClass(), "iRejectSignedValues", true);
        setField(term2569, term2569.getClass(), "iPrefix", null);
        setField(term2569, term2569.getClass(), "iElementPairs", term2574);
        setBooleanField(term2569, term2569.getClass(), "iNotPrinter", false);
        setBooleanField(term2569, term2569.getClass(), "iNotParser", false);
        setElement(term2587, 8, term2576);
        setField(term2569, term2569.getClass(), "iFieldFormatters", term2587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "appendSecondsWithMillis", argTypes, term445, args);
        assertTrue(recursiveEquals(term445, term2588));
        assertTrue(recursiveEquals(retValue, term2569));
    }

};


