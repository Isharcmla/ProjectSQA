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

public class CSVFormat_toStringArray_25380192941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17151;
     Object term17293;

    public CSVFormat_toStringArray_25380192941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term17153 = new Character('J');
        Character term17156 = new Character('i');
        Character term17259 = new Character('e');
        Class<? extends Object> term17382 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term17381 = ((Class) term17382).getDeclaredField((String) "ALL_NON_NULL");
        ((Field) term17381).setAccessible(true);
        Object enum38 = ((Field) term17381).get((Object) null);
        term17151 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term17158 = (Object[]) newArray("java.lang.String", 1);
        Object[] term17171 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term17151, term17151.getClass(), "allowMissingColumnNames", false);
        setField(term17151, term17151.getClass(), "commentMarker", term17153);
        setCharField(term17151, term17151.getClass(), "delimiter", 'l');
        setField(term17151, term17151.getClass(), "escapeCharacter", term17156);
        setElement(term17158, 0, "orEuhCStGM");
        setField(term17151, term17151.getClass(), "header", term17158);
        setElement(term17171, 0, "HhEaSXWvrY");
        setElement(term17171, 1, "CVRGEomOth");
        setElement(term17171, 2, "vSeruUyNWX");
        setElement(term17171, 3, "UkKvaeJfEC");
        setElement(term17171, 4, "WPxXsahPRq");
        setElement(term17171, 5, "IENRuqmwUU");
        setField(term17151, term17151.getClass(), "headerComments", term17171);
        setBooleanField(term17151, term17151.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term17151, term17151.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term17151, term17151.getClass(), "ignoreSurroundingSpaces", true);
        setField(term17151, term17151.getClass(), "nullString", "GsWxOwXvSu");
        setField(term17151, term17151.getClass(), "quoteCharacter", term17259);
        setField(term17151, term17151.getClass(), "quoteMode", enum38);
        setField(term17151, term17151.getClass(), "recordSeparator", "bKBSncrMEZ");
        setBooleanField(term17151, term17151.getClass(), "skipHeaderRecord", true);
        setBooleanField(term17151, term17151.getClass(), "trailingDelimiter", false);
        setBooleanField(term17151, term17151.getClass(), "trim", true);
        setBooleanField(term17151, term17151.getClass(), "autoFlush", false);
        term17293 = (Object[]) newArray("java.lang.Object", 7);
        Object term17294 = newInstance(Class.forName("java.lang.Object"));
        Object term17295 = newInstance(Class.forName("java.lang.Object"));
        Object term17296 = newInstance(Class.forName("java.lang.Object"));
        Object term17297 = newInstance(Class.forName("java.lang.Object"));
        Object term17298 = newInstance(Class.forName("java.lang.Object"));
        Object term17299 = newInstance(Class.forName("java.lang.Object"));
        Object term17300 = newInstance(Class.forName("java.lang.Object"));
        setElement(term17293, 0, term17294);
        setElement(term17293, 1, term17295);
        setElement(term17293, 2, term17296);
        setElement(term17293, 3, term17297);
        setElement(term17293, 4, term17298);
        setElement(term17293, 5, term17299);
        setElement(term17293, 6, term17300);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term17293;
        callMethod(klass, "toStringArray", argTypes, term17151, args);
    }

};


