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

public class CSVFormat_hashCode_482767773275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148293;
     Object term149195;

    public CSVFormat_hashCode_482767773275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term149203 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term149202 = ((Class) term149203).getDeclaredField((String) "NONE");
        ((Field) term149202).setAccessible(true);
        Object enum268 = ((Field) term149202).get((Object) null);
        Character term148445 = new Character((char) 0);
        Character term148497 = new Character((char) 0);
        term148293 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term148293, term148293.getClass(), "delimiter", (char) 0);
        setField(term148293, term148293.getClass(), "quotePolicy", enum268);
        setField(term148293, term148293.getClass(), "quoteChar", term148445);
        setField(term148293, term148293.getClass(), "commentStart", term148497);
        setField(term148293, term148293.getClass(), "escape", term148497);
        setField(term148293, term148293.getClass(), "nullString", null);
        setBooleanField(term148293, term148293.getClass(), "ignoreSurroundingSpaces", true);
        Character term149196 = new Character((char) 0);
        Class<? extends Object> term149362 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term149361 = ((Class) term149362).getDeclaredField((String) "NONE");
        ((Field) term149361).setAccessible(true);
        Object enum269 = ((Field) term149361).get((Object) null);
        Character term149200 = new Character((char) 0);
        Character term149201 = new Character((char) 0);
        term149195 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term149195, term149195.getClass(), "delimiter", (char) 0);
        setField(term149195, term149195.getClass(), "quoteChar", term149196);
        setField(term149195, term149195.getClass(), "quotePolicy", enum269);
        setField(term149195, term149195.getClass(), "commentStart", term149200);
        setField(term149195, term149195.getClass(), "escape", term149201);
        setBooleanField(term149195, term149195.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term149195, term149195.getClass(), "ignoreEmptyLines", false);
        setField(term149195, term149195.getClass(), "recordSeparator", null);
        setField(term149195, term149195.getClass(), "nullString", null);
        setField(term149195, term149195.getClass(), "header", null);
        setBooleanField(term149195, term149195.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term148293, args);
        assertTrue(recursiveEquals(term148293, term149195));
        assertTrue(recursiveEquals(retValue, 1838132728));
    }

};


