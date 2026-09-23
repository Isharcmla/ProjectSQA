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

public class Tokeniser_read_374258942427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term418714;

    public Tokeniser_read_374258942427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term419410 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term419409 = ((Class) term419410).getDeclaredField((String) "AttributeValue_doubleQuoted");
        ((Field) term419409).setAccessible(true);
        Object enum613 = ((Field) term419409).get((Object) null);
        term418714 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term418896 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term418714, term418714.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term418714, term418714.getClass(), "isEmitPending", false);
        setField(term418714, term418714.getClass(), "state", enum613);
        setIntField(term418896, term418896.getClass(), "bufPos", -2147483648);
        setIntField(term418896, term418896.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term418896, term418896.getClass(), "bufLength", -2147483647);
        setField(term418714, term418714.getClass(), "reader", term418896);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term418714, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


