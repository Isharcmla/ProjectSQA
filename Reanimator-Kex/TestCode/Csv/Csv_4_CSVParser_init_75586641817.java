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

public class CSVParser_init_75586641817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1295;

    public CSVParser_init_75586641817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1297 = new Character('J');
        Class<? extends Object> term12847 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term12846 = ((Class) term12847).getDeclaredField((String) "ALL");
        ((Field) term12846).setAccessible(true);
        Object enum32 = ((Field) term12846).get((Object) null);
        Character term1306 = new Character('A');
        Character term1308 = new Character('E');
        term1295 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term1336 = (Object[]) newArray("java.lang.String", 4);
        setCharField(term1295, term1295.getClass(), "delimiter", 'l');
        setField(term1295, term1295.getClass(), "quoteChar", term1297);
        setField(term1295, term1295.getClass(), "quotePolicy", enum32);
        setField(term1295, term1295.getClass(), "commentStart", term1306);
        setField(term1295, term1295.getClass(), "escape", term1308);
        setBooleanField(term1295, term1295.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term1295, term1295.getClass(), "ignoreEmptyLines", false);
        setField(term1295, term1295.getClass(), "recordSeparator", "hNxWaHcfhY");
        setField(term1295, term1295.getClass(), "nullString", "RkybSrpybU");
        setElement(term1336, 0, "xOEqzGAmDU");
        setElement(term1336, 1, "eZFUvlxvGV");
        setElement(term1336, 2, "BYqFIqCKAV");
        setElement(term1336, 3, "vrQLuWIDJX");
        setField(term1295, term1295.getClass(), "header", term1336);
        setBooleanField(term1295, term1295.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Reader");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1295;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


