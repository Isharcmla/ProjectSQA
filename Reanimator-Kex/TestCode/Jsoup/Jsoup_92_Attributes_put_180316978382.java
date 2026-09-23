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

public class Attributes_put_180316978382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6795152;
     Object term8182979;
     Object term8152183;

    public Attributes_put_180316978382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6795152 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6795014 = (Object[]) newArray("java.lang.String", 2);
        Object[] term6795019 = (Object[]) newArray("java.lang.String", 48);
        setIntField(term6795152, term6795152.getClass(), "size", 2);
        setField(term6795152, term6795152.getClass(), "keys", term6795014);
        setField(term6795152, term6795152.getClass(), "vals", term6795019);
        term8182979 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8182980 = (Object[]) newArray("java.lang.String", 4);
        Object[] term8182983 = (Object[]) newArray("java.lang.String", 4);
        setIntField(term8182979, term8182979.getClass(), "size", 3);
        setElement(term8182980, 2, "");
        setField(term8182979, term8182979.getClass(), "keys", term8182980);
        setField(term8182979, term8182979.getClass(), "vals", term8182983);
        term8152183 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8152236 = (Object[]) newArray("java.lang.String", 4);
        Object[] term8152391 = (Object[]) newArray("java.lang.String", 4);
        setIntField(term8152183, term8152183.getClass(), "size", 3);
        setElement(term8152236, 2, "");
        setField(term8152183, term8152183.getClass(), "keys", term8152236);
        setField(term8152183, term8152183.getClass(), "vals", term8152391);
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
        Object retValue = callMethod(klass, "put", argTypes, term6795152, args);
        assertTrue(recursiveEquals(term6795152, term8182979));
        assertTrue(recursiveEquals(retValue, term8152183));
    }

};


