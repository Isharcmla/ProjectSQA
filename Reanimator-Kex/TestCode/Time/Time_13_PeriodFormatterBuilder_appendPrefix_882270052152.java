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
import java.lang.Object;

public class PeriodFormatterBuilder_appendPrefix_882270052152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27549;
     Object term27671;
     Object term27843;
     Object term27845;
     Object term27835;

    public PeriodFormatterBuilder_appendPrefix_882270052152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27549 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        term27671 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$CompositeAffix"));
        term27843 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object term27844 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$CompositeAffix"));
        setIntField(term27843, term27843.getClass(), "iMinPrintedDigits", 0);
        setIntField(term27843, term27843.getClass(), "iPrintZeroSetting", 0);
        setIntField(term27843, term27843.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term27843, term27843.getClass(), "iRejectSignedValues", false);
        setField(term27844, term27844.getClass(), "iLeft", null);
        setField(term27844, term27844.getClass(), "iRight", null);
        setField(term27843, term27843.getClass(), "iPrefix", term27844);
        setField(term27843, term27843.getClass(), "iElementPairs", null);
        setBooleanField(term27843, term27843.getClass(), "iNotPrinter", false);
        setBooleanField(term27843, term27843.getClass(), "iNotParser", false);
        setField(term27843, term27843.getClass(), "iFieldFormatters", null);
        term27845 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$CompositeAffix"));
        setField(term27845, term27845.getClass(), "iLeft", null);
        setField(term27845, term27845.getClass(), "iRight", null);
        term27835 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object term27840 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$CompositeAffix"));
        setIntField(term27835, term27835.getClass(), "iMinPrintedDigits", 0);
        setIntField(term27835, term27835.getClass(), "iPrintZeroSetting", 0);
        setIntField(term27835, term27835.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term27835, term27835.getClass(), "iRejectSignedValues", false);
        setField(term27840, term27840.getClass(), "iLeft", null);
        setField(term27840, term27840.getClass(), "iRight", null);
        setField(term27835, term27835.getClass(), "iPrefix", term27840);
        setField(term27835, term27835.getClass(), "iElementPairs", null);
        setBooleanField(term27835, term27835.getClass(), "iNotPrinter", false);
        setBooleanField(term27835, term27835.getClass(), "iNotParser", false);
        setField(term27835, term27835.getClass(), "iFieldFormatters", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.format.PeriodFormatterBuilder$PeriodFieldAffix");
        Object[] args = new Object[1];
        args[0] = term27671;
        Object retValue = callMethod(klass, "appendPrefix", argTypes, term27549, args);
        assertTrue(recursiveEquals(term27549, term27843));
        assertTrue(recursiveEquals(term27671, term27845));
        assertTrue(recursiveEquals(retValue, term27835));
    }

};


