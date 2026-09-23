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
import java.lang.Boolean;

public class PeriodFormatterBuilder_appendSeparator_141156194585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term906;
     Object term942;
     Object term955;
     Object term957;
     Object term4954;
     Object term4962;
     Object term4901;

    public PeriodFormatterBuilder_appendSeparator_141156194585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term911 = new ArrayList();
        term906 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term917 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term906, term906.getClass(), "iMinPrintedDigits", 1);
        setIntField(term906, term906.getClass(), "iPrintZeroSetting", 2);
        setIntField(term906, term906.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term906, term906.getClass(), "iRejectSignedValues", false);
        setField(term906, term906.getClass(), "iPrefix", null);
        setField(term906, term906.getClass(), "iElementPairs", term911);
        setBooleanField(term906, term906.getClass(), "iNotPrinter", false);
        setBooleanField(term906, term906.getClass(), "iNotParser", false);
        setField(term906, term906.getClass(), "iFieldFormatters", term917);
        term942 = (Object[]) newArray("java.lang.String", 1);
        setElement(term942, 0, "flxyYxBRtu");
        term955 = new Boolean(false);
        term957 = new Boolean(false);
        ArrayList term4955 = new ArrayList();
        term4954 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term4957 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term4954, term4954.getClass(), "iMinPrintedDigits", 1);
        setIntField(term4954, term4954.getClass(), "iPrintZeroSetting", 2);
        setIntField(term4954, term4954.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term4954, term4954.getClass(), "iRejectSignedValues", false);
        setField(term4954, term4954.getClass(), "iPrefix", null);
        setField(term4954, term4954.getClass(), "iElementPairs", term4955);
        setBooleanField(term4954, term4954.getClass(), "iNotPrinter", false);
        setBooleanField(term4954, term4954.getClass(), "iNotParser", false);
        setField(term4954, term4954.getClass(), "iFieldFormatters", term4957);
        term4962 = (Object[]) newArray("java.lang.String", 1);
        setElement(term4962, 0, "flxyYxBRtu");
        ArrayList term4906 = new ArrayList();
        term4901 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term4912 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term4901, term4901.getClass(), "iMinPrintedDigits", 1);
        setIntField(term4901, term4901.getClass(), "iPrintZeroSetting", 2);
        setIntField(term4901, term4901.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term4901, term4901.getClass(), "iRejectSignedValues", false);
        setField(term4901, term4901.getClass(), "iPrefix", null);
        setField(term4901, term4901.getClass(), "iElementPairs", term4906);
        setBooleanField(term4901, term4901.getClass(), "iNotPrinter", false);
        setBooleanField(term4901, term4901.getClass(), "iNotParser", false);
        setField(term4901, term4901.getClass(), "iFieldFormatters", term4912);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = "BYqFIqCKAV";
        args[1] = "vrQLuWIDJX";
        args[2] = term942;
        args[3] = term955;
        args[4] = term957;
        Object retValue = callMethod(klass, "appendSeparator", argTypes, term906, args);
        assertTrue(recursiveEquals(term906, term4954));
        assertTrue(recursiveEquals(term942, term4962));
        assertTrue(recursiveEquals(term955, false));
        assertTrue(recursiveEquals(term957, false));
        assertTrue(recursiveEquals(retValue, term4901));
    }

};


