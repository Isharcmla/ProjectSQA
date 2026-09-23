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
import static org.jsoup.helper.EqualityUtils.*;
import java.util.ArrayList;

public class HttpConnection_needsMultipart_1696544192105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56840;
     Object term56910;

    public HttpConnection_needsMultipart_1696544192105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term56892 = new ArrayList();
        term56840 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Request"));
        setField(term56840, term56840.getClass(), "data", term56892);
        ArrayList term56911 = new ArrayList();
        term56910 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Request"));
        setField(term56910, term56910.getClass(), "proxy", null);
        setIntField(term56910, term56910.getClass(), "timeoutMilliseconds", 0);
        setIntField(term56910, term56910.getClass(), "maxBodySizeBytes", 0);
        setBooleanField(term56910, term56910.getClass(), "followRedirects", false);
        setField(term56910, term56910.getClass(), "data", term56911);
        setField(term56910, term56910.getClass(), "body", null);
        setBooleanField(term56910, term56910.getClass(), "ignoreHttpErrors", false);
        setBooleanField(term56910, term56910.getClass(), "ignoreContentType", false);
        setField(term56910, term56910.getClass(), "parser", null);
        setBooleanField(term56910, term56910.getClass(), "parserDefined", false);
        setField(term56910, term56910.getClass(), "postDataCharset", null);
        setField(term56910, term56910.getClass(), "sslSocketFactory", null);
        setField(term56910, term56910.getClass(), "url", null);
        setField(term56910, term56910.getClass(), "method", null);
        setField(term56910, term56910.getClass(), "headers", null);
        setField(term56910, term56910.getClass(), "cookies", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.HttpConnection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.Connection$Request");
        Object[] args = new Object[1];
        args[0] = term56840;
        Object retValue = callMethod(klass, "needsMultipart", argTypes, null, args);
        assertTrue(recursiveEquals(term56840, term56910));
        assertTrue(recursiveEquals(retValue, false));
    }

};


