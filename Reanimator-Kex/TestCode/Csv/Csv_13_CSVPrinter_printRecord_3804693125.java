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

public class CSVPrinter_printRecord_3804693125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4391;

    public CSVPrinter_printRecord_3804693125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term4394 = new Character('J');
        Class<? extends Object> term14845 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term14844 = ((Class) term14845).getDeclaredField((String) "MINIMAL");
        ((Field) term14844).setAccessible(true);
        Object enum28 = ((Field) term14844).get((Object) null);
        Character term4407 = new Character('C');
        Character term4409 = new Character('Z');
        term4391 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term4392 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term4438 = (Object[]) newArray("java.lang.String", 2);
        Object[] term4463 = (Object[]) newArray("java.lang.String", 1);
        setField(term4391, term4391.getClass(), "out", null);
        setCharField(term4392, term4392.getClass(), "delimiter", 'j');
        setField(term4392, term4392.getClass(), "quoteCharacter", term4394);
        setField(term4392, term4392.getClass(), "quoteMode", enum28);
        setField(term4392, term4392.getClass(), "commentMarker", term4407);
        setField(term4392, term4392.getClass(), "escapeCharacter", term4409);
        setBooleanField(term4392, term4392.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term4392, term4392.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term4392, term4392.getClass(), "ignoreEmptyLines", false);
        setField(term4392, term4392.getClass(), "recordSeparator", "XPKmummaqg");
        setField(term4392, term4392.getClass(), "nullString", "BKLfkLiZTH");
        setElement(term4438, 0, "SPpkrGcPRr");
        setElement(term4438, 1, "sEccwbJKYE");
        setField(term4392, term4392.getClass(), "header", term4438);
        setElement(term4463, 0, "AWRooQKkdW");
        setField(term4392, term4392.getClass(), "headerComments", term4463);
        setBooleanField(term4392, term4392.getClass(), "skipHeaderRecord", true);
        setBooleanField(term4392, term4392.getClass(), "ignoreHeaderCase", true);
        setField(term4391, term4391.getClass(), "format", term4392);
        setBooleanField(term4391, term4391.getClass(), "newRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Iterable");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "printRecord", argTypes, term4391, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


