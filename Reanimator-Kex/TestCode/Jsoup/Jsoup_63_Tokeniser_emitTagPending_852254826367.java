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

public class Tokeniser_emitTagPending_852254826367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337396;

    public Tokeniser_emitTagPending_852254826367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term337282 = (char[]) newCharArray(9);
        StringBuilder term337616 = new StringBuilder();
        ((StringBuilder) term337616).append(term337282);
        term337396 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term337460 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term337556 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term337460, term337460.getClass(), "pendingAttributeName", "");
        setField(term337460, term337460.getClass(), "attributes", term337556);
        setBooleanField(term337460, term337460.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term337460, term337460.getClass(), "hasPendingAttributeValue", false);
        setField(term337460, term337460.getClass(), "pendingAttributeValue", term337616);
        setField(term337460, term337460.getClass(), "pendingAttributeValueS", null);
        setField(term337396, term337396.getClass(), "tagPending", term337460);
        setBooleanField(term337396, term337396.getClass(), "isEmitPending", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term337396, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


