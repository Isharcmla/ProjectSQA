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
import java.io.FileNotFoundException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Character;

public class CSVParser_parse_98170801915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term26;

    public CSVParser_parse_98170801915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10036 = Class.forName((String) "java.io.File$PathStatus");
        Field term10035 = ((Class) term10036).getDeclaredField((String) "INVALID");
        ((Field) term10035).setAccessible(true);
        Object enum25 = ((Field) term10035).get((Object) null);
        term1 = newInstance(Class.forName("java.io.File"));
        setField(term1, term1.getClass(), "path", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "status", enum25);
        setIntField(term1, term1.getClass(), "prefixLength", 568599855);
        setField(term1, term1.getClass(), "filePath", null);
        Character term28 = new Character('A');
        Class<? extends Object> term10179 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term10178 = ((Class) term10179).getDeclaredField((String) "ALL");
        ((Field) term10178).setAccessible(true);
        Object enum26 = ((Field) term10178).get((Object) null);
        Character term37 = new Character('E');
        Character term39 = new Character('B');
        term26 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term67 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term26, term26.getClass(), "delimiter", 'P');
        setField(term26, term26.getClass(), "quoteChar", term28);
        setField(term26, term26.getClass(), "quotePolicy", enum26);
        setField(term26, term26.getClass(), "commentStart", term37);
        setField(term26, term26.getClass(), "escape", term39);
        setBooleanField(term26, term26.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term26, term26.getClass(), "ignoreEmptyLines", false);
        setField(term26, term26.getClass(), "recordSeparator", "sjlJAEtRrb");
        setField(term26, term26.getClass(), "nullString", "MuLcgQHgqz");
        setElement(term67, 0, "xxtlPwDYFs");
        setElement(term67, 1, "jJCZpVmanW");
        setElement(term67, 2, "EGtDIRbSSb");
        setElement(term67, 3, "SzjVpOQTyS");
        setElement(term67, 4, "MjGYSRKTNF");
        setField(term26, term26.getClass(), "header", term67);
        setBooleanField(term26, term26.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term26;
        try {
            callMethod(klass, "parse", argTypes, null, args);
            assertTrue(false);
        }
        catch (FileNotFoundException e) {
        }

    }

};


