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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Tokeniser_emitTagPending_852254826240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357193;

    public Tokeniser_emitTagPending_852254826240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term357193 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term357257 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term357353 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term357257, term357257.getClass(), "pendingAttributeName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term357257, term357257.getClass(), "pendingAttributeValue", null);
        setField(term357257, term357257.getClass(), "attributes", term357353);
        setField(term357193, term357193.getClass(), "tagPending", term357257);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term357193, args);
    }

};


