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

public class PeriodFormatterBuilder_appendLiteral_210004644752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123;
     Object term1581;
     Object term1551;

    public PeriodFormatterBuilder_appendLiteral_210004644752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term128 = new ArrayList();
        term123 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term134 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term123, term123.getClass(), "iMinPrintedDigits", 1);
        setIntField(term123, term123.getClass(), "iPrintZeroSetting", 2);
        setIntField(term123, term123.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term123, term123.getClass(), "iRejectSignedValues", false);
        setField(term123, term123.getClass(), "iPrefix", null);
        setField(term123, term123.getClass(), "iElementPairs", term128);
        setBooleanField(term123, term123.getClass(), "iNotPrinter", false);
        setBooleanField(term123, term123.getClass(), "iNotParser", true);
        setField(term123, term123.getClass(), "iFieldFormatters", term134);
        Object term1584 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$Literal"));
        setField(term1584, term1584.getClass(), "iText", "");
        ArrayList term1582 = new ArrayList();
        ((ArrayList) term1582).add(term1584);
        ((ArrayList) term1582).add(term1584);
        term1581 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term1586 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term1581, term1581.getClass(), "iMinPrintedDigits", 1);
        setIntField(term1581, term1581.getClass(), "iPrintZeroSetting", 2);
        setIntField(term1581, term1581.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term1581, term1581.getClass(), "iRejectSignedValues", false);
        setField(term1581, term1581.getClass(), "iPrefix", null);
        setField(term1581, term1581.getClass(), "iElementPairs", term1582);
        setBooleanField(term1581, term1581.getClass(), "iNotPrinter", false);
        setBooleanField(term1581, term1581.getClass(), "iNotParser", true);
        setField(term1581, term1581.getClass(), "iFieldFormatters", term1586);
        Object term1558 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$Literal"));
        setField(term1558, term1558.getClass(), "iText", "");
        ArrayList term1556 = new ArrayList();
        ((ArrayList) term1556).add(term1558);
        ((ArrayList) term1556).add(term1558);
        term1551 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object[] term1564 = (Object[]) newArray("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", 10);
        setIntField(term1551, term1551.getClass(), "iMinPrintedDigits", 1);
        setIntField(term1551, term1551.getClass(), "iPrintZeroSetting", 2);
        setIntField(term1551, term1551.getClass(), "iMaxParsedDigits", 10);
        setBooleanField(term1551, term1551.getClass(), "iRejectSignedValues", false);
        setField(term1551, term1551.getClass(), "iPrefix", null);
        setField(term1551, term1551.getClass(), "iElementPairs", term1556);
        setBooleanField(term1551, term1551.getClass(), "iNotPrinter", false);
        setBooleanField(term1551, term1551.getClass(), "iNotParser", true);
        setField(term1551, term1551.getClass(), "iFieldFormatters", term1564);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MjGYSRKTNF";
        Object retValue = callMethod(klass, "appendLiteral", argTypes, term123, args);
        assertTrue(recursiveEquals(term123, term1581));
        assertTrue(recursiveEquals(retValue, term1551));
    }

};


