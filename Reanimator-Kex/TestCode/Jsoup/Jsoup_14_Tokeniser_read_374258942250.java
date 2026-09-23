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

public class Tokeniser_read_374258942250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term372691;

    public Tokeniser_read_374258942250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term372805 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term372804 = ((Class) term372805).getDeclaredField((String) "ScriptDataEscapedEndTagName");
        ((Field) term372804).setAccessible(true);
        Object enum918 = ((Field) term372804).get((Object) null);
        term372691 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term372691, term372691.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term372691, term372691.getClass(), "isEmitPending", false);
        setField(term372691, term372691.getClass(), "state", enum918);
        setField(term372691, term372691.getClass(), "reader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "read", argTypes, term372691, args);
    }

};


