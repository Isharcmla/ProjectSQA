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
import java.lang.Object;
import java.lang.String;

public class CSVFormat_format_2070435827308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174642;
     Object term173143;
     Object term187227;
     Object term187235;

    public CSVFormat_format_2070435827308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term174694 = new Character((char) 0);
        Character term174746 = new Character((char) 38912);
        Character term174798 = new Character((char) 1183);
        Class<? extends Object> term187240 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term187239 = ((Class) term187240).getDeclaredField((String) "ALL");
        ((Field) term187239).setAccessible(true);
        Object enum321 = ((Field) term187239).get((Object) null);
        term174642 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term173465 = (Object[]) newArray("java.lang.String", 0);
        setField(term174642, term174642.getClass(), "quoteChar", term174694);
        setCharField(term174642, term174642.getClass(), "delimiter", 'l');
        setField(term174642, term174642.getClass(), "escape", term174746);
        setField(term174642, term174642.getClass(), "commentStart", term174798);
        setField(term174642, term174642.getClass(), "header", term173465);
        setField(term174642, term174642.getClass(), "quotePolicy", enum321);
        term173143 = (Object[]) newArray("java.lang.Object", 64);
        Object[] term173144 = (Object[]) newArray("java.lang.Object", 0);
        setElement(term173143, 0, term173144);
        setElement(term173143, 1, "l \b\u0001  \uFF80\u0004\uFF80  \b\u0010    \u0004 @ \u0001 \uFF80 ");
        Character term187228 = new Character((char) 0);
        Class<? extends Object> term187408 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term187407 = ((Class) term187408).getDeclaredField((String) "ALL");
        ((Field) term187407).setAccessible(true);
        Object enum322 = ((Field) term187407).get((Object) null);
        Character term187232 = new Character((char) 1183);
        Character term187233 = new Character((char) 38912);
        term187227 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term187234 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term187227, term187227.getClass(), "delimiter", 'l');
        setField(term187227, term187227.getClass(), "quoteChar", term187228);
        setField(term187227, term187227.getClass(), "quotePolicy", enum322);
        setField(term187227, term187227.getClass(), "commentStart", term187232);
        setField(term187227, term187227.getClass(), "escape", term187233);
        setBooleanField(term187227, term187227.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term187227, term187227.getClass(), "ignoreEmptyLines", false);
        setField(term187227, term187227.getClass(), "recordSeparator", null);
        setField(term187227, term187227.getClass(), "nullString", null);
        setField(term187227, term187227.getClass(), "header", term187234);
        setBooleanField(term187227, term187227.getClass(), "skipHeaderRecord", false);
        term187235 = (Object[]) newArray("java.lang.Object", 64);
        Object[] term187236 = (Object[]) newArray("java.lang.Object", 0);
        setElement(term187235, 0, term187236);
        setElement(term187235, 1, "l   \b \u0001     \uFF80\uFFFF\u0004 \uFF80\uFFFF    \b \u0010         \u0004   @   \u0001   \uFF80\uFFFF  ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term173143;
        Object retValue = callMethod(klass, "format", argTypes, term174642, args);
        assertTrue(recursiveEquals(term174642, term187227));
        assertTrue(recursiveEquals(term173143, term187235));
        assertTrue(recursiveEquals(retValue, "[ L j a v a . l a n g . O b j e c t ; @ 4 b 8 2 3 3 b f   l   l   \b \u0001     \uFF80\uFFFF\u0004 \uFF80\uFFFF    \b \u0010         \u0004   @   \u0001   \uFF80\uFFFF    l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l     l "));
    }

};


