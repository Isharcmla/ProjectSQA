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

public class CSVFormat_getIgnoreSurroundingSpaces_97078270551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2689;
     Object term20150;

    public CSVFormat_getIgnoreSurroundingSpaces_97078270551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term2691 = new Character('D');
        Class<? extends Object> term20165 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term20164 = ((Class) term20165).getDeclaredField((String) "MINIMAL");
        ((Field) term20164).setAccessible(true);
        Object enum55 = ((Field) term20164).get((Object) null);
        Character term2704 = new Character('Y');
        Character term2706 = new Character('F');
        term2689 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term2734 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term2689, term2689.getClass(), "delimiter", 'w');
        setField(term2689, term2689.getClass(), "quoteChar", term2691);
        setField(term2689, term2689.getClass(), "quotePolicy", enum55);
        setField(term2689, term2689.getClass(), "commentStart", term2704);
        setField(term2689, term2689.getClass(), "escape", term2706);
        setBooleanField(term2689, term2689.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term2689, term2689.getClass(), "ignoreEmptyLines", false);
        setField(term2689, term2689.getClass(), "recordSeparator", "nGKItKLYNC");
        setField(term2689, term2689.getClass(), "nullString", "UiUYnPrcCi");
        setElement(term2734, 0, "UoYtihxVaS");
        setField(term2689, term2689.getClass(), "header", term2734);
        setBooleanField(term2689, term2689.getClass(), "skipHeaderRecord", false);
        Character term20151 = new Character('D');
        Class<? extends Object> term20363 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term20362 = ((Class) term20363).getDeclaredField((String) "MINIMAL");
        ((Field) term20362).setAccessible(true);
        Object enum56 = ((Field) term20362).get((Object) null);
        Character term20155 = new Character('Y');
        Character term20156 = new Character('F');
        term20150 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term20161 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term20150, term20150.getClass(), "delimiter", 'w');
        setField(term20150, term20150.getClass(), "quoteChar", term20151);
        setField(term20150, term20150.getClass(), "quotePolicy", enum56);
        setField(term20150, term20150.getClass(), "commentStart", term20155);
        setField(term20150, term20150.getClass(), "escape", term20156);
        setBooleanField(term20150, term20150.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term20150, term20150.getClass(), "ignoreEmptyLines", false);
        setField(term20150, term20150.getClass(), "recordSeparator", "nGKItKLYNC");
        setField(term20150, term20150.getClass(), "nullString", "UiUYnPrcCi");
        setElement(term20161, 0, "UoYtihxVaS");
        setField(term20150, term20150.getClass(), "header", term20161);
        setBooleanField(term20150, term20150.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIgnoreSurroundingSpaces", argTypes, term2689, args);
        assertTrue(recursiveEquals(term2689, term20150));
    }

};


