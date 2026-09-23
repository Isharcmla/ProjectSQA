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

public class CSVFormat_hashCode_482767773241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122514;
     Object term123283;

    public CSVFormat_hashCode_482767773241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term123288 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term123287 = ((Class) term123288).getDeclaredField((String) "ALL");
        ((Field) term123287).setAccessible(true);
        Object enum218 = ((Field) term123287).get((Object) null);
        term122514 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term122514, term122514.getClass(), "delimiter", (char) 0);
        setField(term122514, term122514.getClass(), "quotePolicy", enum218);
        setField(term122514, term122514.getClass(), "quoteChar", null);
        setField(term122514, term122514.getClass(), "commentStart", null);
        setField(term122514, term122514.getClass(), "escape", null);
        setField(term122514, term122514.getClass(), "nullString", null);
        setBooleanField(term122514, term122514.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term122514, term122514.getClass(), "ignoreEmptyLines", true);
        Class<? extends Object> term123444 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term123443 = ((Class) term123444).getDeclaredField((String) "ALL");
        ((Field) term123443).setAccessible(true);
        Object enum219 = ((Field) term123443).get((Object) null);
        term123283 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term123283, term123283.getClass(), "delimiter", (char) 0);
        setField(term123283, term123283.getClass(), "quoteChar", null);
        setField(term123283, term123283.getClass(), "quotePolicy", enum219);
        setField(term123283, term123283.getClass(), "commentStart", null);
        setField(term123283, term123283.getClass(), "escape", null);
        setBooleanField(term123283, term123283.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term123283, term123283.getClass(), "ignoreEmptyLines", true);
        setField(term123283, term123283.getClass(), "recordSeparator", null);
        setField(term123283, term123283.getClass(), "nullString", null);
        setField(term123283, term123283.getClass(), "header", null);
        setBooleanField(term123283, term123283.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term122514, args);
        assertTrue(recursiveEquals(term122514, term123283));
        assertTrue(recursiveEquals(retValue, 890501103));
    }

};


