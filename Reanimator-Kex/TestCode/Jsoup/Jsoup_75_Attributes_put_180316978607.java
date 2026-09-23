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

public class Attributes_put_180316978607 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15695696;

    public Attributes_put_180316978607() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15695696 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term15695342 = (Object[]) newArray("java.lang.String", 8);
        setIntField(term15695696, term15695696.getClass(), "size", 4);
        setElement(term15695342, 3, "        ");
        setElement(term15695342, 4, "        ");
        setElement(term15695342, 5, "        ");
        setElement(term15695342, 6, "        ");
        setElement(term15695342, 7, "        ");
        setField(term15695696, term15695696.getClass(), "keys", term15695342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = null;
        try {
            callMethod(klass, "put", argTypes, term15695696, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


