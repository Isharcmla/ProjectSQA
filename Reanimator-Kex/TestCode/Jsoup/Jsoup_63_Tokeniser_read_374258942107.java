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

public class Tokeniser_read_374258942107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147662;

    public Tokeniser_read_374258942107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term148597 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term148596 = ((Class) term148597).getDeclaredField((String) "AfterAttributeValue_quoted");
        ((Field) term148596).setAccessible(true);
        Object enum429 = ((Field) term148596).get((Object) null);
        term147662 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term147844 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term147662, term147662.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term147662, term147662.getClass(), "isEmitPending", false);
        setField(term147662, term147662.getClass(), "state", enum429);
        setIntField(term147844, term147844.getClass(), "bufPos", -2147483648);
        setIntField(term147844, term147844.getClass(), "bufSplitPoint", -2147483648);
        setField(term147662, term147662.getClass(), "reader", term147844);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term147662, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


