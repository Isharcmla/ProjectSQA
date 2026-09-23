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
import java.lang.IllegalArgumentException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Character;
import java.lang.Object;
import java.lang.String;

public class CSVParser_parse_128943060621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1148;

    public CSVParser_parse_128943060621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1150 = new Character('T');
        Character term1153 = new Character('s');
        Character term1256 = new Character('j');
        Class<? extends Object> term16462 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term16461 = ((Class) term16462).getDeclaredField((String) "ALL");
        ((Field) term16461).setAccessible(true);
        Object enum36 = ((Field) term16461).get((Object) null);
        term1148 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term1155 = (Object[]) newArray("java.lang.String", 1);
        Object[] term1168 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term1148, term1148.getClass(), "allowMissingColumnNames", true);
        setField(term1148, term1148.getClass(), "commentMarker", term1150);
        setCharField(term1148, term1148.getClass(), "delimiter", 'D');
        setField(term1148, term1148.getClass(), "escapeCharacter", term1153);
        setElement(term1155, 0, "RkybSrpybU");
        setField(term1148, term1148.getClass(), "header", term1155);
        setElement(term1168, 0, "xOEqzGAmDU");
        setElement(term1168, 1, "eZFUvlxvGV");
        setElement(term1168, 2, "BYqFIqCKAV");
        setElement(term1168, 3, "vrQLuWIDJX");
        setElement(term1168, 4, "flxyYxBRtu");
        setElement(term1168, 5, "OclPbYPkcH");
        setField(term1148, term1148.getClass(), "headerComments", term1168);
        setBooleanField(term1148, term1148.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term1148, term1148.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term1148, term1148.getClass(), "ignoreSurroundingSpaces", false);
        setField(term1148, term1148.getClass(), "nullString", "IoAlmYsBwc");
        setField(term1148, term1148.getClass(), "quoteCharacter", term1256);
        setField(term1148, term1148.getClass(), "quoteMode", enum36);
        setField(term1148, term1148.getClass(), "recordSeparator", "TEParAifyi");
        setBooleanField(term1148, term1148.getClass(), "skipHeaderRecord", true);
        setBooleanField(term1148, term1148.getClass(), "trailingDelimiter", true);
        setBooleanField(term1148, term1148.getClass(), "trim", true);
        setBooleanField(term1148, term1148.getClass(), "autoFlush", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.nio.file.Path");
        argTypes[1] = Class.forName("java.nio.charset.Charset");
        argTypes[2] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term1148;
        try {
            callMethod(klass, "parse", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


