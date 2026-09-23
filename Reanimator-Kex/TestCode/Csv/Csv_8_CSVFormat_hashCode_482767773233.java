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

public class CSVFormat_hashCode_482767773233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118735;
     Object term119190;

    public CSVFormat_hashCode_482767773233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term119200 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term119199 = ((Class) term119200).getDeclaredField((String) "NONE");
        ((Field) term119199).setAccessible(true);
        Object enum206 = ((Field) term119199).get((Object) null);
        Character term118887 = new Character((char) 0);
        Character term118939 = new Character((char) 0);
        Character term118991 = new Character((char) 0);
        term118735 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term118735, term118735.getClass(), "delimiter", (char) 0);
        setField(term118735, term118735.getClass(), "quotePolicy", enum206);
        setField(term118735, term118735.getClass(), "quoteChar", term118887);
        setField(term118735, term118735.getClass(), "commentStart", term118939);
        setField(term118735, term118735.getClass(), "escape", term118991);
        setField(term118735, term118735.getClass(), "nullString", "NONE");
        setBooleanField(term118735, term118735.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term118735, term118735.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term118735, term118735.getClass(), "skipHeaderRecord", true);
        Character term119191 = new Character((char) 0);
        Class<? extends Object> term119363 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term119362 = ((Class) term119363).getDeclaredField((String) "NONE");
        ((Field) term119362).setAccessible(true);
        Object enum207 = ((Field) term119362).get((Object) null);
        Character term119195 = new Character((char) 0);
        Character term119196 = new Character((char) 0);
        term119190 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term119190, term119190.getClass(), "delimiter", (char) 0);
        setField(term119190, term119190.getClass(), "quoteChar", term119191);
        setField(term119190, term119190.getClass(), "quotePolicy", enum207);
        setField(term119190, term119190.getClass(), "commentStart", term119195);
        setField(term119190, term119190.getClass(), "escape", term119196);
        setBooleanField(term119190, term119190.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term119190, term119190.getClass(), "ignoreEmptyLines", true);
        setField(term119190, term119190.getClass(), "recordSeparator", null);
        setField(term119190, term119190.getClass(), "nullString", "NONE");
        setField(term119190, term119190.getClass(), "header", null);
        setBooleanField(term119190, term119190.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term118735, args);
        assertTrue(recursiveEquals(term118735, term119190));
        assertTrue(recursiveEquals(retValue, 1019738368));
    }

};


