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

public class Tokeniser_read_374258942395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term374363;

    public Tokeniser_read_374258942395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term375098 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term375097 = ((Class) term375098).getDeclaredField((String) "AfterAttributeValue_quoted");
        ((Field) term375097).setAccessible(true);
        Object enum586 = ((Field) term375097).get((Object) null);
        term374363 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term374545 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term374597 = newInstance(Class.forName("java.io.CharArrayReader"));
        setBooleanField(term374363, term374363.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term374363, term374363.getClass(), "isEmitPending", false);
        setField(term374363, term374363.getClass(), "state", enum586);
        setIntField(term374545, term374545.getClass(), "bufPos", -2147483648);
        setIntField(term374545, term374545.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term374545, term374545.getClass(), "readerPos", 0);
        setField(term374545, term374545.getClass(), "reader", term374597);
        setField(term374363, term374363.getClass(), "reader", term374545);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term374363, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


