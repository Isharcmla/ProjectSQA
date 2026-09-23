package org.jsoup.parser;

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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Tokeniser_read_374258942107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104291;

    public Tokeniser_read_374258942107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term104942 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term104941 = ((Class) term104942).getDeclaredField((String) "BeforeDoctypeName");
        ((Field) term104941).setAccessible(true);
        Object enum294 = ((Field) term104941).get((Object) null);
        term104291 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term104359 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setBooleanField(term104291, term104291.getClass(), "selfClosingFlagAcknowledged", false);
        setIntField(term104359, term104359.getClass(), "maxSize", 2147483647);
        setField(term104291, term104291.getClass(), "errors", term104359);
        setBooleanField(term104291, term104291.getClass(), "isEmitPending", false);
        setField(term104291, term104291.getClass(), "state", enum294);
        setField(term104291, term104291.getClass(), "reader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term104291, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


