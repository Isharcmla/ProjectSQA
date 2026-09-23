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

public class Tokeniser_emitTagPending_852254826187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187259;

    public Tokeniser_emitTagPending_852254826187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term187980 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term187979 = ((Class) term187980).getDeclaredField((String) "EndTag");
        ((Field) term187979).setAccessible(true);
        Object enum458 = ((Field) term187979).get((Object) null);
        term187259 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term187323 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term187489 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term187323, term187323.getClass(), "pendingAttributeName", null);
        setField(term187323, term187323.getClass(), "type", enum458);
        setField(term187323, term187323.getClass(), "attributes", term187489);
        setField(term187259, term187259.getClass(), "tagPending", term187323);
        setBooleanField(term187259, term187259.getClass(), "isEmitPending", false);
        setField(term187259, term187259.getClass(), "emitPending", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term187259, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


