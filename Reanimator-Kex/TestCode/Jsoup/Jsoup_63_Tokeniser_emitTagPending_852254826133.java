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
import java.lang.ClassCastException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Tokeniser_emitTagPending_852254826133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159983;

    public Tokeniser_emitTagPending_852254826133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term160966 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term160965 = ((Class) term160966).getDeclaredField((String) "StartTag");
        ((Field) term160965).setAccessible(true);
        Object enum444 = ((Field) term160965).get((Object) null);
        term159983 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term160047 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term160223 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term160047, term160047.getClass(), "pendingAttributeName", null);
        setField(term160047, term160047.getClass(), "type", enum444);
        setField(term159983, term159983.getClass(), "tagPending", term160047);
        setBooleanField(term159983, term159983.getClass(), "isEmitPending", false);
        setField(term159983, term159983.getClass(), "emitPending", term160223);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term159983, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


