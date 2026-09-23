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
import java.lang.Character;
import java.lang.Object;
import java.lang.String;

public class CSVFormat_format_2070435827302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168931;
     Object term166759;

    public CSVFormat_format_2070435827302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term168983 = new Character((char) 4379);
        Character term169035 = new Character((char) 1024);
        Character term169087 = new Character((char) 64479);
        Class<? extends Object> term169265 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term169264 = ((Class) term169265).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term169264).setAccessible(true);
        Object enum314 = ((Field) term169264).get((Object) null);
        term168931 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term167346 = (Object[]) newArray("java.lang.String", 0);
        setField(term168931, term168931.getClass(), "quoteChar", term168983);
        setCharField(term168931, term168931.getClass(), "delimiter", (char) 65188);
        setField(term168931, term168931.getClass(), "escape", term169035);
        setField(term168931, term168931.getClass(), "commentStart", term169087);
        setField(term168931, term168931.getClass(), "header", term167346);
        setField(term168931, term168931.getClass(), "quotePolicy", enum314);
        term166759 = (Object[]) newArray("java.lang.String", 256);
        int[] term166760 = (int[]) newIntArray(0);
        setElement(term166759, 0, term166760);
        setElement(term166759, 1, "");
        setElement(term166759, 2, "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term166759;
        callMethod(klass, "format", argTypes, term168931, args);
    }

};


