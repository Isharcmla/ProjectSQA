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

public class Attributes_put_28062925316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4750255;
     Object term5266788;
     Object term5266779;

    public Attributes_put_28062925316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4750255 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term4750153 = (Object[]) newArray("java.lang.String", 128);
        Object[] term4750155 = (Object[]) newArray("java.lang.String", 106);
        setIntField(term4750255, term4750255.getClass(), "size", 1);
        setElement(term4750153, 0, "");
        setField(term4750255, term4750255.getClass(), "keys", term4750153);
        setField(term4750255, term4750255.getClass(), "vals", term4750155);
        term5266788 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5266789 = (Object[]) newArray("java.lang.String", 128);
        Object[] term5266792 = (Object[]) newArray("java.lang.String", 106);
        setIntField(term5266788, term5266788.getClass(), "size", 1);
        setElement(term5266789, 0, "");
        setField(term5266788, term5266788.getClass(), "keys", term5266789);
        setField(term5266788, term5266788.getClass(), "vals", term5266792);
        term5266779 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5266781 = (Object[]) newArray("java.lang.String", 128);
        Object[] term5266784 = (Object[]) newArray("java.lang.String", 106);
        setIntField(term5266779, term5266779.getClass(), "size", 1);
        setElement(term5266781, 0, "");
        setField(term5266779, term5266779.getClass(), "keys", term5266781);
        setField(term5266779, term5266779.getClass(), "vals", term5266784);
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
        Object retValue = callMethod(klass, "put", argTypes, term4750255, args);
        assertTrue(recursiveEquals(term4750255, term5266788));
        assertTrue(recursiveEquals(retValue, term5266779));
    }

};


