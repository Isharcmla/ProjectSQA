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

public class CSVFormat_parse_760316323105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11450;

    public CSVFormat_parse_760316323105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term11452 = new Character('v');
        Character term11455 = new Character('J');
        Character term11546 = new Character('l');
        Class<? extends Object> term60714 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term60713 = ((Class) term60714).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term60713).setAccessible(true);
        Object enum126 = ((Field) term60713).get((Object) null);
        term11450 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term11457 = (Object[]) newArray("java.lang.String", 4);
        Object[] term11506 = (Object[]) newArray("java.lang.String", 2);
        setBooleanField(term11450, term11450.getClass(), "allowMissingColumnNames", true);
        setField(term11450, term11450.getClass(), "commentMarker", term11452);
        setCharField(term11450, term11450.getClass(), "delimiter", 'g');
        setField(term11450, term11450.getClass(), "escapeCharacter", term11455);
        setElement(term11457, 0, "SPtPatHeOm");
        setElement(term11457, 1, "ywmcuThdfL");
        setElement(term11457, 2, "GBOEuByOfr");
        setElement(term11457, 3, "NHbOFFjyVK");
        setField(term11450, term11450.getClass(), "header", term11457);
        setElement(term11506, 0, "zaloBqlrSo");
        setElement(term11506, 1, "vvoLrMGCoN");
        setField(term11450, term11450.getClass(), "headerComments", term11506);
        setBooleanField(term11450, term11450.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term11450, term11450.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term11450, term11450.getClass(), "ignoreSurroundingSpaces", true);
        setField(term11450, term11450.getClass(), "nullString", "pXdglvyrQe");
        setField(term11450, term11450.getClass(), "quoteCharacter", term11546);
        setField(term11450, term11450.getClass(), "quoteMode", enum126);
        setField(term11450, term11450.getClass(), "recordSeparator", "OcfNzHYdki");
        setBooleanField(term11450, term11450.getClass(), "skipHeaderRecord", true);
        setBooleanField(term11450, term11450.getClass(), "trailingDelimiter", true);
        setBooleanField(term11450, term11450.getClass(), "trim", true);
        setBooleanField(term11450, term11450.getClass(), "autoFlush", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.Reader");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "parse", argTypes, term11450, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


