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
import java.lang.String;
import java.lang.Object;

public class Tokeniser_read_374258942203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300725;

    public Tokeniser_read_374258942203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term301460 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term301459 = ((Class) term301460).getDeclaredField((String) "ScriptDataEndTagOpen");
        ((Field) term301459).setAccessible(true);
        Object enum870 = ((Field) term301459).get((Object) null);
        term300725 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term300907 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term300973 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setBooleanField(term300725, term300725.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term300725, term300725.getClass(), "isEmitPending", false);
        setField(term300725, term300725.getClass(), "state", enum870);
        setIntField(term300907, term300907.getClass(), "pos", -2147483648);
        setIntField(term300907, term300907.getClass(), "length", -2147483648);
        setField(term300725, term300725.getClass(), "reader", term300907);
        setBooleanField(term300725, term300725.getClass(), "trackErrors", false);
        setField(term300725, term300725.getClass(), "doctypePending", term300973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term300725, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


