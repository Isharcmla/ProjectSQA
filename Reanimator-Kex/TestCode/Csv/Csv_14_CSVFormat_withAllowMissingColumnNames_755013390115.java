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

public class CSVFormat_withAllowMissingColumnNames_755013390115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17522;
     Object term72000;
     Object term71875;

    public CSVFormat_withAllowMissingColumnNames_755013390115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term17524 = new Character('C');
        Character term17527 = new Character('V');
        Character term17630 = new Character('t');
        Class<? extends Object> term72108 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term72107 = ((Class) term72108).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term72107).setAccessible(true);
        Object enum145 = ((Field) term72107).get((Object) null);
        term17522 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term17529 = (Object[]) newArray("java.lang.String", 0);
        Object[] term17530 = (Object[]) newArray("java.lang.String", 7);
        setBooleanField(term17522, term17522.getClass(), "allowMissingColumnNames", true);
        setField(term17522, term17522.getClass(), "commentMarker", term17524);
        setCharField(term17522, term17522.getClass(), "delimiter", 'F');
        setField(term17522, term17522.getClass(), "escapeCharacter", term17527);
        setField(term17522, term17522.getClass(), "header", term17529);
        setElement(term17530, 0, "cdHYQDgUZR");
        setElement(term17530, 1, "KAORSSPSeV");
        setElement(term17530, 2, "UimMMORkzd");
        setElement(term17530, 3, "huVIXUWLtI");
        setElement(term17530, 4, "vhKzFyKPOT");
        setElement(term17530, 5, "nQhIgWXdRc");
        setElement(term17530, 6, "EusenEbIoF");
        setField(term17522, term17522.getClass(), "headerComments", term17530);
        setBooleanField(term17522, term17522.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term17522, term17522.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term17522, term17522.getClass(), "ignoreSurroundingSpaces", true);
        setField(term17522, term17522.getClass(), "nullString", "SScVQYSvWH");
        setField(term17522, term17522.getClass(), "quoteCharacter", term17630);
        setField(term17522, term17522.getClass(), "quoteMode", enum145);
        setField(term17522, term17522.getClass(), "recordSeparator", "MnovcqFhCl");
        setBooleanField(term17522, term17522.getClass(), "skipHeaderRecord", false);
        setBooleanField(term17522, term17522.getClass(), "trailingDelimiter", false);
        setBooleanField(term17522, term17522.getClass(), "trim", false);
        Character term72001 = new Character('C');
        Character term72002 = new Character('V');
        Character term72021 = new Character('t');
        Class<? extends Object> term72398 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term72397 = ((Class) term72398).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term72397).setAccessible(true);
        Object enum146 = ((Field) term72397).get((Object) null);
        term72000 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term72003 = (Object[]) newArray("java.lang.String", 0);
        Object[] term72004 = (Object[]) newArray("java.lang.String", 7);
        setBooleanField(term72000, term72000.getClass(), "allowMissingColumnNames", true);
        setField(term72000, term72000.getClass(), "commentMarker", term72001);
        setCharField(term72000, term72000.getClass(), "delimiter", 'F');
        setField(term72000, term72000.getClass(), "escapeCharacter", term72002);
        setField(term72000, term72000.getClass(), "header", term72003);
        setElement(term72004, 0, "cdHYQDgUZR");
        setElement(term72004, 1, "KAORSSPSeV");
        setElement(term72004, 2, "UimMMORkzd");
        setElement(term72004, 3, "huVIXUWLtI");
        setElement(term72004, 4, "vhKzFyKPOT");
        setElement(term72004, 5, "nQhIgWXdRc");
        setElement(term72004, 6, "EusenEbIoF");
        setField(term72000, term72000.getClass(), "headerComments", term72004);
        setBooleanField(term72000, term72000.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term72000, term72000.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term72000, term72000.getClass(), "ignoreSurroundingSpaces", true);
        setField(term72000, term72000.getClass(), "nullString", "SScVQYSvWH");
        setField(term72000, term72000.getClass(), "quoteCharacter", term72021);
        setField(term72000, term72000.getClass(), "quoteMode", enum146);
        setField(term72000, term72000.getClass(), "recordSeparator", "MnovcqFhCl");
        setBooleanField(term72000, term72000.getClass(), "skipHeaderRecord", false);
        setBooleanField(term72000, term72000.getClass(), "trailingDelimiter", false);
        setBooleanField(term72000, term72000.getClass(), "trim", false);
        Character term71877 = new Character('C');
        Character term71880 = new Character('V');
        Character term71983 = new Character('t');
        Class<? extends Object> term72688 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term72687 = ((Class) term72688).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term72687).setAccessible(true);
        Object enum147 = ((Field) term72687).get((Object) null);
        term71875 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term71882 = (Object[]) newArray("java.lang.String", 0);
        Object[] term71883 = (Object[]) newArray("java.lang.String", 7);
        setBooleanField(term71875, term71875.getClass(), "allowMissingColumnNames", true);
        setField(term71875, term71875.getClass(), "commentMarker", term71877);
        setCharField(term71875, term71875.getClass(), "delimiter", 'F');
        setField(term71875, term71875.getClass(), "escapeCharacter", term71880);
        setField(term71875, term71875.getClass(), "header", term71882);
        setElement(term71883, 0, "cdHYQDgUZR");
        setElement(term71883, 1, "KAORSSPSeV");
        setElement(term71883, 2, "UimMMORkzd");
        setElement(term71883, 3, "huVIXUWLtI");
        setElement(term71883, 4, "vhKzFyKPOT");
        setElement(term71883, 5, "nQhIgWXdRc");
        setElement(term71883, 6, "EusenEbIoF");
        setField(term71875, term71875.getClass(), "headerComments", term71883);
        setBooleanField(term71875, term71875.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term71875, term71875.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term71875, term71875.getClass(), "ignoreSurroundingSpaces", true);
        setField(term71875, term71875.getClass(), "nullString", "SScVQYSvWH");
        setField(term71875, term71875.getClass(), "quoteCharacter", term71983);
        setField(term71875, term71875.getClass(), "quoteMode", enum147);
        setField(term71875, term71875.getClass(), "recordSeparator", "MnovcqFhCl");
        setBooleanField(term71875, term71875.getClass(), "skipHeaderRecord", false);
        setBooleanField(term71875, term71875.getClass(), "trailingDelimiter", false);
        setBooleanField(term71875, term71875.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "withAllowMissingColumnNames", argTypes, term17522, args);
        assertTrue(recursiveEquals(term17522, term72000));
        assertTrue(recursiveEquals(retValue, term71875));
    }

};


