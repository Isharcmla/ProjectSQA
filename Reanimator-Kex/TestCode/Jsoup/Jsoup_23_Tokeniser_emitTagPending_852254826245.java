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

public class Tokeniser_emitTagPending_852254826245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211395;

    public Tokeniser_emitTagPending_852254826245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211395 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term211459 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term211555 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term211459, term211459.getClass(), "pendingAttributeName", "    ");
        setField(term211459, term211459.getClass(), "pendingAttributeValue", null);
        setField(term211555, term211555.getClass(), "attributes", null);
        setField(term211459, term211459.getClass(), "attributes", term211555);
        setField(term211395, term211395.getClass(), "tagPending", term211459);
        setBooleanField(term211395, term211395.getClass(), "isEmitPending", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term211395, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


