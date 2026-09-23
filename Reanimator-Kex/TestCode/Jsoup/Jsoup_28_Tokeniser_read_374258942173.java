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

public class Tokeniser_read_374258942173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153295;

    public Tokeniser_read_374258942173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term155505 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term155504 = ((Class) term155505).getDeclaredField((String) "ScriptDataEscapeStartDash");
        ((Field) term155504).setAccessible(true);
        Object enum328 = ((Field) term155504).get((Object) null);
        term153295 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term153363 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term153545 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term152506 = (char[]) newCharArray(488);
        setBooleanField(term153295, term153295.getClass(), "selfClosingFlagAcknowledged", false);
        setIntField(term153363, term153363.getClass(), "maxSize", 2147483647);
        setField(term153295, term153295.getClass(), "errors", term153363);
        setBooleanField(term153295, term153295.getClass(), "isEmitPending", false);
        setField(term153295, term153295.getClass(), "state", enum328);
        setIntField(term153545, term153545.getClass(), "pos", 16384);
        setIntField(term153545, term153545.getClass(), "length", 16385);
        setField(term153545, term153545.getClass(), "input", term152506);
        setField(term153295, term153295.getClass(), "reader", term153545);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term153295, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


