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
import java.util.ArrayList;
import java.lang.Object;

public class Tokeniser_read_374258942183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270169;

    public Tokeniser_read_374258942183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term270221 = new ArrayList();
        term270169 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term270291 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term270169, term270169.getClass(), "selfClosingFlagAcknowledged", false);
        setBooleanField(term270169, term270169.getClass(), "trackErrors", true);
        setField(term270169, term270169.getClass(), "errors", term270221);
        setIntField(term270291, term270291.getClass(), "pos", 0);
        setField(term270169, term270169.getClass(), "reader", term270291);
        setBooleanField(term270169, term270169.getClass(), "isEmitPending", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term270169, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


