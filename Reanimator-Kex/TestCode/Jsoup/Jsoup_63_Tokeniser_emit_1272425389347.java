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
import java.lang.Object;
import java.lang.String;

public class Tokeniser_emit_1272425389347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311823;
     Object term312091;

    public Tokeniser_emit_1272425389347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term311823 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term311889 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term311957 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term312027 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term311823, term311823.getClass(), "isEmitPending", false);
        setField(term311823, term311823.getClass(), "emitPending", term311889);
        setIntField(term311957, term311957.getClass(), "maxSize", 2147483647);
        setField(term311823, term311823.getClass(), "errors", term311957);
        setField(term311823, term311823.getClass(), "reader", term312027);
        Class<? extends Object> term312752 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term312751 = ((Class) term312752).getDeclaredField((String) "EndTag");
        ((Field) term312751).setAccessible(true);
        Object enum545 = ((Field) term312751).get((Object) null);
        term312091 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term312257 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term312091, term312091.getClass(), "type", enum545);
        setField(term312091, term312091.getClass(), "attributes", term312257);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term312091;
        try {
            callMethod(klass, "emit", argTypes, term311823, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


