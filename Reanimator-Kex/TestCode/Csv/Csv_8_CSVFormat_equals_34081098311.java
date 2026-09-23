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

public class CSVFormat_equals_34081098311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189370;
     Object term189543;
     Object term189845;
     Object term189851;

    public CSVFormat_equals_34081098311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term189859 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term189858 = ((Class) term189859).getDeclaredField((String) "MINIMAL");
        ((Field) term189858).setAccessible(true);
        Object enum327 = ((Field) term189858).get((Object) null);
        term189370 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term189370, term189370.getClass(), "delimiter", (char) 0);
        setField(term189370, term189370.getClass(), "quotePolicy", enum327);
        setField(term189370, term189370.getClass(), "quoteChar", null);
        setField(term189370, term189370.getClass(), "commentStart", null);
        setField(term189370, term189370.getClass(), "escape", null);
        setField(term189370, term189370.getClass(), "nullString", "");
        term189543 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term189543, term189543.getClass(), "delimiter", (char) 0);
        setField(term189543, term189543.getClass(), "quotePolicy", enum327);
        setField(term189543, term189543.getClass(), "quoteChar", null);
        setField(term189543, term189543.getClass(), "commentStart", null);
        setField(term189543, term189543.getClass(), "escape", null);
        setField(term189543, term189543.getClass(), "nullString", "");
        Class<? extends Object> term190027 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term190026 = ((Class) term190027).getDeclaredField((String) "MINIMAL");
        ((Field) term190026).setAccessible(true);
        Object enum328 = ((Field) term190026).get((Object) null);
        term189845 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term189845, term189845.getClass(), "delimiter", (char) 0);
        setField(term189845, term189845.getClass(), "quoteChar", null);
        setField(term189845, term189845.getClass(), "quotePolicy", enum328);
        setField(term189845, term189845.getClass(), "commentStart", null);
        setField(term189845, term189845.getClass(), "escape", null);
        setBooleanField(term189845, term189845.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term189845, term189845.getClass(), "ignoreEmptyLines", false);
        setField(term189845, term189845.getClass(), "recordSeparator", null);
        setField(term189845, term189845.getClass(), "nullString", "");
        setField(term189845, term189845.getClass(), "header", null);
        setBooleanField(term189845, term189845.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term190195 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term190194 = ((Class) term190195).getDeclaredField((String) "MINIMAL");
        ((Field) term190194).setAccessible(true);
        Object enum329 = ((Field) term190194).get((Object) null);
        term189851 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term189851, term189851.getClass(), "delimiter", (char) 0);
        setField(term189851, term189851.getClass(), "quoteChar", null);
        setField(term189851, term189851.getClass(), "quotePolicy", enum329);
        setField(term189851, term189851.getClass(), "commentStart", null);
        setField(term189851, term189851.getClass(), "escape", null);
        setBooleanField(term189851, term189851.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term189851, term189851.getClass(), "ignoreEmptyLines", false);
        setField(term189851, term189851.getClass(), "recordSeparator", null);
        setField(term189851, term189851.getClass(), "nullString", "");
        setField(term189851, term189851.getClass(), "header", null);
        setBooleanField(term189851, term189851.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term189543;
        Object retValue = callMethod(klass, "equals", argTypes, term189370, args);
        assertTrue(recursiveEquals(term189370, term189845));
        assertTrue(recursiveEquals(term189543, term189851));
        assertTrue(recursiveEquals(retValue, true));
    }

};


