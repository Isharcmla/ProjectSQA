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
     Object term176139;

    public Tokeniser_read_374258942213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term176868 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term176867 = ((Class) term176868).getDeclaredField((String) "CharacterReferenceInRcdata");
        ((Field) term176867).setAccessible(true);
        Object enum355 = ((Field) term176867).get((Object) null);
        term176139 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term176321 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term176139, term176139.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term176139, term176139.getClass(), "isEmitPending", false);
        setField(term176139, term176139.getClass(), "state", enum355);
        setField(term176139, term176139.getClass(), "reader", term176321);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term176139, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


