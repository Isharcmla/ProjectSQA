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

public class Tokeniser_read_37425894285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96738;

    public Tokeniser_read_37425894285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term97389 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term97388 = ((Class) term97389).getDeclaredField((String) "BeforeDoctypeName");
        ((Field) term97388).setAccessible(true);
        Object enum285 = ((Field) term97388).get((Object) null);
        term96738 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term96806 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setBooleanField(term96738, term96738.getClass(), "selfClosingFlagAcknowledged", false);
        setIntField(term96806, term96806.getClass(), "maxSize", 2147483647);
        setField(term96738, term96738.getClass(), "errors", term96806);
        setBooleanField(term96738, term96738.getClass(), "isEmitPending", false);
        setField(term96738, term96738.getClass(), "state", enum285);
        setField(term96738, term96738.getClass(), "reader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term96738, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


