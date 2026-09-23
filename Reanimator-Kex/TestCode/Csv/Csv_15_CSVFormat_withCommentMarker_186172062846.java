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

public class CSVFormat_withCommentMarker_186172062846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19330;
     Object term19560;

    public CSVFormat_withCommentMarker_186172062846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term19332 = new Character('b');
        Character term19335 = new Character('d');
        Character term19534 = new Character('z');
        Class<? extends Object> term19723 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term19722 = ((Class) term19723).getDeclaredField((String) "NONE");
        ((Field) term19722).setAccessible(true);
        Object enum43 = ((Field) term19722).get((Object) null);
        term19330 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term19337 = (Object[]) newArray("java.lang.String", 9);
        Object[] term19446 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term19330, term19330.getClass(), "allowMissingColumnNames", false);
        setField(term19330, term19330.getClass(), "commentMarker", term19332);
        setCharField(term19330, term19330.getClass(), "delimiter", 'c');
        setField(term19330, term19330.getClass(), "escapeCharacter", term19335);
        setElement(term19337, 0, "yevIIoVYHq");
        setElement(term19337, 1, "UuYWMTqWTV");
        setElement(term19337, 2, "DSFGlcaXUb");
        setElement(term19337, 3, "sHMXNUzNeM");
        setElement(term19337, 4, "gPzGDOEPPw");
        setElement(term19337, 5, "rwKoAngzCu");
        setElement(term19337, 6, "VUkRVwROTl");
        setElement(term19337, 7, "UDlkdccCRn");
        setElement(term19337, 8, "McpzErOcYb");
        setField(term19330, term19330.getClass(), "header", term19337);
        setElement(term19446, 0, "jqrVEUvYEz");
        setElement(term19446, 1, "QITgiBrmfj");
        setElement(term19446, 2, "pXxkiXgQnq");
        setElement(term19446, 3, "tKmrUDURku");
        setElement(term19446, 4, "JeZbrwZmsP");
        setElement(term19446, 5, "bxyfeicqrK");
        setField(term19330, term19330.getClass(), "headerComments", term19446);
        setBooleanField(term19330, term19330.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term19330, term19330.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term19330, term19330.getClass(), "ignoreSurroundingSpaces", true);
        setField(term19330, term19330.getClass(), "nullString", "vBnWPlsZMk");
        setField(term19330, term19330.getClass(), "quoteCharacter", term19534);
        setField(term19330, term19330.getClass(), "quoteMode", enum43);
        setField(term19330, term19330.getClass(), "recordSeparator", "fIZsWucfXz");
        setBooleanField(term19330, term19330.getClass(), "skipHeaderRecord", true);
        setBooleanField(term19330, term19330.getClass(), "trailingDelimiter", false);
        setBooleanField(term19330, term19330.getClass(), "trim", true);
        setBooleanField(term19330, term19330.getClass(), "autoFlush", true);
        term19560 = new Character('j');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term19560;
        callMethod(klass, "withCommentMarker", argTypes, term19330, args);
    }

};


