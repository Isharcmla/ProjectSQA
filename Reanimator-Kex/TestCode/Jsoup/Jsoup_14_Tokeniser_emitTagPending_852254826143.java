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

public class Tokeniser_emitTagPending_852254826143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231148;

    public Tokeniser_emitTagPending_852254826143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term232011 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term232010 = ((Class) term232011).getDeclaredField((String) "EndTag");
        ((Field) term232010).setAccessible(true);
        Object enum802 = ((Field) term232010).get((Object) null);
        term231148 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term231212 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term231390 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term231212, term231212.getClass(), "pendingAttributeName", null);
        setField(term231212, term231212.getClass(), "type", enum802);
        setField(term231148, term231148.getClass(), "tagPending", term231212);
        setBooleanField(term231148, term231148.getClass(), "isEmitPending", false);
        setField(term231148, term231148.getClass(), "emitPending", term231390);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term231148, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


