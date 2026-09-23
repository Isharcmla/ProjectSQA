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

public class Tokeniser_read_374258942365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335559;

    public Tokeniser_read_374258942365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term336526 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term336525 = ((Class) term336526).getDeclaredField((String) "RawtextLessthanSign");
        ((Field) term336525).setAccessible(true);
        Object enum562 = ((Field) term336525).get((Object) null);
        term335559 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term335741 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term335809 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term335875 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setBooleanField(term335559, term335559.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term335559, term335559.getClass(), "isEmitPending", false);
        setField(term335559, term335559.getClass(), "state", enum562);
        setIntField(term335741, term335741.getClass(), "bufPos", -2147483648);
        setIntField(term335741, term335741.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term335741, term335741.getClass(), "bufLength", -2147483648);
        setField(term335559, term335559.getClass(), "reader", term335741);
        setIntField(term335809, term335809.getClass(), "maxSize", 2147483647);
        setField(term335559, term335559.getClass(), "errors", term335809);
        setField(term335559, term335559.getClass(), "doctypePending", term335875);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term335559, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


