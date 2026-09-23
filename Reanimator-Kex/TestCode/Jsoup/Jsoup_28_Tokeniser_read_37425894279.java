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

public class Tokeniser_read_37425894279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92060;

    public Tokeniser_read_37425894279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term93629 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term93628 = ((Class) term93629).getDeclaredField((String) "ScriptDataEscapedEndTagOpen");
        ((Field) term93628).setAccessible(true);
        Object enum283 = ((Field) term93628).get((Object) null);
        term92060 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term92128 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term92310 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term92060, term92060.getClass(), "selfClosingFlagAcknowledged", false);
        setIntField(term92128, term92128.getClass(), "maxSize", 2147483647);
        setField(term92060, term92060.getClass(), "errors", term92128);
        setBooleanField(term92060, term92060.getClass(), "isEmitPending", false);
        setField(term92060, term92060.getClass(), "state", enum283);
        setIntField(term92310, term92310.getClass(), "pos", -2147483648);
        setIntField(term92310, term92310.getClass(), "length", -2147483648);
        setField(term92060, term92060.getClass(), "reader", term92310);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term92060, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


