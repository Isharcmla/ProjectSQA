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

public class PeriodFormatterBuilder_append0_129319836687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1001;
     Object term5057;
     Object term5045;

    public PeriodFormatterBuilder_append0_129319836687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1006 = new ArrayList();
        term1001 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term1012 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term1001, term1001.getClass(), "iMinPrintedDigits", 1);
        setIntField(term1001, term1001.getClass(), "iPrintZeroSetting", 2);
        setIntField(term1001, term1001.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term1001, term1001.getClass(), "iRejectSignedValues", true);
        setField(term1001, term1001.getClass(), "iPrefix", null);
        setField(term1001, term1001.getClass(), "iElementPairs", term1006);
        setBooleanField(term1001, term1001.getClass(), "iNotPrinter", false);
        setBooleanField(term1001, term1001.getClass(), "iNotParser", false);
        setField(term1001, term1001.getClass(), "iFieldFormatters", term1012);
        ArrayList term5058 = new ArrayList();
        ((ArrayList) term5058).add((Object)null);
        ((ArrayList) term5058).add((Object)null);
        term5057 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term5060 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term5057, term5057.getClass(), "iMinPrintedDigits", 1);
        setIntField(term5057, term5057.getClass(), "iPrintZeroSetting", 2);
        setIntField(term5057, term5057.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term5057, term5057.getClass(), "iRejectSignedValues", true);
        setField(term5057, term5057.getClass(), "iPrefix", null);
        setField(term5057, term5057.getClass(), "iElementPairs", term5058);
        setBooleanField(term5057, term5057.getClass(), "iNotPrinter", true);
        setBooleanField(term5057, term5057.getClass(), "iNotParser", true);
        setField(term5057, term5057.getClass(), "iFieldFormatters", term5060);
        ArrayList term5050 = new ArrayList();
        ((ArrayList) term5050).add((Object)null);
        ((ArrayList) term5050).add((Object)null);
        term5045 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term5056 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term5045, term5045.getClass(), "iMinPrintedDigits", 1);
        setIntField(term5045, term5045.getClass(), "iPrintZeroSetting", 2);
        setIntField(term5045, term5045.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term5045, term5045.getClass(), "iRejectSignedValues", true);
        setField(term5045, term5045.getClass(), "iPrefix", null);
        setField(term5045, term5045.getClass(), "iElementPairs", term5050);
        setBooleanField(term5045, term5045.getClass(), "iNotPrinter", true);
        setBooleanField(term5045, term5045.getClass(), "iNotParser", true);
        setField(term5045, term5045.getClass(), "iFieldFormatters", term5056);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.format.PeriodPrinter");
        argTypes[1] = Class.forName("org.joda.time.format.PeriodParser");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "append0", argTypes, term1001, args);
        assertTrue(recursiveEquals(term1001, term5057));
        assertTrue(recursiveEquals(retValue, term5045));
    }

};


