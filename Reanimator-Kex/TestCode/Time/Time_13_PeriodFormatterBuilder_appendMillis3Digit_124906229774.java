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

public class PeriodFormatterBuilder_appendMillis3Digit_124906229774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term481;
     Object term2708;
     Object term2689;

    public PeriodFormatterBuilder_appendMillis3Digit_124906229774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term486 = new ArrayList();
        term481 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term492 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term481, term481.getClass(), "iMinPrintedDigits", 1);
        setIntField(term481, term481.getClass(), "iPrintZeroSetting", 2);
        setIntField(term481, term481.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term481, term481.getClass(), "iRejectSignedValues", false);
        setField(term481, term481.getClass(), "iPrefix", null);
        setField(term481, term481.getClass(), "iElementPairs", term486);
        setBooleanField(term481, term481.getClass(), "iNotPrinter", true);
        setBooleanField(term481, term481.getClass(), "iNotParser", false);
        setField(term481, term481.getClass(), "iFieldFormatters", term492);
        Object term2711 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        Object[] term2712 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2711, term2711.getClass(), "iMinPrintedDigits", 3);
        setIntField(term2711, term2711.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2711, term2711.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2711, term2711.getClass(), "iRejectSignedValues", false);
        setIntField(term2711, term2711.getClass(), "iFieldType", 7);
        setElement(term2712, 7, term2711);
        setField(term2711, term2711.getClass(), "iFieldFormatters", term2712);
        setField(term2711, term2711.getClass(), "iPrefix", null);
        setField(term2711, term2711.getClass(), "iSuffix", null);
        ArrayList term2709 = new ArrayList();
        ((ArrayList) term2709).add(term2711);
        ((ArrayList) term2709).add(term2711);
        term2708 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term2713 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2708, term2708.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2708, term2708.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2708, term2708.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2708, term2708.getClass(), "iRejectSignedValues", false);
        setField(term2708, term2708.getClass(), "iPrefix", null);
        setField(term2708, term2708.getClass(), "iElementPairs", term2709);
        setBooleanField(term2708, term2708.getClass(), "iNotPrinter", true);
        setBooleanField(term2708, term2708.getClass(), "iNotParser", false);
        setElement(term2713, 7, term2711);
        setField(term2708, term2708.getClass(), "iFieldFormatters", term2713);
        Object term2696 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        Object[] term2702 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2696, term2696.getClass(), "iMinPrintedDigits", 3);
        setIntField(term2696, term2696.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2696, term2696.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2696, term2696.getClass(), "iRejectSignedValues", false);
        setIntField(term2696, term2696.getClass(), "iFieldType", 7);
        setElement(term2702, 7, term2696);
        setField(term2696, term2696.getClass(), "iFieldFormatters", term2702);
        setField(term2696, term2696.getClass(), "iPrefix", null);
        setField(term2696, term2696.getClass(), "iSuffix", null);
        ArrayList term2694 = new ArrayList();
        ((ArrayList) term2694).add(term2696);
        ((ArrayList) term2694).add(term2696);
        term2689 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term2707 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2689, term2689.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2689, term2689.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2689, term2689.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2689, term2689.getClass(), "iRejectSignedValues", false);
        setField(term2689, term2689.getClass(), "iPrefix", null);
        setField(term2689, term2689.getClass(), "iElementPairs", term2694);
        setBooleanField(term2689, term2689.getClass(), "iNotPrinter", true);
        setBooleanField(term2689, term2689.getClass(), "iNotParser", false);
        setElement(term2707, 7, term2696);
        setField(term2689, term2689.getClass(), "iFieldFormatters", term2707);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "appendMillis3Digit", argTypes, term481, args);
        assertTrue(recursiveEquals(term481, term2708));
        assertTrue(recursiveEquals(retValue, term2689));
    }

};


