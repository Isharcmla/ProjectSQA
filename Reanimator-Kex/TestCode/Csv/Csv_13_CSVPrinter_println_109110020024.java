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

public class CSVPrinter_println_109110020024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3807;

    public CSVPrinter_println_109110020024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term3810 = new Character('Y');
        Class<? extends Object> term14237 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term14236 = ((Class) term14237).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term14236).setAccessible(true);
        Object enum27 = ((Field) term14236).get((Object) null);
        Character term3827 = new Character('F');
        Character term3829 = new Character('s');
        term3807 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term3808 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term3858 = (Object[]) newArray("java.lang.String", 8);
        Object[] term3955 = (Object[]) newArray("java.lang.String", 6);
        setField(term3807, term3807.getClass(), "out", null);
        setCharField(term3808, term3808.getClass(), "delimiter", 'D');
        setField(term3808, term3808.getClass(), "quoteCharacter", term3810);
        setField(term3808, term3808.getClass(), "quoteMode", enum27);
        setField(term3808, term3808.getClass(), "commentMarker", term3827);
        setField(term3808, term3808.getClass(), "escapeCharacter", term3829);
        setBooleanField(term3808, term3808.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term3808, term3808.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term3808, term3808.getClass(), "ignoreEmptyLines", false);
        setField(term3808, term3808.getClass(), "recordSeparator", "jUbSRrkrYZ");
        setField(term3808, term3808.getClass(), "nullString", "bWWfajKbEX");
        setElement(term3858, 0, "cAPeiZHKGJ");
        setElement(term3858, 1, "LvJFtLBaxj");
        setElement(term3858, 2, "PHvxnGHptP");
        setElement(term3858, 3, "TimdotUuNC");
        setElement(term3858, 4, "PkWMRdJcBb");
        setElement(term3858, 5, "jSpAteRute");
        setElement(term3858, 6, "swZVeJAxjt");
        setElement(term3858, 7, "xOcJIiQQDu");
        setField(term3808, term3808.getClass(), "header", term3858);
        setElement(term3955, 0, "GVizqqzXpy");
        setElement(term3955, 1, "JqXGgAhZPl");
        setElement(term3955, 2, "jiKYgYHqIS");
        setElement(term3955, 3, "DfISiziTgG");
        setElement(term3955, 4, "XqgfKFvPSD");
        setElement(term3955, 5, "JiVRgTZvKc");
        setField(term3808, term3808.getClass(), "headerComments", term3955);
        setBooleanField(term3808, term3808.getClass(), "skipHeaderRecord", false);
        setBooleanField(term3808, term3808.getClass(), "ignoreHeaderCase", true);
        setField(term3807, term3807.getClass(), "format", term3808);
        setBooleanField(term3807, term3807.getClass(), "newRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "println", argTypes, term3807, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


