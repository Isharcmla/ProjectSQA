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

public class Element_toggleClass_95262400080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7992;

    public Element_toggleClass_95262400080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8014 = new HashMap();
        Set<Object> term8075 =  ((Map) term8014).keySet();
        HashSet term8013 = new HashSet((Collection<? extends Object>) term8075);
        ArrayList term8024 = new ArrayList();
        LinkedHashMap term8029 = new LinkedHashMap();
        term7992 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7993 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8028 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7993, term7993.getClass(), "tagName", "mrSAYJlddZ");
        setBooleanField(term7993, term7993.getClass(), "isBlock", false);
        setBooleanField(term7993, term7993.getClass(), "formatAsBlock", false);
        setBooleanField(term7993, term7993.getClass(), "canContainBlock", true);
        setBooleanField(term7993, term7993.getClass(), "canContainInline", false);
        setBooleanField(term7993, term7993.getClass(), "empty", false);
        setBooleanField(term7993, term7993.getClass(), "selfClosing", true);
        setBooleanField(term7993, term7993.getClass(), "preserveWhitespace", false);
        setField(term7992, term7992.getClass(), "tag", term7993);
        setField(term7992, term7992.getClass(), "classNames", term8013);
        setField(term7992, term7992.getClass(), "parentNode", null);
        setField(term7992, term7992.getClass(), "childNodes", term8024);
        setField(term8028, term8028.getClass(), "attributes", term8029);
        setField(term7992, term7992.getClass(), "attributes", term8028);
        setField(term7992, term7992.getClass(), "baseUri", "vydWXHfFTw");
        setIntField(term7992, term7992.getClass(), "siblingIndex", 1041916673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DRhkpDneCC";
        callMethod(klass, "toggleClass", argTypes, term7992, args);
    }

};


