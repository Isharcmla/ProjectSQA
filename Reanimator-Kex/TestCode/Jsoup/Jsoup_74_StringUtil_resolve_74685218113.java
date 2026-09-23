package org.jsoup.helper;

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
import static org.jsoup.helper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class StringUtil_resolve_74685218113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term489;

    public StringUtil_resolve_74685218113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term489 = newInstance(Class.forName("java.net.URL"));
        Object term533 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term489, term489.getClass(), "protocol", "http");
        setField(term489, term489.getClass(), "host", "www.oracle.com");
        setIntField(term489, term489.getClass(), "port", -1);
        setField(term489, term489.getClass(), "file", "");
        setField(term489, term489.getClass(), "query", null);
        setField(term489, term489.getClass(), "authority", "www.oracle.com");
        setField(term489, term489.getClass(), "path", "");
        setField(term489, term489.getClass(), "userInfo", null);
        setField(term489, term489.getClass(), "ref", null);
        setField(term489, term489.getClass(), "hostAddress", null);
        setField(term533, term533.getClass(), "proxy", null);
        setIntField(term533, term533.getClass(), "proxyPort", -1);
        setField(term489, term489.getClass(), "handler", term533);
        setField(term489, term489.getClass(), "tempState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.StringUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.net.URL");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term489;
        args[1] = "hNxWaHcfhY";
        callMethod(klass, "resolve", argTypes, null, args);
    }

};


