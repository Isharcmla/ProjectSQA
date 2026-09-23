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

public class Tokeniser_emitTagPending_852254826223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201407;

    public Tokeniser_emitTagPending_852254826223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term202466 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term202465 = ((Class) term202466).getDeclaredField((String) "EndTag");
        ((Field) term202465).setAccessible(true);
        Object enum367 = ((Field) term202465).get((Object) null);
        term201407 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term201475 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term201571 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term201475, term201475.getClass(), "pendingAttributeName", "  ");
        setField(term201571, term201571.getClass(), "attributes", null);
        setField(term201475, term201475.getClass(), "attributes", term201571);
        setField(term201475, term201475.getClass(), "pendingAttributeValue", null);
        setField(term201475, term201475.getClass(), "type", enum367);
        setField(term201407, term201407.getClass(), "tagPending", term201475);
        setBooleanField(term201407, term201407.getClass(), "isEmitPending", false);
        setField(term201407, term201407.getClass(), "emitPending", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term201407, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


