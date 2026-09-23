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

public class Tokeniser_read_374258942213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316383;

    public Tokeniser_read_374258942213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term317192 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term317191 = ((Class) term317192).getDeclaredField((String) "AfterAttributeValue_quoted");
        ((Field) term317191).setAccessible(true);
        Object enum880 = ((Field) term317191).get((Object) null);
        term316383 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term316565 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term316383, term316383.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term316383, term316383.getClass(), "isEmitPending", false);
        setField(term316383, term316383.getClass(), "state", enum880);
        setIntField(term316565, term316565.getClass(), "pos", -2147483648);
        setIntField(term316565, term316565.getClass(), "length", -2147483648);
        setField(term316383, term316383.getClass(), "reader", term316565);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term316383, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


