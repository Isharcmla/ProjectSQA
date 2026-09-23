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
import java.util.ArrayList;

public class DateTimeFormatterBuilder_append_58061458477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85399;
     Object term85231;
     Object term85791;
     Object term85796;
     Object term85776;

    public DateTimeFormatterBuilder_append_58061458477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term85489 = new ArrayList();
        term85399 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term85437 = newInstance(Class.forName("java.lang.Object"));
        setField(term85399, term85399.getClass(), "iFormatter", term85437);
        setField(term85399, term85399.getClass(), "iElementPairs", term85489);
        term85231 = (Object[]) newArray("org.joda.time.format.DateTimeParser", 2);
        Object term85615 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$MatchingParser"));
        Object term85741 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset"));
        setField(term85615, term85615.getClass(), "iParsers", null);
        setIntField(term85615, term85615.getClass(), "iParsedLengthEstimate", 0);
        setElement(term85231, 0, term85615);
        setIntField(term85741, term85741.getClass(), "iMinFields", 1073741824);
        setBooleanField(term85741, term85741.getClass(), "iShowSeparators", false);
        setField(term85741, term85741.getClass(), "iZeroOffsetPrintText", null);
        setElement(term85231, 1, term85741);
        Object term85794 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$MatchingParser"));
        Object[] term85795 = (Object[]) newArray("org.joda.time.format.DateTimeParser", 2);
        setField(term85794, term85794.getClass(), "iParsers", term85795);
        setIntField(term85794, term85794.getClass(), "iParsedLengthEstimate", 0);
        ArrayList term85792 = new ArrayList();
        ((ArrayList) term85792).add((Object)null);
        ((ArrayList) term85792).add(term85794);
        term85791 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term85791, term85791.getClass(), "iElementPairs", term85792);
        setField(term85791, term85791.getClass(), "iFormatter", null);
        term85796 = (Object[]) newArray("org.joda.time.format.DateTimeParser", 2);
        Object term85797 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$MatchingParser"));
        Object term85798 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset"));
        setField(term85797, term85797.getClass(), "iParsers", null);
        setIntField(term85797, term85797.getClass(), "iParsedLengthEstimate", 0);
        setElement(term85796, 0, term85797);
        setField(term85798, term85798.getClass(), "iZeroOffsetPrintText", null);
        setField(term85798, term85798.getClass(), "iZeroOffsetParseText", null);
        setBooleanField(term85798, term85798.getClass(), "iShowSeparators", false);
        setIntField(term85798, term85798.getClass(), "iMinFields", 1073741824);
        setIntField(term85798, term85798.getClass(), "iMaxFields", 0);
        setElement(term85796, 1, term85798);
        Object term85779 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$MatchingParser"));
        Object[] term85780 = (Object[]) newArray("org.joda.time.format.DateTimeParser", 2);
        setField(term85779, term85779.getClass(), "iParsers", term85780);
        setIntField(term85779, term85779.getClass(), "iParsedLengthEstimate", 0);
        ArrayList term85777 = new ArrayList();
        ((ArrayList) term85777).add((Object)null);
        ((ArrayList) term85777).add(term85779);
        term85776 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term85776, term85776.getClass(), "iElementPairs", term85777);
        setField(term85776, term85776.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.format.DateTimePrinter");
        argTypes[1] = Array.newInstance(Class.forName("org.joda.time.format.DateTimeParser"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term85231;
        Object retValue = callMethod(klass, "append", argTypes, term85399, args);
        assertTrue(recursiveEquals(term85399, term85791));
        assertTrue(recursiveEquals(term85231, term85796));
        assertTrue(recursiveEquals(retValue, term85776));
    }

};


