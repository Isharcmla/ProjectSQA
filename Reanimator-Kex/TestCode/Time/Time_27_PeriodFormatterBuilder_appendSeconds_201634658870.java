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

public class PeriodFormatterBuilder_appendSeconds_201634658870 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term433;
     Object term2548;
     Object term2529;

    public PeriodFormatterBuilder_appendSeconds_201634658870() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term438 = new ArrayList();
        term433 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term444 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term433, term433.getClass(), "iMinPrintedDigits", 1);
        setIntField(term433, term433.getClass(), "iPrintZeroSetting", 2);
        setIntField(term433, term433.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term433, term433.getClass(), "iRejectSignedValues", false);
        setField(term433, term433.getClass(), "iPrefix", null);
        setField(term433, term433.getClass(), "iElementPairs", term438);
        setBooleanField(term433, term433.getClass(), "iNotPrinter", false);
        setBooleanField(term433, term433.getClass(), "iNotParser", false);
        setField(term433, term433.getClass(), "iFieldFormatters", term444);
        Object term2551 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        Object[] term2552 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2551, term2551.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2551, term2551.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2551, term2551.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2551, term2551.getClass(), "iRejectSignedValues", false);
        setIntField(term2551, term2551.getClass(), "iFieldType", 6);
        setElement(term2552, 6, term2551);
        setField(term2551, term2551.getClass(), "iFieldFormatters", term2552);
        setField(term2551, term2551.getClass(), "iPrefix", null);
        setField(term2551, term2551.getClass(), "iSuffix", null);
        ArrayList term2549 = new ArrayList();
        ((ArrayList) term2549).add(term2551);
        ((ArrayList) term2549).add(term2551);
        term2548 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term2553 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2548, term2548.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2548, term2548.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2548, term2548.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2548, term2548.getClass(), "iRejectSignedValues", false);
        setField(term2548, term2548.getClass(), "iPrefix", null);
        setField(term2548, term2548.getClass(), "iElementPairs", term2549);
        setBooleanField(term2548, term2548.getClass(), "iNotPrinter", false);
        setBooleanField(term2548, term2548.getClass(), "iNotParser", false);
        setElement(term2553, 6, term2551);
        setField(term2548, term2548.getClass(), "iFieldFormatters", term2553);
        Object term2536 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        Object[] term2542 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2536, term2536.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2536, term2536.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2536, term2536.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2536, term2536.getClass(), "iRejectSignedValues", false);
        setIntField(term2536, term2536.getClass(), "iFieldType", 6);
        setElement(term2542, 6, term2536);
        setField(term2536, term2536.getClass(), "iFieldFormatters", term2542);
        setField(term2536, term2536.getClass(), "iPrefix", null);
        setField(term2536, term2536.getClass(), "iSuffix", null);
        ArrayList term2534 = new ArrayList();
        ((ArrayList) term2534).add(term2536);
        ((ArrayList) term2534).add(term2536);
        term2529 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term2547 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2529, term2529.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2529, term2529.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2529, term2529.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2529, term2529.getClass(), "iRejectSignedValues", false);
        setField(term2529, term2529.getClass(), "iPrefix", null);
        setField(term2529, term2529.getClass(), "iElementPairs", term2534);
        setBooleanField(term2529, term2529.getClass(), "iNotPrinter", false);
        setBooleanField(term2529, term2529.getClass(), "iNotParser", false);
        setElement(term2547, 6, term2536);
        setField(term2529, term2529.getClass(), "iFieldFormatters", term2547);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "appendSeconds", argTypes, term433, args);
        assertTrue(recursiveEquals(term433, term2548));
        assertTrue(recursiveEquals(retValue, term2529));
    }

};


