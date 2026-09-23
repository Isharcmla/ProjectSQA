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

public class Tokeniser_emitTagPending_852254826245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231652;

    public Tokeniser_emitTagPending_852254826245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term231876 = new StringBuilder();
        term231652 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term231720 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term231816 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term231720, term231720.getClass(), "pendingAttributeName", "");
        setField(term231720, term231720.getClass(), "attributes", term231816);
        setField(term231720, term231720.getClass(), "pendingAttributeValue", term231876);
        setField(term231652, term231652.getClass(), "tagPending", term231720);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term231652, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


