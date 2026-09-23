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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Tokeniser_read_374258942246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369366;

    public Tokeniser_read_374258942246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term369550 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term369549 = ((Class) term369550).getDeclaredField((String) "TagName");
        ((Field) term369549).setAccessible(true);
        Object enum917 = ((Field) term369549).get((Object) null);
        term369366 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term369548 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term369366, term369366.getClass(), "selfClosingFlagAcknowledged", false);
        setBooleanField(term369366, term369366.getClass(), "trackErrors", false);
        setBooleanField(term369366, term369366.getClass(), "isEmitPending", false);
        setField(term369366, term369366.getClass(), "state", enum917);
        setIntField(term369548, term369548.getClass(), "pos", -2147483648);
        setIntField(term369548, term369548.getClass(), "length", -2147483648);
        setField(term369366, term369366.getClass(), "reader", term369548);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "read", argTypes, term369366, args);
    }

};


