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

public class Tokeniser_read_374258942167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252008;

    public Tokeniser_read_374258942167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term252738 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term252737 = ((Class) term252738).getDeclaredField((String) "CharacterReferenceInRcdata");
        ((Field) term252737).setAccessible(true);
        Object enum820 = ((Field) term252737).get((Object) null);
        term252008 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term252190 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term252008, term252008.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term252008, term252008.getClass(), "isEmitPending", false);
        setField(term252008, term252008.getClass(), "state", enum820);
        setField(term252008, term252008.getClass(), "reader", term252190);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term252008, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


