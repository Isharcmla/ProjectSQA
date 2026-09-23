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

public class Tokeniser_emitTagPending_852254826251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225188;

    public Tokeniser_emitTagPending_852254826251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term225984 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term225983 = ((Class) term225984).getDeclaredField((String) "EndTag");
        ((Field) term225983).setAccessible(true);
        Object enum491 = ((Field) term225983).get((Object) null);
        term225188 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term225252 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term225418 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term225486 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term225252, term225252.getClass(), "pendingAttributeName", null);
        setField(term225252, term225252.getClass(), "type", enum491);
        setField(term225252, term225252.getClass(), "attributes", term225418);
        setField(term225188, term225188.getClass(), "tagPending", term225252);
        setBooleanField(term225188, term225188.getClass(), "isEmitPending", false);
        setField(term225188, term225188.getClass(), "emitPending", null);
        setIntField(term225486, term225486.getClass(), "maxSize", 2147483647);
        setField(term225188, term225188.getClass(), "errors", term225486);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term225188, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


