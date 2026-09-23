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

public class Tokeniser_read_374258942325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287981;

    public Tokeniser_read_374258942325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term288647 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term288646 = ((Class) term288647).getDeclaredField((String) "AfterAttributeName");
        ((Field) term288646).setAccessible(true);
        Object enum535 = ((Field) term288646).get((Object) null);
        term287981 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term288163 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term287981, term287981.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term287981, term287981.getClass(), "isEmitPending", false);
        setField(term287981, term287981.getClass(), "state", enum535);
        setIntField(term288163, term288163.getClass(), "bufPos", -2147483648);
        setIntField(term288163, term288163.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term288163, term288163.getClass(), "bufLength", -2147483647);
        setField(term288163, term288163.getClass(), "charBuf", null);
        setField(term287981, term287981.getClass(), "reader", term288163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term287981, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


