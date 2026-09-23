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

public class Tokeniser_read_374258942205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term303996;

    public Tokeniser_read_374258942205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term304659 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term304658 = ((Class) term304659).getDeclaredField((String) "AfterAttributeName");
        ((Field) term304658).setAccessible(true);
        Object enum872 = ((Field) term304658).get((Object) null);
        term303996 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term304178 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term303996, term303996.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term303996, term303996.getClass(), "isEmitPending", false);
        setField(term303996, term303996.getClass(), "state", enum872);
        setIntField(term304178, term304178.getClass(), "pos", -2147483648);
        setIntField(term304178, term304178.getClass(), "length", -2147483647);
        setField(term303996, term303996.getClass(), "reader", term304178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term303996, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


