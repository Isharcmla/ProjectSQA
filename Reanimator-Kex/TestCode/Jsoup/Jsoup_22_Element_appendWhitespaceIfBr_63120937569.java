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

public class Element_appendWhitespaceIfBr_63120937569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6910;
     Object term6979;

    public Element_appendWhitespaceIfBr_63120937569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6932 = new HashMap();
        Set<Object> term7009 =  ((Map) term6932).keySet();
        HashSet term6931 = new HashSet((Collection<? extends Object>) term7009);
        ArrayList term6950 = new ArrayList();
        ((ArrayList) term6950).add((Object)null);
        ((ArrayList) term6950).add((Object)null);
        ((ArrayList) term6950).add((Object)null);
        ((ArrayList) term6950).add((Object)null);
        ((ArrayList) term6950).add((Object)null);
        ((ArrayList) term6950).add((Object)null);
        ((ArrayList) term6950).add((Object)null);
        LinkedHashMap term6955 = new LinkedHashMap();
        term6910 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6911 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6954 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6911, term6911.getClass(), "tagName", "ABPtcyCzkR");
        setBooleanField(term6911, term6911.getClass(), "isBlock", false);
        setBooleanField(term6911, term6911.getClass(), "formatAsBlock", false);
        setBooleanField(term6911, term6911.getClass(), "canContainBlock", true);
        setBooleanField(term6911, term6911.getClass(), "canContainInline", true);
        setBooleanField(term6911, term6911.getClass(), "empty", false);
        setBooleanField(term6911, term6911.getClass(), "selfClosing", true);
        setBooleanField(term6911, term6911.getClass(), "preserveWhitespace", false);
        setField(term6910, term6910.getClass(), "tag", term6911);
        setField(term6910, term6910.getClass(), "classNames", term6931);
        setField(term6910, term6910.getClass(), "parentNode", null);
        setField(term6910, term6910.getClass(), "childNodes", term6950);
        setField(term6954, term6954.getClass(), "attributes", term6955);
        setField(term6910, term6910.getClass(), "attributes", term6954);
        setField(term6910, term6910.getClass(), "baseUri", "hPpFNeDBIb");
        setIntField(term6910, term6910.getClass(), "siblingIndex", 1283079251);
        term6979 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6980 = (byte[]) newByteArray(16);
        setField(term6979, term6979.getClass(), "value", term6980);
        setByteField(term6979, term6979.getClass(), "coder", (byte) 75);
        setIntField(term6979, term6979.getClass(), "count", -523949691);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[2];
        args[0] = term6910;
        args[1] = term6979;
        callMethod(klass, "appendWhitespaceIfBr", argTypes, null, args);
    }

};


