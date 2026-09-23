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

public class CSVFormat_getNullString_56180501952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2946;
     Object term20695;

    public CSVFormat_getNullString_56180501952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term2948 = new Character('j');
        Class<? extends Object> term20722 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term20721 = ((Class) term20722).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term20721).setAccessible(true);
        Object enum57 = ((Field) term20721).get((Object) null);
        Character term2965 = new Character('J');
        Character term2967 = new Character('C');
        term2946 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term2995 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term2946, term2946.getClass(), "delimiter", 's');
        setField(term2946, term2946.getClass(), "quoteChar", term2948);
        setField(term2946, term2946.getClass(), "quotePolicy", enum57);
        setField(term2946, term2946.getClass(), "commentStart", term2965);
        setField(term2946, term2946.getClass(), "escape", term2967);
        setBooleanField(term2946, term2946.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term2946, term2946.getClass(), "ignoreEmptyLines", true);
        setField(term2946, term2946.getClass(), "recordSeparator", "JDswTTCZHV");
        setField(term2946, term2946.getClass(), "nullString", "onpbIeEKoi");
        setElement(term2995, 0, "YRHGsAkhxb");
        setElement(term2995, 1, "ffYhPOzlUs");
        setElement(term2995, 2, "MLqYREekMl");
        setElement(term2995, 3, "ytSBIKXogI");
        setElement(term2995, 4, "nHXjMycHlU");
        setElement(term2995, 5, "ieCtQFdkii");
        setField(term2946, term2946.getClass(), "header", term2995);
        setBooleanField(term2946, term2946.getClass(), "skipHeaderRecord", true);
        Character term20696 = new Character('j');
        Class<? extends Object> term21691 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term21690 = ((Class) term21691).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term21690).setAccessible(true);
        Object enum60 = ((Field) term21690).get((Object) null);
        Character term20700 = new Character('J');
        Character term20701 = new Character('C');
        term20695 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term20706 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term20695, term20695.getClass(), "delimiter", 's');
        setField(term20695, term20695.getClass(), "quoteChar", term20696);
        setField(term20695, term20695.getClass(), "quotePolicy", enum60);
        setField(term20695, term20695.getClass(), "commentStart", term20700);
        setField(term20695, term20695.getClass(), "escape", term20701);
        setBooleanField(term20695, term20695.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term20695, term20695.getClass(), "ignoreEmptyLines", true);
        setField(term20695, term20695.getClass(), "recordSeparator", "JDswTTCZHV");
        setField(term20695, term20695.getClass(), "nullString", "onpbIeEKoi");
        setElement(term20706, 0, "YRHGsAkhxb");
        setElement(term20706, 1, "ffYhPOzlUs");
        setElement(term20706, 2, "MLqYREekMl");
        setElement(term20706, 3, "ytSBIKXogI");
        setElement(term20706, 4, "nHXjMycHlU");
        setElement(term20706, 5, "ieCtQFdkii");
        setField(term20695, term20695.getClass(), "header", term20706);
        setBooleanField(term20695, term20695.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNullString", argTypes, term2946, args);
        assertTrue(recursiveEquals(term2946, term20695));
        assertTrue(recursiveEquals(retValue, "onpbIeEKoi"));
    }

};


