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

public class CSVFormat_hashCode_482767773193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91527;
     Object term92032;

    public CSVFormat_hashCode_482767773193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term92042 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term92041 = ((Class) term92042).getDeclaredField((String) "MINIMAL");
        ((Field) term92041).setAccessible(true);
        Object enum168 = ((Field) term92041).get((Object) null);
        Character term91679 = new Character((char) 0);
        Character term91731 = new Character((char) 0);
        Character term91783 = new Character((char) 0);
        term91527 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term91527, term91527.getClass(), "delimiter", (char) 0);
        setField(term91527, term91527.getClass(), "quotePolicy", enum168);
        setField(term91527, term91527.getClass(), "quoteChar", term91679);
        setField(term91527, term91527.getClass(), "commentStart", term91731);
        setField(term91527, term91527.getClass(), "escape", term91783);
        setField(term91527, term91527.getClass(), "nullString", "NONE");
        setBooleanField(term91527, term91527.getClass(), "ignoreSurroundingSpaces", false);
        Character term92033 = new Character((char) 0);
        Class<? extends Object> term92214 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term92213 = ((Class) term92214).getDeclaredField((String) "MINIMAL");
        ((Field) term92213).setAccessible(true);
        Object enum169 = ((Field) term92213).get((Object) null);
        Character term92037 = new Character((char) 0);
        Character term92038 = new Character((char) 0);
        term92032 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term92032, term92032.getClass(), "delimiter", (char) 0);
        setField(term92032, term92032.getClass(), "quoteChar", term92033);
        setField(term92032, term92032.getClass(), "quotePolicy", enum169);
        setField(term92032, term92032.getClass(), "commentStart", term92037);
        setField(term92032, term92032.getClass(), "escape", term92038);
        setBooleanField(term92032, term92032.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term92032, term92032.getClass(), "ignoreEmptyLines", false);
        setField(term92032, term92032.getClass(), "recordSeparator", null);
        setField(term92032, term92032.getClass(), "nullString", "NONE");
        setField(term92032, term92032.getClass(), "header", null);
        setBooleanField(term92032, term92032.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term91527, args);
        assertTrue(recursiveEquals(term91527, term92032));
        assertTrue(recursiveEquals(retValue, 255994879));
    }

};


