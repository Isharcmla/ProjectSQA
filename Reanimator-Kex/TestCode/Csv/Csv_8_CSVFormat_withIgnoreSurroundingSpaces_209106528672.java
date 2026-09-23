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
import java.lang.Boolean;

public class CSVFormat_withIgnoreSurroundingSpaces_209106528672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9517;
     Object term9633;
     Object term36232;
     Object term35894;

    public CSVFormat_withIgnoreSurroundingSpaces_209106528672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term9519 = new Character('Y');
        Class<? extends Object> term36257 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term36256 = ((Class) term36257).getDeclaredField((String) "NONE");
        ((Field) term36256).setAccessible(true);
        Object enum104 = ((Field) term36256).get((Object) null);
        Character term9529 = new Character('V');
        Character term9531 = new Character('z');
        term9517 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term9559 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term9517, term9517.getClass(), "delimiter", 'z');
        setField(term9517, term9517.getClass(), "quoteChar", term9519);
        setField(term9517, term9517.getClass(), "quotePolicy", enum104);
        setField(term9517, term9517.getClass(), "commentStart", term9529);
        setField(term9517, term9517.getClass(), "escape", term9531);
        setBooleanField(term9517, term9517.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term9517, term9517.getClass(), "ignoreEmptyLines", true);
        setField(term9517, term9517.getClass(), "recordSeparator", "DyiXbeYIaN");
        setField(term9517, term9517.getClass(), "nullString", "VGizxZnyHX");
        setElement(term9559, 0, "kVEZMHmRtR");
        setElement(term9559, 1, "ekxGuOYIwi");
        setElement(term9559, 2, "RbVQXSpxXy");
        setElement(term9559, 3, "YpJbIgJWWv");
        setElement(term9559, 4, "JppkknKVOw");
        setElement(term9559, 5, "iljANwuEjk");
        setField(term9517, term9517.getClass(), "header", term9559);
        setBooleanField(term9517, term9517.getClass(), "skipHeaderRecord", true);
        term9633 = new Boolean(true);
        Character term36233 = new Character('Y');
        Class<? extends Object> term36496 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term36495 = ((Class) term36496).getDeclaredField((String) "NONE");
        ((Field) term36495).setAccessible(true);
        Object enum105 = ((Field) term36495).get((Object) null);
        Character term36237 = new Character('V');
        Character term36238 = new Character('z');
        term36232 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term36243 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term36232, term36232.getClass(), "delimiter", 'z');
        setField(term36232, term36232.getClass(), "quoteChar", term36233);
        setField(term36232, term36232.getClass(), "quotePolicy", enum105);
        setField(term36232, term36232.getClass(), "commentStart", term36237);
        setField(term36232, term36232.getClass(), "escape", term36238);
        setBooleanField(term36232, term36232.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term36232, term36232.getClass(), "ignoreEmptyLines", true);
        setField(term36232, term36232.getClass(), "recordSeparator", "DyiXbeYIaN");
        setField(term36232, term36232.getClass(), "nullString", "VGizxZnyHX");
        setElement(term36243, 0, "kVEZMHmRtR");
        setElement(term36243, 1, "ekxGuOYIwi");
        setElement(term36243, 2, "RbVQXSpxXy");
        setElement(term36243, 3, "YpJbIgJWWv");
        setElement(term36243, 4, "JppkknKVOw");
        setElement(term36243, 5, "iljANwuEjk");
        setField(term36232, term36232.getClass(), "header", term36243);
        setBooleanField(term36232, term36232.getClass(), "skipHeaderRecord", true);
        Character term35896 = new Character('Y');
        Class<? extends Object> term36735 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term36734 = ((Class) term36735).getDeclaredField((String) "NONE");
        ((Field) term36734).setAccessible(true);
        Object enum106 = ((Field) term36734).get((Object) null);
        Character term35906 = new Character('V');
        Character term35908 = new Character('z');
        term35894 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term35936 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term35894, term35894.getClass(), "delimiter", 'z');
        setField(term35894, term35894.getClass(), "quoteChar", term35896);
        setField(term35894, term35894.getClass(), "quotePolicy", enum106);
        setField(term35894, term35894.getClass(), "commentStart", term35906);
        setField(term35894, term35894.getClass(), "escape", term35908);
        setBooleanField(term35894, term35894.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term35894, term35894.getClass(), "ignoreEmptyLines", true);
        setField(term35894, term35894.getClass(), "recordSeparator", "DyiXbeYIaN");
        setField(term35894, term35894.getClass(), "nullString", "VGizxZnyHX");
        setElement(term35936, 0, "kVEZMHmRtR");
        setElement(term35936, 1, "ekxGuOYIwi");
        setElement(term35936, 2, "RbVQXSpxXy");
        setElement(term35936, 3, "YpJbIgJWWv");
        setElement(term35936, 4, "JppkknKVOw");
        setElement(term35936, 5, "iljANwuEjk");
        setField(term35894, term35894.getClass(), "header", term35936);
        setBooleanField(term35894, term35894.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term9633;
        Object retValue = callMethod(klass, "withIgnoreSurroundingSpaces", argTypes, term9517, args);
        assertTrue(recursiveEquals(term9517, term36232));
        assertTrue(recursiveEquals(term9633, true));
        assertTrue(recursiveEquals(retValue, term35894));
    }

};


