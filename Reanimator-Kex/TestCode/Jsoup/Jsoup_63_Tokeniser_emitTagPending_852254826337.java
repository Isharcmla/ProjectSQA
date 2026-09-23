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

public class Tokeniser_emitTagPending_852254826337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term298751;

    public Tokeniser_emitTagPending_852254826337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term298751 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term298815 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term298911 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term298815, term298815.getClass(), "pendingAttributeName", "");
        setField(term298911, term298911.getClass(), "attributes", null);
        setField(term298815, term298815.getClass(), "attributes", term298911);
        setBooleanField(term298815, term298815.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term298815, term298815.getClass(), "hasEmptyAttributeValue", false);
        setField(term298815, term298815.getClass(), "pendingAttributeValue", null);
        setField(term298815, term298815.getClass(), "pendingAttributeValueS", null);
        setField(term298751, term298751.getClass(), "tagPending", term298815);
        setBooleanField(term298751, term298751.getClass(), "isEmitPending", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitTagPending", argTypes, term298751, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


