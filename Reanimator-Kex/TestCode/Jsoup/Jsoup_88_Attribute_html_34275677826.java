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

public class Attribute_html_34275677826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333;
     Object term77927;

    public Attribute_html_34275677826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term333 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term358 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term360 = (Object[]) newArray("java.lang.String", 0);
        Object[] term361 = (Object[]) newArray("java.lang.String", 0);
        setField(term333, term333.getClass(), "key", "oVcInYnLWB");
        setField(term333, term333.getClass(), "val", "aJlieCFVtF");
        setIntField(term358, term358.getClass(), "size", -616727354);
        setField(term358, term358.getClass(), "keys", term360);
        setField(term358, term358.getClass(), "vals", term361);
        setField(term333, term333.getClass(), "parent", term358);
        term77927 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term77932 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term77933 = (Object[]) newArray("java.lang.String", 0);
        Object[] term77934 = (Object[]) newArray("java.lang.String", 0);
        setField(term77927, term77927.getClass(), "key", "oVcInYnLWB");
        setField(term77927, term77927.getClass(), "val", "aJlieCFVtF");
        setIntField(term77932, term77932.getClass(), "size", -616727354);
        setField(term77932, term77932.getClass(), "keys", term77933);
        setField(term77932, term77932.getClass(), "vals", term77934);
        setField(term77927, term77927.getClass(), "parent", term77932);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "html", argTypes, term333, args);
        assertTrue(recursiveEquals(term333, term77927));
        assertTrue(recursiveEquals(retValue, "oVcInYnLWB=\"aJlieCFVtF\""));
    }

};


