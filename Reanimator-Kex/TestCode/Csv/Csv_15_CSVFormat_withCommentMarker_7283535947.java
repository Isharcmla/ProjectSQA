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
import java.lang.Character;
import java.lang.Object;
import java.lang.String;

public class CSVFormat_withCommentMarker_7283535947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19911;
     Object term20128;

    public CSVFormat_withCommentMarker_7283535947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term19913 = new Character('I');
        Character term19916 = new Character('E');
        Character term20103 = new Character('R');
        Class<? extends Object> term20281 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term20280 = ((Class) term20281).getDeclaredField((String) "ALL");
        ((Field) term20280).setAccessible(true);
        Object enum44 = ((Field) term20280).get((Object) null);
        term19911 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term19918 = (Object[]) newArray("java.lang.String", 8);
        Object[] term20015 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term19911, term19911.getClass(), "allowMissingColumnNames", true);
        setField(term19911, term19911.getClass(), "commentMarker", term19913);
        setCharField(term19911, term19911.getClass(), "delimiter", 'f');
        setField(term19911, term19911.getClass(), "escapeCharacter", term19916);
        setElement(term19918, 0, "IApvtmfhnq");
        setElement(term19918, 1, "VSaNnhMpRc");
        setElement(term19918, 2, "QNjNTLlUaV");
        setElement(term19918, 3, "hIYsRyOZxk");
        setElement(term19918, 4, "RjNoEywJbC");
        setElement(term19918, 5, "RTTvrwwhou");
        setElement(term19918, 6, "lRORwXipuk");
        setElement(term19918, 7, "fVdTcjgHdw");
        setField(term19911, term19911.getClass(), "header", term19918);
        setElement(term20015, 0, "wwAwLLcLPp");
        setElement(term20015, 1, "nHpMKOmlpQ");
        setElement(term20015, 2, "fKhrQsJToZ");
        setElement(term20015, 3, "wsysQLGFnl");
        setElement(term20015, 4, "ckQLZGFjMX");
        setElement(term20015, 5, "qphdrqUtNx");
        setField(term19911, term19911.getClass(), "headerComments", term20015);
        setBooleanField(term19911, term19911.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term19911, term19911.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term19911, term19911.getClass(), "ignoreSurroundingSpaces", false);
        setField(term19911, term19911.getClass(), "nullString", "bwlLFAfNWx");
        setField(term19911, term19911.getClass(), "quoteCharacter", term20103);
        setField(term19911, term19911.getClass(), "quoteMode", enum44);
        setField(term19911, term19911.getClass(), "recordSeparator", "JWodNQzjjV");
        setBooleanField(term19911, term19911.getClass(), "skipHeaderRecord", true);
        setBooleanField(term19911, term19911.getClass(), "trailingDelimiter", true);
        setBooleanField(term19911, term19911.getClass(), "trim", false);
        setBooleanField(term19911, term19911.getClass(), "autoFlush", false);
        term20128 = new Character('H');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Character");
        Object[] args = new Object[1];
        args[0] = term20128;
        callMethod(klass, "withCommentMarker", argTypes, term19911, args);
    }

};


