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
import java.lang.String;
import java.lang.Object;
import java.lang.Character;

public class CSVFormat_hashCode_482767773326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205561;
     Object term206034;

    public CSVFormat_hashCode_482767773326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term206046 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term206045 = ((Class) term206046).getDeclaredField((String) "NONE");
        ((Field) term206045).setAccessible(true);
        Object enum345 = ((Field) term206045).get((Object) null);
        Character term205713 = new Character((char) 0);
        Character term205765 = new Character((char) 0);
        term205561 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term205561, term205561.getClass(), "delimiter", (char) 0);
        setField(term205561, term205561.getClass(), "quotePolicy", enum345);
        setField(term205561, term205561.getClass(), "quoteChar", term205713);
        setField(term205561, term205561.getClass(), "commentStart", term205713);
        setField(term205561, term205561.getClass(), "escape", term205765);
        setField(term205561, term205561.getClass(), "nullString", "");
        setBooleanField(term205561, term205561.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term205561, term205561.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term205561, term205561.getClass(), "skipHeaderRecord", true);
        setField(term205561, term205561.getClass(), "recordSeparator", "");
        Character term206035 = new Character((char) 0);
        Class<? extends Object> term206205 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term206204 = ((Class) term206205).getDeclaredField((String) "NONE");
        ((Field) term206204).setAccessible(true);
        Object enum346 = ((Field) term206204).get((Object) null);
        Character term206039 = new Character((char) 0);
        Character term206040 = new Character((char) 0);
        term206034 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term206034, term206034.getClass(), "delimiter", (char) 0);
        setField(term206034, term206034.getClass(), "quoteChar", term206035);
        setField(term206034, term206034.getClass(), "quotePolicy", enum346);
        setField(term206034, term206034.getClass(), "commentStart", term206039);
        setField(term206034, term206034.getClass(), "escape", term206040);
        setBooleanField(term206034, term206034.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term206034, term206034.getClass(), "ignoreEmptyLines", false);
        setField(term206034, term206034.getClass(), "recordSeparator", "");
        setField(term206034, term206034.getClass(), "nullString", "");
        setField(term206034, term206034.getClass(), "header", null);
        setBooleanField(term206034, term206034.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term205561, args);
        assertTrue(recursiveEquals(term205561, term206034));
        assertTrue(recursiveEquals(retValue, 1843668088));
    }

};


