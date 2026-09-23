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

public class Tokeniser_read_374258942297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263081;

    public Tokeniser_read_374258942297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term264358 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term264357 = ((Class) term264358).getDeclaredField((String) "BogusDoctype");
        ((Field) term264357).setAccessible(true);
        Object enum517 = ((Field) term264357).get((Object) null);
        term263081 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term263263 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term263331 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setBooleanField(term263081, term263081.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term263081, term263081.getClass(), "isEmitPending", false);
        setField(term263081, term263081.getClass(), "state", enum517);
        setIntField(term263263, term263263.getClass(), "bufPos", -2147483648);
        setIntField(term263263, term263263.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term263263, term263263.getClass(), "bufLength", -2147483648);
        setField(term263081, term263081.getClass(), "reader", term263263);
        setIntField(term263331, term263331.getClass(), "maxSize", 2147483647);
        setField(term263081, term263081.getClass(), "errors", term263331);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term263081, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


