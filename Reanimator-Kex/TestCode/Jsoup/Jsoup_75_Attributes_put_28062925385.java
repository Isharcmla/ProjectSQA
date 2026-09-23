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
     Object term6310176;
     Object term6792087;
     Object term6791920;

    public Attributes_put_28062925385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6310176 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6301734 = (Object[]) newArray("java.lang.String", 8);
        setIntField(term6310176, term6310176.getClass(), "size", 4);
        setElement(term6301734, 3, "        ");
        setElement(term6301734, 4, "        ");
        setElement(term6301734, 5, "        ");
        setElement(term6301734, 6, "        ");
        setElement(term6301734, 7, "        ");
        setField(term6310176, term6310176.getClass(), "keys", term6301734);
        term6792087 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6792088 = (Object[]) newArray("java.lang.String", 8);
        setIntField(term6792087, term6792087.getClass(), "size", 4);
        setElement(term6792088, 3, "        ");
        setElement(term6792088, 4, "        ");
        setElement(term6792088, 5, "        ");
        setElement(term6792088, 6, "        ");
        setElement(term6792088, 7, "        ");
        setField(term6792087, term6792087.getClass(), "keys", term6792088);
        setField(term6792087, term6792087.getClass(), "vals", null);
        term6791920 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6791922 = (Object[]) newArray("java.lang.String", 8);
        setIntField(term6791920, term6791920.getClass(), "size", 4);
        setElement(term6791922, 3, "        ");
        setElement(term6791922, 4, "        ");
        setElement(term6791922, 5, "        ");
        setElement(term6791922, 6, "        ");
        setElement(term6791922, 7, "        ");
        setField(term6791920, term6791920.getClass(), "keys", term6791922);
        setField(term6791920, term6791920.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = false;
        Object retValue = callMethod(klass, "put", argTypes, term6310176, args);
        assertTrue(recursiveEquals(term6310176, term6792087));
        assertTrue(recursiveEquals(retValue, term6791920));
    }

};


