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

public class Tokeniser_emitTagPending_852254826217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195869;

    public Tokeniser_emitTagPending_852254826217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term196665 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term196664 = ((Class) term196665).getDeclaredField((String) "EndTag");
        ((Field) term196664).setAccessible(true);
        Object enum360 = ((Field) term196664).get((Object) null);
        term195869 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term195933 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term196099 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term196167 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term195933, term195933.getClass(), "pendingAttributeName", null);
        setField(term195933, term195933.getClass(), "type", enum360);
        setField(term195933, term195933.getClass(), "attributes", term196099);
        setField(term195869, term195869.getClass(), "tagPending", term195933);
        setBooleanField(term195869, term195869.getClass(), "isEmitPending", false);
        setField(term195869, term195869.getClass(), "emitPending", null);
        setIntField(term196167, term196167.getClass(), "maxSize", 2147483647);
        setField(term195869, term195869.getClass(), "errors", term196167);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term195869, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


