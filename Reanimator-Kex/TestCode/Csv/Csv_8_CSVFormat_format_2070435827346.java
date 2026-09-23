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
import java.lang.StringBuffer;

public class CSVFormat_format_2070435827346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232507;
     Object term229393;
     Object term234434;
     Object term234442;

    public CSVFormat_format_2070435827346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term232559 = new Character((char) 57343);
        Character term232611 = new Character((char) 0);
        Character term232663 = new Character((char) 8192);
        Class<? extends Object> term234452 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term234451 = ((Class) term234452).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term234451).setAccessible(true);
        Object enum380 = ((Field) term234451).get((Object) null);
        term232507 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term229490 = (Object[]) newArray("java.lang.String", 0);
        setField(term232507, term232507.getClass(), "quoteChar", term232559);
        setCharField(term232507, term232507.getClass(), "delimiter", 'd');
        setField(term232507, term232507.getClass(), "escape", term232611);
        setField(term232507, term232507.getClass(), "commentStart", term232663);
        setField(term232507, term232507.getClass(), "header", term229490);
        setField(term232507, term232507.getClass(), "quotePolicy", enum380);
        StringBuffer term232859 = new StringBuffer();
        term229393 = (Object[]) newArray("java.lang.Object", 3);
        setElement(term229393, 0, "d    \uFFFF                   ");
        setElement(term229393, 1, term232859);
        setElement(term229393, 2, "d    \uFFFF                   ");
        Character term234435 = new Character((char) 57343);
        Class<? extends Object> term234636 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term234635 = ((Class) term234636).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term234635).setAccessible(true);
        Object enum381 = ((Field) term234635).get((Object) null);
        Character term234439 = new Character((char) 8192);
        Character term234440 = new Character((char) 0);
        term234434 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term234441 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term234434, term234434.getClass(), "delimiter", 'd');
        setField(term234434, term234434.getClass(), "quoteChar", term234435);
        setField(term234434, term234434.getClass(), "quotePolicy", enum381);
        setField(term234434, term234434.getClass(), "commentStart", term234439);
        setField(term234434, term234434.getClass(), "escape", term234440);
        setBooleanField(term234434, term234434.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term234434, term234434.getClass(), "ignoreEmptyLines", false);
        setField(term234434, term234434.getClass(), "recordSeparator", null);
        setField(term234434, term234434.getClass(), "nullString", null);
        setField(term234434, term234434.getClass(), "header", term234441);
        setBooleanField(term234434, term234434.getClass(), "skipHeaderRecord", false);
        term234442 = (Object[]) newArray("java.lang.Object", 3);
        Object term234445 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term234448 = (byte[]) newByteArray(16);
        setElement(term234442, 0, "d         \uFFFF\uFFFF                                      ");
        setField(term234445, term234445.getClass(), "toStringCache", "");
        setField(term234445, term234445.getClass(), "value", term234448);
        setByteField(term234445, term234445.getClass(), "coder", (byte) 0);
        setIntField(term234445, term234445.getClass(), "count", 0);
        setElement(term234442, 1, term234445);
        setElement(term234442, 2, "d         \uFFFF\uFFFF                                      ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term229393;
        Object retValue = callMethod(klass, "format", argTypes, term232507, args);
        assertTrue(recursiveEquals(term232507, term234434));
        assertTrue(recursiveEquals(term229393, term234442));
        assertTrue(recursiveEquals(retValue, "\uFFFF\uFFDFd         \uFFFF\uFFFF                                      \uFFFF\uFFDFd \uFFFF\uFFDF\uFFFF\uFFDFd \uFFFF\uFFDFd         \uFFFF\uFFFF                                      \uFFFF\uFFDF"));
    }

};


