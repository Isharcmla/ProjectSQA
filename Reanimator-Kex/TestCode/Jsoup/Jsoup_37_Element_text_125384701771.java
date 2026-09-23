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

public class Element_text_125384701771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6906;

    public Element_text_125384701771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6930 = new HashMap();
        Set<Object> term6993 =  ((Map) term6930).keySet();
        HashSet term6929 = new HashSet((Collection<? extends Object>) term6993);
        ArrayList term6942 = new ArrayList();
        ((ArrayList) term6942).add((Object)null);
        ((ArrayList) term6942).add((Object)null);
        ((ArrayList) term6942).add((Object)null);
        ((ArrayList) term6942).add((Object)null);
        ((ArrayList) term6942).add((Object)null);
        LinkedHashMap term6947 = new LinkedHashMap();
        term6906 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6907 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6946 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6907, term6907.getClass(), "tagName", "POPYycoDBy");
        setBooleanField(term6907, term6907.getClass(), "isBlock", false);
        setBooleanField(term6907, term6907.getClass(), "formatAsBlock", false);
        setBooleanField(term6907, term6907.getClass(), "canContainBlock", false);
        setBooleanField(term6907, term6907.getClass(), "canContainInline", false);
        setBooleanField(term6907, term6907.getClass(), "empty", true);
        setBooleanField(term6907, term6907.getClass(), "selfClosing", true);
        setBooleanField(term6907, term6907.getClass(), "preserveWhitespace", true);
        setBooleanField(term6907, term6907.getClass(), "formList", true);
        setBooleanField(term6907, term6907.getClass(), "formSubmit", true);
        setField(term6906, term6906.getClass(), "tag", term6907);
        setField(term6906, term6906.getClass(), "classNames", term6929);
        setField(term6906, term6906.getClass(), "parentNode", null);
        setField(term6906, term6906.getClass(), "childNodes", term6942);
        setField(term6946, term6946.getClass(), "attributes", term6947);
        setField(term6906, term6906.getClass(), "attributes", term6946);
        setField(term6906, term6906.getClass(), "baseUri", "VGiXZZTWRO");
        setIntField(term6906, term6906.getClass(), "siblingIndex", 1283079251);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MlPtwXnJOJ";
        callMethod(klass, "text", argTypes, term6906, args);
    }

};


