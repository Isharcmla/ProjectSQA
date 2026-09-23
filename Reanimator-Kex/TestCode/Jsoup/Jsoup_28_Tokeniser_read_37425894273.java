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

public class Tokeniser_read_37425894273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86824;

    public Tokeniser_read_37425894273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term87475 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term87474 = ((Class) term87475).getDeclaredField((String) "BeforeDoctypeName");
        ((Field) term87474).setAccessible(true);
        Object enum279 = ((Field) term87474).get((Object) null);
        term86824 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term86892 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setBooleanField(term86824, term86824.getClass(), "selfClosingFlagAcknowledged", false);
        setIntField(term86892, term86892.getClass(), "maxSize", 2147483647);
        setField(term86824, term86824.getClass(), "errors", term86892);
        setBooleanField(term86824, term86824.getClass(), "isEmitPending", false);
        setField(term86824, term86824.getClass(), "state", enum279);
        setField(term86824, term86824.getClass(), "reader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term86824, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


