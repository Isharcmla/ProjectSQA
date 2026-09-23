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
import java.lang.NullPointerException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Character;
import java.lang.String;

public class CSVPrinter_printComment_167520956023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3481;

    public CSVPrinter_printComment_167520956023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term3484 = new Character('l');
        Class<? extends Object> term13516 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term13515 = ((Class) term13516).getDeclaredField((String) "MINIMAL");
        ((Field) term13515).setAccessible(true);
        Object enum26 = ((Field) term13515).get((Object) null);
        Character term3497 = new Character('P');
        Character term3499 = new Character('w');
        term3481 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term3482 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term3528 = (Object[]) newArray("java.lang.String", 0);
        Object[] term3529 = (Object[]) newArray("java.lang.String", 2);
        setField(term3481, term3481.getClass(), "out", null);
        setCharField(term3482, term3482.getClass(), "delimiter", 't');
        setField(term3482, term3482.getClass(), "quoteCharacter", term3484);
        setField(term3482, term3482.getClass(), "quoteMode", enum26);
        setField(term3482, term3482.getClass(), "commentMarker", term3497);
        setField(term3482, term3482.getClass(), "escapeCharacter", term3499);
        setBooleanField(term3482, term3482.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term3482, term3482.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term3482, term3482.getClass(), "ignoreEmptyLines", true);
        setField(term3482, term3482.getClass(), "recordSeparator", "vQVyKLdtaz");
        setField(term3482, term3482.getClass(), "nullString", "OWKQODBLzb");
        setField(term3482, term3482.getClass(), "header", term3528);
        setElement(term3529, 0, "wGmYcqUkgE");
        setElement(term3529, 1, "idgaQsnJpQ");
        setField(term3482, term3482.getClass(), "headerComments", term3529);
        setBooleanField(term3482, term3482.getClass(), "skipHeaderRecord", false);
        setBooleanField(term3482, term3482.getClass(), "ignoreHeaderCase", false);
        setField(term3481, term3481.getClass(), "format", term3482);
        setBooleanField(term3481, term3481.getClass(), "newRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VgZnGoIFwQ";
        try {
            callMethod(klass, "printComment", argTypes, term3481, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


