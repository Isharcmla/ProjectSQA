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

public class Tokeniser_emitTagPending_852254826201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175861;

    public Tokeniser_emitTagPending_852254826201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term176023 = new StringBuilder();
        term175861 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term175925 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term175925, term175925.getClass(), "pendingAttributeName", "");
        setField(term175925, term175925.getClass(), "attributes", null);
        setField(term175925, term175925.getClass(), "pendingAttributeValue", term176023);
        setField(term175861, term175861.getClass(), "tagPending", term175925);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term175861, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


