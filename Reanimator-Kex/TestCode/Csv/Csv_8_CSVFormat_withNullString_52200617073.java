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

public class CSVFormat_withNullString_52200617073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9874;
     Object term37173;
     Object term36979;

    public CSVFormat_withNullString_52200617073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term9876 = new Character('f');
        Class<? extends Object> term37192 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term37191 = ((Class) term37192).getDeclaredField((String) "NONE");
        ((Field) term37191).setAccessible(true);
        Object enum107 = ((Field) term37191).get((Object) null);
        Character term9886 = new Character('L');
        Character term9888 = new Character('Q');
        term9874 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term9916 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term9874, term9874.getClass(), "delimiter", 'R');
        setField(term9874, term9874.getClass(), "quoteChar", term9876);
        setField(term9874, term9874.getClass(), "quotePolicy", enum107);
        setField(term9874, term9874.getClass(), "commentStart", term9886);
        setField(term9874, term9874.getClass(), "escape", term9888);
        setBooleanField(term9874, term9874.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term9874, term9874.getClass(), "ignoreEmptyLines", true);
        setField(term9874, term9874.getClass(), "recordSeparator", "kNqaJKIATy");
        setField(term9874, term9874.getClass(), "nullString", "vKQukfbJUd");
        setElement(term9916, 0, "lFRJFUMVbx");
        setElement(term9916, 1, "sZdUNdggUW");
        setField(term9874, term9874.getClass(), "header", term9916);
        setBooleanField(term9874, term9874.getClass(), "skipHeaderRecord", false);
        Character term37174 = new Character('f');
        Class<? extends Object> term37401 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term37400 = ((Class) term37401).getDeclaredField((String) "NONE");
        ((Field) term37400).setAccessible(true);
        Object enum108 = ((Field) term37400).get((Object) null);
        Character term37178 = new Character('L');
        Character term37179 = new Character('Q');
        term37173 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term37184 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term37173, term37173.getClass(), "delimiter", 'R');
        setField(term37173, term37173.getClass(), "quoteChar", term37174);
        setField(term37173, term37173.getClass(), "quotePolicy", enum108);
        setField(term37173, term37173.getClass(), "commentStart", term37178);
        setField(term37173, term37173.getClass(), "escape", term37179);
        setBooleanField(term37173, term37173.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term37173, term37173.getClass(), "ignoreEmptyLines", true);
        setField(term37173, term37173.getClass(), "recordSeparator", "kNqaJKIATy");
        setField(term37173, term37173.getClass(), "nullString", "vKQukfbJUd");
        setElement(term37184, 0, "lFRJFUMVbx");
        setElement(term37184, 1, "sZdUNdggUW");
        setField(term37173, term37173.getClass(), "header", term37184);
        setBooleanField(term37173, term37173.getClass(), "skipHeaderRecord", false);
        Character term36981 = new Character('f');
        Class<? extends Object> term37610 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term37609 = ((Class) term37610).getDeclaredField((String) "NONE");
        ((Field) term37609).setAccessible(true);
        Object enum109 = ((Field) term37609).get((Object) null);
        Character term36991 = new Character('L');
        Character term36993 = new Character('Q');
        term36979 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term37021 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term36979, term36979.getClass(), "delimiter", 'R');
        setField(term36979, term36979.getClass(), "quoteChar", term36981);
        setField(term36979, term36979.getClass(), "quotePolicy", enum109);
        setField(term36979, term36979.getClass(), "commentStart", term36991);
        setField(term36979, term36979.getClass(), "escape", term36993);
        setBooleanField(term36979, term36979.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term36979, term36979.getClass(), "ignoreEmptyLines", true);
        setField(term36979, term36979.getClass(), "recordSeparator", "kNqaJKIATy");
        setField(term36979, term36979.getClass(), "nullString", "OqbwYQfvAe");
        setElement(term37021, 0, "lFRJFUMVbx");
        setElement(term37021, 1, "sZdUNdggUW");
        setField(term36979, term36979.getClass(), "header", term37021);
        setBooleanField(term36979, term36979.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OqbwYQfvAe";
        Object retValue = callMethod(klass, "withNullString", argTypes, term9874, args);
        assertTrue(recursiveEquals(term9874, term37173));
        assertTrue(recursiveEquals(retValue, term36979));
    }

};


