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

public class PeriodFormatterBuilder_appendMillis_91863535973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term469;
     Object term2668;
     Object term2649;

    public PeriodFormatterBuilder_appendMillis_91863535973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term474 = new ArrayList();
        term469 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term480 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term469, term469.getClass(), "iMinPrintedDigits", 1);
        setIntField(term469, term469.getClass(), "iPrintZeroSetting", 2);
        setIntField(term469, term469.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term469, term469.getClass(), "iRejectSignedValues", true);
        setField(term469, term469.getClass(), "iPrefix", null);
        setField(term469, term469.getClass(), "iElementPairs", term474);
        setBooleanField(term469, term469.getClass(), "iNotPrinter", false);
        setBooleanField(term469, term469.getClass(), "iNotParser", true);
        setField(term469, term469.getClass(), "iFieldFormatters", term480);
        Object term2671 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        Object[] term2672 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2671, term2671.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2671, term2671.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2671, term2671.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2671, term2671.getClass(), "iRejectSignedValues", true);
        setIntField(term2671, term2671.getClass(), "iFieldType", 7);
        setElement(term2672, 7, term2671);
        setField(term2671, term2671.getClass(), "iFieldFormatters", term2672);
        setField(term2671, term2671.getClass(), "iPrefix", null);
        setField(term2671, term2671.getClass(), "iSuffix", null);
        ArrayList term2669 = new ArrayList();
        ((ArrayList) term2669).add(term2671);
        ((ArrayList) term2669).add(term2671);
        term2668 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term2673 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2668, term2668.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2668, term2668.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2668, term2668.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2668, term2668.getClass(), "iRejectSignedValues", true);
        setField(term2668, term2668.getClass(), "iPrefix", null);
        setField(term2668, term2668.getClass(), "iElementPairs", term2669);
        setBooleanField(term2668, term2668.getClass(), "iNotPrinter", false);
        setBooleanField(term2668, term2668.getClass(), "iNotParser", true);
        setElement(term2673, 7, term2671);
        setField(term2668, term2668.getClass(), "iFieldFormatters", term2673);
        Object term2656 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        Object[] term2662 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2656, term2656.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2656, term2656.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2656, term2656.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2656, term2656.getClass(), "iRejectSignedValues", true);
        setIntField(term2656, term2656.getClass(), "iFieldType", 7);
        setElement(term2662, 7, term2656);
        setField(term2656, term2656.getClass(), "iFieldFormatters", term2662);
        setField(term2656, term2656.getClass(), "iPrefix", null);
        setField(term2656, term2656.getClass(), "iSuffix", null);
        ArrayList term2654 = new ArrayList();
        ((ArrayList) term2654).add(term2656);
        ((ArrayList) term2654).add(term2656);
        term2649 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term2667 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2649, term2649.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2649, term2649.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2649, term2649.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2649, term2649.getClass(), "iRejectSignedValues", true);
        setField(term2649, term2649.getClass(), "iPrefix", null);
        setField(term2649, term2649.getClass(), "iElementPairs", term2654);
        setBooleanField(term2649, term2649.getClass(), "iNotPrinter", false);
        setBooleanField(term2649, term2649.getClass(), "iNotParser", true);
        setElement(term2667, 7, term2656);
        setField(term2649, term2649.getClass(), "iFieldFormatters", term2667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "appendMillis", argTypes, term469, args);
        assertTrue(recursiveEquals(term469, term2668));
        assertTrue(recursiveEquals(retValue, term2649));
    }

};


