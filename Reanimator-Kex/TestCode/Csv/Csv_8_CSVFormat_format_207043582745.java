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
import java.lang.String;
import java.lang.Object;

public class CSVFormat_format_207043582745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term704;
     Object term787;
     Object term16409;
     Object term16427;

    public CSVFormat_format_207043582745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term706 = new Character('l');
        Class<? extends Object> term16433 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term16432 = ((Class) term16433).getDeclaredField((String) "MINIMAL");
        ((Field) term16432).setAccessible(true);
        Object enum43 = ((Field) term16432).get((Object) null);
        Character term719 = new Character('J');
        Character term721 = new Character('A');
        term704 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term749 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term704, term704.getClass(), "delimiter", 'j');
        setField(term704, term704.getClass(), "quoteChar", term706);
        setField(term704, term704.getClass(), "quotePolicy", enum43);
        setField(term704, term704.getClass(), "commentStart", term719);
        setField(term704, term704.getClass(), "escape", term721);
        setBooleanField(term704, term704.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term704, term704.getClass(), "ignoreEmptyLines", true);
        setField(term704, term704.getClass(), "recordSeparator", "LQFpaHEwXR");
        setField(term704, term704.getClass(), "nullString", "oVcInYnLWB");
        setElement(term749, 0, "aJlieCFVtF");
        setElement(term749, 1, "ZiaGIbnzTs");
        setElement(term749, 2, "tbcdzjIfER");
        setField(term704, term704.getClass(), "header", term749);
        setBooleanField(term704, term704.getClass(), "skipHeaderRecord", false);
        term787 = (Object[]) newArray("java.lang.Object", 4);
        Object term788 = newInstance(Class.forName("java.lang.Object"));
        Object term789 = newInstance(Class.forName("java.lang.Object"));
        Object term790 = newInstance(Class.forName("java.lang.Object"));
        Object term791 = newInstance(Class.forName("java.lang.Object"));
        setElement(term787, 0, term788);
        setElement(term787, 1, term789);
        setElement(term787, 2, term790);
        setElement(term787, 3, term791);
        Character term16410 = new Character('l');
        Class<? extends Object> term16651 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term16650 = ((Class) term16651).getDeclaredField((String) "MINIMAL");
        ((Field) term16650).setAccessible(true);
        Object enum44 = ((Field) term16650).get((Object) null);
        Character term16414 = new Character('J');
        Character term16415 = new Character('A');
        term16409 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term16420 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term16409, term16409.getClass(), "delimiter", 'j');
        setField(term16409, term16409.getClass(), "quoteChar", term16410);
        setField(term16409, term16409.getClass(), "quotePolicy", enum44);
        setField(term16409, term16409.getClass(), "commentStart", term16414);
        setField(term16409, term16409.getClass(), "escape", term16415);
        setBooleanField(term16409, term16409.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term16409, term16409.getClass(), "ignoreEmptyLines", true);
        setField(term16409, term16409.getClass(), "recordSeparator", "LQFpaHEwXR");
        setField(term16409, term16409.getClass(), "nullString", "oVcInYnLWB");
        setElement(term16420, 0, "aJlieCFVtF");
        setElement(term16420, 1, "ZiaGIbnzTs");
        setElement(term16420, 2, "tbcdzjIfER");
        setField(term16409, term16409.getClass(), "header", term16420);
        setBooleanField(term16409, term16409.getClass(), "skipHeaderRecord", false);
        term16427 = (Object[]) newArray("java.lang.Object", 4);
        Object term16428 = newInstance(Class.forName("java.lang.Object"));
        Object term16429 = newInstance(Class.forName("java.lang.Object"));
        Object term16430 = newInstance(Class.forName("java.lang.Object"));
        Object term16431 = newInstance(Class.forName("java.lang.Object"));
        setElement(term16427, 0, term16428);
        setElement(term16427, 1, term16429);
        setElement(term16427, 2, term16430);
        setElement(term16427, 3, term16431);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term787;
        Object retValue = callMethod(klass, "format", argTypes, term704, args);
        assertTrue(recursiveEquals(term704, term16409));
        assertTrue(recursiveEquals(term787, term16427));
        assertTrue(recursiveEquals(retValue, "ljava.llang.Object@114476b8ljljava.llang.Object@66dca3e2ljljava.llang.Object@25c1857aljljava.llang.Object@1212fadflLQFpaHEwXR"));
    }

};


