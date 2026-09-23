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

public class Attributes_put_28062925513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14315740;
     Object term14316190;
     Object term14316035;

    public Attributes_put_28062925513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14315740 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14313713 = (Object[]) newArray("java.lang.String", 24);
        setIntField(term14315740, term14315740.getClass(), "size", 14);
        setElement(term14313713, 0, "                                                                                                                  ");
        setElement(term14313713, 10, "                                ");
        setField(term14315740, term14315740.getClass(), "keys", term14313713);
        term14316190 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14316191 = (Object[]) newArray("java.lang.String", 24);
        setIntField(term14316190, term14316190.getClass(), "size", 14);
        setElement(term14316191, 0, "                                                                                                                  ");
        setElement(term14316191, 10, "                                ");
        setField(term14316190, term14316190.getClass(), "keys", term14316191);
        setField(term14316190, term14316190.getClass(), "vals", null);
        term14316035 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14316037 = (Object[]) newArray("java.lang.String", 24);
        setIntField(term14316035, term14316035.getClass(), "size", 14);
        setElement(term14316037, 0, "                                                                                                                  ");
        setElement(term14316037, 10, "                                ");
        setField(term14316035, term14316035.getClass(), "keys", term14316037);
        setField(term14316035, term14316035.getClass(), "vals", null);
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
        Object retValue = callMethod(klass, "put", argTypes, term14315740, args);
        assertTrue(recursiveEquals(term14315740, term14316190));
        assertTrue(recursiveEquals(retValue, term14316035));
    }

};


