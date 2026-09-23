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

public class Tokeniser_read_374258942187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275885;

    public Tokeniser_read_374258942187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term276621 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term276620 = ((Class) term276621).getDeclaredField((String) "RcdataLessthanSign");
        ((Field) term276620).setAccessible(true);
        Object enum844 = ((Field) term276620).get((Object) null);
        term275885 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term276067 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term275885, term275885.getClass(), "selfClosingFlagAcknowledged", false);
        setBooleanField(term275885, term275885.getClass(), "trackErrors", false);
        setBooleanField(term275885, term275885.getClass(), "isEmitPending", false);
        setField(term275885, term275885.getClass(), "state", enum844);
        setField(term275885, term275885.getClass(), "reader", term276067);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term275885, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


