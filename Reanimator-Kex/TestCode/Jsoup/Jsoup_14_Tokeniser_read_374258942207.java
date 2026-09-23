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
import java.lang.StringBuilder;

public class Tokeniser_read_374258942207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307342;

    public Tokeniser_read_374258942207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term308164 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term308163 = ((Class) term308164).getDeclaredField((String) "MarkupDeclarationOpen");
        ((Field) term308163).setAccessible(true);
        Object enum874 = ((Field) term308163).get((Object) null);
        StringBuilder term307584 = new StringBuilder();
        term307342 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term307524 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term307342, term307342.getClass(), "selfClosingFlagAcknowledged", false);
        setBooleanField(term307342, term307342.getClass(), "trackErrors", false);
        setBooleanField(term307342, term307342.getClass(), "isEmitPending", false);
        setField(term307342, term307342.getClass(), "state", enum874);
        setIntField(term307524, term307524.getClass(), "pos", -2147483648);
        setIntField(term307524, term307524.getClass(), "length", -2147483648);
        setField(term307342, term307342.getClass(), "reader", term307524);
        setField(term307342, term307342.getClass(), "charBuffer", term307584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term307342, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


