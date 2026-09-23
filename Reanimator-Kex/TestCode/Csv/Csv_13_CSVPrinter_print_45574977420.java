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
import java.lang.Integer;

public class CSVPrinter_print_45574977420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2183;
     Object term2364;
     Object term2365;
     Object term2367;

    public CSVPrinter_print_45574977420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term2186 = new Character('u');
        Class<? extends Object> term11167 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term11166 = ((Class) term11167).getDeclaredField((String) "NONE");
        ((Field) term11166).setAccessible(true);
        Object enum23 = ((Field) term11166).get((Object) null);
        Character term2196 = new Character('L');
        Character term2198 = new Character('c');
        term2183 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term2184 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term2227 = (Object[]) newArray("java.lang.String", 6);
        Object[] term2300 = (Object[]) newArray("java.lang.String", 5);
        setField(term2183, term2183.getClass(), "out", null);
        setCharField(term2184, term2184.getClass(), "delimiter", 'M');
        setField(term2184, term2184.getClass(), "quoteCharacter", term2186);
        setField(term2184, term2184.getClass(), "quoteMode", enum23);
        setField(term2184, term2184.getClass(), "commentMarker", term2196);
        setField(term2184, term2184.getClass(), "escapeCharacter", term2198);
        setBooleanField(term2184, term2184.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term2184, term2184.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term2184, term2184.getClass(), "ignoreEmptyLines", true);
        setField(term2184, term2184.getClass(), "recordSeparator", "jDtqGUpnZN");
        setField(term2184, term2184.getClass(), "nullString", "nGKItKLYNC");
        setElement(term2227, 0, "UiUYnPrcCi");
        setElement(term2227, 1, "UoYtihxVaS");
        setElement(term2227, 2, "JDswTTCZHV");
        setElement(term2227, 3, "onpbIeEKoi");
        setElement(term2227, 4, "YRHGsAkhxb");
        setElement(term2227, 5, "ffYhPOzlUs");
        setField(term2184, term2184.getClass(), "header", term2227);
        setElement(term2300, 0, "MLqYREekMl");
        setElement(term2300, 1, "ytSBIKXogI");
        setElement(term2300, 2, "nHXjMycHlU");
        setElement(term2300, 3, "ieCtQFdkii");
        setElement(term2300, 4, "dEnhdmILtU");
        setField(term2184, term2184.getClass(), "headerComments", term2300);
        setBooleanField(term2184, term2184.getClass(), "skipHeaderRecord", true);
        setBooleanField(term2184, term2184.getClass(), "ignoreHeaderCase", true);
        setField(term2183, term2183.getClass(), "format", term2184);
        setBooleanField(term2183, term2183.getClass(), "newRecord", false);
        term2364 = newInstance(Class.forName("java.lang.Object"));
        term2365 = new Integer(568599855);
        term2367 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.CharSequence");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term2364;
        args[1] = null;
        args[2] = term2365;
        args[3] = term2367;
        try {
            callMethod(klass, "print", argTypes, term2183, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


