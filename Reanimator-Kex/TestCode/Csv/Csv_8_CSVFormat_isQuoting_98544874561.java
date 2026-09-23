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

public class CSVFormat_isQuoting_98544874561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5773;
     Object term25919;

    public CSVFormat_isQuoting_98544874561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term5775 = new Character('K');
        Class<? extends Object> term25945 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term25944 = ((Class) term25945).getDeclaredField((String) "MINIMAL");
        ((Field) term25944).setAccessible(true);
        Object enum76 = ((Field) term25944).get((Object) null);
        Character term5788 = new Character('T');
        Character term5790 = new Character('N');
        term5773 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term5818 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term5773, term5773.getClass(), "delimiter", 'R');
        setField(term5773, term5773.getClass(), "quoteChar", term5775);
        setField(term5773, term5773.getClass(), "quotePolicy", enum76);
        setField(term5773, term5773.getClass(), "commentStart", term5788);
        setField(term5773, term5773.getClass(), "escape", term5790);
        setBooleanField(term5773, term5773.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term5773, term5773.getClass(), "ignoreEmptyLines", false);
        setField(term5773, term5773.getClass(), "recordSeparator", "vjxIhXHxGR");
        setField(term5773, term5773.getClass(), "nullString", "QXzGXbEXMu");
        setElement(term5818, 0, "qxSDVejjiY");
        setElement(term5818, 1, "xBsXSDjXYK");
        setElement(term5818, 2, "sEnIVFtZuQ");
        setElement(term5818, 3, "ZVecLZMLHF");
        setElement(term5818, 4, "fztQhjqwdP");
        setElement(term5818, 5, "eVpkWxjuki");
        setField(term5773, term5773.getClass(), "header", term5818);
        setBooleanField(term5773, term5773.getClass(), "skipHeaderRecord", false);
        Character term25920 = new Character('K');
        Class<? extends Object> term26193 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term26192 = ((Class) term26193).getDeclaredField((String) "MINIMAL");
        ((Field) term26192).setAccessible(true);
        Object enum77 = ((Field) term26192).get((Object) null);
        Character term25924 = new Character('T');
        Character term25925 = new Character('N');
        term25919 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term25930 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term25919, term25919.getClass(), "delimiter", 'R');
        setField(term25919, term25919.getClass(), "quoteChar", term25920);
        setField(term25919, term25919.getClass(), "quotePolicy", enum77);
        setField(term25919, term25919.getClass(), "commentStart", term25924);
        setField(term25919, term25919.getClass(), "escape", term25925);
        setBooleanField(term25919, term25919.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term25919, term25919.getClass(), "ignoreEmptyLines", false);
        setField(term25919, term25919.getClass(), "recordSeparator", "vjxIhXHxGR");
        setField(term25919, term25919.getClass(), "nullString", "QXzGXbEXMu");
        setElement(term25930, 0, "qxSDVejjiY");
        setElement(term25930, 1, "xBsXSDjXYK");
        setElement(term25930, 2, "sEnIVFtZuQ");
        setElement(term25930, 3, "ZVecLZMLHF");
        setElement(term25930, 4, "fztQhjqwdP");
        setElement(term25930, 5, "eVpkWxjuki");
        setField(term25919, term25919.getClass(), "header", term25930);
        setBooleanField(term25919, term25919.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isQuoting", argTypes, term5773, args);
        assertTrue(recursiveEquals(term5773, term25919));
        assertTrue(recursiveEquals(retValue, true));
    }

};


