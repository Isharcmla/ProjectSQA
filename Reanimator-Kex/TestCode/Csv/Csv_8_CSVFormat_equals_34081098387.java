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

public class CSVFormat_equals_34081098387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306076;
     Object term306315;
     Object term306612;
     Object term306618;

    public CSVFormat_equals_34081098387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term306625 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term306624 = ((Class) term306625).getDeclaredField((String) "NONE");
        ((Field) term306624).setAccessible(true);
        Object enum444 = ((Field) term306624).get((Object) null);
        Character term306228 = new Character((char) 0);
        Character term306280 = new Character((char) 0);
        term306076 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term306076, term306076.getClass(), "delimiter", (char) 0);
        setField(term306076, term306076.getClass(), "quotePolicy", enum444);
        setField(term306076, term306076.getClass(), "quoteChar", term306228);
        setField(term306076, term306076.getClass(), "commentStart", term306280);
        Character term306417 = new Character((char) 0);
        term306315 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term306315, term306315.getClass(), "delimiter", (char) 0);
        setField(term306315, term306315.getClass(), "quotePolicy", enum444);
        setField(term306315, term306315.getClass(), "quoteChar", term306417);
        Character term306613 = new Character((char) 0);
        Class<? extends Object> term306785 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term306784 = ((Class) term306785).getDeclaredField((String) "NONE");
        ((Field) term306784).setAccessible(true);
        Object enum445 = ((Field) term306784).get((Object) null);
        Character term306617 = new Character((char) 0);
        term306612 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term306612, term306612.getClass(), "delimiter", (char) 0);
        setField(term306612, term306612.getClass(), "quoteChar", term306613);
        setField(term306612, term306612.getClass(), "quotePolicy", enum445);
        setField(term306612, term306612.getClass(), "commentStart", term306617);
        setField(term306612, term306612.getClass(), "escape", null);
        setBooleanField(term306612, term306612.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term306612, term306612.getClass(), "ignoreEmptyLines", false);
        setField(term306612, term306612.getClass(), "recordSeparator", null);
        setField(term306612, term306612.getClass(), "nullString", null);
        setField(term306612, term306612.getClass(), "header", null);
        setBooleanField(term306612, term306612.getClass(), "skipHeaderRecord", false);
        Character term306619 = new Character((char) 0);
        Class<? extends Object> term306944 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term306943 = ((Class) term306944).getDeclaredField((String) "NONE");
        ((Field) term306943).setAccessible(true);
        Object enum446 = ((Field) term306943).get((Object) null);
        term306618 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term306618, term306618.getClass(), "delimiter", (char) 0);
        setField(term306618, term306618.getClass(), "quoteChar", term306619);
        setField(term306618, term306618.getClass(), "quotePolicy", enum446);
        setField(term306618, term306618.getClass(), "commentStart", null);
        setField(term306618, term306618.getClass(), "escape", null);
        setBooleanField(term306618, term306618.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term306618, term306618.getClass(), "ignoreEmptyLines", false);
        setField(term306618, term306618.getClass(), "recordSeparator", null);
        setField(term306618, term306618.getClass(), "nullString", null);
        setField(term306618, term306618.getClass(), "header", null);
        setBooleanField(term306618, term306618.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term306315;
        Object retValue = callMethod(klass, "equals", argTypes, term306076, args);
        assertTrue(recursiveEquals(term306076, term306612));
        assertTrue(recursiveEquals(term306315, term306618));
        assertTrue(recursiveEquals(retValue, false));
    }

};


