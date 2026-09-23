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

public class Tokeniser_read_374258942245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term367088;

    public Tokeniser_read_374258942245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term367270 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term367269 = ((Class) term367270).getDeclaredField((String) "TagName");
        ((Field) term367269).setAccessible(true);
        Object enum916 = ((Field) term367269).get((Object) null);
        term367088 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term367268 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term367088, term367088.getClass(), "selfClosingFlagAcknowledged", false);
        setBooleanField(term367088, term367088.getClass(), "trackErrors", false);
        setBooleanField(term367088, term367088.getClass(), "isEmitPending", false);
        setField(term367088, term367088.getClass(), "state", enum916);
        setIntField(term367268, term367268.getClass(), "pos", -2147483648);
        setIntField(term367268, term367268.getClass(), "length", -2147483648);
        setField(term367088, term367088.getClass(), "reader", term367268);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "read", argTypes, term367088, args);
    }

};


