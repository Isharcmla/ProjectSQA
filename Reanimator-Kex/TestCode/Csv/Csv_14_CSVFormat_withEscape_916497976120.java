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

public class CSVFormat_withEscape_916497976120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19814;
     Object term20031;
     Object term80118;
     Object term79908;

    public CSVFormat_withEscape_916497976120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term19816 = new Character('E');
        Character term19819 = new Character('H');
        Character term20006 = new Character('y');
        Class<? extends Object> term80310 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term80309 = ((Class) term80310).getDeclaredField((String) "NONE");
        ((Field) term80309).setAccessible(true);
        Object enum160 = ((Field) term80309).get((Object) null);
        term19814 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term19821 = (Object[]) newArray("java.lang.String", 8);
        Object[] term19918 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term19814, term19814.getClass(), "allowMissingColumnNames", true);
        setField(term19814, term19814.getClass(), "commentMarker", term19816);
        setCharField(term19814, term19814.getClass(), "delimiter", 'R');
        setField(term19814, term19814.getClass(), "escapeCharacter", term19819);
        setElement(term19821, 0, "hIYsRyOZxk");
        setElement(term19821, 1, "RjNoEywJbC");
        setElement(term19821, 2, "RTTvrwwhou");
        setElement(term19821, 3, "lRORwXipuk");
        setElement(term19821, 4, "fVdTcjgHdw");
        setElement(term19821, 5, "wwAwLLcLPp");
        setElement(term19821, 6, "nHpMKOmlpQ");
        setElement(term19821, 7, "fKhrQsJToZ");
        setField(term19814, term19814.getClass(), "header", term19821);
        setElement(term19918, 0, "wsysQLGFnl");
        setElement(term19918, 1, "ckQLZGFjMX");
        setElement(term19918, 2, "qphdrqUtNx");
        setElement(term19918, 3, "bwlLFAfNWx");
        setElement(term19918, 4, "JWodNQzjjV");
        setElement(term19918, 5, "CAgxWjhxNf");
        setField(term19814, term19814.getClass(), "headerComments", term19918);
        setBooleanField(term19814, term19814.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term19814, term19814.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term19814, term19814.getClass(), "ignoreSurroundingSpaces", true);
        setField(term19814, term19814.getClass(), "nullString", "goAoCMhKBu");
        setField(term19814, term19814.getClass(), "quoteCharacter", term20006);
        setField(term19814, term19814.getClass(), "quoteMode", enum160);
        setField(term19814, term19814.getClass(), "recordSeparator", "BWxJSgKHRT");
        setBooleanField(term19814, term19814.getClass(), "skipHeaderRecord", true);
        setBooleanField(term19814, term19814.getClass(), "trailingDelimiter", true);
        setBooleanField(term19814, term19814.getClass(), "trim", true);
        term20031 = new Character('x');
        Character term80119 = new Character('E');
        Character term80120 = new Character('H');
        Character term80153 = new Character('y');
        Class<? extends Object> term80649 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term80648 = ((Class) term80649).getDeclaredField((String) "NONE");
        ((Field) term80648).setAccessible(true);
        Object enum161 = ((Field) term80648).get((Object) null);
        term80118 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term80121 = (Object[]) newArray("java.lang.String", 8);
        Object[] term80138 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term80118, term80118.getClass(), "allowMissingColumnNames", true);
        setField(term80118, term80118.getClass(), "commentMarker", term80119);
        setCharField(term80118, term80118.getClass(), "delimiter", 'R');
        setField(term80118, term80118.getClass(), "escapeCharacter", term80120);
        setElement(term80121, 0, "hIYsRyOZxk");
        setElement(term80121, 1, "RjNoEywJbC");
        setElement(term80121, 2, "RTTvrwwhou");
        setElement(term80121, 3, "lRORwXipuk");
        setElement(term80121, 4, "fVdTcjgHdw");
        setElement(term80121, 5, "wwAwLLcLPp");
        setElement(term80121, 6, "nHpMKOmlpQ");
        setElement(term80121, 7, "fKhrQsJToZ");
        setField(term80118, term80118.getClass(), "header", term80121);
        setElement(term80138, 0, "wsysQLGFnl");
        setElement(term80138, 1, "ckQLZGFjMX");
        setElement(term80138, 2, "qphdrqUtNx");
        setElement(term80138, 3, "bwlLFAfNWx");
        setElement(term80138, 4, "JWodNQzjjV");
        setElement(term80138, 5, "CAgxWjhxNf");
        setField(term80118, term80118.getClass(), "headerComments", term80138);
        setBooleanField(term80118, term80118.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term80118, term80118.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term80118, term80118.getClass(), "ignoreSurroundingSpaces", true);
        setField(term80118, term80118.getClass(), "nullString", "goAoCMhKBu");
        setField(term80118, term80118.getClass(), "quoteCharacter", term80153);
        setField(term80118, term80118.getClass(), "quoteMode", enum161);
        setField(term80118, term80118.getClass(), "recordSeparator", "BWxJSgKHRT");
        setBooleanField(term80118, term80118.getClass(), "skipHeaderRecord", true);
        setBooleanField(term80118, term80118.getClass(), "trailingDelimiter", true);
        setBooleanField(term80118, term80118.getClass(), "trim", true);
        Character term79910 = new Character('E');
        Character term79913 = new Character('x');
        Character term80100 = new Character('y');
        Class<? extends Object> term80988 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term80987 = ((Class) term80988).getDeclaredField((String) "NONE");
        ((Field) term80987).setAccessible(true);
        Object enum162 = ((Field) term80987).get((Object) null);
        term79908 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term79915 = (Object[]) newArray("java.lang.String", 8);
        Object[] term80012 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term79908, term79908.getClass(), "allowMissingColumnNames", true);
        setField(term79908, term79908.getClass(), "commentMarker", term79910);
        setCharField(term79908, term79908.getClass(), "delimiter", 'R');
        setField(term79908, term79908.getClass(), "escapeCharacter", term79913);
        setElement(term79915, 0, "hIYsRyOZxk");
        setElement(term79915, 1, "RjNoEywJbC");
        setElement(term79915, 2, "RTTvrwwhou");
        setElement(term79915, 3, "lRORwXipuk");
        setElement(term79915, 4, "fVdTcjgHdw");
        setElement(term79915, 5, "wwAwLLcLPp");
        setElement(term79915, 6, "nHpMKOmlpQ");
        setElement(term79915, 7, "fKhrQsJToZ");
        setField(term79908, term79908.getClass(), "header", term79915);
        setElement(term80012, 0, "wsysQLGFnl");
        setElement(term80012, 1, "ckQLZGFjMX");
        setElement(term80012, 2, "qphdrqUtNx");
        setElement(term80012, 3, "bwlLFAfNWx");
        setElement(term80012, 4, "JWodNQzjjV");
        setElement(term80012, 5, "CAgxWjhxNf");
        setField(term79908, term79908.getClass(), "headerComments", term80012);
        setBooleanField(term79908, term79908.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term79908, term79908.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term79908, term79908.getClass(), "ignoreSurroundingSpaces", true);
        setField(term79908, term79908.getClass(), "nullString", "goAoCMhKBu");
        setField(term79908, term79908.getClass(), "quoteCharacter", term80100);
        setField(term79908, term79908.getClass(), "quoteMode", enum162);
        setField(term79908, term79908.getClass(), "recordSeparator", "BWxJSgKHRT");
        setBooleanField(term79908, term79908.getClass(), "skipHeaderRecord", true);
        setBooleanField(term79908, term79908.getClass(), "trailingDelimiter", true);
        setBooleanField(term79908, term79908.getClass(), "trim", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term20031;
        Object retValue = callMethod(klass, "withEscape", argTypes, term19814, args);
        assertTrue(recursiveEquals(term19814, term80118));
        assertTrue(recursiveEquals(term20031, 'x'));
        assertTrue(recursiveEquals(retValue, term79908));
    }

};


