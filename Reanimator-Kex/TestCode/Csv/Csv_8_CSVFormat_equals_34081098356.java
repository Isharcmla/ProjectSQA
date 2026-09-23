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

public class CSVFormat_equals_34081098356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250253;
     Object term250478;
     Object term250772;
     Object term250779;

    public CSVFormat_equals_34081098356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term250786 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term250785 = ((Class) term250786).getDeclaredField((String) "MINIMAL");
        ((Field) term250785).setAccessible(true);
        Object enum397 = ((Field) term250785).get((Object) null);
        Character term250554 = new Character((char) 0);
        term250253 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term250253, term250253.getClass(), "delimiter", (char) 0);
        setField(term250253, term250253.getClass(), "quotePolicy", enum397);
        setField(term250253, term250253.getClass(), "quoteChar", null);
        setField(term250253, term250253.getClass(), "commentStart", term250554);
        setField(term250253, term250253.getClass(), "escape", null);
        setField(term250253, term250253.getClass(), "nullString", "NONE");
        term250478 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term250478, term250478.getClass(), "delimiter", (char) 0);
        setField(term250478, term250478.getClass(), "quotePolicy", enum397);
        setField(term250478, term250478.getClass(), "quoteChar", null);
        setField(term250478, term250478.getClass(), "commentStart", term250554);
        setField(term250478, term250478.getClass(), "escape", null);
        Class<? extends Object> term250958 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term250957 = ((Class) term250958).getDeclaredField((String) "MINIMAL");
        ((Field) term250957).setAccessible(true);
        Object enum398 = ((Field) term250957).get((Object) null);
        Character term250776 = new Character((char) 0);
        term250772 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term250772, term250772.getClass(), "delimiter", (char) 0);
        setField(term250772, term250772.getClass(), "quoteChar", null);
        setField(term250772, term250772.getClass(), "quotePolicy", enum398);
        setField(term250772, term250772.getClass(), "commentStart", term250776);
        setField(term250772, term250772.getClass(), "escape", null);
        setBooleanField(term250772, term250772.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term250772, term250772.getClass(), "ignoreEmptyLines", false);
        setField(term250772, term250772.getClass(), "recordSeparator", null);
        setField(term250772, term250772.getClass(), "nullString", "NONE");
        setField(term250772, term250772.getClass(), "header", null);
        setBooleanField(term250772, term250772.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term251130 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term251129 = ((Class) term251130).getDeclaredField((String) "MINIMAL");
        ((Field) term251129).setAccessible(true);
        Object enum399 = ((Field) term251129).get((Object) null);
        Character term250783 = new Character((char) 0);
        term250779 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term250779, term250779.getClass(), "delimiter", (char) 0);
        setField(term250779, term250779.getClass(), "quoteChar", null);
        setField(term250779, term250779.getClass(), "quotePolicy", enum399);
        setField(term250779, term250779.getClass(), "commentStart", term250783);
        setField(term250779, term250779.getClass(), "escape", null);
        setBooleanField(term250779, term250779.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term250779, term250779.getClass(), "ignoreEmptyLines", false);
        setField(term250779, term250779.getClass(), "recordSeparator", null);
        setField(term250779, term250779.getClass(), "nullString", null);
        setField(term250779, term250779.getClass(), "header", null);
        setBooleanField(term250779, term250779.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term250478;
        Object retValue = callMethod(klass, "equals", argTypes, term250253, args);
        assertTrue(recursiveEquals(term250253, term250772));
        assertTrue(recursiveEquals(term250478, term250779));
        assertTrue(recursiveEquals(retValue, false));
    }

};


