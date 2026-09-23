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

public class Tokeniser_read_374258942323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284964;

    public Tokeniser_read_374258942323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term285643 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term285642 = ((Class) term285643).getDeclaredField((String) "BogusComment");
        ((Field) term285642).setAccessible(true);
        Object enum533 = ((Field) term285642).get((Object) null);
        term284964 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term285146 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term284673 = (char[]) newCharArray(0);
        setBooleanField(term284964, term284964.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term284964, term284964.getClass(), "isEmitPending", false);
        setField(term284964, term284964.getClass(), "state", enum533);
        setIntField(term285146, term285146.getClass(), "bufPos", -2147483648);
        setIntField(term285146, term285146.getClass(), "bufLength", -2147483647);
        setField(term285146, term285146.getClass(), "charBuf", term284673);
        setField(term284964, term284964.getClass(), "reader", term285146);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term284964, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


