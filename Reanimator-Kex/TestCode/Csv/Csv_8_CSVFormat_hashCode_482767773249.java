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

public class CSVFormat_hashCode_482767773249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125372;
     Object term125738;

    public CSVFormat_hashCode_482767773249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term125744 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term125743 = ((Class) term125744).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term125743).setAccessible(true);
        Object enum221 = ((Field) term125743).get((Object) null);
        Character term125524 = new Character((char) 0);
        term125372 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term125372, term125372.getClass(), "delimiter", (char) 0);
        setField(term125372, term125372.getClass(), "quotePolicy", enum221);
        setField(term125372, term125372.getClass(), "quoteChar", null);
        setField(term125372, term125372.getClass(), "commentStart", null);
        setField(term125372, term125372.getClass(), "escape", term125524);
        Class<? extends Object> term125925 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term125924 = ((Class) term125925).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term125924).setAccessible(true);
        Object enum222 = ((Field) term125924).get((Object) null);
        Character term125742 = new Character((char) 0);
        term125738 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term125738, term125738.getClass(), "delimiter", (char) 0);
        setField(term125738, term125738.getClass(), "quoteChar", null);
        setField(term125738, term125738.getClass(), "quotePolicy", enum222);
        setField(term125738, term125738.getClass(), "commentStart", null);
        setField(term125738, term125738.getClass(), "escape", term125742);
        setBooleanField(term125738, term125738.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term125738, term125738.getClass(), "ignoreEmptyLines", false);
        setField(term125738, term125738.getClass(), "recordSeparator", null);
        setField(term125738, term125738.getClass(), "nullString", null);
        setField(term125738, term125738.getClass(), "header", null);
        setBooleanField(term125738, term125738.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term125372, args);
        assertTrue(recursiveEquals(term125372, term125738));
        assertTrue(recursiveEquals(retValue, 1155430295));
    }

};


