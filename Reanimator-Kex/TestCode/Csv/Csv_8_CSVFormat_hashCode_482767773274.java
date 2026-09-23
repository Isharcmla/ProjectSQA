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

public class CSVFormat_hashCode_482767773274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147615;
     Object term148699;

    public CSVFormat_hashCode_482767773274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term148709 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term148708 = ((Class) term148709).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term148708).setAccessible(true);
        Object enum266 = ((Field) term148708).get((Object) null);
        Character term147767 = new Character((char) 0);
        Character term147819 = new Character((char) 0);
        Character term147871 = new Character((char) 0);
        term147615 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term147615, term147615.getClass(), "delimiter", (char) 0);
        setField(term147615, term147615.getClass(), "quotePolicy", enum266);
        setField(term147615, term147615.getClass(), "quoteChar", term147767);
        setField(term147615, term147615.getClass(), "commentStart", term147819);
        setField(term147615, term147615.getClass(), "escape", term147871);
        setField(term147615, term147615.getClass(), "nullString", "NONE");
        setBooleanField(term147615, term147615.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term147615, term147615.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term147615, term147615.getClass(), "skipHeaderRecord", true);
        Character term148700 = new Character((char) 0);
        Class<? extends Object> term148893 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term148892 = ((Class) term148893).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term148892).setAccessible(true);
        Object enum267 = ((Field) term148892).get((Object) null);
        Character term148704 = new Character((char) 0);
        Character term148705 = new Character((char) 0);
        term148699 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term148699, term148699.getClass(), "delimiter", (char) 0);
        setField(term148699, term148699.getClass(), "quoteChar", term148700);
        setField(term148699, term148699.getClass(), "quotePolicy", enum267);
        setField(term148699, term148699.getClass(), "commentStart", term148704);
        setField(term148699, term148699.getClass(), "escape", term148705);
        setBooleanField(term148699, term148699.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term148699, term148699.getClass(), "ignoreEmptyLines", false);
        setField(term148699, term148699.getClass(), "recordSeparator", null);
        setField(term148699, term148699.getClass(), "nullString", "NONE");
        setField(term148699, term148699.getClass(), "header", null);
        setBooleanField(term148699, term148699.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term147615, args);
        assertTrue(recursiveEquals(term147615, term148699));
        assertTrue(recursiveEquals(retValue, 331673555));
    }

};


