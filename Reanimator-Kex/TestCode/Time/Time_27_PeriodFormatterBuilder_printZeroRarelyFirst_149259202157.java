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

public class PeriodFormatterBuilder_printZeroRarelyFirst_149259202157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211;
     Object term1688;
     Object term1676;

    public PeriodFormatterBuilder_printZeroRarelyFirst_149259202157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term216 = new ArrayList();
        term211 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term222 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term211, term211.getClass(), "iMinPrintedDigits", 1);
        setIntField(term211, term211.getClass(), "iPrintZeroSetting", 2);
        setIntField(term211, term211.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term211, term211.getClass(), "iRejectSignedValues", false);
        setField(term211, term211.getClass(), "iPrefix", null);
        setField(term211, term211.getClass(), "iElementPairs", term216);
        setBooleanField(term211, term211.getClass(), "iNotPrinter", true);
        setBooleanField(term211, term211.getClass(), "iNotParser", true);
        setField(term211, term211.getClass(), "iFieldFormatters", term222);
        ArrayList term1689 = new ArrayList();
        term1688 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term1691 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term1688, term1688.getClass(), "iMinPrintedDigits", 1);
        setIntField(term1688, term1688.getClass(), "iPrintZeroSetting", 1);
        setIntField(term1688, term1688.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term1688, term1688.getClass(), "iRejectSignedValues", false);
        setField(term1688, term1688.getClass(), "iPrefix", null);
        setField(term1688, term1688.getClass(), "iElementPairs", term1689);
        setBooleanField(term1688, term1688.getClass(), "iNotPrinter", true);
        setBooleanField(term1688, term1688.getClass(), "iNotParser", true);
        setField(term1688, term1688.getClass(), "iFieldFormatters", term1691);
        ArrayList term1681 = new ArrayList();
        term1676 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term1687 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term1676, term1676.getClass(), "iMinPrintedDigits", 1);
        setIntField(term1676, term1676.getClass(), "iPrintZeroSetting", 1);
        setIntField(term1676, term1676.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term1676, term1676.getClass(), "iRejectSignedValues", false);
        setField(term1676, term1676.getClass(), "iPrefix", null);
        setField(term1676, term1676.getClass(), "iElementPairs", term1681);
        setBooleanField(term1676, term1676.getClass(), "iNotPrinter", true);
        setBooleanField(term1676, term1676.getClass(), "iNotParser", true);
        setField(term1676, term1676.getClass(), "iFieldFormatters", term1687);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "printZeroRarelyFirst", argTypes, term211, args);
        assertTrue(recursiveEquals(term211, term1688));
        assertTrue(recursiveEquals(retValue, term1676));
    }

};


