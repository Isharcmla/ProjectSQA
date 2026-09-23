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
import java.lang.IllegalArgumentException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Character;
import java.lang.String;

public class CSVParser_parse_185393230624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2443;
     Object term2489;

    public CSVParser_parse_185393230624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2443 = newInstance(Class.forName("java.net.URL"));
        Object term2487 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term2443, term2443.getClass(), "protocol", "http");
        setField(term2443, term2443.getClass(), "host", "www.oracle.com");
        setIntField(term2443, term2443.getClass(), "port", -1);
        setField(term2443, term2443.getClass(), "file", "");
        setField(term2443, term2443.getClass(), "query", null);
        setField(term2443, term2443.getClass(), "authority", "www.oracle.com");
        setField(term2443, term2443.getClass(), "path", "");
        setField(term2443, term2443.getClass(), "userInfo", null);
        setField(term2443, term2443.getClass(), "ref", null);
        setField(term2443, term2443.getClass(), "hostAddress", null);
        setField(term2487, term2487.getClass(), "proxy", null);
        setIntField(term2487, term2487.getClass(), "proxyPort", -1);
        setField(term2443, term2443.getClass(), "handler", term2487);
        setField(term2443, term2443.getClass(), "tempState", null);
        Character term2491 = new Character('M');
        Character term2494 = new Character('L');
        Character term2645 = new Character('c');
        Class<? extends Object> term168881 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term168880 = ((Class) term168881).getDeclaredField((String) "ALL_NON_NULL");
        ((Field) term168880).setAccessible(true);
        Object enum42 = ((Field) term168880).get((Object) null);
        term2489 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term2496 = (Object[]) newArray("java.lang.String", 6);
        Object[] term2569 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term2489, term2489.getClass(), "allowMissingColumnNames", false);
        setField(term2489, term2489.getClass(), "commentMarker", term2491);
        setCharField(term2489, term2489.getClass(), "delimiter", 'u');
        setField(term2489, term2489.getClass(), "escapeCharacter", term2494);
        setElement(term2496, 0, "UiUYnPrcCi");
        setElement(term2496, 1, "UoYtihxVaS");
        setElement(term2496, 2, "JDswTTCZHV");
        setElement(term2496, 3, "onpbIeEKoi");
        setElement(term2496, 4, "YRHGsAkhxb");
        setElement(term2496, 5, "ffYhPOzlUs");
        setField(term2489, term2489.getClass(), "header", term2496);
        setElement(term2569, 0, "MLqYREekMl");
        setElement(term2569, 1, "ytSBIKXogI");
        setElement(term2569, 2, "nHXjMycHlU");
        setElement(term2569, 3, "ieCtQFdkii");
        setElement(term2569, 4, "dEnhdmILtU");
        setField(term2489, term2489.getClass(), "headerComments", term2569);
        setBooleanField(term2489, term2489.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term2489, term2489.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term2489, term2489.getClass(), "ignoreSurroundingSpaces", true);
        setField(term2489, term2489.getClass(), "nullString", "hoicvmsovO");
        setField(term2489, term2489.getClass(), "quoteCharacter", term2645);
        setField(term2489, term2489.getClass(), "quoteMode", enum42);
        setField(term2489, term2489.getClass(), "recordSeparator", "eqJfYWRaEL");
        setBooleanField(term2489, term2489.getClass(), "skipHeaderRecord", false);
        setBooleanField(term2489, term2489.getClass(), "trailingDelimiter", true);
        setBooleanField(term2489, term2489.getClass(), "trim", true);
        setBooleanField(term2489, term2489.getClass(), "autoFlush", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.net.URL");
        argTypes[1] = Class.forName("java.nio.charset.Charset");
        argTypes[2] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[3];
        args[0] = term2443;
        args[1] = null;
        args[2] = term2489;
        try {
            callMethod(klass, "parse", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


