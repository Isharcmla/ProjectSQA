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
import java.lang.Boolean;

public class PeriodFormatterBuilder_rejectSignedValues_73836092655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185;
     Object term197;
     Object term1656;
     Object term1643;

    public PeriodFormatterBuilder_rejectSignedValues_73836092655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term190 = new ArrayList();
        term185 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term196 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term185, term185.getClass(), "iMinPrintedDigits", 1);
        setIntField(term185, term185.getClass(), "iPrintZeroSetting", 2);
        setIntField(term185, term185.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term185, term185.getClass(), "iRejectSignedValues", false);
        setField(term185, term185.getClass(), "iPrefix", null);
        setField(term185, term185.getClass(), "iElementPairs", term190);
        setBooleanField(term185, term185.getClass(), "iNotPrinter", true);
        setBooleanField(term185, term185.getClass(), "iNotParser", true);
        setField(term185, term185.getClass(), "iFieldFormatters", term196);
        term197 = new Boolean(true);
        ArrayList term1657 = new ArrayList();
        term1656 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term1659 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term1656, term1656.getClass(), "iMinPrintedDigits", 1);
        setIntField(term1656, term1656.getClass(), "iPrintZeroSetting", 2);
        setIntField(term1656, term1656.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term1656, term1656.getClass(), "iRejectSignedValues", true);
        setField(term1656, term1656.getClass(), "iPrefix", null);
        setField(term1656, term1656.getClass(), "iElementPairs", term1657);
        setBooleanField(term1656, term1656.getClass(), "iNotPrinter", true);
        setBooleanField(term1656, term1656.getClass(), "iNotParser", true);
        setField(term1656, term1656.getClass(), "iFieldFormatters", term1659);
        ArrayList term1648 = new ArrayList();
        term1643 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term1654 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term1643, term1643.getClass(), "iMinPrintedDigits", 1);
        setIntField(term1643, term1643.getClass(), "iPrintZeroSetting", 2);
        setIntField(term1643, term1643.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term1643, term1643.getClass(), "iRejectSignedValues", true);
        setField(term1643, term1643.getClass(), "iPrefix", null);
        setField(term1643, term1643.getClass(), "iElementPairs", term1648);
        setBooleanField(term1643, term1643.getClass(), "iNotPrinter", true);
        setBooleanField(term1643, term1643.getClass(), "iNotParser", true);
        setField(term1643, term1643.getClass(), "iFieldFormatters", term1654);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term197;
        Object retValue = callMethod(klass, "rejectSignedValues", argTypes, term185, args);
        assertTrue(recursiveEquals(term185, term1656));
        assertTrue(recursiveEquals(term197, true));
        assertTrue(recursiveEquals(retValue, term1643));
    }

};


