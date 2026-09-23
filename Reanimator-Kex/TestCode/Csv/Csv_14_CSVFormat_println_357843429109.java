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

public class CSVFormat_println_357843429109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14991;

    public CSVFormat_println_357843429109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term14993 = new Character('Q');
        Character term14996 = new Character('p');
        Character term15087 = new Character('a');
        Class<? extends Object> term65639 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term65638 = ((Class) term65639).getDeclaredField((String) "NONE");
        ((Field) term65638).setAccessible(true);
        Object enum134 = ((Field) term65638).get((Object) null);
        term14991 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term14998 = (Object[]) newArray("java.lang.String", 6);
        Object[] term15071 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term14991, term14991.getClass(), "allowMissingColumnNames", false);
        setField(term14991, term14991.getClass(), "commentMarker", term14993);
        setCharField(term14991, term14991.getClass(), "delimiter", 'F');
        setField(term14991, term14991.getClass(), "escapeCharacter", term14996);
        setElement(term14998, 0, "GNEmuHPNcU");
        setElement(term14998, 1, "IoSfuKDFRe");
        setElement(term14998, 2, "AWYyZiNfsm");
        setElement(term14998, 3, "ITRRYiuDwH");
        setElement(term14998, 4, "llRfwANcVF");
        setElement(term14998, 5, "sUEeHQTWkA");
        setField(term14991, term14991.getClass(), "header", term14998);
        setField(term14991, term14991.getClass(), "headerComments", term15071);
        setBooleanField(term14991, term14991.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term14991, term14991.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term14991, term14991.getClass(), "ignoreSurroundingSpaces", true);
        setField(term14991, term14991.getClass(), "nullString", "BDIRCxAWLA");
        setField(term14991, term14991.getClass(), "quoteCharacter", term15087);
        setField(term14991, term14991.getClass(), "quoteMode", enum134);
        setField(term14991, term14991.getClass(), "recordSeparator", "eOJfbiZLnb");
        setBooleanField(term14991, term14991.getClass(), "skipHeaderRecord", true);
        setBooleanField(term14991, term14991.getClass(), "trailingDelimiter", true);
        setBooleanField(term14991, term14991.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Appendable");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "println", argTypes, term14991, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


