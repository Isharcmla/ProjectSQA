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
import java.lang.NullPointerException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Character;
import java.lang.String;
import java.lang.Integer;

public class CSVPrinter_printAndQuote_202640247722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3112;
     Object term3216;
     Object term3217;
     Object term3219;

    public CSVPrinter_printAndQuote_202640247722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term3115 = new Character('z');
        Class<? extends Object> term12854 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term12853 = ((Class) term12854).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term12853).setAccessible(true);
        Object enum25 = ((Field) term12853).get((Object) null);
        Character term3132 = new Character('x');
        Character term3134 = new Character('x');
        term3112 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term3113 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term3163 = (Object[]) newArray("java.lang.String", 3);
        Object[] term3200 = (Object[]) newArray("java.lang.String", 1);
        setField(term3112, term3112.getClass(), "out", null);
        setCharField(term3113, term3113.getClass(), "delimiter", 'q');
        setField(term3113, term3113.getClass(), "quoteCharacter", term3115);
        setField(term3113, term3113.getClass(), "quoteMode", enum25);
        setField(term3113, term3113.getClass(), "commentMarker", term3132);
        setField(term3113, term3113.getClass(), "escapeCharacter", term3134);
        setBooleanField(term3113, term3113.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term3113, term3113.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term3113, term3113.getClass(), "ignoreEmptyLines", true);
        setField(term3113, term3113.getClass(), "recordSeparator", "IgRJUzaCwW");
        setField(term3113, term3113.getClass(), "nullString", "JUmudUmaaV");
        setElement(term3163, 0, "KoyGrUJeJW");
        setElement(term3163, 1, "HqBOwkVqjD");
        setElement(term3163, 2, "MAcUBcBckh");
        setField(term3113, term3113.getClass(), "header", term3163);
        setElement(term3200, 0, "oVgzLbrsFr");
        setField(term3113, term3113.getClass(), "headerComments", term3200);
        setBooleanField(term3113, term3113.getClass(), "skipHeaderRecord", false);
        setBooleanField(term3113, term3113.getClass(), "ignoreHeaderCase", true);
        setField(term3112, term3112.getClass(), "format", term3113);
        setBooleanField(term3112, term3112.getClass(), "newRecord", true);
        term3216 = newInstance(Class.forName("java.lang.Object"));
        term3217 = new Integer(-1922583790);
        term3219 = new Integer(-616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.CharSequence");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term3216;
        args[1] = null;
        args[2] = term3217;
        args[3] = term3219;
        try {
            callMethod(klass, "printAndQuote", argTypes, term3112, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


