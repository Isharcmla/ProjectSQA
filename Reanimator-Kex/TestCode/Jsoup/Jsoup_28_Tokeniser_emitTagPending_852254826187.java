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
     Object term163023;

    public Tokeniser_emitTagPending_852254826187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term163744 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term163743 = ((Class) term163744).getDeclaredField((String) "EndTag");
        ((Field) term163743).setAccessible(true);
        Object enum338 = ((Field) term163743).get((Object) null);
        term163023 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term163087 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term163253 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term163087, term163087.getClass(), "pendingAttributeName", null);
        setField(term163087, term163087.getClass(), "type", enum338);
        setField(term163087, term163087.getClass(), "attributes", term163253);
        setField(term163023, term163023.getClass(), "tagPending", term163087);
        setBooleanField(term163023, term163023.getClass(), "isEmitPending", false);
        setField(term163023, term163023.getClass(), "emitPending", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term163023, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


