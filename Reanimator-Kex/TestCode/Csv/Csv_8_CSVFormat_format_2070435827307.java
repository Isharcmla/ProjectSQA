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

public class CSVFormat_format_2070435827307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177005;
     Object term176210;

    public CSVFormat_format_2070435827307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term177057 = new Character((char) 32703);
        Character term177109 = new Character((char) 24575);
        Character term177161 = new Character((char) 32768);
        Class<? extends Object> term177263 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term177262 = ((Class) term177263).getDeclaredField((String) "NONE");
        ((Field) term177262).setAccessible(true);
        Object enum320 = ((Field) term177262).get((Object) null);
        term177005 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term176529 = (Object[]) newArray("java.lang.String", 0);
        setField(term177005, term177005.getClass(), "quoteChar", term177057);
        setCharField(term177005, term177005.getClass(), "delimiter", (char) 0);
        setField(term177005, term177005.getClass(), "escape", term177109);
        setField(term177005, term177005.getClass(), "commentStart", term177161);
        setField(term177005, term177005.getClass(), "header", term176529);
        setField(term177005, term177005.getClass(), "quotePolicy", enum320);
        term176210 = (Object[]) newArray("java.lang.String", 1);
        int[] term176211 = (int[]) newIntArray(0);
        setElement(term176210, 0, term176211);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term176210;
        callMethod(klass, "format", argTypes, term177005, args);
    }

};


