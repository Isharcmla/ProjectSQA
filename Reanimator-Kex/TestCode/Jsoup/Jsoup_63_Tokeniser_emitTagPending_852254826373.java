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

public class Tokeniser_emitTagPending_852254826373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344742;

    public Tokeniser_emitTagPending_852254826373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term344742 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term344806 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term344902 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term344806, term344806.getClass(), "pendingAttributeName", "");
        setField(term344806, term344806.getClass(), "attributes", term344902);
        setBooleanField(term344806, term344806.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term344806, term344806.getClass(), "hasPendingAttributeValue", false);
        setField(term344806, term344806.getClass(), "pendingAttributeValue", null);
        setField(term344806, term344806.getClass(), "pendingAttributeValueS", "");
        setField(term344742, term344742.getClass(), "tagPending", term344806);
        setBooleanField(term344742, term344742.getClass(), "isEmitPending", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term344742, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


