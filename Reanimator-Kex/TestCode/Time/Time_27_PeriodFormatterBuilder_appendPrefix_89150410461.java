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

public class PeriodFormatterBuilder_appendPrefix_89150410461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259;
     Object term1793;
     Object term1768;

    public PeriodFormatterBuilder_appendPrefix_89150410461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term264 = new ArrayList();
        term259 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term270 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term259, term259.getClass(), "iMinPrintedDigits", 1);
        setIntField(term259, term259.getClass(), "iPrintZeroSetting", 2);
        setIntField(term259, term259.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term259, term259.getClass(), "iRejectSignedValues", true);
        setField(term259, term259.getClass(), "iPrefix", null);
        setField(term259, term259.getClass(), "iElementPairs", term264);
        setBooleanField(term259, term259.getClass(), "iNotPrinter", true);
        setBooleanField(term259, term259.getClass(), "iNotParser", false);
        setField(term259, term259.getClass(), "iFieldFormatters", term270);
        ArrayList term1797 = new ArrayList();
        term1793 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object term1794 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        Object[] term1799 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term1793, term1793.getClass(), "iMinPrintedDigits", 1);
        setIntField(term1793, term1793.getClass(), "iPrintZeroSetting", 2);
        setIntField(term1793, term1793.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term1793, term1793.getClass(), "iRejectSignedValues", true);
        setField(term1794, term1794.getClass(), "iText", "hRNSzYYIrc");
        setField(term1793, term1793.getClass(), "iPrefix", term1794);
        setField(term1793, term1793.getClass(), "iElementPairs", term1797);
        setBooleanField(term1793, term1793.getClass(), "iNotPrinter", true);
        setBooleanField(term1793, term1793.getClass(), "iNotParser", false);
        setField(term1793, term1793.getClass(), "iFieldFormatters", term1799);
        ArrayList term1786 = new ArrayList();
        term1768 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object term1773 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        Object[] term1792 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term1768, term1768.getClass(), "iMinPrintedDigits", 1);
        setIntField(term1768, term1768.getClass(), "iPrintZeroSetting", 2);
        setIntField(term1768, term1768.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term1768, term1768.getClass(), "iRejectSignedValues", true);
        setField(term1773, term1773.getClass(), "iText", "hRNSzYYIrc");
        setField(term1768, term1768.getClass(), "iPrefix", term1773);
        setField(term1768, term1768.getClass(), "iElementPairs", term1786);
        setBooleanField(term1768, term1768.getClass(), "iNotPrinter", true);
        setBooleanField(term1768, term1768.getClass(), "iNotParser", false);
        setField(term1768, term1768.getClass(), "iFieldFormatters", term1792);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hRNSzYYIrc";
        Object retValue = callMethod(klass, "appendPrefix", argTypes, term259, args);
        assertTrue(recursiveEquals(term259, term1793));
        assertTrue(recursiveEquals(retValue, term1768));
    }

};


