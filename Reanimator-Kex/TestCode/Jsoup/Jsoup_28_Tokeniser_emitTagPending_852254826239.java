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
import java.lang.StringBuilder;

public class Tokeniser_emitTagPending_852254826239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225744;

    public Tokeniser_emitTagPending_852254826239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term225964 = new StringBuilder();
        term225744 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term225808 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term225904 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term225808, term225808.getClass(), "pendingAttributeName", "");
        setField(term225808, term225808.getClass(), "attributes", term225904);
        setField(term225808, term225808.getClass(), "pendingAttributeValue", term225964);
        setField(term225744, term225744.getClass(), "tagPending", term225808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term225744, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


