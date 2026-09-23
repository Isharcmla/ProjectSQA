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

public class Tokeniser_emitTagPending_852254826111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207531;

    public Tokeniser_emitTagPending_852254826111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term209369 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term209368 = ((Class) term209369).getDeclaredField((String) "EndTag");
        ((Field) term209368).setAccessible(true);
        Object enum777 = ((Field) term209368).get((Object) null);
        term207531 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term207599 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term207775 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term207599, term207599.getClass(), "pendingAttributeName", null);
        setField(term207599, term207599.getClass(), "type", enum777);
        setField(term207531, term207531.getClass(), "tagPending", term207599);
        setBooleanField(term207531, term207531.getClass(), "isEmitPending", false);
        setField(term207531, term207531.getClass(), "emitPending", term207775);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term207531, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


