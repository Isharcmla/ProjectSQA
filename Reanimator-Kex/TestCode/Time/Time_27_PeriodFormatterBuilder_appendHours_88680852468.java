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

public class PeriodFormatterBuilder_appendHours_88680852468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409;
     Object term2468;
     Object term2449;

    public PeriodFormatterBuilder_appendHours_88680852468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term414 = new ArrayList();
        term409 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term420 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term409, term409.getClass(), "iMinPrintedDigits", 1);
        setIntField(term409, term409.getClass(), "iPrintZeroSetting", 2);
        setIntField(term409, term409.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term409, term409.getClass(), "iRejectSignedValues", true);
        setField(term409, term409.getClass(), "iPrefix", null);
        setField(term409, term409.getClass(), "iElementPairs", term414);
        setBooleanField(term409, term409.getClass(), "iNotPrinter", true);
        setBooleanField(term409, term409.getClass(), "iNotParser", false);
        setField(term409, term409.getClass(), "iFieldFormatters", term420);
        Object term2471 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        Object[] term2472 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2471, term2471.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2471, term2471.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2471, term2471.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2471, term2471.getClass(), "iRejectSignedValues", true);
        setIntField(term2471, term2471.getClass(), "iFieldType", 4);
        setElement(term2472, 4, term2471);
        setField(term2471, term2471.getClass(), "iFieldFormatters", term2472);
        setField(term2471, term2471.getClass(), "iPrefix", null);
        setField(term2471, term2471.getClass(), "iSuffix", null);
        ArrayList term2469 = new ArrayList();
        ((ArrayList) term2469).add(term2471);
        ((ArrayList) term2469).add(term2471);
        term2468 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term2473 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2468, term2468.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2468, term2468.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2468, term2468.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2468, term2468.getClass(), "iRejectSignedValues", true);
        setField(term2468, term2468.getClass(), "iPrefix", null);
        setField(term2468, term2468.getClass(), "iElementPairs", term2469);
        setBooleanField(term2468, term2468.getClass(), "iNotPrinter", true);
        setBooleanField(term2468, term2468.getClass(), "iNotParser", false);
        setElement(term2473, 4, term2471);
        setField(term2468, term2468.getClass(), "iFieldFormatters", term2473);
        Object term2456 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        Object[] term2462 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2456, term2456.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2456, term2456.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2456, term2456.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2456, term2456.getClass(), "iRejectSignedValues", true);
        setIntField(term2456, term2456.getClass(), "iFieldType", 4);
        setElement(term2462, 4, term2456);
        setField(term2456, term2456.getClass(), "iFieldFormatters", term2462);
        setField(term2456, term2456.getClass(), "iPrefix", null);
        setField(term2456, term2456.getClass(), "iSuffix", null);
        ArrayList term2454 = new ArrayList();
        ((ArrayList) term2454).add(term2456);
        ((ArrayList) term2454).add(term2456);
        term2449 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term2467 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2449, term2449.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2449, term2449.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2449, term2449.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2449, term2449.getClass(), "iRejectSignedValues", true);
        setField(term2449, term2449.getClass(), "iPrefix", null);
        setField(term2449, term2449.getClass(), "iElementPairs", term2454);
        setBooleanField(term2449, term2449.getClass(), "iNotPrinter", true);
        setBooleanField(term2449, term2449.getClass(), "iNotParser", false);
        setElement(term2467, 4, term2456);
        setField(term2449, term2449.getClass(), "iFieldFormatters", term2467);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "appendHours", argTypes, term409, args);
        assertTrue(recursiveEquals(term409, term2468));
        assertTrue(recursiveEquals(retValue, term2449));
    }

};


