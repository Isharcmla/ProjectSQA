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
import java.lang.Boolean;

public class CSVFormat_print_57205590434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13931;
     Object term14181;
     Object term14182;

    public CSVFormat_print_57205590434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term13933 = new Character('s');
        Character term13936 = new Character('Y');
        Character term14147 = new Character('V');
        Class<? extends Object> term14355 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term14354 = ((Class) term14355).getDeclaredField((String) "ALL_NON_NULL");
        ((Field) term14354).setAccessible(true);
        Object enum31 = ((Field) term14354).get((Object) null);
        term13931 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term13938 = (Object[]) newArray("java.lang.String", 7);
        Object[] term14023 = (Object[]) newArray("java.lang.String", 9);
        setBooleanField(term13931, term13931.getClass(), "allowMissingColumnNames", false);
        setField(term13931, term13931.getClass(), "commentMarker", term13933);
        setCharField(term13931, term13931.getClass(), "delimiter", 'z');
        setField(term13931, term13931.getClass(), "escapeCharacter", term13936);
        setElement(term13938, 0, "HwLHeGLyhe");
        setElement(term13938, 1, "RDnkgWkcbz");
        setElement(term13938, 2, "IBpaxltauX");
        setElement(term13938, 3, "hePqROaplw");
        setElement(term13938, 4, "PJcSNDruWd");
        setElement(term13938, 5, "VVNNlAePXF");
        setElement(term13938, 6, "jnwVnmKAFv");
        setField(term13931, term13931.getClass(), "header", term13938);
        setElement(term14023, 0, "TXyHhqeCjR");
        setElement(term14023, 1, "lZIgPZPgTu");
        setElement(term14023, 2, "iuCxnHGMoW");
        setElement(term14023, 3, "GPSEWEDSTo");
        setElement(term14023, 4, "RCOqfVsRHt");
        setElement(term14023, 5, "TSyCeEZPaT");
        setElement(term14023, 6, "JeZFtaqkzW");
        setElement(term14023, 7, "vOVuNSCCLe");
        setElement(term14023, 8, "fzeqPnzpnt");
        setField(term13931, term13931.getClass(), "headerComments", term14023);
        setBooleanField(term13931, term13931.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term13931, term13931.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term13931, term13931.getClass(), "ignoreSurroundingSpaces", false);
        setField(term13931, term13931.getClass(), "nullString", "RxbhrFBjkO");
        setField(term13931, term13931.getClass(), "quoteCharacter", term14147);
        setField(term13931, term13931.getClass(), "quoteMode", enum31);
        setField(term13931, term13931.getClass(), "recordSeparator", "aanyiAOJCl");
        setBooleanField(term13931, term13931.getClass(), "skipHeaderRecord", true);
        setBooleanField(term13931, term13931.getClass(), "trailingDelimiter", false);
        setBooleanField(term13931, term13931.getClass(), "trim", false);
        setBooleanField(term13931, term13931.getClass(), "autoFlush", false);
        term14181 = newInstance(Class.forName("java.lang.Object"));
        term14182 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Appendable");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term14181;
        args[1] = null;
        args[2] = term14182;
        callMethod(klass, "print", argTypes, term13931, args);
    }

};


