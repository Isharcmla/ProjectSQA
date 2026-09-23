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

public class Tokeniser_read_374258942233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term347035;

    public Tokeniser_read_374258942233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term347149 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term347148 = ((Class) term347149).getDeclaredField((String) "CharacterReferenceInData");
        ((Field) term347148).setAccessible(true);
        Object enum908 = ((Field) term347148).get((Object) null);
        term347035 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term347035, term347035.getClass(), "selfClosingFlagAcknowledged", false);
        setBooleanField(term347035, term347035.getClass(), "trackErrors", false);
        setBooleanField(term347035, term347035.getClass(), "isEmitPending", false);
        setField(term347035, term347035.getClass(), "state", enum908);
        setField(term347035, term347035.getClass(), "reader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "read", argTypes, term347035, args);
    }

};


