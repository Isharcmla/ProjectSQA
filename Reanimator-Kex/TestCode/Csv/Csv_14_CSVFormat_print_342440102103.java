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
import java.io.FileNotFoundException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Character;
import java.lang.Object;
import java.lang.String;

public class CSVFormat_print_342440102103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11760;
     Object term11868;

    public CSVFormat_print_342440102103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term11762 = new Character('h');
        Character term11765 = new Character('X');
        Character term11844 = new Character('u');
        Class<? extends Object> term59730 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term59729 = ((Class) term59730).getDeclaredField((String) "ALL");
        ((Field) term59729).setAccessible(true);
        Object enum123 = ((Field) term59729).get((Object) null);
        term11760 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term11767 = (Object[]) newArray("java.lang.String", 5);
        Object[] term11828 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term11760, term11760.getClass(), "allowMissingColumnNames", false);
        setField(term11760, term11760.getClass(), "commentMarker", term11762);
        setCharField(term11760, term11760.getClass(), "delimiter", 'k');
        setField(term11760, term11760.getClass(), "escapeCharacter", term11765);
        setElement(term11767, 0, "uPuCVuZYOI");
        setElement(term11767, 1, "TweMFhxNdj");
        setElement(term11767, 2, "NBrvVzvQHe");
        setElement(term11767, 3, "FjOiNAfBOc");
        setElement(term11767, 4, "iCCsaLHohG");
        setField(term11760, term11760.getClass(), "header", term11767);
        setField(term11760, term11760.getClass(), "headerComments", term11828);
        setBooleanField(term11760, term11760.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term11760, term11760.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term11760, term11760.getClass(), "ignoreSurroundingSpaces", true);
        setField(term11760, term11760.getClass(), "nullString", "NJhGgctbdj");
        setField(term11760, term11760.getClass(), "quoteCharacter", term11844);
        setField(term11760, term11760.getClass(), "quoteMode", enum123);
        setField(term11760, term11760.getClass(), "recordSeparator", "MYWYUeLGOp");
        setBooleanField(term11760, term11760.getClass(), "skipHeaderRecord", true);
        setBooleanField(term11760, term11760.getClass(), "trailingDelimiter", true);
        setBooleanField(term11760, term11760.getClass(), "trim", false);
        Class<? extends Object> term59926 = Class.forName((String) "java.io.File$PathStatus");
        Field term59925 = ((Class) term59926).getDeclaredField((String) "INVALID");
        ((Field) term59925).setAccessible(true);
        Object enum124 = ((Field) term59925).get((Object) null);
        term11868 = newInstance(Class.forName("java.io.File"));
        setField(term11868, term11868.getClass(), "path", "tsTGdgQYUL");
        setField(term11868, term11868.getClass(), "status", enum124);
        setIntField(term11868, term11868.getClass(), "prefixLength", 568599855);
        setField(term11868, term11868.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.nio.charset.Charset");
        Object[] args = new Object[2];
        args[0] = term11868;
        args[1] = null;
        try {
            callMethod(klass, "print", argTypes, term11760, args);
            assertTrue(false);
        }
        catch (FileNotFoundException e) {
        }

    }

};


