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

public class PeriodFormatterBuilder_appendSeparator_1411561945180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38217;
     Object term41279;
     Object term41237;

    public PeriodFormatterBuilder_appendSeparator_1411561945180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term38269 = new ArrayList();
        term38217 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        setField(term38217, term38217.getClass(), "iPrefix", null);
        setField(term38217, term38217.getClass(), "iElementPairs", term38269);
        Object term41282 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$Separator"));
        Object[] term41285 = (Object[]) newArray("java.lang.String", 1);
        Object term41286 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$Literal"));
        setField(term41282, term41282.getClass(), "iText", "");
        setField(term41282, term41282.getClass(), "iFinalText", "");
        setField(term41282, term41282.getClass(), "iParsedForms", term41285);
        setBooleanField(term41282, term41282.getClass(), "iUseBefore", false);
        setBooleanField(term41282, term41282.getClass(), "iUseAfter", true);
        setField(term41286, term41286.getClass(), "iText", null);
        setField(term41282, term41282.getClass(), "iBeforePrinter", term41286);
        setField(term41282, term41282.getClass(), "iAfterPrinter", null);
        setField(term41282, term41282.getClass(), "iBeforeParser", term41286);
        setField(term41282, term41282.getClass(), "iAfterParser", null);
        ArrayList term41280 = new ArrayList();
        ((ArrayList) term41280).add(term41282);
        ((ArrayList) term41280).add(term41282);
        term41279 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        setIntField(term41279, term41279.getClass(), "iMinPrintedDigits", 0);
        setIntField(term41279, term41279.getClass(), "iPrintZeroSetting", 0);
        setIntField(term41279, term41279.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term41279, term41279.getClass(), "iRejectSignedValues", false);
        setField(term41279, term41279.getClass(), "iPrefix", null);
        setField(term41279, term41279.getClass(), "iElementPairs", term41280);
        setBooleanField(term41279, term41279.getClass(), "iNotPrinter", false);
        setBooleanField(term41279, term41279.getClass(), "iNotParser", false);
        setField(term41279, term41279.getClass(), "iFieldFormatters", null);
        Object term41244 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$Separator"));
        Object[] term41247 = (Object[]) newArray("java.lang.String", 1);
        Object term41250 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$Literal"));
        setField(term41244, term41244.getClass(), "iText", "");
        setField(term41244, term41244.getClass(), "iFinalText", "");
        setField(term41244, term41244.getClass(), "iParsedForms", term41247);
        setBooleanField(term41244, term41244.getClass(), "iUseBefore", false);
        setBooleanField(term41244, term41244.getClass(), "iUseAfter", true);
        setField(term41250, term41250.getClass(), "iText", null);
        setField(term41244, term41244.getClass(), "iBeforePrinter", term41250);
        setField(term41244, term41244.getClass(), "iAfterPrinter", null);
        setField(term41244, term41244.getClass(), "iBeforeParser", term41250);
        setField(term41244, term41244.getClass(), "iAfterParser", null);
        ArrayList term41242 = new ArrayList();
        ((ArrayList) term41242).add(term41244);
        ((ArrayList) term41242).add(term41244);
        term41237 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        setIntField(term41237, term41237.getClass(), "iMinPrintedDigits", 0);
        setIntField(term41237, term41237.getClass(), "iPrintZeroSetting", 0);
        setIntField(term41237, term41237.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term41237, term41237.getClass(), "iRejectSignedValues", false);
        setField(term41237, term41237.getClass(), "iPrefix", null);
        setField(term41237, term41237.getClass(), "iElementPairs", term41242);
        setBooleanField(term41237, term41237.getClass(), "iNotPrinter", false);
        setBooleanField(term41237, term41237.getClass(), "iNotParser", false);
        setField(term41237, term41237.getClass(), "iFieldFormatters", null);
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
        args[0] = "";
        args[1] = "";
        args[2] = null;
        args[3] = false;
        args[4] = true;
        Object retValue = callMethod(klass, "appendSeparator", argTypes, term38217, args);
        assertTrue(recursiveEquals(term38217, term41279));
        assertTrue(recursiveEquals(retValue, term41237));
    }

};


