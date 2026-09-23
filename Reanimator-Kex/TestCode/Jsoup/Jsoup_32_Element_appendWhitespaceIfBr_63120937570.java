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

public class Element_appendWhitespaceIfBr_63120937570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6858;
     Object term6927;

    public Element_appendWhitespaceIfBr_63120937570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6880 = new HashMap();
        Set<Object> term6957 =  ((Map) term6880).keySet();
        HashSet term6879 = new HashSet((Collection<? extends Object>) term6957);
        ArrayList term6898 = new ArrayList();
        ((ArrayList) term6898).add((Object)null);
        ((ArrayList) term6898).add((Object)null);
        ((ArrayList) term6898).add((Object)null);
        ((ArrayList) term6898).add((Object)null);
        ((ArrayList) term6898).add((Object)null);
        ((ArrayList) term6898).add((Object)null);
        ((ArrayList) term6898).add((Object)null);
        LinkedHashMap term6903 = new LinkedHashMap();
        term6858 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6859 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6902 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6859, term6859.getClass(), "tagName", "ABPtcyCzkR");
        setBooleanField(term6859, term6859.getClass(), "isBlock", false);
        setBooleanField(term6859, term6859.getClass(), "formatAsBlock", false);
        setBooleanField(term6859, term6859.getClass(), "canContainBlock", true);
        setBooleanField(term6859, term6859.getClass(), "canContainInline", true);
        setBooleanField(term6859, term6859.getClass(), "empty", false);
        setBooleanField(term6859, term6859.getClass(), "selfClosing", true);
        setBooleanField(term6859, term6859.getClass(), "preserveWhitespace", false);
        setField(term6858, term6858.getClass(), "tag", term6859);
        setField(term6858, term6858.getClass(), "classNames", term6879);
        setField(term6858, term6858.getClass(), "parentNode", null);
        setField(term6858, term6858.getClass(), "childNodes", term6898);
        setField(term6902, term6902.getClass(), "attributes", term6903);
        setField(term6858, term6858.getClass(), "attributes", term6902);
        setField(term6858, term6858.getClass(), "baseUri", "hPpFNeDBIb");
        setIntField(term6858, term6858.getClass(), "siblingIndex", -523949691);
        term6927 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6928 = (byte[]) newByteArray(16);
        setField(term6927, term6927.getClass(), "value", term6928);
        setByteField(term6927, term6927.getClass(), "coder", (byte) 75);
        setIntField(term6927, term6927.getClass(), "count", 1398204340);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[2];
        args[0] = term6858;
        args[1] = term6927;
        callMethod(klass, "appendWhitespaceIfBr", argTypes, null, args);
    }

};


