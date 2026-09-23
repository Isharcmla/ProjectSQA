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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Tokeniser_read_374258942232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344502;

    public Tokeniser_read_374258942232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term344750 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term344749 = ((Class) term344750).getDeclaredField((String) "ScriptDataEscapedEndTagName");
        ((Field) term344749).setAccessible(true);
        Object enum907 = ((Field) term344749).get((Object) null);
        term344502 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term344682 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term344748 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setBooleanField(term344502, term344502.getClass(), "selfClosingFlagAcknowledged", false);
        setBooleanField(term344502, term344502.getClass(), "trackErrors", false);
        setBooleanField(term344502, term344502.getClass(), "isEmitPending", false);
        setField(term344502, term344502.getClass(), "state", enum907);
        setIntField(term344682, term344682.getClass(), "pos", -2147483648);
        setIntField(term344682, term344682.getClass(), "length", -2147483648);
        setField(term344502, term344502.getClass(), "reader", term344682);
        setField(term344502, term344502.getClass(), "doctypePending", term344748);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "read", argTypes, term344502, args);
    }

};


