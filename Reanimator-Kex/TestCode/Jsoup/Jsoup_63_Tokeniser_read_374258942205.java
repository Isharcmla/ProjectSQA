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

public class Tokeniser_read_374258942205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202479;

    public Tokeniser_read_374258942205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term203093 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term203092 = ((Class) term203093).getDeclaredField((String) "Data");
        ((Field) term203092).setAccessible(true);
        Object enum471 = ((Field) term203092).get((Object) null);
        term202479 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term202547 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setBooleanField(term202479, term202479.getClass(), "selfClosingFlagAcknowledged", false);
        setIntField(term202547, term202547.getClass(), "maxSize", 2147483647);
        setField(term202479, term202479.getClass(), "errors", term202547);
        setBooleanField(term202479, term202479.getClass(), "isEmitPending", false);
        setField(term202479, term202479.getClass(), "state", enum471);
        setField(term202479, term202479.getClass(), "reader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term202479, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


