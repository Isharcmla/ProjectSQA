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

public class PeriodFormatterBuilder_clear_189613995849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37;
     Object term1162;

    public PeriodFormatterBuilder_clear_189613995849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term42 = new ArrayList();
        term37 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term48 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term37, term37.getClass(), "iMinPrintedDigits", 1);
        setIntField(term37, term37.getClass(), "iPrintZeroSetting", 2);
        setIntField(term37, term37.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term37, term37.getClass(), "iRejectSignedValues", true);
        setField(term37, term37.getClass(), "iPrefix", null);
        setField(term37, term37.getClass(), "iElementPairs", term42);
        setBooleanField(term37, term37.getClass(), "iNotPrinter", false);
        setBooleanField(term37, term37.getClass(), "iNotParser", true);
        setField(term37, term37.getClass(), "iFieldFormatters", term48);
        ArrayList term1163 = new ArrayList();
        term1162 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term1165 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term1162, term1162.getClass(), "iMinPrintedDigits", 1);
        setIntField(term1162, term1162.getClass(), "iPrintZeroSetting", 2);
        setIntField(term1162, term1162.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term1162, term1162.getClass(), "iRejectSignedValues", false);
        setField(term1162, term1162.getClass(), "iPrefix", null);
        setField(term1162, term1162.getClass(), "iElementPairs", term1163);
        setBooleanField(term1162, term1162.getClass(), "iNotPrinter", false);
        setBooleanField(term1162, term1162.getClass(), "iNotParser", false);
        setField(term1162, term1162.getClass(), "iFieldFormatters", term1165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clear", argTypes, term37, args);
        assertTrue(recursiveEquals(term37, term1162));
    }

};


