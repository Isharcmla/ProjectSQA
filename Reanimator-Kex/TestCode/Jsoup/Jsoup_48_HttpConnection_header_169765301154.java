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
import java.lang.ClassCastException;
import static org.jsoup.helper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedHashMap;

public class HttpConnection_header_169765301154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1265259;

    public HttpConnection_header_169765301154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1265493 = newInstance(Class.forName("java.lang.Object"));
        Object term1265531 = newInstance(Class.forName("java.lang.Object"));
        LinkedHashMap term1265403 = new LinkedHashMap();
        ((LinkedHashMap) term1265403).put(term1265493, term1265493);
        ((LinkedHashMap) term1265403).put(term1265531, term1265531);
        ((LinkedHashMap) term1265403).put(term1265531, term1265531);
        ((LinkedHashMap) term1265403).put(term1265531, term1265531);
        ((LinkedHashMap) term1265403).put(term1265531, term1265531);
        ((LinkedHashMap) term1265403).put(term1265531, term1265531);
        ((LinkedHashMap) term1265403).put(term1265531, term1265531);
        ((LinkedHashMap) term1265403).put(term1265531, term1265531);
        ((LinkedHashMap) term1265403).put(term1265531, term1265531);
        ((LinkedHashMap) term1265403).put(term1265531, term1265531);
        ((LinkedHashMap) term1265403).put(term1265531, term1265531);
        ((LinkedHashMap) term1265403).put(term1265531, term1265531);
        ((LinkedHashMap) term1265403).put(term1265531, term1265531);
        ((LinkedHashMap) term1265403).put(term1265531, term1265531);
        ((LinkedHashMap) term1265403).put(term1265531, term1265531);
        ((LinkedHashMap) term1265403).put(term1265531, term1265531);
        ((LinkedHashMap) term1265403).put(term1265531, term1265531);
        term1265259 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        Object term1265343 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Request"));
        setField(term1265343, term1265343.getClass(), "headers", term1265403);
        setField(term1265259, term1265259.getClass(), "req", term1265343);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.HttpConnection");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@";
        args[1] = "";
        try {
            callMethod(klass, "header", argTypes, term1265259, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


