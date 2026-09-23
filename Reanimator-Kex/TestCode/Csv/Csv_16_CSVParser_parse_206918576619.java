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

public class CSVParser_parse_206918576619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term26;

    public CSVParser_parse_206918576619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14619 = Class.forName((String) "java.io.File$PathStatus");
        Field term14618 = ((Class) term14619).getDeclaredField((String) "INVALID");
        ((Field) term14618).setAccessible(true);
        Object enum31 = ((Field) term14618).get((Object) null);
        term1 = newInstance(Class.forName("java.io.File"));
        setField(term1, term1.getClass(), "path", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "status", enum31);
        setIntField(term1, term1.getClass(), "prefixLength", 568599855);
        setField(term1, term1.getClass(), "filePath", null);
        Character term28 = new Character('P');
        Character term31 = new Character('E');
        Character term158 = new Character('B');
        Class<? extends Object> term14862 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term14861 = ((Class) term14862).getDeclaredField((String) "MINIMAL");
        ((Field) term14861).setAccessible(true);
        Object enum32 = ((Field) term14861).get((Object) null);
        term26 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term33 = (Object[]) newArray("java.lang.String", 5);
        Object[] term94 = (Object[]) newArray("java.lang.String", 4);
        setBooleanField(term26, term26.getClass(), "allowMissingColumnNames", false);
        setField(term26, term26.getClass(), "commentMarker", term28);
        setCharField(term26, term26.getClass(), "delimiter", 'A');
        setField(term26, term26.getClass(), "escapeCharacter", term31);
        setElement(term33, 0, "sjlJAEtRrb");
        setElement(term33, 1, "MuLcgQHgqz");
        setElement(term33, 2, "xxtlPwDYFs");
        setElement(term33, 3, "jJCZpVmanW");
        setElement(term33, 4, "EGtDIRbSSb");
        setField(term26, term26.getClass(), "header", term33);
        setElement(term94, 0, "SzjVpOQTyS");
        setElement(term94, 1, "MjGYSRKTNF");
        setElement(term94, 2, "hRNSzYYIrc");
        setElement(term94, 3, "RMFIsYGgne");
        setField(term26, term26.getClass(), "headerComments", term94);
        setBooleanField(term26, term26.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term26, term26.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term26, term26.getClass(), "ignoreSurroundingSpaces", false);
        setField(term26, term26.getClass(), "nullString", "NRdvgJlhkX");
        setField(term26, term26.getClass(), "quoteCharacter", term158);
        setField(term26, term26.getClass(), "quoteMode", enum32);
        setField(term26, term26.getClass(), "recordSeparator", "uuaPigETmJ");
        setBooleanField(term26, term26.getClass(), "skipHeaderRecord", true);
        setBooleanField(term26, term26.getClass(), "trailingDelimiter", true);
        setBooleanField(term26, term26.getClass(), "trim", true);
        setBooleanField(term26, term26.getClass(), "autoFlush", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.nio.charset.Charset");
        argTypes[2] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[3];
        args[0] = term1;
        args[1] = null;
        args[2] = term26;
        try {
            callMethod(klass, "parse", argTypes, null, args);
            assertTrue(false);
        }
        catch (FileNotFoundException e) {
        }

    }

};


