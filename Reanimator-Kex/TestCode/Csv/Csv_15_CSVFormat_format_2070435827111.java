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
import java.lang.Object;
import java.lang.Character;

public class CSVFormat_format_2070435827111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73499;
     Object term71226;

    public CSVFormat_format_2070435827111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term73551 = new Character((char) 0);
        term73499 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term71475 = (Object[]) newArray("java.lang.String", 0);
        Object[] term72836 = (Object[]) newArray("java.lang.String", 0);
        setField(term73499, term73499.getClass(), "headerComments", term71475);
        setField(term73499, term73499.getClass(), "commentMarker", term73551);
        setBooleanField(term73499, term73499.getClass(), "trailingDelimiter", true);
        setCharField(term73499, term73499.getClass(), "delimiter", (char) 0);
        setField(term73499, term73499.getClass(), "recordSeparator", "");
        setField(term73499, term73499.getClass(), "header", term72836);
        setBooleanField(term73499, term73499.getClass(), "skipHeaderRecord", true);
        term71226 = (Object[]) newArray("java.lang.Object", 64);
        setElement(term71226, 1, "          ");
        setElement(term71226, 2, "          ");
        setElement(term71226, 3, "          ");
        setElement(term71226, 4, "          ");
        setElement(term71226, 5, "          ");
        setElement(term71226, 6, "          ");
        setElement(term71226, 7, "          ");
        setElement(term71226, 8, "          ");
        setElement(term71226, 9, "          ");
        setElement(term71226, 10, "          ");
        setElement(term71226, 11, "          ");
        setElement(term71226, 12, "          ");
        setElement(term71226, 13, "          ");
        setElement(term71226, 14, "          ");
        setElement(term71226, 15, "          ");
        setElement(term71226, 16, "          ");
        setElement(term71226, 17, "          ");
        setElement(term71226, 18, "          ");
        setElement(term71226, 19, "          ");
        setElement(term71226, 20, "          ");
        setElement(term71226, 21, "          ");
        setElement(term71226, 22, "          ");
        setElement(term71226, 23, "          ");
        setElement(term71226, 24, "          ");
        setElement(term71226, 25, "          ");
        setElement(term71226, 26, "          ");
        setElement(term71226, 27, "          ");
        setElement(term71226, 28, "          ");
        setElement(term71226, 29, "          ");
        setElement(term71226, 30, "          ");
        setElement(term71226, 31, "          ");
        setElement(term71226, 32, "          ");
        setElement(term71226, 33, "          ");
        setElement(term71226, 34, "          ");
        setElement(term71226, 35, "          ");
        setElement(term71226, 36, "          ");
        setElement(term71226, 37, "          ");
        setElement(term71226, 38, "          ");
        setElement(term71226, 39, "          ");
        setElement(term71226, 40, "          ");
        setElement(term71226, 41, "          ");
        setElement(term71226, 42, "          ");
        setElement(term71226, 43, "          ");
        setElement(term71226, 44, "          ");
        setElement(term71226, 45, "          ");
        setElement(term71226, 46, "          ");
        setElement(term71226, 47, "          ");
        setElement(term71226, 48, "          ");
        setElement(term71226, 49, "          ");
        setElement(term71226, 50, "          ");
        setElement(term71226, 51, "          ");
        setElement(term71226, 52, "          ");
        setElement(term71226, 53, "          ");
        setElement(term71226, 54, "          ");
        setElement(term71226, 55, "          ");
        setElement(term71226, 56, "          ");
        setElement(term71226, 57, "          ");
        setElement(term71226, 58, "          ");
        setElement(term71226, 59, "          ");
        setElement(term71226, 60, "          ");
        setElement(term71226, 61, "          ");
        setElement(term71226, 62, "          ");
        setElement(term71226, 63, "          ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term71226;
        callMethod(klass, "format", argTypes, term73499, args);
    }

};


