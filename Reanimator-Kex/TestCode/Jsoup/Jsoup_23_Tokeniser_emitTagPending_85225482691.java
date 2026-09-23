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

public class Tokeniser_emitTagPending_85225482691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98394;

    public Tokeniser_emitTagPending_85225482691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term99371 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term99370 = ((Class) term99371).getDeclaredField((String) "EndTag");
        ((Field) term99370).setAccessible(true);
        Object enum292 = ((Field) term99370).get((Object) null);
        term98394 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term98462 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term98638 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term98462, term98462.getClass(), "pendingAttributeName", null);
        setField(term98462, term98462.getClass(), "type", enum292);
        setField(term98394, term98394.getClass(), "tagPending", term98462);
        setBooleanField(term98394, term98394.getClass(), "isEmitPending", false);
        setField(term98394, term98394.getClass(), "emitPending", term98638);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term98394, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


