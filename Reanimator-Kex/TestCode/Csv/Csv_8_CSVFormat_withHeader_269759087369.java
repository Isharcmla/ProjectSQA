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

public class CSVFormat_withHeader_269759087369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275321;
     Object term275813;
     Object term275752;

    public CSVFormat_withHeader_269759087369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term275822 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term275821 = ((Class) term275822).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term275821).setAccessible(true);
        Object enum419 = ((Field) term275821).get((Object) null);
        Character term275473 = new Character((char) 0);
        Character term275525 = new Character((char) 0);
        term275321 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term275321, term275321.getClass(), "delimiter", (char) 0);
        setField(term275321, term275321.getClass(), "quoteChar", null);
        setField(term275321, term275321.getClass(), "quotePolicy", enum419);
        setField(term275321, term275321.getClass(), "commentStart", term275473);
        setField(term275321, term275321.getClass(), "escape", term275525);
        setBooleanField(term275321, term275321.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term275321, term275321.getClass(), "ignoreEmptyLines", false);
        setField(term275321, term275321.getClass(), "recordSeparator", "");
        setField(term275321, term275321.getClass(), "nullString", null);
        setBooleanField(term275321, term275321.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term276004 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term276003 = ((Class) term276004).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term276003).setAccessible(true);
        Object enum420 = ((Field) term276003).get((Object) null);
        Character term275817 = new Character((char) 0);
        Character term275818 = new Character((char) 0);
        term275813 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term275813, term275813.getClass(), "delimiter", (char) 0);
        setField(term275813, term275813.getClass(), "quoteChar", null);
        setField(term275813, term275813.getClass(), "quotePolicy", enum420);
        setField(term275813, term275813.getClass(), "commentStart", term275817);
        setField(term275813, term275813.getClass(), "escape", term275818);
        setBooleanField(term275813, term275813.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term275813, term275813.getClass(), "ignoreEmptyLines", false);
        setField(term275813, term275813.getClass(), "recordSeparator", "");
        setField(term275813, term275813.getClass(), "nullString", null);
        setField(term275813, term275813.getClass(), "header", null);
        setBooleanField(term275813, term275813.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term276184 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term276183 = ((Class) term276184).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term276183).setAccessible(true);
        Object enum421 = ((Field) term276183).get((Object) null);
        Character term275769 = new Character((char) 0);
        Character term275771 = new Character((char) 0);
        term275752 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term275752, term275752.getClass(), "delimiter", (char) 0);
        setField(term275752, term275752.getClass(), "quoteChar", null);
        setField(term275752, term275752.getClass(), "quotePolicy", enum421);
        setField(term275752, term275752.getClass(), "commentStart", term275769);
        setField(term275752, term275752.getClass(), "escape", term275771);
        setBooleanField(term275752, term275752.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term275752, term275752.getClass(), "ignoreEmptyLines", false);
        setField(term275752, term275752.getClass(), "recordSeparator", "");
        setField(term275752, term275752.getClass(), "nullString", null);
        setField(term275752, term275752.getClass(), "header", null);
        setBooleanField(term275752, term275752.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "withHeader", argTypes, term275321, args);
        assertTrue(recursiveEquals(term275321, term275813));
        assertTrue(recursiveEquals(retValue, term275752));
    }

};


