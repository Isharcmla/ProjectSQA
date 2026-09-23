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

public class Tokeniser_read_374258942183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143701;

    public Tokeniser_read_374258942183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term144401 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term144400 = ((Class) term144401).getDeclaredField((String) "DoctypeName");
        ((Field) term144400).setAccessible(true);
        Object enum331 = ((Field) term144400).get((Object) null);
        term143701 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term143769 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term143951 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term143701, term143701.getClass(), "selfClosingFlagAcknowledged", false);
        setIntField(term143769, term143769.getClass(), "maxSize", 2147483647);
        setField(term143701, term143701.getClass(), "errors", term143769);
        setBooleanField(term143701, term143701.getClass(), "isEmitPending", false);
        setField(term143701, term143701.getClass(), "state", enum331);
        setIntField(term143951, term143951.getClass(), "pos", -2147483648);
        setIntField(term143951, term143951.getClass(), "length", -2147483647);
        setField(term143951, term143951.getClass(), "input", null);
        setField(term143701, term143701.getClass(), "reader", term143951);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term143701, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


