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
import java.lang.Object;
import java.lang.String;

public class CSVFormat_withHeaderComments_1339784981127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23153;
     Object term23217;
     Object term90164;
     Object term90179;
     Object term89935;

    public CSVFormat_withHeaderComments_1339784981127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term23155 = new Character('h');
        Character term23158 = new Character('R');
        Character term23189 = new Character('k');
        Class<? extends Object> term90202 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term90201 = ((Class) term90202).getDeclaredField((String) "MINIMAL");
        ((Field) term90201).setAccessible(true);
        Object enum181 = ((Field) term90201).get((Object) null);
        term23153 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term23160 = (Object[]) newArray("java.lang.String", 1);
        Object[] term23173 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term23153, term23153.getClass(), "allowMissingColumnNames", false);
        setField(term23153, term23153.getClass(), "commentMarker", term23155);
        setCharField(term23153, term23153.getClass(), "delimiter", 'Y');
        setField(term23153, term23153.getClass(), "escapeCharacter", term23158);
        setElement(term23160, 0, "QpYltHAdyY");
        setField(term23153, term23153.getClass(), "header", term23160);
        setField(term23153, term23153.getClass(), "headerComments", term23173);
        setBooleanField(term23153, term23153.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term23153, term23153.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term23153, term23153.getClass(), "ignoreSurroundingSpaces", false);
        setField(term23153, term23153.getClass(), "nullString", "lbmSGBwIiV");
        setField(term23153, term23153.getClass(), "quoteCharacter", term23189);
        setField(term23153, term23153.getClass(), "quoteMode", enum181);
        setField(term23153, term23153.getClass(), "recordSeparator", "DAxyHoTLzZ");
        setBooleanField(term23153, term23153.getClass(), "skipHeaderRecord", true);
        setBooleanField(term23153, term23153.getClass(), "trailingDelimiter", true);
        setBooleanField(term23153, term23153.getClass(), "trim", false);
        term23217 = (Object[]) newArray("java.lang.Object", 1);
        Object term23218 = newInstance(Class.forName("java.lang.Object"));
        setElement(term23217, 0, term23218);
        Character term90165 = new Character('h');
        Character term90166 = new Character('R');
        Character term90173 = new Character('k');
        Class<? extends Object> term90420 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term90419 = ((Class) term90420).getDeclaredField((String) "MINIMAL");
        ((Field) term90419).setAccessible(true);
        Object enum182 = ((Field) term90419).get((Object) null);
        term90164 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term90167 = (Object[]) newArray("java.lang.String", 1);
        Object[] term90170 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term90164, term90164.getClass(), "allowMissingColumnNames", false);
        setField(term90164, term90164.getClass(), "commentMarker", term90165);
        setCharField(term90164, term90164.getClass(), "delimiter", 'Y');
        setField(term90164, term90164.getClass(), "escapeCharacter", term90166);
        setElement(term90167, 0, "QpYltHAdyY");
        setField(term90164, term90164.getClass(), "header", term90167);
        setField(term90164, term90164.getClass(), "headerComments", term90170);
        setBooleanField(term90164, term90164.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term90164, term90164.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term90164, term90164.getClass(), "ignoreSurroundingSpaces", false);
        setField(term90164, term90164.getClass(), "nullString", "lbmSGBwIiV");
        setField(term90164, term90164.getClass(), "quoteCharacter", term90173);
        setField(term90164, term90164.getClass(), "quoteMode", enum182);
        setField(term90164, term90164.getClass(), "recordSeparator", "DAxyHoTLzZ");
        setBooleanField(term90164, term90164.getClass(), "skipHeaderRecord", true);
        setBooleanField(term90164, term90164.getClass(), "trailingDelimiter", true);
        setBooleanField(term90164, term90164.getClass(), "trim", false);
        term90179 = (Object[]) newArray("java.lang.Object", 1);
        Object term90180 = newInstance(Class.forName("java.lang.Object"));
        setElement(term90179, 0, term90180);
        Character term89937 = new Character('h');
        Character term89940 = new Character('R');
        Character term89998 = new Character('k');
        Class<? extends Object> term90663 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term90662 = ((Class) term90663).getDeclaredField((String) "MINIMAL");
        ((Field) term90662).setAccessible(true);
        Object enum183 = ((Field) term90662).get((Object) null);
        term89935 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term89942 = (Object[]) newArray("java.lang.String", 1);
        Object[] term89955 = (Object[]) newArray("java.lang.String", 1);
        setBooleanField(term89935, term89935.getClass(), "allowMissingColumnNames", false);
        setField(term89935, term89935.getClass(), "commentMarker", term89937);
        setCharField(term89935, term89935.getClass(), "delimiter", 'Y');
        setField(term89935, term89935.getClass(), "escapeCharacter", term89940);
        setElement(term89942, 0, "QpYltHAdyY");
        setField(term89935, term89935.getClass(), "header", term89942);
        setElement(term89955, 0, "java.lang.Object@7ad55dda");
        setField(term89935, term89935.getClass(), "headerComments", term89955);
        setBooleanField(term89935, term89935.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term89935, term89935.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term89935, term89935.getClass(), "ignoreSurroundingSpaces", false);
        setField(term89935, term89935.getClass(), "nullString", "lbmSGBwIiV");
        setField(term89935, term89935.getClass(), "quoteCharacter", term89998);
        setField(term89935, term89935.getClass(), "quoteMode", enum183);
        setField(term89935, term89935.getClass(), "recordSeparator", "DAxyHoTLzZ");
        setBooleanField(term89935, term89935.getClass(), "skipHeaderRecord", true);
        setBooleanField(term89935, term89935.getClass(), "trailingDelimiter", true);
        setBooleanField(term89935, term89935.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term23217;
        Object retValue = callMethod(klass, "withHeaderComments", argTypes, term23153, args);
        assertTrue(recursiveEquals(term23153, term90164));
        assertTrue(recursiveEquals(term23217, term90179));
        assertTrue(recursiveEquals(retValue, term89935));
    }

};


