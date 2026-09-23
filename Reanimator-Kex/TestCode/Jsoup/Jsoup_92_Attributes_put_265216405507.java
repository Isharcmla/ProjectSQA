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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Attributes_put_265216405507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11613109;
     Object term11613241;

    public Attributes_put_265216405507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11613109 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term11612965 = (Object[]) newArray("java.lang.String", 2);
        setIntField(term11613109, term11613109.getClass(), "size", 2);
        setElement(term11612965, 0, "");
        setElement(term11612965, 1, "");
        setField(term11613109, term11613109.getClass(), "keys", term11612965);
        term11613241 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term11613241, term11613241.getClass(), "key", "\u0010\u0001\u0001     ");
        setField(term11613241, term11613241.getClass(), "val", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attribute");
        Object[] args = new Object[1];
        args[0] = term11613241;
        try {
            callMethod(klass, "put", argTypes, term11613109, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


