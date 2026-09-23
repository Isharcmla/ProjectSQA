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
import static org.apache.commons.csv.EqualityUtils.*;
import java.lang.Character;
import java.lang.Object;
import java.lang.String;

public class CSVFormat_format_2070435827181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82700;
     Object term79245;
     Object term84214;
     Object term84222;

    public CSVFormat_format_2070435827181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term82752 = new Character((char) 4552);
        Character term82804 = new Character((char) 37415);
        Character term82982 = new Character((char) 19928);
        Class<? extends Object> term84227 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term84226 = ((Class) term84227).getDeclaredField((String) "NONE");
        ((Field) term84226).setAccessible(true);
        Object enum163 = ((Field) term84226).get((Object) null);
        term82700 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term79874 = (Object[]) newArray("java.lang.String", 0);
        setField(term82700, term82700.getClass(), "quoteChar", term82752);
        setCharField(term82700, term82700.getClass(), "delimiter", 'c');
        setField(term82700, term82700.getClass(), "escape", term82804);
        setField(term82700, term82700.getClass(), "commentStart", term82982);
        setField(term82700, term82700.getClass(), "header", term79874);
        setField(term82700, term82700.getClass(), "quotePolicy", enum163);
        term79245 = (Object[]) newArray("java.lang.Object", 3);
        byte[] term79247 = (byte[]) newByteArray(18);
        byte[] term79266 = (byte[]) newByteArray(25);
        setElement(term79245, 0, term82982);
        setByteElement(term79247, 0, (byte) 99);
        setByteElement(term79247, 5, (byte) -56);
        setElement(term79245, 1, term79247);
        setByteElement(term79266, 0, (byte) 99);
        setByteElement(term79266, 5, (byte) -56);
        setByteElement(term79266, 12, (byte) 49);
        setElement(term79245, 2, term79266);
        Character term84215 = new Character((char) 4552);
        Class<? extends Object> term84429 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term84428 = ((Class) term84429).getDeclaredField((String) "NONE");
        ((Field) term84428).setAccessible(true);
        Object enum164 = ((Field) term84428).get((Object) null);
        Character term84219 = new Character((char) 19928);
        Character term84220 = new Character((char) 37415);
        term84214 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term84221 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term84214, term84214.getClass(), "delimiter", 'c');
        setField(term84214, term84214.getClass(), "quoteChar", term84215);
        setField(term84214, term84214.getClass(), "quotePolicy", enum164);
        setField(term84214, term84214.getClass(), "commentStart", term84219);
        setField(term84214, term84214.getClass(), "escape", term84220);
        setBooleanField(term84214, term84214.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term84214, term84214.getClass(), "ignoreEmptyLines", false);
        setField(term84214, term84214.getClass(), "recordSeparator", null);
        setField(term84214, term84214.getClass(), "nullString", null);
        setField(term84214, term84214.getClass(), "header", term84221);
        setBooleanField(term84214, term84214.getClass(), "skipHeaderRecord", false);
        Character term84223 = new Character((char) 19928);
        term84222 = (Object[]) newArray("java.lang.Object", 3);
        byte[] term84224 = (byte[]) newByteArray(18);
        byte[] term84225 = (byte[]) newByteArray(25);
        setElement(term84222, 0, term84223);
        setByteElement(term84224, 0, (byte) 99);
        setByteElement(term84224, 5, (byte) -56);
        setElement(term84222, 1, term84224);
        setByteElement(term84225, 0, (byte) 99);
        setByteElement(term84225, 5, (byte) -56);
        setByteElement(term84225, 12, (byte) 49);
        setElement(term84222, 2, term84225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term79245;
        Object retValue = callMethod(klass, "format", argTypes, term82700, args);
        assertTrue(recursiveEquals(term82700, term84214));
        assertTrue(recursiveEquals(term79245, term84222));
        assertTrue(recursiveEquals(retValue, "\uFFD8Mc [ B @ 1 8 3 1 5 7 b 7 c [ B @ 7 0 5 a 9 a b 4 "));
    }

};


