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
import java.lang.Boolean;

public class CSVFormat_withAllowMissingColumnNames_75501432045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18893;
     Object term19035;

    public CSVFormat_withAllowMissingColumnNames_75501432045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term18895 = new Character('z');
        Character term18898 = new Character('s');
        Character term19001 = new Character('t');
        Class<? extends Object> term19118 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term19117 = ((Class) term19118).getDeclaredField((String) "ALL_NON_NULL");
        ((Field) term19117).setAccessible(true);
        Object enum42 = ((Field) term19117).get((Object) null);
        term18893 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term18900 = (Object[]) newArray("java.lang.String", 7);
        Object[] term18985 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term18893, term18893.getClass(), "allowMissingColumnNames", true);
        setField(term18893, term18893.getClass(), "commentMarker", term18895);
        setCharField(term18893, term18893.getClass(), "delimiter", 'T');
        setField(term18893, term18893.getClass(), "escapeCharacter", term18898);
        setElement(term18900, 0, "aSATgQUpoe");
        setElement(term18900, 1, "VkPSXewZfB");
        setElement(term18900, 2, "ubodzJoMGW");
        setElement(term18900, 3, "weddIktxOA");
        setElement(term18900, 4, "uSlMeISsDD");
        setElement(term18900, 5, "WdCiTDUKqn");
        setElement(term18900, 6, "PSizQDoxxe");
        setField(term18893, term18893.getClass(), "header", term18900);
        setField(term18893, term18893.getClass(), "headerComments", term18985);
        setBooleanField(term18893, term18893.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term18893, term18893.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term18893, term18893.getClass(), "ignoreSurroundingSpaces", true);
        setField(term18893, term18893.getClass(), "nullString", "mKaHyMybrK");
        setField(term18893, term18893.getClass(), "quoteCharacter", term19001);
        setField(term18893, term18893.getClass(), "quoteMode", enum42);
        setField(term18893, term18893.getClass(), "recordSeparator", "AyrEXuGrEj");
        setBooleanField(term18893, term18893.getClass(), "skipHeaderRecord", false);
        setBooleanField(term18893, term18893.getClass(), "trailingDelimiter", true);
        setBooleanField(term18893, term18893.getClass(), "trim", true);
        setBooleanField(term18893, term18893.getClass(), "autoFlush", false);
        term19035 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term19035;
        callMethod(klass, "withAllowMissingColumnNames", argTypes, term18893, args);
    }

};


