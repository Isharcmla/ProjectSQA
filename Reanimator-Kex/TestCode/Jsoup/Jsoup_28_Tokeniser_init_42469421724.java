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
import static org.jsoup.parser.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class Tokeniser_init_42469421724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29347;

    public Tokeniser_init_42469421724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29354 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term29353 = ((Class) term29354).getDeclaredField((String) "Data");
        ((Field) term29353).setAccessible(true);
        Object enum96 = ((Field) term29353).get((Object) null);
        term29347 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term29351 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term29352 = (byte[]) newByteArray(16);
        setField(term29347, term29347.getClass(), "reader", null);
        setField(term29347, term29347.getClass(), "errors", null);
        setField(term29347, term29347.getClass(), "state", enum96);
        setField(term29347, term29347.getClass(), "emitPending", null);
        setBooleanField(term29347, term29347.getClass(), "isEmitPending", false);
        setField(term29351, term29351.getClass(), "value", term29352);
        setByteField(term29351, term29351.getClass(), "coder", (byte) 0);
        setIntField(term29351, term29351.getClass(), "count", 0);
        setField(term29347, term29347.getClass(), "charBuffer", term29351);
        setField(term29347, term29347.getClass(), "dataBuffer", null);
        setField(term29347, term29347.getClass(), "tagPending", null);
        setField(term29347, term29347.getClass(), "doctypePending", null);
        setField(term29347, term29347.getClass(), "commentPending", null);
        setField(term29347, term29347.getClass(), "lastStartTag", null);
        setBooleanField(term29347, term29347.getClass(), "selfClosingFlagAcknowledged", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[1] = Class.forName("org.jsoup.parser.ParseErrorList");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term29347));
    }

};


