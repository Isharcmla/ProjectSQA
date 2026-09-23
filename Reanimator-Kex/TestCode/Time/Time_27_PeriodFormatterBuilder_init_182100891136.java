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
import java.lang.Object;
import java.util.ArrayList;

public class PeriodFormatterBuilder_init_182100891136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21382;

    public PeriodFormatterBuilder_init_182100891136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term20832 = new ArrayList();
        Object term20664 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object term20780 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        setIntField(term20664, term20664.getClass(), "iMinPrintedDigits", 0);
        setIntField(term20664, term20664.getClass(), "iPrintZeroSetting", 0);
        setIntField(term20664, term20664.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term20664, term20664.getClass(), "iRejectSignedValues", false);
        setField(term20664, term20664.getClass(), "iPrefix", term20780);
        setField(term20664, term20664.getClass(), "iElementPairs", term20832);
        ArrayList term21383 = new ArrayList();
        term21382 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term21385 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term21382, term21382.getClass(), "iMinPrintedDigits", 1);
        setIntField(term21382, term21382.getClass(), "iPrintZeroSetting", 2);
        setIntField(term21382, term21382.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term21382, term21382.getClass(), "iRejectSignedValues", false);
        setField(term21382, term21382.getClass(), "iPrefix", null);
        setField(term21382, term21382.getClass(), "iElementPairs", term21383);
        setBooleanField(term21382, term21382.getClass(), "iNotPrinter", false);
        setBooleanField(term21382, term21382.getClass(), "iNotParser", false);
        setField(term21382, term21382.getClass(), "iFieldFormatters", term21385);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term21382));
    }

};


