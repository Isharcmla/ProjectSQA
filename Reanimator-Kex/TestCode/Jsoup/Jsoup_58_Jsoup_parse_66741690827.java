package org.jsoup;

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
import static org.jsoup.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class Jsoup_parse_66741690827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term749;
     Object term795;

    public Jsoup_parse_66741690827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term749 = newInstance(Class.forName("java.net.URL"));
        Object term793 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term749, term749.getClass(), "protocol", "http");
        setField(term749, term749.getClass(), "host", "www.oracle.com");
        setIntField(term749, term749.getClass(), "port", -1);
        setField(term749, term749.getClass(), "file", "");
        setField(term749, term749.getClass(), "query", null);
        setField(term749, term749.getClass(), "authority", "www.oracle.com");
        setField(term749, term749.getClass(), "path", "");
        setField(term749, term749.getClass(), "userInfo", null);
        setField(term749, term749.getClass(), "ref", null);
        setField(term749, term749.getClass(), "hostAddress", null);
        setField(term793, term793.getClass(), "proxy", null);
        setIntField(term793, term793.getClass(), "proxyPort", -1);
        setField(term749, term749.getClass(), "handler", term793);
        setField(term749, term749.getClass(), "tempState", null);
        term795 = new Integer(-1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.Jsoup");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.net.URL");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term749;
        args[1] = term795;
        try {
            callMethod(klass, "parse", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


