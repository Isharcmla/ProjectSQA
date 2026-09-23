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
import java.lang.IllegalArgumentException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Character;
import java.lang.String;
import java.lang.Object;

public class CSVParser_init_75586641818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1298;

    public CSVParser_init_75586641818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1300 = new Character('J');
        Class<? extends Object> term145598 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term145597 = ((Class) term145598).getDeclaredField((String) "ALL");
        ((Field) term145597).setAccessible(true);
        Object enum34 = ((Field) term145597).get((Object) null);
        Character term1309 = new Character('A');
        Character term1311 = new Character('E');
        term1298 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term1340 = (Object[]) newArray("java.lang.String", 4);
        setCharField(term1298, term1298.getClass(), "delimiter", 'l');
        setField(term1298, term1298.getClass(), "quoteChar", term1300);
        setField(term1298, term1298.getClass(), "quotePolicy", enum34);
        setField(term1298, term1298.getClass(), "commentStart", term1309);
        setField(term1298, term1298.getClass(), "escape", term1311);
        setBooleanField(term1298, term1298.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term1298, term1298.getClass(), "ignoreEmptyHeaders", true);
        setBooleanField(term1298, term1298.getClass(), "ignoreEmptyLines", false);
        setField(term1298, term1298.getClass(), "recordSeparator", "hNxWaHcfhY");
        setField(term1298, term1298.getClass(), "nullString", "RkybSrpybU");
        setElement(term1340, 0, "xOEqzGAmDU");
        setElement(term1340, 1, "eZFUvlxvGV");
        setElement(term1340, 2, "BYqFIqCKAV");
        setElement(term1340, 3, "vrQLuWIDJX");
        setField(term1298, term1298.getClass(), "header", term1340);
        setBooleanField(term1298, term1298.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Reader");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1298;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


