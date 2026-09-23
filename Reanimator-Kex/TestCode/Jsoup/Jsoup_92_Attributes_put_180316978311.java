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

public class Attributes_put_180316978311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2328439;
     Object term5261691;
     Object term5261565;

    public Attributes_put_180316978311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2328439 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2327934 = (Object[]) newArray("java.lang.String", 11);
        Object[] term2328055 = (Object[]) newArray("java.lang.String", 242);
        setIntField(term2328439, term2328439.getClass(), "size", 3);
        setElement(term2327934, 1, "");
        setField(term2328439, term2328439.getClass(), "keys", term2327934);
        setField(term2328439, term2328439.getClass(), "vals", term2328055);
        term5261691 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5261692 = (Object[]) newArray("java.lang.String", 11);
        Object[] term5261697 = (Object[]) newArray("java.lang.String", 242);
        setIntField(term5261691, term5261691.getClass(), "size", 4);
        setElement(term5261692, 1, "");
        setElement(term5261692, 3, "                                                                                                                ");
        setField(term5261691, term5261691.getClass(), "keys", term5261692);
        setField(term5261691, term5261691.getClass(), "vals", term5261697);
        term5261565 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5261567 = (Object[]) newArray("java.lang.String", 11);
        Object[] term5261684 = (Object[]) newArray("java.lang.String", 242);
        setIntField(term5261565, term5261565.getClass(), "size", 4);
        setElement(term5261567, 1, "");
        setElement(term5261567, 3, "                                                                                                                ");
        setField(term5261565, term5261565.getClass(), "keys", term5261567);
        setField(term5261565, term5261565.getClass(), "vals", term5261684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "                                                                                                                ";
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term2328439, args);
        assertTrue(recursiveEquals(term2328439, term5261691));
        assertTrue(recursiveEquals(retValue, term5261565));
    }

};


