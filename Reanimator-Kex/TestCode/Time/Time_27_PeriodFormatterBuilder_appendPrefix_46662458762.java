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

public class PeriodFormatterBuilder_appendPrefix_46662458762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293;
     Object term1932;
     Object term1895;

    public PeriodFormatterBuilder_appendPrefix_46662458762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term298 = new ArrayList();
        term293 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term304 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term293, term293.getClass(), "iMinPrintedDigits", 1);
        setIntField(term293, term293.getClass(), "iPrintZeroSetting", 2);
        setIntField(term293, term293.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term293, term293.getClass(), "iRejectSignedValues", true);
        setField(term293, term293.getClass(), "iPrefix", null);
        setField(term293, term293.getClass(), "iElementPairs", term298);
        setBooleanField(term293, term293.getClass(), "iNotPrinter", false);
        setBooleanField(term293, term293.getClass(), "iNotParser", false);
        setField(term293, term293.getClass(), "iFieldFormatters", term304);
        ArrayList term1938 = new ArrayList();
        term1932 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object term1933 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$PluralAffix"));
        Object[] term1940 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term1932, term1932.getClass(), "iMinPrintedDigits", 1);
        setIntField(term1932, term1932.getClass(), "iPrintZeroSetting", 2);
        setIntField(term1932, term1932.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term1932, term1932.getClass(), "iRejectSignedValues", true);
        setField(term1933, term1933.getClass(), "iSingularText", "RMFIsYGgne");
        setField(term1933, term1933.getClass(), "iPluralText", "NRdvgJlhkX");
        setField(term1932, term1932.getClass(), "iPrefix", term1933);
        setField(term1932, term1932.getClass(), "iElementPairs", term1938);
        setBooleanField(term1932, term1932.getClass(), "iNotPrinter", false);
        setBooleanField(term1932, term1932.getClass(), "iNotParser", false);
        setField(term1932, term1932.getClass(), "iFieldFormatters", term1940);
        ArrayList term1925 = new ArrayList();
        term1895 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object term1900 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$PluralAffix"));
        Object[] term1931 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term1895, term1895.getClass(), "iMinPrintedDigits", 1);
        setIntField(term1895, term1895.getClass(), "iPrintZeroSetting", 2);
        setIntField(term1895, term1895.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term1895, term1895.getClass(), "iRejectSignedValues", true);
        setField(term1900, term1900.getClass(), "iSingularText", "RMFIsYGgne");
        setField(term1900, term1900.getClass(), "iPluralText", "NRdvgJlhkX");
        setField(term1895, term1895.getClass(), "iPrefix", term1900);
        setField(term1895, term1895.getClass(), "iElementPairs", term1925);
        setBooleanField(term1895, term1895.getClass(), "iNotPrinter", false);
        setBooleanField(term1895, term1895.getClass(), "iNotParser", false);
        setField(term1895, term1895.getClass(), "iFieldFormatters", term1931);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "RMFIsYGgne";
        args[1] = "NRdvgJlhkX";
        Object retValue = callMethod(klass, "appendPrefix", argTypes, term293, args);
        assertTrue(recursiveEquals(term293, term1932));
        assertTrue(recursiveEquals(retValue, term1895));
    }

};


