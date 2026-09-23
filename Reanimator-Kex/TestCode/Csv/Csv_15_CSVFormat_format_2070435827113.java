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

public class CSVFormat_format_2070435827113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75664;

    public CSVFormat_format_2070435827113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term75716 = new Character((char) 0);
        term75664 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term75137 = (Object[]) newArray("java.lang.String", 0);
        setField(term75664, term75664.getClass(), "headerComments", term75137);
        setField(term75664, term75664.getClass(), "commentMarker", term75716);
        setBooleanField(term75664, term75664.getClass(), "trailingDelimiter", true);
        setCharField(term75664, term75664.getClass(), "delimiter", (char) 0);
        setField(term75664, term75664.getClass(), "recordSeparator", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "format", argTypes, term75664, args);
    }

};


