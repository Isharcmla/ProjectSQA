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

public class PeriodFormatterBuilder_appendYears_101109023564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term361;
     Object term2308;
     Object term2289;

    public PeriodFormatterBuilder_appendYears_101109023564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term366 = new ArrayList();
        term361 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term372 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term361, term361.getClass(), "iMinPrintedDigits", 1);
        setIntField(term361, term361.getClass(), "iPrintZeroSetting", 2);
        setIntField(term361, term361.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term361, term361.getClass(), "iRejectSignedValues", false);
        setField(term361, term361.getClass(), "iPrefix", null);
        setField(term361, term361.getClass(), "iElementPairs", term366);
        setBooleanField(term361, term361.getClass(), "iNotPrinter", false);
        setBooleanField(term361, term361.getClass(), "iNotParser", true);
        setField(term361, term361.getClass(), "iFieldFormatters", term372);
        Object term2311 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        Object[] term2312 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2311, term2311.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2311, term2311.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2311, term2311.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2311, term2311.getClass(), "iRejectSignedValues", false);
        setIntField(term2311, term2311.getClass(), "iFieldType", 0);
        setElement(term2312, 0, term2311);
        setField(term2311, term2311.getClass(), "iFieldFormatters", term2312);
        setField(term2311, term2311.getClass(), "iPrefix", null);
        setField(term2311, term2311.getClass(), "iSuffix", null);
        ArrayList term2309 = new ArrayList();
        ((ArrayList) term2309).add(term2311);
        ((ArrayList) term2309).add(term2311);
        term2308 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term2313 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2308, term2308.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2308, term2308.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2308, term2308.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2308, term2308.getClass(), "iRejectSignedValues", false);
        setField(term2308, term2308.getClass(), "iPrefix", null);
        setField(term2308, term2308.getClass(), "iElementPairs", term2309);
        setBooleanField(term2308, term2308.getClass(), "iNotPrinter", false);
        setBooleanField(term2308, term2308.getClass(), "iNotParser", true);
        setElement(term2313, 0, term2311);
        setField(term2308, term2308.getClass(), "iFieldFormatters", term2313);
        Object term2296 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        Object[] term2302 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2296, term2296.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2296, term2296.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2296, term2296.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2296, term2296.getClass(), "iRejectSignedValues", false);
        setIntField(term2296, term2296.getClass(), "iFieldType", 0);
        setElement(term2302, 0, term2296);
        setField(term2296, term2296.getClass(), "iFieldFormatters", term2302);
        setField(term2296, term2296.getClass(), "iPrefix", null);
        setField(term2296, term2296.getClass(), "iSuffix", null);
        ArrayList term2294 = new ArrayList();
        ((ArrayList) term2294).add(term2296);
        ((ArrayList) term2294).add(term2296);
        term2289 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term2307 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2289, term2289.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2289, term2289.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2289, term2289.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2289, term2289.getClass(), "iRejectSignedValues", false);
        setField(term2289, term2289.getClass(), "iPrefix", null);
        setField(term2289, term2289.getClass(), "iElementPairs", term2294);
        setBooleanField(term2289, term2289.getClass(), "iNotPrinter", false);
        setBooleanField(term2289, term2289.getClass(), "iNotParser", true);
        setElement(term2307, 0, term2296);
        setField(term2289, term2289.getClass(), "iFieldFormatters", term2307);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "appendYears", argTypes, term361, args);
        assertTrue(recursiveEquals(term361, term2308));
        assertTrue(recursiveEquals(retValue, term2289));
    }

};


