package org.apache.commons.csv;

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
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.csv.EqualityUtils.*;
import java.lang.Character;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public class CSVFormat_withIgnoreEmptyLines_47944145171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9132;
     Object term9255;
     Object term34868;
     Object term34516;

    public CSVFormat_withIgnoreEmptyLines_47944145171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term9134 = new Character('x');
        Class<? extends Object> term34893 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term34892 = ((Class) term34893).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term34892).setAccessible(true);
        Object enum100 = ((Field) term34892).get((Object) null);
        Character term9151 = new Character('l');
        Character term9153 = new Character('s');
        term9132 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term9181 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term9132, term9132.getClass(), "delimiter", 'M');
        setField(term9132, term9132.getClass(), "quoteChar", term9134);
        setField(term9132, term9132.getClass(), "quotePolicy", enum100);
        setField(term9132, term9132.getClass(), "commentStart", term9151);
        setField(term9132, term9132.getClass(), "escape", term9153);
        setBooleanField(term9132, term9132.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term9132, term9132.getClass(), "ignoreEmptyLines", false);
        setField(term9132, term9132.getClass(), "recordSeparator", "zUlRdimJtU");
        setField(term9132, term9132.getClass(), "nullString", "vwbEQQNQrx");
        setElement(term9181, 0, "xtftXXMbem");
        setElement(term9181, 1, "cudZvLMQon");
        setElement(term9181, 2, "lihXWlGDxk");
        setElement(term9181, 3, "JmcmxoGhIK");
        setElement(term9181, 4, "jXzmYyrnnT");
        setElement(term9181, 5, "igCAtimmYB");
        setField(term9132, term9132.getClass(), "header", term9181);
        setBooleanField(term9132, term9132.getClass(), "skipHeaderRecord", true);
        term9255 = new Boolean(false);
        Character term34869 = new Character('x');
        Class<? extends Object> term35153 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term35152 = ((Class) term35153).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term35152).setAccessible(true);
        Object enum101 = ((Field) term35152).get((Object) null);
        Character term34873 = new Character('l');
        Character term34874 = new Character('s');
        term34868 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term34879 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term34868, term34868.getClass(), "delimiter", 'M');
        setField(term34868, term34868.getClass(), "quoteChar", term34869);
        setField(term34868, term34868.getClass(), "quotePolicy", enum101);
        setField(term34868, term34868.getClass(), "commentStart", term34873);
        setField(term34868, term34868.getClass(), "escape", term34874);
        setBooleanField(term34868, term34868.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term34868, term34868.getClass(), "ignoreEmptyLines", false);
        setField(term34868, term34868.getClass(), "recordSeparator", "zUlRdimJtU");
        setField(term34868, term34868.getClass(), "nullString", "vwbEQQNQrx");
        setElement(term34879, 0, "xtftXXMbem");
        setElement(term34879, 1, "cudZvLMQon");
        setElement(term34879, 2, "lihXWlGDxk");
        setElement(term34879, 3, "JmcmxoGhIK");
        setElement(term34879, 4, "jXzmYyrnnT");
        setElement(term34879, 5, "igCAtimmYB");
        setField(term34868, term34868.getClass(), "header", term34879);
        setBooleanField(term34868, term34868.getClass(), "skipHeaderRecord", true);
        Character term34518 = new Character('x');
        Class<? extends Object> term35413 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term35412 = ((Class) term35413).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term35412).setAccessible(true);
        Object enum102 = ((Field) term35412).get((Object) null);
        Character term34535 = new Character('l');
        Character term34537 = new Character('s');
        term34516 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term34565 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term34516, term34516.getClass(), "delimiter", 'M');
        setField(term34516, term34516.getClass(), "quoteChar", term34518);
        setField(term34516, term34516.getClass(), "quotePolicy", enum102);
        setField(term34516, term34516.getClass(), "commentStart", term34535);
        setField(term34516, term34516.getClass(), "escape", term34537);
        setBooleanField(term34516, term34516.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term34516, term34516.getClass(), "ignoreEmptyLines", false);
        setField(term34516, term34516.getClass(), "recordSeparator", "zUlRdimJtU");
        setField(term34516, term34516.getClass(), "nullString", "vwbEQQNQrx");
        setElement(term34565, 0, "xtftXXMbem");
        setElement(term34565, 1, "cudZvLMQon");
        setElement(term34565, 2, "lihXWlGDxk");
        setElement(term34565, 3, "JmcmxoGhIK");
        setElement(term34565, 4, "jXzmYyrnnT");
        setElement(term34565, 5, "igCAtimmYB");
        setField(term34516, term34516.getClass(), "header", term34565);
        setBooleanField(term34516, term34516.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term9255;
        Object retValue = callMethod(klass, "withIgnoreEmptyLines", argTypes, term9132, args);
        assertTrue(recursiveEquals(term9132, term34868));
        assertTrue(recursiveEquals(term9255, false));
        assertTrue(recursiveEquals(retValue, term34516));
    }

};


