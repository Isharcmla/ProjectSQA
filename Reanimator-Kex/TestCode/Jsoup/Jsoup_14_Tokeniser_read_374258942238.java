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

public class Tokeniser_read_374258942238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term353081;

    public Tokeniser_read_374258942238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term353265 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term353264 = ((Class) term353265).getDeclaredField((String) "DoctypeSystemIdentifier_doubleQuoted");
        ((Field) term353264).setAccessible(true);
        Object enum911 = ((Field) term353264).get((Object) null);
        term353081 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term353263 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term353081, term353081.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term353081, term353081.getClass(), "isEmitPending", false);
        setField(term353081, term353081.getClass(), "state", enum911);
        setIntField(term353263, term353263.getClass(), "pos", -2147483648);
        setIntField(term353263, term353263.getClass(), "length", -2147483648);
        setField(term353081, term353081.getClass(), "reader", term353263);
        setBooleanField(term353081, term353081.getClass(), "trackErrors", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "read", argTypes, term353081, args);
    }

};


