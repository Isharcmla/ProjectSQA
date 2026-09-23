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

public class Attributes_add_470966630551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14376754;
     Object term14376771;

    public Attributes_add_470966630551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14376754 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14376661 = (Object[]) newArray("java.lang.String", 0);
        Object[] term14376664 = (Object[]) newArray("java.lang.String", 44);
        setIntField(term14376754, term14376754.getClass(), "size", 2);
        setField(term14376754, term14376754.getClass(), "keys", term14376661);
        setField(term14376754, term14376754.getClass(), "vals", term14376664);
        term14376771 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14376772 = (Object[]) newArray("java.lang.String", 4);
        Object[] term14376773 = (Object[]) newArray("java.lang.String", 4);
        setIntField(term14376771, term14376771.getClass(), "size", 3);
        setField(term14376771, term14376771.getClass(), "keys", term14376772);
        setField(term14376771, term14376771.getClass(), "vals", term14376773);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "add", argTypes, term14376754, args);
        assertTrue(recursiveEquals(term14376754, term14376771));
    }

};


