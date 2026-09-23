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

public class Tokeniser_read_374258942296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260721;

    public Tokeniser_read_374258942296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term263800 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term263799 = ((Class) term263800).getDeclaredField((String) "AttributeValue_doubleQuoted");
        ((Field) term263799).setAccessible(true);
        Object enum516 = ((Field) term263799).get((Object) null);
        term260721 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term260903 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term260721, term260721.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term260721, term260721.getClass(), "isEmitPending", false);
        setField(term260721, term260721.getClass(), "state", enum516);
        setIntField(term260903, term260903.getClass(), "bufPos", -2147483648);
        setIntField(term260903, term260903.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term260903, term260903.getClass(), "bufLength", -2147483647);
        setField(term260721, term260721.getClass(), "reader", term260903);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term260721, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


