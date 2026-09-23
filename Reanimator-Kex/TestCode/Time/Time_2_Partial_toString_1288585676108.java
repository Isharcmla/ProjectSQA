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

public class Partial_toString_1288585676108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29712;
     Object term57710;
     Object term57725;

    public Partial_toString_1288585676108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29712 = newInstance(Class.forName("org.joda.time.Partial"));
        term57710 = newInstance(Class.forName("org.joda.time.format.DateTimeFormat$1"));
        Object term57711 = newInstance(Class.forName("java.util.LinkedHashMap$Entry"));
        Object term57712 = newInstance(Class.forName("java.util.LinkedHashMap$Entry"));
        Object term57715 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term57716 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral"));
        Object term57719 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term57720 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral"));
        Object[] term57722 = (Object[]) newArray("java.util.HashMap$Node", 8);
        setField(term57711, term57711.getClass(), "before", null);
        setField(term57712, term57712.getClass(), "before", term57711);
        setField(term57712, term57712.getClass(), "after", null);
        setIntField(term57712, term57712.getClass(), "hash", 948189316);
        setField(term57712, term57712.getClass(), "key", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term57716, term57716.getClass(), "iValue", null);
        setField(term57715, term57715.getClass(), "iPrinter", term57716);
        setField(term57715, term57715.getClass(), "iParser", term57716);
        setField(term57715, term57715.getClass(), "iLocale", null);
        setBooleanField(term57715, term57715.getClass(), "iOffsetParsed", false);
        setField(term57715, term57715.getClass(), "iChrono", null);
        setField(term57715, term57715.getClass(), "iZone", null);
        setField(term57715, term57715.getClass(), "iPivotYear", null);
        setIntField(term57715, term57715.getClass(), "iDefaultYear", 2000);
        setField(term57712, term57712.getClass(), "value", term57715);
        setField(term57712, term57712.getClass(), "next", null);
        setField(term57711, term57711.getClass(), "after", term57712);
        setIntField(term57711, term57711.getClass(), "hash", 1247604124);
        setField(term57711, term57711.getClass(), "key", "`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        setField(term57720, term57720.getClass(), "iValue", "");
        setField(term57719, term57719.getClass(), "iPrinter", term57720);
        setField(term57719, term57719.getClass(), "iParser", term57720);
        setField(term57719, term57719.getClass(), "iLocale", null);
        setBooleanField(term57719, term57719.getClass(), "iOffsetParsed", false);
        setField(term57719, term57719.getClass(), "iChrono", null);
        setField(term57719, term57719.getClass(), "iZone", null);
        setField(term57719, term57719.getClass(), "iPivotYear", null);
        setIntField(term57719, term57719.getClass(), "iDefaultYear", 2000);
        setField(term57711, term57711.getClass(), "value", term57719);
        setField(term57711, term57711.getClass(), "next", term57712);
        setField(term57710, term57710.getClass(), "head", term57711);
        setField(term57710, term57710.getClass(), "tail", term57712);
        setBooleanField(term57710, term57710.getClass(), "accessOrder", false);
        setElement(term57722, 4, term57711);
        setField(term57710, term57710.getClass(), "table", term57722);
        setField(term57710, term57710.getClass(), "entrySet", null);
        setIntField(term57710, term57710.getClass(), "size", 2);
        setIntField(term57710, term57710.getClass(), "modCount", 2);
        setIntField(term57710, term57710.getClass(), "threshold", 6);
        setFloatField(term57710, term57710.getClass(), "loadFactor", 0.75F);
        setField(term57710, term57710.getClass(), "keySet", null);
        setField(term57710, term57710.getClass(), "values", null);
        term57725 = newInstance(Class.forName("java.util.LinkedHashMap$Entry"));
        Object term57726 = newInstance(Class.forName("java.util.LinkedHashMap$Entry"));
        Object term57729 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term57730 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral"));
        Object term57733 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term57734 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral"));
        setField(term57725, term57725.getClass(), "before", null);
        setField(term57726, term57726.getClass(), "before", term57725);
        setField(term57726, term57726.getClass(), "after", null);
        setIntField(term57726, term57726.getClass(), "hash", 948189316);
        setField(term57726, term57726.getClass(), "key", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term57730, term57730.getClass(), "iValue", null);
        setField(term57729, term57729.getClass(), "iPrinter", term57730);
        setField(term57729, term57729.getClass(), "iParser", term57730);
        setField(term57729, term57729.getClass(), "iLocale", null);
        setBooleanField(term57729, term57729.getClass(), "iOffsetParsed", false);
        setField(term57729, term57729.getClass(), "iChrono", null);
        setField(term57729, term57729.getClass(), "iZone", null);
        setField(term57729, term57729.getClass(), "iPivotYear", null);
        setIntField(term57729, term57729.getClass(), "iDefaultYear", 2000);
        setField(term57726, term57726.getClass(), "value", term57729);
        setField(term57726, term57726.getClass(), "next", null);
        setField(term57725, term57725.getClass(), "after", term57726);
        setIntField(term57725, term57725.getClass(), "hash", 1247604124);
        setField(term57725, term57725.getClass(), "key", "`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        setField(term57734, term57734.getClass(), "iValue", "");
        setField(term57733, term57733.getClass(), "iPrinter", term57734);
        setField(term57733, term57733.getClass(), "iParser", term57734);
        setField(term57733, term57733.getClass(), "iLocale", null);
        setBooleanField(term57733, term57733.getClass(), "iOffsetParsed", false);
        setField(term57733, term57733.getClass(), "iChrono", null);
        setField(term57733, term57733.getClass(), "iZone", null);
        setField(term57733, term57733.getClass(), "iPivotYear", null);
        setIntField(term57733, term57733.getClass(), "iDefaultYear", 2000);
        setField(term57725, term57725.getClass(), "value", term57733);
        setField(term57725, term57725.getClass(), "next", term57726);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ";
        Object retValue = callMethod(klass, "toString", argTypes, term29712, args);
        assertTrue(recursiveEquals(term29712, term57710));
        assertTrue(recursiveEquals(retValue, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                "));
    }

};


