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

public class Tokeniser_read_374258942254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379680;

    public Tokeniser_read_374258942254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term379864 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term379863 = ((Class) term379864).getDeclaredField((String) "SelfClosingStartTag");
        ((Field) term379863).setAccessible(true);
        Object enum921 = ((Field) term379863).get((Object) null);
        term379680 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term379862 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term379680, term379680.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term379680, term379680.getClass(), "isEmitPending", false);
        setField(term379680, term379680.getClass(), "state", enum921);
        setIntField(term379862, term379862.getClass(), "pos", -2147483648);
        setIntField(term379862, term379862.getClass(), "length", -2147483647);
        setField(term379862, term379862.getClass(), "input", null);
        setField(term379680, term379680.getClass(), "reader", term379862);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "read", argTypes, term379680, args);
    }

};


