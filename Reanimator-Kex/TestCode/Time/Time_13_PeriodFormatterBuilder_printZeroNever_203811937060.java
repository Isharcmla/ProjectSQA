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

public class PeriodFormatterBuilder_printZeroNever_203811937060 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247;
     Object term1736;
     Object term1724;

    public PeriodFormatterBuilder_printZeroNever_203811937060() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term252 = new ArrayList();
        term247 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term258 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term247, term247.getClass(), "iMinPrintedDigits", 1);
        setIntField(term247, term247.getClass(), "iPrintZeroSetting", 2);
        setIntField(term247, term247.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term247, term247.getClass(), "iRejectSignedValues", true);
        setField(term247, term247.getClass(), "iPrefix", null);
        setField(term247, term247.getClass(), "iElementPairs", term252);
        setBooleanField(term247, term247.getClass(), "iNotPrinter", false);
        setBooleanField(term247, term247.getClass(), "iNotParser", true);
        setField(term247, term247.getClass(), "iFieldFormatters", term258);
        ArrayList term1737 = new ArrayList();
        term1736 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term1739 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term1736, term1736.getClass(), "iMinPrintedDigits", 1);
        setIntField(term1736, term1736.getClass(), "iPrintZeroSetting", 5);
        setIntField(term1736, term1736.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term1736, term1736.getClass(), "iRejectSignedValues", true);
        setField(term1736, term1736.getClass(), "iPrefix", null);
        setField(term1736, term1736.getClass(), "iElementPairs", term1737);
        setBooleanField(term1736, term1736.getClass(), "iNotPrinter", false);
        setBooleanField(term1736, term1736.getClass(), "iNotParser", true);
        setField(term1736, term1736.getClass(), "iFieldFormatters", term1739);
        ArrayList term1729 = new ArrayList();
        term1724 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term1735 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term1724, term1724.getClass(), "iMinPrintedDigits", 1);
        setIntField(term1724, term1724.getClass(), "iPrintZeroSetting", 5);
        setIntField(term1724, term1724.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term1724, term1724.getClass(), "iRejectSignedValues", true);
        setField(term1724, term1724.getClass(), "iPrefix", null);
        setField(term1724, term1724.getClass(), "iElementPairs", term1729);
        setBooleanField(term1724, term1724.getClass(), "iNotPrinter", false);
        setBooleanField(term1724, term1724.getClass(), "iNotParser", true);
        setField(term1724, term1724.getClass(), "iFieldFormatters", term1735);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "printZeroNever", argTypes, term247, args);
        assertTrue(recursiveEquals(term247, term1736));
        assertTrue(recursiveEquals(retValue, term1724));
    }

};


