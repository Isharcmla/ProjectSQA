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

public class CSVFormat_hashCode_482767773223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113017;
     Object term113350;

    public CSVFormat_hashCode_482767773223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term113356 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term113355 = ((Class) term113356).getDeclaredField((String) "ALL");
        ((Field) term113355).setAccessible(true);
        Object enum191 = ((Field) term113355).get((Object) null);
        Character term113169 = new Character((char) 0);
        term113017 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term113017, term113017.getClass(), "delimiter", (char) 0);
        setField(term113017, term113017.getClass(), "quotePolicy", enum191);
        setField(term113017, term113017.getClass(), "quoteChar", term113169);
        setField(term113017, term113017.getClass(), "commentStart", null);
        setField(term113017, term113017.getClass(), "escape", null);
        setField(term113017, term113017.getClass(), "nullString", null);
        setBooleanField(term113017, term113017.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term113017, term113017.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term113017, term113017.getClass(), "skipHeaderRecord", true);
        Character term113351 = new Character((char) 0);
        Class<? extends Object> term113512 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term113511 = ((Class) term113512).getDeclaredField((String) "ALL");
        ((Field) term113511).setAccessible(true);
        Object enum192 = ((Field) term113511).get((Object) null);
        term113350 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term113350, term113350.getClass(), "delimiter", (char) 0);
        setField(term113350, term113350.getClass(), "quoteChar", term113351);
        setField(term113350, term113350.getClass(), "quotePolicy", enum192);
        setField(term113350, term113350.getClass(), "commentStart", null);
        setField(term113350, term113350.getClass(), "escape", null);
        setBooleanField(term113350, term113350.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term113350, term113350.getClass(), "ignoreEmptyLines", false);
        setField(term113350, term113350.getClass(), "recordSeparator", null);
        setField(term113350, term113350.getClass(), "nullString", null);
        setField(term113350, term113350.getClass(), "header", null);
        setBooleanField(term113350, term113350.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term113017, args);
        assertTrue(recursiveEquals(term113017, term113350));
        assertTrue(recursiveEquals(retValue, 890674083));
    }

};


