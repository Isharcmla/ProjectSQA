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

public class CSVFormat_withIgnoreHeaderCase_192902386059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25309;

    public CSVFormat_withIgnoreHeaderCase_192902386059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term25311 = new Character('D');
        Character term25314 = new Character('e');
        Character term25441 = new Character('Z');
        Class<? extends Object> term25575 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term25574 = ((Class) term25575).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term25574).setAccessible(true);
        Object enum56 = ((Field) term25574).get((Object) null);
        term25309 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term25316 = (Object[]) newArray("java.lang.String", 5);
        Object[] term25377 = (Object[]) newArray("java.lang.String", 4);
        setBooleanField(term25309, term25309.getClass(), "allowMissingColumnNames", true);
        setField(term25309, term25309.getClass(), "commentMarker", term25311);
        setCharField(term25309, term25309.getClass(), "delimiter", 'U');
        setField(term25309, term25309.getClass(), "escapeCharacter", term25314);
        setElement(term25316, 0, "vgdwrCZczl");
        setElement(term25316, 1, "gKMNrpKBpu");
        setElement(term25316, 2, "ZbHJVEqcoa");
        setElement(term25316, 3, "awDQVEVIKi");
        setElement(term25316, 4, "HJwNgUzZZR");
        setField(term25309, term25309.getClass(), "header", term25316);
        setElement(term25377, 0, "FvUCZgTXhq");
        setElement(term25377, 1, "wWWidPCHzx");
        setElement(term25377, 2, "OwPIiBRuKK");
        setElement(term25377, 3, "sgfGySMODT");
        setField(term25309, term25309.getClass(), "headerComments", term25377);
        setBooleanField(term25309, term25309.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term25309, term25309.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term25309, term25309.getClass(), "ignoreSurroundingSpaces", true);
        setField(term25309, term25309.getClass(), "nullString", "ndAITnOsny");
        setField(term25309, term25309.getClass(), "quoteCharacter", term25441);
        setField(term25309, term25309.getClass(), "quoteMode", enum56);
        setField(term25309, term25309.getClass(), "recordSeparator", "CVZnTiJucs");
        setBooleanField(term25309, term25309.getClass(), "skipHeaderRecord", false);
        setBooleanField(term25309, term25309.getClass(), "trailingDelimiter", false);
        setBooleanField(term25309, term25309.getClass(), "trim", false);
        setBooleanField(term25309, term25309.getClass(), "autoFlush", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withIgnoreHeaderCase", argTypes, term25309, args);
    }

};


