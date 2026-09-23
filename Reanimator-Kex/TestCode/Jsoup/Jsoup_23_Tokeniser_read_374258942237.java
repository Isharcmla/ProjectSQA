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
import java.lang.StringIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Tokeniser_read_374258942237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202011;

    public Tokeniser_read_374258942237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term202795 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term202794 = ((Class) term202795).getDeclaredField((String) "ScriptDataDoubleEscapedDashDash");
        ((Field) term202794).setAccessible(true);
        Object enum370 = ((Field) term202794).get((Object) null);
        term202011 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term202191 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term202011, term202011.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term202011, term202011.getClass(), "isEmitPending", false);
        setField(term202011, term202011.getClass(), "state", enum370);
        setIntField(term202191, term202191.getClass(), "pos", -2147483648);
        setIntField(term202191, term202191.getClass(), "length", -2147483647);
        setField(term202191, term202191.getClass(), "input", "");
        setField(term202011, term202011.getClass(), "reader", term202191);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term202011, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


