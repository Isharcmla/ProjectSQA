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

public class CSVFormat_withDelimiter_121563385448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20466;
     Object term20560;

    public CSVFormat_withDelimiter_121563385448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term20468 = new Character('y');
        Character term20471 = new Character('f');
        Character term20526 = new Character('b');
        Class<? extends Object> term20603 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term20602 = ((Class) term20603).getDeclaredField((String) "ALL_NON_NULL");
        ((Field) term20602).setAccessible(true);
        Object enum45 = ((Field) term20602).get((Object) null);
        term20466 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term20473 = (Object[]) newArray("java.lang.String", 2);
        Object[] term20498 = (Object[]) newArray("java.lang.String", 1);
        setBooleanField(term20466, term20466.getClass(), "allowMissingColumnNames", false);
        setField(term20466, term20466.getClass(), "commentMarker", term20468);
        setCharField(term20466, term20466.getClass(), "delimiter", 'x');
        setField(term20466, term20466.getClass(), "escapeCharacter", term20471);
        setElement(term20473, 0, "CAgxWjhxNf");
        setElement(term20473, 1, "goAoCMhKBu");
        setField(term20466, term20466.getClass(), "header", term20473);
        setElement(term20498, 0, "BWxJSgKHRT");
        setField(term20466, term20466.getClass(), "headerComments", term20498);
        setBooleanField(term20466, term20466.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term20466, term20466.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term20466, term20466.getClass(), "ignoreSurroundingSpaces", true);
        setField(term20466, term20466.getClass(), "nullString", "AGXoIndFnm");
        setField(term20466, term20466.getClass(), "quoteCharacter", term20526);
        setField(term20466, term20466.getClass(), "quoteMode", enum45);
        setField(term20466, term20466.getClass(), "recordSeparator", "mwmFMNEzkK");
        setBooleanField(term20466, term20466.getClass(), "skipHeaderRecord", false);
        setBooleanField(term20466, term20466.getClass(), "trailingDelimiter", true);
        setBooleanField(term20466, term20466.getClass(), "trim", true);
        setBooleanField(term20466, term20466.getClass(), "autoFlush", true);
        term20560 = new Character('S');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term20560;
        callMethod(klass, "withDelimiter", argTypes, term20466, args);
    }

};


