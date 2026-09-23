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

public class CSVFormat_withQuote_45391525580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11863;
     Object term11971;

    public CSVFormat_withQuote_45391525580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term11865 = new Character('Y');
        Class<? extends Object> term45024 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term45023 = ((Class) term45024).getDeclaredField((String) "MINIMAL");
        ((Field) term45023).setAccessible(true);
        Object enum115 = ((Field) term45023).get((Object) null);
        Character term11878 = new Character('n');
        Character term11880 = new Character('L');
        term11863 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term11909 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term11863, term11863.getClass(), "delimiter", 'n');
        setField(term11863, term11863.getClass(), "quoteCharacter", term11865);
        setField(term11863, term11863.getClass(), "quoteMode", enum115);
        setField(term11863, term11863.getClass(), "commentMarker", term11878);
        setField(term11863, term11863.getClass(), "escapeCharacter", term11880);
        setBooleanField(term11863, term11863.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term11863, term11863.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term11863, term11863.getClass(), "ignoreEmptyLines", false);
        setField(term11863, term11863.getClass(), "recordSeparator", "izPpKDErnQ");
        setField(term11863, term11863.getClass(), "nullString", "NnpwZBUTvx");
        setElement(term11909, 0, "tlQSNgTkQX");
        setElement(term11909, 1, "PCipZnmBOF");
        setElement(term11909, 2, "zcorEihhLK");
        setElement(term11909, 3, "GrqozDKFOk");
        setElement(term11909, 4, "CFyoseFGLF");
        setField(term11863, term11863.getClass(), "header", term11909);
        setBooleanField(term11863, term11863.getClass(), "skipHeaderRecord", true);
        term11971 = new Character('W');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term11971;
        try {
            callMethod(klass, "withQuote", argTypes, term11863, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


