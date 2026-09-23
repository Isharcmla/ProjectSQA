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

public class PeriodFormatterBuilder_append_457227746172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35076;
     Object term35250;
     Object term35537;
     Object term35541;
     Object term35518;

    public PeriodFormatterBuilder_append_457227746172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term35128 = new ArrayList();
        term35076 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        setField(term35076, term35076.getClass(), "iPrefix", null);
        setField(term35076, term35076.getClass(), "iElementPairs", term35128);
        term35250 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        Object term35540 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        setIntField(term35540, term35540.getClass(), "iMinPrintedDigits", 0);
        setIntField(term35540, term35540.getClass(), "iPrintZeroSetting", 0);
        setIntField(term35540, term35540.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term35540, term35540.getClass(), "iRejectSignedValues", false);
        setIntField(term35540, term35540.getClass(), "iFieldType", 0);
        setField(term35540, term35540.getClass(), "iFieldFormatters", null);
        setField(term35540, term35540.getClass(), "iPrefix", null);
        setField(term35540, term35540.getClass(), "iSuffix", null);
        ArrayList term35538 = new ArrayList();
        ((ArrayList) term35538).add(term35540);
        ((ArrayList) term35538).add((Object)null);
        term35537 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        setIntField(term35537, term35537.getClass(), "iMinPrintedDigits", 0);
        setIntField(term35537, term35537.getClass(), "iPrintZeroSetting", 0);
        setIntField(term35537, term35537.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term35537, term35537.getClass(), "iRejectSignedValues", false);
        setField(term35537, term35537.getClass(), "iPrefix", null);
        setField(term35537, term35537.getClass(), "iElementPairs", term35538);
        setBooleanField(term35537, term35537.getClass(), "iNotPrinter", false);
        setBooleanField(term35537, term35537.getClass(), "iNotParser", true);
        setField(term35537, term35537.getClass(), "iFieldFormatters", null);
        term35541 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        setIntField(term35541, term35541.getClass(), "iMinPrintedDigits", 0);
        setIntField(term35541, term35541.getClass(), "iPrintZeroSetting", 0);
        setIntField(term35541, term35541.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term35541, term35541.getClass(), "iRejectSignedValues", false);
        setIntField(term35541, term35541.getClass(), "iFieldType", 0);
        setField(term35541, term35541.getClass(), "iFieldFormatters", null);
        setField(term35541, term35541.getClass(), "iPrefix", null);
        setField(term35541, term35541.getClass(), "iSuffix", null);
        Object term35525 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        setIntField(term35525, term35525.getClass(), "iMinPrintedDigits", 0);
        setIntField(term35525, term35525.getClass(), "iPrintZeroSetting", 0);
        setIntField(term35525, term35525.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term35525, term35525.getClass(), "iRejectSignedValues", false);
        setIntField(term35525, term35525.getClass(), "iFieldType", 0);
        setField(term35525, term35525.getClass(), "iFieldFormatters", null);
        setField(term35525, term35525.getClass(), "iPrefix", null);
        setField(term35525, term35525.getClass(), "iSuffix", null);
        ArrayList term35523 = new ArrayList();
        ((ArrayList) term35523).add(term35525);
        ((ArrayList) term35523).add((Object)null);
        term35518 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        setIntField(term35518, term35518.getClass(), "iMinPrintedDigits", 0);
        setIntField(term35518, term35518.getClass(), "iPrintZeroSetting", 0);
        setIntField(term35518, term35518.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term35518, term35518.getClass(), "iRejectSignedValues", false);
        setField(term35518, term35518.getClass(), "iPrefix", null);
        setField(term35518, term35518.getClass(), "iElementPairs", term35523);
        setBooleanField(term35518, term35518.getClass(), "iNotPrinter", false);
        setBooleanField(term35518, term35518.getClass(), "iNotParser", true);
        setField(term35518, term35518.getClass(), "iFieldFormatters", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.format.PeriodPrinter");
        argTypes[1] = Class.forName("org.joda.time.format.PeriodParser");
        Object[] args = new Object[2];
        args[0] = term35250;
        args[1] = null;
        Object retValue = callMethod(klass, "append", argTypes, term35076, args);
        assertTrue(recursiveEquals(term35076, term35537));
        assertTrue(recursiveEquals(term35250, term35541));
        assertTrue(recursiveEquals(retValue, term35518));
    }

};


