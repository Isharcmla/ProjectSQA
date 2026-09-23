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

public class CSVFormat_getHeaderComments_58354156485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3358;
     Object term45100;
     Object term44361;

    public CSVFormat_getHeaderComments_58354156485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term3360 = new Character('w');
        Character term3363 = new Character('Y');
        Character term3502 = new Character('F');
        Class<? extends Object> term45244 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term45243 = ((Class) term45244).getDeclaredField((String) "MINIMAL");
        ((Field) term45243).setAccessible(true);
        Object enum88 = ((Field) term45243).get((Object) null);
        term3358 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term3365 = (Object[]) newArray("java.lang.String", 2);
        Object[] term3390 = (Object[]) newArray("java.lang.String", 8);
        setBooleanField(term3358, term3358.getClass(), "allowMissingColumnNames", false);
        setField(term3358, term3358.getClass(), "commentMarker", term3360);
        setCharField(term3358, term3358.getClass(), "delimiter", 'D');
        setField(term3358, term3358.getClass(), "escapeCharacter", term3363);
        setElement(term3365, 0, "IgRJUzaCwW");
        setElement(term3365, 1, "JUmudUmaaV");
        setField(term3358, term3358.getClass(), "header", term3365);
        setElement(term3390, 0, "KoyGrUJeJW");
        setElement(term3390, 1, "HqBOwkVqjD");
        setElement(term3390, 2, "MAcUBcBckh");
        setElement(term3390, 3, "oVgzLbrsFr");
        setElement(term3390, 4, "vQVyKLdtaz");
        setElement(term3390, 5, "OWKQODBLzb");
        setElement(term3390, 6, "wGmYcqUkgE");
        setElement(term3390, 7, "idgaQsnJpQ");
        setField(term3358, term3358.getClass(), "headerComments", term3390);
        setBooleanField(term3358, term3358.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term3358, term3358.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term3358, term3358.getClass(), "ignoreSurroundingSpaces", false);
        setField(term3358, term3358.getClass(), "nullString", "VgZnGoIFwQ");
        setField(term3358, term3358.getClass(), "quoteCharacter", term3502);
        setField(term3358, term3358.getClass(), "quoteMode", enum88);
        setField(term3358, term3358.getClass(), "recordSeparator", "jUbSRrkrYZ");
        setBooleanField(term3358, term3358.getClass(), "skipHeaderRecord", false);
        setBooleanField(term3358, term3358.getClass(), "trailingDelimiter", false);
        setBooleanField(term3358, term3358.getClass(), "trim", true);
        Character term45101 = new Character('w');
        Character term45102 = new Character('Y');
        Character term45127 = new Character('F');
        Class<? extends Object> term45552 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term45551 = ((Class) term45552).getDeclaredField((String) "MINIMAL");
        ((Field) term45551).setAccessible(true);
        Object enum89 = ((Field) term45551).get((Object) null);
        term45100 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term45103 = (Object[]) newArray("java.lang.String", 2);
        Object[] term45108 = (Object[]) newArray("java.lang.String", 8);
        setBooleanField(term45100, term45100.getClass(), "allowMissingColumnNames", false);
        setField(term45100, term45100.getClass(), "commentMarker", term45101);
        setCharField(term45100, term45100.getClass(), "delimiter", 'D');
        setField(term45100, term45100.getClass(), "escapeCharacter", term45102);
        setElement(term45103, 0, "IgRJUzaCwW");
        setElement(term45103, 1, "JUmudUmaaV");
        setField(term45100, term45100.getClass(), "header", term45103);
        setElement(term45108, 0, "KoyGrUJeJW");
        setElement(term45108, 1, "HqBOwkVqjD");
        setElement(term45108, 2, "MAcUBcBckh");
        setElement(term45108, 3, "oVgzLbrsFr");
        setElement(term45108, 4, "vQVyKLdtaz");
        setElement(term45108, 5, "OWKQODBLzb");
        setElement(term45108, 6, "wGmYcqUkgE");
        setElement(term45108, 7, "idgaQsnJpQ");
        setField(term45100, term45100.getClass(), "headerComments", term45108);
        setBooleanField(term45100, term45100.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term45100, term45100.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term45100, term45100.getClass(), "ignoreSurroundingSpaces", false);
        setField(term45100, term45100.getClass(), "nullString", "VgZnGoIFwQ");
        setField(term45100, term45100.getClass(), "quoteCharacter", term45127);
        setField(term45100, term45100.getClass(), "quoteMode", enum89);
        setField(term45100, term45100.getClass(), "recordSeparator", "jUbSRrkrYZ");
        setBooleanField(term45100, term45100.getClass(), "skipHeaderRecord", false);
        setBooleanField(term45100, term45100.getClass(), "trailingDelimiter", false);
        setBooleanField(term45100, term45100.getClass(), "trim", true);
        term44361 = (Object[]) newArray("java.lang.String", 8);
        setElement(term44361, 0, "KoyGrUJeJW");
        setElement(term44361, 1, "HqBOwkVqjD");
        setElement(term44361, 2, "MAcUBcBckh");
        setElement(term44361, 3, "oVgzLbrsFr");
        setElement(term44361, 4, "vQVyKLdtaz");
        setElement(term44361, 5, "OWKQODBLzb");
        setElement(term44361, 6, "wGmYcqUkgE");
        setElement(term44361, 7, "idgaQsnJpQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getHeaderComments", argTypes, term3358, args);
        assertTrue(recursiveEquals(term3358, term45100));
        assertTrue(recursiveEquals(retValue, term44361));
    }

};


