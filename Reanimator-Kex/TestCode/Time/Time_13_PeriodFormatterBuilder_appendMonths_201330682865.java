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

public class PeriodFormatterBuilder_appendMonths_201330682865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term373;
     Object term2348;
     Object term2329;

    public PeriodFormatterBuilder_appendMonths_201330682865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term378 = new ArrayList();
        term373 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term384 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term373, term373.getClass(), "iMinPrintedDigits", 1);
        setIntField(term373, term373.getClass(), "iPrintZeroSetting", 2);
        setIntField(term373, term373.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term373, term373.getClass(), "iRejectSignedValues", false);
        setField(term373, term373.getClass(), "iPrefix", null);
        setField(term373, term373.getClass(), "iElementPairs", term378);
        setBooleanField(term373, term373.getClass(), "iNotPrinter", false);
        setBooleanField(term373, term373.getClass(), "iNotParser", false);
        setField(term373, term373.getClass(), "iFieldFormatters", term384);
        Object term2351 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        Object[] term2352 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2351, term2351.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2351, term2351.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2351, term2351.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2351, term2351.getClass(), "iRejectSignedValues", false);
        setIntField(term2351, term2351.getClass(), "iFieldType", 1);
        setElement(term2352, 1, term2351);
        setField(term2351, term2351.getClass(), "iFieldFormatters", term2352);
        setField(term2351, term2351.getClass(), "iPrefix", null);
        setField(term2351, term2351.getClass(), "iSuffix", null);
        ArrayList term2349 = new ArrayList();
        ((ArrayList) term2349).add(term2351);
        ((ArrayList) term2349).add(term2351);
        term2348 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term2353 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2348, term2348.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2348, term2348.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2348, term2348.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2348, term2348.getClass(), "iRejectSignedValues", false);
        setField(term2348, term2348.getClass(), "iPrefix", null);
        setField(term2348, term2348.getClass(), "iElementPairs", term2349);
        setBooleanField(term2348, term2348.getClass(), "iNotPrinter", false);
        setBooleanField(term2348, term2348.getClass(), "iNotParser", false);
        setElement(term2353, 1, term2351);
        setField(term2348, term2348.getClass(), "iFieldFormatters", term2353);
        Object term2336 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        Object[] term2342 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2336, term2336.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2336, term2336.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2336, term2336.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2336, term2336.getClass(), "iRejectSignedValues", false);
        setIntField(term2336, term2336.getClass(), "iFieldType", 1);
        setElement(term2342, 1, term2336);
        setField(term2336, term2336.getClass(), "iFieldFormatters", term2342);
        setField(term2336, term2336.getClass(), "iPrefix", null);
        setField(term2336, term2336.getClass(), "iSuffix", null);
        ArrayList term2334 = new ArrayList();
        ((ArrayList) term2334).add(term2336);
        ((ArrayList) term2334).add(term2336);
        term2329 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term2347 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2329, term2329.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2329, term2329.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2329, term2329.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2329, term2329.getClass(), "iRejectSignedValues", false);
        setField(term2329, term2329.getClass(), "iPrefix", null);
        setField(term2329, term2329.getClass(), "iElementPairs", term2334);
        setBooleanField(term2329, term2329.getClass(), "iNotPrinter", false);
        setBooleanField(term2329, term2329.getClass(), "iNotParser", false);
        setElement(term2347, 1, term2336);
        setField(term2329, term2329.getClass(), "iFieldFormatters", term2347);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "appendMonths", argTypes, term373, args);
        assertTrue(recursiveEquals(term373, term2348));
        assertTrue(recursiveEquals(retValue, term2329));
    }

};


