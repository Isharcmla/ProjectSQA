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

public class CSVFormat_withIgnoreHeaderCase_1929023860153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121403;

    public CSVFormat_withIgnoreHeaderCase_1929023860153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term121455 = new Character((char) 0);
        Class<? extends Object> term122219 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term122218 = ((Class) term122219).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term122218).setAccessible(true);
        Object enum241 = ((Field) term122218).get((Object) null);
        term121403 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term121271 = (Object[]) newArray("java.lang.String", 4);
        setCharField(term121403, term121403.getClass(), "delimiter", (char) 0);
        setField(term121403, term121403.getClass(), "quoteCharacter", term121455);
        setField(term121403, term121403.getClass(), "quoteMode", enum241);
        setField(term121403, term121403.getClass(), "commentMarker", null);
        setField(term121403, term121403.getClass(), "escapeCharacter", null);
        setBooleanField(term121403, term121403.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term121403, term121403.getClass(), "ignoreEmptyLines", false);
        setField(term121403, term121403.getClass(), "recordSeparator", "");
        setField(term121403, term121403.getClass(), "nullString", null);
        setElement(term121271, 0, "");
        setElement(term121271, 2, "");
        setElement(term121271, 3, "");
        setField(term121403, term121403.getClass(), "headerComments", term121271);
        setField(term121403, term121403.getClass(), "header", null);
        setBooleanField(term121403, term121403.getClass(), "skipHeaderRecord", false);
        setBooleanField(term121403, term121403.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term121403, term121403.getClass(), "trim", false);
        setBooleanField(term121403, term121403.getClass(), "trailingDelimiter", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "withIgnoreHeaderCase", argTypes, term121403, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


