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

public class CSVFormat_print_1513135753106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11859;

    public CSVFormat_print_1513135753106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term11861 = new Character('h');
        Character term11864 = new Character('X');
        Character term11943 = new Character('u');
        Class<? extends Object> term61272 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term61271 = ((Class) term61272).getDeclaredField((String) "NONE");
        ((Field) term61271).setAccessible(true);
        Object enum127 = ((Field) term61271).get((Object) null);
        term11859 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term11866 = (Object[]) newArray("java.lang.String", 5);
        Object[] term11927 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term11859, term11859.getClass(), "allowMissingColumnNames", false);
        setField(term11859, term11859.getClass(), "commentMarker", term11861);
        setCharField(term11859, term11859.getClass(), "delimiter", 'k');
        setField(term11859, term11859.getClass(), "escapeCharacter", term11864);
        setElement(term11866, 0, "uPuCVuZYOI");
        setElement(term11866, 1, "TweMFhxNdj");
        setElement(term11866, 2, "NBrvVzvQHe");
        setElement(term11866, 3, "FjOiNAfBOc");
        setElement(term11866, 4, "iCCsaLHohG");
        setField(term11859, term11859.getClass(), "header", term11866);
        setField(term11859, term11859.getClass(), "headerComments", term11927);
        setBooleanField(term11859, term11859.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term11859, term11859.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term11859, term11859.getClass(), "ignoreSurroundingSpaces", false);
        setField(term11859, term11859.getClass(), "nullString", "NJhGgctbdj");
        setField(term11859, term11859.getClass(), "quoteCharacter", term11943);
        setField(term11859, term11859.getClass(), "quoteMode", enum127);
        setField(term11859, term11859.getClass(), "recordSeparator", "MYWYUeLGOp");
        setBooleanField(term11859, term11859.getClass(), "skipHeaderRecord", false);
        setBooleanField(term11859, term11859.getClass(), "trailingDelimiter", true);
        setBooleanField(term11859, term11859.getClass(), "trim", false);
        setBooleanField(term11859, term11859.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Appendable");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "print", argTypes, term11859, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


