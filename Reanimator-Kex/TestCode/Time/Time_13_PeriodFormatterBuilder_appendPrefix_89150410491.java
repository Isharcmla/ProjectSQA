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

public class PeriodFormatterBuilder_appendPrefix_89150410491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5505;
     Object term5685;
     Object term5673;

    public PeriodFormatterBuilder_appendPrefix_89150410491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5505 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object term5621 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        setField(term5505, term5505.getClass(), "iPrefix", term5621);
        term5685 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object term5686 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$CompositeAffix"));
        Object term5687 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        Object term5688 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        setIntField(term5685, term5685.getClass(), "iMinPrintedDigits", 0);
        setIntField(term5685, term5685.getClass(), "iPrintZeroSetting", 0);
        setIntField(term5685, term5685.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term5685, term5685.getClass(), "iRejectSignedValues", false);
        setField(term5687, term5687.getClass(), "iText", null);
        setField(term5686, term5686.getClass(), "iLeft", term5687);
        setField(term5688, term5688.getClass(), "iText", "");
        setField(term5686, term5686.getClass(), "iRight", term5688);
        setField(term5685, term5685.getClass(), "iPrefix", term5686);
        setField(term5685, term5685.getClass(), "iElementPairs", null);
        setBooleanField(term5685, term5685.getClass(), "iNotPrinter", false);
        setBooleanField(term5685, term5685.getClass(), "iNotParser", false);
        setField(term5685, term5685.getClass(), "iFieldFormatters", null);
        term5673 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object term5678 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$CompositeAffix"));
        Object term5679 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        Object term5680 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        setIntField(term5673, term5673.getClass(), "iMinPrintedDigits", 0);
        setIntField(term5673, term5673.getClass(), "iPrintZeroSetting", 0);
        setIntField(term5673, term5673.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term5673, term5673.getClass(), "iRejectSignedValues", false);
        setField(term5679, term5679.getClass(), "iText", null);
        setField(term5678, term5678.getClass(), "iLeft", term5679);
        setField(term5680, term5680.getClass(), "iText", "");
        setField(term5678, term5678.getClass(), "iRight", term5680);
        setField(term5673, term5673.getClass(), "iPrefix", term5678);
        setField(term5673, term5673.getClass(), "iElementPairs", null);
        setBooleanField(term5673, term5673.getClass(), "iNotPrinter", false);
        setBooleanField(term5673, term5673.getClass(), "iNotParser", false);
        setField(term5673, term5673.getClass(), "iFieldFormatters", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "appendPrefix", argTypes, term5505, args);
        assertTrue(recursiveEquals(term5505, term5685));
        assertTrue(recursiveEquals(retValue, term5673));
    }

};


