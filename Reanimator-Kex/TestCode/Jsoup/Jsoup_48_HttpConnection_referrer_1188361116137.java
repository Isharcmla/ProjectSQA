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

public class HttpConnection_referrer_1188361116137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1018632;

    public HttpConnection_referrer_1188361116137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1018866 = newInstance(Class.forName("java.lang.Object"));
        LinkedHashMap term1018776 = new LinkedHashMap();
        ((LinkedHashMap) term1018776).put(term1018866, term1018866);
        term1018632 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        Object term1018716 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Request"));
        setField(term1018716, term1018716.getClass(), "headers", term1018776);
        setField(term1018632, term1018632.getClass(), "req", term1018716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.HttpConnection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "referrer", argTypes, term1018632, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


