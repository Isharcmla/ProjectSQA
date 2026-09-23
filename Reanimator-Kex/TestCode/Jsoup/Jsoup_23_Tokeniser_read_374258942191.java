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
import java.lang.String;
import java.lang.Object;

public class Tokeniser_read_374258942191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154751;

    public Tokeniser_read_374258942191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term155335 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term155334 = ((Class) term155335).getDeclaredField((String) "RcdataLessthanSign");
        ((Field) term155334).setAccessible(true);
        Object enum339 = ((Field) term155334).get((Object) null);
        term154751 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term154751, term154751.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term154751, term154751.getClass(), "isEmitPending", false);
        setField(term154751, term154751.getClass(), "state", enum339);
        setField(term154751, term154751.getClass(), "reader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term154751, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


