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

public class Tokeniser_read_374258942123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217854;

    public Tokeniser_read_374258942123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term218698 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term218697 = ((Class) term218698).getDeclaredField((String) "DoctypeSystemIdentifier_singleQuoted");
        ((Field) term218697).setAccessible(true);
        Object enum787 = ((Field) term218697).get((Object) null);
        term217854 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term218036 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term217854, term217854.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term217854, term217854.getClass(), "isEmitPending", false);
        setField(term217854, term217854.getClass(), "state", enum787);
        setIntField(term218036, term218036.getClass(), "pos", -2147483648);
        setIntField(term218036, term218036.getClass(), "length", -2147483648);
        setField(term217854, term217854.getClass(), "reader", term218036);
        setBooleanField(term217854, term217854.getClass(), "trackErrors", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term217854, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


