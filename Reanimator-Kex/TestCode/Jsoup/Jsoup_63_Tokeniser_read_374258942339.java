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

public class Tokeniser_read_374258942339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term301134;

    public Tokeniser_read_374258942339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term301893 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term301892 = ((Class) term301893).getDeclaredField((String) "DoctypeSystemIdentifier_singleQuoted");
        ((Field) term301892).setAccessible(true);
        Object enum541 = ((Field) term301892).get((Object) null);
        term301134 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term301316 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term301362 = newInstance(Class.forName("java.io.StringReader"));
        setBooleanField(term301134, term301134.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term301134, term301134.getClass(), "isEmitPending", false);
        setField(term301134, term301134.getClass(), "state", enum541);
        setIntField(term301316, term301316.getClass(), "bufPos", -2147483648);
        setIntField(term301316, term301316.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term301316, term301316.getClass(), "readerPos", 0);
        setField(term301316, term301316.getClass(), "reader", term301362);
        setField(term301134, term301134.getClass(), "reader", term301316);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term301134, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


