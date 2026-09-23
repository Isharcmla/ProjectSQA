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

public class Tokeniser_read_374258942259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228378;

    public Tokeniser_read_374258942259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term229107 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term229106 = ((Class) term229107).getDeclaredField((String) "CharacterReferenceInRcdata");
        ((Field) term229106).setAccessible(true);
        Object enum391 = ((Field) term229106).get((Object) null);
        term228378 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term228560 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term228378, term228378.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term228378, term228378.getClass(), "isEmitPending", false);
        setField(term228378, term228378.getClass(), "state", enum391);
        setField(term228378, term228378.getClass(), "reader", term228560);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term228378, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


