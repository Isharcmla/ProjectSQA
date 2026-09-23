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

public class Tokeniser_emitTagPending_852254826182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159813;

    public Tokeniser_emitTagPending_852254826182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159813 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term159881 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term159977 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term159881, term159881.getClass(), "pendingAttributeName", "");
        setField(term159881, term159881.getClass(), "attributes", term159977);
        setField(term159813, term159813.getClass(), "tagPending", term159881);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term159813, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


