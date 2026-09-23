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

public class CSVFormat_equals_34081098268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143869;
     Object term144004;
     Object term145220;
     Object term145224;

    public CSVFormat_equals_34081098268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term145231 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term145230 = ((Class) term145231).getDeclaredField((String) "ALL");
        ((Field) term145230).setAccessible(true);
        Object enum255 = ((Field) term145230).get((Object) null);
        term143869 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term143869, term143869.getClass(), "delimiter", (char) 0);
        setField(term143869, term143869.getClass(), "quotePolicy", enum255);
        setField(term143869, term143869.getClass(), "quoteChar", null);
        setField(term143869, term143869.getClass(), "commentStart", null);
        setField(term143869, term143869.getClass(), "escape", null);
        Character term144106 = new Character((char) 0);
        term144004 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term144004, term144004.getClass(), "delimiter", (char) 0);
        setField(term144004, term144004.getClass(), "quotePolicy", enum255);
        setField(term144004, term144004.getClass(), "quoteChar", null);
        setField(term144004, term144004.getClass(), "commentStart", null);
        setField(term144004, term144004.getClass(), "escape", term144106);
        Class<? extends Object> term145388 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term145387 = ((Class) term145388).getDeclaredField((String) "ALL");
        ((Field) term145387).setAccessible(true);
        Object enum256 = ((Field) term145387).get((Object) null);
        term145220 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term145220, term145220.getClass(), "delimiter", (char) 0);
        setField(term145220, term145220.getClass(), "quoteChar", null);
        setField(term145220, term145220.getClass(), "quotePolicy", enum256);
        setField(term145220, term145220.getClass(), "commentStart", null);
        setField(term145220, term145220.getClass(), "escape", null);
        setBooleanField(term145220, term145220.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term145220, term145220.getClass(), "ignoreEmptyLines", false);
        setField(term145220, term145220.getClass(), "recordSeparator", null);
        setField(term145220, term145220.getClass(), "nullString", null);
        setField(term145220, term145220.getClass(), "header", null);
        setBooleanField(term145220, term145220.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term145544 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term145543 = ((Class) term145544).getDeclaredField((String) "ALL");
        ((Field) term145543).setAccessible(true);
        Object enum257 = ((Field) term145543).get((Object) null);
        Character term145228 = new Character((char) 0);
        term145224 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term145224, term145224.getClass(), "delimiter", (char) 0);
        setField(term145224, term145224.getClass(), "quoteChar", null);
        setField(term145224, term145224.getClass(), "quotePolicy", enum257);
        setField(term145224, term145224.getClass(), "commentStart", null);
        setField(term145224, term145224.getClass(), "escape", term145228);
        setBooleanField(term145224, term145224.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term145224, term145224.getClass(), "ignoreEmptyLines", false);
        setField(term145224, term145224.getClass(), "recordSeparator", null);
        setField(term145224, term145224.getClass(), "nullString", null);
        setField(term145224, term145224.getClass(), "header", null);
        setBooleanField(term145224, term145224.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term144004;
        Object retValue = callMethod(klass, "equals", argTypes, term143869, args);
        assertTrue(recursiveEquals(term143869, term145220));
        assertTrue(recursiveEquals(term144004, term145224));
        assertTrue(recursiveEquals(retValue, false));
    }

};


