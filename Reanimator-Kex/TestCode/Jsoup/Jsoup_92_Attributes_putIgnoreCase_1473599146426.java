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

public class Attributes_putIgnoreCase_1473599146426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8338112;
     Object term8895720;

    public Attributes_putIgnoreCase_1473599146426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8338112 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8338028 = (Object[]) newArray("java.lang.String", 106);
        setIntField(term8338112, term8338112.getClass(), "size", 1);
        setField(term8338112, term8338112.getClass(), "keys", term8338028);
        setField(term8338112, term8338112.getClass(), "vals", term8338028);
        term8895720 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8895721 = (Object[]) newArray("java.lang.String", 106);
        Object[] term8895724 = (Object[]) newArray("java.lang.String", 106);
        setIntField(term8895720, term8895720.getClass(), "size", 2);
        setElement(term8895721, 1, "");
        setField(term8895720, term8895720.getClass(), "keys", term8895721);
        setElement(term8895724, 1, "");
        setField(term8895720, term8895720.getClass(), "vals", term8895724);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = "";
        callMethod(klass, "putIgnoreCase", argTypes, term8338112, args);
        assertTrue(recursiveEquals(term8338112, term8895720));
    }

};


