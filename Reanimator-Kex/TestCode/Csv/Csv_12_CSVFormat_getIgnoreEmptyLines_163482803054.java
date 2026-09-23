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

public class CSVFormat_getIgnoreEmptyLines_163482803054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2858;
     Object term24419;

    public CSVFormat_getIgnoreEmptyLines_163482803054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term2860 = new Character('D');
        Class<? extends Object> term24434 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term24433 = ((Class) term24434).getDeclaredField((String) "MINIMAL");
        ((Field) term24433).setAccessible(true);
        Object enum58 = ((Field) term24433).get((Object) null);
        Character term2873 = new Character('Y');
        Character term2875 = new Character('F');
        term2858 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term2904 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term2858, term2858.getClass(), "delimiter", 'w');
        setField(term2858, term2858.getClass(), "quoteCharacter", term2860);
        setField(term2858, term2858.getClass(), "quoteMode", enum58);
        setField(term2858, term2858.getClass(), "commentMarker", term2873);
        setField(term2858, term2858.getClass(), "escapeCharacter", term2875);
        setBooleanField(term2858, term2858.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term2858, term2858.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term2858, term2858.getClass(), "ignoreEmptyLines", false);
        setField(term2858, term2858.getClass(), "recordSeparator", "nGKItKLYNC");
        setField(term2858, term2858.getClass(), "nullString", "UiUYnPrcCi");
        setElement(term2904, 0, "UoYtihxVaS");
        setField(term2858, term2858.getClass(), "header", term2904);
        setBooleanField(term2858, term2858.getClass(), "skipHeaderRecord", true);
        Character term24420 = new Character('D');
        Class<? extends Object> term24652 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term24651 = ((Class) term24652).getDeclaredField((String) "MINIMAL");
        ((Field) term24651).setAccessible(true);
        Object enum59 = ((Field) term24651).get((Object) null);
        Character term24424 = new Character('Y');
        Character term24425 = new Character('F');
        term24419 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term24430 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term24419, term24419.getClass(), "delimiter", 'w');
        setField(term24419, term24419.getClass(), "quoteCharacter", term24420);
        setField(term24419, term24419.getClass(), "quoteMode", enum59);
        setField(term24419, term24419.getClass(), "commentMarker", term24424);
        setField(term24419, term24419.getClass(), "escapeCharacter", term24425);
        setBooleanField(term24419, term24419.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term24419, term24419.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term24419, term24419.getClass(), "ignoreEmptyLines", false);
        setField(term24419, term24419.getClass(), "recordSeparator", "nGKItKLYNC");
        setField(term24419, term24419.getClass(), "nullString", "UiUYnPrcCi");
        setElement(term24430, 0, "UoYtihxVaS");
        setField(term24419, term24419.getClass(), "header", term24430);
        setBooleanField(term24419, term24419.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIgnoreEmptyLines", argTypes, term2858, args);
        assertTrue(recursiveEquals(term2858, term24419));
    }

};


