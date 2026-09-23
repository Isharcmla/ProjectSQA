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

public class PeriodFormatterBuilder_appendDays_83300360067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term397;
     Object term2428;
     Object term2409;

    public PeriodFormatterBuilder_appendDays_83300360067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term402 = new ArrayList();
        term397 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term408 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term397, term397.getClass(), "iMinPrintedDigits", 1);
        setIntField(term397, term397.getClass(), "iPrintZeroSetting", 2);
        setIntField(term397, term397.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term397, term397.getClass(), "iRejectSignedValues", false);
        setField(term397, term397.getClass(), "iPrefix", null);
        setField(term397, term397.getClass(), "iElementPairs", term402);
        setBooleanField(term397, term397.getClass(), "iNotPrinter", false);
        setBooleanField(term397, term397.getClass(), "iNotParser", true);
        setField(term397, term397.getClass(), "iFieldFormatters", term408);
        Object term2431 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        Object[] term2432 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2431, term2431.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2431, term2431.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2431, term2431.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2431, term2431.getClass(), "iRejectSignedValues", false);
        setIntField(term2431, term2431.getClass(), "iFieldType", 3);
        setElement(term2432, 3, term2431);
        setField(term2431, term2431.getClass(), "iFieldFormatters", term2432);
        setField(term2431, term2431.getClass(), "iPrefix", null);
        setField(term2431, term2431.getClass(), "iSuffix", null);
        ArrayList term2429 = new ArrayList();
        ((ArrayList) term2429).add(term2431);
        ((ArrayList) term2429).add(term2431);
        term2428 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term2433 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2428, term2428.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2428, term2428.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2428, term2428.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2428, term2428.getClass(), "iRejectSignedValues", false);
        setField(term2428, term2428.getClass(), "iPrefix", null);
        setField(term2428, term2428.getClass(), "iElementPairs", term2429);
        setBooleanField(term2428, term2428.getClass(), "iNotPrinter", false);
        setBooleanField(term2428, term2428.getClass(), "iNotParser", true);
        setElement(term2433, 3, term2431);
        setField(term2428, term2428.getClass(), "iFieldFormatters", term2433);
        Object term2416 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        Object[] term2422 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2416, term2416.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2416, term2416.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2416, term2416.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2416, term2416.getClass(), "iRejectSignedValues", false);
        setIntField(term2416, term2416.getClass(), "iFieldType", 3);
        setElement(term2422, 3, term2416);
        setField(term2416, term2416.getClass(), "iFieldFormatters", term2422);
        setField(term2416, term2416.getClass(), "iPrefix", null);
        setField(term2416, term2416.getClass(), "iSuffix", null);
        ArrayList term2414 = new ArrayList();
        ((ArrayList) term2414).add(term2416);
        ((ArrayList) term2414).add(term2416);
        term2409 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term2427 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term2409, term2409.getClass(), "iMinPrintedDigits", 1);
        setIntField(term2409, term2409.getClass(), "iPrintZeroSetting", 2);
        setIntField(term2409, term2409.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term2409, term2409.getClass(), "iRejectSignedValues", false);
        setField(term2409, term2409.getClass(), "iPrefix", null);
        setField(term2409, term2409.getClass(), "iElementPairs", term2414);
        setBooleanField(term2409, term2409.getClass(), "iNotPrinter", false);
        setBooleanField(term2409, term2409.getClass(), "iNotParser", true);
        setElement(term2427, 3, term2416);
        setField(term2409, term2409.getClass(), "iFieldFormatters", term2427);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "appendDays", argTypes, term397, args);
        assertTrue(recursiveEquals(term397, term2428));
        assertTrue(recursiveEquals(retValue, term2409));
    }

};


