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

public class CSVFormat_withIgnoreHeaderCase_1929023860144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121723;

    public CSVFormat_withIgnoreHeaderCase_1929023860144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term121775 = new Character((char) 0);
        Class<? extends Object> term122646 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term122645 = ((Class) term122646).getDeclaredField((String) "ALL");
        ((Field) term122645).setAccessible(true);
        Object enum199 = ((Field) term122645).get((Object) null);
        Character term121935 = new Character((char) 0);
        term121723 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term121564 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term121723, term121723.getClass(), "delimiter", (char) 0);
        setField(term121723, term121723.getClass(), "quoteCharacter", term121775);
        setField(term121723, term121723.getClass(), "quoteMode", enum199);
        setField(term121723, term121723.getClass(), "commentMarker", term121935);
        setField(term121723, term121723.getClass(), "escapeCharacter", null);
        setBooleanField(term121723, term121723.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term121723, term121723.getClass(), "ignoreEmptyLines", false);
        setField(term121723, term121723.getClass(), "recordSeparator", null);
        setField(term121723, term121723.getClass(), "nullString", null);
        setElement(term121564, 0, "");
        setElement(term121564, 1, "");
        setElement(term121564, 2, "");
        setElement(term121564, 3, "");
        setElement(term121564, 5, "");
        setField(term121723, term121723.getClass(), "headerComments", term121564);
        setField(term121723, term121723.getClass(), "header", null);
        setBooleanField(term121723, term121723.getClass(), "skipHeaderRecord", false);
        setBooleanField(term121723, term121723.getClass(), "allowMissingColumnNames", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "withIgnoreHeaderCase", argTypes, term121723, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


