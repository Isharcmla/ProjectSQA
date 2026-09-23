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

public class Tokeniser_emitTagPending_852254826137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118935;

    public Tokeniser_emitTagPending_852254826137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term120410 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term120409 = ((Class) term120410).getDeclaredField((String) "StartTag");
        ((Field) term120409).setAccessible(true);
        Object enum309 = ((Field) term120409).get((Object) null);
        term118935 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term118999 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term119173 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term118999, term118999.getClass(), "pendingAttributeName", null);
        setField(term118999, term118999.getClass(), "type", enum309);
        setField(term118935, term118935.getClass(), "tagPending", term118999);
        setBooleanField(term118935, term118935.getClass(), "isEmitPending", false);
        setField(term118935, term118935.getClass(), "emitPending", term119173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term118935, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


