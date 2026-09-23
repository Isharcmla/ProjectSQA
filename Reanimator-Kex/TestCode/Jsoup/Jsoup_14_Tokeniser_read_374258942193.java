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

public class Tokeniser_read_374258942193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285635;

    public Tokeniser_read_374258942193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term286310 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term286309 = ((Class) term286310).getDeclaredField((String) "ScriptDataEscapedDash");
        ((Field) term286309).setAccessible(true);
        Object enum854 = ((Field) term286309).get((Object) null);
        term285635 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term285817 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term285635, term285635.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term285635, term285635.getClass(), "isEmitPending", false);
        setField(term285635, term285635.getClass(), "state", enum854);
        setIntField(term285817, term285817.getClass(), "pos", -2147483648);
        setIntField(term285817, term285817.getClass(), "length", -2147483647);
        setField(term285635, term285635.getClass(), "reader", term285817);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term285635, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


