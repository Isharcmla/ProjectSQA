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
import static org.apache.commons.csv.EqualityUtils.*;
import java.lang.Character;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public class CSVFormat_withIgnoreHeaderCase_1929024790103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19774;
     Object term19917;
     Object term85291;
     Object term84840;

    public CSVFormat_withIgnoreHeaderCase_1929024790103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term19776 = new Character('y');
        Class<? extends Object> term85321 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term85320 = ((Class) term85321).getDeclaredField((String) "NONE");
        ((Field) term85320).setAccessible(true);
        Object enum151 = ((Field) term85320).get((Object) null);
        Character term19786 = new Character('x');
        Character term19788 = new Character('f');
        term19774 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term19817 = (Object[]) newArray("java.lang.String", 6);
        Object[] term19890 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term19774, term19774.getClass(), "delimiter", 'H');
        setField(term19774, term19774.getClass(), "quoteCharacter", term19776);
        setField(term19774, term19774.getClass(), "quoteMode", enum151);
        setField(term19774, term19774.getClass(), "commentMarker", term19786);
        setField(term19774, term19774.getClass(), "escapeCharacter", term19788);
        setBooleanField(term19774, term19774.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term19774, term19774.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term19774, term19774.getClass(), "ignoreEmptyLines", false);
        setField(term19774, term19774.getClass(), "recordSeparator", "bwlLFAfNWx");
        setField(term19774, term19774.getClass(), "nullString", "JWodNQzjjV");
        setElement(term19817, 0, "CAgxWjhxNf");
        setElement(term19817, 1, "goAoCMhKBu");
        setElement(term19817, 2, "BWxJSgKHRT");
        setElement(term19817, 3, "AGXoIndFnm");
        setElement(term19817, 4, "mwmFMNEzkK");
        setElement(term19817, 5, "kVAmKknVln");
        setField(term19774, term19774.getClass(), "header", term19817);
        setElement(term19890, 0, "MRFLbEGYKG");
        setElement(term19890, 1, "BYrGukTyof");
        setField(term19774, term19774.getClass(), "headerComments", term19890);
        setBooleanField(term19774, term19774.getClass(), "skipHeaderRecord", false);
        setBooleanField(term19774, term19774.getClass(), "ignoreHeaderCase", true);
        term19917 = new Boolean(true);
        Character term85292 = new Character('y');
        Class<? extends Object> term85600 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term85599 = ((Class) term85600).getDeclaredField((String) "NONE");
        ((Field) term85599).setAccessible(true);
        Object enum152 = ((Field) term85599).get((Object) null);
        Character term85296 = new Character('x');
        Character term85297 = new Character('f');
        term85291 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term85302 = (Object[]) newArray("java.lang.String", 6);
        Object[] term85315 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term85291, term85291.getClass(), "delimiter", 'H');
        setField(term85291, term85291.getClass(), "quoteCharacter", term85292);
        setField(term85291, term85291.getClass(), "quoteMode", enum152);
        setField(term85291, term85291.getClass(), "commentMarker", term85296);
        setField(term85291, term85291.getClass(), "escapeCharacter", term85297);
        setBooleanField(term85291, term85291.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term85291, term85291.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term85291, term85291.getClass(), "ignoreEmptyLines", false);
        setField(term85291, term85291.getClass(), "recordSeparator", "bwlLFAfNWx");
        setField(term85291, term85291.getClass(), "nullString", "JWodNQzjjV");
        setElement(term85302, 0, "CAgxWjhxNf");
        setElement(term85302, 1, "goAoCMhKBu");
        setElement(term85302, 2, "BWxJSgKHRT");
        setElement(term85302, 3, "AGXoIndFnm");
        setElement(term85302, 4, "mwmFMNEzkK");
        setElement(term85302, 5, "kVAmKknVln");
        setField(term85291, term85291.getClass(), "header", term85302);
        setElement(term85315, 0, "MRFLbEGYKG");
        setElement(term85315, 1, "BYrGukTyof");
        setField(term85291, term85291.getClass(), "headerComments", term85315);
        setBooleanField(term85291, term85291.getClass(), "skipHeaderRecord", false);
        setBooleanField(term85291, term85291.getClass(), "ignoreHeaderCase", true);
        Character term84842 = new Character('y');
        Class<? extends Object> term85879 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term85878 = ((Class) term85879).getDeclaredField((String) "NONE");
        ((Field) term85878).setAccessible(true);
        Object enum153 = ((Field) term85878).get((Object) null);
        Character term84852 = new Character('x');
        Character term84854 = new Character('f');
        term84840 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term84883 = (Object[]) newArray("java.lang.String", 6);
        Object[] term84956 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term84840, term84840.getClass(), "delimiter", 'H');
        setField(term84840, term84840.getClass(), "quoteCharacter", term84842);
        setField(term84840, term84840.getClass(), "quoteMode", enum153);
        setField(term84840, term84840.getClass(), "commentMarker", term84852);
        setField(term84840, term84840.getClass(), "escapeCharacter", term84854);
        setBooleanField(term84840, term84840.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term84840, term84840.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term84840, term84840.getClass(), "ignoreEmptyLines", false);
        setField(term84840, term84840.getClass(), "recordSeparator", "bwlLFAfNWx");
        setField(term84840, term84840.getClass(), "nullString", "JWodNQzjjV");
        setElement(term84883, 0, "CAgxWjhxNf");
        setElement(term84883, 1, "goAoCMhKBu");
        setElement(term84883, 2, "BWxJSgKHRT");
        setElement(term84883, 3, "AGXoIndFnm");
        setElement(term84883, 4, "mwmFMNEzkK");
        setElement(term84883, 5, "kVAmKknVln");
        setField(term84840, term84840.getClass(), "header", term84883);
        setElement(term84956, 0, "MRFLbEGYKG");
        setElement(term84956, 1, "BYrGukTyof");
        setField(term84840, term84840.getClass(), "headerComments", term84956);
        setBooleanField(term84840, term84840.getClass(), "skipHeaderRecord", false);
        setBooleanField(term84840, term84840.getClass(), "ignoreHeaderCase", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term19917;
        Object retValue = callMethod(klass, "withIgnoreHeaderCase", argTypes, term19774, args);
        assertTrue(recursiveEquals(term19774, term85291));
        assertTrue(recursiveEquals(term19917, true));
        assertTrue(recursiveEquals(retValue, term84840));
    }

};


