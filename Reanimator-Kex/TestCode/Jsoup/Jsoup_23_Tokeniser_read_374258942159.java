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

public class Tokeniser_read_374258942159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126999;

    public Tokeniser_read_374258942159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term127590 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term127589 = ((Class) term127590).getDeclaredField((String) "ScriptDataEscapeStart");
        ((Field) term127589).setAccessible(true);
        Object enum315 = ((Field) term127589).get((Object) null);
        term126999 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term126999, term126999.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term126999, term126999.getClass(), "isEmitPending", false);
        setField(term126999, term126999.getClass(), "state", enum315);
        setField(term126999, term126999.getClass(), "reader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term126999, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


