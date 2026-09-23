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

public class Partial_toString_1288585676129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77042;
     Object term83514;
     Object term83532;

    public Partial_toString_1288585676129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77042 = newInstance(Class.forName("org.joda.time.Partial"));
        term83514 = newInstance(Class.forName("org.joda.time.format.DateTimeFormat$1"));
        Object term83515 = newInstance(Class.forName("java.util.LinkedHashMap$Entry"));
        Object term83516 = newInstance(Class.forName("java.util.LinkedHashMap$Entry"));
        Object term83517 = newInstance(Class.forName("java.util.LinkedHashMap$Entry"));
        Object term83519 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term83522 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term83523 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral"));
        Object term83526 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term83527 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral"));
        Object[] term83529 = (Object[]) newArray("java.util.HashMap$Node", 8);
        setField(term83515, term83515.getClass(), "before", null);
        setField(term83516, term83516.getClass(), "before", term83515);
        setField(term83517, term83517.getClass(), "before", term83516);
        setField(term83517, term83517.getClass(), "after", null);
        setIntField(term83517, term83517.getClass(), "hash", 73262173);
        setField(term83517, term83517.getClass(), "key", "");
        setField(term83519, term83519.getClass(), "iPrinter", null);
        setField(term83519, term83519.getClass(), "iParser", null);
        setField(term83519, term83519.getClass(), "iLocale", null);
        setBooleanField(term83519, term83519.getClass(), "iOffsetParsed", false);
        setField(term83519, term83519.getClass(), "iChrono", null);
        setField(term83519, term83519.getClass(), "iZone", null);
        setField(term83519, term83519.getClass(), "iPivotYear", null);
        setIntField(term83519, term83519.getClass(), "iDefaultYear", 2000);
        setField(term83517, term83517.getClass(), "value", term83519);
        setField(term83517, term83517.getClass(), "next", null);
        setField(term83516, term83516.getClass(), "after", term83517);
        setIntField(term83516, term83516.getClass(), "hash", 948189316);
        setField(term83516, term83516.getClass(), "key", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term83523, term83523.getClass(), "iValue", null);
        setField(term83522, term83522.getClass(), "iPrinter", term83523);
        setField(term83522, term83522.getClass(), "iParser", term83523);
        setField(term83522, term83522.getClass(), "iLocale", null);
        setBooleanField(term83522, term83522.getClass(), "iOffsetParsed", false);
        setField(term83522, term83522.getClass(), "iChrono", null);
        setField(term83522, term83522.getClass(), "iZone", null);
        setField(term83522, term83522.getClass(), "iPivotYear", null);
        setIntField(term83522, term83522.getClass(), "iDefaultYear", 2000);
        setField(term83516, term83516.getClass(), "value", term83522);
        setField(term83516, term83516.getClass(), "next", null);
        setField(term83515, term83515.getClass(), "after", term83516);
        setIntField(term83515, term83515.getClass(), "hash", 1247604124);
        setField(term83515, term83515.getClass(), "key", "`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        setField(term83527, term83527.getClass(), "iValue", "");
        setField(term83526, term83526.getClass(), "iPrinter", term83527);
        setField(term83526, term83526.getClass(), "iParser", term83527);
        setField(term83526, term83526.getClass(), "iLocale", null);
        setBooleanField(term83526, term83526.getClass(), "iOffsetParsed", false);
        setField(term83526, term83526.getClass(), "iChrono", null);
        setField(term83526, term83526.getClass(), "iZone", null);
        setField(term83526, term83526.getClass(), "iPivotYear", null);
        setIntField(term83526, term83526.getClass(), "iDefaultYear", 2000);
        setField(term83515, term83515.getClass(), "value", term83526);
        setField(term83515, term83515.getClass(), "next", term83516);
        setField(term83514, term83514.getClass(), "head", term83515);
        setField(term83514, term83514.getClass(), "tail", term83517);
        setBooleanField(term83514, term83514.getClass(), "accessOrder", false);
        setElement(term83529, 4, term83515);
        setElement(term83529, 5, term83517);
        setField(term83514, term83514.getClass(), "table", term83529);
        setField(term83514, term83514.getClass(), "entrySet", null);
        setIntField(term83514, term83514.getClass(), "size", 3);
        setIntField(term83514, term83514.getClass(), "modCount", 3);
        setIntField(term83514, term83514.getClass(), "threshold", 6);
        setFloatField(term83514, term83514.getClass(), "loadFactor", 0.75F);
        setField(term83514, term83514.getClass(), "keySet", null);
        setField(term83514, term83514.getClass(), "values", null);
        term83532 = newInstance(Class.forName("java.util.LinkedHashMap$Entry"));
        Object term83533 = newInstance(Class.forName("java.util.LinkedHashMap$Entry"));
        Object term83534 = newInstance(Class.forName("java.util.LinkedHashMap$Entry"));
        Object term83536 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term83539 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term83540 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral"));
        Object term83543 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term83544 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral"));
        setField(term83532, term83532.getClass(), "before", null);
        setField(term83533, term83533.getClass(), "before", term83532);
        setField(term83534, term83534.getClass(), "before", term83533);
        setField(term83534, term83534.getClass(), "after", null);
        setIntField(term83534, term83534.getClass(), "hash", 73262173);
        setField(term83534, term83534.getClass(), "key", "");
        setField(term83536, term83536.getClass(), "iPrinter", null);
        setField(term83536, term83536.getClass(), "iParser", null);
        setField(term83536, term83536.getClass(), "iLocale", null);
        setBooleanField(term83536, term83536.getClass(), "iOffsetParsed", false);
        setField(term83536, term83536.getClass(), "iChrono", null);
        setField(term83536, term83536.getClass(), "iZone", null);
        setField(term83536, term83536.getClass(), "iPivotYear", null);
        setIntField(term83536, term83536.getClass(), "iDefaultYear", 2000);
        setField(term83534, term83534.getClass(), "value", term83536);
        setField(term83534, term83534.getClass(), "next", null);
        setField(term83533, term83533.getClass(), "after", term83534);
        setIntField(term83533, term83533.getClass(), "hash", 948189316);
        setField(term83533, term83533.getClass(), "key", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term83540, term83540.getClass(), "iValue", null);
        setField(term83539, term83539.getClass(), "iPrinter", term83540);
        setField(term83539, term83539.getClass(), "iParser", term83540);
        setField(term83539, term83539.getClass(), "iLocale", null);
        setBooleanField(term83539, term83539.getClass(), "iOffsetParsed", false);
        setField(term83539, term83539.getClass(), "iChrono", null);
        setField(term83539, term83539.getClass(), "iZone", null);
        setField(term83539, term83539.getClass(), "iPivotYear", null);
        setIntField(term83539, term83539.getClass(), "iDefaultYear", 2000);
        setField(term83533, term83533.getClass(), "value", term83539);
        setField(term83533, term83533.getClass(), "next", null);
        setField(term83532, term83532.getClass(), "after", term83533);
        setIntField(term83532, term83532.getClass(), "hash", 1247604124);
        setField(term83532, term83532.getClass(), "key", "`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        setField(term83544, term83544.getClass(), "iValue", "");
        setField(term83543, term83543.getClass(), "iPrinter", term83544);
        setField(term83543, term83543.getClass(), "iParser", term83544);
        setField(term83543, term83543.getClass(), "iLocale", null);
        setBooleanField(term83543, term83543.getClass(), "iOffsetParsed", false);
        setField(term83543, term83543.getClass(), "iChrono", null);
        setField(term83543, term83543.getClass(), "iZone", null);
        setField(term83543, term83543.getClass(), "iPivotYear", null);
        setIntField(term83543, term83543.getClass(), "iDefaultYear", 2000);
        setField(term83532, term83532.getClass(), "value", term83543);
        setField(term83532, term83532.getClass(), "next", term83533);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                ";
        Object retValue = callMethod(klass, "toString", argTypes, term77042, args);
        assertTrue(recursiveEquals(term77042, term83514));
        assertTrue(recursiveEquals(retValue, "                                                                                                                                                                                                                                                "));
    }

};


