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
import java.lang.Boolean;

public class CSVFormat_withIgnoreHeaderCase_192902479060 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25784;
     Object term25853;

    public CSVFormat_withIgnoreHeaderCase_192902479060() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term25786 = new Character('F');
        Character term25789 = new Character('v');
        Character term25820 = new Character('l');
        Class<? extends Object> term25876 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term25875 = ((Class) term25876).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term25875).setAccessible(true);
        Object enum57 = ((Field) term25875).get((Object) null);
        term25784 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term25791 = (Object[]) newArray("java.lang.String", 1);
        Object[] term25804 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term25784, term25784.getClass(), "allowMissingColumnNames", false);
        setField(term25784, term25784.getClass(), "commentMarker", term25786);
        setCharField(term25784, term25784.getClass(), "delimiter", 'U');
        setField(term25784, term25784.getClass(), "escapeCharacter", term25789);
        setElement(term25791, 0, "ecHEQufXoq");
        setField(term25784, term25784.getClass(), "header", term25791);
        setField(term25784, term25784.getClass(), "headerComments", term25804);
        setBooleanField(term25784, term25784.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term25784, term25784.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term25784, term25784.getClass(), "ignoreSurroundingSpaces", true);
        setField(term25784, term25784.getClass(), "nullString", "btBLMvHzJg");
        setField(term25784, term25784.getClass(), "quoteCharacter", term25820);
        setField(term25784, term25784.getClass(), "quoteMode", enum57);
        setField(term25784, term25784.getClass(), "recordSeparator", "JdOMfNWgLP");
        setBooleanField(term25784, term25784.getClass(), "skipHeaderRecord", false);
        setBooleanField(term25784, term25784.getClass(), "trailingDelimiter", false);
        setBooleanField(term25784, term25784.getClass(), "trim", false);
        setBooleanField(term25784, term25784.getClass(), "autoFlush", false);
        term25853 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term25853;
        callMethod(klass, "withIgnoreHeaderCase", argTypes, term25784, args);
    }

};


