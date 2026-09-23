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
import java.lang.String;
import java.lang.Object;
import java.lang.Character;

public class CSVFormat_hashCode_482767773287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154691;
     Object term155041;

    public CSVFormat_hashCode_482767773287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term155047 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term155046 = ((Class) term155047).getDeclaredField((String) "MINIMAL");
        ((Field) term155046).setAccessible(true);
        Object enum285 = ((Field) term155046).get((Object) null);
        Character term154843 = new Character((char) 0);
        term154691 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term154691, term154691.getClass(), "delimiter", (char) 0);
        setField(term154691, term154691.getClass(), "quotePolicy", enum285);
        setField(term154691, term154691.getClass(), "quoteChar", null);
        setField(term154691, term154691.getClass(), "commentStart", term154843);
        Class<? extends Object> term155216 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term155215 = ((Class) term155216).getDeclaredField((String) "MINIMAL");
        ((Field) term155215).setAccessible(true);
        Object enum286 = ((Field) term155215).get((Object) null);
        Character term155045 = new Character((char) 0);
        term155041 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term155041, term155041.getClass(), "delimiter", (char) 0);
        setField(term155041, term155041.getClass(), "quoteChar", null);
        setField(term155041, term155041.getClass(), "quotePolicy", enum286);
        setField(term155041, term155041.getClass(), "commentStart", term155045);
        setField(term155041, term155041.getClass(), "escape", null);
        setBooleanField(term155041, term155041.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term155041, term155041.getClass(), "ignoreEmptyLines", false);
        setField(term155041, term155041.getClass(), "recordSeparator", null);
        setField(term155041, term155041.getClass(), "nullString", null);
        setField(term155041, term155041.getClass(), "header", null);
        setBooleanField(term155041, term155041.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term154691, args);
        assertTrue(recursiveEquals(term154691, term155041));
        assertTrue(recursiveEquals(retValue, 1074204727));
    }

};


