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
import java.lang.IllegalArgumentException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Tokeniser_read_374258942379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356319;

    public Tokeniser_read_374258942379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term357076 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term357075 = ((Class) term357076).getDeclaredField((String) "AfterAttributeValue_quoted");
        ((Field) term357075).setAccessible(true);
        Object enum576 = ((Field) term357075).get((Object) null);
        term356319 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term356501 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term356551 = newInstance(Class.forName("java.io.PushbackReader"));
        setBooleanField(term356319, term356319.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term356319, term356319.getClass(), "isEmitPending", false);
        setField(term356319, term356319.getClass(), "state", enum576);
        setIntField(term356501, term356501.getClass(), "bufPos", -2147483648);
        setIntField(term356501, term356501.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term356501, term356501.getClass(), "readerPos", 0);
        setField(term356501, term356501.getClass(), "reader", term356551);
        setField(term356319, term356319.getClass(), "reader", term356501);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term356319, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


