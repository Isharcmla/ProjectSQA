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

public class Tokeniser_emitCommentPending_190650425164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81632;

    public Tokeniser_emitCommentPending_190650425164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term83135 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term83134 = ((Class) term83135).getDeclaredField((String) "StartTag");
        ((Field) term83134).setAccessible(true);
        Object enum278 = ((Field) term83134).get((Object) null);
        term81632 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term81698 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term81870 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term81698, term81698.getClass(), "type", enum278);
        setField(term81632, term81632.getClass(), "commentPending", term81698);
        setBooleanField(term81632, term81632.getClass(), "isEmitPending", false);
        setField(term81632, term81632.getClass(), "emitPending", term81870);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitCommentPending", argTypes, term81632, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


