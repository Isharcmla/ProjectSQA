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
import java.lang.Integer;

public class PeriodFormatterBuilder_maximumParsedDigits_11128159254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171;
     Object term183;
     Object term1639;
     Object term1626;

    public PeriodFormatterBuilder_maximumParsedDigits_11128159254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term176 = new ArrayList();
        term171 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term182 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term171, term171.getClass(), "iMinPrintedDigits", 1);
        setIntField(term171, term171.getClass(), "iPrintZeroSetting", 2);
        setIntField(term171, term171.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term171, term171.getClass(), "iRejectSignedValues", true);
        setField(term171, term171.getClass(), "iPrefix", null);
        setField(term171, term171.getClass(), "iElementPairs", term176);
        setBooleanField(term171, term171.getClass(), "iNotPrinter", false);
        setBooleanField(term171, term171.getClass(), "iNotParser", false);
        setField(term171, term171.getClass(), "iFieldFormatters", term182);
        term183 = new Integer(679763016);
        ArrayList term1640 = new ArrayList();
        term1639 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term1642 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term1639, term1639.getClass(), "iMinPrintedDigits", 1);
        setIntField(term1639, term1639.getClass(), "iPrintZeroSetting", 2);
        setIntField(term1639, term1639.getClass(), "iMaxParsedDigits", 679763016);
        setBooleanField(term1639, term1639.getClass(), "iRejectSignedValues", true);
        setField(term1639, term1639.getClass(), "iPrefix", null);
        setField(term1639, term1639.getClass(), "iElementPairs", term1640);
        setBooleanField(term1639, term1639.getClass(), "iNotPrinter", false);
        setBooleanField(term1639, term1639.getClass(), "iNotParser", false);
        setField(term1639, term1639.getClass(), "iFieldFormatters", term1642);
        ArrayList term1631 = new ArrayList();
        term1626 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term1637 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term1626, term1626.getClass(), "iMinPrintedDigits", 1);
        setIntField(term1626, term1626.getClass(), "iPrintZeroSetting", 2);
        setIntField(term1626, term1626.getClass(), "iMaxParsedDigits", 679763016);
        setBooleanField(term1626, term1626.getClass(), "iRejectSignedValues", true);
        setField(term1626, term1626.getClass(), "iPrefix", null);
        setField(term1626, term1626.getClass(), "iElementPairs", term1631);
        setBooleanField(term1626, term1626.getClass(), "iNotPrinter", false);
        setBooleanField(term1626, term1626.getClass(), "iNotParser", false);
        setField(term1626, term1626.getClass(), "iFieldFormatters", term1637);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term183;
        Object retValue = callMethod(klass, "maximumParsedDigits", argTypes, term171, args);
        assertTrue(recursiveEquals(term171, term1639));
        assertTrue(recursiveEquals(term183, 679763016));
        assertTrue(recursiveEquals(retValue, term1626));
    }

};


