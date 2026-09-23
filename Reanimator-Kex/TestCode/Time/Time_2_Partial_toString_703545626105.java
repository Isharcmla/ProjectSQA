package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.EqualityUtils.*;
import java.lang.Object;

public class Partial_toString_703545626105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28376;
     Object term42602;
     Object term42612;

    public Partial_toString_703545626105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28376 = newInstance(Class.forName("org.joda.time.Partial"));
        term42602 = newInstance(Class.forName("org.joda.time.format.DateTimeFormat$1"));
        Object term42603 = newInstance(Class.forName("java.util.LinkedHashMap$Entry"));
        Object term42606 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term42607 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral"));
        Object[] term42609 = (Object[]) newArray("java.util.HashMap$Node", 8);
        setField(term42603, term42603.getClass(), "before", null);
        setField(term42603, term42603.getClass(), "after", null);
        setIntField(term42603, term42603.getClass(), "hash", 1247604124);
        setField(term42603, term42603.getClass(), "key", "`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        setField(term42607, term42607.getClass(), "iValue", "");
        setField(term42606, term42606.getClass(), "iPrinter", term42607);
        setField(term42606, term42606.getClass(), "iParser", term42607);
        setField(term42606, term42606.getClass(), "iLocale", null);
        setBooleanField(term42606, term42606.getClass(), "iOffsetParsed", false);
        setField(term42606, term42606.getClass(), "iChrono", null);
        setField(term42606, term42606.getClass(), "iZone", null);
        setField(term42606, term42606.getClass(), "iPivotYear", null);
        setIntField(term42606, term42606.getClass(), "iDefaultYear", 2000);
        setField(term42603, term42603.getClass(), "value", term42606);
        setField(term42603, term42603.getClass(), "next", null);
        setField(term42602, term42602.getClass(), "head", term42603);
        setField(term42602, term42602.getClass(), "tail", term42603);
        setBooleanField(term42602, term42602.getClass(), "accessOrder", false);
        setElement(term42609, 4, term42603);
        setField(term42602, term42602.getClass(), "table", term42609);
        setField(term42602, term42602.getClass(), "entrySet", null);
        setIntField(term42602, term42602.getClass(), "size", 1);
        setIntField(term42602, term42602.getClass(), "modCount", 1);
        setIntField(term42602, term42602.getClass(), "threshold", 6);
        setFloatField(term42602, term42602.getClass(), "loadFactor", 0.75F);
        setField(term42602, term42602.getClass(), "keySet", null);
        setField(term42602, term42602.getClass(), "values", null);
        term42612 = newInstance(Class.forName("java.util.LinkedHashMap$Entry"));
        Object term42615 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term42616 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral"));
        setField(term42612, term42612.getClass(), "before", null);
        setField(term42612, term42612.getClass(), "after", null);
        setIntField(term42612, term42612.getClass(), "hash", 1247604124);
        setField(term42612, term42612.getClass(), "key", "`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        setField(term42616, term42616.getClass(), "iValue", "");
        setField(term42615, term42615.getClass(), "iPrinter", term42616);
        setField(term42615, term42615.getClass(), "iParser", term42616);
        setField(term42615, term42615.getClass(), "iLocale", null);
        setBooleanField(term42615, term42615.getClass(), "iOffsetParsed", false);
        setField(term42615, term42615.getClass(), "iChrono", null);
        setField(term42615, term42615.getClass(), "iZone", null);
        setField(term42615, term42615.getClass(), "iPivotYear", null);
        setIntField(term42615, term42615.getClass(), "iDefaultYear", 2000);
        setField(term42612, term42612.getClass(), "value", term42615);
        setField(term42612, term42612.getClass(), "next", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Locale");
        Object[] args = new Object[2];
        args[0] = "`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ";
        args[1] = null;
        Object retValue = callMethod(klass, "toString", argTypes, term28376, args);
        assertTrue(recursiveEquals(term28376, term42602));
        assertTrue(recursiveEquals(retValue, "`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       "));
    }

};


