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
     Object term916;
     Object term962;

    public CSVParser_parse_185393230617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term916 = newInstance(Class.forName("java.net.URL"));
        Object term960 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term916, term916.getClass(), "protocol", "http");
        setField(term916, term916.getClass(), "host", "www.oracle.com");
        setIntField(term916, term916.getClass(), "port", -1);
        setField(term916, term916.getClass(), "file", "");
        setField(term916, term916.getClass(), "query", null);
        setField(term916, term916.getClass(), "authority", "www.oracle.com");
        setField(term916, term916.getClass(), "path", "");
        setField(term916, term916.getClass(), "userInfo", null);
        setField(term916, term916.getClass(), "ref", null);
        setField(term916, term916.getClass(), "hostAddress", null);
        setField(term960, term960.getClass(), "proxy", null);
        setIntField(term960, term960.getClass(), "proxyPort", -1);
        setField(term916, term916.getClass(), "handler", term960);
        setField(term916, term916.getClass(), "tempState", null);
        Character term964 = new Character('D');
        Class<? extends Object> term12205 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term12204 = ((Class) term12205).getDeclaredField((String) "MINIMAL");
        ((Field) term12204).setAccessible(true);
        Object enum31 = ((Field) term12204).get((Object) null);
        Character term977 = new Character('s');
        Character term979 = new Character('j');
        term962 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term1007 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term962, term962.getClass(), "delimiter", 'T');
        setField(term962, term962.getClass(), "quoteChar", term964);
        setField(term962, term962.getClass(), "quotePolicy", enum31);
        setField(term962, term962.getClass(), "commentStart", term977);
        setField(term962, term962.getClass(), "escape", term979);
        setBooleanField(term962, term962.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term962, term962.getClass(), "ignoreEmptyLines", true);
        setField(term962, term962.getClass(), "recordSeparator", "aJlieCFVtF");
        setField(term962, term962.getClass(), "nullString", "ZiaGIbnzTs");
        setElement(term1007, 0, "tbcdzjIfER");
        setElement(term1007, 1, "HyxfbSQYBe");
        setElement(term1007, 2, "pCTimMblYc");
        setField(term962, term962.getClass(), "header", term1007);
        setBooleanField(term962, term962.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.net.URL");
        argTypes[1] = Class.forName("java.nio.charset.Charset");
        argTypes[2] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[3];
        args[0] = term916;
        args[1] = null;
        args[2] = term962;
        try {
            callMethod(klass, "parse", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


