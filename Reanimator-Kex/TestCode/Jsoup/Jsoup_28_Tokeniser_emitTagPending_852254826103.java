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

public class Tokeniser_emitTagPending_852254826103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105932;

    public Tokeniser_emitTagPending_852254826103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term107167 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term107166 = ((Class) term107167).getDeclaredField((String) "EndTag");
        ((Field) term107166).setAccessible(true);
        Object enum294 = ((Field) term107166).get((Object) null);
        term105932 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term106000 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term106178 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term106000, term106000.getClass(), "pendingAttributeName", null);
        setField(term106000, term106000.getClass(), "type", enum294);
        setField(term105932, term105932.getClass(), "tagPending", term106000);
        setBooleanField(term105932, term105932.getClass(), "isEmitPending", false);
        setField(term105932, term105932.getClass(), "emitPending", term106178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term105932, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


