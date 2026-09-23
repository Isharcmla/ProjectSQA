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

public class Tokeniser_emitTagPending_852254826229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213366;

    public Tokeniser_emitTagPending_852254826229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term214241 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term214240 = ((Class) term214241).getDeclaredField((String) "EndTag");
        ((Field) term214240).setAccessible(true);
        Object enum371 = ((Field) term214240).get((Object) null);
        term213366 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term213430 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term213596 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term213664 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term213734 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term213430, term213430.getClass(), "pendingAttributeName", null);
        setField(term213430, term213430.getClass(), "type", enum371);
        setField(term213430, term213430.getClass(), "attributes", term213596);
        setField(term213366, term213366.getClass(), "tagPending", term213430);
        setBooleanField(term213366, term213366.getClass(), "isEmitPending", false);
        setField(term213366, term213366.getClass(), "emitPending", null);
        setIntField(term213664, term213664.getClass(), "maxSize", 2147483647);
        setField(term213366, term213366.getClass(), "errors", term213664);
        setField(term213366, term213366.getClass(), "reader", term213734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term213366, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


