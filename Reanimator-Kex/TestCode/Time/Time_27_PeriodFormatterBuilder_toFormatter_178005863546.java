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

public class PeriodFormatterBuilder_toFormatter_178005863546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term1078;
     Object term1062;

    public PeriodFormatterBuilder_toFormatter_178005863546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6 = new ArrayList();
        term1 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term12 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term1, term1.getClass(), "iMinPrintedDigits", 1);
        setIntField(term1, term1.getClass(), "iPrintZeroSetting", 2);
        setIntField(term1, term1.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term1, term1.getClass(), "iRejectSignedValues", false);
        setField(term1, term1.getClass(), "iPrefix", null);
        setField(term1, term1.getClass(), "iElementPairs", term6);
        setBooleanField(term1, term1.getClass(), "iNotPrinter", false);
        setBooleanField(term1, term1.getClass(), "iNotParser", false);
        setField(term1, term1.getClass(), "iFieldFormatters", term12);
        ArrayList term1079 = new ArrayList();
        term1078 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term1081 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term1078, term1078.getClass(), "iMinPrintedDigits", 1);
        setIntField(term1078, term1078.getClass(), "iPrintZeroSetting", 2);
        setIntField(term1078, term1078.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term1078, term1078.getClass(), "iRejectSignedValues", false);
        setField(term1078, term1078.getClass(), "iPrefix", null);
        setField(term1078, term1078.getClass(), "iElementPairs", term1079);
        setBooleanField(term1078, term1078.getClass(), "iNotPrinter", false);
        setBooleanField(term1078, term1078.getClass(), "iNotParser", false);
        setField(term1078, term1078.getClass(), "iFieldFormatters", term1081);
        term1062 = newInstance(Class.forName("org.joda.time.format.PeriodFormatter"));
        Object term1063 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$Literal"));
        setField(term1063, term1063.getClass(), "iText", "");
        setField(term1062, term1062.getClass(), "iPrinter", term1063);
        setField(term1062, term1062.getClass(), "iParser", term1063);
        setField(term1062, term1062.getClass(), "iLocale", null);
        setField(term1062, term1062.getClass(), "iParseType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toFormatter", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term1078));
        assertTrue(recursiveEquals(retValue, term1062));
    }

};


