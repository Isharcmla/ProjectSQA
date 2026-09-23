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

public class CSVFormat_hashCode_48276777378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7953;
     Object term53185;

    public CSVFormat_hashCode_48276777378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term7955 = new Character('K');
        Class<? extends Object> term53217 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term53216 = ((Class) term53217).getDeclaredField((String) "MINIMAL");
        ((Field) term53216).setAccessible(true);
        Object enum91 = ((Field) term53216).get((Object) null);
        Character term7968 = new Character('T');
        Character term7970 = new Character('N');
        term7953 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term7999 = (Object[]) newArray("java.lang.String", 0);
        Object[] term8000 = (Object[]) newArray("java.lang.String", 9);
        setCharField(term7953, term7953.getClass(), "delimiter", 'R');
        setField(term7953, term7953.getClass(), "quoteCharacter", term7955);
        setField(term7953, term7953.getClass(), "quoteMode", enum91);
        setField(term7953, term7953.getClass(), "commentMarker", term7968);
        setField(term7953, term7953.getClass(), "escapeCharacter", term7970);
        setBooleanField(term7953, term7953.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term7953, term7953.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term7953, term7953.getClass(), "ignoreEmptyLines", true);
        setField(term7953, term7953.getClass(), "recordSeparator", "ekxGuOYIwi");
        setField(term7953, term7953.getClass(), "nullString", "RbVQXSpxXy");
        setField(term7953, term7953.getClass(), "header", term7999);
        setElement(term8000, 0, "YpJbIgJWWv");
        setElement(term8000, 1, "JppkknKVOw");
        setElement(term8000, 2, "iljANwuEjk");
        setElement(term8000, 3, "kNqaJKIATy");
        setElement(term8000, 4, "vKQukfbJUd");
        setElement(term8000, 5, "lFRJFUMVbx");
        setElement(term8000, 6, "sZdUNdggUW");
        setElement(term8000, 7, "OqbwYQfvAe");
        setElement(term8000, 8, "tRxZafjqIx");
        setField(term7953, term7953.getClass(), "headerComments", term8000);
        setBooleanField(term7953, term7953.getClass(), "skipHeaderRecord", true);
        setBooleanField(term7953, term7953.getClass(), "ignoreHeaderCase", false);
        Character term53186 = new Character('K');
        Class<? extends Object> term53515 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term53514 = ((Class) term53515).getDeclaredField((String) "MINIMAL");
        ((Field) term53514).setAccessible(true);
        Object enum92 = ((Field) term53514).get((Object) null);
        Character term53190 = new Character('T');
        Character term53191 = new Character('N');
        term53185 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term53196 = (Object[]) newArray("java.lang.String", 0);
        Object[] term53197 = (Object[]) newArray("java.lang.String", 9);
        setCharField(term53185, term53185.getClass(), "delimiter", 'R');
        setField(term53185, term53185.getClass(), "quoteCharacter", term53186);
        setField(term53185, term53185.getClass(), "quoteMode", enum92);
        setField(term53185, term53185.getClass(), "commentMarker", term53190);
        setField(term53185, term53185.getClass(), "escapeCharacter", term53191);
        setBooleanField(term53185, term53185.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term53185, term53185.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term53185, term53185.getClass(), "ignoreEmptyLines", true);
        setField(term53185, term53185.getClass(), "recordSeparator", "ekxGuOYIwi");
        setField(term53185, term53185.getClass(), "nullString", "RbVQXSpxXy");
        setField(term53185, term53185.getClass(), "header", term53196);
        setElement(term53197, 0, "YpJbIgJWWv");
        setElement(term53197, 1, "JppkknKVOw");
        setElement(term53197, 2, "iljANwuEjk");
        setElement(term53197, 3, "kNqaJKIATy");
        setElement(term53197, 4, "vKQukfbJUd");
        setElement(term53197, 5, "lFRJFUMVbx");
        setElement(term53197, 6, "sZdUNdggUW");
        setElement(term53197, 7, "OqbwYQfvAe");
        setElement(term53197, 8, "tRxZafjqIx");
        setField(term53185, term53185.getClass(), "headerComments", term53197);
        setBooleanField(term53185, term53185.getClass(), "skipHeaderRecord", true);
        setBooleanField(term53185, term53185.getClass(), "ignoreHeaderCase", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term7953, args);
        assertTrue(recursiveEquals(term7953, term53185));
        assertTrue(recursiveEquals(retValue, 1381920927));
    }

};


