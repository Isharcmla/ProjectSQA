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

public class Tokeniser_read_374258942131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118427;

    public Tokeniser_read_374258942131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term119078 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term119077 = ((Class) term119078).getDeclaredField((String) "BeforeDoctypeName");
        ((Field) term119077).setAccessible(true);
        Object enum299 = ((Field) term119077).get((Object) null);
        term118427 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term118495 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setBooleanField(term118427, term118427.getClass(), "selfClosingFlagAcknowledged", false);
        setIntField(term118495, term118495.getClass(), "maxSize", 2147483647);
        setField(term118427, term118427.getClass(), "errors", term118495);
        setBooleanField(term118427, term118427.getClass(), "isEmitPending", false);
        setField(term118427, term118427.getClass(), "state", enum299);
        setField(term118427, term118427.getClass(), "reader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term118427, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


