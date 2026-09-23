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

public class Tokeniser_read_374258942251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238230;

    public Tokeniser_read_374258942251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term239137 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term239136 = ((Class) term239137).getDeclaredField((String) "DoctypeSystemIdentifier_doubleQuoted");
        ((Field) term239136).setAccessible(true);
        Object enum389 = ((Field) term239136).get((Object) null);
        term238230 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term238412 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term238480 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setBooleanField(term238230, term238230.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term238230, term238230.getClass(), "isEmitPending", false);
        setField(term238230, term238230.getClass(), "state", enum389);
        setIntField(term238412, term238412.getClass(), "pos", -2147483648);
        setIntField(term238412, term238412.getClass(), "length", -2147483648);
        setField(term238230, term238230.getClass(), "reader", term238412);
        setIntField(term238480, term238480.getClass(), "maxSize", 2147483647);
        setField(term238230, term238230.getClass(), "errors", term238480);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term238230, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


