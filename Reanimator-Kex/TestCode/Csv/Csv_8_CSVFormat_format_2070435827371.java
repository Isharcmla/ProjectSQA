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
import java.lang.StringBuilder;

public class CSVFormat_format_2070435827371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279977;
     Object term279528;

    public CSVFormat_format_2070435827371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term280029 = new Character((char) 64);
        Character term280081 = new Character((char) 16384);
        Character term280133 = new Character((char) 0);
        Class<? extends Object> term280295 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term280294 = ((Class) term280295).getDeclaredField((String) "ALL");
        ((Field) term280294).setAccessible(true);
        Object enum423 = ((Field) term280294).get((Object) null);
        term279977 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term279719 = (Object[]) newArray("java.lang.String", 0);
        setField(term279977, term279977.getClass(), "quoteChar", term280029);
        setCharField(term279977, term279977.getClass(), "delimiter", (char) 32765);
        setField(term279977, term279977.getClass(), "escape", term280081);
        setField(term279977, term279977.getClass(), "commentStart", term280133);
        setField(term279977, term279977.getClass(), "header", term279719);
        setField(term279977, term279977.getClass(), "quotePolicy", enum423);
        StringBuilder term280293 = new StringBuilder();
        term279528 = (Object[]) newArray("java.lang.String", 1);
        setElement(term279528, 0, term280293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term279528;
        callMethod(klass, "format", argTypes, term279977, args);
    }

};


