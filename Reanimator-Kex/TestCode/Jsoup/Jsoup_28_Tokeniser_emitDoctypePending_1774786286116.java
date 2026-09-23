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
import java.lang.IllegalArgumentException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Tokeniser_emitDoctypePending_1774786286116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110125;

    public Tokeniser_emitDoctypePending_1774786286116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110125 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term110191 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term110125, term110125.getClass(), "doctypePending", term110191);
        setBooleanField(term110125, term110125.getClass(), "isEmitPending", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitDoctypePending", argTypes, term110125, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


