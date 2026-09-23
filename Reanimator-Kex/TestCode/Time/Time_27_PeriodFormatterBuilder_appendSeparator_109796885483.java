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

public class PeriodFormatterBuilder_appendSeparator_109796885483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term727;
     Object term4643;
     Object term4591;

    public PeriodFormatterBuilder_appendSeparator_109796885483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term732 = new ArrayList();
        term727 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term738 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term727, term727.getClass(), "iMinPrintedDigits", 1);
        setIntField(term727, term727.getClass(), "iPrintZeroSetting", 2);
        setIntField(term727, term727.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term727, term727.getClass(), "iRejectSignedValues", true);
        setField(term727, term727.getClass(), "iPrefix", null);
        setField(term727, term727.getClass(), "iElementPairs", term732);
        setBooleanField(term727, term727.getClass(), "iNotPrinter", false);
        setBooleanField(term727, term727.getClass(), "iNotParser", false);
        setField(term727, term727.getClass(), "iFieldFormatters", term738);
        ArrayList term4644 = new ArrayList();
        term4643 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term4646 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term4643, term4643.getClass(), "iMinPrintedDigits", 1);
        setIntField(term4643, term4643.getClass(), "iPrintZeroSetting", 2);
        setIntField(term4643, term4643.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term4643, term4643.getClass(), "iRejectSignedValues", true);
        setField(term4643, term4643.getClass(), "iPrefix", null);
        setField(term4643, term4643.getClass(), "iElementPairs", term4644);
        setBooleanField(term4643, term4643.getClass(), "iNotPrinter", false);
        setBooleanField(term4643, term4643.getClass(), "iNotParser", false);
        setField(term4643, term4643.getClass(), "iFieldFormatters", term4646);
        ArrayList term4596 = new ArrayList();
        term4591 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term4602 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term4591, term4591.getClass(), "iMinPrintedDigits", 1);
        setIntField(term4591, term4591.getClass(), "iPrintZeroSetting", 2);
        setIntField(term4591, term4591.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term4591, term4591.getClass(), "iRejectSignedValues", true);
        setField(term4591, term4591.getClass(), "iPrefix", null);
        setField(term4591, term4591.getClass(), "iElementPairs", term4596);
        setBooleanField(term4591, term4591.getClass(), "iNotPrinter", false);
        setBooleanField(term4591, term4591.getClass(), "iNotParser", false);
        setField(term4591, term4591.getClass(), "iFieldFormatters", term4602);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "tbcdzjIfER";
        args[1] = "HyxfbSQYBe";
        Object retValue = callMethod(klass, "appendSeparator", argTypes, term727, args);
        assertTrue(recursiveEquals(term727, term4643));
        assertTrue(recursiveEquals(retValue, term4591));
    }

};


