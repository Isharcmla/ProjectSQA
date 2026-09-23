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

public class CSVParser_parse_72103232622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1547;

    public CSVParser_parse_72103232622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1549 = new Character('l');
        Character term1552 = new Character('A');
        Character term1667 = new Character('E');
        Class<? extends Object> term17094 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term17093 = ((Class) term17094).getDeclaredField((String) "ALL");
        ((Field) term17093).setAccessible(true);
        Object enum37 = ((Field) term17093).get((Object) null);
        term1547 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term1554 = (Object[]) newArray("java.lang.String", 2);
        Object[] term1579 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term1547, term1547.getClass(), "allowMissingColumnNames", true);
        setField(term1547, term1547.getClass(), "commentMarker", term1549);
        setCharField(term1547, term1547.getClass(), "delimiter", 'J');
        setField(term1547, term1547.getClass(), "escapeCharacter", term1552);
        setElement(term1554, 0, "OWDIEULEFu");
        setElement(term1554, 1, "dWRymuLBtr");
        setField(term1547, term1547.getClass(), "header", term1554);
        setElement(term1579, 0, "AijpHYOFuy");
        setElement(term1579, 1, "SbAoxhfrkn");
        setElement(term1579, 2, "kuTXqwMtDB");
        setElement(term1579, 3, "Ghbwtircqb");
        setElement(term1579, 4, "xrwlQZdwCp");
        setElement(term1579, 5, "IDCWpPLRkE");
        setField(term1547, term1547.getClass(), "headerComments", term1579);
        setBooleanField(term1547, term1547.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term1547, term1547.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term1547, term1547.getClass(), "ignoreSurroundingSpaces", false);
        setField(term1547, term1547.getClass(), "nullString", "nyiiPDVjAc");
        setField(term1547, term1547.getClass(), "quoteCharacter", term1667);
        setField(term1547, term1547.getClass(), "quoteMode", enum37);
        setField(term1547, term1547.getClass(), "recordSeparator", "aKnKipADSo");
        setBooleanField(term1547, term1547.getClass(), "skipHeaderRecord", true);
        setBooleanField(term1547, term1547.getClass(), "trailingDelimiter", true);
        setBooleanField(term1547, term1547.getClass(), "trim", true);
        setBooleanField(term1547, term1547.getClass(), "autoFlush", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Reader");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1547;
        try {
            callMethod(klass, "parse", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


