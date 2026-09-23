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

public class CSVParser_parse_185393230617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term918;
     Object term964;

    public CSVParser_parse_185393230617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term918 = newInstance(Class.forName("java.net.URL"));
        Object term962 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term918, term918.getClass(), "protocol", "http");
        setField(term918, term918.getClass(), "host", "www.oracle.com");
        setIntField(term918, term918.getClass(), "port", -1);
        setField(term918, term918.getClass(), "file", "");
        setField(term918, term918.getClass(), "query", null);
        setField(term918, term918.getClass(), "authority", "www.oracle.com");
        setField(term918, term918.getClass(), "path", "");
        setField(term918, term918.getClass(), "userInfo", null);
        setField(term918, term918.getClass(), "ref", null);
        setField(term918, term918.getClass(), "hostAddress", null);
        setField(term962, term962.getClass(), "proxy", null);
        setIntField(term962, term962.getClass(), "proxyPort", -1);
        setField(term918, term918.getClass(), "handler", term962);
        setField(term918, term918.getClass(), "tempState", null);
        Character term966 = new Character('D');
        Class<? extends Object> term144886 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term144885 = ((Class) term144886).getDeclaredField((String) "MINIMAL");
        ((Field) term144885).setAccessible(true);
        Object enum33 = ((Field) term144885).get((Object) null);
        Character term979 = new Character('s');
        Character term981 = new Character('j');
        term964 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term1010 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term964, term964.getClass(), "delimiter", 'T');
        setField(term964, term964.getClass(), "quoteChar", term966);
        setField(term964, term964.getClass(), "quotePolicy", enum33);
        setField(term964, term964.getClass(), "commentStart", term979);
        setField(term964, term964.getClass(), "escape", term981);
        setBooleanField(term964, term964.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term964, term964.getClass(), "ignoreEmptyHeaders", true);
        setBooleanField(term964, term964.getClass(), "ignoreEmptyLines", false);
        setField(term964, term964.getClass(), "recordSeparator", "aJlieCFVtF");
        setField(term964, term964.getClass(), "nullString", "ZiaGIbnzTs");
        setElement(term1010, 0, "tbcdzjIfER");
        setElement(term1010, 1, "HyxfbSQYBe");
        setElement(term1010, 2, "pCTimMblYc");
        setField(term964, term964.getClass(), "header", term1010);
        setBooleanField(term964, term964.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.net.URL");
        argTypes[1] = Class.forName("java.nio.charset.Charset");
        argTypes[2] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[3];
        args[0] = term918;
        args[1] = null;
        args[2] = term964;
        try {
            callMethod(klass, "parse", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


