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

public class CSVFormat_withQuote_133497001465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28165;
     Object term28254;

    public CSVFormat_withQuote_133497001465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term28167 = new Character('L');
        Character term28170 = new Character('W');
        Character term28225 = new Character('I');
        Class<? extends Object> term28297 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term28296 = ((Class) term28297).getDeclaredField((String) "MINIMAL");
        ((Field) term28296).setAccessible(true);
        Object enum62 = ((Field) term28296).get((Object) null);
        term28165 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term28172 = (Object[]) newArray("java.lang.String", 3);
        Object[] term28209 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term28165, term28165.getClass(), "allowMissingColumnNames", false);
        setField(term28165, term28165.getClass(), "commentMarker", term28167);
        setCharField(term28165, term28165.getClass(), "delimiter", 'u');
        setField(term28165, term28165.getClass(), "escapeCharacter", term28170);
        setElement(term28172, 0, "xypryEkUPF");
        setElement(term28172, 1, "zyZTzHNjQr");
        setElement(term28172, 2, "YSrFKQQwXE");
        setField(term28165, term28165.getClass(), "header", term28172);
        setField(term28165, term28165.getClass(), "headerComments", term28209);
        setBooleanField(term28165, term28165.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term28165, term28165.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term28165, term28165.getClass(), "ignoreSurroundingSpaces", false);
        setField(term28165, term28165.getClass(), "nullString", "qxhOsmyyjm");
        setField(term28165, term28165.getClass(), "quoteCharacter", term28225);
        setField(term28165, term28165.getClass(), "quoteMode", enum62);
        setField(term28165, term28165.getClass(), "recordSeparator", "DuKcNfVVYR");
        setBooleanField(term28165, term28165.getClass(), "skipHeaderRecord", false);
        setBooleanField(term28165, term28165.getClass(), "trailingDelimiter", true);
        setBooleanField(term28165, term28165.getClass(), "trim", false);
        setBooleanField(term28165, term28165.getClass(), "autoFlush", true);
        term28254 = new Character('D');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Character");
        Object[] args = new Object[1];
        args[0] = term28254;
        callMethod(klass, "withQuote", argTypes, term28165, args);
    }

};


