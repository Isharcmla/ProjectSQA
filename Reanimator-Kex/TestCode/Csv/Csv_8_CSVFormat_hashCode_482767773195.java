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

public class CSVFormat_hashCode_482767773195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92558;
     Object term92899;

    public CSVFormat_hashCode_482767773195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term92907 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term92906 = ((Class) term92907).getDeclaredField((String) "NONE");
        ((Field) term92906).setAccessible(true);
        Object enum171 = ((Field) term92906).get((Object) null);
        Character term92710 = new Character((char) 0);
        term92558 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term92558, term92558.getClass(), "delimiter", (char) 0);
        setField(term92558, term92558.getClass(), "quotePolicy", enum171);
        setField(term92558, term92558.getClass(), "quoteChar", term92710);
        setField(term92558, term92558.getClass(), "commentStart", term92710);
        setField(term92558, term92558.getClass(), "escape", term92710);
        setField(term92558, term92558.getClass(), "nullString", null);
        Character term92900 = new Character((char) 0);
        Class<? extends Object> term93066 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term93065 = ((Class) term93066).getDeclaredField((String) "NONE");
        ((Field) term93065).setAccessible(true);
        Object enum172 = ((Field) term93065).get((Object) null);
        Character term92904 = new Character((char) 0);
        Character term92905 = new Character((char) 0);
        term92899 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term92899, term92899.getClass(), "delimiter", (char) 0);
        setField(term92899, term92899.getClass(), "quoteChar", term92900);
        setField(term92899, term92899.getClass(), "quotePolicy", enum172);
        setField(term92899, term92899.getClass(), "commentStart", term92904);
        setField(term92899, term92899.getClass(), "escape", term92905);
        setBooleanField(term92899, term92899.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term92899, term92899.getClass(), "ignoreEmptyLines", false);
        setField(term92899, term92899.getClass(), "recordSeparator", null);
        setField(term92899, term92899.getClass(), "nullString", null);
        setField(term92899, term92899.getClass(), "header", null);
        setBooleanField(term92899, term92899.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term92558, args);
        assertTrue(recursiveEquals(term92558, term92899));
        assertTrue(recursiveEquals(retValue, 1843673854));
    }

};


