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
import java.util.ArrayList;

public class CSVFormat_format_2070435827251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129833;
     Object term126138;
     Object term133277;
     Object term133285;

    public CSVFormat_format_2070435827251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term130115 = new Character((char) 0);
        Character term129937 = new Character((char) 0);
        Character term129989 = new Character((char) 65535);
        Class<? extends Object> term133293 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term133292 = ((Class) term133293).getDeclaredField((String) "MINIMAL");
        ((Field) term133292).setAccessible(true);
        Object enum224 = ((Field) term133292).get((Object) null);
        term129833 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term126142 = (Object[]) newArray("java.lang.String", 0);
        setField(term129833, term129833.getClass(), "quoteChar", term130115);
        setCharField(term129833, term129833.getClass(), "delimiter", 'p');
        setField(term129833, term129833.getClass(), "escape", term129937);
        setField(term129833, term129833.getClass(), "commentStart", term129989);
        setField(term129833, term129833.getClass(), "header", term126142);
        setField(term129833, term129833.getClass(), "quotePolicy", enum224);
        ArrayList term130167 = new ArrayList();
        ArrayList term130219 = new ArrayList();
        term126138 = (Object[]) newArray("java.lang.Object", 16);
        setElement(term126138, 0, term130115);
        setElement(term126138, 1, term130167);
        setElement(term126138, 2, term130219);
        setElement(term126138, 3, term126142);
        Character term133278 = new Character((char) 0);
        Class<? extends Object> term133461 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term133460 = ((Class) term133461).getDeclaredField((String) "MINIMAL");
        ((Field) term133460).setAccessible(true);
        Object enum225 = ((Field) term133460).get((Object) null);
        Character term133282 = new Character((char) 65535);
        Character term133283 = new Character((char) 0);
        term133277 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term133284 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term133277, term133277.getClass(), "delimiter", 'p');
        setField(term133277, term133277.getClass(), "quoteChar", term133278);
        setField(term133277, term133277.getClass(), "quotePolicy", enum225);
        setField(term133277, term133277.getClass(), "commentStart", term133282);
        setField(term133277, term133277.getClass(), "escape", term133283);
        setBooleanField(term133277, term133277.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term133277, term133277.getClass(), "ignoreEmptyLines", false);
        setField(term133277, term133277.getClass(), "recordSeparator", null);
        setField(term133277, term133277.getClass(), "nullString", null);
        setField(term133277, term133277.getClass(), "header", term133284);
        setBooleanField(term133277, term133277.getClass(), "skipHeaderRecord", false);
        Character term133286 = new Character((char) 0);
        ArrayList term133287 = new ArrayList();
        ArrayList term133289 = new ArrayList();
        term133285 = (Object[]) newArray("java.lang.Object", 16);
        Object[] term133291 = (Object[]) newArray("java.lang.String", 0);
        setElement(term133285, 0, term133286);
        setElement(term133285, 1, term133287);
        setElement(term133285, 2, term133289);
        setElement(term133285, 3, term133291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term126138;
        Object retValue = callMethod(klass, "format", argTypes, term129833, args);
        assertTrue(recursiveEquals(term129833, term133277));
        assertTrue(recursiveEquals(term126138, term133285));
        assertTrue(recursiveEquals(retValue, "p[]p[]p[Ljava.lang.String;@63388927pppppppppppp"));
    }

};


