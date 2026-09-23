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
import java.lang.Character;
import java.lang.String;
import java.lang.Object;

public class CSVFormat_withEscape_158958405169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8427;
     Object term8506;
     Object term33072;
     Object term33090;
     Object term32846;

    public CSVFormat_withEscape_158958405169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term8429 = new Character('a');
        Class<? extends Object> term33092 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term33091 = ((Class) term33092).getDeclaredField((String) "ALL");
        ((Field) term33091).setAccessible(true);
        Object enum95 = ((Field) term33091).get((Object) null);
        Character term8438 = new Character('P');
        Character term8440 = new Character('i');
        term8427 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term8468 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term8427, term8427.getClass(), "delimiter", 'u');
        setField(term8427, term8427.getClass(), "quoteChar", term8429);
        setField(term8427, term8427.getClass(), "quotePolicy", enum95);
        setField(term8427, term8427.getClass(), "commentStart", term8438);
        setField(term8427, term8427.getClass(), "escape", term8440);
        setBooleanField(term8427, term8427.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term8427, term8427.getClass(), "ignoreEmptyLines", true);
        setField(term8427, term8427.getClass(), "recordSeparator", "HHmNoYxIGj");
        setField(term8427, term8427.getClass(), "nullString", "PtirvZmsGt");
        setElement(term8468, 0, "HWkpTmtlrc");
        setElement(term8468, 1, "hMmaoREuCK");
        setElement(term8468, 2, "VeDtgDzGAN");
        setField(term8427, term8427.getClass(), "header", term8468);
        setBooleanField(term8427, term8427.getClass(), "skipHeaderRecord", false);
        term8506 = new Character('g');
        Character term33073 = new Character('a');
        Class<? extends Object> term33298 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term33297 = ((Class) term33298).getDeclaredField((String) "ALL");
        ((Field) term33297).setAccessible(true);
        Object enum96 = ((Field) term33297).get((Object) null);
        Character term33077 = new Character('P');
        Character term33078 = new Character('i');
        term33072 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term33083 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term33072, term33072.getClass(), "delimiter", 'u');
        setField(term33072, term33072.getClass(), "quoteChar", term33073);
        setField(term33072, term33072.getClass(), "quotePolicy", enum96);
        setField(term33072, term33072.getClass(), "commentStart", term33077);
        setField(term33072, term33072.getClass(), "escape", term33078);
        setBooleanField(term33072, term33072.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term33072, term33072.getClass(), "ignoreEmptyLines", true);
        setField(term33072, term33072.getClass(), "recordSeparator", "HHmNoYxIGj");
        setField(term33072, term33072.getClass(), "nullString", "PtirvZmsGt");
        setElement(term33083, 0, "HWkpTmtlrc");
        setElement(term33083, 1, "hMmaoREuCK");
        setElement(term33083, 2, "VeDtgDzGAN");
        setField(term33072, term33072.getClass(), "header", term33083);
        setBooleanField(term33072, term33072.getClass(), "skipHeaderRecord", false);
        term33090 = new Character('g');
        Character term32848 = new Character('a');
        Class<? extends Object> term33504 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term33503 = ((Class) term33504).getDeclaredField((String) "ALL");
        ((Field) term33503).setAccessible(true);
        Object enum97 = ((Field) term33503).get((Object) null);
        Character term32857 = new Character('P');
        Character term32859 = new Character('g');
        term32846 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term32887 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term32846, term32846.getClass(), "delimiter", 'u');
        setField(term32846, term32846.getClass(), "quoteChar", term32848);
        setField(term32846, term32846.getClass(), "quotePolicy", enum97);
        setField(term32846, term32846.getClass(), "commentStart", term32857);
        setField(term32846, term32846.getClass(), "escape", term32859);
        setBooleanField(term32846, term32846.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term32846, term32846.getClass(), "ignoreEmptyLines", true);
        setField(term32846, term32846.getClass(), "recordSeparator", "HHmNoYxIGj");
        setField(term32846, term32846.getClass(), "nullString", "PtirvZmsGt");
        setElement(term32887, 0, "HWkpTmtlrc");
        setElement(term32887, 1, "hMmaoREuCK");
        setElement(term32887, 2, "VeDtgDzGAN");
        setField(term32846, term32846.getClass(), "header", term32887);
        setBooleanField(term32846, term32846.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Character");
        Object[] args = new Object[1];
        args[0] = term8506;
        Object retValue = callMethod(klass, "withEscape", argTypes, term8427, args);
        assertTrue(recursiveEquals(term8427, term33072));
        assertTrue(recursiveEquals(term8506, term33090));
        assertTrue(recursiveEquals(retValue, term32846));
    }

};


