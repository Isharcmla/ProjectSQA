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

public class Tokeniser_read_37425894283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94944;

    public Tokeniser_read_37425894283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term95777 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term95776 = ((Class) term95777).getDeclaredField((String) "ScriptDataEscapedEndTagOpen");
        ((Field) term95776).setAccessible(true);
        Object enum287 = ((Field) term95776).get((Object) null);
        term94944 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term95012 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term95194 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term94944, term94944.getClass(), "selfClosingFlagAcknowledged", false);
        setIntField(term95012, term95012.getClass(), "maxSize", 2147483647);
        setField(term94944, term94944.getClass(), "errors", term95012);
        setBooleanField(term94944, term94944.getClass(), "isEmitPending", false);
        setField(term94944, term94944.getClass(), "state", enum287);
        setIntField(term95194, term95194.getClass(), "pos", -2147483648);
        setIntField(term95194, term95194.getClass(), "length", -2147483648);
        setField(term94944, term94944.getClass(), "reader", term95194);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term94944, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


