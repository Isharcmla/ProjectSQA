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

public class CSVFormat_print_1513135753102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11368;

    public CSVFormat_print_1513135753102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term11370 = new Character('v');
        Character term11373 = new Character('J');
        Character term11464 = new Character('l');
        Class<? extends Object> term59203 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term59202 = ((Class) term59203).getDeclaredField((String) "MINIMAL");
        ((Field) term59202).setAccessible(true);
        Object enum122 = ((Field) term59202).get((Object) null);
        term11368 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term11375 = (Object[]) newArray("java.lang.String", 4);
        Object[] term11424 = (Object[]) newArray("java.lang.String", 2);
        setBooleanField(term11368, term11368.getClass(), "allowMissingColumnNames", true);
        setField(term11368, term11368.getClass(), "commentMarker", term11370);
        setCharField(term11368, term11368.getClass(), "delimiter", 'g');
        setField(term11368, term11368.getClass(), "escapeCharacter", term11373);
        setElement(term11375, 0, "SPtPatHeOm");
        setElement(term11375, 1, "ywmcuThdfL");
        setElement(term11375, 2, "GBOEuByOfr");
        setElement(term11375, 3, "NHbOFFjyVK");
        setField(term11368, term11368.getClass(), "header", term11375);
        setElement(term11424, 0, "zaloBqlrSo");
        setElement(term11424, 1, "vvoLrMGCoN");
        setField(term11368, term11368.getClass(), "headerComments", term11424);
        setBooleanField(term11368, term11368.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term11368, term11368.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term11368, term11368.getClass(), "ignoreSurroundingSpaces", false);
        setField(term11368, term11368.getClass(), "nullString", "pXdglvyrQe");
        setField(term11368, term11368.getClass(), "quoteCharacter", term11464);
        setField(term11368, term11368.getClass(), "quoteMode", enum122);
        setField(term11368, term11368.getClass(), "recordSeparator", "OcfNzHYdki");
        setBooleanField(term11368, term11368.getClass(), "skipHeaderRecord", true);
        setBooleanField(term11368, term11368.getClass(), "trailingDelimiter", false);
        setBooleanField(term11368, term11368.getClass(), "trim", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Appendable");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "print", argTypes, term11368, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


