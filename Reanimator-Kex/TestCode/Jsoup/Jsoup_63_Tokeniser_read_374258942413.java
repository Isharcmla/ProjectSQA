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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Tokeniser_read_374258942413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401620;

    public Tokeniser_read_374258942413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term403341 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term403340 = ((Class) term403341).getDeclaredField((String) "ScriptDataEscapedEndTagName");
        ((Field) term403340).setAccessible(true);
        Object enum602 = ((Field) term403340).get((Object) null);
        term401620 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term401802 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term400837 = (char[]) newCharArray(489);
        setBooleanField(term401620, term401620.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term401620, term401620.getClass(), "isEmitPending", false);
        setField(term401620, term401620.getClass(), "state", enum602);
        setIntField(term401802, term401802.getClass(), "bufPos", -2147483648);
        setIntField(term401802, term401802.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term401802, term401802.getClass(), "bufLength", -2147483647);
        setField(term401802, term401802.getClass(), "charBuf", term400837);
        setField(term401620, term401620.getClass(), "reader", term401802);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term401620, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


