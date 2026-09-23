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

public class Tokeniser_emitTagPending_852254826213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193274;

    public Tokeniser_emitTagPending_852254826213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193274 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term193342 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term193342, term193342.getClass(), "pendingAttributeName", "  ");
        setField(term193342, term193342.getClass(), "attributes", null);
        setField(term193342, term193342.getClass(), "pendingAttributeValue", null);
        setField(term193274, term193274.getClass(), "tagPending", term193342);
        setBooleanField(term193274, term193274.getClass(), "isEmitPending", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term193274, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


