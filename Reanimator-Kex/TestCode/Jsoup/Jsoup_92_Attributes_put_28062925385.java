package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;

public class Attributes_put_28062925385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6795587;
     Object term8253241;
     Object term8253221;

    public Attributes_put_28062925385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6795587 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6795485 = (Object[]) newArray("java.lang.String", 0);
        Object[] term6795488 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term6795587, term6795587.getClass(), "size", 0);
        setField(term6795587, term6795587.getClass(), "keys", term6795485);
        setField(term6795587, term6795587.getClass(), "vals", term6795488);
        term8253241 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8253242 = (Object[]) newArray("java.lang.String", 4);
        Object[] term8253245 = (Object[]) newArray("java.lang.String", 4);
        setIntField(term8253241, term8253241.getClass(), "size", 1);
        setElement(term8253242, 0, "");
        setField(term8253241, term8253241.getClass(), "keys", term8253242);
        setField(term8253241, term8253241.getClass(), "vals", term8253245);
        term8253221 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8253223 = (Object[]) newArray("java.lang.String", 4);
        Object[] term8253226 = (Object[]) newArray("java.lang.String", 4);
        setIntField(term8253221, term8253221.getClass(), "size", 1);
        setElement(term8253223, 0, "");
        setField(term8253221, term8253221.getClass(), "keys", term8253223);
        setField(term8253221, term8253221.getClass(), "vals", term8253226);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = true;
        Object retValue = callMethod(klass, "put", argTypes, term6795587, args);
        assertTrue(recursiveEquals(term6795587, term8253241));
        assertTrue(recursiveEquals(retValue, term8253221));
    }

};


