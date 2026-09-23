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

public class CSVFormat_withDelimiter_1215633854301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165625;
     Object term166077;
     Object term166024;

    public CSVFormat_withDelimiter_1215633854301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term166088 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term166087 = ((Class) term166088).getDeclaredField((String) "NONE");
        ((Field) term166087).setAccessible(true);
        Object enum311 = ((Field) term166087).get((Object) null);
        Character term165777 = new Character((char) 0);
        term165625 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term165625, term165625.getClass(), "quoteChar", null);
        setField(term165625, term165625.getClass(), "quotePolicy", enum311);
        setField(term165625, term165625.getClass(), "commentStart", term165777);
        setField(term165625, term165625.getClass(), "escape", term165777);
        setBooleanField(term165625, term165625.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term165625, term165625.getClass(), "ignoreEmptyLines", false);
        setField(term165625, term165625.getClass(), "recordSeparator", "");
        setField(term165625, term165625.getClass(), "nullString", "");
        setField(term165625, term165625.getClass(), "header", null);
        setBooleanField(term165625, term165625.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term166248 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term166247 = ((Class) term166248).getDeclaredField((String) "NONE");
        ((Field) term166247).setAccessible(true);
        Object enum312 = ((Field) term166247).get((Object) null);
        Character term166081 = new Character((char) 0);
        Character term166082 = new Character((char) 0);
        term166077 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term166077, term166077.getClass(), "delimiter", (char) 0);
        setField(term166077, term166077.getClass(), "quoteChar", null);
        setField(term166077, term166077.getClass(), "quotePolicy", enum312);
        setField(term166077, term166077.getClass(), "commentStart", term166081);
        setField(term166077, term166077.getClass(), "escape", term166082);
        setBooleanField(term166077, term166077.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term166077, term166077.getClass(), "ignoreEmptyLines", false);
        setField(term166077, term166077.getClass(), "recordSeparator", "");
        setField(term166077, term166077.getClass(), "nullString", "");
        setField(term166077, term166077.getClass(), "header", null);
        setBooleanField(term166077, term166077.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term166407 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term166406 = ((Class) term166407).getDeclaredField((String) "NONE");
        ((Field) term166406).setAccessible(true);
        Object enum313 = ((Field) term166406).get((Object) null);
        Character term166034 = new Character((char) 0);
        Character term166036 = new Character((char) 0);
        term166024 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term166024, term166024.getClass(), "delimiter", (char) 0);
        setField(term166024, term166024.getClass(), "quoteChar", null);
        setField(term166024, term166024.getClass(), "quotePolicy", enum313);
        setField(term166024, term166024.getClass(), "commentStart", term166034);
        setField(term166024, term166024.getClass(), "escape", term166036);
        setBooleanField(term166024, term166024.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term166024, term166024.getClass(), "ignoreEmptyLines", false);
        setField(term166024, term166024.getClass(), "recordSeparator", "");
        setField(term166024, term166024.getClass(), "nullString", "");
        setField(term166024, term166024.getClass(), "header", null);
        setBooleanField(term166024, term166024.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        Object retValue = callMethod(klass, "withDelimiter", argTypes, term165625, args);
        assertTrue(recursiveEquals(term165625, term166077));
        assertTrue(recursiveEquals(retValue, term166024));
    }

};


