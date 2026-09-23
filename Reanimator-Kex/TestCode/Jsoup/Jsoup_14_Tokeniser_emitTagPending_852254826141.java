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

public class Tokeniser_emitTagPending_852254826141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229247;

    public Tokeniser_emitTagPending_852254826141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term230358 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term230357 = ((Class) term230358).getDeclaredField((String) "StartTag");
        ((Field) term230357).setAccessible(true);
        Object enum800 = ((Field) term230357).get((Object) null);
        term229247 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term229311 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term229483 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term229311, term229311.getClass(), "pendingAttributeName", null);
        setField(term229311, term229311.getClass(), "type", enum800);
        setField(term229247, term229247.getClass(), "tagPending", term229311);
        setBooleanField(term229247, term229247.getClass(), "isEmitPending", false);
        setField(term229247, term229247.getClass(), "emitPending", term229483);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term229247, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


