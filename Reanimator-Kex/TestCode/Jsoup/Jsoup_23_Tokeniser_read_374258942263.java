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

public class Tokeniser_read_374258942263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235088;

    public Tokeniser_read_374258942263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term235751 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term235750 = ((Class) term235751).getDeclaredField((String) "AfterAttributeName");
        ((Field) term235750).setAccessible(true);
        Object enum396 = ((Field) term235750).get((Object) null);
        term235088 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term235270 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term235088, term235088.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term235088, term235088.getClass(), "isEmitPending", false);
        setField(term235088, term235088.getClass(), "state", enum396);
        setIntField(term235270, term235270.getClass(), "pos", -2147483648);
        setIntField(term235270, term235270.getClass(), "length", -2147483647);
        setField(term235088, term235088.getClass(), "reader", term235270);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term235088, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


