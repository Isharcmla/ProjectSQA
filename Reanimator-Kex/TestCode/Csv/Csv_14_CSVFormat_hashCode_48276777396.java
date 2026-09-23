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

public class CSVFormat_hashCode_48276777396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8250;
     Object term53895;

    public CSVFormat_hashCode_48276777396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term8252 = new Character('F');
        Character term8255 = new Character('R');
        Character term8430 = new Character('N');
        Class<? extends Object> term54075 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term54074 = ((Class) term54075).getDeclaredField((String) "ALL");
        ((Field) term54074).setAccessible(true);
        Object enum111 = ((Field) term54074).get((Object) null);
        term8250 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term8257 = (Object[]) newArray("java.lang.String", 9);
        Object[] term8366 = (Object[]) newArray("java.lang.String", 4);
        setBooleanField(term8250, term8250.getClass(), "allowMissingColumnNames", true);
        setField(term8250, term8250.getClass(), "commentMarker", term8252);
        setCharField(term8250, term8250.getClass(), "delimiter", 'h');
        setField(term8250, term8250.getClass(), "escapeCharacter", term8255);
        setElement(term8257, 0, "YpJbIgJWWv");
        setElement(term8257, 1, "JppkknKVOw");
        setElement(term8257, 2, "iljANwuEjk");
        setElement(term8257, 3, "kNqaJKIATy");
        setElement(term8257, 4, "vKQukfbJUd");
        setElement(term8257, 5, "lFRJFUMVbx");
        setElement(term8257, 6, "sZdUNdggUW");
        setElement(term8257, 7, "OqbwYQfvAe");
        setElement(term8257, 8, "tRxZafjqIx");
        setField(term8250, term8250.getClass(), "header", term8257);
        setElement(term8366, 0, "DhjNLmRMCu");
        setElement(term8366, 1, "PgPzMSEjjX");
        setElement(term8366, 2, "wzsPSPcRdj");
        setElement(term8366, 3, "kGMQdqJYyB");
        setField(term8250, term8250.getClass(), "headerComments", term8366);
        setBooleanField(term8250, term8250.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term8250, term8250.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term8250, term8250.getClass(), "ignoreSurroundingSpaces", false);
        setField(term8250, term8250.getClass(), "nullString", "XJJNClzHRf");
        setField(term8250, term8250.getClass(), "quoteCharacter", term8430);
        setField(term8250, term8250.getClass(), "quoteMode", enum111);
        setField(term8250, term8250.getClass(), "recordSeparator", "HDaezxQfQR");
        setBooleanField(term8250, term8250.getClass(), "skipHeaderRecord", false);
        setBooleanField(term8250, term8250.getClass(), "trailingDelimiter", true);
        setBooleanField(term8250, term8250.getClass(), "trim", true);
        Character term53896 = new Character('F');
        Character term53897 = new Character('R');
        Character term53928 = new Character('N');
        Class<? extends Object> term54401 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term54400 = ((Class) term54401).getDeclaredField((String) "ALL");
        ((Field) term54400).setAccessible(true);
        Object enum112 = ((Field) term54400).get((Object) null);
        term53895 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term53898 = (Object[]) newArray("java.lang.String", 9);
        Object[] term53917 = (Object[]) newArray("java.lang.String", 4);
        setBooleanField(term53895, term53895.getClass(), "allowMissingColumnNames", true);
        setField(term53895, term53895.getClass(), "commentMarker", term53896);
        setCharField(term53895, term53895.getClass(), "delimiter", 'h');
        setField(term53895, term53895.getClass(), "escapeCharacter", term53897);
        setElement(term53898, 0, "YpJbIgJWWv");
        setElement(term53898, 1, "JppkknKVOw");
        setElement(term53898, 2, "iljANwuEjk");
        setElement(term53898, 3, "kNqaJKIATy");
        setElement(term53898, 4, "vKQukfbJUd");
        setElement(term53898, 5, "lFRJFUMVbx");
        setElement(term53898, 6, "sZdUNdggUW");
        setElement(term53898, 7, "OqbwYQfvAe");
        setElement(term53898, 8, "tRxZafjqIx");
        setField(term53895, term53895.getClass(), "header", term53898);
        setElement(term53917, 0, "DhjNLmRMCu");
        setElement(term53917, 1, "PgPzMSEjjX");
        setElement(term53917, 2, "wzsPSPcRdj");
        setElement(term53917, 3, "kGMQdqJYyB");
        setField(term53895, term53895.getClass(), "headerComments", term53917);
        setBooleanField(term53895, term53895.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term53895, term53895.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term53895, term53895.getClass(), "ignoreSurroundingSpaces", false);
        setField(term53895, term53895.getClass(), "nullString", "XJJNClzHRf");
        setField(term53895, term53895.getClass(), "quoteCharacter", term53928);
        setField(term53895, term53895.getClass(), "quoteMode", enum112);
        setField(term53895, term53895.getClass(), "recordSeparator", "HDaezxQfQR");
        setBooleanField(term53895, term53895.getClass(), "skipHeaderRecord", false);
        setBooleanField(term53895, term53895.getClass(), "trailingDelimiter", true);
        setBooleanField(term53895, term53895.getClass(), "trim", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term8250, args);
        assertTrue(recursiveEquals(term8250, term53895));
        assertTrue(recursiveEquals(retValue, 1117626414));
    }

};


