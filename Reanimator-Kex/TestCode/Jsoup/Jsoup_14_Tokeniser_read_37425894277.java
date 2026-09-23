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

public class Tokeniser_read_37425894277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189644;

    public Tokeniser_read_37425894277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term190931 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term190930 = ((Class) term190931).getDeclaredField((String) "AfterAttributeValue_quoted");
        ((Field) term190930).setAccessible(true);
        Object enum759 = ((Field) term190930).get((Object) null);
        term189644 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term189826 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term189644, term189644.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term189644, term189644.getClass(), "isEmitPending", false);
        setField(term189644, term189644.getClass(), "state", enum759);
        setIntField(term189826, term189826.getClass(), "pos", -2147483648);
        setIntField(term189826, term189826.getClass(), "length", -2147483648);
        setField(term189644, term189644.getClass(), "reader", term189826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term189644, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


