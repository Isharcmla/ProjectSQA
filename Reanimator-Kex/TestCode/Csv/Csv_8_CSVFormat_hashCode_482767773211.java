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

public class CSVFormat_hashCode_482767773211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108253;
     Object term108736;

    public CSVFormat_hashCode_482767773211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term108742 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term108741 = ((Class) term108742).getDeclaredField((String) "ALL");
        ((Field) term108741).setAccessible(true);
        Object enum180 = ((Field) term108741).get((Object) null);
        Character term108405 = new Character((char) 0);
        term108253 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term108253, term108253.getClass(), "delimiter", (char) 0);
        setField(term108253, term108253.getClass(), "quotePolicy", enum180);
        setField(term108253, term108253.getClass(), "quoteChar", term108405);
        setField(term108253, term108253.getClass(), "commentStart", null);
        setField(term108253, term108253.getClass(), "escape", null);
        setField(term108253, term108253.getClass(), "nullString", null);
        setBooleanField(term108253, term108253.getClass(), "ignoreSurroundingSpaces", true);
        Character term108737 = new Character((char) 0);
        Class<? extends Object> term108898 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term108897 = ((Class) term108898).getDeclaredField((String) "ALL");
        ((Field) term108897).setAccessible(true);
        Object enum181 = ((Field) term108897).get((Object) null);
        term108736 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term108736, term108736.getClass(), "delimiter", (char) 0);
        setField(term108736, term108736.getClass(), "quoteChar", term108737);
        setField(term108736, term108736.getClass(), "quotePolicy", enum181);
        setField(term108736, term108736.getClass(), "commentStart", null);
        setField(term108736, term108736.getClass(), "escape", null);
        setBooleanField(term108736, term108736.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term108736, term108736.getClass(), "ignoreEmptyLines", false);
        setField(term108736, term108736.getClass(), "recordSeparator", null);
        setField(term108736, term108736.getClass(), "nullString", null);
        setField(term108736, term108736.getClass(), "header", null);
        setBooleanField(term108736, term108736.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term108253, args);
        assertTrue(recursiveEquals(term108253, term108736));
        assertTrue(recursiveEquals(retValue, 885138723));
    }

};


