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
     Object term282554;

    public Tokeniser_read_374258942191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term283229 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term283228 = ((Class) term283229).getDeclaredField((String) "ScriptDataEscapedDash");
        ((Field) term283228).setAccessible(true);
        Object enum852 = ((Field) term283228).get((Object) null);
        term282554 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term282736 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term282554, term282554.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term282554, term282554.getClass(), "isEmitPending", false);
        setField(term282554, term282554.getClass(), "state", enum852);
        setIntField(term282736, term282736.getClass(), "pos", -2147483648);
        setIntField(term282736, term282736.getClass(), "length", -2147483647);
        setField(term282554, term282554.getClass(), "reader", term282736);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term282554, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


