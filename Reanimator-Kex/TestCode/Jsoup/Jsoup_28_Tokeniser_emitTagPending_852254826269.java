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

public class Tokeniser_emitTagPending_852254826269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263955;

    public Tokeniser_emitTagPending_852254826269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term263955 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term264023 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term264119 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term264023, term264023.getClass(), "pendingAttributeName", "                                ");
        setField(term264119, term264119.getClass(), "attributes", null);
        setField(term264023, term264023.getClass(), "attributes", term264119);
        setField(term264023, term264023.getClass(), "pendingAttributeValue", null);
        setField(term263955, term263955.getClass(), "tagPending", term264023);
        setBooleanField(term263955, term263955.getClass(), "isEmitPending", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term263955, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


