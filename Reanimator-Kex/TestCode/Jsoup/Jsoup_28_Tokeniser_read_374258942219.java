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

public class Tokeniser_read_374258942219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198781;

    public Tokeniser_read_374258942219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term199623 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term199622 = ((Class) term199623).getDeclaredField((String) "ScriptDataDoubleEscaped");
        ((Field) term199622).setAccessible(true);
        Object enum362 = ((Field) term199622).get((Object) null);
        term198781 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term198963 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term199031 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setBooleanField(term198781, term198781.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term198781, term198781.getClass(), "isEmitPending", false);
        setField(term198781, term198781.getClass(), "state", enum362);
        setIntField(term198963, term198963.getClass(), "pos", -2147483648);
        setIntField(term198963, term198963.getClass(), "length", -2147483648);
        setField(term198781, term198781.getClass(), "reader", term198963);
        setIntField(term199031, term199031.getClass(), "maxSize", 2147483647);
        setField(term198781, term198781.getClass(), "errors", term199031);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term198781, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


