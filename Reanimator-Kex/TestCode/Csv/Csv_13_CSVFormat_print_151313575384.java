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
import java.lang.String;
import java.lang.Object;

public class CSVFormat_print_151313575384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11005;

    public CSVFormat_print_151313575384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term11007 = new Character('N');
        Class<? extends Object> term58232 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term58231 = ((Class) term58232).getDeclaredField((String) "NONE");
        ((Field) term58231).setAccessible(true);
        Object enum102 = ((Field) term58231).get((Object) null);
        Character term11017 = new Character('R');
        Character term11019 = new Character('d');
        term11005 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term11048 = (Object[]) newArray("java.lang.String", 3);
        Object[] term11085 = (Object[]) newArray("java.lang.String", 4);
        setCharField(term11005, term11005.getClass(), "delimiter", 'e');
        setField(term11005, term11005.getClass(), "quoteCharacter", term11007);
        setField(term11005, term11005.getClass(), "quoteMode", enum102);
        setField(term11005, term11005.getClass(), "commentMarker", term11017);
        setField(term11005, term11005.getClass(), "escapeCharacter", term11019);
        setBooleanField(term11005, term11005.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term11005, term11005.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term11005, term11005.getClass(), "ignoreEmptyLines", false);
        setField(term11005, term11005.getClass(), "recordSeparator", "onQLVONGuf");
        setField(term11005, term11005.getClass(), "nullString", "SOrEHbcbmn");
        setElement(term11048, 0, "bnsyeQXFdu");
        setElement(term11048, 1, "BwtdjiefJn");
        setElement(term11048, 2, "jDmhBrIoDa");
        setField(term11005, term11005.getClass(), "header", term11048);
        setElement(term11085, 0, "SPtPatHeOm");
        setElement(term11085, 1, "ywmcuThdfL");
        setElement(term11085, 2, "GBOEuByOfr");
        setElement(term11085, 3, "NHbOFFjyVK");
        setField(term11005, term11005.getClass(), "headerComments", term11085);
        setBooleanField(term11005, term11005.getClass(), "skipHeaderRecord", false);
        setBooleanField(term11005, term11005.getClass(), "ignoreHeaderCase", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Appendable");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "print", argTypes, term11005, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


