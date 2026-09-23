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

public class CSVFormat_equals_34081098227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115358;
     Object term115545;
     Object term115800;
     Object term115805;

    public CSVFormat_equals_34081098227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term115811 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term115810 = ((Class) term115811).getDeclaredField((String) "MINIMAL");
        ((Field) term115810).setAccessible(true);
        Object enum198 = ((Field) term115810).get((Object) null);
        Character term115510 = new Character((char) 0);
        term115358 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term115358, term115358.getClass(), "delimiter", (char) 0);
        setField(term115358, term115358.getClass(), "quotePolicy", enum198);
        setField(term115358, term115358.getClass(), "quoteChar", null);
        setField(term115358, term115358.getClass(), "commentStart", null);
        setField(term115358, term115358.getClass(), "escape", term115510);
        term115545 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term115545, term115545.getClass(), "delimiter", (char) 0);
        setField(term115545, term115545.getClass(), "quotePolicy", enum198);
        setField(term115545, term115545.getClass(), "quoteChar", null);
        setField(term115545, term115545.getClass(), "commentStart", null);
        Class<? extends Object> term115980 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term115979 = ((Class) term115980).getDeclaredField((String) "MINIMAL");
        ((Field) term115979).setAccessible(true);
        Object enum199 = ((Field) term115979).get((Object) null);
        Character term115804 = new Character((char) 0);
        term115800 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term115800, term115800.getClass(), "delimiter", (char) 0);
        setField(term115800, term115800.getClass(), "quoteChar", null);
        setField(term115800, term115800.getClass(), "quotePolicy", enum199);
        setField(term115800, term115800.getClass(), "commentStart", null);
        setField(term115800, term115800.getClass(), "escape", term115804);
        setBooleanField(term115800, term115800.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term115800, term115800.getClass(), "ignoreEmptyLines", false);
        setField(term115800, term115800.getClass(), "recordSeparator", null);
        setField(term115800, term115800.getClass(), "nullString", null);
        setField(term115800, term115800.getClass(), "header", null);
        setBooleanField(term115800, term115800.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term116148 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term116147 = ((Class) term116148).getDeclaredField((String) "MINIMAL");
        ((Field) term116147).setAccessible(true);
        Object enum200 = ((Field) term116147).get((Object) null);
        term115805 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term115805, term115805.getClass(), "delimiter", (char) 0);
        setField(term115805, term115805.getClass(), "quoteChar", null);
        setField(term115805, term115805.getClass(), "quotePolicy", enum200);
        setField(term115805, term115805.getClass(), "commentStart", null);
        setField(term115805, term115805.getClass(), "escape", null);
        setBooleanField(term115805, term115805.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term115805, term115805.getClass(), "ignoreEmptyLines", false);
        setField(term115805, term115805.getClass(), "recordSeparator", null);
        setField(term115805, term115805.getClass(), "nullString", null);
        setField(term115805, term115805.getClass(), "header", null);
        setBooleanField(term115805, term115805.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term115545;
        Object retValue = callMethod(klass, "equals", argTypes, term115358, args);
        assertTrue(recursiveEquals(term115358, term115800));
        assertTrue(recursiveEquals(term115545, term115805));
        assertTrue(recursiveEquals(retValue, false));
    }

};


