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

public class CSVFormat_printer_149054271631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12218;

    public CSVFormat_printer_149054271631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term12220 = new Character('u');
        Character term12223 = new Character('P');
        Character term12350 = new Character('i');
        Class<? extends Object> term12480 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term12479 = ((Class) term12480).getDeclaredField((String) "MINIMAL");
        ((Field) term12479).setAccessible(true);
        Object enum27 = ((Field) term12479).get((Object) null);
        term12218 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term12225 = (Object[]) newArray("java.lang.String", 2);
        Object[] term12250 = (Object[]) newArray("java.lang.String", 7);
        setBooleanField(term12218, term12218.getClass(), "allowMissingColumnNames", true);
        setField(term12218, term12218.getClass(), "commentMarker", term12220);
        setCharField(term12218, term12218.getClass(), "delimiter", 'a');
        setField(term12218, term12218.getClass(), "escapeCharacter", term12223);
        setElement(term12225, 0, "tsTGdgQYUL");
        setElement(term12225, 1, "TtGbVmKcnX");
        setField(term12218, term12218.getClass(), "header", term12225);
        setElement(term12250, 0, "GJVkUrCVdD");
        setElement(term12250, 1, "zNdorvdUgu");
        setElement(term12250, 2, "oPxuZbkYio");
        setElement(term12250, 3, "vKitydDVnM");
        setElement(term12250, 4, "urCiQnUFBM");
        setElement(term12250, 5, "EKjQdtKxAM");
        setElement(term12250, 6, "TXZAIPQJHt");
        setField(term12218, term12218.getClass(), "headerComments", term12250);
        setBooleanField(term12218, term12218.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term12218, term12218.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term12218, term12218.getClass(), "ignoreSurroundingSpaces", false);
        setField(term12218, term12218.getClass(), "nullString", "DIbeDHICho");
        setField(term12218, term12218.getClass(), "quoteCharacter", term12350);
        setField(term12218, term12218.getClass(), "quoteMode", enum27);
        setField(term12218, term12218.getClass(), "recordSeparator", "dJGPlmSRnz");
        setBooleanField(term12218, term12218.getClass(), "skipHeaderRecord", false);
        setBooleanField(term12218, term12218.getClass(), "trailingDelimiter", false);
        setBooleanField(term12218, term12218.getClass(), "trim", true);
        setBooleanField(term12218, term12218.getClass(), "autoFlush", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "printer", argTypes, term12218, args);
    }

};


