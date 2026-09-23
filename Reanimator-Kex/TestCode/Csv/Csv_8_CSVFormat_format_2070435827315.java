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

public class CSVFormat_format_2070435827315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195644;
     Object term194452;

    public CSVFormat_format_2070435827315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term195696 = new Character((char) 2048);
        Character term195748 = new Character((char) 1024);
        Character term195800 = new Character((char) 0);
        Class<? extends Object> term195902 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term195901 = ((Class) term195902).getDeclaredField((String) "ALL");
        ((Field) term195901).setAccessible(true);
        Object enum334 = ((Field) term195901).get((Object) null);
        term195644 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term194813 = (Object[]) newArray("java.lang.String", 0);
        setField(term195644, term195644.getClass(), "quoteChar", term195696);
        setCharField(term195644, term195644.getClass(), "delimiter", (char) 64431);
        setField(term195644, term195644.getClass(), "escape", term195748);
        setField(term195644, term195644.getClass(), "commentStart", term195800);
        setField(term195644, term195644.getClass(), "header", term194813);
        setField(term195644, term195644.getClass(), "quotePolicy", enum334);
        term194452 = (Object[]) newArray("java.lang.String", 2);
        int[] term194453 = (int[]) newIntArray(32);
        setIntElement(term194453, 0, 4);
        setElement(term194452, 0, term194453);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term194452;
        callMethod(klass, "format", argTypes, term195644, args);
    }

};


