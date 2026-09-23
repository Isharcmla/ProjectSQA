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

public class PeriodFormatterBuilder_init_182100891111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10581;

    public PeriodFormatterBuilder_init_182100891111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10316 = new ArrayList();
        Object term10148 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object term10264 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        setIntField(term10148, term10148.getClass(), "iMinPrintedDigits", 0);
        setIntField(term10148, term10148.getClass(), "iPrintZeroSetting", 0);
        setIntField(term10148, term10148.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term10148, term10148.getClass(), "iRejectSignedValues", false);
        setField(term10148, term10148.getClass(), "iPrefix", term10264);
        setField(term10148, term10148.getClass(), "iElementPairs", term10316);
        ArrayList term10582 = new ArrayList();
        term10581 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term10584 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term10581, term10581.getClass(), "iMinPrintedDigits", 1);
        setIntField(term10581, term10581.getClass(), "iPrintZeroSetting", 2);
        setIntField(term10581, term10581.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term10581, term10581.getClass(), "iRejectSignedValues", false);
        setField(term10581, term10581.getClass(), "iPrefix", null);
        setField(term10581, term10581.getClass(), "iElementPairs", term10582);
        setBooleanField(term10581, term10581.getClass(), "iNotPrinter", false);
        setBooleanField(term10581, term10581.getClass(), "iNotParser", false);
        setField(term10581, term10581.getClass(), "iFieldFormatters", term10584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term10581));
    }

};


