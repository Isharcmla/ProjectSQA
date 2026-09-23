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

public class CSVFormat_format_2070435827383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297142;
     Object term294667;
     Object term298188;
     Object term298196;

    public CSVFormat_format_2070435827383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term297194 = new Character((char) 0);
        Character term297462 = new Character((char) 0);
        Character term297298 = new Character((char) 64);
        Class<? extends Object> term298204 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term298203 = ((Class) term298204).getDeclaredField((String) "ALL");
        ((Field) term298203).setAccessible(true);
        Object enum436 = ((Field) term298203).get((Object) null);
        term297142 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term294963 = (Object[]) newArray("java.lang.String", 0);
        setField(term297142, term297142.getClass(), "quoteChar", term297194);
        setCharField(term297142, term297142.getClass(), "delimiter", 'h');
        setField(term297142, term297142.getClass(), "escape", term297462);
        setField(term297142, term297142.getClass(), "commentStart", term297298);
        setField(term297142, term297142.getClass(), "header", term294963);
        setField(term297142, term297142.getClass(), "quotePolicy", enum436);
        term294667 = (Object[]) newArray("java.lang.Object", 3);
        setElement(term294667, 0, "h@");
        setElement(term294667, 1, term297462);
        setElement(term294667, 2, enum436);
        Character term298189 = new Character((char) 0);
        Class<? extends Object> term298362 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term298361 = ((Class) term298362).getDeclaredField((String) "ALL");
        ((Field) term298361).setAccessible(true);
        Object enum437 = ((Field) term298361).get((Object) null);
        Character term298193 = new Character((char) 64);
        Character term298194 = new Character((char) 0);
        term298188 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term298195 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term298188, term298188.getClass(), "delimiter", 'h');
        setField(term298188, term298188.getClass(), "quoteChar", term298189);
        setField(term298188, term298188.getClass(), "quotePolicy", enum437);
        setField(term298188, term298188.getClass(), "commentStart", term298193);
        setField(term298188, term298188.getClass(), "escape", term298194);
        setBooleanField(term298188, term298188.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term298188, term298188.getClass(), "ignoreEmptyLines", false);
        setField(term298188, term298188.getClass(), "recordSeparator", null);
        setField(term298188, term298188.getClass(), "nullString", null);
        setField(term298188, term298188.getClass(), "header", term298195);
        setBooleanField(term298188, term298188.getClass(), "skipHeaderRecord", false);
        Character term298199 = new Character((char) 0);
        Class<? extends Object> term298520 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term298519 = ((Class) term298520).getDeclaredField((String) "ALL");
        ((Field) term298519).setAccessible(true);
        Object enum438 = ((Field) term298519).get((Object) null);
        term298196 = (Object[]) newArray("java.lang.Object", 3);
        setElement(term298196, 0, "h@");
        setElement(term298196, 1, term298199);
        setElement(term298196, 2, enum438);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term294667;
        Object retValue = callMethod(klass, "format", argTypes, term297142, args);
        assertTrue(recursiveEquals(term297142, term298188));
        assertTrue(recursiveEquals(term294667, term298196));
        assertTrue(recursiveEquals(retValue, "h@ h    h ALL"));
    }

};


