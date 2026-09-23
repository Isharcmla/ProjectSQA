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
import java.lang.Character;
import java.lang.Object;
import java.lang.String;

public class CSVFormat_print_594381374104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12314;

    public CSVFormat_print_594381374104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term12316 = new Character('u');
        Character term12319 = new Character('P');
        Character term12446 = new Character('i');
        Class<? extends Object> term60417 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term60416 = ((Class) term60417).getDeclaredField((String) "ALL");
        ((Field) term60416).setAccessible(true);
        Object enum125 = ((Field) term60416).get((Object) null);
        term12314 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term12321 = (Object[]) newArray("java.lang.String", 2);
        Object[] term12346 = (Object[]) newArray("java.lang.String", 7);
        setBooleanField(term12314, term12314.getClass(), "allowMissingColumnNames", false);
        setField(term12314, term12314.getClass(), "commentMarker", term12316);
        setCharField(term12314, term12314.getClass(), "delimiter", 'a');
        setField(term12314, term12314.getClass(), "escapeCharacter", term12319);
        setElement(term12321, 0, "TtGbVmKcnX");
        setElement(term12321, 1, "GJVkUrCVdD");
        setField(term12314, term12314.getClass(), "header", term12321);
        setElement(term12346, 0, "zNdorvdUgu");
        setElement(term12346, 1, "oPxuZbkYio");
        setElement(term12346, 2, "vKitydDVnM");
        setElement(term12346, 3, "urCiQnUFBM");
        setElement(term12346, 4, "EKjQdtKxAM");
        setElement(term12346, 5, "TXZAIPQJHt");
        setElement(term12346, 6, "DIbeDHICho");
        setField(term12314, term12314.getClass(), "headerComments", term12346);
        setBooleanField(term12314, term12314.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term12314, term12314.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term12314, term12314.getClass(), "ignoreSurroundingSpaces", false);
        setField(term12314, term12314.getClass(), "nullString", "dJGPlmSRnz");
        setField(term12314, term12314.getClass(), "quoteCharacter", term12446);
        setField(term12314, term12314.getClass(), "quoteMode", enum125);
        setField(term12314, term12314.getClass(), "recordSeparator", "DPskuFUobI");
        setBooleanField(term12314, term12314.getClass(), "skipHeaderRecord", true);
        setBooleanField(term12314, term12314.getClass(), "trailingDelimiter", true);
        setBooleanField(term12314, term12314.getClass(), "trim", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.nio.file.Path");
        argTypes[1] = Class.forName("java.nio.charset.Charset");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "print", argTypes, term12314, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


