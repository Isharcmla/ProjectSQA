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

public class CSVFormat_getHeaderComments_58354156488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3407;
     Object term46365;
     Object term46095;

    public CSVFormat_getHeaderComments_58354156488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term3409 = new Character('w');
        Character term3412 = new Character('Y');
        Character term3551 = new Character('F');
        Class<? extends Object> term46509 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term46508 = ((Class) term46509).getDeclaredField((String) "MINIMAL");
        ((Field) term46508).setAccessible(true);
        Object enum91 = ((Field) term46508).get((Object) null);
        term3407 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term3414 = (Object[]) newArray("java.lang.String", 2);
        Object[] term3439 = (Object[]) newArray("java.lang.String", 8);
        setBooleanField(term3407, term3407.getClass(), "allowMissingColumnNames", false);
        setField(term3407, term3407.getClass(), "commentMarker", term3409);
        setCharField(term3407, term3407.getClass(), "delimiter", 'D');
        setField(term3407, term3407.getClass(), "escapeCharacter", term3412);
        setElement(term3414, 0, "IgRJUzaCwW");
        setElement(term3414, 1, "JUmudUmaaV");
        setField(term3407, term3407.getClass(), "header", term3414);
        setElement(term3439, 0, "KoyGrUJeJW");
        setElement(term3439, 1, "HqBOwkVqjD");
        setElement(term3439, 2, "MAcUBcBckh");
        setElement(term3439, 3, "oVgzLbrsFr");
        setElement(term3439, 4, "vQVyKLdtaz");
        setElement(term3439, 5, "OWKQODBLzb");
        setElement(term3439, 6, "wGmYcqUkgE");
        setElement(term3439, 7, "idgaQsnJpQ");
        setField(term3407, term3407.getClass(), "headerComments", term3439);
        setBooleanField(term3407, term3407.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term3407, term3407.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term3407, term3407.getClass(), "ignoreSurroundingSpaces", true);
        setField(term3407, term3407.getClass(), "nullString", "VgZnGoIFwQ");
        setField(term3407, term3407.getClass(), "quoteCharacter", term3551);
        setField(term3407, term3407.getClass(), "quoteMode", enum91);
        setField(term3407, term3407.getClass(), "recordSeparator", "jUbSRrkrYZ");
        setBooleanField(term3407, term3407.getClass(), "skipHeaderRecord", true);
        setBooleanField(term3407, term3407.getClass(), "trailingDelimiter", false);
        setBooleanField(term3407, term3407.getClass(), "trim", false);
        setBooleanField(term3407, term3407.getClass(), "autoFlush", false);
        Character term46366 = new Character('w');
        Character term46367 = new Character('Y');
        Character term46392 = new Character('F');
        Class<? extends Object> term46817 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term46816 = ((Class) term46817).getDeclaredField((String) "MINIMAL");
        ((Field) term46816).setAccessible(true);
        Object enum92 = ((Field) term46816).get((Object) null);
        term46365 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term46368 = (Object[]) newArray("java.lang.String", 2);
        Object[] term46373 = (Object[]) newArray("java.lang.String", 8);
        setBooleanField(term46365, term46365.getClass(), "allowMissingColumnNames", false);
        setField(term46365, term46365.getClass(), "commentMarker", term46366);
        setCharField(term46365, term46365.getClass(), "delimiter", 'D');
        setField(term46365, term46365.getClass(), "escapeCharacter", term46367);
        setElement(term46368, 0, "IgRJUzaCwW");
        setElement(term46368, 1, "JUmudUmaaV");
        setField(term46365, term46365.getClass(), "header", term46368);
        setElement(term46373, 0, "KoyGrUJeJW");
        setElement(term46373, 1, "HqBOwkVqjD");
        setElement(term46373, 2, "MAcUBcBckh");
        setElement(term46373, 3, "oVgzLbrsFr");
        setElement(term46373, 4, "vQVyKLdtaz");
        setElement(term46373, 5, "OWKQODBLzb");
        setElement(term46373, 6, "wGmYcqUkgE");
        setElement(term46373, 7, "idgaQsnJpQ");
        setField(term46365, term46365.getClass(), "headerComments", term46373);
        setBooleanField(term46365, term46365.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term46365, term46365.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term46365, term46365.getClass(), "ignoreSurroundingSpaces", true);
        setField(term46365, term46365.getClass(), "nullString", "VgZnGoIFwQ");
        setField(term46365, term46365.getClass(), "quoteCharacter", term46392);
        setField(term46365, term46365.getClass(), "quoteMode", enum92);
        setField(term46365, term46365.getClass(), "recordSeparator", "jUbSRrkrYZ");
        setBooleanField(term46365, term46365.getClass(), "skipHeaderRecord", true);
        setBooleanField(term46365, term46365.getClass(), "trailingDelimiter", false);
        setBooleanField(term46365, term46365.getClass(), "trim", false);
        setBooleanField(term46365, term46365.getClass(), "autoFlush", false);
        term46095 = (Object[]) newArray("java.lang.String", 8);
        setElement(term46095, 0, "KoyGrUJeJW");
        setElement(term46095, 1, "HqBOwkVqjD");
        setElement(term46095, 2, "MAcUBcBckh");
        setElement(term46095, 3, "oVgzLbrsFr");
        setElement(term46095, 4, "vQVyKLdtaz");
        setElement(term46095, 5, "OWKQODBLzb");
        setElement(term46095, 6, "wGmYcqUkgE");
        setElement(term46095, 7, "idgaQsnJpQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getHeaderComments", argTypes, term3407, args);
        assertTrue(recursiveEquals(term3407, term46365));
        assertTrue(recursiveEquals(retValue, term46095));
    }

};


