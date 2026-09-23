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
import java.lang.Integer;

public class DateTimeFormatterBuilder_append_145070866883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43;
     Object term49;
     Object term1769;
     Object term1772;
     Object term1764;

    public DateTimeFormatterBuilder_append_145070866883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term44 = new ArrayList();
        term43 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term48 = newInstance(Class.forName("java.lang.Object"));
        setField(term43, term43.getClass(), "iElementPairs", term44);
        setField(term43, term43.getClass(), "iFormatter", term48);
        Integer term67 = new Integer(568599855);
        term49 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term50 = newInstance(Class.forName("java.util.Locale"));
        Object term51 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term49, term49.getClass(), "iPrinter", null);
        setField(term49, term49.getClass(), "iParser", null);
        setField(term51, term51.getClass(), "language", "pt");
        setField(term51, term51.getClass(), "script", "");
        setField(term51, term51.getClass(), "region", "MO");
        setField(term51, term51.getClass(), "variant", "");
        setIntField(term51, term51.getClass(), "hash", 106966554);
        setField(term50, term50.getClass(), "baseLocale", term51);
        setField(term50, term50.getClass(), "localeExtensions", null);
        setIntField(term50, term50.getClass(), "hashCodeValue", 106966554);
        setField(term50, term50.getClass(), "languageTag", null);
        setField(term49, term49.getClass(), "iLocale", term50);
        setBooleanField(term49, term49.getClass(), "iOffsetParsed", false);
        setField(term49, term49.getClass(), "iChrono", null);
        setField(term49, term49.getClass(), "iZone", null);
        setField(term49, term49.getClass(), "iPivotYear", term67);
        setIntField(term49, term49.getClass(), "iDefaultYear", 568599855);
        ArrayList term1770 = new ArrayList();
        ((ArrayList) term1770).add((Object)null);
        ((ArrayList) term1770).add((Object)null);
        term1769 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term1769, term1769.getClass(), "iElementPairs", term1770);
        setField(term1769, term1769.getClass(), "iFormatter", null);
        Integer term1783 = new Integer(568599855);
        term1772 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term1773 = newInstance(Class.forName("java.util.Locale"));
        Object term1774 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1772, term1772.getClass(), "iPrinter", null);
        setField(term1772, term1772.getClass(), "iParser", null);
        setField(term1774, term1774.getClass(), "language", "pt");
        setField(term1774, term1774.getClass(), "script", "");
        setField(term1774, term1774.getClass(), "region", "MO");
        setField(term1774, term1774.getClass(), "variant", "");
        setIntField(term1774, term1774.getClass(), "hash", 106966554);
        setField(term1773, term1773.getClass(), "baseLocale", term1774);
        setField(term1773, term1773.getClass(), "localeExtensions", null);
        setIntField(term1773, term1773.getClass(), "hashCodeValue", 106966554);
        setField(term1773, term1773.getClass(), "languageTag", null);
        setField(term1772, term1772.getClass(), "iLocale", term1773);
        setBooleanField(term1772, term1772.getClass(), "iOffsetParsed", false);
        setField(term1772, term1772.getClass(), "iChrono", null);
        setField(term1772, term1772.getClass(), "iZone", null);
        setField(term1772, term1772.getClass(), "iPivotYear", term1783);
        setIntField(term1772, term1772.getClass(), "iDefaultYear", 568599855);
        ArrayList term1765 = new ArrayList();
        ((ArrayList) term1765).add((Object)null);
        ((ArrayList) term1765).add((Object)null);
        term1764 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term1764, term1764.getClass(), "iElementPairs", term1765);
        setField(term1764, term1764.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.format.DateTimeFormatter");
        Object[] args = new Object[1];
        args[0] = term49;
        Object retValue = callMethod(klass, "append", argTypes, term43, args);
        assertTrue(recursiveEquals(term43, term1769));
        assertTrue(recursiveEquals(term49, term1772));
        assertTrue(recursiveEquals(retValue, term1764));
    }

};


