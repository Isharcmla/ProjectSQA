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
import java.lang.Character;
import java.lang.Object;
import java.lang.String;

public class CSVFormat_trim_47170138842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17594;

    public CSVFormat_trim_47170138842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term17596 = new Character('C');
        Character term17599 = new Character('V');
        Character term17702 = new Character('t');
        Class<? extends Object> term17808 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term17807 = ((Class) term17808).getDeclaredField((String) "ALL");
        ((Field) term17807).setAccessible(true);
        Object enum39 = ((Field) term17807).get((Object) null);
        term17594 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term17601 = (Object[]) newArray("java.lang.String", 0);
        Object[] term17602 = (Object[]) newArray("java.lang.String", 7);
        setBooleanField(term17594, term17594.getClass(), "allowMissingColumnNames", false);
        setField(term17594, term17594.getClass(), "commentMarker", term17596);
        setCharField(term17594, term17594.getClass(), "delimiter", 'F');
        setField(term17594, term17594.getClass(), "escapeCharacter", term17599);
        setField(term17594, term17594.getClass(), "header", term17601);
        setElement(term17602, 0, "yeSXGqQExb");
        setElement(term17602, 1, "uXYcXVYJZM");
        setElement(term17602, 2, "BJhjdJUhkz");
        setElement(term17602, 3, "cdHYQDgUZR");
        setElement(term17602, 4, "KAORSSPSeV");
        setElement(term17602, 5, "UimMMORkzd");
        setElement(term17602, 6, "huVIXUWLtI");
        setField(term17594, term17594.getClass(), "headerComments", term17602);
        setBooleanField(term17594, term17594.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term17594, term17594.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term17594, term17594.getClass(), "ignoreSurroundingSpaces", true);
        setField(term17594, term17594.getClass(), "nullString", "vhKzFyKPOT");
        setField(term17594, term17594.getClass(), "quoteCharacter", term17702);
        setField(term17594, term17594.getClass(), "quoteMode", enum39);
        setField(term17594, term17594.getClass(), "recordSeparator", "nQhIgWXdRc");
        setBooleanField(term17594, term17594.getClass(), "skipHeaderRecord", true);
        setBooleanField(term17594, term17594.getClass(), "trailingDelimiter", true);
        setBooleanField(term17594, term17594.getClass(), "trim", false);
        setBooleanField(term17594, term17594.getClass(), "autoFlush", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.CharSequence");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "trim", argTypes, term17594, args);
    }

};


