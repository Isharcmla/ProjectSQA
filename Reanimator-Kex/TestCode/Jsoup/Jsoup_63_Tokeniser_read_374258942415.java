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
import java.lang.IllegalArgumentException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Tokeniser_read_374258942415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406038;

    public Tokeniser_read_374258942415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term406789 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term406788 = ((Class) term406789).getDeclaredField((String) "AfterAttributeValue_quoted");
        ((Field) term406788).setAccessible(true);
        Object enum604 = ((Field) term406788).get((Object) null);
        term406038 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term406220 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term406264 = newInstance(Class.forName("java.io.PipedReader"));
        setBooleanField(term406038, term406038.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term406038, term406038.getClass(), "isEmitPending", false);
        setField(term406038, term406038.getClass(), "state", enum604);
        setIntField(term406220, term406220.getClass(), "bufPos", -2147483648);
        setIntField(term406220, term406220.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term406220, term406220.getClass(), "readerPos", 0);
        setField(term406220, term406220.getClass(), "reader", term406264);
        setField(term406038, term406038.getClass(), "reader", term406220);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term406038, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


