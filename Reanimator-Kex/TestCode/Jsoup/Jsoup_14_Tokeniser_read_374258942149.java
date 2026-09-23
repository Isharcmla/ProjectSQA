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

public class Tokeniser_read_374258942149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234959;

    public Tokeniser_read_374258942149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term235011 = new ArrayList();
        term234959 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term235081 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term234959, term234959.getClass(), "selfClosingFlagAcknowledged", false);
        setBooleanField(term234959, term234959.getClass(), "trackErrors", true);
        setField(term234959, term234959.getClass(), "errors", term235011);
        setIntField(term235081, term235081.getClass(), "pos", 0);
        setField(term234959, term234959.getClass(), "reader", term235081);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term234959, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


