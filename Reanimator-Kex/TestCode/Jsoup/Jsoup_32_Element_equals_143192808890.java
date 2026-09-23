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
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_equals_143192808890 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8887;
     Object term8946;

    public Element_equals_143192808890() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8909 = new HashMap();
        Set<Object> term8957 =  ((Map) term8909).keySet();
        HashSet term8908 = new HashSet((Collection<? extends Object>) term8957);
        ArrayList term8917 = new ArrayList();
        ((ArrayList) term8917).add((Object)null);
        ((ArrayList) term8917).add((Object)null);
        LinkedHashMap term8922 = new LinkedHashMap();
        term8887 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8888 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8921 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8888, term8888.getClass(), "tagName", "HegRNsidFg");
        setBooleanField(term8888, term8888.getClass(), "isBlock", true);
        setBooleanField(term8888, term8888.getClass(), "formatAsBlock", true);
        setBooleanField(term8888, term8888.getClass(), "canContainBlock", true);
        setBooleanField(term8888, term8888.getClass(), "canContainInline", false);
        setBooleanField(term8888, term8888.getClass(), "empty", true);
        setBooleanField(term8888, term8888.getClass(), "selfClosing", false);
        setBooleanField(term8888, term8888.getClass(), "preserveWhitespace", true);
        setField(term8887, term8887.getClass(), "tag", term8888);
        setField(term8887, term8887.getClass(), "classNames", term8908);
        setField(term8887, term8887.getClass(), "parentNode", null);
        setField(term8887, term8887.getClass(), "childNodes", term8917);
        setField(term8921, term8921.getClass(), "attributes", term8922);
        setField(term8887, term8887.getClass(), "attributes", term8921);
        setField(term8887, term8887.getClass(), "baseUri", "wRVaaJxKYI");
        setIntField(term8887, term8887.getClass(), "siblingIndex", 114754804);
        term8946 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term8946;
        callMethod(klass, "equals", argTypes, term8887, args);
    }

};


