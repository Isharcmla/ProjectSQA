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

public class Element_hashCode_188061476391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8968;

    public Element_hashCode_188061476391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8990 = new HashMap();
        Set<Object> term9047 =  ((Map) term8990).keySet();
        HashSet term8989 = new HashSet((Collection<? extends Object>) term9047);
        ArrayList term9008 = new ArrayList();
        ((ArrayList) term9008).add((Object)null);
        LinkedHashMap term9013 = new LinkedHashMap();
        term8968 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8969 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9012 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8969, term8969.getClass(), "tagName", "yOQuJXRvOo");
        setBooleanField(term8969, term8969.getClass(), "isBlock", true);
        setBooleanField(term8969, term8969.getClass(), "formatAsBlock", false);
        setBooleanField(term8969, term8969.getClass(), "canContainBlock", false);
        setBooleanField(term8969, term8969.getClass(), "canContainInline", true);
        setBooleanField(term8969, term8969.getClass(), "empty", false);
        setBooleanField(term8969, term8969.getClass(), "selfClosing", true);
        setBooleanField(term8969, term8969.getClass(), "preserveWhitespace", false);
        setField(term8968, term8968.getClass(), "tag", term8969);
        setField(term8968, term8968.getClass(), "classNames", term8989);
        setField(term8968, term8968.getClass(), "parentNode", null);
        setField(term8968, term8968.getClass(), "childNodes", term9008);
        setField(term9012, term9012.getClass(), "attributes", term9013);
        setField(term8968, term8968.getClass(), "attributes", term9012);
        setField(term8968, term8968.getClass(), "baseUri", "ZFpcYBgLNC");
        setIntField(term8968, term8968.getClass(), "siblingIndex", 1687361082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term8968, args);
    }

};


