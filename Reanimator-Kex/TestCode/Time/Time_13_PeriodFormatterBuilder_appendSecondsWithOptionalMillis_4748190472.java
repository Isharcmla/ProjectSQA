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

public class PeriodFormatterBuilder_appendSecondsWithOptionalMillis_4748190472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term457;
     Object term2628;
     Object term2609;

    public PeriodFormatterBuilder_appendSecondsWithOptionalMillis_4748190472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term462 = new ArrayList();
        term457 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term468 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term457, term457.getClass(), "iMinPrintedDigits", 1);
        setIntField(term457, term457.getClass(), "iPrintZeroSetting", 2);
        setIntField(term457, term457.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term457, term457.getClass(), "iRejectSignedValues", true);
        setField(term457, term457.getClass(), "iPrefix", null);
        setField(term457, term457.getClass(), "iElementPairs", term462);
        setBooleanField(term457, term457.getClass(), "iNotPrinter", false);
        setBooleanField(term457, term457.getClass(), "iNotParser", false);
        setField(term457, term457.getClass(), "iFieldFormatters", term468);
        Object term2631 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        Object[] term2632 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2631, term2631.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2631, term2631.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2631, term2631.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2631, term2631.getClass(), "iRejectSignedValues", true);
        setIntField(term2631, term2631.getClass(), "iFieldType", 9);
        setElement(term2632, 9, term2631);
        setField(term2631, term2631.getClass(), "iFieldFormatters", term2632);
        setField(term2631, term2631.getClass(), "iPrefix", null);
        setField(term2631, term2631.getClass(), "iSuffix", null);
        ArrayList term2629 = new ArrayList();
        ((ArrayList) term2629).add(term2631);
        ((ArrayList) term2629).add(term2631);
        term2628 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term2633 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2628, term2628.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2628, term2628.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2628, term2628.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2628, term2628.getClass(), "iRejectSignedValues", true);
        setField(term2628, term2628.getClass(), "iPrefix", null);
        setField(term2628, term2628.getClass(), "iElementPairs", term2629);
        setBooleanField(term2628, term2628.getClass(), "iNotPrinter", false);
        setBooleanField(term2628, term2628.getClass(), "iNotParser", false);
        setElement(term2633, 9, term2631);
        setField(term2628, term2628.getClass(), "iFieldFormatters", term2633);
        Object term2616 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        Object[] term2622 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2616, term2616.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2616, term2616.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2616, term2616.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2616, term2616.getClass(), "iRejectSignedValues", true);
        setIntField(term2616, term2616.getClass(), "iFieldType", 9);
        setElement(term2622, 9, term2616);
        setField(term2616, term2616.getClass(), "iFieldFormatters", term2622);
        setField(term2616, term2616.getClass(), "iPrefix", null);
        setField(term2616, term2616.getClass(), "iSuffix", null);
        ArrayList term2614 = new ArrayList();
        ((ArrayList) term2614).add(term2616);
        ((ArrayList) term2614).add(term2616);
        term2609 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term2627 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2609, term2609.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2609, term2609.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2609, term2609.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2609, term2609.getClass(), "iRejectSignedValues", true);
        setField(term2609, term2609.getClass(), "iPrefix", null);
        setField(term2609, term2609.getClass(), "iElementPairs", term2614);
        setBooleanField(term2609, term2609.getClass(), "iNotPrinter", false);
        setBooleanField(term2609, term2609.getClass(), "iNotParser", false);
        setElement(term2627, 9, term2616);
        setField(term2609, term2609.getClass(), "iFieldFormatters", term2627);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "appendSecondsWithOptionalMillis", argTypes, term457, args);
        assertTrue(recursiveEquals(term457, term2628));
        assertTrue(recursiveEquals(retValue, term2609));
    }

};


