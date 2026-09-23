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

public class PeriodFormatterBuilder_appendMinutes_3029593269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term421;
     Object term2508;
     Object term2489;

    public PeriodFormatterBuilder_appendMinutes_3029593269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term426 = new ArrayList();
        term421 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term432 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term421, term421.getClass(), "iMinPrintedDigits", 1);
        setIntField(term421, term421.getClass(), "iPrintZeroSetting", 2);
        setIntField(term421, term421.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term421, term421.getClass(), "iRejectSignedValues", false);
        setField(term421, term421.getClass(), "iPrefix", null);
        setField(term421, term421.getClass(), "iElementPairs", term426);
        setBooleanField(term421, term421.getClass(), "iNotPrinter", false);
        setBooleanField(term421, term421.getClass(), "iNotParser", false);
        setField(term421, term421.getClass(), "iFieldFormatters", term432);
        Object term2511 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        Object[] term2512 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2511, term2511.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2511, term2511.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2511, term2511.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2511, term2511.getClass(), "iRejectSignedValues", false);
        setIntField(term2511, term2511.getClass(), "iFieldType", 5);
        setElement(term2512, 5, term2511);
        setField(term2511, term2511.getClass(), "iFieldFormatters", term2512);
        setField(term2511, term2511.getClass(), "iPrefix", null);
        setField(term2511, term2511.getClass(), "iSuffix", null);
        ArrayList term2509 = new ArrayList();
        ((ArrayList) term2509).add(term2511);
        ((ArrayList) term2509).add(term2511);
        term2508 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term2513 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2508, term2508.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2508, term2508.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2508, term2508.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2508, term2508.getClass(), "iRejectSignedValues", false);
        setField(term2508, term2508.getClass(), "iPrefix", null);
        setField(term2508, term2508.getClass(), "iElementPairs", term2509);
        setBooleanField(term2508, term2508.getClass(), "iNotPrinter", false);
        setBooleanField(term2508, term2508.getClass(), "iNotParser", false);
        setElement(term2513, 5, term2511);
        setField(term2508, term2508.getClass(), "iFieldFormatters", term2513);
        Object term2496 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        Object[] term2502 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2496, term2496.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2496, term2496.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2496, term2496.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2496, term2496.getClass(), "iRejectSignedValues", false);
        setIntField(term2496, term2496.getClass(), "iFieldType", 5);
        setElement(term2502, 5, term2496);
        setField(term2496, term2496.getClass(), "iFieldFormatters", term2502);
        setField(term2496, term2496.getClass(), "iPrefix", null);
        setField(term2496, term2496.getClass(), "iSuffix", null);
        ArrayList term2494 = new ArrayList();
        ((ArrayList) term2494).add(term2496);
        ((ArrayList) term2494).add(term2496);
        term2489 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term2507 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2489, term2489.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2489, term2489.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2489, term2489.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2489, term2489.getClass(), "iRejectSignedValues", false);
        setField(term2489, term2489.getClass(), "iPrefix", null);
        setField(term2489, term2489.getClass(), "iElementPairs", term2494);
        setBooleanField(term2489, term2489.getClass(), "iNotPrinter", false);
        setBooleanField(term2489, term2489.getClass(), "iNotParser", false);
        setElement(term2507, 5, term2496);
        setField(term2489, term2489.getClass(), "iFieldFormatters", term2507);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "appendMinutes", argTypes, term421, args);
        assertTrue(recursiveEquals(term421, term2508));
        assertTrue(recursiveEquals(retValue, term2489));
    }

};


