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

public class Tokeniser_read_374258942353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term321328;

    public Tokeniser_read_374258942353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term322024 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term322023 = ((Class) term322024).getDeclaredField((String) "AttributeValue_doubleQuoted");
        ((Field) term322023).setAccessible(true);
        Object enum552 = ((Field) term322023).get((Object) null);
        term321328 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term321510 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term321328, term321328.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term321328, term321328.getClass(), "isEmitPending", false);
        setField(term321328, term321328.getClass(), "state", enum552);
        setIntField(term321510, term321510.getClass(), "bufPos", -2147483648);
        setIntField(term321510, term321510.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term321510, term321510.getClass(), "bufLength", -2147483647);
        setField(term321328, term321328.getClass(), "reader", term321510);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term321328, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


