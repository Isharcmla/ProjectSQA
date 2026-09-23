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

public class CSVFormat_validate_72528894243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17993;

    public CSVFormat_validate_72528894243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term17995 = new Character('F');
        Character term17998 = new Character('i');
        Character term18101 = new Character('a');
        Class<? extends Object> term18215 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term18214 = ((Class) term18215).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term18214).setAccessible(true);
        Object enum40 = ((Field) term18214).get((Object) null);
        term17993 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term18000 = (Object[]) newArray("java.lang.String", 1);
        Object[] term18013 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term17993, term17993.getClass(), "allowMissingColumnNames", false);
        setField(term17993, term17993.getClass(), "commentMarker", term17995);
        setCharField(term17993, term17993.getClass(), "delimiter", 'Z');
        setField(term17993, term17993.getClass(), "escapeCharacter", term17998);
        setElement(term18000, 0, "EusenEbIoF");
        setField(term17993, term17993.getClass(), "header", term18000);
        setElement(term18013, 0, "SScVQYSvWH");
        setElement(term18013, 1, "MnovcqFhCl");
        setElement(term18013, 2, "qYtAeLzOhW");
        setElement(term18013, 3, "tJzmOfcUnY");
        setElement(term18013, 4, "TKlccZUpjz");
        setElement(term18013, 5, "GGzwMoHZXC");
        setField(term17993, term17993.getClass(), "headerComments", term18013);
        setBooleanField(term17993, term17993.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term17993, term17993.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term17993, term17993.getClass(), "ignoreSurroundingSpaces", false);
        setField(term17993, term17993.getClass(), "nullString", "IpmgwHTgnG");
        setField(term17993, term17993.getClass(), "quoteCharacter", term18101);
        setField(term17993, term17993.getClass(), "quoteMode", enum40);
        setField(term17993, term17993.getClass(), "recordSeparator", "tIpkeYIezR");
        setBooleanField(term17993, term17993.getClass(), "skipHeaderRecord", true);
        setBooleanField(term17993, term17993.getClass(), "trailingDelimiter", false);
        setBooleanField(term17993, term17993.getClass(), "trim", true);
        setBooleanField(term17993, term17993.getClass(), "autoFlush", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "validate", argTypes, term17993, args);
    }

};


