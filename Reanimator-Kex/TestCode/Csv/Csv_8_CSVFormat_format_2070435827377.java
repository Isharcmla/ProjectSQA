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

public class CSVFormat_format_2070435827377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285669;
     Object term285173;

    public CSVFormat_format_2070435827377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term285721 = new Character((char) 0);
        Character term285773 = new Character((char) 0);
        Character term285825 = new Character((char) 64);
        Class<? extends Object> term285927 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term285926 = ((Class) term285927).getDeclaredField((String) "ALL");
        ((Field) term285926).setAccessible(true);
        Object enum429 = ((Field) term285926).get((Object) null);
        term285669 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term285366 = (Object[]) newArray("java.lang.String", 0);
        setField(term285669, term285669.getClass(), "quoteChar", term285721);
        setCharField(term285669, term285669.getClass(), "delimiter", (char) 65468);
        setField(term285669, term285669.getClass(), "escape", term285773);
        setField(term285669, term285669.getClass(), "commentStart", term285825);
        setField(term285669, term285669.getClass(), "header", term285366);
        setField(term285669, term285669.getClass(), "quotePolicy", enum429);
        term285173 = (Object[]) newArray("java.lang.String", 1);
        int[] term285174 = (int[]) newIntArray(0);
        setElement(term285173, 0, term285174);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term285173;
        callMethod(klass, "format", argTypes, term285669, args);
    }

};


