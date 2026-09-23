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

public class DateTimeFormatterBuilder_append_58061458483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86823;
     Object term86652;
     Object term87219;
     Object term87224;
     Object term87204;

    public DateTimeFormatterBuilder_append_58061458483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term86913 = new ArrayList();
        term86823 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term86861 = newInstance(Class.forName("java.lang.Object"));
        setField(term86823, term86823.getClass(), "iFormatter", term86861);
        setField(term86823, term86823.getClass(), "iElementPairs", term86913);
        term86652 = (Object[]) newArray("org.joda.time.format.DateTimeParser", 2);
        Object term87043 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral"));
        Object term87169 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset"));
        setElement(term86652, 0, term87043);
        setIntField(term87169, term87169.getClass(), "iMinFields", 134217727);
        setBooleanField(term87169, term87169.getClass(), "iShowSeparators", false);
        setField(term87169, term87169.getClass(), "iZeroOffsetPrintText", null);
        setElement(term86652, 1, term87169);
        Object term87222 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$MatchingParser"));
        Object[] term87223 = (Object[]) newArray("org.joda.time.format.DateTimeParser", 2);
        setField(term87222, term87222.getClass(), "iParsers", term87223);
        setIntField(term87222, term87222.getClass(), "iParsedLengthEstimate", 268435456);
        ArrayList term87220 = new ArrayList();
        ((ArrayList) term87220).add((Object)null);
        ((ArrayList) term87220).add(term87222);
        term87219 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term87219, term87219.getClass(), "iElementPairs", term87220);
        setField(term87219, term87219.getClass(), "iFormatter", null);
        term87224 = (Object[]) newArray("org.joda.time.format.DateTimeParser", 2);
        Object term87225 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral"));
        Object term87226 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset"));
        setCharField(term87225, term87225.getClass(), "iValue", (char) 0);
        setElement(term87224, 0, term87225);
        setField(term87226, term87226.getClass(), "iZeroOffsetPrintText", null);
        setField(term87226, term87226.getClass(), "iZeroOffsetParseText", null);
        setBooleanField(term87226, term87226.getClass(), "iShowSeparators", false);
        setIntField(term87226, term87226.getClass(), "iMinFields", 134217727);
        setIntField(term87226, term87226.getClass(), "iMaxFields", 0);
        setElement(term87224, 1, term87226);
        Object term87207 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$MatchingParser"));
        Object[] term87208 = (Object[]) newArray("org.joda.time.format.DateTimeParser", 2);
        setField(term87207, term87207.getClass(), "iParsers", term87208);
        setIntField(term87207, term87207.getClass(), "iParsedLengthEstimate", 268435456);
        ArrayList term87205 = new ArrayList();
        ((ArrayList) term87205).add((Object)null);
        ((ArrayList) term87205).add(term87207);
        term87204 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term87204, term87204.getClass(), "iElementPairs", term87205);
        setField(term87204, term87204.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.format.DateTimePrinter");
        argTypes[1] = Array.newInstance(Class.forName("org.joda.time.format.DateTimeParser"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term86652;
        Object retValue = callMethod(klass, "append", argTypes, term86823, args);
        assertTrue(recursiveEquals(term86823, term87219));
        assertTrue(recursiveEquals(term86652, term87224));
        assertTrue(recursiveEquals(retValue, term87204));
    }

};


