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

public class Tokeniser_read_374258942193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167738;

    public Tokeniser_read_374258942193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term168467 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term168466 = ((Class) term168467).getDeclaredField((String) "CharacterReferenceInRcdata");
        ((Field) term168466).setAccessible(true);
        Object enum340 = ((Field) term168466).get((Object) null);
        term167738 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term167920 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term167738, term167738.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term167738, term167738.getClass(), "isEmitPending", false);
        setField(term167738, term167738.getClass(), "state", enum340);
        setField(term167738, term167738.getClass(), "reader", term167920);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term167738, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


